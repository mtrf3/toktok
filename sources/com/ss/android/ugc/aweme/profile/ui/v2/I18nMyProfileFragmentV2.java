package com.ss.android.ugc.aweme.profile.ui.v2;

import X.APY;
import X.AVK;
import X.AVY;
import X.AW0;
import X.AW8;
import X.AW9;
import X.AWC;
import X.AWE;
import X.AWI;
import X.AWL;
import X.AWN;
import X.AWQ;
import X.AWS;
import X.AWU;
import X.AWV;
import X.AWW;
import X.AWX;
import X.AWY;
import X.AX6;
import X.AXO;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C107794Kx;
import X.C116694i1;
import X.C119324mG;
import X.C12460eI;
import X.C16880lQ;
import X.C173376rF;
import X.C18000nE;
import X.C188727au;
import X.C199097rd;
import X.C1B3;
import X.C221018lt;
import X.C221108m2;
import X.C235079Kl;
import X.C237259Sv;
import X.C26155AOh;
import X.C26330AVa;
import X.C26338AVi;
import X.C26354AVy;
import X.C26356AWa;
import X.C2L4;
import X.C2NU;
import X.C32151Nz;
import X.C38350F3i;
import X.C4LD;
import X.C53487Kyx;
import X.C53765L8f;
import X.C54081LKj;
import X.C54082LKk;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56319M8l;
import X.C56483MEt;
import X.C5H3;
import X.C5S1;
import X.C62825OlB;
import X.C62827OlD;
import X.C65352Pkq;
import X.C72713SgH;
import X.C72818Shy;
import X.C73318Sq2;
import X.C76800UCe;
import X.C76965UIn;
import X.C78472Uqy;
import X.C78999UzT;
import X.C7MY;
import X.C84193Sd;
import X.C84763XOl;
import X.C86298Xtu;
import X.C8VC;
import X.C8VV;
import X.C9KV;
import X.C9PL;
import X.C9VE;
import X.C9WF;
import X.EnumC235129Kq;
import X.FMX;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC244909jK;
import X.InterfaceC34471Wx;
import X.InterfaceC53896LDg;
import X.InterfaceC53971LGd;
import X.InterfaceC55643Lsd;
import X.InterfaceC56322M8o;
import X.InterfaceC59608NaO;
import X.InterfaceC72822Si2;
import X.InterfaceC88472Yns;
import X.JG5;
import X.LKR;
import X.O6R;
import X.OHQ;
import X.QD3;
import X.QX2;
import X.RBX;
import X.T16;
import X.X1D;
import Y.AObserverS72S0100000_4;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceKillswitch;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2;
import com.ss.android.ugc.aweme.profile.widgets.header.ProfileScope;
import com.ss.android.ugc.aweme.setting.services.AppUpdateService;
import com.ss.android.ugc.aweme.setting.services.IAppUpdateService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import ujb.s;
import yq4.a;

/* loaded from: classes5.dex */
public final class I18nMyProfileFragmentV2 extends I18nAbsProfileFragmentV2 implements InterfaceC34471Wx, InterfaceC53896LDg, C9KV, InterfaceC59608NaO, InterfaceC53971LGd, InterfaceC56322M8o, InterfaceC72822Si2, MyProfileAbility, ProfileBaseAbility, C2L4 {
    public static final AWS LLIIL = new AWS();
    public long LLF;
    public String LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public int LLFZ;
    public int[] LLIFFJFJJ;
    public C62825OlB LLII;
    public MyProfileGuideWidgetV2 LLIIIJ;
    public AWU LLIIJI;
    public Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public boolean LLD = true;
    public final C73318Sq2 LLI = new C73318Sq2();
    public final boolean LLIIII = AXO.LIZ();
    public I18nMyProfileFragmentV3 LLIIIILZ = new I18nMyProfileFragmentV3();
    public final C5H3 LLIIIL = C221108m2.LIZIZ(AWQ.LJLIL);
    public final C5H3 LLIIIZ = C221108m2.LIZIZ(AW0.LJLIL);

