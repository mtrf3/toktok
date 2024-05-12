package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C61878OQg;
import X.F9E;
import android.graphics.RectF;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LayoutArrayList extends F9E {
    public final List<RectF> divideList;
    public final Map<String, LayoutArray> indexLayoutArrayMap;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LayoutArrayList copy$default(LayoutArrayList layoutArrayList, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = layoutArrayList.indexLayoutArrayMap;
        }
        if ((i & 2) != 0) {
            list = layoutArrayList.divideList;
        }
        return layoutArrayList.copy(map, list);
    }

    public final LayoutArrayList copy(Map<String, LayoutArray> indexLayoutArrayMap, List<? extends RectF> divideList) {
        o.LJIIIZ(indexLayoutArrayMap, "indexLayoutArrayMap");
        o.LJIIIZ(divideList, "divideList");
        return new LayoutArrayList(indexLayoutArrayMap, divideList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.indexLayoutArrayMap, this.divideList};
    }

    public final List<RectF> getDivideList() {
        return this.divideList;
    }

    public final Map<String, LayoutArray> getIndexLayoutArrayMap() {
        return this.indexLayoutArrayMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutArrayList(Map<String, LayoutArray> indexLayoutArrayMap, List<? extends RectF> divideList) {
        o.LJIIIZ(indexLayoutArrayMap, "indexLayoutArrayMap");
        o.LJIIIZ(divideList, "divideList");
        this.indexLayoutArrayMap = indexLayoutArrayMap;
        this.divideList = divideList;
    }

    public LayoutArrayList(Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
