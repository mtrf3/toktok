package com.bytedance.bpea.core.checker;

import X.C66292Q0a;
import X.C66300Q0i;
import X.InterfaceC39206Fa6;
import X.InterfaceC88472Yns;
import X.OHW;
import kotlin.jvm.internal.AqS142S0200000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CorePowerProvider implements InterfaceC39206Fa6 {
    public static final CorePowerProvider INSTANCE = new CorePowerProvider();

    @Override // X.InterfaceC39206Fa6
    public C66300Q0i check(OHW context, InterfaceC88472Yns<? super C66300Q0i, ? extends Object> interfaceC88472Yns) {
        o.LJIIJ(context, "context");
        return (C66300Q0i) C66292Q0a.LIZIZ(context, "MainCheck", null, new AqS142S0200000_11(context, interfaceC88472Yns, 8));
    }
}
