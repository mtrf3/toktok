package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;

/* renamed from: X.Fic, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39734Fic {
    public static C39734Fic LIZJ;
    public SharedPreferences LIZ;
    public PThreadPoolExecutor LIZIZ;

    public static C39734Fic LIZJ() {
        C39734Fic c39734Fic = LIZJ;
        if (c39734Fic == null) {
            return new C39734Fic();
        }
        return c39734Fic;
    }

    public final SharedPreferences LIZLLL() {
        if (this.LIZ == null) {
            this.LIZ = F9J.LIZIZ(C78929UyL.LJLIL, 0, "zoin—sp");
        }
        return this.LIZ;
    }

    public void LIZ(String str) {
        C1JX.LJIIIIZZ("decompress end ", str);
    }

    public void LIZIZ(String str) {
        C1JX.LJIIIIZZ("decompress start ", str);
    }

    public void LJ(int i, String str, java.util.Map map) {
        StringBuilder LJ = AnonymousClass028.LJ("Report module:", str, ", type: ", i, ", map: ");
        LJ.append(map);
        X1D.LIZIZ(LJ);
    }
}
