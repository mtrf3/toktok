package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class JGC {
    public static final java.util.Map<String, String> LIZ = new ConcurrentHashMap(4);

    public static String LIZIZ(QIF qif) {
        String str = null;
        if (qif == null) {
            return null;
        }
        String LIZ2 = qif.LIZ();
        java.util.Map<String, String> map = LIZ;
        String str2 = (String) ((ConcurrentHashMap) map).get(LIZ2);
        if (str2 == null) {
            synchronized (JGC.class) {
                if (C36860EdM.LIZLLL(qif.LIZJ)) {
                    str = LIZJ(qif);
                    ((ConcurrentHashMap) map).put(LIZ2, str);
                    JG8.LIZ(qif.LIZJ).LIZJ(qif.LIZ(), "cdid", str);
                } else {
                    Context context = qif.LIZJ;
                    if (context != null) {
                        JG8.LIZ(context).LIZIZ(qif.LIZ(), "cdid", new JGD());
                        str = (String) ((ConcurrentHashMap) map).get(qif.LIZ());
                    }
                }
                str2 = str;
            }
        }
        return str2;
    }

    public static String LIZJ(QIF qif) {
        String LIZIZ;
        if (qif == null) {
            return null;
        }
        SharedPreferences LIZ2 = C48847JFb.LIZ(qif.LIZJ, qif);
        String string = LIZ2.getString("cdid", null);
        if (TextUtils.isEmpty(string)) {
            if (qif.LJJIIZI) {
                LIZIZ = C48857JFl.LIZJ();
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(C48857JFl.LIZJ());
                LIZ3.append("_");
                LIZ3.append(qif.LIZ);
                LIZIZ = X1D.LIZIZ(LIZ3);
            }
            SharedPreferences LIZIZ2 = F9J.LIZIZ(qif.LIZJ, 0, LIZIZ);
            string = LIZIZ2.getString("cdid", null);
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString();
            }
            LIZIZ2.edit().putString("cdid", string).apply();
            LIZ2.edit().putString("cdid", string).putBoolean("cdid_migrate", true).apply();
        }
        return string;
    }

    public static void LIZ(Context context, QIF qif) {
        String LIZIZ;
        if (context == null || qif == null) {
            return;
        }
        ((ConcurrentHashMap) LIZ).remove(qif.LIZ());
        C48847JFb.LIZ(context, qif).edit().remove("cdid").apply();
        if (qif.LJJIIZI) {
            LIZIZ = C48857JFl.LIZJ();
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C48857JFl.LIZJ());
            LIZ2.append("_");
            LIZ2.append(qif.LIZ);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        SharedPreferences LIZIZ2 = F9J.LIZIZ(context, 0, LIZIZ);
        if (!LIZIZ2.contains("cdid")) {
            return;
        }
        LIZIZ2.edit().remove("cdid").apply();
    }
}
