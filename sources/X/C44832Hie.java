package X;

import android.os.Build;
import defpackage.e1;

/* renamed from: X.Hie, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44832Hie {
    public static final boolean LIZ() {
        if (e1.LIZ(31744, "init_before_start_mic_and_release_after_stop_mic", true, false) && Build.VERSION.SDK_INT > 30) {
            return true;
        }
        return false;
    }
}
