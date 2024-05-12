package com.ss.android.ugc.aweme.setting.ui;

import X.ADL;
import X.AEA;
import X.AEB;
import X.AEC;
import X.AEG;
import X.AEL;
import X.AEP;
import X.AET;
import X.AEW;
import X.AG2;
import X.AG6;
import X.AV9;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C03880Dg;
import X.C05L;
import X.C107794Kx;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C188727au;
import X.C1A7;
import X.C1DH;
import X.C2068389v;
import X.C234549Ik;
import X.C235119Kp;
import X.C252709vu;
import X.C25788AAe;
import X.C25851ACp;
import X.C25859ACx;
import X.C25860ACy;
import X.C25876ADo;
import X.C26045AKb;
import X.C29S;
import X.C2NU;
import X.C2YJ;
import X.C31993Ch3;
import X.C36922EeM;
import X.C39284FbM;
import X.C3C5;
import X.C40106Foc;
import X.C43212Gxc;
import X.C44019HPj;
import X.C44847Hit;
import X.C47654In4;
import X.C47957Irx;
import X.C4LD;
import X.C53042Krm;
import X.C53140KtM;
import X.C53262KvK;
import X.C54154LNe;
import X.C61717OKb;
import X.C61720OKe;
import X.C62011OVj;
import X.C62016OVo;
import X.C65300Pk0;
import X.C65429Pm5;
import X.C67629QgT;
import X.C68922R3e;
import X.C69084R9k;
import X.C6ZT;
import X.C73969T1h;
import X.C76800UCe;
import X.C76L;
import X.C78840Uwu;
import X.C78857UxB;
import X.C78939UyV;
import X.C78966Uyw;
import X.C79004UzY;
import X.C79045V0n;
import X.C85595XiZ;
import X.C85799Xlr;
import X.C85800Xls;
import X.C86393XvR;
import X.C86951YAp;
import X.C90903hW;
import X.DialogC25756A8y;
import X.EF7;
import X.EOO;
import X.ExecutorC142245i8;
import X.FMX;
import X.GGS;
import X.HG3;
import X.IFM;
import X.IG4;
import X.InterfaceC28616BKy;
import X.InterfaceC65784Pro;
import X.InterfaceC70769Rq1;
import X.InterfaceC71291RyR;
import X.InterfaceC73573Su9;
import X.InterfaceC85801Xlt;
import X.InterfaceC86003Zc;
import X.LEA;
import X.MDS;
import X.OHT;
import X.Q0C;
import X.QD3;
import X.R5K;
import X.R5L;
import X.RBX;
import X.RunnableC65751PrH;
import X.S3I;
import X.S3L;
import X.SWI;
import X.SYL;
import X.T16;
import X.ViewOnClickListenerC85790Xli;
import X.W5F;
import X.W5U;
import X.X1D;
import X.XXB;
import X.Z8A;
import Y.ACListenerS21S0101000_2;
import Y.ACListenerS21S0201000_3;
import Y.ACListenerS22S0101000_3;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS26S0101000_8;
import Y.ACListenerS28S0101000_10;
import Y.ACListenerS29S0101000_12;
import Y.ACListenerS30S0101000_13;
import Y.ACListenerS31S0101000_14;
import Y.ACListenerS32S0101000_15;
import Y.ACListenerS35S0100000_15;
import Y.ACListenerS55S0000000_15;
import Y.AObjectS10S0001000_5;
import Y.AObjectS11S0001000_6;
import Y.AObjectS12S0001000_7;
import Y.AObjectS14S0001000_13;
import Y.AObjectS21S0001000_5;
import Y.AObjectS42S0101000_5;
import Y.AObjectS47S0101000_2;
import Y.AObjectS52S0101000_7;
import Y.ARunnableS11S0101000_7;
import Y.AfS28S1100000_15;
import Y.IDCListenerS10S0101000;
import Y.IDRunnableS6S0101000;
import Y.IDxS312S0100000_15;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.ActivityCenterEntranceExperiment;
import com.ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.bl.IBenchmarkService;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.OrderCenterEntry;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.SmartLockService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.setting.api.PromoteEntryCheckApi;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage;
import com.ss.android.ugc.aweme.setting.serverpush.model.JoinBetaEntrance;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.aweme.setting.ui.cell.SettingFooterCell;
import com.ss.android.ugc.aweme.setting.ui.cell.SettingHeaderCell;
import com.ss.android.ugc.aweme.setting.ui.cell.SettingUnLoginCell;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.ug.settings.UgcPermission;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.e1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS102S0101000_15;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.AqS68S1100000_15;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes16.dex */
public abstract class SettingNewVersionFragment extends BaseSettingFragment implements LEA, InterfaceC85801Xlt {
    public static final Integer DEFAULT_RIGHT_ICON_SIZE = Integer.valueOf(C17N.LJIILL(20.0d));
    public AG2 backgroundAudio;
    public AG2 commercialContentLibrary;
    public ADL headerUnit;
    public AG2 mAboutAmeItem;
    public AEG mAboutDivider;
    public AG2 mAboutUnit;
    public AG2 mAccessibility;
    public AG2 mAccountAndSafetyUnit;
    public AEG mAccountDivider;
    public AG2 mActivityCenterItem;
    public List<Aweme> mAwemeList;
    public AG2 mBetaItem;
    public AG2 mBusinessAccount;
    public AEG mCacheDivider;
    public AG2 mCheckUpdate;
    public AG2 mClearCacheItem;
    public int mClickCount;
    public AG2 mCommentWatchHistoryItem;
    public AG2 mCommonProtocolItem;
    public AG2 mCommunityGuidelinesItem;
    public AEG mContentDivider;
    public AG2 mContentPreferenceItem;
    public AG2 mCopyRightPolicyItem;
    public AG2 mDataSaver;
    public AG2 mFamilyPairingItem;
    public AG2 mFeedbackAndHelpItem;
    public AG2 mHelperCenter;
    public AG2 mImPressumItem;
    public AG2 mInsights;
    public AG2 mJoinAmplify;
    public AG2 mJoinTesters;
    public long mLastTime;
    public AG2 mLiveEventsItem;
    public AG2 mLiveReplay;
    public AG2 mLiveUnit;
    public DialogC25756A8y mLoadingDialog;
    public AG2 mLocalLiveWallpaper;
    public AEG mLoginDivider;
    public C25860ACy mLogout;
    public AG2 mManageSaveAccountItem;
    public AG2 mMicroApp;
    public AG2 mMusInviteFriend;
    public AG2 mMusicItem;
    public AG2 mMusicUnit;
    public AG2 mMyQrCode;
    public AG2 mMyWalletItem;
    public AG2 mNotificationManagerItem;
    public AG2 mOfflineMode;
    public AG2 mOpenDebugTest;
    public InterfaceC71291RyR mOrderCenterEntry;
    public AG2 mOrderCenterItem;
    public AG2 mPlayback;
    public SYL mPowerList;
    public AG2 mPowerMode;
    public AG2 mPrivacyHighlightsForTeensItem;
    public AG2 mPrivacyManagerUnit;
    public AG2 mPrivacyPolicyItem;
    public AG2 mPromote;
    public AG2 mProtocolItem;
    public AG2 mSafetyCenter;
    public AG2 mScreenTimeItem;
    public AG2 mSettingAds;
    public AEW mSettingUnLoginUnit;
    public C85799Xlr mSettingsFooterContainer;
    public AG2 mShareProfileItem;
    public AG2 mSubscriptionItem;
    public AEG mSupportAndAboutDivider;
    public AEG mSupportTabDivider;
    public AG2 mSupportUnit;
    public AG2 mSwitchAccountItem;
    public C252709vu mTitleBar;
    public C25851ACp mUnitManger;
    public AG2 mWhatsNewItem;
    public IPipFeedService pipFeedService;
    public ViewGroup rootView;
    public AG2 securityCenter;
    public View statusBar;
    public HashSet<AG6<AEC>> unloginGoneView;

    private void clickOpenDebugTest() {
    }

    private void clickWhatsNew() {
    }

