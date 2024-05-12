package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: X.QJi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66794QJi {
    public static volatile Pair<String, Boolean> LIZ;
    public static QKJ LIZIZ;

    public static Pair<String, Boolean> LIZ(Context context, QIF qif) {
        boolean z;
        boolean z2;
        Pair<String, Boolean> pair;
        Pair<String, Boolean> pair2 = LIZ;
        if (pair2 != null && !TextUtils.isEmpty((CharSequence) pair2.first)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            synchronized (C66794QJi.class) {
                Pair<String, Boolean> pair3 = LIZ;
                if (pair3 != null && !TextUtils.isEmpty((CharSequence) pair3.first)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return LIZ;
                }
                QKJ qkj = new QKJ();
                LIZIZ = qkj;
                qkj.LIZ = System.currentTimeMillis();
                try {
                    pair = C66820QKi.LIZ.LIZIZ(qif);
                } catch (Throwable th) {
                    if (!(th instanceof ClassNotFoundException) && !(th instanceof NoClassDefFoundError)) {
                        pair = new Pair<>(null, Boolean.FALSE);
                    } else {
                        throw new RuntimeException(th);
                    }
                }
                QKJ qkj2 = LIZIZ;
                qkj2.getClass();
                qkj2.LIZIZ = System.currentTimeMillis();
                QKJ qkj3 = LIZIZ;
                qkj3.getClass();
                LIZIZ.LJI = ((Boolean) pair.second).booleanValue();
                String str = (String) pair.first;
                boolean booleanValue = ((Boolean) pair.second).booleanValue();
                if (TextUtils.isEmpty(str)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Gaid#getGaid failed . rst = ");
                    LIZ2.append(pair);
                    X1D.LIZIZ(LIZ2);
                    QKJ qkj4 = LIZIZ;
                    qkj4.getClass();
                    qkj4.LIZJ = System.currentTimeMillis();
                    SharedPreferences LIZ3 = C48847JFb.LIZ(context, qif);
                    str = LIZ3.getString("google_aid", null);
                    booleanValue = LIZ3.getBoolean("gaid_limited", false);
                    QKJ qkj5 = LIZIZ;
                    qkj5.getClass();
                    qkj5.LIZLLL = System.currentTimeMillis();
                } else {
                    QKJ qkj6 = LIZIZ;
                    qkj6.getClass();
                    qkj6.LJ = System.currentTimeMillis();
                    SharedPreferences LIZ4 = C48847JFb.LIZ(context, qif);
                    String string = LIZ4.getString("google_aid", null);
                    boolean z3 = LIZ4.getBoolean("gaid_limited", false);
                    if ((!TextUtils.equals(string, str) || z3 != booleanValue) && !TextUtils.isEmpty(str) && context != null) {
                        C48847JFb.LIZ(context, qif).edit().putString("google_aid", str).putBoolean("gaid_limited", booleanValue).apply();
                    }
                    QKJ qkj7 = LIZIZ;
                    qkj7.getClass();
                    qkj7.LJFF = System.currentTimeMillis();
                }
                LIZ = new Pair<>(str, Boolean.valueOf(booleanValue));
            }
        }
        return LIZ;
    }
}
