package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class IV8 {
    public static boolean LIZIZ;
    public static AbstractC73391SrD<Long> LIZLLL;
    public static final C73318Sq2 LIZ = new C73318Sq2();
    public static long LIZJ = 30000;
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(IV9.LJLIL);

    public static void LIZ() {
        AbstractC73391SrD<Long> abstractC73391SrD = LIZLLL;
        if (abstractC73391SrD != null) {
            abstractC73391SrD.dispose();
            LIZLLL = null;
        }
        C73454SsE LJJJ = AbstractC73672Svk.LJJLIIIJLJLI(LIZJ, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ());
        IVA iva = new IVA();
        LJJJ.LIZ(iva);
        LIZLLL = iva;
    }
}
