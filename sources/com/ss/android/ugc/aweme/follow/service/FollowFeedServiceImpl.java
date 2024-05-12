package com.ss.android.ugc.aweme.follow.service;

import X.ActivityC45651qj;
import X.C00F;
import X.C141335gf;
import X.C184077Kh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C2U8;
import X.C3C5;
import X.C45042Hm2;
import X.C46141I8z;
import X.C50420Jqa;
import X.C53295Kvr;
import X.C54029LIj;
import X.C54492La4;
import X.C54883LgN;
import X.C55661Lsv;
import X.C55902Lwo;
import X.C58096Mr6;
import X.C65352Pkq;
import X.C65776Prg;
import X.C75792yF;
import X.C78926UyI;
import X.EE1;
import X.InterfaceC36571c5;
import X.InterfaceC57543MiB;
import X.LIQ;
import X.LKJ;
import X.LW9;
import X.LWJ;
import X.LWN;
import X.LWO;
import X.LYU;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.vm.FollowFeedVM;
import com.ss.android.ugc.aweme.feed.vm.FollowStorySkylightVM;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.task.FollowPreloadTask;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.service.IFollowFeedService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowFeedServiceImpl implements IFollowFeedService {
    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final int LJIILIIL() {
        return R.id.dgp;
    }

    public static IFollowFeedService LJIILL() {
        Object LIZ = C58096Mr6.LIZ(IFollowFeedService.class, false);
        if (LIZ != null) {
            return (IFollowFeedService) LIZ;
        }
        if (C58096Mr6.T0 == null) {
            synchronized (IFollowFeedService.class) {
                if (C58096Mr6.T0 == null) {
                    C58096Mr6.T0 = new FollowFeedServiceImpl();
                }
            }
        }
        return C58096Mr6.T0;
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean LIZJ() {
        return !LIQ.LIZ.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final Fragment LJ() {
        return new FeedFollowFragment();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean LJI() {
        InterfaceC57543MiB interfaceC57543MiB;
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL == null) {
            return false;
        }
        InterfaceC36571c5 Ja = Hox.LJLLI.LIZ(LIZLLL).Ja("Following");
        if (!(Ja instanceof InterfaceC57543MiB) || (interfaceC57543MiB = (InterfaceC57543MiB) Ja) == null) {
            return false;
        }
        return interfaceC57543MiB.x1();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIIL() {
        C54492La4.LIZLLL = "unfollow";
        if (!LWJ.LIZIZ) {
            LW9.LIZJ("unfollow");
            LWJ.LIZIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIILJJIL() {
        C2U8.LIZ(new C46141I8z());
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final BaseDetailShareVM<?, ?, Long> LIZ(Fragment fragment) {
        AqS60S0110000_3 LJJ;
        o.LJIIIZ(fragment, "fragment");
        try {
            LWO lwo = LWO.LJLIL;
            C65776Prg LIZ = C65352Pkq.LIZ(FollowStorySkylightVM.class);
            LWN lwn = LWN.INSTANCE;
            if (C214368bA.LJIIIIZZ) {
                LJJ = C78926UyI.LJJ(fragment, false);
            } else {
                LJJ = C78926UyI.LJJ(fragment, true);
            }
            return (FollowStorySkylightVM) new C214378bB(LIZ, lwo, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, false), C184077Kh.LJLIL, lwn, LJJ, C78926UyI.LJIILLIIL(fragment, true)).getValue();
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LIZIZ(ArrayList<String> arrayList) {
        LIQ.LIZ.addAll(0, arrayList);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final LKJ LIZLLL(ActivityC45651qj context) {
        o.LJIIIZ(context, "context");
        return (LKJ) new ViewModelProvider(context).get(FollowFeedVM.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean LJFF(C50420Jqa event) {
        int LIZ;
        o.LJIIIZ(event, "event");
        if (C53295Kvr.LIZ()) {
            return true;
        }
        if (event.LJLIL != 15 || C54029LIj.LIZIZ.LJJIIZ()) {
            return false;
        }
        int LIZ2 = C00F.LIZ(31744, 0, "landing_page_optimization_experiment", false);
        if (LIZ2 == 0 || LIZ2 == 1) {
            return true;
        }
        if (C45042Hm2.LIZIZ() && ((LIZ = C00F.LIZ(31744, 0, "landing_page_optimization_experiment_v2", false)) == 2 || LIZ == 4)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean LJII(ActivityC45651qj activityC45651qj) {
        return Hox.LJLLI.LIZ(activityC45651qj).vv0("Following");
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final EE1 LJIIIZ(Context context) {
        return new FollowPreloadTask(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final List<Aweme> LJIIJ(List<? extends FollowFeed> list) {
        o.LJIIIZ(list, "list");
        List<Aweme> LJIIL = C54883LgN.LJIIL(list);
        o.LJIIIIZZ(LJIIL, "getAwemes(list)");
        return LJIIL;
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIIJJI(Context context) {
        FollowingInterestUser followingInterestUser;
        o.LJIIIZ(context, "context");
        List<FollowingInterestUser> list = LYU.LJIILIIL;
        LiveOuterService.LJJJLL().LJIIJJI();
        if (!C55902Lwo.LJI) {
            return;
        }
        long j = C55902Lwo.LJFF;
        if (!LYU.LJIILIIL.isEmpty()) {
            if (j <= 0) {
                followingInterestUser = (FollowingInterestUser) ListProtector.get(LYU.LJIILIIL, 0);
            } else {
                Iterator<FollowingInterestUser> it = LYU.LJIILIIL.iterator();
                while (true) {
                    if (it.hasNext()) {
                        followingInterestUser = it.next();
                        if (j == followingInterestUser.getUser().roomId) {
                            break;
                        }
                    } else {
                        followingInterestUser = null;
                        break;
                    }
                }
            }
        } else {
            LiveOuterService.LJJJLL().LJIIJJI();
            followingInterestUser = (FollowingInterestUser) GsonProtectorUtils.fromJson(C75792yF.LIZIZ(), C55661Lsv.LJI(j), FollowingInterestUser.class);
        }
        LYU.LJIILL(context, followingInterestUser, list, 0, null, 0, "follow_widget", "homepage_follow");
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void refreshComment(Fragment fragment) {
        if (fragment instanceof FeedFollowFragment) {
            FollowFeedFragmentPanelMT followFeedFragmentPanelMT = ((FeedFollowFragment) fragment).LLFZ;
            followFeedFragmentPanelMT.showCommentFragment(followFeedFragmentPanelMT.getCurrentPlayAweme(), (String) null, false, "tab_follow", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIIIIZZ(Context context, List<FollowingInterestUser> list) {
        LYU.LJIIL(context, list);
    }
}
