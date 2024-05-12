package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.bytedance.bdinstall.migrate.MigrateDetectorActivity;

/* renamed from: X.QJm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66798QJm {
    public static int LJ = -1;
    public final PackageManager LIZ;
    public final ComponentName LIZIZ;
    public final boolean LIZJ;
    public final SharedPreferences LIZLLL;

    public C66798QJm(Context context, QIF qif) {
        String str;
        Context LLLLL = C16880lQ.LLLLL(context);
        SharedPreferences LIZ = C48847JFb.LIZ(context, qif);
        this.LIZLLL = LIZ;
        PackageManager packageManager = LLLLL.getPackageManager();
        this.LIZ = packageManager;
        ComponentName componentName = new ComponentName(context, (Class<?>) MigrateDetectorActivity.class);
        this.LIZIZ = componentName;
        int i = LJ;
        boolean z = false;
        if (i == -1) {
            try {
                i = packageManager.getComponentEnabledSetting(componentName);
                LJ = i;
            } catch (Exception unused) {
            }
        }
        int i2 = LIZ.getInt("component_state", 0);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("MigrateDetector#isMigrateInternal cs=");
        String str2 = "UNKNOWN";
        if (i == 0) {
            str = "STATE_DEFAULT";
        } else if (i == 1) {
            str = "STATE_ENABLED";
        } else if (i != 2) {
            str = "UNKNOWN";
        } else {
            str = "STATE_DISABLED";
        }
        LIZ2.append(str);
        LIZ2.append(" ss=");
        if (i2 == 0) {
            str2 = "STATE_DEFAULT";
        } else if (i2 == 1) {
            str2 = "STATE_ENABLED";
        } else if (i2 == 2) {
            str2 = "STATE_DISABLED";
        }
        LIZ2.append(str2);
        X1D.LIZIZ(LIZ2);
        if (i == 0 && i2 == 2) {
            z = true;
        }
        this.LIZJ = z;
        C07670Rv.LIZLLL("MigrateDetector#constructor migrate=", z);
    }

    public static void LIZ(Context context, QIF qif, String str, boolean z) {
        SharedPreferences.Editor edit = C48847JFb.LIZ(context, qif).edit();
        edit.putString("old_did", str);
        if (z) {
            edit.putBoolean("is_migrate", true);
        } else {
            edit.remove("is_migrate");
        }
        edit.apply();
    }
}
