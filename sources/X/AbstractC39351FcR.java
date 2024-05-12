package X;

import android.content.Context;
import com.bytedance.keva.Keva;

/* renamed from: X.FcR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39351FcR {
    public static AbstractC39351FcR LJIIIIZZ;
    public static boolean LJIIIZ;
    public static final Keva LJIIJ = Keva.getRepo("new_user_journey_flow");
    public boolean LIZ;
    public String LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJFF;
    public boolean LJ = true;
    public int LJI = -1;
    public final StringBuilder LJII = new StringBuilder();

    public abstract int LIZIZ();

    public abstract int LIZJ();

    public C40865G2b LIZLLL(Context context, Boolean bool, boolean z) {
        return null;
    }

    public abstract String LJ();

    public final String LJI() {
        if (this.LJ) {
            this.LJ = LJIIJ.getBoolean("first_video", true);
        }
        if (!C38987FRv.LIZLLL().booleanValue()) {
            return null;
        }
        if ((C38986FRu.LIZ().LIZJ() != 0 && !this.LIZ) || !this.LJ) {
            return null;
        }
        return LJIIJ.getString("last_step", null);
    }

    public final boolean LIZ() {
        if (LIZIZ() == 2 && !this.LIZ && !this.LIZLLL) {
            return true;
        }
        return false;
    }

    public final void LJFF(String str) {
        try {
            StringBuilder sb = this.LJII;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(' ');
            sb.append(X1D.LIZIZ(LIZ));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
