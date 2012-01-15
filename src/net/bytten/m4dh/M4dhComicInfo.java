package net.bytten.m4dh;

import net.bytten.comicviewer.IComicInfo;
import android.net.Uri;

public class M4dhComicInfo implements IComicInfo {

    public Uri img;
    public String id, nextId, prevId;
    public String title = "", alt = "";
    public boolean bookmarked;

    @Override
    public String getAlt() {
        return alt;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Uri getImage() {
        return img;
    }

    @Override
    public String getNextId() {
        if (nextId != null) return nextId;
        return id;
    }

    @Override
    public String getPrevId() {
        if (prevId != null) return prevId;
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getUrl() {
        return "http://milkfordeadhamsters.com/comics/"+getId();
    }

    @Override
    public boolean isBookmarked() {
        return bookmarked;
    }

    @Override
    public void setBookmarked(boolean b) {
        bookmarked = b;
    }

}
