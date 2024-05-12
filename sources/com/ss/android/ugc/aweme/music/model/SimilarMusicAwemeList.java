package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class SimilarMusicAwemeList implements Serializable {

    @InterfaceC65349Pkn("aweme_list")
    public List<? extends Aweme> awemeList;

    @InterfaceC65349Pkn("music_id")
    public String musicId;

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }
}
