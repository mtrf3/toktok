package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* renamed from: X.PvL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66003PvL {
    public final Context LIZ;
    public String LIZLLL;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIJ;
    public int LIZIZ = 20971520;
    public int LIZJ = 2097152;
    public boolean LJ = true;
    public boolean LJFF = true;
    public int LJIIIZ = 64;

    public final C66004PvM LIZ() {
        String str;
        C66004PvM c66004PvM = new C66004PvM();
        c66004PvM.LIZ = this.LIZ;
        c66004PvM.LIZIZ = 14;
        c66004PvM.LIZJ = this.LIZIZ;
        c66004PvM.LJIILL = 0.1f;
        c66004PvM.LIZLLL = this.LIZJ;
        String str2 = null;
        if (TextUtils.isEmpty(null)) {
            str2 = UC0.LJJ(this.LIZ);
        }
        c66004PvM.LJ = str2;
        if (TextUtils.isEmpty(this.LIZLLL)) {
            File file = new File(C16880lQ.LLIIJLIL(this.LIZ), "logs");
            if (!file.exists()) {
                file.mkdir();
            }
            str = file.getAbsolutePath();
        } else {
            str = this.LIZLLL;
        }
        c66004PvM.LJFF = str;
        c66004PvM.LJI = this.LJ;
        c66004PvM.LJII = this.LJFF;
        c66004PvM.LJIIIIZZ = 3;
        c66004PvM.LJIIIZ = "fecbb32b759120b672045f74edc41d159b6a426ffc863b9e0be9ad4be12824546f549959b838993a430344f15197221e87bd362298814c75f5068148b980306f";
        c66004PvM.LJIIJ = true;
        c66004PvM.LJIIJJI = this.LJI;
        c66004PvM.LJIILIIL = this.LJIIIIZZ;
        c66004PvM.LJIIL = this.LJII;
        c66004PvM.LJIILLIIL = this.LJIIJ;
        c66004PvM.LJIILJJIL = this.LJIIIZ;
        return c66004PvM;
    }

    public C66003PvL(Context context) {
        if (context != null) {
            Context LLLLL = C16880lQ.LLLLL(context);
            this.LIZ = LLLLL != null ? LLLLL : context;
            return;
        }
        throw new RuntimeException("context must not be null");
    }
}
