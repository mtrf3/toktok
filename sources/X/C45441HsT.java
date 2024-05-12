package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.HsT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45441HsT {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        if (aweme != null && aweme.getAuthor() != null && aweme.getAuthor().getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(Aweme aweme, String str, String str2, int i) {
        if (aweme != null) {
            C10K.LIZJ(new CallableC62627Ohz(aweme, str, str2, i));
        }
    }
}
