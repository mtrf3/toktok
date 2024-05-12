package X;

import android.os.Build;

/* renamed from: X.QRt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67013QRt {
    public static final C66997QRd LIZ;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            LIZ = new QS8();
        } else {
            LIZ = new C66997QRd();
        }
    }
}
