package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TBJ extends AbstractC65781Prl implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public static final TBJ LJLIL = new TBJ();

    public TBJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Throwable th) {
        Throwable ex = th;
        o.LJIIIZ(ex, "ex");
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onError: ");
            LIZ.append(ex.getMessage());
            UC0.LJJIZ(X1D.LIZIZ(LIZ), "StateApi");
            C30868C9o.LJI(String.valueOf(ex.getMessage()));
        }
        C0K2.LIZ("StateApi", ex);
        return C76800UCe.LIZ;
    }
}
