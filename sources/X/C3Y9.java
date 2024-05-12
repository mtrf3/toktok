package X;

import android.os.SystemClock;

/* renamed from: X.3Y9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Y9 extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public static final C3Y9 LJLIL = new C3Y9();

    public C3Y9() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            C78646Utm.LIZ.getClass();
            C57737MlJ.LIZJ = SystemClock.uptimeMillis();
        }
        return C76800UCe.LIZ;
    }
}
