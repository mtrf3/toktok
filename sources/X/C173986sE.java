package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.6sE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173986sE {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Comment comment, Aweme aweme) {
        Aweme aweme2;
        boolean z;
        Boolean bool = null;
        if (comment != null) {
            aweme2 = comment.getAliasAweme();
        } else {
            aweme2 = null;
        }
        if (aweme2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (aweme != null) {
            bool = Boolean.valueOf(aweme.isAd());
        }
        if (!C176016vV.LIZ() || z || bool == null || bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
