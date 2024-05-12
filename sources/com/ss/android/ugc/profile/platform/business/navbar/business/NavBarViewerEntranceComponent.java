package com.ss.android.ugc.profile.platform.business.navbar.business;

import X.AFB;
import X.APY;
import X.AQ2;
import X.AQ6;
import X.AQ8;
import X.AQ9;
import X.AV1;
import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C17J;
import X.C212428Vi;
import X.C221108m2;
import X.C227548wQ;
import X.C234159Gx;
import X.C234719Jb;
import X.C235929Ns;
import X.C237429Tm;
import X.C243119gR;
import X.C26149AOb;
import X.C26156AOi;
import X.C26192APs;
import X.C26194APu;
import X.C26197APx;
import X.C26335AVf;
import X.C26343AVn;
import X.C32151Nz;
import X.C34K;
import X.C54081LKj;
import X.C54082LKk;
import X.C55096Ljo;
import X.C56319M8l;
import X.C5H3;
import X.C76800UCe;
import X.C78866UxK;
import X.C87277YNd;
import X.C8YN;
import X.C9H0;
import X.C9IL;
import X.C9XU;
import X.EnumC26196APw;
import X.G27;
import X.HG3;
import X.InterfaceC55235Lm3;
import X.InterfaceC55643Lsd;
import X.InterfaceC56322M8o;
import X.InterfaceC82683Wch;
import X.InterfaceC88472Yns;
import X.KL2;
import X.O6R;
import X.OSZ;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS40S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.google.gson.m;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.ViewerEntranceInfo;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.data.ViewerEntranceData;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import o3.IDaS90S0000000_4;
import o3.h0;

/* loaded from: classes5.dex */
public final class NavBarViewerEntranceComponent extends NavbarBaseUIComponent<ViewerEntranceData> implements G27, InterfaceC56322M8o {
    public static final AQ8 Companion = new AQ8();
    public C26192APs entranceView;
    public boolean hasShowInOnceAppSession;
    public OSZ<String, ViewerEntranceData> lastShowUserInfo;
    public boolean onShowReported;
    public OSZ<String, ViewerEntranceData> pendingShowUserInfo;
    public InterfaceC82683Wch profileViewerBubble;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C235929Ns viewAction = new C235929Ns();
    public final C5H3 profileKeva$delegate = C221108m2.LIZIZ(AQ6.LJLIL);
    public EnumC26196APw currentStyle = EnumC26196APw.NORMAL;
    public final C26194APu onBackgroundListener = new C26194APu(this);

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC56322M8o
    public boolean needConflictWithParent() {
        return true;
    }

