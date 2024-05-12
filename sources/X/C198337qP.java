package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.feed.event.NowEventRegistry;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7qP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198337qP implements InterfaceC72642tA<C50420Jqa> {
    public static final C198337qP LJLIL = new C198337qP();

    public static boolean LIZ() {
        if (!C2NU.LIZ.LIZIZ()) {
            C7XD.LJ("NowOnInternalEventListener", "Network isn't available");
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC72642tA
    public final void onInternalEvent(C50420Jqa c50420Jqa) {
        Integer valueOf;
        C7NR c7nr;
        ActivityC45651qj activityC45651qj;
        int LIZ;
        C7NR c7nr2;
        Aweme aweme;
        String aid;
        C50420Jqa c50420Jqa2 = c50420Jqa;
        if (c50420Jqa2 == null || (valueOf = Integer.valueOf(c50420Jqa2.LJLIL)) == null) {
            return;
        }
        if (valueOf.intValue() == 2) {
            if (!LIZ()) {
                return;
            }
            Object obj = c50420Jqa2.LJLILLLLZI;
            if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || (aid = aweme.getAid()) == null) {
                return;
            }
            C195037l5.LIZIZ.LIZ.LIZ(aid);
            return;
        }
        if (valueOf.intValue() == 1) {
            C7XD.LIZ("NowOnInternalEventListener", "report button clicked");
            if (!LIZ()) {
                return;
            }
            Object obj2 = c50420Jqa2.LJLILLLLZI;
            if (!(obj2 instanceof C7NR) || (c7nr2 = (C7NR) obj2) == null) {
                return;
            }
            ShareDependService.LIZ.getClass();
            OQA.LIZJ(C44498HdG.LIZ(), c7nr2.LIZJ, c7nr2.LIZ, EF7.LIZIZ(), c7nr2.LIZIZ, c7nr2.LIZ, null, 192);
            return;
        }
        if (valueOf.intValue() != 68 || !LIZ()) {
            return;
        }
        Object obj3 = c50420Jqa2.LJLILLLLZI;
        if (!(obj3 instanceof C7NR) || (c7nr = (C7NR) obj3) == null) {
            return;
        }
        String uid = c7nr.LIZJ.getAuthor().getUid();
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (!(validTopActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) validTopActivity) == null) {
            return;
        }
        C3U1 LIZLLL = C77266UUc.LIZIZ.getRelationService().LIZLLL(activityC45651qj);
        User author = c7nr.LIZJ.getAuthor();
        o.LJIIIIZZ(author, "nowShareParams.aweme.author");
        if (o.LJ("share_and_unfollow", "homepage_hot")) {
            LIZ = -1;
        } else {
            LIZ = C56202M3y.LIZ("share_and_unfollow");
        }
        ALX alx = new ALX();
        alx.LIZJ(author.getUid());
        alx.LIZIZ(author.getSecUid());
        boolean isAccuratePrivateAccount = author.isAccuratePrivateAccount();
        C57285Me1 c57285Me1 = alx.LIZ;
        c57285Me1.LJIIL = isAccuratePrivateAccount;
        c57285Me1.LIZJ = 0;
        c57285Me1.LJFF = "share_and_unfollow";
        alx.LIZ.LIZLLL = C56202M3y.LIZIZ(null, "share_and_unfollow");
        alx.LIZ.LJIIIZ = author.getFollowStatus();
        int followerStatus = author.getFollowerStatus();
        C57285Me1 c57285Me12 = alx.LIZ;
        c57285Me12.LJIIJ = followerStatus;
        c57285Me12.LJ = LIZ;
        alx.LIZ.LJIILL = author.getAccurateRecType();
        LIZLLL.yQ(alx.LIZ(), "share_and_unfollow", null);
        NowEventRegistry<C195057l7> nowEventRegistry = C185117Oh.LIZJ;
        o.LJIIIIZZ(uid, "uid");
        nowEventRegistry.LIZ(new C195057l7(uid));
    }
}
