package com.ss.android.ugc.aweme.music.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MusicCollectionFilterKt {
    public static final List<MusicCollectionItem> distinctByName(List<? extends MusicCollectionItem> src) {
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
