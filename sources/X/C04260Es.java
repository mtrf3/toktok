package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0Es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04260Es {
    public static File[] LIZ(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] LIZJ(Context context) {
        return context.getObbDirs();
    }

    public static File[] LIZIZ(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }
}
