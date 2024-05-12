package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3wm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100363wm extends AbstractC65781Prl implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public static final C100363wm LJLIL = new C100363wm();

    public C100363wm() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Throwable th) {
        Throwable it = th;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request error: ");
        LIZ.append(V0N.LJJIJL(it));
        C34B.LIZJ("NowStatusViewModelImpl", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }
}
