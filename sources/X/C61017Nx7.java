package X;

import Y.ARunnableS12S0101000_8;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;

/* renamed from: X.Nx7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61017Nx7 {
    public static C61017Nx7 LIZIZ;
    public final C61018Nx8 LIZ;

    public static C61017Nx7 LIZ() {
        if (LIZIZ == null) {
            synchronized (C61017Nx7.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C61017Nx7();
                }
            }
        }
        return LIZIZ;
    }

    public final boolean LIZIZ() {
        if (this.LIZ.LJFF > 0) {
            return true;
        }
        return false;
    }

    public C61017Nx7() {
        AwemeHostApplication LIZ = FKM.LIZ();
        if (LIZ == null) {
            return;
        }
        C61018Nx8 c61018Nx8 = new C61018Nx8(LIZ);
        this.LIZ = c61018Nx8;
        M59 LIZIZ2 = M59.LIZIZ();
        LIZIZ2.getClass();
        C38995FSd.LIZJ().execute(new ARunnableS12S0101000_8(1, LIZIZ2, 35));
        if (!EU2.LIZ()) {
            M59 LIZIZ3 = M59.LIZIZ();
            if (C61019Nx9.LJLIL == null) {
                synchronized (C61019Nx9.class) {
                    if (C61019Nx9.LJLIL == null) {
                        C61019Nx9.LJLIL = new C61019Nx9();
                    }
                }
            }
            LIZIZ3.LIZJ(C61019Nx9.LJLIL);
        }
        M59.LIZIZ().LIZJ(C61496OBo.LJLIL);
        c61018Nx8.LIZLLL = M59.LIZIZ();
        c61018Nx8.LJ = C61020NxA.LIZ;
    }
}
