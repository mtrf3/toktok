package X;

import Y.IDeS151S0200000_10;
import Y.IDeS153S0200000_15;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3B1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3B1 extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, String, C76800UCe> {
    public static final C3B1 LJLIL = new C3B1();

    public C3B1() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, String str) {
        String str2 = str;
        if (bool.booleanValue()) {
            AtomicBoolean atomicBoolean = C3B9.LIZIZ;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                C3C3 c3c3 = new C3C3(new C67872lT(null));
                XIC xic = C78613UtF.LIZ;
                V1M.LJJIJIIJIL(new IDeS151S0200000_10(new IDeS153S0200000_15(V1M.LJIIZILJ(xic, c3c3), new C78552UsG(null), 0), new C66692jZ(null), 0), C48841JEv.LIZ(xic));
            }
            C3B9.LIZ.LIZIZ = str2;
        } else {
            C3B9.LIZIZ.set(false);
            C3B9.LIZ = new C78553UsH(0);
            C78554UsI.LIZIZ.end();
        }
        return C76800UCe.LIZ;
    }
}
