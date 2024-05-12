package X;

import com.lynx.tasm.base.LLog;

/* loaded from: classes15.dex */
public final class VEX<T> extends AbstractC61008Nwy<T, byte[]> {
    public static volatile boolean LIZ;
    public static volatile VA5 LIZIZ;

    public static boolean LIZJ() {
        if (LIZIZ == null) {
            if (LIZ) {
                return false;
            }
            synchronized (VEX.class) {
                if (!LIZ) {
                    VA4 va4 = (VA4) VEZ.LIZIZ().LIZ(VA4.class);
                    if (VA5.class.isInstance(va4)) {
                        LIZIZ = (VA5) VA5.class.cast(va4);
                    }
                    LIZ = true;
                }
            }
            if (LIZIZ == null) {
                return false;
            }
        }
        return LIZIZ.LJII();
    }

    @Override // X.AbstractC61008Nwy
    public final void LIZ(C08200Tw c08200Tw, QXX qxx) {
        if (!LIZJ()) {
            LIZIZ(qxx, (String) c08200Tw.LIZ, -3, "Lynx resource service init failed");
        } else {
            LIZIZ.fetchResourceAsync((String) c08200Tw.LIZ, new O3M(), new VEW(this, qxx, c08200Tw));
        }
    }

    public static void LIZIZ(QXX qxx, String str, int i, String str2) {
        StringBuilder LJ = AnonymousClass028.LJ("Lynx resource service request failed, the url is ", str, ", the error code is ", i, ", and the error message is ");
        LJ.append(str2);
        LLog.LIZLLL(4, "LynxResourceServiceProvider", X1D.LIZIZ(LJ));
        qxx.LLLILZJ(new VEH(i, new Throwable(str2)));
    }
}
