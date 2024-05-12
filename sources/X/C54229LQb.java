package X;

import Y.ARunnableS45S0100000_9;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentHost;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.LQb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54229LQb implements INoticeCountTabBadgePresentHost {
    public static boolean LJ;
    public final MainPageFragment LIZ;
    public final TabChangeManager LIZIZ;
    public final InterfaceC54232LQe LIZJ;
    public final ScrollSwitchStateManager LIZLLL;

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentHost
    public final void onPopupClick() {
        Bundle bundle;
        LIZLLL(true);
        if (C53765L8f.LJIILIIL("NOTIFICATION")) {
            C55888Lwa.LIZIZ.LJIIJ();
            ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
            if (mo49getActivity != null) {
                Intent intent = mo49getActivity.getIntent();
                if (intent == null || (bundle = C16880lQ.LLJJIJI(intent)) == null) {
                    bundle = new Bundle();
                }
                bundle.putString("fromStart", "RootNode");
                bundle.putBoolean("isSmoothScroll", true);
                com.bytedance.hox.Hox.LJLLI.LIZ(mo49getActivity).Cv0(bundle, "NOTIFICATION");
                return;
            }
            return;
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LIZLLL;
        if (scrollSwitchStateManager == null) {
            return;
        }
        LJI(scrollSwitchStateManager);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentHost
    public final void onPopupDismiss() {
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentHost
    public final void onPopupShow() {
    }

    public final void LIZ() {
        if (((Boolean) C88099Yhr.LJFF.getValue()).booleanValue()) {
            C38995FSd.LIZJ().execute(new ARunnableS45S0100000_9(this, 259));
            return;
        }
        OSZ<Boolean, Boolean> LJ2 = LJ();
        if (LJ2.getFirst().booleanValue() || LJ2.getSecond().booleanValue()) {
            LJFF();
        } else {
            LIZIZ();
        }
    }

    public final void LIZIZ() {
        ActivityC45651qj mo49getActivity;
        InterfaceC54132LMi interfaceC54132LMi;
        if (!this.LIZ.isViewValid()) {
            return;
        }
        if ((C54305LSz.LIZJ() || !LQU.LJFF) && (mo49getActivity = this.LIZ.mo49getActivity()) != null) {
            ActivityC45651qj mo49getActivity2 = this.LIZ.mo49getActivity();
            if (mo49getActivity2 != null) {
                interfaceC54132LMi = ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).getHomeTabViewModel(mo49getActivity2);
            } else {
                interfaceC54132LMi = null;
            }
            LL5.LIZJ(mo49getActivity, interfaceC54132LMi);
        }
        LJ = false;
    }

    public final OSZ<Boolean, Boolean> LJ() {
        InterfaceC26386AXe interfaceC26386AXe;
        boolean needShowRedDotOnMyProfileMore = C86034Xpe.LIZIZ.needShowRedDotOnMyProfileMore();
        Boolean LIZ = SharePrefCache.inst().getEnableProfileActivityLink().LIZ();
        o.LJIIIIZZ(LIZ, "inst().enableProfileActivityLink.cache");
        boolean z = false;
        if (LIZ.booleanValue() && ((interfaceC26386AXe = (InterfaceC26386AXe) AXW.LIZ(this.LIZ.getContext(), InterfaceC26386AXe.class)) == null || !TextUtils.equals(interfaceC26386AXe.LJIIJ(), String.valueOf(true)))) {
            z = true;
        }
        return new OSZ<>(Boolean.valueOf(needShowRedDotOnMyProfileMore), Boolean.valueOf(z));
    }

    public final void LJFF() {
        ActivityC45651qj mo49getActivity;
        InterfaceC54132LMi interfaceC54132LMi;
        if (!this.LIZ.isViewValid()) {
            return;
        }
        if ((C54305LSz.LIZJ() || !LQU.LJFF) && (mo49getActivity = this.LIZ.mo49getActivity()) != null) {
            ActivityC45651qj mo49getActivity2 = this.LIZ.mo49getActivity();
            if (mo49getActivity2 != null) {
                interfaceC54132LMi = ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).getHomeTabViewModel(mo49getActivity2);
            } else {
                interfaceC54132LMi = null;
            }
            LL5.LIZLLL(mo49getActivity, interfaceC54132LMi);
        }
        LJ = true;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentHost
    public final String getDmFragmentInfo() {
        Fragment fragment;
        Fragment fragment2;
        Fragment fragment3;
        ScrollSwitchStateManager scrollSwitchStateManager = this.LIZLLL;
        Fragment fragment4 = null;
        if (scrollSwitchStateManager != null) {
            fragment = scrollSwitchStateManager.gv0();
        } else {
            fragment = null;
        }
        if (fragment instanceof LKC) {
            return "notification_page";
        }
        ScrollSwitchStateManager scrollSwitchStateManager2 = this.LIZLLL;
        if (scrollSwitchStateManager2 != null) {
            fragment2 = scrollSwitchStateManager2.gv0();
        } else {
            fragment2 = null;
        }
        if (!(fragment2 instanceof MainFragment)) {
            return "";
        }
        ScrollSwitchStateManager scrollSwitchStateManager3 = this.LIZLLL;
        if (scrollSwitchStateManager3 != null) {
            fragment3 = scrollSwitchStateManager3.wv0();
        } else {
            fragment3 = null;
        }
        if (fragment3 instanceof FeedRecommendFragment) {
            return "homepage_hot";
        }
        ScrollSwitchStateManager scrollSwitchStateManager4 = this.LIZLLL;
        if (scrollSwitchStateManager4 != null) {
            fragment4 = scrollSwitchStateManager4.wv0();
        }
        if (!(fragment4 instanceof FeedFollowFragment)) {
            return "";
        }
        return "homepage_follow";
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentHost
    public final boolean interceptPopup() {
        InterfaceC54232LQe interfaceC54232LQe;
        if (((RBX) HG3.LJIILL()).isLogin()) {
            Keva repo = Keva.getRepo("account_security_keva_name");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("prior_to_safe_info_");
            if (!C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, false) && (((interfaceC54232LQe = this.LIZJ) == null || interfaceC54232LQe.getToastVisibility() != 0) && !LRU.LIZIZ())) {
                return false;
            }
        }
        C221018lt.LJFF("NCTBPManager", "checkShowNotification blocked by privacy");
        return true;
    }

    public final void LIZJ(boolean z) {
        String LJJLIIIJJI = MainPageFragmentImpl.LJI().LJJLIIIJJI();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("logEnterHomePageMessage enterFrom ");
        LIZ.append(LJJLIIIJJI);
        C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZ));
        C114304eA.LIZIZ(new C54228LQa(this, z, LJJLIIIJJI));
    }

    public final void LIZLLL(boolean z) {
        InterfaceC36571c5 interfaceC36571c5;
        String str;
        TabChangeManager tabChangeManager = this.LIZIZ;
        if (tabChangeManager != null) {
            interfaceC36571c5 = tabChangeManager.Ja("NOTIFICATION");
        } else {
            interfaceC36571c5 = null;
        }
        TabChangeManager tabChangeManager2 = this.LIZIZ;
        if (tabChangeManager2 != null) {
            str = tabChangeManager2.nv0();
        } else {
            str = null;
        }
        if (interfaceC36571c5 instanceof AX8) {
            AX8 ax8 = (AX8) interfaceC36571c5;
            if (!ax8.L3()) {
                if (!o.LJ(str, "NOTIFICATION")) {
                    LIZJ(z);
                } else {
                    ax8.v0(MainPageFragmentImpl.LJI().LJJLIIIJJI());
                }
                C54363LVf.LJLILLLLZI.LJIIIZ(260, null, true);
            }
        }
        LIZJ(z);
        C54363LVf.LJLILLLLZI.LJIIIZ(260, null, true);
    }

    public final void LJI(ScrollSwitchStateManager stateManager) {
        String str;
        o.LJIIIZ(stateManager, "stateManager");
        TabChangeManager tabChangeManager = this.LIZIZ;
        if (tabChangeManager != null) {
            str = tabChangeManager.nv0();
        } else {
            str = null;
        }
        if (!o.LJ("NOTIFICATION", str)) {
            TabChangeManager tabChangeManager2 = this.LIZIZ;
            if (tabChangeManager2 != null) {
                TabChangeManager.jv0(tabChangeManager2, "NOTIFICATION", true, 26);
            }
            IWF.LJJLIIIIJ().LJIILJJIL();
            C56692Kj.LIZ().LIZIZ();
            O5Y.LJJIZ(this.LIZ.mo49getActivity());
            stateManager.tv0(false);
            this.LIZ.qQ(true);
            C38987FRv.LJI(LSC.NOTICE);
        }
        LRP.LIZIZ.LIZLLL();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDoubleClickInbox(C54110LLm event) {
        o.LJIIIZ(event, "event");
        FMX.LIZIZ().execute(RunnableC54233LQf.LJLIL);
    }

    public C54229LQb(MainPageFragment fragment, TabChangeManager tabChangeManager, InterfaceC54232LQe interfaceC54232LQe, ScrollSwitchStateManager scrollSwitchStateManager) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = fragment;
        this.LIZIZ = tabChangeManager;
        this.LIZJ = interfaceC54232LQe;
        this.LIZLLL = scrollSwitchStateManager;
        EventBus.LIZJ().LJIILJJIL(this);
        LJ = false;
    }
}
