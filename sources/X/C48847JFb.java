package X;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.i0;

/* renamed from: X.JFb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48847JFb {
    public static final C48850JFe LIZ = new C48850JFe();

    public static SharedPreferences LIZ(Context context, QIF qif) {
        if (qif != null) {
            if (qif.LJJIIZI) {
                return LIZ.LIZIZ(context);
            }
            String valueOf = String.valueOf(qif.LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ug_install_settings_pref_");
            LIZ2.append(valueOf);
            return F9J.LIZIZ(context, 0, X1D.LIZIZ(LIZ2));
        }
        return LIZ.LIZIZ(context);
    }

    public static String LIZIZ(AbstractC48849JFd abstractC48849JFd, String str) {
        if (abstractC48849JFd.LJLJI) {
            str = i0.LJFF(str, "_i18n");
        }
        if (abstractC48849JFd.LJLJJI) {
            str = i0.LJFF(str, "_boe");
        }
        if (abstractC48849JFd.LJLIL) {
            return i0.LJFF(str, "_cm");
        }
        return str;
    }
}
