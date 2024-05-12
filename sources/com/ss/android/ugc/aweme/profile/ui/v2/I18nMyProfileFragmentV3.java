package com.ss.android.ugc.aweme.profile.ui.v2;

import X.APY;
import X.AVK;
import X.AVZ;
import X.AWA;
import X.AWB;
import X.AWD;
import X.AWF;
import X.AWJ;
import X.AWK;
import X.AWL;
import X.AWM;
import X.AWO;
import X.AWP;
import X.AWR;
import X.AWU;
import X.AWV;
import X.AWW;
import X.AWX;
import X.AWY;
import X.AX6;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C107794Kx;
import X.C116694i1;
import X.C12460eI;
import X.C162476Zf;
import X.C16880lQ;
import X.C18000nE;
import X.C184077Kh;
import X.C199097rd;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C221018lt;
import X.C221108m2;
import X.C235079Kl;
import X.C237049Sa;
import X.C237259Sv;
import X.C237399Tj;
import X.C237409Tk;
import X.C244699iz;
import X.C255199zv;
import X.C255209zw;
import X.C26155AOh;
import X.C26331AVb;
import X.C26354AVy;
import X.C26356AWa;
import X.C27740Aue;
import X.C2NU;
import X.C36636EZk;
import X.C38350F3i;
import X.C48841JEv;
import X.C4LD;
import X.C52348Kga;
import X.C53487Kyx;
import X.C53765L8f;
import X.C54081LKj;
import X.C54082LKk;
import X.C55096Ljo;
import X.C55230Lly;
import X.C5S1;
import X.C62822Ol8;
import X.C62825OlB;
import X.C62827OlD;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72713SgH;
import X.C72818Shy;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78472Uqy;
import X.C78926UyI;
import X.C78999UzT;
import X.C84193Sd;
import X.C84763XOl;
import X.C86298Xtu;
import X.C8VC;
import X.C8VV;
import X.C8W0;
import X.C90863hS;
import X.C9IJ;
import X.C9IM;
import X.C9N1;
import X.C9N2;
import X.C9VE;
import X.C9WF;
import X.EnumC235129Kq;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC244909jK;
import X.InterfaceC34471Wx;
import X.InterfaceC53971LGd;
import X.InterfaceC56322M8o;
import X.InterfaceC59608NaO;
import X.InterfaceC65784Pro;
import X.InterfaceC72822Si2;
import X.InterfaceC88472Yns;
import X.JG5;
import X.LKR;
import X.OHQ;
import X.QD3;
import X.QX2;
import X.RBX;
import X.T16;
import X.XKX;
import Y.AObserverS72S0100000_4;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceKillswitch;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.hox.Hox;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2;
import com.ss.android.ugc.aweme.setting.services.AppUpdateService;
import com.ss.android.ugc.aweme.setting.services.IAppUpdateService;
import com.ss.android.ugc.profile.platform.base.assemble.ProfileRootBaseComponent;
import com.ss.android.ugc.profile.platform.base.assemble.ProfileRootComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS13S0102000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.AqS6S0010000_1;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import ujb.s;
import yq4.a;

/* loaded from: classes5.dex */
public final class I18nMyProfileFragmentV3 extends I18nAbsProfileFragmentV2 implements InterfaceC34471Wx, InterfaceC59608NaO, InterfaceC53971LGd, InterfaceC56322M8o, InterfaceC72822Si2, MineProfileAbility {
    public String LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public int LLFII;
    public View LLI;
    public C62825OlB LLIFFJFJJ;
    public final C214298b3 LLII;
    public MyProfileGuideWidgetV2 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public AWU LLIIIL;
    public final Map<Integer, View> LLIIIZ = new LinkedHashMap();
    public boolean LLD = true;
    public final C73318Sq2 LLFZ = new C73318Sq2();

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final int Jl() {
        return R.layout.c80;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility
    public final boolean L7() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final boolean Nl() {
        return true;
    }

    @Override // X.InterfaceC34471Wx, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b8727";
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return "profile";
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "MainTabPage";
    }

