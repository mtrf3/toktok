package X;

import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;

/* renamed from: X.7HO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7HO {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        CommentService.LIZ.getClass();
        if (!CommentServiceImpl.LJJL().LJJIJIIJI(aweme)) {
            return false;
        }
        int commentSetting = aweme.getCommentSetting();
        if (commentSetting == 0) {
            return true;
        }
        if (commentSetting == 3) {
            return false;
        }
        if (commentSetting == 1) {
            return C80S.LIZLLL(aweme);
        }
        if (commentSetting != 2) {
            return false;
        }
        return C80S.LIZIZ(aweme);
    }

    public static boolean LIZIZ(Aweme aweme) {
        InteractPermission interactPermission;
        if (aweme == null || !C7HP.LIZ() || C54838Lfe.LJJI(aweme) || aweme.isAd() || (interactPermission = aweme.getInteractPermission()) == null || interactPermission.getUpvote() != 0 || C78996UzQ.LJJIIZI(aweme) || C63081OpJ.LJLJLLL(aweme) || !aweme.isCanPlay() || aweme.isDelete() || C80S.LJFF(aweme) || aweme.isSubOnlyVideo()) {
            return false;
        }
        if (C80S.LIZJ(aweme) && !C80S.LIZLLL(aweme)) {
            return false;
        }
        if ((aweme.getVideoControl() != null && aweme.getVideoControl().timerStatus == 0) || C63081OpJ.LJLJJI(aweme) || aweme.isProhibited() || C63081OpJ.LJJLIIIJLJLI(aweme)) {
            return false;
        }
        return true;
    }
}
