package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes16.dex */
public final class FavoriteRecommendedMusicResponse extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("has_more")
    public final int hasMore;

    @InterfaceC65349Pkn("music_list")
    public List<? extends Music> items;

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public final boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }
}
