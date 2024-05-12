package X;

import android.os.Build;

/* renamed from: X.0Dd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03850Dd {
    public static final boolean LIZ;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        LIZ = z;
    }
}
