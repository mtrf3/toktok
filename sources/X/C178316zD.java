package X;

import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.6zD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178316zD {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        User author;
        AwemeStatus status;
        AwemeStatus status2;
        VideoControl videoControl;
        if (aweme == null || aweme.isAd()) {
            return false;
        }
        if ((!aweme.isPhotoMode() || C8SG.LIZIZ.LJ()) && (author = aweme.getAuthor()) != null && author.getFollowStatus() == 2 && ((RBX) HG3.LJIILL()).isLogin() && !C63081OpJ.LJLJLLL(aweme) && aweme.isCanPlay() && (((status = aweme.getStatus()) == null || !status.isDelete()) && (((status2 = aweme.getStatus()) == null || status2.isAllowComment()) && ((!C80S.LIZJ(aweme) || C80S.LIZLLL(aweme) || (aweme.getAuthor() != null && o.LJ(aweme.getAuthor().getUid(), ((RBX) HG3.LJIILL()).getCurUser().getUid()))) && !aweme.isAwemeFromXiGua() && !aweme.isCmtSwt() && !aweme.isScheduleVideo() && ((videoControl = aweme.getVideoControl()) == null || videoControl.timerStatus != 0))))) {
            CommentService.LIZ.getClass();
            CommentService LJJL = CommentServiceImpl.LJJL();
            if (LJJL.LJIILLIIL(aweme) || !LJJL.LJJIJIIJI(aweme) || C80S.LJFF(aweme) || AV1.LJIIJJI() || a.LJ().LJ(3)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
