package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.7GJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GJ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Comment comment, Aweme aweme) {
        if (aweme == null || comment == null || C78966Uyw.LJJIJ().LIZIZ() || C54838Lfe.LJIIZILJ(aweme)) {
            return false;
        }
        if (C00F.LIZ(31744, 0, "long_press_to_share_comment", true) == 2) {
            return true;
        }
        int status = comment.getStatus();
        if (C00F.LIZ(31744, 0, "long_press_to_share_comment", true) != 1 || status == 2 || status == 4 || status == 7 || status == 11) {
            return false;
        }
        return true;
    }
}
