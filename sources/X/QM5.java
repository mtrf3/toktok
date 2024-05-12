package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QM5 {
    public static boolean LIZIZ;
    public static Context LIZJ;
    public static EKD LIZ = new EKD();
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(QMA.LJLIL);

    public static Account[] LIZIZ(AccountManager accountManager, String str) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(102501, "android/accounts/AccountManager", "getAccountsByType", accountManager, new Object[]{str}, "android.accounts.Account[]", new C65300Pk0(false, "(Ljava/lang/String;)[Landroid/accounts/Account;", "545856397417674952"));
        return LIZJ2.LIZ ? (Account[]) LIZJ2.LIZIZ : accountManager.getAccountsByType(str);
    }

    public static boolean LIZ(String str) {
        if (!LIZIZ) {
            QM7 qm7 = new QM7();
            qm7.LIZJ("share_sdk_no_init");
            qm7.LIZLLL();
            return false;
        }
        String str2 = "";
        if (!TextUtils.isEmpty(str) && LIZIZ && ORZ.LJLJJI(str, LIZ.LIZ.keySet())) {
            Context context = LIZJ;
            String str3 = null;
            if (context != null) {
                o.LJI(str);
                try {
                    PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), str, 64);
                    o.LJIIIIZZ(LLLLLLZ, "context.packageManager.g…geManager.GET_SIGNATURES)");
                    Signature signature = LLLLLLZ.signatures[0];
                    o.LJIIIIZZ(signature, "signatures[0]");
                    String LIZ2 = QM4.LIZ(signature);
                    if (LIZ2 != null) {
                        str2 = LIZ2;
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    QM7 qm72 = new QM7();
                    qm72.LIZJ("share_sdk_get_pkg_sign_failed");
                    qm72.LIZIZ(e.getMessage(), "err_msg");
                    qm72.LIZIZ(android.util.Log.getStackTraceString(e), "err_msg_stack");
                    qm72.LIZLLL();
                }
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(LIZ.LIZ.get(str))) {
                    String lowerCase = str2.toLowerCase();
                    o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
                    String str4 = LIZ.LIZ.get(str);
                    if (str4 != null) {
                        str3 = str4.toLowerCase();
                        o.LJIIIIZZ(str3, "this as java.lang.String).toLowerCase()");
                    }
                    if (o.LJ(lowerCase, str3)) {
                        return true;
                    }
                }
            } else {
                o.LJIJI("mContext");
                throw null;
            }
        }
        QM7 qm73 = new QM7();
        qm73.LIZJ("share_sdk_check_pkg_sign_failed");
        qm73.LIZIZ(str, "pkg_name");
        qm73.LIZIZ(str2, "pkg_sign");
        qm73.LIZLLL();
        return false;
    }

    public static void LIZJ(Context context, String str, String value) {
        o.LJIIIZ(value, "value");
        RunnableC39007FSp.LIZIZ(new RunnableC82878Wfq(context, null, str, value, 1));
        C66862QLy LIZ2 = C66863QLz.LIZ(context);
        SharedPreferences.Editor edit = F9J.LIZIZ(LIZ2.LIZ, 0, LIZ2.LIZIZ).edit();
        o.LJIIIIZZ(edit, "context.getSharedPrefere…text.MODE_PRIVATE).edit()");
        edit.putString(str, value).apply();
    }
}
