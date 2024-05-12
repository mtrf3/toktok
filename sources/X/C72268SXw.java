package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SXw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72268SXw extends C74232TBk implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public static final C72268SXw LJLIL = new C72268SXw();

    public C72268SXw() {
        super(1);
    }

    @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
    public final String getName() {
        return "printStackTrace";
    }

    @Override // X.AbstractC74233TBl
    public final InterfaceC36731EbH getOwner() {
        return C65352Pkq.LIZ(Throwable.class);
    }

    @Override // X.AbstractC74233TBl
    public final String getSignature() {
        return "printStackTrace()V";
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Throwable p1) {
        o.LJIIJ(p1, "p1");
        return C76800UCe.LIZ;
    }
}
