package X;

import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.userservice.UserService;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Mdz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57283Mdz extends C200737uH<C8BS<FollowStatus>, InterfaceC57288Me4> implements InterfaceC51691KQl {
    public Integer LJLJJL = -1;
    public Boolean LJLJJLL = Boolean.FALSE;
    public int LJLJL = -1;
    public String LJLJLJ = "";
    public String LJLJLLL;

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        FollowStatus followStatus;
        T t = this.LJLIL;
        FollowStatus followStatus2 = null;
        if (t == 0) {
            followStatus = null;
        } else {
            followStatus = (FollowStatus) t.getData();
        }
        InterfaceC57288Me4 interfaceC57288Me4 = (InterfaceC57288Me4) this.LJLILLLLZI;
        if (interfaceC57288Me4 != null) {
            T t2 = this.LJLIL;
            if (t2 != 0) {
                followStatus2 = (FollowStatus) t2.getData();
            }
            interfaceC57288Me4.onResponseSuccess(followStatus2);
        }
        if (followStatus != null) {
            if (followStatus.followStatus == 1) {
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("mus_af_follow", followStatus.userId);
            }
            User user = new User();
            user.setUid(followStatus.userId);
            user.setSecUid(followStatus.secUserId);
            user.setFollowStatus(followStatus.followStatus);
            user.setFollowerStatus(followStatus.followerStatus);
            IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIJJLI(C78966Uyw.LJIIZILJ(user));
            String str = followStatus.userId;
            int i = followStatus.followStatus;
            String str2 = this.LJLJLJ;
            if (str2 == null) {
                str2 = "";
            }
            C57286Me2.LIZ(i, str, str2);
        }
    }

    public C57283Mdz() {
        LJJ(new C57284Me0(this));
    }

    @Override // X.InterfaceC51691KQl
    public final void LJIIIIZZ(InterfaceC57288Me4 interfaceC57288Me4) {
        this.LJLILLLLZI = interfaceC57288Me4;
    }

    @Override // X.C200737uH, X.C8BR
    public final boolean LJIILL(Object... objArr) {
        return super.LJIILL(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // X.InterfaceC51691KQl
    public final boolean LJIJJ(C57285Me1 c57285Me1) {
        int i;
        if (c57285Me1 == null) {
            return false;
        }
        if (c57285Me1.LIZJ == 1) {
            if (c57285Me1.LJIIL) {
                i = 4;
            } else if (c57285Me1.LJIIJ == 1) {
                i = 2;
            } else {
                i = 1;
            }
        } else {
            i = 0;
        }
        FollowStatus followStatus = new FollowStatus(c57285Me1.LIZ, i);
        followStatus.followFrom = c57285Me1.LIZLLL;
        followStatus.preStatus = c57285Me1.LJIIIZ;
        followStatus.followerStatus = c57285Me1.LJIIJ;
        this.LJLJLJ = c57285Me1.LJFF;
        User user = c57285Me1.LJIILJJIL;
        if (user != null) {
            o.LJI(user);
            LJJIII(followStatus, user.m150clone());
        } else {
            LJJIII(followStatus, null);
        }
        Object[] objArr = new Object[14];
        objArr[0] = c57285Me1.LIZ;
        objArr[1] = Integer.valueOf(c57285Me1.LIZJ);
        objArr[2] = Integer.valueOf(c57285Me1.LIZLLL);
        objArr[3] = c57285Me1.LJFF;
        objArr[4] = c57285Me1.LJI;
        objArr[5] = c57285Me1.LJII;
        objArr[6] = c57285Me1.LJIIIIZZ;
        objArr[7] = Integer.valueOf(c57285Me1.LJ);
        objArr[8] = c57285Me1.LIZIZ;
        objArr[9] = Integer.valueOf(c57285Me1.LJIIJ);
        Object obj = c57285Me1.LJIIJJI;
        if (obj == null) {
            obj = new HashMap();
        }
        objArr[10] = obj;
        objArr[11] = Boolean.valueOf(c57285Me1.LJIIL);
        objArr[12] = null;
        objArr[13] = c57285Me1.LJIILL;
        return super.LJIILL(objArr);
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        if (this.LJLILLLLZI != 0) {
            int i = 1;
            if (C1A7.LJIIJ(e) != null) {
                Integer num = this.LJLJJL;
                if (num == null || num.intValue() != 1) {
                    Integer num2 = this.LJLJJL;
                    if (num2 != null && num2.intValue() == 0) {
                        RuntimeBehaviorServiceImpl.LJ().event("unfollow_user", String.valueOf(C1A7.LJIIJ(e).getErrorCode()));
                    }
                } else {
                    RuntimeBehaviorServiceImpl.LJ().event("follow_user", String.valueOf(C1A7.LJIIJ(e).getErrorCode()));
                }
            }
            K k = this.LJLILLLLZI;
            o.LJI(k);
            ((InterfaceC57288Me4) k).onFollowFail(e);
            String str = this.LJLJLLL;
            FollowStatus followStatus = new FollowStatus();
            followStatus.userId = str;
            Integer num3 = this.LJLJJL;
            if (num3 == null || num3.intValue() != 0 || !o.LJ(this.LJLJJLL, Boolean.TRUE)) {
                Integer num4 = this.LJLJJL;
                if (num4 == null || num4.intValue() != 0 || this.LJLJL != 1) {
                    Integer num5 = this.LJLJJL;
                    if (num5 == null || num5.intValue() != 0) {
                        i = 0;
                    }
                } else {
                    i = 2;
                }
            } else {
                i = 4;
            }
            followStatus.followStatus = i;
            followStatus.followerStatus = this.LJLJL;
            followStatus.isFollowSucess = false;
            C2U8.LIZ(new FollowStatusEvent(followStatus));
            UserService.LIZ().LJFF().postValue(followStatus);
        }
    }

    public final void LJJIII(FollowStatus followStatus, User user) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC57288Me4) k).onFollowSuccess(followStatus);
            C2U8.LIZ(new FollowStatusEvent(followStatus));
            UserService.LIZ().LJFF().postValue(followStatus);
            C77266UUc.LIZIZ.getRelationService().LJFF().postValue(new RelationStatus(followStatus.userId, followStatus.followStatus, Integer.valueOf(followStatus.followerStatus), null, user));
        }
    }
}