    private final boolean checkIfNeedAnimation() {
        ViewerEntranceData second;
        Integer unReadCount;
        ViewerEntranceData second2;
        Integer unReadCount2;
        ViewerEntranceData second3;
        Integer unReadCount3;
        if (this.bizBaseData == 0) {
            return false;
        }
        if ((getViewerHistorySetting() == 2 && (getUnAuthorizedClickNum() >= 3 || this.hasShowInOnceAppSession)) || getUnReadViewerCount() <= 0) {
            return false;
        }
        if ((C26197APx.LIZLLL() && (getViewerHistorySetting() == 2 || getUnReadViewerCount() == 1)) || !C26343AVn.LIZIZ() || !noNeedAvoidance()) {
            return false;
        }
        if (this.lastShowUserInfo == null) {
            OSZ<String, ViewerEntranceData> osz = this.pendingShowUserInfo;
            if (osz != null && (second3 = osz.getSecond()) != null && (unReadCount3 = second3.getUnReadCount()) != null && unReadCount3.intValue() > 0) {
                return true;
            }
        } else {
            OSZ<String, ViewerEntranceData> osz2 = this.pendingShowUserInfo;
            if (osz2 != null && (second = osz2.getSecond()) != null && (unReadCount = second.getUnReadCount()) != null) {
                int intValue = unReadCount.intValue();
                OSZ<String, ViewerEntranceData> osz3 = this.lastShowUserInfo;
                if (osz3 != null && (second2 = osz3.getSecond()) != null && (unReadCount2 = second2.getUnReadCount()) != null) {
                    int intValue2 = unReadCount2.intValue();
                    if (intValue > 0 && intValue2 == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final List<UrlModel> getAvatarUrlModels() {
        ViewerEntranceData viewerEntranceData = (ViewerEntranceData) this.bizBaseData;
        if (viewerEntranceData != null) {
            return viewerEntranceData.getLatestViewerAvatarThumbList();
        }
        return null;
    }

    private final Keva getProfileKeva() {
        return (Keva) this.profileKeva$delegate.getValue();
    }

    private final boolean isChangingUser() {
        String first;
        OSZ<String, ViewerEntranceData> osz;
        String first2;
        OSZ<String, ViewerEntranceData> osz2 = this.pendingShowUserInfo;
        if (osz2 != null && (first = osz2.getFirst()) != null && (osz = this.lastShowUserInfo) != null && (first2 = osz.getFirst()) != null && !o.LJ(first, first2)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void actionsAfterUpdateUI() {
        String str;
        int i;
        ProfileViewModel LIZ;
        C9H0 c9h0;
        C34K c34k = new C34K();
        c34k.element = true;
        InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        C234159Gx data = getData();
        if (data != null && (c9h0 = data.LJLIL) != null) {
            str = c9h0.getValue();
        } else {
            str = null;
        }
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, str);
        if (iNavbarBaseAbility != null) {
            iNavbarBaseAbility.tm(uniqueId());
        }
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            C8YN.LJII(this, profilePlatformVM, new TBT() { // from class: X.9Ja
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PM) obj).LJLILLLLZI;
                }
            }, null, new AqS167S0200000_4(this, c34k, 23), 6);
        }
        ProfilePlatformViewModel profilePlatformVM2 = getProfilePlatformVM();
        if (profilePlatformVM2 != null) {
            C8YN.LJII(this, profilePlatformVM2, new TBT() { // from class: X.9KB
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C9PM) obj).LJLJJL);
                }
            }, null, C234719Jb.LJLIL, 6);
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (LIZ = AFB.LIZ(LIZLLL)) != null) {
            JediViewModel.wv0(LIZ, C26156AOi.LJLIL, null, new AqS170S0100000_4(new AqS170S0100000_4(this, 848), (InterfaceC88472Yns<? super APY, C76800UCe>) 959), 2, null);
        }
        C9IL c9il = C9IL.NAV;
        String lowerCase = "HAS_PROFILE_VIEWER".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, true, c9il, lowerCase, c34k.element);
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null) {
            i = LIZ2.hashCode();
        } else {
            i = 0;
        }
        C9XU.LIZ(i, this);
    }

    public List<InterfaceC55643Lsd> getChildScenes() {
        return new ArrayList();
    }

    @Override // X.InterfaceC55643Lsd
    public String getSceneId() {
        return NavBarViewerEntranceComponent.class.getName();
    }

    public final int getUnReadViewerCount() {
        Integer unReadCount;
        ViewerEntranceData viewerEntranceData = (ViewerEntranceData) this.bizBaseData;
        if (viewerEntranceData != null && (unReadCount = viewerEntranceData.getUnReadCount()) != null) {
            return unReadCount.intValue();
        }
        return 0;
    }

    public final void showViewerEntranceTips() {
        C26192APs c26192APs = this.entranceView;
        if (c26192APs != null) {
            c26192APs.postDelayed(new ARunnableS40S0100000_4(this, 86), 500L);
        }
    }

    private final Integer calculateMaxWidth() {
        int LJIIJJI = KL2.LJIIJJI(getContext());
        if (LJIIJJI == 0) {
            return null;
        }
        return Integer.valueOf((LJIIJJI - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)) * 3)) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
    }

    private final boolean checkEntranceIsShowing() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) && isProfileTabShown()) {
            return true;
        }
        return false;
    }

    private final boolean isProfileTabShown() {
        HomeTabAbility LJIL;
        MainActivityScope LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(this);
        if (LJJLIIIJJIZ != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJIZ)) != null) {
            return LJIL.zW("USER");
        }
        return false;
    }

    private final boolean noNeedAvoidance() {
        if (!isChangingUser() && !shouldShowProfileViewerGuide() && !C26343AVn.LJFF(AV1.LIZIZ()) && !C26343AVn.LIZJ) {
            return true;
        }
        return false;
    }

    private final boolean shouldShowProfileViewerGuide() {
        User LIZIZ = AV1.LIZIZ();
        if (LIZIZ == null) {
            return false;
        }
        if (C26149AOb.LIZ()) {
            return AQ9.LIZIZ(LIZIZ, isFromMain(), true);
        }
        return AQ9.LIZ(LIZIZ, isFromMain(), true);
    }

    private final void updateViewerEntranceInfo() {
        IAccountUserService LJIILL;
        ViewerEntranceInfo viewerEntranceInfo;
        int unReadViewerCount = getUnReadViewerCount();
        List<UrlModel> avatarUrlModels = getAvatarUrlModels();
        ViewerEntranceData viewerEntranceData = (ViewerEntranceData) this.bizBaseData;
        if (viewerEntranceData != null) {
            viewerEntranceData.setUnReadCount(0);
        }
        ViewerEntranceData viewerEntranceData2 = (ViewerEntranceData) this.bizBaseData;
        if (viewerEntranceData2 != null) {
            viewerEntranceData2.setLatestViewerAvatarThumbList(null);
        }
        User curUser = HG3.LJIILL().getCurUser();
        if (curUser != null) {
            ViewerEntranceInfo viewerEntranceInfo2 = curUser.viewerEntranceInfo;
            if (viewerEntranceInfo2 != null) {
                viewerEntranceInfo2.setUnReadViewerCount(0);
            }
            if (curUser != null && (viewerEntranceInfo = curUser.viewerEntranceInfo) != null) {
                viewerEntranceInfo.setLatestViewerAvatarThumbList(null);
            }
        }
        if ((unReadViewerCount > 0 || avatarUrlModels == null) && (LJIILL = HG3.LJIILL()) != null) {
            LJIILL.forceSave();
        }
        this.pendingShowUserInfo = null;
    }

    @Override // X.InterfaceC55643Lsd
    public C54082LKk getPopupContext() {
        Context context = getContext();
        if (context != null) {
            return C54081LKj.LIZ(context, this);
        }
        return null;
    }

    public final int getUnAuthorizedClickNum() {
        return getProfileKeva().getInt("profile_entrance_unauth_click_num", 0);
    }

    public final int getViewerHistorySetting() {
        Integer M;
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings != null && (M = privacyUserSettings.M("profile_view_history")) != null) {
            return M.intValue();
        }
        return 2;
    }

    public final int getViewerHistorySettingMob() {
        Integer M;
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings == null || (M = privacyUserSettings.M("profile_view_history")) == null || 1 != M.intValue()) {
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent
    public AbstractC234519Ih initNavBarAction() {
        C26192APs c26192APs;
        if (!isFromMain()) {
            return this.viewAction;
        }
        Context context = getContext();
        if (context != null) {
            c26192APs = new C26192APs(context);
        } else {
            c26192APs = null;
        }
        this.entranceView = c26192APs;
        if (c26192APs != null) {
            c26192APs.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(this, 203)));
        }
        C235929Ns c235929Ns = this.viewAction;
        c235929Ns.LIZLLL = true;
        return c235929Ns;
    }

    @Override // X.InterfaceC55643Lsd
    public boolean isSceneActive() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onCreateView() {
        super.onCreateView();
        if (isFromMain() && C26197APx.LIZ()) {
            ActivityStack.addAppBackGroundListener(this.onBackgroundListener);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        if (isFromMain() && C26197APx.LIZ()) {
            ActivityStack.removeAppBackGroundListener(this.onBackgroundListener);
        }
    }

    @Override // X.C8W0
    public void onPause() {
        super.onPause();
        if (isFromMain()) {
            this.onShowReported = false;
        }
    }

    @Override // X.C8W0
    public void onResume() {
        super.onResume();
        if (isFromMain()) {
            if (C26197APx.LIZ()) {
                C26192APs c26192APs = this.entranceView;
                if (c26192APs != null) {
                    c26192APs.LIZLLL();
                }
                if (this.pendingShowUserInfo != null && isProfileTabShown()) {
                    tryShowViewerEntrance(true);
                }
            }
            if (!this.onShowReported) {
                C26335AVf.LJIILLIIL(getViewerHistorySettingMob(), getUnReadViewerCount(), "show");
                this.currentStyle = EnumC26196APw.NORMAL;
            }
            this.onShowReported = true;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public boolean shouldShowAfterDoubleCheck() {
        return isFromMain();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void updateComponentUIAndData() {
        User hv0;
        String uid;
        T t;
        if (!isFromMain()) {
            return;
        }
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null && (hv0 = profilePlatformVM.hv0()) != null && (uid = hv0.getUid()) != null && (t = this.bizBaseData) != 0) {
            this.pendingShowUserInfo = new OSZ<>(uid, t);
        }
        tryShowViewerEntrance$default(this, false, 1, null);
    }

    public InterfaceC55643Lsd parentScene() {
        return C56319M8l.LJLIL;
    }

    private final void mobClickEvent(EnumC26196APw enumC26196APw) {
        if (enumC26196APw == EnumC26196APw.NORMAL) {
            C26335AVf.LJIILLIIL(getViewerHistorySettingMob(), getUnReadViewerCount(), "click");
        } else {
            if (enumC26196APw != EnumC26196APw.CAPSULE && enumC26196APw != EnumC26196APw.LOOP) {
                return;
            }
            AQ2.LIZ(enumC26196APw, getViewerHistorySettingMob(), getUnReadViewerCount(), "click");
        }
    }

    private final void mobNewStyleProfileViewerEntrance(EnumC26196APw enumC26196APw) {
        AQ2.LIZ(enumC26196APw, getViewerHistorySettingMob(), getUnReadViewerCount(), "show");
        this.onShowReported = true;
        this.currentStyle = enumC26196APw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c3, code lost:
    
        if (r15 != null) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void startAnimation(X.OSZ<java.lang.String, com.ss.android.ugc.profile.platform.business.navbar.business.data.ViewerEntranceData> r15) {
        /*
            r14 = this;
            r7 = r14
            X.APs r0 = r7.entranceView
            if (r0 != 0) goto L6
            return
        L6:
            boolean r0 = X.C26197APx.LIZJ()
            r1 = 0
            r4 = 1
            r10 = 0
            if (r0 == 0) goto L74
            X.Lm3 r2 = X.C55096Ljo.LJIIZILJ(r7)
            java.lang.Class<com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility> r0 = com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility.class
            X.2K0 r2 = X.C55096Ljo.LIZ(r2, r0, r10)
            com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility r2 = (com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility) r2
            if (r2 == 0) goto Ld2
            X.APy r0 = X.C26198APy.LJLIL
            android.animation.AnimatorSet r6 = r2.Ul(r0)
        L23:
            X.APs r5 = r7.entranceView
            if (r5 == 0) goto L61
            java.lang.Integer r3 = r7.calculateMaxWidth()
            if (r15 == 0) goto Lcf
            java.lang.Object r0 = r15.getSecond()
            com.ss.android.ugc.profile.platform.business.navbar.business.data.ViewerEntranceData r0 = (com.ss.android.ugc.profile.platform.business.navbar.business.data.ViewerEntranceData) r0
            if (r0 == 0) goto Lcf
            java.lang.Integer r0 = r0.getUnReadCount()
            if (r0 == 0) goto Lcf
            int r2 = r0.intValue()
        L3f:
            int r0 = r7.getViewerHistorySetting()
            if (r0 != r4) goto Lcd
            if (r15 == 0) goto Lcd
            java.lang.Object r0 = r15.getSecond()
            com.ss.android.ugc.profile.platform.business.navbar.business.data.ViewerEntranceData r0 = (com.ss.android.ugc.profile.platform.business.navbar.business.data.ViewerEntranceData) r0
            if (r0 == 0) goto Lcd
            java.util.List r0 = r0.getLatestViewerAvatarThumbList()
        L53:
            r7.bindUIOptimizationAnimation(r5, r2, r0, r3)
            java.lang.Integer r0 = r7.calculateMaxWidth()
            if (r0 != 0) goto Lc6
        L5c:
            if (r6 == 0) goto Ld5
            r5.LJI(r6)
        L61:
            boolean r0 = r7.onShowReported
            if (r0 != 0) goto L67
            r7.onShowReported = r1
        L67:
            X.APw r0 = X.EnumC26196APw.CAPSULE
            r7.mobNewStyleProfileViewerEntrance(r0)
            long r2 = java.lang.System.currentTimeMillis()
            X.C26343AVn.LIZ(r2)
        L74:
            boolean r0 = X.C26197APx.LIZLLL()
            if (r0 == 0) goto Lc1
            int r0 = r7.getViewerHistorySetting()
            if (r0 != r4) goto Lc1
            X.APs r8 = r7.entranceView
            if (r8 == 0) goto Lae
            if (r15 == 0) goto Lc2
            java.lang.Object r0 = r15.getSecond()
            com.ss.android.ugc.profile.platform.business.navbar.business.data.ViewerEntranceData r0 = (com.ss.android.ugc.profile.platform.business.navbar.business.data.ViewerEntranceData) r0
            if (r0 == 0) goto Lc2
            java.lang.Integer r0 = r0.getUnReadCount()
            if (r0 == 0) goto Lc2
            int r9 = r0.intValue()
        L98:
            java.lang.Object r0 = r15.getSecond()
            com.ss.android.ugc.profile.platform.business.navbar.business.data.ViewerEntranceData r0 = (com.ss.android.ugc.profile.platform.business.navbar.business.data.ViewerEntranceData) r0
            if (r0 == 0) goto La4
            java.util.List r10 = r0.getLatestViewerAvatarThumbList()
        La4:
            r11 = 0
            r12 = 8
            r13 = r11
            bindUIOptimizationAnimation$default(r7, r8, r9, r10, r11, r12, r13)
            r8.LJII()
        Lae:
            boolean r0 = r7.onShowReported
            if (r0 != 0) goto Lb4
            r7.onShowReported = r1
        Lb4:
            X.APw r0 = X.EnumC26196APw.LOOP
            r7.mobNewStyleProfileViewerEntrance(r0)
            long r0 = java.lang.System.currentTimeMillis()
            X.C26343AVn.LIZ(r0)
        Lc1:
            return
        Lc2:
            r9 = 0
            if (r15 == 0) goto La4
            goto L98
        Lc6:
            int r0 = r0.intValue()
            if (r0 == 0) goto Ld5
            goto L5c
        Lcd:
            r0 = r10
            goto L53
        Lcf:
            r2 = 0
            goto L3f
        Ld2:
            r6 = r10
            goto L23
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.navbar.business.NavBarViewerEntranceComponent.startAnimation(X.OSZ):void");
    }

    private final void tryShowViewerEntrance(boolean z) {
        int i;
        OSZ osz;
        boolean checkEntranceIsShowing;
        ViewerEntranceData viewerEntranceData;
        List<UrlModel> latestViewerAvatarThumbList;
        Object obj;
        List<UrlModel> latestViewerAvatarThumbList2;
        Integer unReadCount;
        C26192APs c26192APs = this.entranceView;
        if (c26192APs == null) {
            return;
        }
        ViewerEntranceData viewerEntranceData2 = (ViewerEntranceData) this.bizBaseData;
        if (viewerEntranceData2 != null && (unReadCount = viewerEntranceData2.getUnReadCount()) != null) {
            i = unReadCount.intValue();
        } else {
            i = 0;
        }
        if (i > 0) {
            if (getViewerHistorySetting() != 1 || (viewerEntranceData = (ViewerEntranceData) this.bizBaseData) == null || (latestViewerAvatarThumbList = viewerEntranceData.getLatestViewerAvatarThumbList()) == null || latestViewerAvatarThumbList.isEmpty()) {
                if (getUnAuthorizedClickNum() >= 3 || this.hasShowInOnceAppSession) {
                    osz = new OSZ(null, 0);
                } else {
                    osz = new OSZ(null, Integer.valueOf(i));
                }
            } else {
                ViewerEntranceData viewerEntranceData3 = (ViewerEntranceData) this.bizBaseData;
                if (viewerEntranceData3 != null && (latestViewerAvatarThumbList2 = viewerEntranceData3.getLatestViewerAvatarThumbList()) != null) {
                    obj = ListProtector.get(latestViewerAvatarThumbList2, 0);
                } else {
                    obj = null;
                }
                osz = new OSZ(obj, Integer.valueOf(i));
            }
        } else {
            osz = new OSZ(null, 0);
        }
        UrlModel urlModel = (UrlModel) osz.getFirst();
        int intValue = ((Number) osz.getSecond()).intValue();
        if (z) {
            checkEntranceIsShowing = isProfileTabShown();
        } else {
            checkEntranceIsShowing = checkEntranceIsShowing();
        }
        if (checkIfNeedAnimation()) {
            if (checkEntranceIsShowing) {
                if (!c26192APs.LJ()) {
                    startAnimation(this.pendingShowUserInfo);
                }
                this.lastShowUserInfo = this.pendingShowUserInfo;
                this.pendingShowUserInfo = null;
            }
        } else {
            this.lastShowUserInfo = this.pendingShowUserInfo;
            this.pendingShowUserInfo = null;
        }
        bindStaticView(intValue, urlModel);
    }

    public final void onEntranceClick(EnumC26196APw enumC26196APw) {
        int unAuthorizedClickNum;
        this.hasShowInOnceAppSession = true;
        int unReadViewerCount = getUnReadViewerCount();
        if (getViewerHistorySetting() == 2 && (unAuthorizedClickNum = getUnAuthorizedClickNum()) < 3 && unReadViewerCount > 0) {
            getProfileKeva().storeInt("profile_entrance_unauth_click_num", unAuthorizedClickNum + 1);
        }
        mobClickEvent(enumC26196APw);
        updateViewerEntranceInfo();
        C17J.LJJJ(this, true, "profile_viewer");
        C243119gR.LIZ(C227548wQ.LJLIL);
        SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "//profile/viewer");
        buildRoute.withParam("enter_from", "personal_homepage");
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.bizBaseData = (T) C237429Tm.LIZ(jsonObject.toString(), ViewerEntranceData.class);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        if (!isFromMain()) {
            return;
        }
        m mVar = profileComponents.bizData;
        if (mVar != null) {
            parseComponentBizData(mVar);
        }
        updateComponentUIAndData();
    }

    private final void bindStaticView(int i, UrlModel urlModel) {
        C9H0 c9h0;
        INavbarBaseAbility iNavbarBaseAbility;
        List<UrlModel> list;
        boolean z;
        C26192APs c26192APs = this.entranceView;
        if (c26192APs != null) {
            if (C26197APx.LIZIZ() == 16) {
                ViewerEntranceData viewerEntranceData = (ViewerEntranceData) this.bizBaseData;
                if (viewerEntranceData != null) {
                    list = viewerEntranceData.getLatestViewerAvatarThumbList();
                } else {
                    list = null;
                }
                if (getViewerHistorySetting() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                c26192APs.LJFF(list, z);
            } else {
                c26192APs.setIconAvatarUrl(urlModel);
            }
            String string = c26192APs.getResources().getString(R.string.amu);
            o.LJIIIIZZ(string, "resources.getString(R.st…rofile_btn_profile_views)");
            c26192APs.setContentDescription(string);
            h0.LJIJI(c26192APs.LIZ(R.id.eye), new IDaS90S0000000_4(2));
            c26192APs.setUnReadNum(i);
            c26192APs.setVisibility(0);
            C234159Gx data = getData();
            if (data != null && (c9h0 = data.LJLIL) != null && (iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INavbarBaseAbility.class, c9h0.getValue())) != null) {
                int i2 = this.index;
                C235929Ns c235929Ns = this.viewAction;
                c235929Ns.getClass();
                c235929Ns.LIZJ = c26192APs;
                c235929Ns.LIZLLL = true;
                iNavbarBaseAbility.LG(c9h0, i2, c235929Ns, uniqueId());
            }
        }
    }

    @Override // X.G27
    public void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        InterfaceC82683Wch interfaceC82683Wch = this.profileViewerBubble;
        if (interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) {
            interfaceC82683Wch.dismiss();
        }
    }

    private final void bindUIOptimizationAnimation(C26192APs c26192APs, int i, List<UrlModel> list, Integer num) {
        if (num != null && C26197APx.LIZJ()) {
            c26192APs.LIZIZ(i, num.intValue(), list);
        }
        if (C26197APx.LIZLLL() && getViewerHistorySetting() == 1) {
            c26192APs.LIZJ(list);
        }
    }

    public static /* synthetic */ void tryShowViewerEntrance$default(NavBarViewerEntranceComponent navBarViewerEntranceComponent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        navBarViewerEntranceComponent.tryShowViewerEntrance(z);
    }

    public static /* synthetic */ void bindUIOptimizationAnimation$default(NavBarViewerEntranceComponent navBarViewerEntranceComponent, C26192APs c26192APs, int i, List list, Integer num, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        navBarViewerEntranceComponent.bindUIOptimizationAnimation(c26192APs, i, list, num);
    }
}
