package com.ss.android.ugc.aweme.main.assems;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C224498rV;
import X.C2J0;
import X.C38816FLg;
import X.C3SZ;
import X.C52207KeJ;
import X.C54060LJo;
import X.C55050Lj4;
import X.C55448LpU;
import X.C56662Kg;
import X.C63081OpJ;
import X.C78688UuS;
import X.C78939UyV;
import X.C82699Wcx;
import X.C86550Xxy;
import X.C9CI;
import X.LQM;
import X.QD3;
import Y.ARunnableS28S0200000_9;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.contentlanguage.api.ContentLanguageGuideServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.MainActivity;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public final class MainLegacyEventBusAssem extends BaseMainContainerAssem {
    @Override // X.C8W0
    public final void onCreate() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(MainLegacyEventBusAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3
    public final void onHideLivePopupWindowEvent(C55050Lj4 c55050Lj4) {
        if (C52207KeJ.LIZ) {
            C86550Xxy.LIZIZ.LIZIZ("ad");
        }
    }

    @QD3
    public final void onMobEnterFromEvent(C54060LJo event) {
        o.LJIIIZ(event, "event");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        C3SZ.LIZ(LIZ).hv0(event.LJLIL);
    }

    @QD3
    public final void onMobRequestIdEvent(C2J0 event) {
        o.LJIIIZ(event, "event");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        C3SZ.LIZ(LIZ).LJLJLJ = event.LJLIL;
    }

    @QD3
    public final void onScrollToProfileEvent(C224498rV c224498rV) {
        MainActivity mainActivity;
        if (c224498rV == null) {
            return;
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (!(LIZ instanceof MainActivity) || (mainActivity = (MainActivity) LIZ) == null) {
            return;
        }
        HomePageDataViewModel LIZ2 = C3SZ.LIZ(mainActivity);
        C55448LpU c55448LpU = mainActivity.mCommerceActivityObserver;
        String str = c224498rV.LJLILLLLZI;
        if (str == null) {
            str = "";
        }
        if (c224498rV.LJLIL != mainActivity.hashCode()) {
            return;
        }
        if (o.LJ("click_ad_web_jsb", str) || o.LJ("click_ad_jsb", str) || !c55448LpU.LIZ()) {
            C78688UuS.LJJIJIIJI(mainActivity).J1(LIZ2.LJLJLLL, str);
        }
    }

    @QD3
    public final void onVideoPageChangeEvent(C9CI event) {
        MainActivity mainActivity;
        String str;
        MainActivity mainActivity2;
        Aweme aweme;
        o.LJIIIZ(event, "event");
        if (event.LJLIL == null) {
            return;
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (!(LIZ instanceof MainActivity) || (mainActivity = (MainActivity) LIZ) == null) {
            return;
        }
        HomePageDataViewModel LIZ2 = C3SZ.LIZ(mainActivity);
        String authorUid = event.LJLIL.getAuthorUid();
        o.LJIIIIZZ(authorUid, "event.mAweme.authorUid");
        Aweme aweme2 = event.LJLIL;
        LIZ2.LJLJLLL = aweme2;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = "";
        }
        C78939UyV.LJLILLLLZI = str;
        Aweme aweme3 = LIZ2.LJLJLLL;
        if (aweme3 != null) {
            aweme3.getAid();
        }
        if (TextUtils.equals(LIZ2.LJLJJI, authorUid)) {
            return;
        }
        LIZ2.LJLJJI = authorUid;
        mainActivity.mCommerceActivityObserver.LIZJ.onVideoPageChangeEvent(event.LJLIL, event.LJLILLLLZI);
        ActivityC45651qj LIZ3 = C212428Vi.LIZ(this);
        if (!(LIZ3 instanceof MainActivity) || (mainActivity2 = (MainActivity) LIZ3) == null) {
            return;
        }
        HomePageDataViewModel LIZ4 = C3SZ.LIZ(mainActivity2);
        Aweme aweme4 = event.LJLIL;
        if (aweme4 == null || !aweme4.isAd() || (aweme = event.LJLIL) == null || !C63081OpJ.LJLJJL(aweme)) {
            C38816FLg.LIZLLL(new ARunnableS28S0200000_9(LIZ4, mainActivity2, 67), 300);
        }
        mainActivity2.mCommerceActivityObserver.LIZIZ();
        ContentLanguageGuideServiceImpl.LIZIZ().LJI(mainActivity2);
        Aweme aweme5 = event.LJLIL;
        if (aweme5 == null || !aweme5.isAd()) {
            return;
        }
        LiveOuterService.LJJJLL().LJJJJLL(false).getClass();
        LQM.LIZJ("ad_avoid", false);
        C82699Wcx.LIZ();
    }
}
