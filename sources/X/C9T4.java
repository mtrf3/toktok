package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.e1;

/* renamed from: X.9T4, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9T4 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        if (e1.LIZ(31744, "deal_data_miss_phase_two", true, false)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        if (!LIZ()) {
            return false;
        }
        if (aweme != null) {
            if (aweme.isAd()) {
                return false;
            }
            if (aweme != null && aweme.isLive()) {
                return false;
            }
        }
        return true;
    }
}
