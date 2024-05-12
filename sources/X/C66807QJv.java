package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.ss.android.deviceregister.AActivity;

/* renamed from: X.QJv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66807QJv {
    public final SharedPreferences LIZ;
    public final PackageManager LIZIZ;
    public final ComponentName LIZJ;
    public final boolean LIZLLL;

    public C66807QJv(Context context) {
        String str;
        Context LLLLL = C16880lQ.LLLLL(context);
        boolean z = false;
        SharedPreferences LIZIZ = F9J.LIZIZ(LLLLL, 0, "device_register_migrate_detector");
        this.LIZ = LIZIZ;
        PackageManager packageManager = LLLLL.getPackageManager();
        this.LIZIZ = packageManager;
        ComponentName componentName = new ComponentName(context, (Class<?>) AActivity.class);
        this.LIZJ = componentName;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        int i = LIZIZ.getInt("component_state", 0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MigrateDetector#isMigrateInternal cs=");
        String str2 = "UNKNOWN";
        if (componentEnabledSetting == 0) {
            str = "STATE_DEFAULT";
        } else if (componentEnabledSetting == 1) {
            str = "STATE_ENABLED";
        } else if (componentEnabledSetting != 2) {
            str = "UNKNOWN";
        } else {
            str = "STATE_DISABLED";
        }
        LIZ.append(str);
        LIZ.append(" ss=");
        if (i == 0) {
            str2 = "STATE_DEFAULT";
        } else if (i == 1) {
            str2 = "STATE_ENABLED";
        } else if (i == 2) {
            str2 = "STATE_DISABLED";
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        if (componentEnabledSetting == 0 && i == 2) {
            z = true;
        }
        this.LIZLLL = z;
        C07670Rv.LIZLLL("MigrateDetector#constructor migrate=", z);
    }
}
