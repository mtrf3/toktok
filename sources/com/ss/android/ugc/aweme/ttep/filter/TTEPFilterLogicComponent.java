package com.ss.android.ugc.aweme.ttep.filter;

import X.C29S;
import X.C76800UCe;
import X.C82285WRd;
import X.C82622Wbi;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.WRL;
import X.WRM;
import X.WRP;
import X.WRR;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class TTEPFilterLogicComponent extends WRM<WRP> {
    @Override // X.WRM, X.WRP
    public void setFilterChosen(FilterBean filter, String str, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(filter, "filter");
    }

    @Override // X.WRM, X.WRP
    public void setFilterScroll(FilterBean leftFilter, FilterBean rightFilter, float f) {
        o.LJIIIZ(leftFilter, "leftFilter");
        o.LJIIIZ(rightFilter, "rightFilter");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTEPFilterLogicComponent(C82622Wbi diContainer, C29S activity, WRL buildIn, InterfaceC88472Yns<? super WRR, WRR> interfaceC88472Yns, InterfaceC65784Pro<Boolean> interfaceC65784Pro, InterfaceC88472Yns<? super C82285WRd, C76800UCe> interfaceC88472Yns2) {
        super(diContainer, activity, buildIn, interfaceC88472Yns, interfaceC65784Pro, interfaceC88472Yns2);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(buildIn, "buildIn");
    }

    public /* synthetic */ TTEPFilterLogicComponent(C82622Wbi c82622Wbi, C29S c29s, WRL wrl, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, c29s, wrl, (i & 8) != 0 ? null : interfaceC88472Yns, (i & 16) != 0 ? null : interfaceC65784Pro, (i & 32) == 0 ? interfaceC88472Yns2 : null);
    }
}
