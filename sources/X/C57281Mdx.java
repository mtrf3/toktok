package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.userservice.UserService;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mdx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57281Mdx implements InterfaceC64672gJ<C199857sr> {
    public final /* synthetic */ C57285Me1 LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ UserProfileFollowVM LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // X.InterfaceC64672gJ
    public final Object emit(C199857sr c199857sr, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C38333F2r c38333F2r;
        C57300MeG c57300MeG;
        C199857sr c199857sr2 = c199857sr;
        RelationStatus relationStatus = c199857sr2.LIZ;
        if (relationStatus != null) {
            FollowStatus followStatus = new FollowStatus(this.LJLIL.LIZ, relationStatus.getFollowStatus());
            C57285Me1 c57285Me1 = this.LJLIL;
            followStatus.followerStatus = c57285Me1.LJIIJ;
            followStatus.secUserId = c57285Me1.LIZIZ;
            followStatus.preStatus = c57285Me1.LJIIIZ;
            followStatus.followFrom = c57285Me1.LIZLLL;
            Aweme aweme = this.LJLILLLLZI;
            if (aweme != null) {
                UserProfileFollowVM userProfileFollowVM = this.LJLJI;
                int i = c57285Me1.LIZJ;
                String str = this.LJLJJI;
                userProfileFollowVM.getClass();
                UserProfileFollowVM.lv0(i, aweme, str, followStatus);
            }
            this.LJLJI.getClass();
            if (followStatus.followStatus == 1) {
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("mus_af_follow", followStatus.userId);
            }
            C2U8.LIZ(new FollowStatusEvent(followStatus));
            UserService.LIZ().LJFF().postValue(followStatus);
            User user = new User();
            user.setUid(followStatus.userId);
            user.setSecUid(followStatus.secUserId);
            user.setFollowStatus(followStatus.followStatus);
            user.setFollowerStatus(followStatus.followerStatus);
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
            createIIMServicebyMonsterPlugin.getImUserService().LJIJJLI(C78966Uyw.LJIIZILJ(user));
            createIIMServicebyMonsterPlugin.getImSayHiService().LJI(followStatus);
            if (followStatus.followStatus == 2) {
                createIIMServicebyMonsterPlugin.getImSayHiService().LJFF(followStatus.userId, true);
            }
            String str2 = followStatus.userId;
            Integer valueOf = Integer.valueOf(followStatus.followStatus);
            if (str2 != null && valueOf != null) {
                if (valueOf.intValue() == EnumC57435MgR.UNFOLLOW.getValue()) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", "others_homepage");
                    c188727au.LJIIIZ("to_user_id", str2);
                    FMX.LJIIL("follow_cancel_finish", c188727au.LIZ);
                } else {
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LJIIIZ("enter_from", "others_homepage");
                    c188727au2.LJIIIZ("to_user_id", str2);
                    FMX.LJIIL("follow_finish", c188727au2.LIZ);
                }
            }
            this.LJLJI.setState(new AqS175S0100000_9(followStatus, 613));
        } else {
            C57301MeH c57301MeH = c199857sr2.LIZIZ;
            if (c57301MeH != null) {
                UserProfileFollowVM userProfileFollowVM2 = this.LJLJI;
                Aweme aweme2 = this.LJLILLLLZI;
                String str3 = this.LJLJJI;
                C57285Me1 c57285Me12 = this.LJLIL;
                userProfileFollowVM2.getClass();
                Throwable th = null;
                if (!(c57301MeH.getCause() instanceof C38333F2r)) {
                    if ((c57301MeH instanceof C57300MeG) && (c57300MeG = (C57300MeG) c57301MeH) != null) {
                        th = c57300MeG.getE();
                    }
                    if (!(th instanceof C38333F2r)) {
                        userProfileFollowVM2.setState(new AqS175S0100000_9(c57301MeH, 615));
                    }
                }
                Throwable cause = c57301MeH.getCause();
                if (!(cause instanceof C38333F2r) || (c38333F2r = (C38333F2r) cause) == null) {
                    Throwable e = ((C57300MeG) c57301MeH).getE();
                    o.LJII(e, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                    c38333F2r = (C38333F2r) e;
                }
                if (c38333F2r.getErrorCode() == 2149 && aweme2 != null && C63081OpJ.LJLJL(aweme2)) {
                    UserProfileFollowVM.lv0(c57285Me12.LIZJ, aweme2, str3, new FollowStatus(c57285Me12.LIZ, 0, c38333F2r.getErrorCode()));
                }
                Integer valueOf2 = Integer.valueOf(c57285Me12.LIZJ);
                String str4 = c57285Me12.LIZ;
                int i2 = c57285Me12.LJIIIZ;
                int i3 = c57285Me12.LJIIJ;
                if (C1A7.LJIIJ(c38333F2r) != null && valueOf2 != null) {
                    if (valueOf2.intValue() == 1) {
                        RuntimeBehaviorServiceImpl.LJ().event("follow_user", String.valueOf(C1A7.LJIIJ(c38333F2r).getErrorCode()));
                    } else if (valueOf2.intValue() == 0) {
                        RuntimeBehaviorServiceImpl.LJ().event("unfollow_user", String.valueOf(C1A7.LJIIJ(c38333F2r).getErrorCode()));
                    }
                }
                FollowStatus followStatus2 = new FollowStatus();
                followStatus2.userId = str4;
                followStatus2.followStatus = i2;
                followStatus2.isFollowSucess = false;
                followStatus2.followerStatus = i3;
                C2U8.LIZ(new FollowStatusEvent(followStatus2));
                UserService.LIZ().LJFF().postValue(followStatus2);
                C77266UUc.LIZIZ.getRelationService().LJFF().postValue(new RelationStatus(str4, i2, Integer.valueOf(i3), null, null, 24, null));
                IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService().LJFF(str4, true);
                userProfileFollowVM2.setState(new AqS175S0100000_9(c38333F2r, 614));
            }
        }
        return C76800UCe.LIZ;
    }

    public C57281Mdx(C57285Me1 c57285Me1, Aweme aweme, UserProfileFollowVM userProfileFollowVM, String str) {
        this.LJLIL = c57285Me1;
        this.LJLILLLLZI = aweme;
        this.LJLJI = userProfileFollowVM;
        this.LJLJJI = str;
    }
}
