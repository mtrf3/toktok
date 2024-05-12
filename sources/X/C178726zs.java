package X;

import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.profile.model.User;
import yq4.a;

/* renamed from: X.6zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178726zs {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        if (aweme == null || !((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        AwemeControl awemeControl = aweme.getAwemeControl();
        if ((awemeControl != null && !awemeControl.canComment()) || aweme.isCmtSwt() || aweme.isScheduleVideo()) {
            return false;
        }
        VideoControl videoControl = aweme.getVideoControl();
        if (videoControl != null && videoControl.timerStatus == 0) {
            return false;
        }
        CommentService.LIZ.getClass();
        CommentService LJJL = CommentServiceImpl.LJJL();
        if (LJJL.LJIILLIIL(aweme) || !LJJL.LJJIJIIJI(aweme) || C80S.LJFF(aweme) || AV1.LJIIJJI()) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Aweme aweme) {
        String str;
        CommentService.LIZ.getClass();
        CommentServiceImpl.LJJL().LJJI();
        C178736zt c178736zt = C178736zt.LIZ;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        return c178736zt.get(str).LJLILLLLZI;
    }

    public static boolean LIZJ(Aweme aweme) {
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 2 || aweme.isAd()) {
            return false;
        }
        if (aweme.isPhotoMode() && !C8SG.LIZIZ.LJ()) {
            return false;
        }
        if (!C54838Lfe.LJJ(aweme) && !C54838Lfe.LJIIZILJ(aweme) && (LIZIZ(aweme) || a.LJ().LJ(3) || !LIZ(aweme) || aweme.getSharer() != null)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Aweme aweme) {
        User author;
        if (aweme == null || ((Number) C181497Aj.LIZ.getValue()).intValue() <= 0 || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 2 || aweme.isAd()) {
            return false;
        }
        if (aweme.isPhotoMode() && !C8SG.LIZIZ.LJ()) {
            return false;
        }
        if (!C54838Lfe.LJJ(aweme) && !C54838Lfe.LJIIZILJ(aweme) && (a.LJ().LJ(3) || !LIZ(aweme))) {
            return false;
        }
        return true;
    }
}
