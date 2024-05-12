package X;

import android.widget.Toast;

/* renamed from: X.5Rw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135085Rw extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C135085Rw LJLIL = new C135085Rw();

    public C135085Rw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C76800UCe c76800UCe;
        try {
            Toast toast = C135105Ry.LIZ;
            if (toast != null) {
                toast.cancel();
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        C135105Ry.LIZ = null;
        return C76800UCe.LIZ;
    }
}
