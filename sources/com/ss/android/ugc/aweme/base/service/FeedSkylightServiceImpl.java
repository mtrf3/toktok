package com.ss.android.ugc.aweme.base.service;

import X.ActivityC45651qj;
import X.C141335gf;
import X.C184077Kh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C3C4;
import X.C3C5;
import X.C54048LJc;
import X.C54406LWw;
import X.C54606Lbu;
import X.C54608Lbw;
import X.C54609Lbx;
import X.C54610Lby;
import X.C54611Lbz;
import X.C54612Lc0;
import X.C54613Lc1;
import X.C54614Lc2;
import X.C54636LcO;
import X.C55723Ltv;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VV;
import X.EnumC54603Lbr;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.ss.android.ugc.aweme.service.IFeedSkylightService;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS32S1000000_9;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedSkylightServiceImpl implements IFeedSkylightService {
    public static FeedSkylightContainerViewModel LJIIIIZZ(Fragment fragment) {
        AqS60S0110000_3 LJJ;
        try {
            C65776Prg LIZ = C65352Pkq.LIZ(FeedSkylightContainerViewModel.class);
            C54610Lby c54610Lby = C54610Lby.INSTANCE;
            if (C214368bA.LJIIIIZZ) {
                LJJ = C78926UyI.LJJ(fragment, false);
            } else {
                LJJ = C78926UyI.LJJ(fragment, true);
            }
            return (FeedSkylightContainerViewModel) new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, false), C184077Kh.LJLIL, c54610Lby, LJJ, C78926UyI.LJIILLIIL(fragment, true)).getValue();
        } catch (Throwable th) {
            C3C4 LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
            C3C5.m10exceptionOrNullimpl(LIZ2);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final BaseDetailShareVM<?, ?, Long> LIZ(Fragment fragment) {
        AqS60S0110000_3 LJJ;
        o.LJIIIZ(fragment, "fragment");
        try {
            C54611Lbz c54611Lbz = C54611Lbz.LJLIL;
            C65776Prg LIZ = C65352Pkq.LIZ(FeedSkylightListViewModel.class);
            C54609Lbx c54609Lbx = C54609Lbx.INSTANCE;
            if (C214368bA.LJIIIIZZ) {
                LJJ = C78926UyI.LJJ(fragment, false);
            } else {
                LJJ = C78926UyI.LJJ(fragment, true);
            }
            return (FeedSkylightListViewModel) new C214378bB(LIZ, c54611Lbz, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, false), C184077Kh.LJLIL, c54609Lbx, LJJ, C78926UyI.LJIILLIIL(fragment, true)).getValue();
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final boolean LJ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        try {
            FeedSkylightContainerViewModel feedSkylightContainerViewModel = (FeedSkylightContainerViewModel) new C214378bB(C65352Pkq.LIZ(FeedSkylightContainerViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(activity, false), C184077Kh.LJLIL, C54613Lc1.INSTANCE, C78926UyI.LJIIJJI(activity), C78926UyI.LJIILL(activity)).getValue();
            if (feedSkylightContainerViewModel == null) {
                return false;
            }
            return feedSkylightContainerViewModel.hv0();
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            C3C5.m10exceptionOrNullimpl(LIZ);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final boolean LJFF(Fragment fragment) {
        FeedSkylightContainerViewModel LJIIIIZZ = LJIIIIZZ(fragment);
        if (LJIIIIZZ != null) {
            return LJIIIIZZ.gv0();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final void LJII(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        FeedSkylightContainerViewModel LJIIIIZZ = LJIIIIZZ(fragment);
        if (LJIIIIZZ == null) {
            return;
        }
        if (!C54048LJc.LIZ) {
            LJIIIIZZ.setState(new AqS32S1000000_9(10));
            return;
        }
        if (!LJIIIIZZ.hv0()) {
            FeedSkylightContainerViewModel.iv0(LJIIIIZZ, true, "publish_landing", false, 12);
            LJIIIIZZ.setState(new C54614Lc2(false, false));
            if (!LJIIIIZZ.getState().LJLILLLLZI) {
                LJIIIIZZ.jv0(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final void LIZJ(SocialFriendsFeedFragment fragment, boolean z) {
        o.LJIIIZ(fragment, "fragment");
        FeedSkylightContainerViewModel LJIIIIZZ = LJIIIIZZ(fragment);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.jv0(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final void LIZLLL(Fragment fragment, String enterMethod) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(enterMethod, "enterMethod");
        FeedSkylightContainerViewModel LJIIIIZZ = LJIIIIZZ(fragment);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LJLIL = enterMethod;
            LJIIIIZZ.setState(C54612Lc0.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final void LJI(Fragment fragment, C54406LWw config) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(config, "config");
        C54606Lbu.LIZIZ = System.currentTimeMillis();
        C8VV.LIZ(fragment, false, new C54608Lbw(fragment, config));
        C55723Ltv.LIZIZ.LJIILJJIL().LJII(fragment, new AqS140S0200000_9(this, fragment, 53));
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final StoryGetFeedByPageResponse LIZIZ(long j, String str, EnumC54603Lbr scene) {
        o.LJIIIZ(scene, "scene");
        return C54636LcO.LIZ(j, str, scene);
    }
}
