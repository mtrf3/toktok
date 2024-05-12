package X;

import Y.ACallableS112S0100000_9;
import Y.AObserverS77S0100000_9;
import Y.IDgS349S0100000_9;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IPasskeyPopUpHelper;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.popup.popuphelper.PasskeyPopUpHelper;
import com.ss.android.ugc.aweme.account.popup.popuphelper.SyncNicknameAndUsernamePopUpHelper;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.experiment.HomepageExperimentServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2;
import com.ss.android.ugc.aweme.services.external.IEnterFromService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LN0 implements InterfaceC56322M8o {
    public final Context LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final boolean LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public Fragment LJLJLJ;
    public boolean LJLJLLL;
    public String LJLL;
    public final InterfaceC26157AOj LJLLI;
    public boolean LJLLILLLL;

    public final void LIZLLL() {
        this.LJLJLLL = true;
        TabChangeManager LIZ = C116694i1.LIZ(this.LJLILLLLZI);
        LJ();
        LIZIZ(LIZ.nv0(), this.LJLJLLL);
        if (C53765L8f.LJIIJJI()) {
            Bundle LIZ2 = C0H1.LIZ("enter_from", "click_top_icon");
            LIZ2.putBoolean("isSmoothScroll", true);
            ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
            if (activityC45651qj != null) {
                com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).Cv0(LIZ2, "USER");
            }
        } else {
            TabChangeManager.jv0(LIZ, "USER", true, 26);
        }
        LIZ(LIZ.mv0());
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return "profile";
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    public final void LJFF() {
        ActivityC45651qj LJJIFFI;
        ActivityC45651qj activityC45651qj;
        Fragment LIZ;
        ActivityC45651qj activityC45651qj2 = this.LJLILLLLZI;
        if (activityC45651qj2 != null && (LJJIFFI = C45804HyK.LJJIFFI(activityC45651qj2)) != null && (activityC45651qj = this.LJLILLLLZI) != null && (LIZ = LKR.LIZ(activityC45651qj)) != null) {
            SyncNicknameAndUsernamePopUpHelper.LJ().LIZLLL(LJJIFFI, LIZ, LN3.LJLIL);
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        if (activityC45651qj != null) {
            return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
        }
        return null;
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        if (activityC45651qj != null && (lifecycle = activityC45651qj.getLifecycle()) != null && (currentState = lifecycle.getCurrentState()) != null) {
            return currentState.isAtLeast(Lifecycle.State.RESUMED);
        }
        return false;
    }

    public final void LJ() {
        IAccountUserService LJIILL;
        String enterFrom;
        IEnterFromService enterFromService = AVExternalServiceImpl.LIZ().enterFromService();
        if (!C53765L8f.LJIIJJI() && (LJIILL = HG3.LJIILL()) != null && !((RBX) LJIILL).isLogin() && ((Boolean) this.LJLJJI.getValue()).booleanValue()) {
            String enterFrom2 = enterFromService.getEnterFrom();
            if (enterFrom2 != null) {
                int hashCode = enterFrom2.hashCode();
                if (hashCode != -1382453013) {
                    if (hashCode != 2223327) {
                        if (hashCode == 2614219 && enterFrom2.equals("USER")) {
                            enterFrom = "personal_homepage";
                            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLIL);
                            C40883G2t c40883G2t = new C40883G2t();
                            c40883G2t.LIZJ("show_login_page_first", this.LJLJJL);
                            J9P.LIZIZ(LJJIFFI, enterFrom, "click_profile_tab", (Bundle) c40883G2t.LIZ, new IDgS349S0100000_9(this, 12));
                        }
                    } else if (enterFrom2.equals("HOME")) {
                        enterFrom = "homepage_hot";
                        ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(this.LJLIL);
                        C40883G2t c40883G2t2 = new C40883G2t();
                        c40883G2t2.LIZJ("show_login_page_first", this.LJLJJL);
                        J9P.LIZIZ(LJJIFFI2, enterFrom, "click_profile_tab", (Bundle) c40883G2t2.LIZ, new IDgS349S0100000_9(this, 12));
                    }
                } else if (enterFrom2.equals("NOTIFICATION")) {
                    enterFrom = "message";
                    ActivityC45651qj LJJIFFI22 = C45804HyK.LJJIFFI(this.LJLIL);
                    C40883G2t c40883G2t22 = new C40883G2t();
                    c40883G2t22.LIZJ("show_login_page_first", this.LJLJJL);
                    J9P.LIZIZ(LJJIFFI22, enterFrom, "click_profile_tab", (Bundle) c40883G2t22.LIZ, new IDgS349S0100000_9(this, 12));
                }
            }
            enterFrom = enterFromService.getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            ActivityC45651qj LJJIFFI222 = C45804HyK.LJJIFFI(this.LJLIL);
            C40883G2t c40883G2t222 = new C40883G2t();
            c40883G2t222.LIZJ("show_login_page_first", this.LJLJJL);
            J9P.LIZIZ(LJJIFFI222, enterFrom, "click_profile_tab", (Bundle) c40883G2t222.LIZ, new IDgS349S0100000_9(this, 12));
        }
        enterFromService.setEnterFrom("USER");
        C54362LVe.LJIJJ(false);
        C46538IOg.LIZ = false;
        C56662Kg.LIZ().LIZLLL = false;
        C56662Kg.LIZ().LJIIIZ = false;
        C44938HkM.LJ = null;
    }

    public LN0(Context context) {
        boolean z;
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        this.LJLILLLLZI = LJJIFFI;
        this.LJLJI = C221108m2.LIZIZ(C53973LGf.INSTANCE);
        this.LJLJJI = C221108m2.LIZIZ(C53972LGe.LJLIL);
        if (C53260KvI.LIZIZ || PrevLoginPlatformService.LJIIL().LJI()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJL = z;
        this.LJLJL = true;
        HG3.LJIIL();
        this.LJLLI = HG3.LJLJL.LJIIL();
        LN1 ln1 = new LN1(this);
        if (C53765L8f.LJIIJJI() && LJJIFFI != null) {
            com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI).hv0("USER", ln1);
            ScrollSwitchStateManager LIZ = C84193Sd.LIZ(LJJIFFI);
            AObserverS77S0100000_9 aObserverS77S0100000_9 = new AObserverS77S0100000_9(this, 99);
            LIZ.getClass();
            LIZ.LLFF.observe(LJJIFFI, aObserverS77S0100000_9);
        }
        this.LJLLILLLL = true;
    }

    public final void LIZ(Fragment fragment) {
        ScrollSwitchStateManager scrollSwitchStateManager;
        LifecycleCoroutineScope lifecycleScope;
        Boolean bool;
        boolean z;
        IMainPageFragment LJI = MainPageFragmentImpl.LJI();
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        if (activityC45651qj != null) {
            scrollSwitchStateManager = C84193Sd.LIZ(activityC45651qj);
        } else {
            scrollSwitchStateManager = null;
        }
        if (!o.LJ("USER", this.LJLJJLL)) {
            ActivityC45651qj activityC45651qj2 = this.LJLILLLLZI;
            if (activityC45651qj2 != null) {
                if (HomepageExperimentServiceImpl.LIZIZ().LIZ() && o.LJ(this.LJLJJLL, "HOME") && LKR.LIZIZ(activityC45651qj2, "page_profile")) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            Handler handler = (Handler) this.LJLJI.getValue();
            if (o.LJ(bool, Boolean.TRUE) && handler != null) {
                handler.post(new RunnableC53979LGl(this));
            }
            ActivityC45651qj activityC45651qj3 = this.LJLILLLLZI;
            if (activityC45651qj3 != null) {
                LJI.LJFF(activityC45651qj3);
            }
            IWF.LJJLIIIIJ().LJIILJJIL();
            C56692Kj.LIZ().LIZIZ();
            MainPageFragmentImpl.LJI().t9(true);
            ActivityC45651qj activityC45651qj4 = this.LJLILLLLZI;
            if (activityC45651qj4 != null) {
                MainPageFragmentImpl.LJI().LIZIZ(activityC45651qj4);
            }
            if (C53765L8f.LJIIJJI()) {
                if (scrollSwitchStateManager != null) {
                    scrollSwitchStateManager.tv0(true);
                }
            } else if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.tv0(false);
            }
            if (fragment instanceof I18nMyProfileFragmentV2) {
                ((I18nMyProfileFragmentV2) fragment).dm();
            }
            if (!((RBX) HG3.LJIILL()).isLogin() && C34037DXl.LIZ() && this.LJLILLLLZI != null) {
                PopupManager.LJIIL(new LN2(this, this.LJLILLLLZI));
            }
        }
        if (fragment instanceof InterfaceC59608NaO) {
            fragment.setUserVisibleHint(true);
        }
        if (C54362LVe.LJIIZILJ(4)) {
            C54362LVe.LIZIZ(4);
        }
        C10K.LIZIZ(new ACallableS112S0100000_9(this, 30), FMX.LIZIZ(), null);
        C38987FRv.LJI(LSC.PROFILE);
        LJI.m1();
        if (C59522Vg.LIZ()) {
            ActivityC45651qj activityC45651qj5 = this.LJLILLLLZI;
            if (activityC45651qj5 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(activityC45651qj5)) != null) {
                XKX.LIZLLL(lifecycleScope, C78613UtF.LIZJ, null, new C55717Ltp(this, null), 2);
            }
            if (this.LJLLILLLL) {
                this.LJLLILLLL = false;
            } else if (this.LJLLI.isUpsell2svProfileHVAExperimentTreatment() && this.LJLLI.shouldShowUpsell2svProfileHVAPopUp(this.LJLILLLLZI)) {
                HG3.LJIIL();
                HG3.LJLJL.LJIIL().callUserSettingsBeforePopUpShow(this.LJLILLLLZI, LN6.LJLIL);
            } else if (PasskeyPopUpHelper.LJ().LIZIZ()) {
                IPasskeyPopUpHelper LJ = PasskeyPopUpHelper.LJ();
                o.LJIIIIZZ(LJ, "get().getService(IPasskeyPopUpHelper::class.java)");
                LJ.LIZJ(this.LJLILLLLZI, null);
            } else if (SyncNicknameAndUsernamePopUpHelper.LJ().LIZIZ()) {
                LJFF();
            } else if (IMService.createIIMServicebyMonsterPlugin(false).getImMafService().LJII()) {
                IMService.createIIMServicebyMonsterPlugin(false).getImMafService().LIZIZ(this.LJLIL, "personal_homepage", this);
            } else if (C85528XhU.LIZIZ()) {
                C85528XhU.LIZLLL("personal_homepage", LN7.LJLIL, LN8.LJLIL);
            }
        } else {
            C77266UUc c77266UUc = C77266UUc.LIZIZ;
            UQF LJJIJIIJIL = c77266UUc.LJJIJIIJIL(2, false);
            if (LJJIJIIJIL.LJLIL || LJJIJIIJIL.LJLILLLLZI) {
                Z8A.LIZIZ.updateProfilePermission(true);
                C54149LMz.LIZ(c77266UUc, LJJIJIIJIL, "personal_homepage", this.LJLIL, null, 48);
            } else if (this.LJLLILLLL) {
                this.LJLLILLLL = false;
            } else if (this.LJLLI.isUpsell2svProfileHVAExperimentTreatment() && this.LJLLI.shouldShowUpsell2svProfileHVAPopUp(this.LJLILLLLZI)) {
                HG3.LJIIL();
                HG3.LJLJL.LJIIL().callUserSettingsBeforePopUpShow(this.LJLILLLLZI, LN9.LJLIL);
            } else if (PasskeyPopUpHelper.LJ().LIZIZ()) {
                IPasskeyPopUpHelper LJ2 = PasskeyPopUpHelper.LJ();
                o.LJIIIIZZ(LJ2, "get().getService(IPasskeyPopUpHelper::class.java)");
                LJ2.LIZJ(this.LJLILLLLZI, null);
            } else if (SyncNicknameAndUsernamePopUpHelper.LJ().LIZIZ()) {
                LJFF();
            } else if (IMService.createIIMServicebyMonsterPlugin(false).getImMafService().LJII()) {
                IMService.createIIMServicebyMonsterPlugin(false).getImMafService().LIZIZ(this.LJLIL, "personal_homepage", this);
            } else if (C85528XhU.LIZIZ()) {
                C85528XhU.LIZLLL("personal_homepage", LNA.LJLIL, LNB.LJLIL);
            }
        }
        C2U8.LIZ(new C46141I8z());
        IMService.createIIMServicebyMonsterPlugin(false).getImChatSettingsService().LJI(this.LJLIL, "personal_homepage", this);
    }

    public final void LIZIZ(String str, boolean z) {
        ScrollSwitchStateManager scrollSwitchStateManager;
        String str2;
        IMainPageFragment LJI = MainPageFragmentImpl.LJI();
        if (!C53765L8f.LJIIJJI() || z) {
            this.LJLL = MainPageFragmentImpl.LJI().LJJLIIIJJI();
        }
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        if (activityC45651qj != null) {
            scrollSwitchStateManager = C84193Sd.LIZ(activityC45651qj);
        } else {
            scrollSwitchStateManager = null;
        }
        if (!o.LJ("USER", str)) {
            if (MFE.LIZJ) {
                C54502LaE.LIZ("my_profile");
                C56483MEt.LIZ(new C173376rF(), this.LJLL, true, "homepage_self_profile");
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!C237259Sv.LJFF) {
                C237259Sv.LJ = currentTimeMillis;
            }
            if (AXO.LIZ()) {
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C237419Tl(null), 3);
            }
            C10K.LIZIZ(new AX7(this, str, z), FMX.LIZIZ(), null);
            if (scrollSwitchStateManager != null && (str2 = scrollSwitchStateManager.LJLZ) != null) {
                LJI.r2(str2, "USER");
            }
        }
    }

    public final void LIZJ(Fragment fragment, boolean z, boolean z2) {
        if (!C53765L8f.LJIIJJI() || !(fragment instanceof I18nMyProfileFragmentV2)) {
            return;
        }
        if (z2 && this.LJLJL) {
            this.LJLJL = false;
            return;
        }
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        if (activityC45651qj == null) {
            return;
        }
        if (!z) {
            this.LJLL = MainPageFragmentImpl.LJI().LJJLIIIJJI();
            this.LJLJLJ = fragment;
            this.LJLJJLL = C84193Sd.LIZ(activityC45651qj).LJLZ;
            TabChangeManager LIZ = C116694i1.LIZ(activityC45651qj);
            LIZ.LJLJJL = "USER";
            LIZ.LJLJI = true;
            TabChangeManager LIZ2 = C116694i1.LIZ(activityC45651qj);
            LIZ2.getClass();
            o.LJIIIZ(fragment, "fragment");
            LIZ2.LJLJJI = fragment;
            LIZ2.LJLILLLLZI = true;
            return;
        }
        if (o.LJ(this.LJLJJLL, "HOME")) {
            C27740Aue.LJIIIIZZ(activityC45651qj);
            C244389iU.LIZ(activityC45651qj);
        }
        TabChangeManager LIZ3 = C116694i1.LIZ(activityC45651qj);
        LIZ3.nv0();
        LIZ3.LJLJI = false;
        LIZ3.LJLJJL = null;
        this.LJLJLJ = null;
        this.LJLJJLL = null;
        TabChangeManager LIZ4 = C116694i1.LIZ(activityC45651qj);
        LIZ4.getClass();
        o.LJIIIZ(fragment, "fragment");
        LIZ4.LJLILLLLZI = false;
        LIZ4.LJLJJI = null;
    }
}
