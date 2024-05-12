package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.1Yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35001Yy extends C21090sD {
    public static String LJ;
    public static final boolean LJFF;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        LJFF = z;
    }

    public static boolean LIZJ(Context context) {
        if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            return true;
        }
        return false;
    }
}
