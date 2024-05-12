package X;

import android.text.TextUtils;
import defpackage.i0;
import java.util.List;

/* loaded from: classes12.dex */
public final class QHC {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public long LJ;
    public java.util.Map<String, List<java.util.Set<String>>> LJFF;
    public java.util.Map<String, List<java.util.Map<String, Object>>> LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String[] LJIIIZ;
    public boolean LJIIJ;
    public QHN LJIIJJI;
    public int LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;

    public final String LIZ() {
        String str;
        String str2;
        if (this.LJIIL == 0 || TextUtils.isEmpty(this.LJIILIIL)) {
            return null;
        }
        if (TextUtils.isEmpty(this.LJIILL)) {
            if (this.LJIILIIL.startsWith("https://") && !this.LJIILIIL.endsWith("/")) {
                str = this.LJIILIIL;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                this.LJIILL = null;
                return null;
            }
            if (!TextUtils.isEmpty(this.LJIILJJIL) && this.LJIILJJIL.startsWith("/") && this.LJIILJJIL.endsWith("/")) {
                str2 = this.LJIILJJIL;
            } else {
                str2 = "/service/2/app_log/";
            }
            this.LJIILL = i0.LJFF(str, str2);
        }
        return this.LJIILL;
    }
}
