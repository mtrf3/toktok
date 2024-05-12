package com.ss.android.ugc.aweme.ab;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class EcSearchShopResultPreloadConfigModel extends F9E {

    @InterfaceC65349Pkn("ec_search_preload_inside_enter_method")
    public final List<String> insideEnterMethodList;

    @InterfaceC65349Pkn("ec_search_preload_outside_enter_method")
    public final List<String> outsideEnterMethodList;

    public EcSearchShopResultPreloadConfigModel() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.insideEnterMethodList, this.outsideEnterMethodList};
    }

    public EcSearchShopResultPreloadConfigModel(List<String> insideEnterMethodList, List<String> outsideEnterMethodList) {
        o.LJIIIZ(insideEnterMethodList, "insideEnterMethodList");
        o.LJIIIZ(outsideEnterMethodList, "outsideEnterMethodList");
        this.insideEnterMethodList = insideEnterMethodList;
        this.outsideEnterMethodList = outsideEnterMethodList;
    }

    public EcSearchShopResultPreloadConfigModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
