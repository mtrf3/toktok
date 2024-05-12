package X;

import Y.ARunnableS18S0000000_11;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QM6 {
    public static Context LIZ;
    public static List<QMB> LIZIZ;
    public static QMD LIZJ;
    public static boolean LJ;
    public static final Handler LIZLLL = new Handler(C16880lQ.LLJJJJ());
    public static final HashSet<String> LJFF = new HashSet<>();
    public static final ARunnableS18S0000000_11 LJI = new ARunnableS18S0000000_11(22);

    public static Account[] LIZJ(AccountManager accountManager, String str) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(102501, "android/accounts/AccountManager", "getAccountsByType", accountManager, new Object[]{str}, "android.accounts.Account[]", new C65300Pk0(false, "(Ljava/lang/String;)[Landroid/accounts/Account;", "-7817079656827966248"));
        return LIZJ2.LIZ ? (Account[]) LIZJ2.LIZIZ : accountManager.getAccountsByType(str);
    }

    public static Cursor LIZLLL(ContentResolver contentResolver, android.net.Uri uri) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-7817079656827966248"));
        return LIZJ2.LIZ ? (Cursor) LIZJ2.LIZIZ : contentResolver.query(uri, null, null, null, null);
    }

    public static void LIZ(QM8 qm8) {
        LJ = true;
        LIZLLL.removeCallbacks(LJI);
        QMD qmd = LIZJ;
        if (qmd != null) {
            qmd.LIZ(qm8);
        }
        QM7 qm7 = new QM7();
        qm7.LIZJ("share_sdk_read_result");
        qm7.LIZIZ(Boolean.valueOf(qm8.LIZIZ), "is_succ");
        qm7.LIZIZ(qm8.LIZJ, "err_msg");
        qm7.LIZIZ(Integer.valueOf(qm8.LIZLLL), "query_type");
        qm7.LIZIZ(qm8.LIZ, "pkg_name");
        qm7.LIZLLL();
    }

    public static boolean LIZIZ(String pkgName) {
        o.LJIIIZ(pkgName, "pkgName");
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(pkgName, "com.ss.android.account.share.data.write.activity.ShareDataActivity"));
        Context context = LIZ;
        o.LJI(context);
        if (intent.resolveActivityInfo(context.getPackageManager(), 65536) != null) {
            return true;
        }
        return false;
    }

    public static void LJ(QM8 qm8) {
        if (LJ) {
            return;
        }
        HashSet<String> hashSet = LJFF;
        hashSet.remove(qm8.LIZ);
        if (qm8.LIZIZ && !TextUtils.isEmpty(qm8.LJFF)) {
            LIZ(qm8);
        } else if (TextUtils.isEmpty(qm8.LIZ)) {
            LIZ(qm8);
        } else if (hashSet.isEmpty()) {
            LIZ(qm8);
        }
    }

    public static QM8 LJFF(QMB qmb, String str) {
        try {
            Context context = LIZ;
            o.LJI(context);
            AccountManager accountManager = AccountManager.get(context);
            Account[] LIZJ2 = LIZJ(accountManager, qmb.LJFF);
            o.LJIIIIZZ(LIZJ2, "accountManager.getAccoun…e(readConfig.accountType)");
            int length = LIZJ2.length;
            int i = 0;
            while (i < length) {
                Account account = LIZJ2[i];
                i++;
                String data = accountManager.getUserData(account, str);
                if (!TextUtils.isEmpty(data)) {
                    QM8 qm8 = new QM8(qmb.LIZ, (String) null, true, 12);
                    qm8.LJ = str;
                    qm8.LIZLLL = 1;
                    o.LJIIIIZZ(data, "data");
                    qm8.LJFF = data;
                    return qm8;
                }
            }
            return new QM8(1, qmb.LIZ, "read form account failed", false);
        } catch (Exception e) {
            QM7 qm7 = new QM7();
            qm7.LIZJ("share_sdk_read_data_err");
            qm7.LIZIZ(e.getMessage(), "err_msg");
            qm7.LIZIZ(android.util.Log.getStackTraceString(e), "err_msg_stack");
            qm7.LIZLLL();
            return new QM8(1, qmb.LIZ, o.LJIILLIIL(e.getMessage(), "read form account failed with error "), false);
        }
    }

    public static QM8 LJI(QMB qmb, String str) {
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("content://");
            LIZ2.append(qmb.LIZ);
            LIZ2.append(".SecShareProviderAuthority/sec_share/");
            LIZ2.append(str);
            LIZ2.append("?aid=");
            LIZ2.append(qmb.LIZIZ);
            android.net.Uri parse = UriProtector.parse(X1D.LIZIZ(LIZ2));
            Context context = LIZ;
            o.LJI(context);
            Cursor LIZLLL2 = LIZLLL(context.getContentResolver(), parse);
            if (LIZLLL2 != null) {
                LIZLLL2.moveToFirst();
                String value = LIZLLL2.getString(LIZLLL2.getColumnIndex(str));
                QM8 qm8 = new QM8(qmb.LIZ, (String) null, true, 12);
                qm8.LJ = str;
                qm8.LIZLLL = 2;
                o.LJIIIIZZ(value, "value");
                qm8.LJFF = value;
                return qm8;
            }
            return new QM8(2, qmb.LIZ, "read form provider", false);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            QM8 qm82 = new QM8(2, qmb.LIZ, String.valueOf(e.getMessage()), false);
            QM7 qm7 = new QM7();
            qm7.LIZJ("share_sdk_read_data_err");
            qm7.LIZIZ(e.getMessage(), "err_msg");
            qm7.LIZIZ(android.util.Log.getStackTraceString(e), "err_msg_stack");
            qm7.LIZLLL();
            return qm82;
        }
    }
}
