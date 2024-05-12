package com.ss.android.ugc.aweme.kids.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class MusicCollection extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("mc_list")
    public List<MusicCollectionItem> items;

    public final List<MusicCollectionItem> getItems() {
        List<MusicCollectionItem> list = this.items;
        if (list == null || list.isEmpty()) {
            return this.items;
        }
        List<MusicCollectionItem> src = this.items;
        o.LJIIIZ(src, "src");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (MusicCollectionItem musicCollectionItem : src) {
            if (hashSet.add(musicCollectionItem.mcName)) {
                arrayList.add(musicCollectionItem);
            }
        }
        return arrayList;
    }
}