    public static void com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment_com_bytedance_tux_status_loading_TuxLoadingDialogHUD_show(DialogC25756A8y dialogC25756A8y) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "-3116374080853993053")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    private void initOrderCenterEntry() {
        OrderCenterEntry LJ = ECommerceService.createIECommerceServicebyMonsterPlugin(false).orderCenterService().LJ();
        this.mOrderCenterEntry = LJ;
        LJ.LIZJ(getLifecycle(), new XXB(this));
    }

    public static /* synthetic */ void lambda$initUnits$13(View view) {
    }

    public static /* synthetic */ void lambda$initUnits$4(View view) {
    }

    public static /* synthetic */ void qm(SettingNewVersionFragment settingNewVersionFragment) {
        settingNewVersionFragment.lambda$showLoadingDialog$122();
    }

    public abstract boolean canShowLiveEventsRedDot();

    public abstract void checkForUpdate();

    public abstract void clickBeta();

    public abstract void clickClearCache();

    public abstract void clickCommunityGuidelines();

    public void clickContentPreference() {
    }

    public abstract void clickCopyrightPolicy();

    public abstract void clickCreatorsPortal();

    public abstract void clickFeedbackAndHelp();

    public abstract void clickHelpCenter();

    public void clickImpressum() {
    }

    public void clickInviteFriend() {
    }

    public abstract void clickLiveEvents();

    public abstract void clickLiveRelay();

    public abstract void clickLiveSubscription();

    public void clickMyQrCode() {
    }

    public abstract void clickMyWallet();

    public abstract void clickNotificationSettings();

    public abstract void clickPrivacyPolicy();

    public abstract void clickPrivacySettings();

    public abstract void clickProAccount();

    public abstract void clickSafetyCenter();

    public void clickStoryHistory() {
    }

    public abstract void clickTermsOfUse();

    public void clickWatchHistory() {
    }

    public int getLayout() {
        return -1;
    }

    public int getMicroAppVersionCode() {
        return 0;
    }

    public abstract AG6[] getViewsHiddenOnLogout();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    public abstract void showChooseAccountDialog(AV9 av9);

    public abstract void showLogoutDialog();

    private void clickAccessibility() {
        SmartRouter.buildRoute(this, "aweme://setting/accessibility").open();
    }

    private void clickDataSaver() {
        SmartRouter.buildRoute(this, "aweme://setting/datasaver").open();
        FMX.onEventV3("enter_data_saver");
    }

    private void clickLiveWallpaper() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("live_photo_manage", c188727au.LIZ);
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://livewallpaper");
        buildRoute.withParam("from", "setting");
        buildRoute.open();
    }

    private void clickOfflineMode() {
        C86951YAp.LIZIZ.LIZLLL(this);
    }

    private void clickPlayback() {
        SmartRouter.buildRoute(this, "aweme://setting/playback").open();
    }

    private void clickPowerMode() {
        SmartRouter.buildRoute(this, "aweme://setting/powermode").open();
    }

    private void clickScreenTime() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "click_button");
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("enter_teen_protection", c188727au.LIZ);
        a.LJIIIZ().LJFF(mo49getActivity(), "snp_enter_wellbeing");
    }

    private void clickShareProfile() {
        ActivityC45651qj mo49getActivity;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("click_share_person", c188727au.LIZ);
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null && (mo49getActivity = mo49getActivity()) != null) {
            C4LD.LIZ.LIZIZ(null, mo49getActivity, curUser, this.mAwemeList, "");
        }
    }

    private void initPromote() {
        this.mPromote.LJIIIZ(false);
    }

    private void initUnitManger() {
        AG2 ag2;
        C25851ACp c25851ACp = new C25851ACp(this.mPowerList);
        this.mUnitManger = c25851ACp;
        c25851ACp.LIZ.LLLF.LJZL(SettingHeaderCell.class);
        this.mUnitManger.LIZ.LLLF.LJZL(SettingFooterCell.class);
        this.mUnitManger.LIZ.LLLF.LJZL(SettingUnLoginCell.class);
        this.mUnitManger.LIZ(this.headerUnit);
        this.mUnitManger.LIZ(this.mAccountDivider);
        this.mUnitManger.LIZ(this.mSettingUnLoginUnit);
        this.mUnitManger.LIZ(this.mAccountAndSafetyUnit);
        this.mUnitManger.LIZ(this.mPrivacyManagerUnit);
        this.mUnitManger.LIZ(this.securityCenter);
        this.mUnitManger.LIZ(this.mPromote);
        this.mUnitManger.LIZ(this.mInsights);
        this.mUnitManger.LIZ(this.mOrderCenterItem);
        this.mUnitManger.LIZ(this.mMyWalletItem);
        this.mUnitManger.LIZ(this.mMyQrCode);
        this.mUnitManger.LIZ(this.mShareProfileItem);
        this.mUnitManger.LIZ(this.mMusInviteFriend);
        this.mUnitManger.LIZ(this.mContentDivider);
        this.mUnitManger.LIZ(this.mNotificationManagerItem);
        this.mUnitManger.LIZ(this.mLiveUnit);
        this.mUnitManger.LIZ(this.mLiveEventsItem);
        if (SWI.LIZIZ.LJFF()) {
            this.mUnitManger.LIZ(this.mMusicUnit);
        }
        this.mUnitManger.LIZ(this.mSubscriptionItem);
        this.mUnitManger.LIZ(this.mMusicItem);
        if (((ActivityCenterEntranceExperiment.ActivityCenterSettingModel) ActivityCenterEntranceExperiment.LIZIZ.getValue()).enable) {
            this.mUnitManger.LIZ(this.mActivityCenterItem);
        } else {
            this.mUnitManger.LIZ(this.mCommentWatchHistoryItem);
        }
        this.mUnitManger.LIZ(this.mContentPreferenceItem);
        this.mUnitManger.LIZ(this.backgroundAudio);
        this.mUnitManger.LIZ(this.mLiveReplay);
        this.mUnitManger.LIZ(this.mSettingAds);
        if (IFM.LIZ || IG4.LIZ() || this.pipFeedService.LIZLLL()) {
            this.mUnitManger.LIZ(this.mPlayback);
        }
        this.mUnitManger.LIZ(this.commercialContentLibrary);
        this.mUnitManger.LIZ(this.mCommonProtocolItem);
        this.mUnitManger.LIZ(this.mScreenTimeItem);
        this.mUnitManger.LIZ(this.mFamilyPairingItem);
        this.mUnitManger.LIZ(this.mAccessibility);
        this.mUnitManger.LIZ(this.mPowerMode);
        this.mUnitManger.LIZ(this.mMicroApp);
        this.mUnitManger.LIZ(this.mJoinAmplify);
        this.mUnitManger.LIZ(this.mCacheDivider);
        if (C86951YAp.LIZIZ.LJ() && (ag2 = this.mOfflineMode) != null) {
            this.mUnitManger.LIZ(ag2);
        }
        this.mUnitManger.LIZ(this.mClearCacheItem);
        this.mUnitManger.LIZ(this.mDataSaver);
        this.mUnitManger.LIZ(this.mLocalLiveWallpaper);
        this.mUnitManger.LIZ(this.mCheckUpdate);
        this.mUnitManger.LIZ(this.mSupportAndAboutDivider);
        this.mUnitManger.LIZ(this.mBetaItem);
        this.mUnitManger.LIZ(this.mFeedbackAndHelpItem);
        this.mUnitManger.LIZ(this.mSupportUnit);
        this.mUnitManger.LIZ(this.mAboutUnit);
        this.mUnitManger.LIZ(this.mOpenDebugTest);
        this.mUnitManger.LIZ(this.mLoginDivider);
        AG2 ag22 = this.mManageSaveAccountItem;
        if (ag22 != null) {
            this.mUnitManger.LIZ(ag22);
        }
        this.mUnitManger.LIZ(this.mSwitchAccountItem);
        this.mUnitManger.LIZ(this.mLogout);
        this.mUnitManger.LIZ(this.mSettingsFooterContainer);
    }

    private void initUnits() {
        ACListenerS30S0101000_13 aCListenerS30S0101000_13;
        ACListenerS21S0101000_2 aCListenerS21S0101000_2;
        ACListenerS21S0101000_2 aCListenerS21S0101000_22;
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.headerUnit = new ADL(new C25876ADo());
        String text = getString(R.string.qxv);
        String title = getString(R.string.qxw);
        AET cellVariant = AET.NORMAL;
        ACListenerS55S0000000_15 aCListenerS55S0000000_15 = new ACListenerS55S0000000_15(1);
        C2068389v c2068389v = new C2068389v();
        lambda$initUnits$5(c2068389v);
        o.LJIIIZ(text, "text");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(cellVariant, "cellVariant");
        this.mSettingUnLoginUnit = new AEW(new AEL(text, 0, title, cellVariant, aCListenerS55S0000000_15, c2068389v, null, false, 16256));
        String string = getString(R.string.r2b);
        C2068389v c2068389v2 = new C2068389v();
        lambda$initUnits$6(c2068389v2);
        this.mAccountAndSafetyUnit = new AG2(new AEP(string, c2068389v2, new ACListenerS24S0101000_5(6, this, 0), "account_and_safety"));
        String string2 = getString(R.string.qm);
        AObjectS14S0001000_13 aObjectS14S0001000_13 = new AObjectS14S0001000_13(3, 0);
        C2068389v c2068389v3 = new C2068389v();
        aObjectS14S0001000_13.invoke(c2068389v3);
        int i = 1;
        this.mPrivacyManagerUnit = new AG2(new AEP(string2, c2068389v3, new ACListenerS31S0101000_14(1, this, 2), "privacy_manager"));
        String string3 = getString(R.string.r2d);
        C2068389v c2068389v4 = new C2068389v();
        lambda$initUnits$10(c2068389v4);
        this.securityCenter = new AG2(new AEP(string3, c2068389v4, new ACListenerS22S0101000_3(1, this, 9), "security_center"));
        String string4 = getString(R.string.phc);
        C2068389v c2068389v5 = new C2068389v();
        lambda$initUnits$12(c2068389v5);
        this.mPromote = new AG2(new AEP(string4, c2068389v5, new ACListenerS55S0000000_15(0), null, false));
        String string5 = getString(R.string.quw);
        C2068389v c2068389v6 = new C2068389v();
        lambda$initUnits$14(c2068389v6);
        this.mInsights = new AG2(new AEP(string5, c2068389v6, new IDCListenerS10S0101000(4, this, 0), null, false));
        String string6 = getString(R.string.r9v);
        C2068389v c2068389v7 = new C2068389v();
        lambda$initUnits$16(c2068389v7);
        this.mOrderCenterItem = new AG2(new AEP(string6, c2068389v7, new ACListenerS29S0101000_12(4, this, 4), "order_center", false));
        String string7 = getString(R.string.ttc);
        C2068389v c2068389v8 = new C2068389v();
        lambda$initUnits$18(c2068389v8);
        this.mMyWalletItem = new AG2(new AEP(string7, c2068389v8, new ACListenerS21S0101000_2(1, this, 13), "my_wallet"));
        String string8 = getString(R.string.qv0);
        C2068389v c2068389v9 = new C2068389v();
        lambda$initUnits$20(c2068389v9);
        this.mMyQrCode = new AG2(new AEP(string8, c2068389v9, new ACListenerS24S0101000_5(2, this, 12), null, false));
        String string9 = getString(R.string.qwx);
        C2068389v c2068389v10 = new C2068389v();
        lambda$initUnits$22(c2068389v10);
        this.mShareProfileItem = new AG2(new AEP(string9, c2068389v10, new ACListenerS24S0101000_5(4, this, 6), "share_profile"));
        C2068389v c2068389v11 = new C2068389v();
        lambda$initUnits$24(c2068389v11);
        this.mMusInviteFriend = new AG2(new AEP(" ", c2068389v11, new ACListenerS26S0101000_8(2, this, 1), null, false));
        String string10 = getString(R.string.qv1);
        C2068389v c2068389v12 = new C2068389v();
        lambda$initUnits$26(c2068389v12);
        this.mNotificationManagerItem = new AG2(new AEP(string10, c2068389v12, new ACListenerS32S0101000_15(3, this, 0), "notification_manager"));
        String string11 = getString(R.string.htc);
        C2068389v c2068389v13 = new C2068389v();
        lambda$initUnits$28(c2068389v13);
        this.mLiveUnit = new AG2(new AEP(string11, c2068389v13, new ACListenerS32S0101000_15(1, context, 1), "live", true));
        String string12 = getString(R.string.pds);
        C2068389v c2068389v14 = new C2068389v();
        lambda$initUnits$30(c2068389v14);
        this.mLiveEventsItem = new AG2(new AEP(string12, c2068389v14, new ACListenerS24S0101000_5(4, this, 14), "live_events", false));
        String string13 = getString(R.string.bb2);
        C2068389v c2068389v15 = new C2068389v();
        lambda$initUnits$32(c2068389v15);
        this.mMusicUnit = new AG2(new AEP(string13, c2068389v15, new ACListenerS24S0101000_5(4, context, 15), "music", true));
        String string14 = getString(R.string.r05);
        AObjectS11S0001000_6 aObjectS11S0001000_6 = new AObjectS11S0001000_6(2, 3);
        C2068389v c2068389v16 = new C2068389v();
        aObjectS11S0001000_6.invoke(c2068389v16);
        this.mCommonProtocolItem = new AG2(new AEP(string14, c2068389v16, new ACListenerS32S0101000_15(3, this, 5), "common_protocol"));
        String string15 = getString(R.string.dk3);
        C2068389v c2068389v17 = new C2068389v();
        lambda$initUnits$36(c2068389v17);
        this.mCommentWatchHistoryItem = new AG2(new AEP(string15, c2068389v17, new ACListenerS28S0101000_10(5, this, 6), "comment_watch_history", ((RBX) HG3.LJIILL()).isLogin()));
        String string16 = getString(R.string.qd8);
        C2068389v c2068389v18 = new C2068389v();
        lambda$initUnits$38(c2068389v18);
        this.mActivityCenterItem = new AG2(new AEP(string16, c2068389v18, new ACListenerS28S0101000_10(1, this, 7), "activity_center", ((RBX) HG3.LJIILL()).isLogin()));
        String string17 = getString(R.string.qu7);
        C2068389v c2068389v19 = new C2068389v();
        lambda$initUnits$40(c2068389v19);
        this.mContentPreferenceItem = new AG2(new AEP(string17, c2068389v19, new ACListenerS30S0101000_13(3, this, 3), "content_preference"));
        String string18 = getString(R.string.bv2);
        C2068389v c2068389v20 = new C2068389v();
        lambda$initUnits$42(c2068389v20);
        this.backgroundAudio = new AG2(new AEP(string18, c2068389v20, new ACListenerS30S0101000_13(2, this, 0), "background_audio", false));
        String string19 = getString(R.string.n6d);
        C2068389v c2068389v21 = new C2068389v();
        lambda$initUnits$44(c2068389v21);
        this.mLiveReplay = new AG2(new AEP(string19, c2068389v21, new ACListenerS24S0101000_5(3, this, 1), "notification_manager", false));
        String adsTitle = getAdsTitle();
        C2068389v c2068389v22 = new C2068389v();
        lambda$initUnits$46(c2068389v22);
        this.mSettingAds = new AG2(new AEP(adsTitle, c2068389v22, new ACListenerS32S0101000_15(4, this, 13), "setting_ads", false));
        String string20 = getString(R.string.v0);
        C2068389v c2068389v23 = new C2068389v();
        lambda$initUnits$48(c2068389v23);
        this.commercialContentLibrary = new AG2(new AEP(string20, c2068389v23, new ACListenerS22S0101000_3(2, this, 13), "commercial_content_library", false));
        String string21 = getString(R.string.qat);
        C2068389v c2068389v24 = new C2068389v();
        lambda$initUnits$50(c2068389v24);
        this.mScreenTimeItem = new AG2(new AEP(string21, c2068389v24, new ACListenerS22S0101000_3(1, this, 1), "digital_wellbeing"));
        String string22 = getString(R.string.n2);
        C2068389v c2068389v25 = new C2068389v();
        lambda$initUnits$52(c2068389v25);
        this.mFamilyPairingItem = new AG2(new AEP(string22, c2068389v25, new ACListenerS22S0101000_3(1, this, 2), "family_pairing", false));
        String string23 = getString(R.string.a9s);
        C2068389v c2068389v26 = new C2068389v();
        lambda$initUnits$54(c2068389v26);
        this.mAccessibility = new AG2(new AEP(string23, c2068389v26, new ACListenerS32S0101000_15(3, this, 10), "accessibility"));
        String string24 = getString(R.string.jc5);
        C2068389v c2068389v27 = new C2068389v();
        lambda$initUnits$56(c2068389v27);
        this.mPlayback = new AG2(new AEP(string24, c2068389v27, new ACListenerS24S0101000_5(4, this, 2), "playback"));
        String string25 = getString(R.string.c3l);
        C2068389v c2068389v28 = new C2068389v();
        lambda$initUnits$58(c2068389v28);
        this.mPowerMode = new AG2(new AEP(string25, c2068389v28, new IDCListenerS10S0101000(5, this, 8), "powermode"));
        C2068389v c2068389v29 = new C2068389v();
        lambda$initUnits$60(c2068389v29);
        ACListenerS22S0101000_3 aCListenerS22S0101000_3 = null;
        this.mMicroApp = new AG2(new AEP("", c2068389v29, null, null));
        C2068389v c2068389v30 = new C2068389v();
        lambda$initUnits$61(c2068389v30);
        this.mJoinAmplify = new AG2(new AEP(" ", c2068389v30, new ACListenerS21S0101000_2(2, this, 1), "join_amplify", false));
        String string26 = getString(R.string.dfh);
        C2068389v c2068389v31 = new C2068389v();
        lambda$initUnits$63(c2068389v31);
        this.mClearCacheItem = new AG2(new AEP(string26, c2068389v31, new ACListenerS32S0101000_15(4, this, 12), "clear_cache"));
        if (!SpeedModeServiceImpl.LJII().LJFF()) {
            String string27 = getString(R.string.eed);
            C2068389v c2068389v32 = new C2068389v();
            lambda$initUnits$65(c2068389v32);
            if (C47654In4.LIZLLL()) {
                aCListenerS21S0101000_22 = new ACListenerS21S0101000_2(4, this, 11);
            } else {
                aCListenerS21S0101000_22 = null;
            }
            this.mDataSaver = new AG2(new AEP(string27, c2068389v32, aCListenerS21S0101000_22, null, false));
        } else {
            String string28 = getString(R.string.cj_);
            C2068389v c2068389v33 = new C2068389v();
            lambda$initUnits$67(c2068389v33);
            if (C47654In4.LIZLLL()) {
                aCListenerS30S0101000_13 = new ACListenerS30S0101000_13(2, this, 9);
            } else {
                aCListenerS30S0101000_13 = null;
            }
            this.mDataSaver = new AG2(new AEP(string28, c2068389v33, aCListenerS30S0101000_13, null, false));
        }
        if (C86951YAp.LIZIZ.LJ()) {
            String string29 = getString(R.string.j9p);
            C2068389v c2068389v34 = new C2068389v();
            lambda$initUnits$69(c2068389v34);
            this.mOfflineMode = new AG2(new AEP(string29, c2068389v34, new ViewOnClickListenerC85790Xli(i, this), null, ((RBX) HG3.LJIILL()).isLogin()));
        }
        String string30 = getString(R.string.ttf);
        C2068389v c2068389v35 = new C2068389v();
        lambda$initUnits$71(c2068389v35);
        this.mLocalLiveWallpaper = new AG2(new AEP(string30, c2068389v35, new ACListenerS22S0101000_3(2, this, 12), null, false));
        String string31 = getString(R.string.cpf);
        C2068389v c2068389v36 = new C2068389v();
        lambda$initUnits$73(c2068389v36);
        this.mCheckUpdate = new AG2(new AEP(string31, c2068389v36, new ACListenerS31S0101000_14(1, this, 3), null, false));
        String title2 = getString(R.string.c72);
        C2068389v c2068389v37 = new C2068389v();
        lambda$initUnits$75(c2068389v37);
        ACListenerS21S0101000_2 aCListenerS21S0101000_23 = new ACListenerS21S0101000_2(2, this, 0);
        o.LJIIIZ(title2, "title");
        this.mBetaItem = new AG2(new AEP(title2, c2068389v37, aCListenerS21S0101000_23, null, false, 8388600));
        String string32 = getString(R.string.ie6);
        C2068389v c2068389v38 = new C2068389v();
        lambda$initUnits$77(c2068389v38);
        this.mFeedbackAndHelpItem = new AG2(new AEP(string32, c2068389v38, new ACListenerS22S0101000_3(1, this, 11), "feedback_and_help"));
        String string33 = getString(R.string.geu);
        C2068389v c2068389v39 = new C2068389v();
        lambda$initUnits$79(c2068389v39);
        this.mHelperCenter = new AG2(new AEP(string33, c2068389v39, new ACListenerS30S0101000_13(2, this, 2), "helper_center"));
        String string34 = getString(R.string.q7y);
        C2068389v c2068389v40 = new C2068389v();
        lambda$initUnits$81(c2068389v40);
        this.mSafetyCenter = new AG2(new AEP(string34, c2068389v40, new IDCListenerS10S0101000(2, this, 2), "safety_center"));
        String string35 = getString(R.string.oe9);
        C2068389v c2068389v41 = new C2068389v();
        lambda$initUnits$83(c2068389v41);
        this.mSubscriptionItem = new AG2(new AEP(string35, c2068389v41, new ACListenerS35S0100000_15(this, 128), "live_subscription"));
        String string36 = getString(R.string.drq);
        C2068389v c2068389v42 = new C2068389v();
        lambda$initUnits$85(c2068389v42);
        this.mCommunityGuidelinesItem = new AG2(new AEP(string36, c2068389v42, new ACListenerS24S0101000_5(2, this, 9), "community_guidelines"));
        String string37 = getString(R.string.pi_);
        C2068389v c2068389v43 = new C2068389v();
        lambda$initUnits$87(c2068389v43);
        this.mProtocolItem = new AG2(new AEP(string37, c2068389v43, new IDCListenerS10S0101000(3, this, 5), "terms_of_use"));
        String string38 = getString(R.string.p9w);
        AObjectS12S0001000_7 aObjectS12S0001000_7 = new AObjectS12S0001000_7(2, 1);
        C2068389v c2068389v44 = new C2068389v();
        aObjectS12S0001000_7.invoke(c2068389v44);
        this.mPrivacyPolicyItem = new AG2(new AEP(string38, c2068389v44, new ACListenerS22S0101000_3(2, this, 4), "privacy_policy"));
        final String LJJIII = a.LJFF().LJJIII();
        if (!LJJIII.isEmpty()) {
            String string39 = getString(R.string.p9v);
            C2068389v c2068389v45 = new C2068389v();
            lambda$initUnits$91(c2068389v45);
            this.mPrivacyHighlightsForTeensItem = new AG2(new AEP(string39, c2068389v45, new View.OnClickListener() { // from class: X.Xlx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingNewVersionFragment.lambda$initUnits$92(LJJIII, view);
                }
            }, "privacy_highlights_for_teens"));
        }
        String string40 = getString(R.string.dwf);
        C2068389v c2068389v46 = new C2068389v();
        lambda$initUnits$93(c2068389v46);
        this.mCopyRightPolicyItem = new AG2(new AEP(string40, c2068389v46, new ACListenerS32S0101000_15(4, this, 8), "copyright_policy"));
        String string41 = getString(R.string.hkt);
        C2068389v c2068389v47 = new C2068389v();
        lambda$initUnits$95(c2068389v47);
        if (showJoinTest()) {
            aCListenerS21S0101000_2 = new ACListenerS21S0101000_2(4, this, 4);
        } else {
            aCListenerS21S0101000_2 = null;
        }
        this.mJoinTesters = new AG2(new AEP(string41, c2068389v47, aCListenerS21S0101000_2, "join_testers", showJoinTest()));
        String string42 = getString(R.string.ef0);
        C2068389v c2068389v48 = new C2068389v();
        lambda$initUnits$97(c2068389v48);
        this.mOpenDebugTest = new AG2(new AEP(string42, c2068389v48, new ACListenerS32S0101000_15(1, this, 4), null, false));
        C2068389v c2068389v49 = new C2068389v();
        lambda$initUnits$99(c2068389v49);
        this.mWhatsNewItem = new AG2(new AEP("What's New", c2068389v49, new ACListenerS26S0101000_8(1, this, 3), null, true));
        String string43 = getString(R.string.a80);
        C2068389v c2068389v50 = new C2068389v();
        lambda$initUnits$101(c2068389v50);
        this.mAboutAmeItem = new AG2(new AEP(string43, c2068389v50, new ACListenerS21S0101000_2(1, this, 3), null, false));
        String string44 = getString(R.string.qtl);
        C2068389v c2068389v51 = new C2068389v();
        lambda$initUnits$103(c2068389v51);
        if (showImpressum()) {
            aCListenerS22S0101000_3 = new ACListenerS22S0101000_3(1, this, 7);
        }
        this.mImPressumItem = new AG2(new AEP(string44, c2068389v51, aCListenerS22S0101000_3, null, showImpressum()));
        String string45 = getString(R.string.r2k);
        C2068389v c2068389v52 = new C2068389v();
        lambda$initUnits$105(c2068389v52);
        this.mSupportUnit = new AG2(new AEP(string45, c2068389v52, new ACListenerS32S0101000_15(3, context, 8), null, true));
        String string46 = getString(R.string.r20);
        C2068389v c2068389v53 = new C2068389v();
        lambda$initUnits$107(c2068389v53);
        this.mAboutUnit = new AG2(new AEP(string46, c2068389v53, new ACListenerS21S0101000_2(3, context, 4), null, true));
        String string47 = getString(R.string.dpf);
        C2068389v c2068389v54 = new C2068389v();
        lambda$initUnits$109(c2068389v54);
        this.mSwitchAccountItem = new AG2(new AEP(string47, c2068389v54, new ACListenerS32S0101000_15(0, this, 4), "switch_account", false));
        maybeCreateRemoveAccountOption();
        C2068389v c2068389v55 = new C2068389v();
        c2068389v55.LIZ = R.raw.icon_logout_fill;
        String title3 = getString(R.string.hyf);
        ACListenerS21S0101000_2 aCListenerS21S0101000_24 = new ACListenerS21S0101000_2(1, this, 6);
        o.LJIIIZ(title3, "title");
        this.mLogout = new C25860ACy(new C25859ACx(title3, c2068389v55, aCListenerS21S0101000_24, "logout", false, null, null, null, false, false, null, null, false, false, null, null, null, 8388592));
        this.mSettingsFooterContainer = new C85799Xlr(new C85800Xls("settings_footer_container", C79045V0n.LJI(R.attr.cl, getContext()).intValue(), new ACListenerS26S0101000_8(0, this, 3), new ACListenerS21S0101000_2(1, this, 14), "", 4, "", false, true, null));
        String string48 = getString(R.string.rw8);
        C2068389v c2068389v56 = new C2068389v();
        lambda$initUnits$112(c2068389v56);
        this.mMusicItem = new AG2(new AEP(string48, c2068389v56, new ACListenerS21S0201000_3(2, this, context, 4), "tiktok_music", false));
        String text2 = getString(R.string.r2b);
        o.LJIIIZ(text2, "text");
        this.mAccountDivider = new AEG(new AEB(text2, false, false, false, false, null, null, null, null, null, null, 16382));
        this.mContentDivider = new AEG(new AEB(getString(R.string.r2g)));
        this.mCacheDivider = new AEG(new AEB(getString(R.string.r2f)));
        this.mSupportTabDivider = new AEG(new AEB(getString(R.string.rxy)));
        this.mAboutDivider = new AEG(new AEB(getString(R.string.qwt)));
        this.mLoginDivider = new AEG(new AEB((CharSequence) getString(R.string.r2e), true));
        this.mSupportAndAboutDivider = new AEG(new AEB(getString(R.string.r28)));
    }

    private void joinTesters() {
        JoinBetaEntrance joinBetaEntrance = C25788AAe.LJLILLLLZI;
        if (joinBetaEntrance == null || TextUtils.isEmpty(joinBetaEntrance.url)) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://webview");
        buildRoute.withParam(UriProtector.parse(joinBetaEntrance.url));
        buildRoute.withParam("title", getString(R.string.hkt));
        buildRoute.open();
    }

    public static /* synthetic */ InterfaceC28616BKy lambda$onCreate$0() {
        return new C40106Foc();
    }

    public /* synthetic */ void lambda$onViewCreated$3() {
        this.mUnitManger.LIZLLL();
    }

    public /* synthetic */ void lambda$showLoadingDialog$122() {
        if (this.mLoadingDialog == null && getContext() != null) {
            this.mLoadingDialog = new DialogC25756A8y(getContext());
        }
        com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment_com_bytedance_tux_status_loading_TuxLoadingDialogHUD_show(this.mLoadingDialog);
    }

    private void logoutClickEvent() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("params_for_special", "uc_login");
        c188727au.LJIIIZ("uid", ((RBX) HG3.LJIILL()).getCurUserId());
        FMX.LJIIL("uc_user_logout_click", c188727au.LIZ);
        logout();
    }

    private boolean showJoinTest() {
        JoinBetaEntrance joinBetaEntrance = C25788AAe.LJLILLLLZI;
        if (joinBetaEntrance != null && ((joinBetaEntrance.show && !TextUtils.isEmpty(joinBetaEntrance.url)) || TextUtils.equals(EF7.LJIILIIL, "beta"))) {
            return true;
        }
        return false;
    }

    public void clickBackgroundAudio() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("click_background_audio", c188727au.LIZ);
        SmartRouter.buildRoute(this, "aweme://setting/background_audio").open();
    }

    public void clickCommonDisplaySettings() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("display_settings", c188727au.LIZ);
    }

    public void clickInsights() {
        AppLogNewUtils.onEventV3("click_insight", null);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("enter_insight_detail", C44847Hit.LIZIZ("click_insight", c188727au.LIZ, "enter_from", "settings_page").LIZ);
    }

    public void clickManageAccount() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        c188727au.LJIIIZ("enter_method", "click_button");
        c188727au.LJIIIZ("previous_page", "settings_page");
        FMX.LJIIL("enter_account_safety", c188727au.LIZ);
    }

    public void clickSecurityCenter() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("enter_account_security", c188727au.LIZ);
        SmartRouter.buildRoute(this, "//setting/security").open();
    }

    public C43212Gxc getImmersiveConfig() {
        GGS.LIZ.getClass();
        return GGS.LJFF;
    }

    public void initData() {
        AG2 ag2 = this.mOpenDebugTest;
        if (ag2 != null) {
            ag2.LJIILJJIL("Debug Test");
            this.mOpenDebugTest.LJIIIZ(false);
        }
        this.mAwemeList = C78966Uyw.LJLJJL;
        initStorageData();
    }

    public void initView() {
        C235119Kp c235119Kp = new C235119Kp();
        C78840Uwu.LJJIZ(c235119Kp, getString(R.string.dhz), new AObjectS47S0101000_2(2, this, 2));
        c235119Kp.LIZLLL = false;
        this.mTitleBar.setNavActions(c235119Kp);
        setWallpaperEntranceVisibility();
        setupMultiAccount();
        setupBetaAppEntrance();
        initOrderCenterEntry();
        setupLoginSectionDivider();
        setupScrollBackgroundColor();
        this.mPowerMode.LJIIIZ(false);
        if (C47654In4.LIZLLL()) {
            this.mDataSaver.LJIIIZ(true);
        }
        if ("googleplay".equals(EF7.LJIILIIL)) {
            C2YJ c2yj = C2YJ.LIZIZ;
            if ((c2yj.LIZ.getInappUpdateSwitchStrategy().intValue() == 3 || c2yj.LIZ.getInappUpdateSwitchStrategy().intValue() == 2) && UgCommonServiceImpl.LJIJ().LJIIIIZZ()) {
                this.mCheckUpdate.LJIIIZ(true);
            }
        }
        tryShowJoinAmplify();
        this.securityCenter.LJIIIZ(true);
        initPromote();
        if (C47957Irx.LIZIZ()) {
            this.backgroundAudio.LJIIIZ(true);
        }
        if (canShowLiveEvents()) {
            this.mLiveEventsItem.LJIIIZ(false);
            AG2 ag2 = this.mLiveEventsItem;
            ag2.getClass();
            ag2.LJIIJ(new AqS58S1100000_4(ag2, "click_live_event_icon", 30));
            AG2 ag22 = this.mLiveEventsItem;
            ag22.getClass();
            ag22.LJIIJ(new AqS58S1100000_4(ag22, 29));
            AG2 ag23 = this.mLiveEventsItem;
            ag23.getClass();
            ag23.LJIIJ(new AqS58S1100000_4(ag23, 26));
            if (canShowLiveEventsRedDot()) {
                C65429Pm5.LJ(((RBX) HG3.LJIILL()).getCurSecUserId(), "_has_see_live_events", Keva.getRepo("SettingsLiveEvents"), true);
                this.mLiveEventsItem.LJIILIIL(true);
            }
        }
        C234549Ik.LIZ.getClass();
        if (C234549Ik.LIZ() != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.mMyQrCode);
            this.mUnitManger.LIZJ(arrayList);
        }
    }

    public void setupLoginSectionDivider() {
        this.mLoginDivider.LJIIIZ(false);
        if (!HG3.LJIILL().isLogin()) {
            return;
        }
        this.mLoginDivider.LJIIIZ(true);
        this.mLoginDivider.LJIIL(getResources().getString(R.string.r2e));
    }

    public void setupMultiAccount() {
        this.mSwitchAccountItem.LJIIIZ(false);
        if (!HG3.LJIIIIZZ().isEnableMultiAccountLogin() || !((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        final SmartImageView smartImageView = new SmartImageView(getContext());
        Integer num = DEFAULT_RIGHT_ICON_SIZE;
        smartImageView.setLayoutParams(new ViewGroup.LayoutParams(num.intValue(), num.intValue()));
        W5F LJIIIIZZ = W5U.LJIIIIZZ(AccountService.LJIJ().LJFF().getAvatarUrl());
        int intValue = num.intValue();
        int intValue2 = num.intValue();
        LJIIIIZZ.LJII = intValue;
        LJIIIIZZ.LJIIIIZZ = intValue2;
        S3I s3i = new S3I();
        s3i.LIZ = true;
        LJIIIIZZ.LJIJJLI = new S3L(s3i);
        LJIIIIZZ.LJJIIJ = smartImageView;
        LJIIIIZZ.LIZLLL(new InterfaceC70769Rq1() { // from class: X.4lB
            @Override // X.InterfaceC70769Rq1
            public final void D1(android.net.Uri uri, C2047581v c2047581v) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void LJLLLLLL(android.net.Uri uri) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void T1(android.net.Uri uri, SmartImageView smartImageView2) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void s2(android.net.Uri uri, View view, Throwable th) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                SmartImageView smartImageView2 = SmartImageView.this;
                S3I s3i2 = new S3I();
                s3i2.LIZ = true;
                s3i2.LIZIZ = C17N.LJIILL(0.5d);
                s3i2.LIZJ = -7829368;
                smartImageView2.setCircleOptions(s3i2.LIZ());
            }
        });
        AG2 ag2 = this.mSwitchAccountItem;
        ag2.getClass();
        ag2.LJIIJ(new AqS135S0200000_4(ag2, smartImageView, 162));
        this.mSwitchAccountItem.LJIIIZ(true);
    }

    public void showLoadingDialog() {
        C1DH.LJJIJIIJI(new IDRunnableS6S0101000(6, this, 25));
    }

    private boolean canShowLiveEvents() {
        if (HG3.LJIILL().isLogin() && Z8A.LIZIZ.canShowProfileFixedEntrance()) {
            return true;
        }
        return false;
    }

    private void clickAboutAme() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (!INVOKESTATIC_com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(context)) {
            C05L.LIZLLL(context, R.string.img);
        } else {
            SmartRouter.buildRoute(this, "//about_activity").open();
        }
    }

    private void clickFamilyPairing() {
        a.LJIIIZ().LJ(mo49getActivity());
    }

    private void clickJoinAmplify() {
        try {
            SettingsManager.LIZLLL().getClass();
            UgcPermission ugcPermission = (UgcPermission) SettingsManager.LJII("ugc_permission_setting", UgcPermission.class);
            if (ugcPermission != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(this, "//webview");
                buildRoute.withParam(UriProtector.parse(ugcPermission.url));
                buildRoute.open();
            }
        } catch (Throwable unused) {
        }
    }

    private String getAdsTitle() {
        AdFreeSubscription LJIILL = a.LJIIJ().LJIILL();
        if (a.LJIIJ().LJJI() && LJIILL != null && LJIILL.getSubscriptionMode().intValue() == 1) {
            return getString(R.string.quo);
        }
        return getString(R.string.hz2);
    }

    public /* synthetic */ C76800UCe lambda$initView$118() {
        mo49getActivity().onBackPressed();
        return null;
    }

    private void maybeCreateRemoveAccountOption() {
        int i;
        if (C53262KvK.LIZIZ()) {
            return;
        }
        if (EOO.LIZ()) {
            i = R.string.jgz;
        } else {
            i = R.string.q_7;
        }
        String string = getString(i);
        C2068389v c2068389v = new C2068389v();
        lambda$maybeCreateRemoveAccountOption$114(c2068389v);
        IDCListenerS10S0101000 iDCListenerS10S0101000 = new IDCListenerS10S0101000(5, this, 6);
        boolean z = true;
        if ((!((Boolean) C53042Krm.LIZ.getValue()).booleanValue() && !((Boolean) C53140KtM.LIZ.getValue()).booleanValue() && !e1.LIZ(31744, "inbox_authority_switch", true, false)) || !((RBX) HG3.LJIILL()).isLogin()) {
            z = false;
        }
        this.mManageSaveAccountItem = new AG2(new AEP(string, c2068389v, iDCListenerS10S0101000, "manage_saved_account", z));
    }

    private void setWallpaperEntranceVisibility() {
        if (C62011OVj.LJ() || !C62016OVo.LIZ().getBoolean("keva_key_device_support_wallpaper", true)) {
            this.mLocalLiveWallpaper.LJIIIZ(false);
            return;
        }
        this.mLocalLiveWallpaper.LJIIIZ(true);
        AG2 ag2 = this.mLocalLiveWallpaper;
        AObjectS10S0001000_5 aObjectS10S0001000_5 = new AObjectS10S0001000_5(2, 5);
        C2068389v c2068389v = new C2068389v();
        aObjectS10S0001000_5.invoke(c2068389v);
        ag2.getClass();
        ag2.LJIIJ(new AqS135S0200000_4(ag2, c2068389v, 164));
    }

    private void setupBetaAppEntrance() {
        String str;
        if (!BetaAppExperiment.LIZJ() || (BetaAppExperiment.LJFF.getInt(BetaAppExperiment.LIZJ, -1) <= EF7.LJI() && !BetaAppExperiment.LJII)) {
            this.mBetaItem.LJIIIZ(false);
            return;
        }
        this.mBetaItem.LJIIIZ(true);
        AG2 ag2 = this.mBetaItem;
        ag2.getClass();
        ag2.LJIIJ(new AqS58S1100000_4(ag2, "tiktok_beta_setting_entrance_show", 30));
        AG2 ag22 = this.mBetaItem;
        C188727au c188727au = new C188727au();
        Keva keva = BetaAppExperiment.LJFF;
        String string = keva.getString(BetaAppExperiment.LIZLLL, "");
        o.LJIIIIZZ(string, "keva.getString(KEY_BITS_VERSION_NAME, \"\")");
        c188727au.LJIIIZ("beta_version", string);
        c188727au.LIZLLL(keva.getInt(BetaAppExperiment.LIZJ, -1), "beta_build");
        String str2 = "1";
        if (BetaAppExperiment.LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("has_new_label", str);
        if (!BetaAppExperiment.LJII) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("has_update", str2);
        Map<String, String> map = c188727au.LIZ;
        ag22.getClass();
        o.LJIIIZ(map, "map");
        ag22.LJIIJ(new AqS135S0200000_4(ag22, (AG2) map, (Map<String, String>) 163));
        if (!BetaAppExperiment.LIZ()) {
            return;
        }
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        tuxTextView.setPadding(C17N.LJIILL(5.0d), 0, C17N.LJIILL(5.0d), 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer LJI = C79045V0n.LJI(R.attr.eb, getContext());
        if (LJI != null) {
            gradientDrawable.setColor(LJI.intValue());
        }
        gradientDrawable.setCornerRadius(C17N.LJIILL(8.0d));
        tuxTextView.setBackground(gradientDrawable);
        tuxTextView.setGravity(17);
        tuxTextView.setText(getString(R.string.c8m));
        tuxTextView.setTuxFont(72);
        Integer LJI2 = C79045V0n.LJI(R.attr.dj, getContext());
        if (LJI2 != null) {
            tuxTextView.setTextColor(LJI2.intValue());
        }
        AG2 ag23 = this.mBetaItem;
        ag23.getClass();
        ag23.LJIIJ(new AqS135S0200000_4(ag23, tuxTextView, 162));
    }

    private void setupScrollBackgroundColor() {
        if (getContext() != null) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(R.attr.c9, typedValue, true);
            C85799Xlr c85799Xlr = this.mSettingsFooterContainer;
            int i = typedValue.data;
            c85799Xlr.getClass();
            c85799Xlr.LJIIJ(new AqS102S0101000_15(c85799Xlr, i, 7));
        }
    }

    private boolean showBackgroundAudio() {
        return C47957Irx.LIZIZ();
    }

    private boolean showImpressum() {
        return a.LJIIZILJ().LJIJI();
    }

    private void tryShowJoinAmplify() {
        AG2 ag2;
        try {
            SettingsManager.LIZLLL().getClass();
            UgcPermission ugcPermission = (UgcPermission) SettingsManager.LJII("ugc_permission_setting", UgcPermission.class);
            if (ugcPermission != null && !TextUtils.isEmpty(ugcPermission.desc) && (ag2 = this.mJoinAmplify) != null) {
                ag2.LJIIIZ(true);
                this.mJoinAmplify.LJIILJJIL(ugcPermission.desc);
            }
        } catch (Throwable unused) {
        }
    }

    public void addAccount() {
        MultiAccountService.LJ().LIZ();
        if (((RBX) HG3.LJIILL()).allUidList().size() < 8) {
            MultiAccountService.LJ().LIZLLL(mo49getActivity(), "", "add_account_setting", null, null);
            return;
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        C05L.LIZLLL(context, R.string.bf3);
    }

    public void dismissLoadingDialog() {
        DialogC25756A8y dialogC25756A8y;
        if (isActive() && (dialogC25756A8y = this.mLoadingDialog) != null && dialogC25756A8y.isShowing()) {
            this.mLoadingDialog.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment, X.InterfaceC85801Xlt
    /* renamed from: getActivity */
    public /* bridge */ /* synthetic */ Activity mo49getActivity() {
        return mo49getActivity();
    }

    @Override // X.InterfaceC85801Xlt
    public AG6<AEC>[] getBaseUnit() {
        return getViewsHiddenOnLogout();
    }

    public void hideItemByBlackList() {
        List<String> blackList = a.LJIIZILJ().LIZ();
        if (C79004UzY.LJJIFFI(blackList)) {
            return;
        }
        C25851ACp unitManager = this.mUnitManger;
        o.LJIIIZ(unitManager, "unitManager");
        o.LJIIIZ(blackList, "blackList");
        List<AG6<?>> LIZIZ = unitManager.LIZIZ();
        int size = LIZIZ.size();
        for (int i = 0; i < size; i++) {
            AG6 ag6 = (AG6) ListProtector.get(LIZIZ, i);
            Object LIZ = ag6.LJFF().LIZ();
            if ((LIZ instanceof String) && !TextUtils.isEmpty((CharSequence) LIZ) && blackList.contains(LIZ)) {
                ag6.LJIIIZ(false);
            }
        }
    }

    public void initStorageData() {
        if (!C78939UyV.LJJIJ()) {
            return;
        }
        AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.Xlu
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
                SettingNewVersionFragment.lambda$initStorageData$121(interfaceC73573Su9);
            }
        }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS312S0100000_15(this, 0));
    }

    public void initUnloginSetting() {
        boolean z;
        if (((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        if (this.unloginGoneView == null) {
            this.unloginGoneView = new HashSet<>();
        }
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("show_unlogin_push_setting_page", false);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            z = false;
        }
        if (z) {
            this.mNotificationManagerItem.LJIIIZ(true);
        }
        HashSet<AG6<AEC>> unloginGoneView = this.unloginGoneView;
        o.LJIIIZ(unloginGoneView, "unloginGoneView");
        AqS162S0200000_15 aqS162S0200000_15 = new AqS162S0200000_15((InterfaceC85801Xlt) this, (InterfaceC85801Xlt) unloginGoneView, (HashSet<AG6<AEC>>) 81);
        AEW settingUnLoginUnit = getSettingUnLoginUnit();
        settingUnLoginUnit.LJIIIZ(true);
        settingUnLoginUnit.LJIIJ(new AqS177S0100000_11(new ACListenerS35S0100000_15(aqS162S0200000_15, 262), 25));
        for (AG6<AEC> ag6 : getBaseUnit()) {
            if (ag6.LJFF().LIZIZ()) {
                unloginGoneView.add(ag6);
                ag6.LJIIIZ(false);
            }
        }
    }

    public void logout() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (!AVExternalServiceImpl.LIZ().publishService().isMainCameraPublishingOrStoryCameraPublishing()) {
            if (!INVOKESTATIC_com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(context)) {
                C05L.LIZLLL(context, R.string.img);
                return;
            } else {
                if (!isActive()) {
                    return;
                }
                showLogoutDialog();
                return;
            }
        }
        C05L.LIZLLL(context, R.string.piy);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (C78966Uyw.LJLJJL != this.mAwemeList) {
            return;
        }
        C78966Uyw.LJLJJL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        IBenchmarkService createIBenchmarkServicebyMonsterPlugin = BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false);
        if (createIBenchmarkServicebyMonsterPlugin != null) {
            createIBenchmarkServicebyMonsterPlugin.startBenchmark(1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        IBenchmarkService createIBenchmarkServicebyMonsterPlugin = BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false);
        if (createIBenchmarkServicebyMonsterPlugin != null) {
            createIBenchmarkServicebyMonsterPlugin.stopBenchmark();
        }
    }

    @Override // X.InterfaceC85801Xlt
    public AEW getSettingUnLoginUnit() {
        return this.mSettingUnLoginUnit;
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    public static /* synthetic */ void lambda$initStorageData$121(InterfaceC73573Su9 interfaceC73573Su9) {
        try {
            interfaceC73573Su9.onNext(Boolean.valueOf(DiskManagerPage.Gl()));
            interfaceC73573Su9.onComplete();
        } catch (Exception e) {
            interfaceC73573Su9.onError(e);
        }
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$10(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_shield_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$100(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickWhatsNew();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$101(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_exclamation_mark_circle;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$102(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickAboutAme();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$103(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_info_circle;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$104(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickImpressum();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$105(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_message_smile_fill;
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$107(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_info_circle_fill;
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$109(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_arrow_left_right_circle_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$11(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickSecurityCenter();
    }

    public /* synthetic */ void lambda$initUnits$110(View view) {
        showChooseAccountDialog(new AV9("settings_page", "switch_account", null, "", ""));
    }

    public /* synthetic */ void lambda$initUnits$111(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        logoutClickEvent();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$112(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_music_note_s_alt_fill;
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$12(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_fire;
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$14(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_line_chart_fill;
        return null;
    }

    public void lambda$initUnits$15(View view) {
        C1A7.LJIILLIIL("show_insights_red").LJI("show_insights_red", false);
        clickInsights();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$16(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_shopping_bag_tick_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$17(View view) {
        InterfaceC71291RyR interfaceC71291RyR;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (C6ZT.LIZ(view) || mo49getActivity == null || (interfaceC71291RyR = this.mOrderCenterEntry) == null) {
            return;
        }
        interfaceC71291RyR.LIZ(mo49getActivity);
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$18(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_wallet_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$19(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickMyWallet();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$20(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_qr_code_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$21(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickMyQrCode();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$22(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_arrow_turn_up_right_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$23(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickShareProfile();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$24(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_two_person;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$25(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickInviteFriend();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$26(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_bell_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$27(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickNotificationSettings();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$28(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_live_tv_fill;
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$30(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_calendar_star_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$31(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickLiveEvents();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$32(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_music_note_s_alt;
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$34(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_a_rectangle_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$35(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickCommonDisplaySettings();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$36(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_clock_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$37(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickWatchHistory();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$38(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_clock_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$39(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickWatchHistory();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$40(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_video_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$41(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickContentPreference();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$42(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_headphone_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$43(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickBackgroundAudio();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$44(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_replay_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$45(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickLiveRelay();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$46(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_horn_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$47(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        a.LJIIJ().LJIIIZ(getContext());
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$48(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_book_fill;
        return null;
    }

    public void lambda$initUnits$49(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        String LJIILLIIL = a.LJIIJ().LJIILLIIL();
        if (!TextUtils.isEmpty(LJIILLIIL)) {
            SmartRoute buildRoute = SmartRouter.buildRoute(this, "//webview");
            buildRoute.withParam("url", LJIILLIIL);
            buildRoute.open();
            FMX.LJIIL("click_commercial_content_lib_link", new C188727au().LIZ);
        }
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$5(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_person_fill;
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$50(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_hourglass_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$51(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickScreenTime();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$52(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_family_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$53(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickFamilyPairing();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$54(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_accessibility_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$55(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickAccessibility();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$56(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_play_rectangle_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$57(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickPlayback();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$58(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_low_battery;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$59(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickPowerMode();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$6(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_person_fill;
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$60(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_miniprogram;
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$61(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_eye_slash;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$62(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickJoinAmplify();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$63(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_trash_bin_fill;
        return null;
    }

    public void lambda$initUnits$64(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        AG2 ag2 = this.mClearCacheItem;
        if (ag2 != null && ((AEP) ag2.LJLIL).LLFZ) {
            ag2.LJIILIIL(false);
            C67629QgT.LIZ().storeLong("last_show_disk_manager_dot_time", System.currentTimeMillis());
            if (!C67629QgT.LIZ().getBoolean("has_show_disk_manager_dot", false)) {
                C67629QgT.LIZ().storeBoolean("has_show_disk_manager_dot", true);
            }
        }
        clickClearCache();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$65(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_drop_bolt_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$66(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickDataSaver();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$67(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_cell_site;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$68(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickDataSaver();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$69(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_cloud_arrow_down_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$7(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickManageAccount();
    }

    public /* synthetic */ void lambda$initUnits$70(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickOfflineMode();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$71(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_live_photo_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$72(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickLiveWallpaper();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$73(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_update_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$74(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        checkForUpdate();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$75(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_beaker_fill;
        return null;
    }

    public void lambda$initUnits$76(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        AG2 ag2 = this.mBetaItem;
        ag2.getClass();
        ag2.LJIIJ(new AqS135S0200000_4(ag2, (View) null, 162));
        clickBeta();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$77(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_flag_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$78(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickFeedbackAndHelp();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$79(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_question_mark_circle_ltr;
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$8(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_lock_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$80(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickHelpCenter();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$81(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_shield_plus;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$82(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickSafetyCenter();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$83(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_flag_star_fill;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$84(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickLiveSubscription();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$85(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_double_circle;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$86(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickCommunityGuidelines();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$87(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_book;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$88(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickTermsOfUse();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$89(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_document;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$9(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickPrivacySettings();
    }

    public /* synthetic */ void lambda$initUnits$90(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickPrivacyPolicy();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$91(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_document_umbrella;
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$93(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_copyright;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$94(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickCopyrightPolicy();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$95(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_beaker;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$96(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        joinTesters();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$97(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_lock;
        return null;
    }

    public /* synthetic */ void lambda$initUnits$98(View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        clickOpenDebugTest();
    }

    public static /* synthetic */ C76800UCe lambda$initUnits$99(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_question_mark_circle_ltr;
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$maybeCreateRemoveAccountOption$114(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_gear;
        return null;
    }

    public /* synthetic */ void lambda$maybeCreateRemoveAccountOption$115(View view) {
        SmartLockService.createISmartLockServicebyMonsterPlugin(false).loadCredentials(mo49getActivity(), true, new C44019HPj(this));
    }

    public /* synthetic */ C76800UCe lambda$onCreate$1(BaseFragmentViewModel baseFragmentViewModel) {
        baseFragmentViewModel.config(new AObjectS21S0001000_5(2, 5));
        baseFragmentViewModel.config(new AObjectS52S0101000_7(2, this, 18));
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$setWallpaperEntranceVisibility$119(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_live_wallpaper_fill;
        return null;
    }

    public void exit(View view) {
        C54154LNe.LJ("setting_2_profile", "click_back");
        if (mo49getActivity() != null) {
            mo49getActivity().finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        fragmentConfiguration(new AObjectS42S0101000_5(4, this, 56));
        this.pipFeedService = PipServiceImpl.LJJII();
        super.onCreate(bundle);
    }

    @QD3
    public void onEvent(C107794Kx c107794Kx) {
        if (TextUtils.equals("user", c107794Kx.LJLJJI) && getContext() != null) {
            IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(getContext(), this.rootView, c107794Kx);
        }
    }

    public void onUserInfoClick(View view) {
        String str = ((C85800Xls) this.mSettingsFooterContainer.LJLIL).LJLLI;
        Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            OHT.LIZ("user_info", str, context, C78857UxB.LJJIIJ(1476399119, "bpea-213"));
        } catch (Q0C e) {
            C36922EeM.LIZ(e);
        }
        C05L.LIZLLL(context, R.string.dfw);
    }

    public void onVersionClick(View view) {
        C86393XvR c86393XvR;
        String str;
        String str2;
        if (System.currentTimeMillis() - this.mLastTime < 500) {
            this.mClickCount++;
        } else {
            this.mClickCount = 0;
        }
        if (this.mClickCount >= 4) {
            C85799Xlr c85799Xlr = this.mSettingsFooterContainer;
            c85799Xlr.getClass();
            c85799Xlr.LJIIJ(new AqS102S0101000_15(c85799Xlr, 8));
            String serverDeviceId = AppLog.getServerDeviceId();
            String str3 = "";
            if (serverDeviceId == null) {
                serverDeviceId = "";
            }
            IAVSettingsService avsettingsConfig = AVExternalServiceImpl.LIZ().configService().avsettingsConfig();
            if (LiveOuterService.LJJJLL() != null) {
                c86393XvR = LiveOuterService.LJJJLL().LJJIJIL();
            } else {
                c86393XvR = null;
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UserId: ");
            LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
            sb.append(X1D.LIZIZ(LIZ));
            sb.append("\n");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("DeviceId: ");
            LIZ2.append(serverDeviceId);
            sb.append(X1D.LIZIZ(LIZ2));
            sb.append("\n");
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("UpdateVersionCode: ");
            LIZ3.append(EF7.LJFF());
            sb.append(X1D.LIZIZ(LIZ3));
            sb.append("\n");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Channel: ");
            LIZ4.append(EF7.LJIILIIL);
            sb.append(X1D.LIZIZ(LIZ4));
            sb.append("\n");
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("GitSHA: ");
            LIZ5.append(EF7.LJIIJJI);
            sb.append(X1D.LIZIZ(LIZ5));
            sb.append("\n");
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("VESDK: ");
            LIZ6.append(avsettingsConfig.getVESDKVersion());
            sb.append(X1D.LIZIZ(LIZ6));
            sb.append("\n");
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("EffectSdk: ");
            LIZ7.append(avsettingsConfig.getEffectVersion());
            sb.append(X1D.LIZIZ(LIZ7));
            sb.append("\n");
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("VmsdkAndroid: ");
            LIZ8.append("2.3.12-tt");
            sb.append(X1D.LIZIZ(LIZ8));
            sb.append("\n");
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append("LiveCore: ");
            if (c86393XvR == null) {
                str = "";
            } else {
                str = c86393XvR.getLiveCoreVersion();
            }
            LIZ9.append(str);
            sb.append(X1D.LIZIZ(LIZ9));
            sb.append("\n");
            StringBuilder LIZ10 = X1D.LIZ();
            LIZ10.append("RtcVersion: ");
            if (c86393XvR == null) {
                str2 = "";
            } else {
                str2 = c86393XvR.getRtcVersion();
            }
            LIZ10.append(str2);
            sb.append(X1D.LIZIZ(LIZ10));
            sb.append("\n");
            StringBuilder LIZ11 = X1D.LIZ();
            LIZ11.append("RtcDeviceID: ");
            if (c86393XvR != null) {
                str3 = c86393XvR.getRtcDeviceID();
            }
            LIZ11.append(str3);
            sb.append(X1D.LIZIZ(LIZ11));
            sb.append("\n");
            sb.append(AEA.LIZ());
            if (!TextUtils.isEmpty(EF7.LJIIL)) {
                StringBuilder LIZ12 = X1D.LIZ();
                LIZ12.append("\nBitsMRID: ");
                LIZ12.append(EF7.LJIIL);
                sb.append(X1D.LIZIZ(LIZ12));
                sb.append("\n");
            }
            UgCommonServiceImpl.LJIJ().LJII();
            String LIZLLL = C39284FbM.LIZLLL();
            if (!TextUtils.isEmpty(LIZLLL)) {
                sb.append("\nTag: ");
                sb.append(LIZLLL);
            }
            if (getMicroAppVersionCode() > 0) {
                sb.append("\n");
                StringBuilder LIZ13 = X1D.LIZ();
                LIZ13.append("MicroAppVersionCode: ");
                LIZ13.append(getMicroAppVersionCode());
                sb.append(X1D.LIZIZ(LIZ13));
            }
            C85799Xlr c85799Xlr2 = this.mSettingsFooterContainer;
            String text = sb.toString();
            c85799Xlr2.getClass();
            o.LJIIIZ(text, "text");
            c85799Xlr2.LJIIJ(new AqS68S1100000_15(c85799Xlr2, text, 11));
            this.mClickCount = 0;
        }
        this.mLastTime = System.currentTimeMillis();
    }

    private void clickPromote(int i, int i2) {
        PromoteEntryCheckApi.LIZ.getClass();
        C76L<PromoteEntryCheck> promoteEntryCheck = C61720OKe.LIZ().getPromoteEntryCheck("", "post", 0L, "");
        C61717OKb c61717OKb = new C61717OKb(i, i2);
        promoteEntryCheck.LJFF(new RunnableC65751PrH(promoteEntryCheck, c61717OKb), ExecutorC142245i8.LJLILLLLZI);
    }

    public void lambda$deleteSmartLockAccount$116(String str, C68922R3e c68922R3e) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("exit_method", "remove");
        c188727au.LJIIIZ("result", "success");
        FMX.LJIIL("exit_remove_account_window", c188727au.LIZ);
        SmartLockService.createISmartLockServicebyMonsterPlugin(false).deleteCredential(str, new C85595XiZ(this));
    }

    public void lambda$deleteSmartLockAccount$117(String str, Throwable th) {
        if (th instanceof C69084R9k) {
            C69084R9k c69084R9k = (C69084R9k) th;
            if (c69084R9k.getErrorCode() == 6 || c69084R9k.getErrorCode() == 10) {
                SmartLockService.createISmartLockServicebyMonsterPlugin(false).deleteCredential(str, new MDS(this));
            } else {
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIIZZ(R.string.gj5);
                c26045AKb.LJIIJ();
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("exit_method", "remove");
        c188727au.LJIIIZ("result", "failure");
        FMX.LJIIL("exit_remove_account_window", c188727au.LIZ);
    }

    public static void lambda$initUnits$106(Context context, View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        SmartRouter.buildRoute(context, "//setting/support").open();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("enter_settings_support", c188727au.LIZ);
    }

    public static void lambda$initUnits$108(Context context, View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        SmartRouter.buildRoute(context, "//setting/about").open();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("enter_settings_about", c188727au.LIZ);
    }

    public void lambda$initUnits$113(Context context, View view) {
        String str = "";
        try {
            SettingsManager.LIZLLL().getClass();
            String LJI = SettingsManager.LJI("music_subscription_url", "");
            o.LJIIIIZZ(LJI, "{\n        SettingsManage…ionUrl::class.java)\n    }");
            str = LJI;
        } catch (Exception unused) {
        }
        String LJ = a1.LJ(str, "&title=", getString(R.string.rw8));
        if (!TextUtils.isEmpty(LJ)) {
            SmartRouter.buildRoute(context, LJ).open();
        }
    }

    public static void lambda$initUnits$29(Context context, View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        SmartRouter.buildRoute(context, "//setting/live").open();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("enter_settings_live", c188727au.LIZ);
    }

    public static /* synthetic */ void lambda$initUnits$33(Context context, View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        SmartRouter.buildRoute(context, "//music/settings").open();
    }

    public static /* synthetic */ void lambda$initUnits$92(String str, View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "//webview");
        buildRoute.withParam(UriProtector.parse(str));
        buildRoute.withParam("use_webview_title", true);
        buildRoute.open();
    }

    public /* synthetic */ View lambda$onCreateView$2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16880lQ.LLLLIILL(layoutInflater, getLayout(), viewGroup, false);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.statusBar = view.findViewById(R.id.kej);
        this.rootView = (ViewGroup) view.findViewById(R.id.j71);
        this.mPowerList = (SYL) view.findViewById(R.id.e8t);
        this.mTitleBar = (C252709vu) view.findViewById(R.id.l_2);
        initUnits();
        initUnitManger();
        initView();
        initData();
        this.mUnitManger.LIZLLL();
        view.post(new ARunnableS11S0101000_7(8, this, 11));
    }

    public View com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment__onCreateView$___twin___(final LayoutInflater layoutInflater, final ViewGroup viewGroup, Bundle bundle) {
        return wrapOnCreateView(new InterfaceC65784Pro() { // from class: X.Xlw
            @Override // X.InterfaceC65784Pro
            public final Object invoke() {
                View lambda$onCreateView$2;
                lambda$onCreateView$2 = SettingNewVersionFragment.this.lambda$onCreateView$2(layoutInflater, viewGroup);
                return lambda$onCreateView$2;
            }
        });
    }

    public void deleteSmartLockAccount(String str, String str2, String str3) {
        R5L.LIZ(str, str3, 0, R5K.SMART_LOCK).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIIZILJ(new C31993Ch3(1, str2, this), new AfS28S1100000_15(this, str2, 3));
    }

    public static View com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(SettingNewVersionFragment settingNewVersionFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment__onCreateView$___twin___ = settingNewVersionFragment.com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment__onCreateView$___twin___ instanceof View)) {
            com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment__onCreateView$___twin___ = null;
        }
        if (com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment__onCreateView$___twin___, settingNewVersionFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment__onCreateView$___twin___, settingNewVersionFragment);
                C10A.LIZIZ(com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment__onCreateView$___twin___, settingNewVersionFragment);
                ActivityC45651qj mo49getActivity = settingNewVersionFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_ss_android_ugc_aweme_setting_ui_SettingNewVersionFragment__onCreateView$___twin___;
    }

    @Override // X.LEA
    public void onAccountResult(int i, boolean z, int i2, User user) {
        dismissLoadingDialog();
    }

    public void lambda$initOrderCenterEntry$120(boolean z, String str, String str2, String str3, String str4) {
        AG2 ag2 = this.mOrderCenterItem;
        if (ag2 != null) {
            ag2.LJIIIZ(z);
            this.mOrderCenterItem.LJIIL(str2);
            if (!TextUtils.isEmpty(str)) {
                this.mOrderCenterItem.LJIILJJIL(str);
            } else {
                this.mOrderCenterItem.LJIILJJIL(getString(R.string.r9v));
            }
            AG2 ag22 = this.mOrderCenterItem;
            if (AnonymousClass636.LJIILJJIL(getContext())) {
                str3 = str4;
            }
            ag22.getClass();
            ag22.LJIIJ(new AqS58S1100000_4(ag22, str3, 31));
        }
    }
}
