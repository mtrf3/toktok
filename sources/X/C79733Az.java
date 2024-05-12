package X;

import Y.IDeS151S0200000_10;
import Y.IDeS153S0200000_15;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79733Az extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, String, C76800UCe> {
    public static final C79733Az LJLIL = new C79733Az();

    public C79733Az() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, String str) {
        String str2 = str;
        if (bool.booleanValue()) {
            AtomicBoolean atomicBoolean = C3B0.LIZIZ;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                C3C3 c3c3 = new C3C3(new C67882lU(null));
                XIC xic = C78613UtF.LIZ;
                V1M.LJJIJIIJIL(new IDeS151S0200000_10(new IDeS153S0200000_15(V1M.LJIIZILJ(xic, c3c3), new C78543Us7(null), 0), new C66702ja(null), 0), C48841JEv.LIZ(xic));
            }
            C3B0.LIZ.LIZIZ = str2;
        } else {
            C3B0.LIZIZ.set(false);
            C3B0.LIZ = new C78542Us6(0);
        }
        return C76800UCe.LIZ;
    }
}
