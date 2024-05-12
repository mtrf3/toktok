package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0Ev, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04290Ev {
    public static Context LIZ(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static File LIZIZ(Context context) {
        return context.getDataDir();
    }

    public static boolean LIZJ(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
