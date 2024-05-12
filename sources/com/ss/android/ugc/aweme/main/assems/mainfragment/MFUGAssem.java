package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.ActivityC45651qj;
import X.C10K;
import X.C178646zk;
import X.C212428Vi;
import X.C221108m2;
import X.C2U8;
import X.C3SZ;
import X.C62822Ol8;
import X.C68252m5;
import X.C8W0;
import X.InterfaceC81205Vtx;
import X.InterfaceC81207Vtz;
import X.LKF;
import X.LKH;
import X.LKI;
import X.LMT;
import X.LWM;
import Y.AgS126S0100000_9;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.api.FeedModuleServiceImpl;
import com.ss.android.ugc.aweme.feed.api.IFeedModuleService;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.main.InterceptHomeBackPressServiceImpl;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class MFUGAssem extends C8W0 implements InterfaceC81205Vtx, LKH, InterfaceC81207Vtz {
    public static final /* synthetic */ int LJLJJI = 0;
    public HomePageDataViewModel LJLIL;
    public LKF LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 315));

    @Override // X.InterfaceC81207Vtz
    public final boolean uh() {
        return true;
    }

    @Override // X.InterfaceC81205Vtx
    public final void G6() {
        C2U8.LIZ(new C178646zk(3));
    }

    @Override // X.LKH
    public final boolean LJIIJ() {
        LKF lkf = this.LJLILLLLZI;
        if (lkf != null) {
            return lkf.LJIILIIL();
        }
        return false;
    }

    @Override // X.InterfaceC81205Vtx
    public final void o() {
        MutableLiveData<Integer> gv0;
        HomePageDataViewModel homePageDataViewModel = this.LJLIL;
        if (homePageDataViewModel != null && (gv0 = homePageDataViewModel.gv0()) != null) {
            gv0.postValue(0);
        }
        C2U8.LIZ(new C178646zk(2));
    }

    public final void v3() {
        LKF lkf = this.LJLILLLLZI;
        if (lkf != null) {
            C10K.LJII(300L).LJ(new AgS126S0100000_9(lkf, 3), C10K.LJIIIIZZ, null);
        }
    }

    public final HomeViewPagerAbility x3() {
        return (HomeViewPagerAbility) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC81207Vtz
    public final void Rh() {
        Integer LLILL;
        HomeViewPagerAbility x3 = x3();
        if (x3 != null && (LLILL = x3.LLILL()) != null) {
            A3(LLILL.intValue(), false);
        }
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        InterceptHomeBackPressService LIZLLL = InterceptHomeBackPressServiceImpl.LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LIZIZ(this);
        }
        LKF lkf = this.LJLILLLLZI;
        if (lkf != null) {
            lkf.LJ(this);
        }
        LKF lkf2 = this.LJLILLLLZI;
        if (lkf2 != null) {
            lkf2.LJIIJ(this);
        }
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            this.LJLIL = C3SZ.LIZ(LIZ);
        }
        InterceptHomeBackPressService LIZLLL = InterceptHomeBackPressServiceImpl.LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LIZJ(this);
        }
        HomeViewPagerAbility x3 = x3();
        if (x3 != null) {
            x3.addOnPageChangeListener(new LKI(this));
        }
        C68252m5.LIZ(this, new LMT(this, null));
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        ISpecActService LJJJIL = SpecActServiceImpl.LJJJIL();
        if (LJJJIL != null) {
            LJJJIL.LJIILJJIL();
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        ISpecActService LJJJIL = SpecActServiceImpl.LJJJIL();
        if (LJJJIL != null) {
            LJJJIL.LJJIJIL();
        }
    }

    @Override // X.InterfaceC81205Vtx
    public final void za(int i) {
        MutableLiveData<Integer> gv0;
        HomePageDataViewModel homePageDataViewModel = this.LJLIL;
        if (homePageDataViewModel != null && (gv0 = homePageDataViewModel.gv0()) != null) {
            gv0.postValue(Integer.valueOf(i));
        }
    }

    public final void A3(int i, boolean z) {
        Integer valueOf;
        Fragment z7;
        LKF lkf;
        LKF lkf2;
        HomeViewPagerAbility x3 = x3();
        Fragment fragment = null;
        if (x3 != null && (valueOf = Integer.valueOf(x3.getPageType(i))) != null) {
            if (valueOf.intValue() == 0) {
                if (z && ((lkf2 = this.LJLILLLLZI) == null || !lkf2.LIZIZ())) {
                    return;
                }
                IFeedModuleService LIZ = FeedModuleServiceImpl.LIZ();
                HomeViewPagerAbility x32 = x3();
                if (x32 != null) {
                    fragment = x32.z7(i);
                }
                LIZ.refreshComment(fragment);
                return;
            }
            if (valueOf.intValue() == 1) {
                ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
                if (LIZ2 != null) {
                    LWM lwm = LWM.LIZIZ;
                    if (!lwm.LIZLLL(LIZ2).Oh()) {
                        HomeViewPagerAbility x33 = x3();
                        if (x33 == null || (z7 = x33.z7(i)) == null) {
                            return;
                        }
                        if (z && ((lkf = this.LJLILLLLZI) == null || !lkf.LIZIZ())) {
                            return;
                        }
                        lwm.LIZ.refreshComment(z7);
                        return;
                    }
                }
                v3();
                return;
            }
            if (valueOf.intValue() == 33) {
                v3();
                return;
            }
        }
        v3();
    }

    @Override // X.InterfaceC81205Vtx
    public final void jk(float f, int i) {
        MutableLiveData<Integer> gv0;
        HomePageDataViewModel homePageDataViewModel = this.LJLIL;
        if (homePageDataViewModel != null && (gv0 = homePageDataViewModel.gv0()) != null) {
            gv0.postValue(Integer.valueOf((int) (f * i)));
        }
    }
}
