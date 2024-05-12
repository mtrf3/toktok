package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes12.dex */
public final class PMS {
    public final PMT LIZ;
    public final boolean LIZIZ;

    public PMS(Context context, String str, PMT pmt) {
        ApplicationInfo LLLLLLLLL;
        Bundle bundle;
        context = Build.VERSION.SDK_INT >= 24 ? C04290Ev.LIZ(context) : context;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("com.google.firebase.common.prefs:");
        LIZ.append(str);
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, X1D.LIZIZ(LIZ));
        this.LIZ = pmt;
        boolean z = true;
        if (LIZIZ.contains("firebase_data_collection_default_enabled")) {
            z = LIZIZ.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (LLLLLLLLL = C16880lQ.LLLLLLLLL(packageManager, context.getPackageName(), 128)) != null && (bundle = LLLLLLLLL.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z = LLLLLLLLL.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.LIZIZ = z;
    }
}
