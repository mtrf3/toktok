package com.bytedance.tiktok.homepage.mainpagefragment.notification;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C268713r;
import X.C2K0;
import X.C36922EeM;
import X.C38987FRv;
import X.C53320KwG;
import X.C54229LQb;
import X.C54234LQg;
import X.C54241LQn;
import X.C54305LSz;
import X.C55673Lt7;
import X.C56692Kj;
import X.C62822Ol8;
import X.C73969T1h;
import X.ENR;
import X.EnumC54238LQk;
import X.HG3;
import X.IWF;
import X.InterfaceC54232LQe;
import X.InterfaceC55102Lju;
import X.LQU;
import X.LR1;
import X.LR8;
import X.LRQ;
import X.LRR;
import X.LRS;
import X.LRT;
import X.LSC;
import X.M8V;
import X.O5Y;
import X.RBX;
import X.RBY;
import X.T16;
import X.X1D;
import X.Z8A;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS45S0100000_9;
import Y.IDLListenerS60S0200000_9;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.SafeInfoNoticePopupWindowHelp;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeApi;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import yq4.a;

/* loaded from: classes10.dex */
public final class NoticeAssem extends BaseMainPageFragmentUIAssem implements NoticeAbility, InterfaceC55102Lju {
    public View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public InterfaceC54232LQe LJLJJL;
    public LR1 LJLJJLL;
    public SafeInfoNoticePopupWindowHelp LJLJL;
    public C54234LQg LJLJLJ;
    public FissionPopupWindowHelp LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public LQU LJLLILLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1649727721) {
            return null;
        }
        return this;
    }

    public NoticeAssem() {
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 62));
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 61));
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 59));
        this.LJLL = C221108m2.LIZIZ(LRS.LJLIL);
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 60));
    }

    public final ScrollSwitchStateManager A3() {
        return (ScrollSwitchStateManager) this.LJLJI.getValue();
    }

    public final TabChangeManager C3() {
        return (TabChangeManager) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final void m1() {
        ViewStub viewStub;
        Handler LIZJ;
        C54234LQg c54234LQg = this.LJLJLJ;
        if (c54234LQg != null && (LIZJ = c54234LQg.LIZJ()) != null) {
            LIZJ.removeCallbacks(new ARunnableS45S0100000_9(this, 18));
        }
        FissionPopupWindowHelp fissionPopupWindowHelp = this.LJLJLLL;
        if (fissionPopupWindowHelp != null && (viewStub = fissionPopupWindowHelp.LJLJL) != null) {
            viewStub.setVisibility(8);
        }
    }

    public final C54229LQb v3() {
        return (C54229LQb) this.LJLLI.getValue();
    }

    public final INoticeCountTabBadgePresentService x3() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-noticeCountTabBadgePresentService>(...)");
        return (INoticeCountTabBadgePresentService) value;
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final boolean gn() {
        if (ENR.LIZ()) {
            if (x3().isShowing() || TextUtils.equals("USER", C3().nv0())) {
                return false;
            }
        } else {
            LR1 lr1 = this.LJLJJLL;
            if ((lr1 != null && lr1.LJIIJ) || TextUtils.equals("USER", C3().nv0())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final void ki() {
        if (ENR.LIZ()) {
            x3().LIZLLL();
            return;
        }
        LR1 lr1 = this.LJLJJLL;
        if (lr1 == null || !lr1.LJIIJ) {
            return;
        }
        lr1.LIZIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final void lC() {
        C54229LQb v3;
        ScrollSwitchStateManager A3 = A3();
        if (A3 != null && (v3 = v3()) != null) {
            v3.LJI(A3);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        if (ENR.LIZ()) {
            x3().onDestroy();
            C54229LQb v3 = v3();
            if (v3 != null) {
                EventBus.LIZJ().LJIJ(v3);
                C54229LQb.LJ = false;
            }
        } else {
            LR1 lr1 = this.LJLJJLL;
            if (lr1 != null) {
                EventBus.LIZJ().LJIJ(lr1);
                LR8 lr8 = lr1.LIZIZ;
                if (lr8 != null && lr8.isShowing()) {
                    LR8 lr82 = lr1.LIZIZ;
                    o.LJI(lr82);
                    lr82.LIZ();
                }
            }
            C54234LQg c54234LQg = this.LJLJLJ;
            if (c54234LQg != null) {
                c54234LQg.LJIIIZ();
            }
        }
        if (C54305LSz.LIZLLL() || C54305LSz.LJ()) {
            LQU lqu = this.LJLLILLLL;
            if (lqu != null) {
                EventBus.LIZJ().LJIJ(lqu);
                LQU.LJFF = false;
            }
            this.LJLLILLLL = null;
        }
        SafeInfoNoticePopupWindowHelp safeInfoNoticePopupWindowHelp = this.LJLJL;
        if (safeInfoNoticePopupWindowHelp != null) {
            EventBus.LIZJ().LJIJ(safeInfoNoticePopupWindowHelp);
            M8V m8v = safeInfoNoticePopupWindowHelp.LJLJJLL;
            if (m8v != null) {
                try {
                    m8v.dismiss();
                } catch (Exception unused) {
                }
                safeInfoNoticePopupWindowHelp.LJLJJLL = null;
            }
        }
        FissionPopupWindowHelp fissionPopupWindowHelp = this.LJLJLLL;
        if (fissionPopupWindowHelp != null) {
            EventBus.LIZJ().LJIJ(fissionPopupWindowHelp);
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        if (ENR.LIZ()) {
            C54229LQb v3 = v3();
            if (v3 != null) {
                v3.LIZ();
            }
            x3().onResume();
            return;
        }
        C54234LQg c54234LQg = this.LJLJLJ;
        if (c54234LQg == null) {
            return;
        }
        c54234LQg.LIZ();
        c54234LQg.LJIIL(EnumC54238LQk.RESUME);
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final void s4() {
        if (ENR.LIZ()) {
            C54229LQb v3 = v3();
            if (v3 != null) {
                v3.LIZLLL(false);
                return;
            }
            return;
        }
        C54234LQg c54234LQg = this.LJLJLJ;
        if (c54234LQg == null) {
            return;
        }
        c54234LQg.LJII(false);
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final void H(ScrollSwitchStateManager stateManager) {
        o.LJIIIZ(stateManager, "stateManager");
        if (ENR.LIZ()) {
            C54229LQb v3 = v3();
            if (v3 != null) {
                v3.LJI(stateManager);
                return;
            }
            return;
        }
        C54234LQg c54234LQg = this.LJLJLJ;
        if (c54234LQg == null) {
            return;
        }
        if (!o.LJ("NOTIFICATION", c54234LQg.LJ.nv0())) {
            TabChangeManager.jv0(c54234LQg.LJ, "NOTIFICATION", true, 26);
            IWF.LJJLIIIIJ().LJIILJJIL();
            C56692Kj.LIZ().LIZIZ();
            O5Y.LJJIZ(c54234LQg.LIZJ.mo49getActivity());
            stateManager.tv0(false);
            AbsFragment absFragment = c54234LQg.LIZJ;
            o.LJII(absFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainPageFragment");
            ((MainPageFragment) absFragment).qQ(true);
            C38987FRv.LJI(LSC.NOTICE);
        }
        c54234LQg.LIZLLL.LIZIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC54059LJn
    public final void W2(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        LR1 lr1 = this.LJLJJLL;
        if (lr1 != null) {
            lr1.LIZIZ();
        }
        x3().LIZLLL();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC54059LJn
    public final void onNewIntent(Intent intent) {
        try {
            boolean booleanExtra = intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", false);
            boolean booleanExtra2 = intent.getBooleanExtra("extra.from.shoutouts.opt.out", false);
            if (!booleanExtra && !booleanExtra2) {
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                if (LLJJIJIIJIL == null) {
                    LLJJIJIIJIL = "";
                }
                if (LLJJIJIIJIL.length() > 0) {
                    if (ENR.LIZ()) {
                        x3().onReset();
                    } else {
                        C54234LQg c54234LQg = this.LJLJLJ;
                        if (c54234LQg != null) {
                            c54234LQg.LJ();
                        }
                    }
                }
            }
        } catch (Exception e) {
            C36922EeM.LJ(e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View view2;
        LR1 lr1;
        InterfaceC54232LQe interfaceC54232LQe;
        ScrollSwitchStateManager A3;
        MainAnimViewModel mainAnimViewModel;
        C54229LQb v3;
        View view3;
        ScrollSwitchStateManager A32;
        FeedPanelStateViewModel.DialogStateLiveData dialogStateLiveData;
        FeedPanelStateViewModel.DialogStateLiveData dialogStateLiveData2;
        FeedPanelStateViewModel.DialogStateLiveData dialogStateLiveData3;
        View view4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.gc8);
        InterfaceC54232LQe interfaceC54232LQe2 = null;
        if (C53320KwG.LIZIZ()) {
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null && (findViewById = LIZ.findViewById(R.id.gbw)) != null) {
                findViewById.setVisibility(0);
            } else {
                findViewById = null;
            }
        }
        this.LJLIL = findViewById;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.hvw);
        View LIZIZ = a.LJIIL().LIZIZ(view);
        viewGroup.addView(LIZIZ);
        if (LIZIZ instanceof InterfaceC54232LQe) {
            interfaceC54232LQe2 = (InterfaceC54232LQe) LIZIZ;
        }
        this.LJLJJL = interfaceC54232LQe2;
        if (!ENR.LIZ()) {
            this.LJLJJLL = new LR1(C212428Vi.LIZ(this));
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL instanceof AmeBaseFragment) {
            AmeBaseFragment ameBaseFragment = (AmeBaseFragment) LIZLLL;
            InterfaceC54232LQe interfaceC54232LQe3 = this.LJLJJL;
            if (interfaceC54232LQe3 != null && (view4 = this.LJLIL) != null) {
                this.LJLJL = new SafeInfoNoticePopupWindowHelp(ameBaseFragment, new LRQ(this), interfaceC54232LQe3, view4, C3());
            }
        }
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if ((LIZLLL2 instanceof Fragment) && (view3 = LIZLLL2.getView()) != null && (A32 = A3()) != null) {
            this.LJLJLLL = new FissionPopupWindowHelp(new LRR(this), LIZLLL2, view3, A32);
            view3.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS60S0200000_9(view3, this, 5));
            FissionPopupWindowHelp fissionPopupWindowHelp = this.LJLJLLL;
            if (fissionPopupWindowHelp != null) {
                FeedPanelStateViewModel feedPanelStateViewModel = (FeedPanelStateViewModel) ViewModelProviders.of(fissionPopupWindowHelp.LJLJI.requireActivity()).get(FeedPanelStateViewModel.class);
                fissionPopupWindowHelp.LJLJLJ = feedPanelStateViewModel;
                if (feedPanelStateViewModel != null && (dialogStateLiveData3 = feedPanelStateViewModel.LJLJJI) != null) {
                    dialogStateLiveData3.observe(fissionPopupWindowHelp.LJLJI, new AObserverS77S0100000_9(fissionPopupWindowHelp, 138));
                }
                FeedPanelStateViewModel feedPanelStateViewModel2 = fissionPopupWindowHelp.LJLJLJ;
                if (feedPanelStateViewModel2 != null && (dialogStateLiveData2 = feedPanelStateViewModel2.LJLJI) != null) {
                    dialogStateLiveData2.observe(fissionPopupWindowHelp.LJLJI, new AObserverS77S0100000_9(fissionPopupWindowHelp, 139));
                }
                FeedPanelStateViewModel feedPanelStateViewModel3 = fissionPopupWindowHelp.LJLJLJ;
                if (feedPanelStateViewModel3 != null && (dialogStateLiveData = feedPanelStateViewModel3.LJLJJL) != null) {
                    dialogStateLiveData.observe(fissionPopupWindowHelp.LJLJI, new AObserverS77S0100000_9(fissionPopupWindowHelp, UserLevelGeckoUpdateSetting.DEFAULT));
                }
            }
        }
        if (ENR.LIZ()) {
            Fragment LIZLLL3 = C212428Vi.LIZLLL(this);
            if (LIZLLL3 instanceof AbsFragment) {
                AbsFragment absFragment = (AbsFragment) LIZLLL3;
                ScrollSwitchStateManager A33 = A3();
                if (A33 != null && (v3 = v3()) != null) {
                    x3().LIZJ(absFragment, A33, v3);
                }
            }
        } else {
            Fragment LIZLLL4 = C212428Vi.LIZLLL(this);
            if (LIZLLL4 instanceof AbsFragment) {
                AbsFragment absFragment2 = (AbsFragment) LIZLLL4;
                ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
                if (LIZ2 != null && (view2 = this.LJLIL) != null && (lr1 = this.LJLJJLL) != null && (interfaceC54232LQe = this.LJLJJL) != null && (A3 = A3()) != null && (mainAnimViewModel = (MainAnimViewModel) this.LJLJJI.getValue()) != null) {
                    this.LJLJLJ = new C54234LQg(LIZ2, view2, absFragment2, lr1, C3(), interfaceC54232LQe, A3, mainAnimViewModel);
                }
            }
            C54234LQg c54234LQg = this.LJLJLJ;
            if (c54234LQg != null) {
                if (((RBX) HG3.LJIILL()).isLogin()) {
                    c54234LQg.LJIIJ();
                } else {
                    c54234LQg.LJIIIIZZ = new C54241LQn(c54234LQg);
                    HG3.LJIIL();
                    IAccountService iAccountService = HG3.LJLJL;
                    C54241LQn c54241LQn = c54234LQg.LJIIIIZZ;
                    o.LJI(c54241LQn);
                    iAccountService.LJIILJJIL(c54241LQn);
                }
            }
        }
        if (C54305LSz.LIZLLL() || C54305LSz.LJ()) {
            Fragment LIZLLL5 = C212428Vi.LIZLLL(this);
            if (LIZLLL5 instanceof MainPageFragment) {
                this.LJLLILLLL = new LQU((MainPageFragment) LIZLLL5, C3(), v3(), this.LJLJLJ);
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility
    public final void xI(boolean z) {
        if (ENR.LIZ()) {
            x3().LJ(z);
            x3().LIZ();
            return;
        }
        LR1 lr1 = this.LJLJJLL;
        if (lr1 == null) {
            return;
        }
        lr1.LJIIL = z;
        lr1.LJIILIIL = false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC54059LJn
    public final void LLLLZLLIL(String str, Fragment fragment, Fragment fragment2) {
        SafeInfoNoticePopupWindowHelp safeInfoNoticePopupWindowHelp;
        if (Z8A.LIZIZ.isI18nMyProfileFragmentV2(fragment)) {
            Boolean LIZ = SharePrefCache.inst().getEnableProfileActivityLink().LIZ();
            o.LJIIIIZZ(LIZ, "inst().enableProfileActivityLink.cache");
            if (LIZ.booleanValue()) {
                if (ENR.LIZ()) {
                    C54229LQb v3 = v3();
                    if (v3 != null) {
                        v3.LIZIZ();
                    }
                } else {
                    C54234LQg c54234LQg = this.LJLJLJ;
                    if (c54234LQg != null) {
                        c54234LQg.LJFF();
                    }
                }
            }
        }
        if (fragment == null || (safeInfoNoticePopupWindowHelp = this.LJLJL) == null || !((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        Keva repo = Keva.getRepo("account_security_keva_name");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("prior_to_safe_info_");
        if (C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ2, LIZ2, repo, false)) {
            safeInfoNoticePopupWindowHelp.LIZ();
            return;
        }
        if (!(fragment instanceof MainFragment)) {
            Keva repo2 = Keva.getRepo("account_security_keva_name");
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("last_time_fetch_safe_info_");
            LIZ3.append(((RBX) HG3.LJIILL()).getCurUserId());
            long j = repo2.getLong(X1D.LIZIZ(LIZ3), 0L);
            if (j == 0 || j < System.currentTimeMillis()) {
                SafeInfoNoticeApi.LIZ.getClass();
                C55673Lt7.LIZ().safeInfoNoticeMsg(((RBY) HG3.LJIILL()).isChildrenMode()).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZ(new LRT(safeInfoNoticePopupWindowHelp));
                return;
            } else {
                safeInfoNoticePopupWindowHelp.LIZIZ(false);
                return;
            }
        }
        safeInfoNoticePopupWindowHelp.LIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC54059LJn
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        FissionPopupWindowHelp fissionPopupWindowHelp;
        if (o.LJ("USER", str) && (fissionPopupWindowHelp = this.LJLJLLL) != null) {
            fissionPopupWindowHelp.LIZ();
        }
    }
}
