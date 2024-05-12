package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine;

import X.AFB;
import X.APY;
import X.AQ2;
import X.AQ3;
import X.AQ5;
import X.AQ7;
import X.AQ9;
import X.ActivityC45651qj;
import X.C17J;
import X.C212428Vi;
import X.C221108m2;
import X.C227548wQ;
import X.C234999Kd;
import X.C235659Mr;
import X.C243119gR;
import X.C26149AOb;
import X.C26156AOi;
import X.C26192APs;
import X.C26195APv;
import X.C26197APx;
import X.C26335AVf;
import X.C26343AVn;
import X.C26354AVy;
import X.C32151Nz;
import X.C47261Igj;
import X.C54081LKj;
import X.C54082LKk;
import X.C55096Ljo;
import X.C56319M8l;
import X.C5H3;
import X.C65352Pkq;
import X.C76800UCe;
import X.C78866UxK;
import X.C87277YNd;
import X.C8VC;
import X.C9IL;
import X.C9KV;
import X.C9XU;
import X.EnumC235829Ni;
import X.EnumC26196APw;
import X.G27;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC55643Lsd;
import X.InterfaceC56322M8o;
import X.InterfaceC82683Wch;
import X.InterfaceC88472Yns;
import X.KL2;
import X.O6R;
import X.OSZ;
import X.RBX;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS40S0100000_4;
import android.animation.AnimatorSet;
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
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.ViewerEntranceInfo;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavCustomActionAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import o3.IDaS90S0000000_4;
import o3.h0;

/* loaded from: classes5.dex */
public final class MineNavBarViewerEntranceAssem extends ProfileNavCustomActionAssem<EnumC235829Ni> implements G27, InterfaceC56322M8o {
    public static final AQ7 Companion = new AQ7();
    public C26192APs entranceView;
    public boolean hasShowInOnceAppSession;
    public User lastShowUserInfo;
    public boolean onShowReported;
    public User pendingShowUserInfo;
    public InterfaceC82683Wch profileViewerBubble;
    public final C5H3 profileKeva$delegate = C221108m2.LIZIZ(AQ5.LJLIL);
    public EnumC26196APw currentStyle = EnumC26196APw.NORMAL;
    public final C26195APv onBackgroundListener = new C26195APv(this);

    private final void startAnimation() {
        int i;
        ViewerEntranceInfo viewerEntranceInfo;
        ViewerEntranceInfo viewerEntranceInfo2;
        AnimatorSet animatorSet;
        int i2;
        List<UrlModel> list;
        User user;
        ViewerEntranceInfo viewerEntranceInfo3;
        ViewerEntranceInfo viewerEntranceInfo4;
        if (this.entranceView == null) {
            return;
        }
        List<UrlModel> list2 = null;
        if (C26197APx.LIZJ()) {
            INavbarCenterAbility iNavbarCenterAbility = (INavbarCenterAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INavbarCenterAbility.class, null);
            if (iNavbarCenterAbility != null) {
                animatorSet = iNavbarCenterAbility.Ul(AQ3.LJLIL);
            } else {
                animatorSet = null;
            }
            C26192APs c26192APs = this.entranceView;
            if (c26192APs != null) {
                Integer calculateMaxWidth = calculateMaxWidth();
                User user2 = this.pendingShowUserInfo;
                if (user2 != null && (viewerEntranceInfo4 = user2.viewerEntranceInfo) != null) {
                    i2 = viewerEntranceInfo4.getUnReadViewerCount();
                } else {
                    i2 = 0;
                }
                if (getViewerHistorySetting() == 1 && (user = this.pendingShowUserInfo) != null && (viewerEntranceInfo3 = user.viewerEntranceInfo) != null) {
                    list = viewerEntranceInfo3.getLatestViewerAvatarThumbList();
                } else {
                    list = null;
                }
                bindUIOptimizationAnimation(c26192APs, i2, list, calculateMaxWidth);
                Integer calculateMaxWidth2 = calculateMaxWidth();
                if ((calculateMaxWidth2 == null || calculateMaxWidth2.intValue() != 0) && animatorSet != null) {
                    c26192APs.LJI(animatorSet);
                } else {
                    return;
                }
            }
            if (!this.onShowReported) {
                this.onShowReported = false;
            }
            mobNewStyleProfileViewerEntranceShow(EnumC26196APw.CAPSULE);
            C26343AVn.LIZ(System.currentTimeMillis());
        }
        if (C26197APx.LIZLLL() && getViewerHistorySetting() == 1) {
            C26192APs c26192APs2 = this.entranceView;
            if (c26192APs2 != null) {
                User user3 = this.pendingShowUserInfo;
                if (user3 != null && (viewerEntranceInfo2 = user3.viewerEntranceInfo) != null) {
                    i = viewerEntranceInfo2.getUnReadViewerCount();
                } else {
                    i = 0;
                }
                User user4 = this.pendingShowUserInfo;
                if (user4 != null && (viewerEntranceInfo = user4.viewerEntranceInfo) != null) {
                    list2 = viewerEntranceInfo.getLatestViewerAvatarThumbList();
                }
                bindUIOptimizationAnimation$default(this, c26192APs2, i, list2, null, 8, null);
                c26192APs2.LJII();
            }
            if (!this.onShowReported) {
                this.onShowReported = false;
            }
            mobNewStyleProfileViewerEntranceShow(EnumC26196APw.LOOP);
            C26343AVn.LIZ(System.currentTimeMillis());
        }
    }

