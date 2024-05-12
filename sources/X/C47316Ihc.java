package X;

import android.os.Build;

/* renamed from: X.Ihc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47316Ihc {
    public static final C47315Ihb LIZ;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            LIZ = new C47315Ihb();
        } else {
            LIZ = null;
        }
    }
}
