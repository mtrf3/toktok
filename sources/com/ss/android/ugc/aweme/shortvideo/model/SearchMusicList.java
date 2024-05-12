package com.ss.android.ugc.aweme.shortvideo.model;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes3.dex */
public class SearchMusicList {

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("music_list")
    public List<SearchMusic> items;

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z ? 1 : 0;
    }
}
