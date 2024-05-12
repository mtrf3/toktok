package com.ss.android.ugc.aweme.experiment;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SparkEcomPromotionCaravelOptPageListBean extends F9E {

    @InterfaceC65349Pkn("allowList")
    public final List<String> allowList;

    public SparkEcomPromotionCaravelOptPageListBean() {
        this(null, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.allowList};
    }

    public SparkEcomPromotionCaravelOptPageListBean(List<String> allowList) {
        o.LJIIIZ(allowList, "allowList");
        this.allowList = allowList;
    }

    public SparkEcomPromotionCaravelOptPageListBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
