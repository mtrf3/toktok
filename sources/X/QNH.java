package X;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.Toast;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class QNH {
    public Activity LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL = true;
    public boolean LJ = true;

    public abstract void LIZ(StringBuilder sb);

    public abstract int LIZIZ();

    public abstract String LIZLLL();

    public abstract int LJ();

    public final String LJFF() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i;
        String str14;
        Pair<String, String> pair;
        String str15;
        String str16;
        int LJ = LJ();
        String serviceType = LIZLLL();
        Activity activity = this.LIZ;
        o.LJIIJ(serviceType, "serviceType");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append("url");
        String LIZJ = C66885QMv.LIZJ(serviceType, X1D.LIZIZ(LIZ));
        String LIZLLL = C66885QMv.LIZLLL(serviceType);
        if (o.LJ(serviceType, "twice_verify")) {
            QNQ LIZ2 = QNQ.LIZ();
            o.LJFF(LIZ2, "TwiceVerifyManager.getInstance()");
            LIZLLL = LIZ2.LIZ.LJIIIZ();
            QNQ LIZ3 = QNQ.LIZ();
            o.LJFF(LIZ3, "TwiceVerifyManager.getInstance()");
            LIZ3.LIZ.url();
            LIZJ = "https://www.tiktok.com/verifycenter/authentication";
        }
        int i2 = 1;
        String str17 = null;
        if (C61349O5x.LIZ()) {
            QNE qne = OIP.LIZ;
            o.LJFF(qne, "BdTuring.getInstance()");
            QN4 qn4 = qne.LIZ;
            if (qn4 != null) {
                pair = qn4.LJIIL.get(Integer.valueOf(LJ));
            } else {
                pair = null;
            }
            if (pair != null) {
                str15 = (String) pair.first;
            } else {
                str15 = null;
            }
            if (!TextUtils.isEmpty(str15)) {
                if (pair != null) {
                    LIZJ = (String) pair.first;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            if (pair != null) {
                str16 = (String) pair.first;
            } else {
                str16 = null;
            }
            if (!TextUtils.isEmpty(str16)) {
                if (pair != null) {
                    LIZLLL = (String) pair.second;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            if (activity != null) {
                C16880lQ.LLZILL(Toast.makeText(activity, C0ON.LIZJ("url = ", LIZJ, ", verifyHost = ", LIZLLL), 1));
            }
        }
        StringBuilder sb = new StringBuilder(C42398GkU.LIZIZ(LIZJ, '?'));
        if (LIZLLL != null) {
            try {
                sb.append("verify_host");
                sb.append("=");
                sb.append(URLEncoder.encode(LIZLLL, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                if (C61349O5x.LIZ < 3) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        QNE qne2 = OIP.LIZ;
        o.LJFF(qne2, "BdTuring.getInstance()");
        QN4 qn42 = qne2.LIZ;
        if (qn42 != null) {
            str = qn42.LIZIZ;
        } else {
            str = null;
        }
        C78840Uwu.LIZJ(sb, "aid", str);
        if (qn42 != null) {
            str2 = qn42.LIZJ;
        } else {
            str2 = null;
        }
        C78840Uwu.LIZJ(sb, "lang", str2);
        if (qn42 != null) {
            str3 = qn42.LIZLLL;
        } else {
            str3 = null;
        }
        C78840Uwu.LIZJ(sb, "app_name", str3);
        QN4 qn43 = qne2.LIZ;
        if (qn43 != null) {
            str4 = qn43.LIZ();
        } else {
            str4 = null;
        }
        C78840Uwu.LIZJ(sb, "locale", str4);
        if (qn42 != null) {
            str5 = qn42.LJ;
        } else {
            str5 = null;
        }
        C78840Uwu.LIZJ(sb, "ch", str5);
        if (qn42 != null) {
            str6 = qn42.LJ;
        } else {
            str6 = null;
        }
        C78840Uwu.LIZJ(sb, "channel", str6);
        if (qn42 != null) {
            str7 = qn42.LJFF;
        } else {
            str7 = null;
        }
        C78840Uwu.LIZJ(sb, "app_key", str7);
        if (qn42 != null) {
            str8 = qn42.LJI;
        } else {
            str8 = null;
        }
        C78840Uwu.LIZJ(sb, "iid", str8);
        if (qn42 != null) {
            str9 = qn42.LJII;
        } else {
            str9 = null;
        }
        C78840Uwu.LIZJ(sb, "vc", str9);
        if (qn42 != null) {
            str10 = qn42.LJII;
        } else {
            str10 = null;
        }
        C78840Uwu.LIZJ(sb, "app_version", str10);
        if (qn42 != null) {
            str11 = qn42.LJIIIIZZ;
        } else {
            str11 = null;
        }
        C78840Uwu.LIZJ(sb, "did", str11);
        if (qn42 != null) {
            str12 = qn42.LJIJJLI;
        } else {
            str12 = null;
        }
        C78840Uwu.LIZJ(sb, "session_id", str12);
        if (qn42 != null) {
            str13 = qn42.LIZ;
        } else {
            str13 = null;
        }
        if (str13 != null) {
            C78840Uwu.LIZJ(sb, "region", str13);
            if (C66885QMv.LJ("common").optInt("use_native_report", 0) == 1) {
                i = 1;
            } else {
                i = 0;
            }
            C78840Uwu.LIZJ(sb, "use_native_report", String.valueOf(i));
            if (C66885QMv.LJ("common").optInt("use_jsb_request", 0) != 1) {
                i2 = 0;
            }
            C78840Uwu.LIZJ(sb, "use_jsb_request", String.valueOf(i2));
            C78840Uwu.LIZJ(sb, "orientation", String.valueOf(C78840Uwu.LJIILJJIL(activity)));
            C78840Uwu.LIZJ(sb, "resolution", C78840Uwu.LJIIZILJ(activity));
            C78840Uwu.LIZJ(sb, "sdk_version", "2.3.3.i18n");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("");
            LIZ4.append(QNI.LIZJ);
            C78840Uwu.LIZJ(sb, "os_version", X1D.LIZIZ(LIZ4));
            C78840Uwu.LIZJ(sb, "device_brand", QNI.LIZ);
            String str18 = QNI.LIZIZ;
            C78840Uwu.LIZJ(sb, "device_model", str18);
            C78840Uwu.LIZJ(sb, "os_name", "Android");
            if (qn42 != null && (str14 = qn42.LJII) != null) {
                str17 = ujb.o.LJJJJZ(str14, ".", "", false);
            }
            C78840Uwu.LIZJ(sb, "version_code", str17);
            C78840Uwu.LIZJ(sb, "device_type", str18);
            C78840Uwu.LIZJ(sb, "device_platform", "Android");
            C78840Uwu.LIZJ(sb, "os_type", String.valueOf(0));
            LIZ(sb);
            String sb2 = sb.toString();
            o.LJFF(sb2, "queryBuilder.toString()");
            return sb2;
        }
        o.LJIIZILJ();
        throw null;
    }

    public boolean LIZJ() {
        return this.LIZIZ;
    }
}
