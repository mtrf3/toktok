package X;

import Y.ARunnableS10S1100000_9;
import Y.IDhS0S1000000_1;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.LfE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54812LfE implements InterfaceC54795Lex {
    public static final C54812LfE LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final C62822Ol8 LIZLLL;

    static {
        C54812LfE c54812LfE = new C54812LfE();
        LIZ = c54812LfE;
        LIZIZ = C221108m2.LIZIZ(C54805Lf7.LJLIL);
        LIZJ = C221108m2.LIZIZ(C54811LfD.LJLIL);
        LIZLLL = C221108m2.LIZIZ(C54813LfF.LJLIL);
        C42625Go9.LIZIZ(c54812LfE);
    }

    public static C54809LfB LJIIIIZZ() {
        return (C54809LfB) LIZJ.getValue();
    }

    @Override // X.InterfaceC54795Lex
    public final Aweme LJI() {
        ((C57308MeO) LIZLLL.getValue()).LJLJI.LIZJ().getClass();
        return MineUserStoryFetcher.LIZ();
    }

    @Override // X.InterfaceC54795Lex
    public final void clear() {
        LJIIIIZZ().LJI().evictAll();
    }

    @Override // X.InterfaceC54795Lex
    public final void LIZIZ(String uid) {
        o.LJIIIZ(uid, "uid");
        Aweme aweme = LJIIIIZZ().get(uid);
        if (aweme != null) {
            UserStory userStory = aweme.getUserStory();
            if (userStory != null) {
                userStory.setAllViewed(true);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(uid);
            LIZ2.append(" 's stories reported all viewed");
            C189837ch.LIZ("UserStoryRepoImplV2", X1D.LIZIZ(LIZ2));
            C1DH.LJJIJIIJI(new ARunnableS10S1100000_9(aweme, uid, 4));
        }
    }

    @Override // X.InterfaceC54795Lex
    public final AbstractC73672Svk LIZLLL(List list) {
        return ((C57308MeO) LIZLLL.getValue()).LJII(new C57309MeP(list, EnumC199577sP.NetWhenCacheMiss));
    }

    @Override // X.InterfaceC54795Lex
    public final AbstractC73672Svk LJ(String uid) {
        o.LJIIIZ(uid, "uid");
        return ((C57308MeO) LIZLLL.getValue()).LJII(new C57309MeP(C47261Igj.LJJIJ(uid), EnumC199577sP.NetworkOnly)).LJJIJL(new IDhS0S1000000_1(uid, 3));
    }

    @Override // X.InterfaceC54795Lex
    public final void LJFF(FollowStatus followStatus) {
        User author;
        o.LJIIIZ(followStatus, "followStatus");
        String str = followStatus.userId;
        o.LJIIIIZZ(str, "followStatus.userId");
        Aweme LJII = LJII(str);
        if (LJII != null && (author = LJII.getAuthor()) != null) {
            author.setFollowStatus(followStatus.followStatus);
            author.setFollowerStatus(followStatus.followerStatus);
        }
    }

    @Override // X.InterfaceC54795Lex
    public final Aweme LJII(String uid) {
        o.LJIIIZ(uid, "uid");
        return LJIIIIZZ().get(uid);
    }

    @QD3
    public final void onBlockEvent(C175046tw event) {
        String uid;
        o.LJIIIZ(event, "event");
        User user = event.LJLIL;
        if (user == null || (uid = user.getUid()) == null) {
            return;
        }
        LJIIIIZZ().remove(uid);
        C1DH.LJJIJIIJI(new ARunnableS10S1100000_9(null, uid, 4));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onFollowStatus(FollowStatusEvent followStatusEvent) {
        if (followStatusEvent != null) {
            LIZ.LJFF(followStatusEvent.status);
        }
    }

    @Override // X.InterfaceC54795Lex
    public final void LIZ(String str, List userStories) {
        o.LJIIIZ(userStories, "userStories");
        LJIIIIZZ().LIZ(str, userStories);
    }

    @Override // X.InterfaceC54795Lex
    public final void LIZJ(Aweme userStory, String str, boolean z) {
        o.LJIIIZ(userStory, "userStory");
        LJIIIIZZ().LJIIJ(userStory, str, z);
    }
}
