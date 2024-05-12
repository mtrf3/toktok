package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class MatchedPGCSoundInfo implements Serializable {

    @InterfaceC65349Pkn("author")
    public String author;

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("mixed_author")
    public String mixedAuthor;

    @InterfaceC65349Pkn("mixed_title")
    public String mixedTitle;

    @InterfaceC65349Pkn("artist_infos")
    public List<MusicOwnerInfo> musicOwnerInfos;

    @InterfaceC65349Pkn("music_release_info")
    public MusicReleaseInfo musicReleaseInfo;

    @InterfaceC65349Pkn("title")
    public String title;

    public String getShowInfo() {
        if (TextUtils.isEmpty(this.title) && TextUtils.isEmpty(this.author)) {
            return "";
        }
        if (TextUtils.isEmpty(this.title)) {
            return this.author;
        }
        if (TextUtils.isEmpty(this.author)) {
            return this.title;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.title);
        LIZ.append(" - ");
        LIZ.append(this.author);
        return X1D.LIZIZ(LIZ);
    }

    public String getAuthor() {
        return this.author;
    }

    public String getId() {
        return this.id;
    }

    public String getMixedAuthor() {
        return this.mixedAuthor;
    }

    public String getMixedTitle() {
        return this.mixedTitle;
    }

    public List<MusicOwnerInfo> getMusicOwnerInfos() {
        return this.musicOwnerInfos;
    }

    public MusicReleaseInfo getMusicReleaseInfo() {
        return this.musicReleaseInfo;
    }

    public String getTitle() {
        return this.title;
    }
}
