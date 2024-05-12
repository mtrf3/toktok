package X;

import android.os.Build;

/* renamed from: X.ZcB, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90295ZcB {
    public static final int LIZ;

    static {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            i = 67108864;
        } else {
            i = 0;
        }
        LIZ = i;
        if (i2 >= 31 || i2 < 30) {
            return;
        }
        String str = Build.VERSION.CODENAME;
        if (str.length() != 1 || str.charAt(0) < 'S') {
            return;
        }
        str.charAt(0);
    }
}
