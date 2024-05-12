package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes11.dex */
public class MusicCollection extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("mc_list")
    public List<MusicCollectionItem> items;

    public List<MusicCollectionItem> getItems() {
        List<MusicCollectionItem> list = this.items;
        if (list == null || list.isEmpty()) {
            return this.items;
        }
        return MusicCollectionFilterKt.distinctByName(this.items);
    }
}
