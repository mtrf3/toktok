package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class QN4 {
    public static final String LJJ;
    public String LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public String LJI;
    public final String LJII;
    public String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Context LJIIJJI;
    public final HashMap<Integer, Pair<String, String>> LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public final boolean LJIILL;
    public final QN3 LJIILLIIL;
    public InterfaceC65229Pir LJIIZILJ;
    public final QNJ LJIJ;
    public final boolean LJIJI;
    public int LJIJJ;
    public String LJIJJLI;
    public final InterfaceC64782Pbe LJIL;

    public final String LIZ() {
        String str = this.LJIILIIL;
        try {
            if (TextUtils.isEmpty(str)) {
                str = Locale.getDefault().toString();
            }
            if (str == null) {
                return "";
            }
        } catch (Exception unused) {
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(Build.VERSION.SDK_INT);
        LJJ = X1D.LIZIZ(LIZ);
    }

    public QN4(QN5 qn5) {
        String str;
        String str2;
        this.LIZ = "va";
        String str3 = Build.BRAND;
        this.LJIIIZ = str3;
        String str4 = Build.MODEL;
        this.LJIIJ = str4;
        this.LJIIL = new HashMap<>();
        this.LJIILJJIL = null;
        this.LJIL = null;
        this.LIZ = qn5.LIZ;
        this.LIZIZ = qn5.LIZIZ;
        this.LIZJ = qn5.LIZJ;
        this.LIZLLL = qn5.LIZLLL;
        this.LJ = qn5.LJ;
        this.LJFF = "";
        this.LJII = qn5.LJFF;
        Locale locale = Locale.getDefault();
        if (TextUtils.isEmpty(qn5.LJIIL)) {
            str = locale.toString();
        } else {
            str = qn5.LJIIL;
        }
        this.LJIILIIL = str;
        this.LJIILLIIL = qn5.LJIIJ;
        this.LJIIZILJ = null;
        this.LJIJ = qn5.LJIIJJI;
        this.LJIL = qn5.LJIILIIL;
        if (TextUtils.isEmpty(qn5.LJIIL) && (str2 = this.LJIILIIL) != null) {
            String[] split = str2.split("_");
            if (split.length > 2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(split[0]);
                LIZ.append("_");
                LIZ.append(split[1]);
                this.LJIILIIL = X1D.LIZIZ(LIZ);
            }
        }
        try {
            this.LJIIIZ = URLEncoder.encode(str3, "utf-8");
            this.LJIIJ = URLEncoder.encode(str4, "utf-8");
        } catch (UnsupportedEncodingException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LJI = qn5.LJII;
        this.LJIIIIZZ = qn5.LJIIIIZZ;
        this.LJIJJLI = null;
        this.LJIIJJI = qn5.LJI;
        this.LJIILL = true;
        this.LJIJI = qn5.LJIIIZ;
    }
}
