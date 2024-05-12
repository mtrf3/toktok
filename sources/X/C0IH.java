package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.alog.Alog;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0IH, reason: invalid class name */
/* loaded from: classes.dex */
public class C0IH {
    public final Context LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJIIIIZZ;
    public String LJIIJJI;
    public boolean LJIJI;
    public int LJFF = 2097152;
    public int LJI = 20971520;
    public int LJII = 7;
    public int LJIIIZ = 65536;
    public int LJIIJ = 196608;
    public int LJIIL = Alog.LJIIIIZZ;
    public int LJIILIIL = Alog.LJIIIZ;
    public int LJIILJJIL = Alog.LJIIJ;
    public int LJIILL = Alog.LJIIJJI;
    public int LJIILLIIL = Alog.LJIIL;
    public int LJIIZILJ = Alog.LJIILIIL;
    public String LJIJ = "b012e20c9aab1cb5257aca2069cb79a9339b3a2224f771c78d64972137936eaf0b2f7ebd8d46c2607e1d7fe7723d40b147b8ecfa8fe2eaeee05210c75822381a";

    public final Alog LIZ() {
        if (this.LIZLLL == null) {
            this.LIZLLL = "default";
        }
        ArrayList<String> arrayList = Alog.LJIILL;
        synchronized (arrayList) {
            Iterator<String> it = arrayList.iterator();
            do {
                String str = null;
                if (!it.hasNext()) {
                    Alog.LJIILL.add(this.LIZLLL);
                    if (this.LJ == null) {
                        File LLIIJI = C16880lQ.LLIIJI(this.LIZ, null);
                        if (LLIIJI != null) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(LLIIJI.getPath());
                            LIZ.append("/alog");
                            this.LJ = X1D.LIZIZ(LIZ);
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(C16880lQ.LLIIJLIL(this.LIZ));
                            LIZ2.append("/alog");
                            this.LJ = X1D.LIZIZ(LIZ2);
                        }
                    }
                    if (this.LJIIIIZZ == null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(C16880lQ.LLIIJLIL(this.LIZ));
                        LIZ3.append("/alog");
                        this.LJIIIIZZ = X1D.LIZIZ(LIZ3);
                    }
                    if (this.LJIIJJI == null) {
                        Context context = this.LIZ;
                        try {
                            str = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionName;
                        } catch (Exception unused) {
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = "unknown";
                        }
                        this.LJIIJJI = str;
                    }
                    int i = (this.LJIIIZ / 4096) * 4096;
                    this.LJIIIZ = i;
                    int i2 = (this.LJIIJ / 4096) * 4096;
                    this.LJIIJ = i2;
                    if (i < 4096) {
                        this.LJIIIZ = 4096;
                    }
                    int i3 = this.LJIIIZ;
                    if (i2 < i3 * 2) {
                        this.LJIIJ = i3 * 2;
                    }
                    return new Alog(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI);
                }
            } while (!it.next().equals(this.LIZLLL));
            return null;
        }
    }

    public C0IH(Context context) {
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LIZ = LLLLL != null ? LLLLL : context;
    }

    public final void LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("-")) {
                str = str.replace("-", "");
            }
            if (str.contains("_")) {
                str = str.replace("_", "");
            }
            if (!TextUtils.isEmpty(str)) {
                this.LIZLLL = str;
            }
        }
    }
}
