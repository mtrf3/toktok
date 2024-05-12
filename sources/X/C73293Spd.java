package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Spd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C73293Spd extends C74232TBk implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public C73293Spd(C73292Spc c73292Spc) {
        super(1, c73292Spc);
    }

    @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
    public final String getName() {
        return "handleError";
    }

    @Override // X.AbstractC74233TBl
    public final InterfaceC36731EbH getOwner() {
        return C65352Pkq.LIZ(C73292Spc.class);
    }

    @Override // X.AbstractC74233TBl
    public final String getSignature() {
        return "handleError(Ljava/lang/Throwable;)V";
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Throwable th) {
        Throwable p1 = th;
        o.LJIIJ(p1, "p1");
        this.receiver.getClass();
        while (true) {
            if (p1 == null) {
                break;
            }
            if (p1.getCause() != null) {
                p1 = p1.getCause();
            } else if (p1 != null) {
                throw p1;
            }
        }
        return C76800UCe.LIZ;
    }
}
