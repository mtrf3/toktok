package X;

import android.os.Bundle;

/* renamed from: X.0uH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22370uH {
    public final Bundle LIZ;
    public final boolean LIZIZ = true;

    public Bundle LIZ() {
        return this.LIZ;
    }

    public boolean LIZIZ() {
        return this.LIZIZ;
    }

    public AbstractC22370uH(String str, Bundle bundle, Bundle bundle2) {
        this.LIZ = bundle;
        Bundle LIZ = LIZ();
        if (LIZ != null) {
            LIZ.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", LIZIZ());
        }
    }
}
