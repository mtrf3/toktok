package X;

import Y.ARunnableS42S0100000_6;

/* renamed from: X.Sqv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73373Sqv extends AbstractC65781Prl implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public static final C73373Sqv LJLIL = new C73373Sqv();

    public C73373Sqv() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Throwable th) {
        Throwable th2 = th;
        if (C214368bA.LIZ && th2 != null) {
            C73374Sqw.LIZ.post(new ARunnableS42S0100000_6(th2, 156));
        }
        return C76800UCe.LIZ;
    }
}
