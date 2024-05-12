package com.bytedance.netecho;

import X.C16880lQ;
import X.C65352Pkq;
import X.C74232TBk;
import X.C76800UCe;
import X.InterfaceC36731EbH;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final /* synthetic */ class NetechoConfig$loadLibrary$1 extends C74232TBk implements InterfaceC88472Yns<String, C76800UCe> {
    public static final NetechoConfig$loadLibrary$1 INSTANCE = new NetechoConfig$loadLibrary$1();

    public NetechoConfig$loadLibrary$1() {
        super(1);
    }

    @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
    public final String getName() {
        return "loadLibrary";
    }

    @Override // X.AbstractC74233TBl
    public final InterfaceC36731EbH getOwner() {
        return C65352Pkq.LIZ(System.class);
    }

    @Override // X.AbstractC74233TBl
    public final String getSignature() {
        return "loadLibrary(Ljava/lang/String;)V";
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p1) {
        o.LJIIJ(p1, "p1");
        C16880lQ.LLJJJIL(p1);
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(String str) {
        invoke2(str);
        return C76800UCe.LIZ;
    }
}