    @Override // X.InterfaceC56322M8o
    public boolean needConflictWithParent() {
        return true;
    }

    private final Keva getProfileKeva() {
        return (Keva) this.profileKeva$delegate.getValue();
    }

    private final User getUserData() {
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            return c234999Kd.LIZ;
        }
        return null;
    }

    private final boolean isChangingUser() {
        String uid;
        User user;
        String uid2;
        User user2 = this.pendingShowUserInfo;
        if (user2 != null && (uid = user2.getUid()) != null && (user = this.lastShowUserInfo) != null && (uid2 = user.getUid()) != null && !o.LJ(uid, uid2)) {
            return true;
        }
        return false;
    }

    private final boolean shouldShowViewerEntrance() {
        boolean z;
        ViewerEntranceInfo viewerEntranceInfo;
        C26354AVy.LIZ.getClass();
        boolean LIZ = C26354AVy.LIZ();
        User userData = getUserData();
        if (userData != null && (viewerEntranceInfo = userData.viewerEntranceInfo) != null) {
            z = viewerEntranceInfo.getCanShowEntrance();
        } else {
            z = false;
        }
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        if (!LIZ || !z || !isLogin || !isFromMain()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavCustomActionAssem
    public List<EnumC235829Ni> configHiddenByOthersActionList() {
        return C47261Igj.LJJIJ(EnumC235829Ni.LiveEvent);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavCustomActionAssem
    public List<EnumC235829Ni> configHideActionList() {
        return C47261Igj.LJJIJ(EnumC235829Ni.LiveEvent);
    }

    public List<InterfaceC55643Lsd> getChildScenes() {
        return new ArrayList();
    }

    @Override // X.InterfaceC55643Lsd
    public String getSceneId() {
        return MineNavBarViewerEntranceAssem.class.getName();
    }

    public final void showViewerEntranceTips() {
        C26192APs c26192APs = this.entranceView;
        if (c26192APs != null) {
            c26192APs.postDelayed(new ARunnableS40S0100000_4(this, 72), 500L);
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

    private final boolean checkIfNeedAnimation() {
        ViewerEntranceInfo viewerEntranceInfo;
        ViewerEntranceInfo viewerEntranceInfo2;
        ViewerEntranceInfo viewerEntranceInfo3;
        if ((getViewerHistorySetting() == 2 && (getUnAuthorizedClickNum() >= 3 || this.hasShowInOnceAppSession)) || getUnReadViewerCount() <= 0) {
            return false;
        }
        if ((C26197APx.LIZLLL() && (getViewerHistorySetting() == 2 || getUnReadViewerCount() == 1)) || !C26343AVn.LIZIZ() || !noNeedAvoidance()) {
            return false;
        }
        if (this.lastShowUserInfo == null) {
            User user = this.pendingShowUserInfo;
            if (user != null && (viewerEntranceInfo3 = user.viewerEntranceInfo) != null && viewerEntranceInfo3.getUnReadViewerCount() > 0) {
                return true;
            }
        } else {
            User user2 = this.pendingShowUserInfo;
            if (user2 != null && (viewerEntranceInfo = user2.viewerEntranceInfo) != null) {
                int unReadViewerCount = viewerEntranceInfo.getUnReadViewerCount();
                User user3 = this.lastShowUserInfo;
                if (user3 != null && (viewerEntranceInfo2 = user3.viewerEntranceInfo) != null) {
                    int unReadViewerCount2 = viewerEntranceInfo2.getUnReadViewerCount();
                    if (unReadViewerCount > 0 && unReadViewerCount2 == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final List<UrlModel> getAvatarUrlModels() {
        ViewerEntranceInfo viewerEntranceInfo;
        User userData = getUserData();
        if (userData != null && (viewerEntranceInfo = userData.viewerEntranceInfo) != null) {
            return viewerEntranceInfo.getLatestViewerAvatarThumbList();
        }
        return null;
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
        if (!isChangingUser() && !shouldShowProfileViewerGuide() && !C26343AVn.LJFF(getUserData()) && !C26343AVn.LIZJ) {
            return true;
        }
        return false;
    }

    private final boolean shouldShowProfileViewerGuide() {
        if (C26149AOb.LIZ()) {
            return AQ9.LIZIZ(getUserData(), isFromMain(), true);
        }
        return AQ9.LIZ(getUserData(), isFromMain(), true);
    }

    private final void updateViewerEntranceInfo() {
        IAccountUserService LJIILL;
        ViewerEntranceInfo viewerEntranceInfo;
        ViewerEntranceInfo viewerEntranceInfo2;
        int unReadViewerCount = getUnReadViewerCount();
        List<UrlModel> avatarUrlModels = getAvatarUrlModels();
        User userData = getUserData();
        if (userData != null && (viewerEntranceInfo2 = userData.viewerEntranceInfo) != null) {
            viewerEntranceInfo2.setUnReadViewerCount(0);
        }
        User userData2 = getUserData();
        if (userData2 != null && (viewerEntranceInfo = userData2.viewerEntranceInfo) != null) {
            viewerEntranceInfo.setLatestViewerAvatarThumbList(null);
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

    public final int getUnReadViewerCount() {
        ViewerEntranceInfo viewerEntranceInfo;
        User userData = getUserData();
        if (userData != null && (viewerEntranceInfo = userData.viewerEntranceInfo) != null) {
            return viewerEntranceInfo.getUnReadViewerCount();
        }
        return 0;
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

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavCustomActionAssem
    public View initCustomAction() {
        boolean shouldShowViewerEntrance = shouldShowViewerEntrance();
        Context context = getContext();
        C26192APs c26192APs = null;
        if (context != null && shouldShowViewerEntrance) {
            c26192APs = new C26192APs(context);
        }
        this.entranceView = c26192APs;
        if (c26192APs != null) {
            c26192APs.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(this, 150)));
        }
        return this.entranceView;
    }

    @Override // X.InterfaceC55643Lsd
    public boolean isSceneActive() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavCustomActionAssem, com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public void onCreate() {
        int i;
        ProfileViewModel LIZ;
        super.onCreate();
        if (shouldShowViewerEntrance()) {
            if (C26197APx.LIZ()) {
                ActivityStack.addAppBackGroundListener(this.onBackgroundListener);
            }
            requestDisplayAction();
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9MP
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C234999Kd) obj).LIZIZ;
                }
            }, new AqS170S0100000_4(this, 727));
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9MN
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PL) obj).LIZJ;
                }
            }, new AqS170S0100000_4(this, 728));
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9MO
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C9PL) obj).LJ);
                }
            }, C235659Mr.LJLIL);
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null && (LIZ = AFB.LIZ(LIZLLL)) != null) {
                JediViewModel.wv0(LIZ, C26156AOi.LJLIL, null, new AqS170S0100000_4(new AqS170S0100000_4(this, 729), (InterfaceC88472Yns<? super APY, C76800UCe>) 959), 2, null);
            }
        } else {
            hideAction();
        }
        C9IL c9il = C9IL.NAV;
        String lowerCase = "HAS_PROFILE_VIEWER".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, true, c9il, lowerCase, isVisible());
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null) {
            i = LIZ2.hashCode();
        } else {
            i = 0;
        }
        C9XU.LIZ(i, this);
    }

    @Override // X.C8W0
    public void onDestroy() {
        super.onDestroy();
        if (shouldShowViewerEntrance() && C26197APx.LIZ()) {
            ActivityStack.removeAppBackGroundListener(this.onBackgroundListener);
        }
    }

    @Override // X.C8W0
    public void onPause() {
        super.onPause();
        if (shouldShowViewerEntrance()) {
            this.onShowReported = false;
        }
    }

    @Override // X.C8W0
    public void onResume() {
        Boolean bool;
        HomeTabAbility LJIL;
        User user;
        ViewerEntranceInfo viewerEntranceInfo;
        super.onResume();
        if (shouldShowViewerEntrance()) {
            if (C26197APx.LIZ()) {
                C26192APs c26192APs = this.entranceView;
                if (c26192APs != null) {
                    c26192APs.LIZLLL();
                }
                if (this.pendingShowUserInfo != null && isProfileTabShown() && (user = this.pendingShowUserInfo) != null && (viewerEntranceInfo = user.viewerEntranceInfo) != null) {
                    tryShowViewerEntrance(viewerEntranceInfo, true);
                }
            }
            if (!this.onShowReported) {
                C26335AVf.LJIILLIIL(getViewerHistorySettingMob(), getUnReadViewerCount(), "show");
                this.currentStyle = EnumC26196APw.NORMAL;
            }
            this.onShowReported = true;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onResume");
            MainActivityScope LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(this);
            if (LJJLIIIJJIZ != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJIZ)) != null) {
                bool = Boolean.valueOf(LJIL.zW("USER"));
            } else {
                bool = null;
            }
            LIZ.append(bool);
            X1D.LIZIZ(LIZ);
        }
    }

    public InterfaceC55643Lsd parentScene() {
        return C56319M8l.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public EnumC235829Ni getActionType() {
        return EnumC235829Ni.ProfileViewer;
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

    private final void mobNewStyleProfileViewerEntranceShow(EnumC26196APw enumC26196APw) {
        AQ2.LIZ(enumC26196APw, getViewerHistorySettingMob(), getUnReadViewerCount(), "show");
        this.onShowReported = true;
        this.currentStyle = enumC26196APw;
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

    private final void tryShowViewerEntrance(ViewerEntranceInfo viewerEntranceInfo, boolean z) {
        OSZ osz;
        boolean checkEntranceIsShowing;
        List<UrlModel> latestViewerAvatarThumbList;
        Object obj;
        C26192APs c26192APs = this.entranceView;
        if (c26192APs == null) {
            return;
        }
        int unReadViewerCount = viewerEntranceInfo.getUnReadViewerCount();
        if (unReadViewerCount > 0) {
            if (getViewerHistorySetting() != 1 || (latestViewerAvatarThumbList = viewerEntranceInfo.getLatestViewerAvatarThumbList()) == null || latestViewerAvatarThumbList.isEmpty()) {
                if (getUnAuthorizedClickNum() >= 3 || this.hasShowInOnceAppSession) {
                    osz = new OSZ(null, 0);
                } else {
                    osz = new OSZ(null, Integer.valueOf(unReadViewerCount));
                }
            } else {
                List<UrlModel> latestViewerAvatarThumbList2 = viewerEntranceInfo.getLatestViewerAvatarThumbList();
                if (latestViewerAvatarThumbList2 != null) {
                    obj = ListProtector.get(latestViewerAvatarThumbList2, 0);
                } else {
                    obj = null;
                }
                osz = new OSZ(obj, Integer.valueOf(unReadViewerCount));
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
                    startAnimation();
                }
                this.lastShowUserInfo = this.pendingShowUserInfo;
                this.pendingShowUserInfo = null;
            }
        } else {
            this.lastShowUserInfo = this.pendingShowUserInfo;
            this.pendingShowUserInfo = null;
        }
        bindStaticView(viewerEntranceInfo, intValue, urlModel);
    }

    @Override // X.G27
    public void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        InterfaceC82683Wch interfaceC82683Wch = this.profileViewerBubble;
        if (interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) {
            interfaceC82683Wch.dismiss();
        }
    }

    private final void bindStaticView(ViewerEntranceInfo viewerEntranceInfo, int i, UrlModel urlModel) {
        C26192APs c26192APs = this.entranceView;
        if (c26192APs != null) {
            boolean z = true;
            int i2 = 0;
            if (C26197APx.LIZIZ() == 16) {
                List<UrlModel> latestViewerAvatarThumbList = viewerEntranceInfo.getLatestViewerAvatarThumbList();
                if (getViewerHistorySetting() != 1) {
                    z = false;
                }
                c26192APs.LJFF(latestViewerAvatarThumbList, z);
            } else {
                c26192APs.setIconAvatarUrl(urlModel);
            }
            c26192APs.setUnReadNum(i);
            if (!viewerEntranceInfo.getCanShowEntrance()) {
                i2 = 8;
            }
            c26192APs.setVisibility(i2);
            String string = c26192APs.getResources().getString(R.string.amu);
            o.LJIIIIZZ(string, "resources.getString(R.st…rofile_btn_profile_views)");
            c26192APs.setContentDescription(string);
            h0.LJIJI(c26192APs.LIZ(R.id.eye), new IDaS90S0000000_4(2));
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

    public static /* synthetic */ void tryShowViewerEntrance$default(MineNavBarViewerEntranceAssem mineNavBarViewerEntranceAssem, ViewerEntranceInfo viewerEntranceInfo, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        mineNavBarViewerEntranceAssem.tryShowViewerEntrance(viewerEntranceInfo, z);
    }

    public static /* synthetic */ void bindUIOptimizationAnimation$default(MineNavBarViewerEntranceAssem mineNavBarViewerEntranceAssem, C26192APs c26192APs, int i, List list, Integer num, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        mineNavBarViewerEntranceAssem.bindUIOptimizationAnimation(c26192APs, i, list, num);
    }
}
