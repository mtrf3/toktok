package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.82q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2049682q {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        if (C00F.LIZ(31744, 0, "feed_missing_component_optimization", true) != 1) {
            return false;
        }
        if (aweme != null && aweme.isAd()) {
            return false;
        }
        return true;
    }
}
