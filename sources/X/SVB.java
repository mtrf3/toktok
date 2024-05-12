package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes13.dex */
public final class SVB {
    public static boolean LIZ(Context context) {
        if (context == null) {
            return false;
        }
        try {
            C16880lQ.LLLLLLZ(context.getPackageManager(), "com.tiktok.android.music", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
