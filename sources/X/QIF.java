package X;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QIF {
    public final int LIZ;
    public final PA0 LIZIZ;
    public final Context LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final QKZ LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final JSONObject LJIILIIL;
    public final java.util.Map<String, Object> LJIILJJIL;
    public final boolean LJIILL;
    public final QIZ LJIILLIIL;
    public final boolean LJIIZILJ;
    public final InterfaceC64002P9y LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public final boolean LJIJJLI;
    public Account LJIL;
    public final InterfaceC66836QKy LJJ;
    public final boolean LJJI;
    public final boolean LJJIFFI;
    public final boolean LJJII;
    public final InterfaceC66833QKv LJJIII;
    public final EnumC86802Y4w LJJIIJ;
    public final C39246Fak LJJIIJZLJL;
    public final TelephonyManager LJJIIZ;
    public boolean LJJIIZI;
    public SharedPreferences LJJIJ;

    public final String LIZ() {
        return String.valueOf(this.LIZ);
    }

    public final long LIZIZ() {
        PackageInfo LIZIZ;
        QIZ qiz = this.LJIILLIIL;
        if (qiz.LJ == 0 && (LIZIZ = qiz.LJI.LIZIZ(new Object[0])) != null) {
            return LIZIZ.versionCode;
        }
        return qiz.LJ;
    }

    public final SharedPreferences LIZJ() {
        String LIZIZ;
        if (this.LJJIJ == null) {
            if (this.LJJIIZI) {
                LIZIZ = this.LIZLLL;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LIZLLL);
                LIZ.append("_");
                LIZ.append(this.LIZ);
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            this.LJJIJ = F9J.LIZIZ(this.LIZJ, 0, LIZIZ);
        }
        return this.LJJIJ;
    }

    public final long LIZLLL() {
        PackageInfo LIZIZ;
        QIZ qiz = this.LJIILLIIL;
        if (qiz.LIZLLL == 0 && (LIZIZ = qiz.LJI.LIZIZ(new Object[0])) != null) {
            return LIZIZ.versionCode;
        }
        return qiz.LIZLLL;
    }

    public final String LJ() {
        PackageInfo LIZIZ;
        QIZ qiz = this.LJIILLIIL;
        if (TextUtils.isEmpty(qiz.LIZ) && (LIZIZ = qiz.LJI.LIZIZ(new Object[0])) != null) {
            return LIZIZ.versionName;
        }
        return qiz.LIZ;
    }

    public final long LJFF() {
        PackageInfo LIZIZ;
        QIZ qiz = this.LJIILLIIL;
        if (qiz.LIZJ == 0 && (LIZIZ = qiz.LJI.LIZIZ(new Object[0])) != null) {
            return LIZIZ.versionCode;
        }
        return qiz.LIZJ;
    }

    public QIF(QIE qie) {
        String str;
        this.LIZJ = qie.LJIIIIZZ;
        this.LIZ = qie.LJI;
        PA0 pa0 = qie.LJII;
        this.LIZIZ = pa0 == null ? new P9R() : pa0;
        if (TextUtils.isEmpty(qie.LJIIIZ)) {
            str = "applog_stats";
        } else {
            str = qie.LJIIIZ;
        }
        this.LIZLLL = str;
        this.LJ = qie.LJIIJ;
        this.LJFF = qie.LJIILLIIL;
        this.LJI = qie.LJIIZILJ;
        this.LJII = qie.LJIJ;
        this.LJIIIIZZ = qie.LJIJI;
        this.LJIIIZ = qie.LJIJJ;
        this.LJIIJ = qie.LJIJJLI;
        this.LJIIJJI = qie.LJIL;
        this.LJIIL = qie.LJJ;
        this.LJIILIIL = qie.LJJI;
        this.LJIILJJIL = qie.LJJIFFI;
        this.LJJ = qie.LJ;
        this.LJJI = qie.LJFF;
        this.LJJIFFI = qie.LIZLLL;
        this.LJIILL = qie.LIZJ;
        this.LJJII = qie.LIZIZ;
        this.LJJIII = qie.LIZ;
        this.LJIILLIIL = new QIZ(qie);
        this.LJIL = qie.LJJII;
        this.LJIIZILJ = qie.LJJIII;
        this.LJIJ = new C64003P9z();
        this.LJIJI = qie.LJJIIJ;
        this.LJIJJ = qie.LJJIIJZLJL;
        this.LJIJJLI = qie.LJJIIZ;
        this.LJJIIJ = qie.LJJIIZI;
        C39246Fak c39246Fak = qie.LJJIJ;
        this.LJJIIZ = qie.LJJIJIIJI;
        if (c39246Fak != null) {
            this.LJJIIJZLJL = c39246Fak;
            c39246Fak.LJLIL = this;
        } else {
            C39246Fak c39246Fak2 = new C39246Fak();
            this.LJJIIJZLJL = c39246Fak2;
            c39246Fak2.LJLIL = this;
        }
    }
}
