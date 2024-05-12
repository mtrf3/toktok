package X;

import android.content.Context;
import com.lynx.tasm.LynxEnv;

/* renamed from: X.MyW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58556MyW {
    public static volatile C58556MyW LIZLLL;
    public volatile boolean LIZ;
    public InterfaceC39940Flw LIZIZ;
    public Context LIZJ;

    public static C58556MyW LIZ() {
        if (LIZLLL == null) {
            synchronized (LynxEnv.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C58556MyW();
                }
            }
        }
        return LIZLLL;
    }

    public final boolean LIZIZ(String str, boolean z) {
        try {
            InterfaceC39940Flw interfaceC39940Flw = this.LIZIZ;
            if (interfaceC39940Flw != null) {
                interfaceC39940Flw.loadLibrary(str);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Native library load ");
                LIZ.append(str);
                LIZ.append(" success with native library loader");
                O5Y.LJJJ("LynxKrypton", X1D.LIZIZ(LIZ));
                return true;
            }
            C16880lQ.LLJJJIL(str);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Native library load ");
            LIZ2.append(str);
            LIZ2.append(" success with System.loadLibrary");
            O5Y.LJJJ("LynxKrypton", X1D.LIZIZ(LIZ2));
            return true;
        } catch (UnsatisfiedLinkError e) {
            if (z) {
                if (this.LIZIZ == null) {
                    StringBuilder LIZIZ = C25620zW.LIZIZ("Native library load ", str, "from system with error message ");
                    LIZIZ.append(e.getMessage());
                    O5Y.LJIILIIL("LynxKrypton", X1D.LIZIZ(LIZIZ));
                    return false;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Native Library load from ");
                LIZ3.append(this.LIZIZ.getClass().getName());
                LIZ3.append(" with error message ");
                LIZ3.append(e.getMessage());
                O5Y.LJIILIIL("LynxKrypton", X1D.LIZIZ(LIZ3));
                return false;
            }
            return false;
        }
    }
}