    public I18nMyProfileFragmentV3() {
        C65776Prg LIZ = C65352Pkq.LIZ(ProfilePlatformViewModel.class);
        this.LLII = new C214298b3(LIZ, new AqS154S0100000_4(LIZ, 707), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, AWP.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LLIIIILZ = C221108m2.LIZIZ(AWR.LJLIL);
        this.LLIIIJ = C221108m2.LIZIZ(AWK.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.MineProfileAbility
    public final void LJI() {
        AWU awu = this.LLIIIL;
        if (awu != null) {
            awu.LJI();
            return;
        }
        if (mo49getActivity() == null) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && mo49getActivity.isFinishing()) {
            return;
        }
        AX6.LIZ(this);
    }

    public final void cm() {
        Intent intent;
        ProfileViewModel profileViewModel = this.LJLLLL;
        profileViewModel.getClass();
        profileViewModel.setState(new AqS170S0100000_4((AWV) null, 960));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null) {
            intent.putExtra("aivatar_share_path", (String) null);
        }
    }

    public final ProfilePlatformViewModel em() {
        return (ProfilePlatformViewModel) this.LLII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("personal_homepage");
        o.LJIIIIZZ(analysis, "Analysis().setLabelName(….Label.PERSONAL_HOMEPAGE)");
        return analysis;
    }

    @Override // X.InterfaceC53971LGd
    public final String getEnterFrom() {
        if (this.LJLJL == 0) {
            return "personal_homepage";
        }
        return "personal_collection";
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return C18000nE.LIZ(this);
    }

    public final AWV dm() {
        Intent intent;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null) {
            return new AWV(C16880lQ.LLJJIJIIJIL(intent, "aivatar_share_path"), C16880lQ.LLJJIJIIJIL(intent, "image_uri"), C16880lQ.LLJJIJIIJIL(intent, "image_url"), C16880lQ.LLJJIJIIJIL(intent, "origin_no_crop_avatar_path"), C16880lQ.LLJJIJIIJIL(intent, "uncrop_avatar_path"));
        }
        return null;
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        if (getContext() == null) {
            return null;
        }
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        return C54081LKj.LIZ(requireContext, this);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final void initData() {
        Intent intent;
        Intent intent2;
        int i;
        Integer LJJIL;
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("enter_from");
            this.LLF = string;
            ProfileViewModel profileViewModel = this.LJLLLL;
            if (profileViewModel != null) {
                profileViewModel.setState(new AqS29S1000000_4(string, 25));
            }
            ProfilePlatformViewModel em = em();
            String str = this.LLF;
            em.getClass();
            em.setState(new AqS29S1000000_4(str, 43));
            String string2 = arguments.getString("profile_from_scene");
            if (string2 != null && (LJJIL = C38350F3i.LJJIL(string2)) != null) {
                i = LJJIL.intValue();
            } else {
                i = 0;
            }
            this.LLFII = i;
            arguments.getIntArray("traffic_source_list");
        }
        this.LJLL = ((RBX) HG3.LJIILL()).getCurUser();
        super.initData();
        if (!SharePrefCache.inst().getHasEnterBindPhone().LIZ().booleanValue()) {
            ((RBX) HG3.LJIILL()).queryUser();
        }
        if (AVK.LIZJ()) {
            try {
                C78999UzT.LJFF(AbstractC73672Svk.LJIIJ(AVZ.LJLIL).LJJL(T16.LIZ()).LJJJLIIL(C26331AVb.LJLIL, AWD.LJLIL), this.LLFZ);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        if (arguments == null || !arguments.getBoolean("delay_profile_loading")) {
            ProfilePlatformViewModel.lv0(em(), this.LLFII, EnumC235129Kq.CHANGE_TAB, "initData", 1);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null && C16880lQ.LLJJIJIIJIL(intent, "aivatar_share_path") != null) {
            AWV dm = dm();
            ProfileViewModel profileViewModel2 = this.LJLLLL;
            profileViewModel2.getClass();
            profileViewModel2.setState(new AqS170S0100000_4(dm, 960));
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null && (intent2 = mo49getActivity2.getIntent()) != null) {
                intent2.putExtra("aivatar_share_path", (String) null);
            }
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            if (LKR.LIZJ(requireActivity, "USER")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C62825OlB c62825OlB;
        super.onDestroy();
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), MineProfileAbility.class, null);
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), ProfileBaseAbility.class, null);
        EventBus.LIZJ().LJIJ(this);
        C72818Shy.LJII("MUSIC_ARTIST_CERTIFICATION_SUBMIT", this);
        C72818Shy.LJII("HIDE_ACCOUNT_WARNING_SUCCESS", this);
        this.LLFZ.dispose();
        JG5.LIZ.postValue("");
        if (C4LD.LIZIZ.LJIILIIL() && (c62825OlB = this.LLIFFJFJJ) != null) {
            c62825OlB.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLIIIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C78999UzT.LJFF(AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJJIJIL(a.LJIJJ()), C84763XOl.LJFF(), AWJ.LJLIL).LJJL(T16.LIZ()).LJJJLIIL(AWF.LJLIL, AWA.LJLIL), this.LLFZ);
        if (this.LLFF) {
            Xl();
        }
        C62825OlB.LJLLI = false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        CommonPageFragment commonPageFragment;
        Intent intent;
        Bundle LLJJIJI;
        String string;
        Integer LJJIL;
        Intent intent2;
        String LLJJIJIIJIL;
        Intent intent3;
        Intent intent4;
        Bundle LLJJIJI2;
        Boolean bool;
        Intent intent5;
        Intent intent6;
        ActivityC45651qj mo49getActivity;
        Intent intent7;
        ActivityC45651qj mo49getActivity2;
        Fragment mv0;
        ScrollSwitchStateManager LIZ;
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        if (mo49getActivity3 != null && (LIZ = C84193Sd.LIZ(mo49getActivity3)) != null) {
            commonPageFragment = LIZ.kv0();
        } else {
            commonPageFragment = null;
        }
        if (commonPageFragment != null && s.LJJJLZIJ(C16880lQ.LJLLJ(commonPageFragment.getClass()), "MainPageFragment", false) && (mo49getActivity2 = mo49getActivity()) != null) {
            if (C53765L8f.LJIIJJI()) {
                mv0 = LKR.LIZ(mo49getActivity2);
            } else {
                mv0 = C116694i1.LIZ(mo49getActivity2).mv0();
            }
            if (mv0 != null && (mv0 == this || mv0 == getParentFragment())) {
                C12460eI.LJIIIIZZ(this, null);
            }
        }
        super.onResume();
        C78999UzT.LJFF(AbstractC73672Svk.LJJIJIL(a.LJIJJ()).LJJL(T16.LIZ()).LJJJLIIL(AWO.LJLIL, AWB.LJLIL), this.LLFZ);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("delay_profile_loading")) {
            hm(AWL.ON_RESUME);
        }
        C62825OlB.LJLLI = true;
        this.LLD = false;
        if (C26356AWa.LIZ()) {
            if (!this.LJZ.booleanValue() && (mo49getActivity = mo49getActivity()) != null && (intent7 = mo49getActivity.getIntent()) != null && C16880lQ.LLJJIJIIJIL(intent7, "aivatar_share_path") != null) {
                AWV dm = dm();
                ActivityC45651qj mo49getActivity4 = mo49getActivity();
                if (mo49getActivity4 != null) {
                    MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.LLIIII;
                    if (myProfileGuideWidgetV2 != null) {
                        myProfileGuideWidgetV2.LJIJ();
                    }
                    AWW.LIZ(mo49getActivity4, dm, new AqS154S0100000_4(this, 706));
                }
            }
            ActivityC45651qj mo49getActivity5 = mo49getActivity();
            if (mo49getActivity5 != null && (intent6 = mo49getActivity5.getIntent()) != null) {
                bool = Boolean.valueOf(intent6.getBooleanExtra("aivatar_open_edit_profile", false));
            } else {
                bool = null;
            }
            if (o.LJ(bool, Boolean.TRUE)) {
                MyProfileGuideWidgetV2 myProfileGuideWidgetV22 = this.LLIIII;
                if (myProfileGuideWidgetV22 != null) {
                    myProfileGuideWidgetV22.LJIJ();
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "//profile_edit");
                buildRoute.withParam("aivatar_notif_permission", true);
                buildRoute.open();
                ActivityC45651qj mo49getActivity6 = mo49getActivity();
                if (mo49getActivity6 != null && (intent5 = mo49getActivity6.getIntent()) != null) {
                    intent5.putExtra("aivatar_open_edit_profile", false);
                }
            }
        }
        this.LJZ = Boolean.FALSE;
        ActivityC45651qj mo49getActivity7 = mo49getActivity();
        if (mo49getActivity7 != null && (intent = mo49getActivity7.getIntent()) != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null && (string = LLJJIJI.getString("profile_from_scene")) != null && (LJJIL = C38350F3i.LJJIL(string)) != null && LJJIL.intValue() == 1026) {
            ActivityC45651qj mo49getActivity8 = mo49getActivity();
            if (mo49getActivity8 != null && (intent4 = mo49getActivity8.getIntent()) != null && (LLJJIJI2 = C16880lQ.LLJJIJI(intent4)) != null) {
                LLJJIJI2.putString("profile_from_scene", null);
            }
            ((InterfaceC235069Kk) C8VC.LIZJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class))).hh(1026, EnumC235129Kq.CHANGE_TAB);
            ActivityC45651qj mo49getActivity9 = mo49getActivity();
            if (mo49getActivity9 != null && (intent2 = mo49getActivity9.getIntent()) != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent2, "shoot_from")) != null && LLJJIJIIJIL.length() != 0) {
                ActivityC45651qj mo49getActivity10 = mo49getActivity();
                if (mo49getActivity10 != null && (intent3 = mo49getActivity10.getIntent()) != null) {
                    intent3.removeExtra("shoot_from");
                }
                IProfileMusicTabService iProfileMusicTabService = (IProfileMusicTabService) this.LLIIIILZ.getValue();
                if (iProfileMusicTabService != null) {
                    iProfileMusicTabService.LJIIL(LLJJIJIIJIL);
                }
            }
        }
        C237259Sv.LIZIZ(System.currentTimeMillis(), "page_on_resume_complete_time");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        HG3.LJIILL().updateLeaveTime(System.currentTimeMillis());
        cm();
    }

    public final void refreshData() {
        if (!isActive() || this.LLD) {
            return;
        }
        mo49getActivity();
        if (C2NU.LIZ.LIZIZ()) {
            ProfilePlatformViewModel.lv0(em(), 0, null, "refreshData", 7);
            if (!C78472Uqy.LIZLLL() || WalletEntranceKillswitch.INSTANCE.isWalletEntranceKillswitchEnabled()) {
                return;
            }
            ((WalletCenter) ((IWalletService) this.LLIIIJ.getValue()).walletCenter()).LJIILJJIL();
            return;
        }
        C5S1 c5s1 = new C5S1(mo49getActivity());
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }

    @Override // X.InterfaceC59608NaO
    public final void LJJIJ(String str) {
        InterfaceC244909jK interfaceC244909jK = (InterfaceC244909jK) C8VC.LJI(this, C65352Pkq.LIZ(InterfaceC244909jK.class));
        if (interfaceC244909jK != null) {
            interfaceC244909jK.LJJIJ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.MineProfileAbility
    public final void LJJLJLI(User user) {
        this.LJLL = user;
    }

    @Override // X.InterfaceC59608NaO
    public final void LLIFFJFJJ(Aweme aweme) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new C9N1(this, aweme, null));
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.MineProfileAbility
    public final void LLILZIL(User user) {
        ProfileViewModel profileViewModel;
        if (!isViewValid() || (profileViewModel = this.LJLLLL) == null) {
            return;
        }
        if (user != null) {
            profileViewModel.Kv0(user);
        }
        String mUserId = this.LJLIL;
        o.LJIIIIZZ(mUserId, "mUserId");
        C62827OlD.LIZIZ(mUserId, "personal_homepage");
    }

    public final void LLLLILI(Bundle args) {
        o.LJIIIZ(args, "args");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        String str = "";
        if (curUserId == null) {
            curUserId = "";
        }
        C9IJ.LIZ(curUserId, "", true);
        String fromStart = args.getString("fromStart", "");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            str = Hox.LJLLI.LIZ(mo49getActivity).sv0("HOME");
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            Hox.LJLLI.LIZ(mo49getActivity2).sv0(str);
        }
        if (!o.LJ(fromStart, "MainPage")) {
            o.LJIIIIZZ(fromStart, "fromStart");
            if ((!C53765L8f.LJIIJJI() || !o.LJ(fromStart, "RootNode")) && !args.getBoolean(str)) {
                return;
            }
        }
        ProfilePlatformViewModel em = em();
        em.getClass();
        em.setState(new AqS6S0010000_1(true, 10));
        Xl();
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.LJLLL;
        if (analysisStayTimeFragmentComponent != null) {
            analysisStayTimeFragmentComponent.LJLJI = false;
            analysisStayTimeFragmentComponent.LIZIZ();
        }
        ProfileViewModel profileViewModel = this.LJLLLL;
        profileViewModel.getClass();
        profileViewModel.setState(new AqS9S0010000_4(true, 28));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2, "RootNode") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        if (r8.getBoolean(r5) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLZ(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            boolean r0 = X.C26356AWa.LIZ()
            if (r0 == 0) goto L16
            java.lang.String r0 = "tiktok_tool_aigc_avatar"
            boolean r0 = X.O3U.LJIILL(r0)
            if (r0 != 0) goto L16
            X.C26159AOl.LIZ()
        L16:
            r0 = 0
            X.C12460eI.LJIIIIZZ(r7, r0)
            java.lang.String r6 = "fromStart"
            java.lang.String r5 = ""
            java.lang.String r2 = r8.getString(r6, r5)
            X.1qj r1 = r7.mo49getActivity()
            if (r1 == 0) goto L34
            X.7b0 r0 = com.bytedance.hox.Hox.LJLLI
            com.bytedance.hox.Hox r1 = r0.LIZ(r1)
            java.lang.String r0 = "HOME"
            java.lang.String r5 = r1.sv0(r0)
        L34:
            X.1qj r1 = r7.mo49getActivity()
            if (r1 == 0) goto L43
            X.7b0 r0 = com.bytedance.hox.Hox.LJLLI
            com.bytedance.hox.Hox r0 = r0.LIZ(r1)
            r0.sv0(r5)
        L43:
            java.lang.String r0 = "MainPage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L5e
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r6)
            boolean r0 = X.C53765L8f.LJIIJJI()
            if (r0 == 0) goto L91
            java.lang.String r0 = "RootNode"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L91
        L5e:
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r2 = r7.em()
            r2.getClass()
            kotlin.jvm.internal.AqS6S0010000_1 r1 = new kotlin.jvm.internal.AqS6S0010000_1
            r0 = 10
            r1.<init>(r3, r0)
            r2.setState(r1)
            r7.Wl()
            com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent r2 = r7.LJLLL
            if (r2 == 0) goto L7e
            r2.LJLJI = r4
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJLIL = r0
        L7e:
            com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel r2 = r7.LJLLLL
            r2.getClass()
            kotlin.jvm.internal.AqS9S0010000_4 r1 = new kotlin.jvm.internal.AqS9S0010000_4
            r0 = 28
            r1.<init>(r3, r0)
            r2.setState(r1)
        L8d:
            X.C26343AVn.LJ()
            return
        L91:
            boolean r0 = r8.getBoolean(r5)
            if (r0 == 0) goto L8d
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV3.LLLLLLZ(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final void Ml(View view) {
        o.LJIIIZ(view, "view");
        super.Ml(view);
        km("init_update_component_tree", C237409Tk.LIZIZ("load_page_model_init_view"), view);
    }

    @Override // X.InterfaceC59608NaO
    public final void V1(boolean z) {
        ActivityC45651qj mo49getActivity;
        if (((Boolean) C52348Kga.LIZ.getValue()).booleanValue() && (mo49getActivity = mo49getActivity()) != null) {
            C27740Aue.LJIIIIZZ(mo49getActivity);
            if (z) {
                C27740Aue.LJII(mo49getActivity);
            } else {
                C237049Sa.LIZ(mo49getActivity);
            }
        }
        ProfilePlatformViewModel em = em();
        em.getClass();
        em.setState(new AqS9S0010000_4(z, 67));
    }

    public final void hm(AWL awl) {
        boolean z;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        this.LJLL = curUser;
        fm(awl, curUser);
        if (awl == AWL.TAB_CHANGE) {
            C26354AVy.LIZ.getClass();
            if (C26354AVy.LIZ()) {
                z = true;
                if (!((RBX) HG3.LJIILL()).shouldRefresh() || this.LLFFF || z) {
                    refreshData();
                }
                this.LLFFF = false;
            }
        }
        z = false;
        if (!((RBX) HG3.LJIILL()).shouldRefresh()) {
        }
        refreshData();
        this.LLFFF = false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final void initView(View view) {
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(view, "view");
        this.LLI = view;
        super.initView(view);
        if (C4LD.LIZIZ.LJIILIIL() && (mo49getActivity = mo49getActivity()) != null) {
            this.LLIFFJFJJ = C62827OlD.LIZ("personal_homepage", mo49getActivity, this);
        }
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        if (str != null && s.LJJJLZIJ(str, "/aweme/v1/user/profile/other/?", false)) {
            EventBus.LIZJ().LIZIZ(event);
            refreshData();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C237259Sv.LJIIIIZZ = "self";
        super.onCreate(bundle);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, MineProfileAbility.class, null);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, ProfileBaseAbility.class, null);
        this.LJLIL = ((RBX) HG3.LJIILL()).getCurUserId();
        this.LJLILLLLZI = ((RBX) HG3.LJIILL()).getCurSecUserId();
        EventBus.LIZJ().LJIILJJIL(this);
        C72818Shy.LIZLLL("MUSIC_ARTIST_CERTIFICATION_SUBMIT", this);
        C72818Shy.LIZLLL("HIDE_ACCOUNT_WARNING_SUCCESS", this);
        C53487Kyx.LIZIZ(AWY.PERSONAL_HOMEPAGE);
        ProfileViewModel profileViewModel = this.LJLLLL;
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 581);
        profileViewModel.getClass();
        JediViewModel.wv0(profileViewModel, C26155AOh.LJLIL, null, new AqS170S0100000_4(aqS170S0100000_4, (InterfaceC88472Yns<? super APY, C76800UCe>) 958), 2, null);
        JG5.LIZ.observe(this, new AObserverS72S0100000_4(this, 11));
        C237259Sv.LIZIZ(System.currentTimeMillis(), "page_on_create_complete_time");
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd jsEvent) {
        o.LJIIIZ(jsEvent, "jsEvent");
        if (o.LJ(jsEvent.LJLIL, "MUSIC_ARTIST_CERTIFICATION_SUBMIT")) {
            ProfilePlatformViewModel.lv0(em(), 1026, null, null, 13);
        }
        if (o.LJ(jsEvent.LJLIL, "HIDE_ACCOUNT_WARNING_SUCCESS")) {
            ProfilePlatformViewModel.lv0(em(), 0, null, null, 15);
        }
    }

    @QD3
    public final void onSaveUserDataEvent(C9VE c9ve) {
        this.LLFFF = true;
        if (isResumed()) {
            refreshData();
        }
    }

    @QD3
    public final void onShareCompleteEvent(C107794Kx event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLJJL, "personal_homepage") && !C62825OlB.LJLLL && !o.LJ(event.LJLJJI, "video_sticker")) {
            if (mo49getActivity() != null && this.LJLLILLLL != null) {
                C62825OlB.LJLLL = true;
                IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(mo49getActivity(), this.LJLLILLLL, event);
                return;
            }
            return;
        }
        if (o.LJ(event.LJLJJI, "aigc_avatar")) {
            if (mo49getActivity() == null || this.LJLLILLLL == null) {
                return;
            }
            IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(mo49getActivity(), this.LJLLILLLL, event);
            return;
        }
        if (!o.LJ(event.LJLJJL, "personal_homepage") || !o.LJ(event.LJLJJI, "video_sticker") || mo49getActivity() == null || this.LJLLILLLL == null) {
            return;
        }
        IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(mo49getActivity(), this.LJLLILLLL, event);
    }

    @QD3
    public final void onUpdateUserEvent(AWX event) {
        o.LJIIIZ(event, "event");
        this.LLFFF = false;
        fm(AWL.ON_UPDATE_EVENT, event.LJLIL);
    }

    @QD3
    public final void onUpdateUserSuccessEvent(C9WF event) {
        o.LJIIIZ(event, "event");
        HG3.LJIILL().queryUser();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        boolean z2;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-4160507435221651801");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/profile/ui/v2/I18nMyProfileFragmentV3", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/profile/ui/v2/I18nMyProfileFragmentV3", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        boolean z3 = this.LLFF;
        IAppUpdateService LIZLLL = AppUpdateService.LIZLLL();
        if (!z3 && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZLLL.LIZIZ(z2, this);
        this.LLFF = z;
        String mUserId = this.LJLIL;
        o.LJIIIIZZ(mUserId, "mUserId");
        C62827OlD.LIZIZ(mUserId, "personal_homepage");
        ProfilePlatformViewModel em = em();
        em.getClass();
        em.setState(new AqS9S0010000_4(z, 66));
        super.setUserVisibleHint(z);
        if (z) {
            if (C255199zv.LJFF) {
                C255209zw.LJI();
            }
            C62825OlB.LJLLI = true;
        } else {
            C62825OlB.LJLLILLLL = false;
            C62825OlB.LJLLI = false;
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/profile/ui/v2/I18nMyProfileFragmentV3", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.InterfaceC59608NaO
    public final void z1(AWU awu) {
        this.LLIIIL = awu;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.MineProfileAbility
    public final void bm(ProfileUser profileUser, EnumC235129Kq action) {
        o.LJIIIZ(action, "action");
        if (profileUser == null) {
            return;
        }
        lm(((RBX) HG3.LJIILL()).getCurUser(), action, profileUser, "self_api_refresh");
    }

    public final void fm(AWL awl, User user) {
        ProfileUser profileUser;
        String str;
        if (user == null) {
            return;
        }
        ProfileViewModel profileViewModel = this.LJLLLL;
        if (profileViewModel != null) {
            profileViewModel.Kv0(user);
        }
        this.LJLL = user;
        EnumC235129Kq enumC235129Kq = EnumC235129Kq.NORMAL;
        try {
            profileUser = C244699iz.LJIIIZ(user, C237409Tk.LIZ, true, C237399Tj.LJLIL);
        } catch (Exception e) {
            C237259Sv.LJ(e, C244699iz.LIZIZ);
            profileUser = C237409Tk.LIZ;
        }
        if (awl == null) {
            str = "unknown";
        } else {
            int i = AWM.LIZ[awl.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "tab_change_refresh";
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    str = "on_resume_refresh";
                }
            } else {
                str = "on_update_event_refresh";
            }
        }
        lm(user, enumC235129Kq, profileUser, str);
        em().setState(C90863hS.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = new MyProfileGuideWidgetV2(this, (ViewGroup) view, this);
            this.LLIIII = myProfileGuideWidgetV2;
            C72713SgH Ll = Ll();
            if (Ll != null) {
                Ll.LJ(myProfileGuideWidgetV2);
            }
        }
        if (a.LJIJJ().LJ(null) && (mo49getActivity = mo49getActivity()) != null && !mo49getActivity.isFinishing()) {
            a.LJIJJ().LJIIJ(mo49getActivity, "deeplink");
        }
        this.LJZ = Boolean.TRUE;
        C237259Sv.LIZIZ(System.currentTimeMillis(), "page_on_view_created_complete_time");
    }

    public final void km(String str, ProfileUser profileUser, View view) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        C237259Sv.LIZ(str, profileUser);
        if (!isAdded() || isDetached()) {
            C221018lt.LIZIZ("I18nMyProfileFragmentV3", "updateProfilePlatformAsseme not attach");
            return;
        }
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(this);
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof ProfileRootComponent) {
                    ((ProfileRootBaseComponent) next).K3(profileUser);
                    return;
                }
            }
        }
        em().LJLJJL = true;
        C8VV.LIZ(this, false, new C9IM(this, view, System.currentTimeMillis(), profileUser));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ProfilePlatformViewModel em = em();
        em.getClass();
        em.setState(new AqS13S0102000_4(i, i2, intent, 4));
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        C86298Xtu.LIZIZ(mo49getActivity(), i, grantResults);
        super.onRequestPermissionsResult(i, strArr, grantResults);
    }

    public final void lm(User user, EnumC235129Kq value, ProfileUser profileUser, String str) {
        ProfilePlatformViewModel em = em();
        em.getClass();
        o.LJIIIZ(value, "value");
        em.setState(new AqS170S0100000_4(value, 1632));
        InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
        if (interfaceC235069Kk != null) {
            C235079Kl.LIZIZ(interfaceC235069Kk, user, null, false, 6);
        }
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C9N2(this, str, profileUser, null), 3);
    }
}
