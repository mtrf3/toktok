package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: X.0Et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04270Et {
    public static File LIZ(Context context) {
        return context.getCodeCacheDir();
    }

    public static File LIZJ(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static Drawable LIZIZ(Context context, int i) {
        return context.getDrawable(i);
    }
}
