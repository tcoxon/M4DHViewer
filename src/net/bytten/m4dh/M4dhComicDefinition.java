package net.bytten.m4dh;

import java.util.regex.Pattern;

import net.bytten.comicviewer.IComicDefinition;
import net.bytten.comicviewer.IComicProvider;

import android.net.Uri;

public class M4dhComicDefinition implements IComicDefinition {

    static public final Pattern
        xkcdHomePattern = Pattern.compile(
            "http://(www\\.)?xkcd\\.com(/)?"),
        comicUrlPattern = Pattern.compile(
            "http://(www\\.)?xkcd\\.com/([0-9]+)(/)?"),
        archiveUrlPattern = Pattern.compile(
            "http://(www\\.)?xkcd\\.com/archive(/)?");

    private M4dhComicProvider provider;
    
    public M4dhComicDefinition() {
        provider = new M4dhComicProvider(this);
    }
    
    @Override
    public Uri getArchiveUrl() {
        return Uri.parse("http://xkcd.com/archive/");
    }

    @Override
    public String getAuthorLinkText() {
        return "M4DH Store";
    }

    @Override
    public Uri getAuthorLinkUrl() {
        return Uri.parse("http://milkfordeadhamsters.com/store");
    }

    @Override
    public String getAuthorName() {
        return "Patrick Mallon";
    }

    @Override
    public String getComicTitle() {
        return "Milk for Dead Hamsters";
    }

    @Override
    public String getComicTitleAbbrev() {
        return "m4dh";
    }

    @Override
    public String getPackageName() {
        return "net.bytten.m4dh";
    }

    @Override
    public boolean hasAltText() {
        return true;
    }

    @Override
    public boolean idsAreNumbers() {
        return true;
    }

    @Override
    public boolean isArchiveUrl(Uri url) {
        return archiveUrlPattern.matcher(url.toString()).matches();
    }
    
    @Override
    public boolean isComicUrl(Uri url) {
        return comicUrlPattern.matcher(url.toString()).matches();
    }

    @Override
    public boolean isHomeUrl(Uri url) {
        return xkcdHomePattern.matcher(url.toString()).matches();
    }

    @Override
    public IComicProvider getProvider() {
        return provider;
    }

    @Override
    public Uri getDonateUrl() {
        return Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=C9JRVA3NTULSL&lc=US&item_name=Milk%20for%20Dead%20Hamsters%20donation&item_number=milk%20for%20dead%20hamsters&currency_code=USD");
    }

}
