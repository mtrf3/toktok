package X;

/* renamed from: X.MyV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58555MyV {
    public static volatile C58555MyV LIZJ;
    public volatile boolean LIZ;
    public InterfaceC39940Flw LIZIZ;

    public static C58555MyV LIZ() {
        if (LIZJ == null) {
            synchronized (C58555MyV.class) {
                if (LIZJ == null) {
                    LIZJ = new C58555MyV();
                }
            }
        }
        return LIZJ;
    }

    public final void LIZIZ() {
        try {
            InterfaceC39940Flw interfaceC39940Flw = this.LIZIZ;
            if (interfaceC39940Flw != null) {
                interfaceC39940Flw.loadLibrary("animax");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Native library load ");
                LIZ.append("animax");
                LIZ.append(" success with native library loader");
                C77125UOr.LJIJI("AnimaX", X1D.LIZIZ(LIZ));
            } else {
                C16880lQ.LLJJJIL("animax");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Native library load ");
                LIZ2.append("animax");
                LIZ2.append(" success with System.loadLibrary");
                C77125UOr.LJIJI("AnimaX", X1D.LIZIZ(LIZ2));
            }
        } catch (UnsatisfiedLinkError e) {
            if (this.LIZIZ == null) {
                StringBuilder LIZIZ = C25620zW.LIZIZ("Native library load ", "animax", " from system with error message ");
                LIZIZ.append(e.getMessage());
                C77125UOr.LJIILJJIL("AnimaX", X1D.LIZIZ(LIZIZ));
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Native Library load from ");
                LIZ3.append(this.LIZIZ.getClass().getName());
                LIZ3.append(" with error message ");
                LIZ3.append(e.getMessage());
                C77125UOr.LJIILJJIL("AnimaX", X1D.LIZIZ(LIZ3));
            }
        }
    }
}