    @Override // X.InterfaceC53907LDr
    public String L6() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility
    public boolean L7() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public boolean Nl() {
        return true;
    }

    public void _$_clearFindViewByIdCache() {
        this.LLIIJLIL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLIIJLIL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC34471Wx, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b8727";
    }

    @Override // X.InterfaceC55643Lsd
    public String getSceneId() {
        return "profile";
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC56322M8o
    public boolean needConflictWithParent() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.C9KV, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // X.InterfaceC18010nF
    public Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC34471Wx
    public String xi() {
        return "MainTabPage";
    }

    private final IProfileMusicTabService lm() {
        return (IProfileMusicTabService) this.LLIIIL.getValue();
    }

    private final IWalletService nm() {
        return (IWalletService) this.LLIIIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public int Jl() {
        if (this.LLIIII) {
            return R.layout.c7z;
        }
        return R.layout.c4j;
    }

    @Override // X.C9KV
    public void LJI() {
        AWU awu = this.LLIIJI;
        if (awu != null) {
            awu.LJI();
            return;
        }
        if (mo49getActivity() == null) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        if (mo49getActivity.isFinishing()) {
            return;
        }
        AX6.LIZ(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c6, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dm() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2.dm():void");
    }

    public final void em() {
        Intent intent;
        ProfileViewModel profileViewModel = this.LJLLLL;
        profileViewModel.getClass();
        profileViewModel.setState(new AqS170S0100000_4((AWV) null, 960));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null) {
            intent.putExtra("aivatar_share_path", (String) null);
        }
    }

    @Override // X.C8VB
    /* renamed from: fm, reason: merged with bridge method [inline-methods] */
    public C9PL defaultObservableData() {
        return new C9PL(0);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC45040Hm0
    public Analysis getAnalysis() {
        if (this.LLIIII) {
            return this.LLIIIILZ.getAnalysis();
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("personal_homepage");
        o.LJIIIIZZ(analysis, "Analysis().setLabelName(….Label.PERSONAL_HOMEPAGE)");
        return analysis;
    }

    @Override // X.InterfaceC53971LGd
    public String getEnterFrom() {
        if (this.LLIIII) {
            I18nMyProfileFragmentV3 i18nMyProfileFragmentV3 = this.LLIIIILZ;
            if (i18nMyProfileFragmentV3 != null) {
                return i18nMyProfileFragmentV3.getEnterFrom();
            }
            return null;
        }
        if (this.LJLJL == 0) {
            return "personal_homepage";
        }
        return "personal_collection";
    }

    @Override // X.InterfaceC55643Lsd
    public C54082LKk getPopupContext() {
        if (this.LLIIII) {
            return this.LLIIIILZ.getPopupContext();
        }
        if (getContext() == null) {
            return null;
        }
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        return C54081LKj.LIZ(requireContext, this);
    }

    @Override // X.C2L4
    public List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(ProfileScope.class);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public void initData() {
        int i;
        Integer LJJIL;
        if (this.LLIIII) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            Cm(arguments);
            ProfileViewModel profileViewModel = this.LJLLLL;
            if (profileViewModel != null) {
                profileViewModel.setState(new AqS29S1000000_4(this.LLFF, 25));
            }
            String string = arguments.getString("profile_from_scene");
            if (string != null && (LJJIL = C38350F3i.LJJIL(string)) != null) {
                i = LJJIL.intValue();
            } else {
                i = 0;
            }
            this.LLFZ = i;
            this.LLIFFJFJJ = arguments.getIntArray("traffic_source_list");
        }
        LJJLJLI(((RBX) HG3.LJIILL()).getCurUser());
        super.initData();
        if (!SharePrefCache.inst().getHasEnterBindPhone().LIZ().booleanValue()) {
            ((RBX) HG3.LJIILL()).queryUser();
        }
        if (AVK.LIZJ()) {
            try {
                C78999UzT.LJFF(AbstractC73672Svk.LJIIJ(AVY.LJLIL).LJJL(T16.LIZ()).LJJJLIIL(C26330AVa.LJLIL, AWC.LJLIL), this.LLI);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        if (arguments == null || !arguments.getBoolean("delay_profile_loading")) {
            ((InterfaceC235069Kk) C8VC.LIZJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class))).hh(this.LLFZ, EnumC235129Kq.CHANGE_TAB);
        }
        Am();
    }

    @Override // X.InterfaceC55643Lsd
    public boolean isSceneActive() {
        if (this.LLIIII) {
            return this.LLIIIILZ.isSceneActive();
        }
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            if (LKR.LIZJ(requireActivity, "USER")) {
                return true;
            }
        }
        return false;
    }

    public List<InterfaceC55643Lsd> km() {
        return new ArrayList();
    }

    public String mm() {
        String uid;
        User user = this.LJLL;
        String str = "";
        if (user == null) {
            uid = "";
        } else {
            uid = user.getUid();
        }
        if (TextUtils.isEmpty(uid)) {
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "{\n            AccountPro…ice().curUserId\n        }");
            return curUserId;
        }
        User user2 = this.LJLL;
        if (user2 != null) {
            str = user2.getUid();
        }
        o.LJIIIIZZ(str, "{\n            MobUtils.getUid(mUser);\n        }");
        return str;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        Intent intent;
        Bundle LLJJIJI;
        String string;
        Integer LJJIL;
        Intent intent2;
        String LLJJIJIIJIL;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        Intent intent6;
        ActivityC45651qj mo49getActivity;
        Intent intent7;
        if (this.LLIIII) {
            super.onResume();
            return;
        }
        zm();
        super.onResume();
        C78999UzT.LJFF(AbstractC73672Svk.LJJIJIL(a.LJIJJ()).LJJL(T16.LIZ()).LJJJLIIL(AWN.LJLIL, AW9.LJLIL), this.LLI);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("delay_profile_loading")) {
            long currentTimeMillis = System.currentTimeMillis();
            xm(AWL.ON_RESUME);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (!C237259Sv.LJII) {
                C237259Sv.LJII = true;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("profile_attributes", C237259Sv.LJIIIIZZ);
                c188727au.LJIIIZ("report_scene", "profile_on_resume_update");
                c188727au.LJ(currentTimeMillis2, "page_on_resume_update_cost_time");
                FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
            }
        }
        C62825OlB.LJLLI = true;
        this.LLD = false;
        Boolean bool = null;
        if (C26356AWa.LIZ()) {
            if (!this.LJZ.booleanValue() && (mo49getActivity = mo49getActivity()) != null && (intent7 = mo49getActivity.getIntent()) != null && C16880lQ.LLJJIJIIJIL(intent7, "aivatar_share_path") != null) {
                AWV hm = hm();
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 != null) {
                    MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.LLIIIJ;
                    if (myProfileGuideWidgetV2 != null) {
                        myProfileGuideWidgetV2.LJIJ();
                    }
                    AWW.LIZ(mo49getActivity2, hm, new AqS154S0100000_4(this, 705));
                }
            }
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            if (mo49getActivity3 != null && (intent6 = mo49getActivity3.getIntent()) != null) {
                bool = Boolean.valueOf(intent6.getBooleanExtra("aivatar_open_edit_profile", false));
            }
            if (o.LJ(bool, Boolean.TRUE)) {
                MyProfileGuideWidgetV2 myProfileGuideWidgetV22 = this.LLIIIJ;
                if (myProfileGuideWidgetV22 != null) {
                    myProfileGuideWidgetV22.LJIJ();
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "//profile_edit");
                buildRoute.withParam("aivatar_notif_permission", true);
                buildRoute.open();
                ActivityC45651qj mo49getActivity4 = mo49getActivity();
                if (mo49getActivity4 != null && (intent5 = mo49getActivity4.getIntent()) != null) {
                    intent5.putExtra("aivatar_open_edit_profile", false);
                }
            }
        }
        this.LJZ = Boolean.FALSE;
        ActivityC45651qj mo49getActivity5 = mo49getActivity();
        if (mo49getActivity5 != null && (intent = mo49getActivity5.getIntent()) != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null && (string = LLJJIJI.getString("profile_from_scene")) != null && (LJJIL = C38350F3i.LJJIL(string)) != null && LJJIL.intValue() == 1026) {
            ActivityC45651qj mo49getActivity6 = mo49getActivity();
            if (mo49getActivity6 != null && (intent4 = mo49getActivity6.getIntent()) != null) {
                intent4.removeExtra("profile_from_scene");
            }
            ((InterfaceC235069Kk) C8VC.LIZJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class))).hh(1026, EnumC235129Kq.CHANGE_TAB);
            ActivityC45651qj mo49getActivity7 = mo49getActivity();
            if (mo49getActivity7 != null && (intent2 = mo49getActivity7.getIntent()) != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent2, "shoot_from")) != null && LLJJIJIIJIL.length() != 0) {
                ActivityC45651qj mo49getActivity8 = mo49getActivity();
                if (mo49getActivity8 != null && (intent3 = mo49getActivity8.getIntent()) != null) {
                    intent3.removeExtra("shoot_from");
                }
                IProfileMusicTabService lm = lm();
                if (lm != null) {
                    lm.LJIIL(LLJJIJIIJIL);
                }
            }
        }
        C237259Sv.LIZIZ(System.currentTimeMillis(), "page_on_resume_complete_time");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e5, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pm() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2.pm():void");
    }

    private final void Am() {
        Intent intent;
        Intent intent2;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null && C16880lQ.LLJJIJIIJIL(intent, "aivatar_share_path") != null) {
            AWV hm = hm();
            ProfileViewModel profileViewModel = this.LJLLLL;
            profileViewModel.getClass();
            profileViewModel.setState(new AqS170S0100000_4(hm, 960));
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null && (intent2 = mo49getActivity2.getIntent()) != null) {
                intent2.putExtra("aivatar_share_path", (String) null);
            }
        }
    }

    private final AWV hm() {
        Intent intent;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null) {
            return new AWV(C16880lQ.LLJJIJIIJIL(intent, "aivatar_share_path"), C16880lQ.LLJJIJIIJIL(intent, "image_uri"), C16880lQ.LLJJIJIIJIL(intent, "image_url"), C16880lQ.LLJJIJIIJIL(intent, "origin_no_crop_avatar_path"), C16880lQ.LLJJIJIIJIL(intent, "path_mode"));
        }
        return null;
    }

    private final void refreshData() {
        if (!isActive() || this.LLD) {
            return;
        }
        if (!cm(mo49getActivity())) {
            C5S1 c5s1 = new C5S1(mo49getActivity());
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
            return;
        }
        InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
        if (interfaceC235069Kk != null) {
            C235079Kl.LIZ(interfaceC235069Kk, null, 3);
        }
        if (!C78472Uqy.LIZLLL() || WalletEntranceKillswitch.INSTANCE.isWalletEntranceKillswitchEnabled()) {
            return;
        }
        ((WalletCenter) nm().walletCenter()).LJIILJJIL();
    }

    private final void zm() {
        ActivityC45651qj mo49getActivity;
        Fragment mv0;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        o.LJI(mo49getActivity2);
        CommonPageFragment kv0 = C84193Sd.LIZ(mo49getActivity2).kv0();
        if (kv0 != null && s.LJJJLZIJ(C16880lQ.LJLLJ(kv0.getClass()), "MainPageFragment", false) && (mo49getActivity = mo49getActivity()) != null) {
            if (C53765L8f.LJIIJJI()) {
                mv0 = LKR.LIZ(mo49getActivity);
            } else {
                mv0 = C116694i1.LIZ(mo49getActivity).mv0();
            }
            if (mv0 != null && mv0 == this) {
                C12460eI.LJIIIIZZ(this, null);
            }
        }
    }

    @Override // X.InterfaceC18010nF
    public String LLZIL() {
        return C18000nE.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.MyProfileAbility
    public boolean isFromMain() {
        String str;
        if (C53765L8f.LJIIJJI()) {
            if (o.LJ(this.LLFF, "click_top_icon") || o.LJ(this.LLFF, "scroll_to_slide")) {
                return true;
            }
            return false;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("from");
        } else {
            str = null;
        }
        return o.LJ(str, "from_main");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        C62825OlB c62825OlB;
        super.onDestroy();
        if (this.LLIIII) {
            return;
        }
        EventBus.LIZJ().LJIJ(this);
        C72818Shy.LJII("MUSIC_ARTIST_CERTIFICATION_SUBMIT", this);
        C72818Shy.LJII("HIDE_ACCOUNT_WARNING_SUCCESS", this);
        this.LLI.dispose();
        JG5.LIZ.postValue("");
        if (C4LD.LIZIZ.LJIILIIL() && (c62825OlB = this.LLII) != null) {
            c62825OlB.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.LLIIII) {
            return;
        }
        C78999UzT.LJFF(AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJJIJIL(a.LJIJJ()), C84763XOl.LJFF(), AWI.LJLIL).LJJL(T16.LIZ()).LJJJLIIL(AWE.LJLIL, AW8.LJLIL), this.LLI);
        if (this.LLFFF) {
            Xl();
        }
        C62825OlB.LJLLI = false;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.LLIIII) {
            return;
        }
        HG3.LJIILL().updateLeaveTime(System.currentTimeMillis());
        em();
    }

    public InterfaceC55643Lsd sm() {
        return C56319M8l.LJLIL;
    }

    private final void Cm(Bundle bundle) {
        String str;
        String string = bundle.getString("enter_from");
        this.LLFF = string;
        ProfileViewModel profileViewModel = this.LJLLLL;
        if (profileViewModel != null) {
            profileViewModel.setState(new AqS29S1000000_4(string, 25));
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("from");
        } else {
            str = null;
        }
        this.LJLJJLL = str;
    }

    public static boolean cm(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean om(String str) {
        if (C53765L8f.LJIIJJI() && o.LJ(str, "RootNode")) {
            return true;
        }
        return false;
    }

    private final void qm(View view) {
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        int LIZIZ = C7MY.LIZIZ(4);
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        View findViewById = view.findViewById(R.id.iuq);
        C119324mG c119324mG = (C119324mG) view.findViewById(R.id.mz2);
        View findViewById2 = view.findViewById(R.id.y1);
        if (findViewById != null) {
            C26338AVi.LJI(findViewById, null, Integer.valueOf(LJJIIZ), null, null, false, 29);
        }
        if (c119324mG != null) {
            C26338AVi.LJIIIZ(c119324mG, null, Integer.valueOf(LIZIZ), null, null, 29);
            c119324mG.setExpectedEmptyHeightPx(LJJIIZ);
        }
        if (findViewById2 != null) {
            C26338AVi.LJIIIZ(findViewById2, Integer.valueOf(LJJIIZ2), null, Integer.valueOf(LJJIIZ2), null, 26);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void vm(com.ss.android.ugc.aweme.profile.model.User r13) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2.vm(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    @Override // X.InterfaceC59608NaO
    public void LJJIJ(String str) {
        if (this.LLIIII) {
            I18nMyProfileFragmentV3 i18nMyProfileFragmentV3 = this.LLIIIILZ;
            if (i18nMyProfileFragmentV3 != null) {
                i18nMyProfileFragmentV3.LJJIJ(str);
                return;
            }
            return;
        }
        InterfaceC244909jK interfaceC244909jK = (InterfaceC244909jK) C8VC.LJI(this, C65352Pkq.LIZ(InterfaceC244909jK.class));
        if (interfaceC244909jK != null) {
            interfaceC244909jK.LJJIJ(str);
        }
    }

    @Override // X.C9KV
    public void LJJLJLI(User user) {
        this.LJLL = user;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c5, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // X.InterfaceC59608NaO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLIFFJFJJ(com.ss.android.ugc.aweme.feed.model.Aweme r13) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2.LLIFFJFJJ(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d7, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // X.C9KV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLILZIL(com.ss.android.ugc.aweme.profile.model.User r13) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2.LLILZIL(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
    
        if (r10.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.8VA, T] */
    @Override // X.InterfaceC53896LDg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLLLILI(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2.LLLLILI(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r14.getBoolean(r1) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0159, code lost:
    
        if (r10.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.8VA, T] */
    @Override // X.InterfaceC53896LDg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLLLLLZ(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2.LLLLLLZ(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public void Ml(View view) {
        o.LJIIIZ(view, "view");
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LLIIII) {
            return;
        }
        _$_findCachedViewById(R.id.i79).setVisibility(0);
        super.Ml(view);
        C8VV.LIZ(this, false, new AqS135S0200000_4(this, view, 83));
        qm(view);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("profile_attributes", C237259Sv.LJIIIIZZ);
        c188727au.LJ(currentTimeMillis2, "profile_init_view_cost_time");
        c188727au.LJIIIZ("report_scene", "profile_v2_old_data_statistics");
        FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // X.InterfaceC59608NaO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V1(boolean r13) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2.V1(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public void initView(View view) {
        ActivityC45651qj mo49getActivity;
        if (this.LLIIII) {
            return;
        }
        super.initView(view);
        if (C4LD.LIZIZ.LJIILIIL() && (mo49getActivity = mo49getActivity()) != null) {
            this.LLII = C62827OlD.LIZ("personal_homepage", mo49getActivity, this);
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
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, MyProfileAbility.class, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Cm(arguments);
            ProfileViewModel profileViewModel = this.LJLLLL;
            if (profileViewModel != null) {
                profileViewModel.setState(new AqS170S0100000_4(Boolean.valueOf(isFromMain()), 955));
            }
        }
        if (this.LLIIII) {
            this.LLIIIILZ.setArguments(arguments);
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            I18nMyProfileFragmentV3 i18nMyProfileFragmentV3 = this.LLIIIILZ;
            if (i18nMyProfileFragmentV3 != null) {
                c1b3.LJIIIIZZ(R.id.i9j, 1, i18nMyProfileFragmentV3, "platform_fragment");
                c1b3.LJIILJJIL();
                return;
            }
            return;
        }
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, ProfileBaseAbility.class, null);
        this.LJLIL = ((RBX) HG3.LJIILL()).getCurUserId();
        this.LJLILLLLZI = ((RBX) HG3.LJIILL()).getCurSecUserId();
        EventBus.LIZJ().LJIILJJIL(this);
        C72818Shy.LIZLLL("MUSIC_ARTIST_CERTIFICATION_SUBMIT", this);
        C72818Shy.LIZLLL("HIDE_ACCOUNT_WARNING_SUCCESS", this);
        C53487Kyx.LIZIZ(AWY.PERSONAL_HOMEPAGE);
        ProfileViewModel profileViewModel2 = this.LJLLLL;
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 578);
        profileViewModel2.getClass();
        JediViewModel.wv0(profileViewModel2, C26155AOh.LJLIL, null, new AqS170S0100000_4(aqS170S0100000_4, (InterfaceC88472Yns<? super APY, C76800UCe>) 958), 2, null);
        JG5.LIZ.observe(this, new AObserverS72S0100000_4(this, 10));
        C237259Sv.LIZIZ(System.currentTimeMillis(), "page_on_create_complete_time");
    }

    @Override // X.InterfaceC72822Si2
    public void onReceiveJsEvent(C199097rd jsEvent) {
        InterfaceC235069Kk interfaceC235069Kk;
        InterfaceC235069Kk interfaceC235069Kk2;
        o.LJIIIZ(jsEvent, "jsEvent");
        if (this.LLIIII) {
            this.LLIIIILZ.onReceiveJsEvent(jsEvent);
            return;
        }
        if (o.LJ(jsEvent.LJLIL, "MUSIC_ARTIST_CERTIFICATION_SUBMIT") && (interfaceC235069Kk2 = (InterfaceC235069Kk) C8VC.LJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null)) != null) {
            interfaceC235069Kk2.hh(1026, EnumC235129Kq.CHANGE_TAB);
        }
        if (o.LJ(jsEvent.LJLIL, "HIDE_ACCOUNT_WARNING_SUCCESS") && (interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null)) != null) {
            C235079Kl.LIZ(interfaceC235069Kk, null, 3);
        }
    }

    @QD3
    public final void onSaveUserDataEvent(C9VE c9ve) {
        this.LLFII = true;
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
        this.LLFII = false;
        LJJLJLI(event.LJLIL);
        vm(this.LJLL);
    }

    @QD3
    public final void onUpdateUserSuccessEvent(C9WF event) {
        o.LJIIIZ(event, "event");
        HG3.LJIILL().queryUser();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x014d, code lost:
    
        if (r12.LIZIZ.containsKey(new X.C62582cw(r5, serviceKey())) != false) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r3v14, types: [X.8VA, T] */
    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setUserVisibleHint(boolean r18) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2.setUserVisibleHint(boolean):void");
    }

    public final void xm(AWL awl) {
        boolean z;
        if (this.LLIIII) {
            I18nMyProfileFragmentV3 i18nMyProfileFragmentV3 = this.LLIIIILZ;
            if (i18nMyProfileFragmentV3 != null) {
                i18nMyProfileFragmentV3.hm(awl);
                return;
            }
            return;
        }
        LJJLJLI(((RBX) HG3.LJIILL()).getCurUser());
        vm(this.LJLL);
        if (awl == AWL.TAB_CHANGE) {
            C26354AVy.LIZ.getClass();
            if (C26354AVy.LIZ()) {
                z = true;
                if (!((RBX) HG3.LJIILL()).shouldRefresh() || this.LLFII || z) {
                    refreshData();
                }
                this.LLFII = false;
            }
        }
        z = false;
        if (!((RBX) HG3.LJIILL()).shouldRefresh()) {
        }
        refreshData();
        this.LLFII = false;
    }

    @Override // X.InterfaceC59608NaO
    public void z1(AWU awu) {
        if (this.LLIIII) {
            I18nMyProfileFragmentV3 i18nMyProfileFragmentV3 = this.LLIIIILZ;
            if (i18nMyProfileFragmentV3 != null) {
                i18nMyProfileFragmentV3.LLIIIL = awu;
                return;
            }
            return;
        }
        this.LLIIJI = awu;
    }

    private final void Dm(boolean z, boolean z2) {
        boolean z3;
        IAppUpdateService LIZLLL = AppUpdateService.LIZLLL();
        if (!z && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        LIZLLL.LIZIZ(z3, this);
    }

    public final void Em(String aid, Aweme aweme) {
        InterfaceC244909jK interfaceC244909jK;
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(aweme, "aweme");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update cover: ");
        LIZ.append(aid);
        C221018lt.LIZ("my profile", X1D.LIZIZ(LIZ));
        if (aid.length() != 0 && (interfaceC244909jK = (InterfaceC244909jK) C8VC.LJI(this, C65352Pkq.LIZ(InterfaceC244909jK.class))) != null) {
            interfaceC244909jK.LLJILJILJ(aid, aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            Cm(arguments);
        }
        if (this.LLIIII) {
            return;
        }
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = new MyProfileGuideWidgetV2(this, (ViewGroup) view, this);
            this.LLIIIJ = myProfileGuideWidgetV2;
            C72713SgH Ll = Ll();
            if (Ll != null) {
                Ll.LJ(myProfileGuideWidgetV2);
            }
        }
        if (a.LJIJJ().LJ(null) && (mo49getActivity = mo49getActivity()) != null && !mo49getActivity.isFinishing()) {
            a.LJIJJ().LJIIJ(mo49getActivity, "deeplink");
        }
        C56483MEt.LIZ(new C173376rF(), this.LLFF, true, "homepage_self_profile");
        this.LJZ = Boolean.TRUE;
        C237259Sv.LIZIZ(System.currentTimeMillis(), "page_on_view_created_complete_time");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        C86298Xtu.LIZIZ(mo49getActivity(), i, grantResults);
        super.onRequestPermissionsResult(i, strArr, grantResults);
    }

    public static /* synthetic */ void ym(I18nMyProfileFragmentV2 i18nMyProfileFragmentV2, AWL awl, int i, Object obj) {
        if ((i & 1) != 0) {
            awl = AWL.ON_RESUME;
        }
        i18nMyProfileFragmentV2.xm(awl);
    }
}
