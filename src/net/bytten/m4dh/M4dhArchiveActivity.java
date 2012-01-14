package net.bytten.m4dh;

import net.bytten.comicviewer.ArchiveActivity;
import net.bytten.comicviewer.IComicDefinition;

public class M4dhArchiveActivity extends ArchiveActivity {

    @Override
    protected IComicDefinition makeComicDef() {
        return new M4dhComicDefinition();
    }

    @Override
    protected String getStringArchive() {
        return getResources().getString(R.string.app_archive_label);
    }

    @Override
    protected String getStringBookmarks() {
        return getResources().getString(R.string.app_bookmarks_label);
    }

    @Override
    protected String getStringSearchByTitle() {
        return getResources().getString(R.string.app_search_title_label);
    }

}
