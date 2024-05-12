package X;

import android.view.animation.Interpolator;

/* renamed from: X.VQp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79723VQp {
    public static final C73103SmZ LIZ = new C73103SmZ();

    public static Interpolator LIZ(C79713VQf c79713VQf) {
        int i = c79713VQf.LJLJJL;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return LIZ.get(i);
            case 4:
                return C18950ol.LIZ(c79713VQf.LJLJJLL, c79713VQf.LJLJL);
            case 5:
                return C18950ol.LIZIZ(c79713VQf.LJLJJLL, c79713VQf.LJLJL, c79713VQf.LJLJLJ, c79713VQf.LJLJLLL);
            case 6:
                return new VRA((int) c79713VQf.LJLJJLL, c79713VQf.LJLL);
            default:
                new RuntimeException(KMP.LJ("layout animation don't support interpolator:", i));
                return LIZ.get(0);
        }
    }
}
