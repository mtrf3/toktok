package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.Comment;

/* renamed from: X.6we, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176726we {
    public static void LIZ(Comment comment, String str) {
        boolean z = false;
        if (comment.getUserDigged() == 1) {
            comment.setUserDigged(0);
            comment.setDiggCount(comment.getDiggCount() - 1);
        } else {
            comment.setUserDigged(1);
            comment.setDiggCount(comment.getDiggCount() + 1);
            if (comment.getUserBuried() == 1) {
                comment.setUserBuried(0);
            }
        }
        if (TextUtils.equals(str, ((RBX) HG3.LJIILL()).getCurUserId()) && comment.getLabelType() != 1) {
            if (comment.getUserDigged() == 1) {
                z = true;
            }
            comment.setAuthorDigged(z);
        }
    }
}
