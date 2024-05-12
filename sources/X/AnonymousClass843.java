package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.843, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass843 {
    public static final int LIZ;

    public static final boolean LIZ() {
        if (LIZ >= 3) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ() {
        if (LIZ >= 2) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL() {
        if (LIZ >= 1) {
            return true;
        }
        return false;
    }

    static {
        FFL.LJIIIZ().getClass();
        LIZ = FFL.LJIIJ(31744, 0, "long_desc_expand_mask_optimization", true);
    }

    public static final boolean LIZJ(Aweme aweme) {
        if (!LIZIZ() || aweme == null || aweme.isAd()) {
            return false;
        }
        return true;
    }
}
