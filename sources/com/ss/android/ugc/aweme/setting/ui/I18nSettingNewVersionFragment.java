package com.ss.android.ugc.aweme.setting.ui;

import X.AAZ;
import X.AD7;
import X.ADD;
import X.AEC;
import X.AEP;
import X.AG0;
import X.AG2;
import X.AG4;
import X.AG5;
import X.AG6;
import X.AG9;
import X.AGJ;
import X.ARI;
import X.ARN;
import X.AV1;
import X.AV9;
import X.AWX;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.BLD;
import X.C03660Ck;
import X.C0F0;
import X.C0NY;
import X.C10K;
import X.C16880lQ;
import X.C1799074g;
import X.C188727au;
import X.C19N;
import X.C1A7;
import X.C2068389v;
import X.C235399Lr;
import X.C244689iy;
import X.C245319jz;
import X.C252669vq;
import X.C25727A7v;
import X.C25814ABe;
import X.C25934AFu;
import X.C26045AKb;
import X.C26093ALx;
import X.C26227ARb;
import X.C268713r;
import X.C2NU;
import X.C2YJ;
import X.C31457CWf;
import X.C36093EEn;
import X.C36459ESp;
import X.C36922EeM;
import X.C38281F0r;
import X.C38816FLg;
import X.C39386Fd0;
import X.C39579Fg7;
import X.C40322Fs6;
import X.C40599FwZ;
import X.C43212Gxc;
import X.C44847Hit;
import X.C46427IJz;
import X.C47192Ifc;
import X.C47959Irz;
import X.C4LD;
import X.C53097Ksf;
import X.C53262KvK;
import X.C55230Lly;
import X.C55247LmF;
import X.C59975NgJ;
import X.C5S1;
import X.C60191Njn;
import X.C61200O0e;
import X.C62046OWs;
import X.C62822Ol8;
import X.C65429Pm5;
import X.C65618Pp8;
import X.C68542QvC;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76800UCe;
import X.C76L;
import X.C770830u;
import X.C78472Uqy;
import X.C78496UrM;
import X.C78939UyV;
import X.C84763XOl;
import X.C85795Xln;
import X.C85796Xlo;
import X.C85797Xlp;
import X.C85799Xlr;
import X.C9NC;
import X.C9NE;
import X.C9TP;
import X.CallableC40387Ft9;
import X.EF7;
import X.EFJ;
import X.EnumC36092EEm;
import X.EnumC62934Omw;
import X.ExecutorC142245i8;
import X.FMX;
import X.GGS;
import X.HG3;
import X.InterfaceC1798974f;
import X.InterfaceC28616BKy;
import X.InterfaceC38821FLl;
import X.InterfaceC55251LmJ;
import X.InterfaceC65784Pro;
import X.InterfaceC73463SsN;
import X.InterfaceC73573Su9;
import X.InterfaceC92693kP;
import X.MG0;
import X.O0X;
import X.QD3;
import X.RBX;
import X.RunnableC65751PrH;
import X.T16;
import X.UPJ;
import X.UUF;
import X.W5F;
import X.W5U;
import X.X1D;
import X.Z8A;
import Y.ACListenerS35S0100000_15;
import Y.ALAdapterS12S0100000_15;
import Y.AObjectS16S0001000_15;
import Y.AObjectS22S0001000_6;
import Y.AObjectS42S0101000_5;
import Y.AObjectS45S0101000_13;
import Y.ARunnableS1S0010000_6;
import Y.AUListenerS102S0100000_15;
import Y.AUListenerS74S0101000_14;
import Y.AfS36S0101000_5;
import Y.AgS131S0100000_15;
import Y.IDAListenerS45S0200000_15;
import Y.IDrS51S0100000_13;
import Y.IDuS325S0100000_15;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.ActivityCenterEntranceExperiment;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.experiment.AnalyticsSDUISetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostAction;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.ss.android.ugc.aweme.services.LoginMethodService;
import com.ss.android.ugc.aweme.setting.api.LiveReplayApi;
import com.ss.android.ugc.aweme.setting.api.ProAccountUpdateStatusApi;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.model.LiveReplayEntranceResponse;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import defpackage.m0;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS68S1100000_15;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import yq4.a;

/* loaded from: classes16.dex */
public class I18nSettingNewVersionFragment extends SettingNewVersionFragment implements InterfaceC38821FLl, WeakHandler.IHandler {
    public List<String> goSettingList;
    public ValueAnimator mCurrentAnimator;
    public boolean mEverPaused;
    public int mServerRequestShowRedDot;
    public String mProcessId = "";
    public final C73318Sq2 mCompositeDisposable = new C73318Sq2();
    public InterfaceC92693kP consentLogDisposable = null;
    public String mEnterFrom = "";
    public String mEnterMethod = "";
    public final String SAVE_LOGIN_INFO_TAG = "saveLoginInfoTag";

    public static /* synthetic */ void Ro(I18nSettingNewVersionFragment i18nSettingNewVersionFragment, String str) {
        i18nSettingNewVersionFragment.lambda$initStorageData$13(str);
    }

    public static /* synthetic */ void Vo(I18nSettingNewVersionFragment i18nSettingNewVersionFragment, Throwable th) {
        i18nSettingNewVersionFragment.lambda$initStorageData$14(th);
    }

    public static /* synthetic */ C76800UCe Wo(I18nSettingNewVersionFragment i18nSettingNewVersionFragment, ARN arn) {
        return i18nSettingNewVersionFragment.lambda$showSaveInfoDialog$9(arn);
    }

    public static /* synthetic */ void dp(I18nSettingNewVersionFragment i18nSettingNewVersionFragment, ITpcConsentService iTpcConsentService) {
        i18nSettingNewVersionFragment.lambda$onResume$5(iTpcConsentService);
    }

    public static /* synthetic */ void fp(I18nSettingNewVersionFragment i18nSettingNewVersionFragment, C85797Xlp c85797Xlp) {
        i18nSettingNewVersionFragment.lambda$onPause$6(c85797Xlp);
    }

    private boolean isFragmentNavigation() {
        C25814ABe c25814ABe;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55230Lly.LIZJ(this, null), C25814ABe.class, "source_default_key");
        if (LIZLLL != null && (c25814ABe = (C25814ABe) LIZLLL.getSource()) != null) {
            return c25814ABe.LJLIL;
        }
        return false;
    }

    public Object lambda$clearCacheNoDiskManager$15() {
        C36922EeM.LIZLLL(3, "clear-cache", "start clear cache without disk manager");
        AVExternalServiceImpl.LIZ().configService().cacheConfig().clearEffectCache();
        cleanDir();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C39579Fg7.LJIJJ(mo49getActivity.getCacheDir());
        }
        VideoPreloadManager.LJIILJJIL().clearCache();
        C38816FLg.LJ(new ARunnableS1S0010000_6(1));
        C36922EeM.LIZLLL(3, "clear-cache", "finish clear cache without disk manager");
        return null;
    }

    public static /* synthetic */ void lambda$openPrivacyPolicyView$7(boolean z) {
    }

    public static /* synthetic */ C85797Xlp lambda$semisugar$$init$$0(ITpcConsentService iTpcConsentService, Activity activity) {
        return new C85797Xlp(iTpcConsentService, activity);
    }

    public static /* synthetic */ SettingsNewVersionActivityArgs lambda$semisugar$$init$$1() {
        return new SettingsNewVersionActivityArgs();
    }

    private void preloadShowCaseApi() {
        ADD.LIZ = null;
        ADD.LIZ(null, this.mCompositeDisposable, true);
    }

    private void setupHighlightAnimation() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 300);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new AUListenerS74S0101000_14(0, this, 1));
        ofInt.addListener(new IDAListenerS45S0200000_15(this, ofInt, 0));
        ofInt.setStartDelay(800L);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 300);
        ofInt2.setDuration(300L);
        ofInt2.addUpdateListener(new AUListenerS102S0100000_15(this, 11));
        ofInt2.addListener(new C85795Xln(this, ofInt2, ofInt));
        ofInt2.setStartDelay(500L);
        ofInt2.start();
    }

    private void showMusic() {
        boolean z;
        String str = "";
        try {
            SettingsManager.LIZLLL().getClass();
            String LJI = SettingsManager.LJI("music_subscription_url", "");
            o.LJIIIIZZ(LJI, "{\n        SettingsManage…ionUrl::class.java)\n    }");
            str = LJI;
        } catch (Exception unused) {
        }
        boolean z2 = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("show_tiktok_music_tab", false);
        } catch (Exception unused2) {
            z = false;
        }
        if (str.length() != 0 && (z || MG0.LIZ)) {
            z2 = true;
        }
        this.mMusicItem.LJIIIZ(z2);
    }

    @Override // X.InterfaceC38821FLl
    public void change(IESSettingsProxy iESSettingsProxy) {
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public int getLayout() {
        return R.layout.ckb;
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public AG6[] getViewsHiddenOnLogout() {
        boolean z;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("show_unlogin_push_setting_page", false);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            z = false;
        }
        if (z) {
            return new AG6[]{this.mMyWalletItem, this.mAccountAndSafetyUnit, this.mShareProfileItem, this.mAccessibility, this.mLiveEventsItem, this.mLogout, this.mMyQrCode, this.mSwitchAccountItem, this.securityCenter};
        }
        return new AG6[]{this.mMyWalletItem, this.mAccountAndSafetyUnit, this.mShareProfileItem, this.mNotificationManagerItem, this.mLiveEventsItem, this.mAccessibility, this.mLogout, this.mMyQrCode, this.mSwitchAccountItem, this.securityCenter};
    }

    public /* bridge */ /* synthetic */ void sync() {
    }

    public /* bridge */ /* synthetic */ void syncFail(Exception exc) {
    }

    private boolean canHighlightLiveEventsItem() {
        if ("notification_page".equals(this.mEnterFrom) && "click_live_events_move_announcement".equals(this.mEnterMethod)) {
            return hasInteractionWithLiveEvents();
        }
        return false;
    }

    private void checkCommercialContentLibrary() {
        this.commercialContentLibrary.LJIIIZ(!TextUtils.isEmpty(a.LJIIJ().LJIILLIIL()));
    }

    private void checkLiveReplay() {
        LiveReplayApi.LIZ.getClass();
        C76L<LiveReplayEntranceResponse> liveReplayEntrance = AG0.LIZ().getLiveReplayEntrance();
        AG4 ag4 = new AG4(this);
        liveReplayEntrance.LJFF(new RunnableC65751PrH(liveReplayEntrance, ag4), ExecutorC142245i8.LJLILLLLZI);
    }

    private void cleanDir() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(EF7.LIZIZ()).getAbsolutePath());
        LIZ.append("/aweme_monitor");
        File file = new File(X1D.LIZIZ(LIZ));
        if (file.exists()) {
            C16880lQ.LLLZZIL(file);
        }
    }

    private void clearCacheNoDiskManager() {
        C235399Lr c235399Lr = new C235399Lr("click_clean_cache_button");
        c235399Lr.LJ("enter_from", "settings_page", InterfaceC1798974f.LIZ);
        c235399Lr.LJIILIIL();
        C10K.LIZJ(new CallableC40387Ft9(2, this)).LJ(new AgS131S0100000_15(this, 7), C10K.LJIIIIZZ, null);
    }

    private boolean hasInteractionWithLiveEvents() {
        Keva repo = Keva.getRepo("SettingsLiveEvents");
        String curSecUserId = HG3.LJIILL().getCurSecUserId();
        boolean LIZLLL = m0.LIZLLL(curSecUserId, "_has_see_live_events", repo, false);
        if (m0.LIZLLL(curSecUserId, "_has_highlight_live_events", repo, false) || LIZLLL) {
            return false;
        }
        return true;
    }

    private void initUI() {
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.c9, typedValue, true);
        this.rootView.setBackgroundColor(typedValue.data);
        this.mTitleBar.setNavBackground(typedValue.data);
        this.mTitleBar.LJIILJJIL(false);
        this.mPowerList.LJIIJJI(new IDrS51S0100000_13(this, 4));
    }

    public static /* synthetic */ InterfaceC28616BKy lambda$onCreate$0() {
        return new BLD(0);
    }

    private File monitorDir() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(EF7.LIZIZ()).getAbsolutePath());
        LIZ.append("/aweme_monitor");
        File file = new File(X1D.LIZIZ(LIZ));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private boolean needShowAccountChangedWindow() {
        int i = this.mServerRequestShowRedDot;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    private boolean needShowRedDot() {
        if (this.mServerRequestShowRedDot == 1) {
            return true;
        }
        return false;
    }

    private void showLiveSubscription() {
        this.mSubscriptionItem.LJIIIZ(false);
    }

    private void updateLanguage() {
        this.mCommonProtocolItem.LJIILJJIL(getResources().getString(R.string.hpn));
    }

    private void verifyPreciseExposureExperiment() {
        boolean LIZ = e1.LIZ(31744, "verify_proaccount_server_exp", true, false);
        boolean LIZ2 = e1.LIZ(31744, "verify_proaccount_precise_exp", true, false);
        boolean LIZ3 = e1.LIZ(31744, "verify_proaccount_precise_did_exp", true, false);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("verify_proaccount_server_exp", String.valueOf(LIZ));
        c188727au.LJIIIZ("verify_proaccount_precise_exp", String.valueOf(LIZ2));
        c188727au.LJIIIZ("verify_proaccount_precise_did_exp", String.valueOf(LIZ3));
        FMX.LJIIL("proaccount_enter_for_experiment", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public boolean canShowLiveEventsRedDot() {
        if ("notification_page".equals(this.mEnterFrom) && "click_live_events_move_announcement".equals(this.mEnterMethod)) {
            return false;
        }
        return hasInteractionWithLiveEvents();
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickBeta() {
        String str;
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
        FMX.LJIIL("tiktok_beta_setting_entrance_click", c188727au.LIZ);
        String str3 = BetaAppExperiment.LIZIZ;
        if (!keva.contains(str3) && BetaAppExperiment.LIZ()) {
            keva.storeBoolean(str3, true);
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "//setting/beta_register");
        buildRoute.withParam("enter_from", "settings_page");
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickFeedbackAndHelp() {
        C38281F0r c38281F0r;
        String normalEntry;
        if (!INVOKESTATIC_com_ss_android_ugc_aweme_setting_ui_I18nSettingNewVersionFragment_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(getContext())) {
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("click_feedback_entrance", C44847Hit.LIZIZ("FAQ", C44847Hit.LIZIZ("enter_feedback_page", c188727au.LIZ, "enter_from", "settings").LIZ, "enter_from", "settings").LIZ);
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://webview");
        try {
            normalEntry = C2YJ.LIZIZ.LIZ.getFeedbackConf().getNormalEntry();
        } catch (Exception unused) {
            c38281F0r = new C38281F0r("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/");
            c38281F0r.LIZLLL("locale", C39386Fd0.LIZIZ(getContext()).getLanguage());
        }
        if (normalEntry != null) {
            C61200O0e.LIZLLL().LJII(normalEntry);
            return;
        }
        c38281F0r = new C38281F0r("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/");
        c38281F0r.LIZLLL("locale", C39386Fd0.LIZIZ(getContext()).getLanguage());
        if (EF7.LJIIIIZZ()) {
            c38281F0r.LIZ(1, "is_lite");
        }
        c38281F0r.LIZLLL("enter_from", "settings");
        buildRoute.withParam(UriProtector.parse(c38281F0r.LJ()));
        buildRoute.withParam("hide_nav_bar", true);
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickLiveSubscription() {
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "//live/container");
        buildRoute.withParam("fragment_type", "subscribe_info_list");
        buildRoute.open();
        FMX.onEventV3("live_subscription_entry_clicked");
        AD7.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickNotificationSettings() {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("previous_page", "settings_page");
        c188727au.LJIIIZ("enter_method", "click_button");
        if (C40322Fs6.LIZJ(getContext())) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJIIIZ("status", str);
        FMX.LJIIL("enter_notification_setting", c188727au.LIZ);
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("notification_setting");
        obtain.setLabelName("settings_page");
        FMX.onEvent(obtain);
        SmartRouter.buildRoute(this, "aweme://push_setting_manager").open();
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickPrivacySettings() {
        C235399Lr c235399Lr = new C235399Lr("enter_privacy_setting");
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        c235399Lr.LJ("previous_page", "settings_page", c1799074g);
        c235399Lr.LJ("enter_method", "click_button", c1799074g);
        c235399Lr.LJIILIIL();
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "//privacy/setting");
        buildRoute.withParam("key_launch_time", System.currentTimeMillis());
        buildRoute.withParam("key_launch_mode", 2);
        buildRoute.open();
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("privacy");
        obtain.setLabelName("settings");
        FMX.onEvent(obtain);
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickProAccount() {
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://creatortools");
        buildRoute.withParam("bundle_process_id", this.mProcessId);
        boolean z = true;
        buildRoute.withParam("HAS_PRELOAD", true);
        buildRoute.withParam("PRO_ENTER_FROM", "creator_tools");
        if (!needShowAccountChangedWindow() || !AD7.LIZJ()) {
            z = false;
        }
        buildRoute.withParam("bundle_show_account_dialog_when_start", z);
        buildRoute.open();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        c188727au.LJIIIZ("process_id", this.mProcessId);
        FMX.LJIIL("enter_creator_account", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickWatchHistory() {
        C62822Ol8 c62822Ol8 = ActivityCenterEntranceExperiment.LIZIZ;
        if (((ActivityCenterEntranceExperiment.ActivityCenterSettingModel) c62822Ol8.getValue()).enable) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "activity_center");
            FMX.LJIIL("enter_activity_history", c188727au.LIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((ActivityCenterEntranceExperiment.ActivityCenterSettingModel) c62822Ol8.getValue()).url);
            LIZ.append("%26grey_bg%3D");
            LIZ.append("1");
            SmartRouter.buildRoute(this, X1D.LIZIZ(LIZ)).open();
            return;
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", "settings_and_privacy");
        FMX.LJIIL("enter_activity_history", c188727au2.LIZ);
        SmartRouter.buildRoute(this, "aweme://hyd_action/ac_entry_uri?").open();
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public C43212Gxc getImmersiveConfig() {
        GGS.LIZ.getClass();
        return GGS.LIZLLL;
    }

    public void showItemForGo() {
        if (this.goSettingList == null) {
            this.goSettingList = C53097Ksf.LIZIZ.LIZ();
        }
        List<String> list = this.goSettingList;
        if (list != null) {
            AG5.LIZ(this.mUnitManger, list);
        }
    }

    private void checkAndRecoverUnloginViews() {
        HashSet<AG6<AEC>> hashSet;
        if (!HG3.LJIILL().isLogin() || (hashSet = this.unloginGoneView) == null || hashSet.isEmpty()) {
            return;
        }
        this.mSettingUnLoginUnit.LJIIIZ(false);
        Iterator<AG6<AEC>> it = this.unloginGoneView.iterator();
        while (it.hasNext()) {
            it.next().LJIIIZ(true);
        }
        this.unloginGoneView.clear();
        setupLoginSectionDivider();
        setupMultiAccount();
    }

    private void checkSettingAds() {
        AdFreeSubscription LJIILL = a.LJIIJ().LJIILL();
        if (LJIILL != null && LJIILL.getSubscriptionMode().intValue() == 1 && a.LJIIJ().LJJI()) {
            if (LJIILL.getSubscriptionStatus().intValue() == 1) {
                this.mSettingAds.LJIIL(getString(R.string.rks));
            }
            if (LJIILL.getSubscriptionStatus().intValue() == 2) {
                this.mSettingAds.LJIIL(getString(R.string.rwi));
            }
        }
        this.mSettingAds.LJIIIZ(a.LJIIJ().LJIL());
    }

    private void initFamilyPairing() {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            this.mScreenTimeItem.LJIIIZ(false);
        } else {
            this.mScreenTimeItem.LJIIIZ(true);
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            try {
                SettingsManager.LIZLLL().getClass();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (!SettingsManager.LIZ("show_family_pairing_for_not_login_user", false)) {
                this.mFamilyPairingItem.LJIIIZ(false);
                return;
            }
        }
        this.mFamilyPairingItem.LJIIIZ(true);
    }

    private void onLogoutConfirm() {
        if (!INVOKESTATIC_com_ss_android_ugc_aweme_setting_ui_I18nSettingNewVersionFragment_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(getContext())) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LIZLLL(0, "f_mode");
        FMX.LJIIL("log_out", c188727au.LIZ);
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(this);
        showLoadingDialog();
        HG3.LJIIIIZZ().logout("user_logout", "user_logout");
    }

    private void openPrivacyPolicyView() {
        a.LJII().LIZIZ(new O0X(false, AGJ.SETTINGS_NEWVERSION_FRAGMENT.getValue(), true, true, "privacy-policy"), new C47959Irz());
    }

    private void queryBCARedDot() {
        if (((RBX) HG3.LJIILL()).isLogin()) {
            if (AD7.LIZJ()) {
                Z8A z8a = Z8A.LIZIZ;
                z8a.LIZ.queryProfileResponse(new WeakHandler(this));
                return;
            }
            Keva repo = Keva.getRepo("keva_repo_qa");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("keva_key_need_write_red_dot");
            if (!C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, false)) {
                return;
            }
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String str = EFJ.LIZJ;
            ((ProAccountUpdateStatusApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(ProAccountUpdateStatusApi.class)).updateStatus().LJJIIJ(T16.LIZ()).LJIJJ(T16.LIZ()).LIZ(new InterfaceC73463SsN<BaseResponse>() { // from class: X.6ul
                @Override // X.InterfaceC73463SsN
                public final void onError(Throwable e) {
                    o.LJIIIZ(e, "e");
                }

                @Override // X.InterfaceC73463SsN
                public final void onSubscribe(InterfaceC92693kP d) {
                    o.LJIIIZ(d, "d");
                }

                @Override // X.InterfaceC73463SsN
                public final void onSuccess(BaseResponse baseResponse) {
                    boolean z;
                    BaseResponse t = baseResponse;
                    o.LJIIIZ(t, "t");
                    if (t.status_code != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Keva repo2 = Keva.getRepo("keva_repo_qa");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("keva_key_need_write_red_dot");
                    LIZ2.append(HG3.LJIILL().getCurUserId());
                    repo2.storeBoolean(X1D.LIZIZ(LIZ2), z);
                }
            });
        }
    }

    public static boolean shouldShowBusinessAccount() {
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if ((C9TP.LIZ() && curUser.getAccountType() == 3) || (curUser.getPotentialBizAccountInfo() != null && curUser.getPotentialBizAccountInfo().isPotentialBA() && curUser.getAccountType() != 3)) {
            return true;
        }
        return false;
    }

    private void showSaveInfoDialog() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("enter_from", "logout");
        FMX.LJIIL("remember_login_info_notify", c188727au.LIZ);
        C26227ARb c26227ARb = new C26227ARb(context);
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(context);
        W5F LJII = W5U.LJII(C78939UyV.LJ(((RBX) HG3.LJIILL()).getCurUser().getAvatarThumb()));
        LJII.LJJIIJ = smartAvatarImageView;
        C16880lQ.LLJJJ(LJII);
        c26227ARb.LJIIIZ = new C244689iy(context, smartAvatarImageView);
        c26227ARb.LJII = false;
        c26227ARb.LJ(R.string.o4);
        c26227ARb.LIZ(R.string.o1);
        ARI ari = new ARI(context);
        ari.LJI(R.string.o3, new C31457CWf(4, this));
        ari.LJIIIIZZ(R.string.o2, new AObjectS42S0101000_5(3, this, 39));
        c26227ARb.LJIIL = ari;
        c26227ARb.LJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void checkForUpdate() {
        if (!INVOKESTATIC_com_ss_android_ugc_aweme_setting_ui_I18nSettingNewVersionFragment_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(getContext())) {
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
        } else {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                UgCommonServiceImpl.LJIJ().LJI();
                C40599FwZ.LIZ(mo49getActivity);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickClearCache() {
        boolean LJJIJ = C78939UyV.LJJIJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableSettingDiskManager: ");
        LIZ.append(LJJIJ);
        C36922EeM.LIZLLL(3, "clear-cache", X1D.LIZIZ(LIZ));
        if (LJJIJ) {
            SmartRouter.buildRoute(this, "//setting/diskmanager").open();
        } else {
            clearCacheNoDiskManager();
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickCommonDisplaySettings() {
        Intent intent;
        if (mo49getActivity() == null) {
            intent = new Intent();
        } else {
            intent = mo49getActivity().getIntent();
        }
        if (intent != null && (("translate_tts".equals(C16880lQ.LLJJIJIIJIL(intent, "enter_from")) || "translate_subtitle".equals(C16880lQ.LLJJIJIIJIL(intent, "enter_from"))) && this.mCommonProtocolItem != null)) {
            ValueAnimator valueAnimator = this.mCurrentAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mCurrentAnimator.cancel();
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "settings_page");
            c188727au.LJIIIZ("enter_method", C16880lQ.LLJJIJIIJIL(intent, "enter_from"));
            FMX.LJIIL("enter_language_setting", c188727au.LIZ);
            SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://display/caption/setting");
            buildRoute.withParam("enter_method", C16880lQ.LLJJIJIIJIL(intent, "enter_from"));
            buildRoute.open();
            return;
        }
        SmartRoute buildRoute2 = SmartRouter.buildRoute(this, "aweme://display/caption/setting");
        buildRoute2.withParam("enter_method", "setting_page");
        buildRoute2.open();
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickCommunityGuidelines() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            AAZ.LIZIZ(mo49getActivity);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickContentPreference() {
        String str;
        showLoadingDialog();
        if (a.LJIIIZ().LIZ() == EnumC62934Omw.CHILD) {
            str = "teen";
        } else if (a.LJIIIZ().LIZ() == EnumC62934Omw.PARENT) {
            str = "parent";
        } else {
            str = "unknown";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        c188727au.LJIIIZ("previous_page", "settings_page");
        c188727au.LJIIIZ("enter_method", "click_button");
        c188727au.LJIIIZ("role", str);
        c188727au.LJIIIZ("entry_point", "setting_privacy");
        FMX.LJIIL("enter_content_preference", c188727au.LIZ);
        if (((RBX) HG3.LJIILL()).isLogin()) {
            a.LJIILL().LJIILIIL(new C85796Xlo(this));
            return;
        }
        dismissLoadingDialog();
        SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity(), "aweme://contentpreference");
        buildRoute.withParam("enter_from", "settings_page");
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickCopyrightPolicy() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            AAZ.LIZJ(mo49getActivity);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickCreatorsPortal() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            AAZ.LIZLLL(mo49getActivity);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickHelpCenter() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            AAZ.LJ(mo49getActivity);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickImpressum() {
        if (!INVOKESTATIC_com_ss_android_ugc_aweme_setting_ui_I18nSettingNewVersionFragment_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(getContext())) {
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("previous_page", "settings_page");
        c188727au.LJIIIZ("enter_method", "click_button");
        FMX.LJIIL("enter_imprint", c188727au.LIZ);
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://webview");
        buildRoute.withParam("url", a.LJFF().LJIJJLI());
        buildRoute.withParam("title", getString(R.string.qtl));
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickInsights() {
        super.clickInsights();
        Context context = getContext();
        if (context != null) {
            HashMap LIZJ = C03660Ck.LIZJ("anchor_type", "analytics");
            AnalyticsSDUISetting.H5AnalyticsInfoStructJsonModel LIZ = AnalyticsSDUISetting.LIZ();
            if (AG9.LIZ() && LIZ != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZ.creatorToolEntryURL);
                LIZ2.append(LIZ.queryParams);
                LIZ2.append("&status_bar_height=");
                LIZ2.append(C60191Njn.LIZ(44));
                SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ2)).open();
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("https://www.tiktok.com/insight?hide_nav_bar=1&should_full_screen=1&status_bar_height=");
            LIZ3.append(C60191Njn.LIZ(44));
            C59975NgJ.LIZ(context, X1D.LIZIZ(LIZ3), LIZJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickInviteFriend() {
        Keva repoFromSp = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "referral_code", 0);
        o.LJIIIIZZ(repoFromSp, "getRepoFromSp(AppContext…ants.MODE_SINGLE_PROCESS)");
        repoFromSp.storeBoolean("referral_code_badge", true);
        AG2 ag2 = this.mMusInviteFriend;
        if (ag2 != null) {
            ag2.LJIILIIL(false);
        }
        String LIZ = SharePrefCache.inst().getReferralEntrance().LIZ();
        o.LJIIIIZZ(LIZ, "inst().referralEntrance.cache");
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://webview");
        buildRoute.withParam("use_webview_title", true);
        buildRoute.withParam(UriProtector.parse(LIZ));
        buildRoute.open();
        FMX.LJIIL("click_referral_invite_friends", C65618Pp8.of("enter_from", "settings_page"));
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickLiveEvents() {
        String str;
        UUF.LIZIZ();
        C65429Pm5.LJ(((RBX) HG3.LJIILL()).getCurSecUserId(), "_has_see_live_events", Keva.getRepo("SettingsLiveEvents"), true);
        Z8A z8a = Z8A.LIZIZ;
        String liveEventsUrl = z8a.getLiveEventsUrl();
        if (!TextUtils.isEmpty(liveEventsUrl) && !TextUtils.isEmpty(UriProtector.getQueryParameter(UriProtector.parse(liveEventsUrl), "url"))) {
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(liveEventsUrl), "url");
            if (z8a.hasLiveEventPermissionSettings()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            Uri build = removeQueryParameter(UriProtector.parse(liveEventsUrl), "url").buildUpon().appendQueryParameter("url", UPJ.LIZIZ(queryParameter, "&live_event_permission=", str, "&live_event_enter_from=", "settings_page")).build();
            Context context = getContext();
            if (context != null) {
                LiveOuterService.LJJJLL().LJJIJIL().LJJJIL(context, build);
            }
        }
        this.mLiveEventsItem.LJIILIIL(false);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("enter_live_event_settings", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickLiveRelay() {
        C62046OWs LIZIZ = C0F0.LIZIZ();
        if (LIZIZ != null && getContext() != null) {
            String str = (String) LIZIZ.LIZJ("", "live_replay_page_url");
            Bundle bundle = new Bundle();
            C47192Ifc LIZ = LiveOuterService.LJJJLL().LIZ();
            Context context = getContext();
            LIZ.getClass();
            new LiveHostAction().openLiveBrowser(str, bundle, context);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickManageAccount() {
        super.clickManageAccount();
        SmartRouter.buildRoute(this, "//account/setting").open();
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickMyQrCode() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C4LD.LIZ.LJFF(mo49getActivity, null, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickMyWallet() {
        String str;
        if (C78472Uqy.LIZLLL() && ((WalletCenter) LiveOuterService.LJJJLL().LJJIJIL().LJJLI().walletCenter()).LJLJJI.hasIncomeBefore) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "settings_page");
        hashMap.put("scene_id", "1003");
        FMX.LJIIL("enter_wallet_page", hashMap);
        MobClick mobClick = new MobClick();
        mobClick.setEventName("wallet");
        mobClick.setLabelName("setting");
        FMX.onEvent(mobClick);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("wallet_click", c188727au.LIZ);
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("entrance", "settings_privacy");
        c188727au2.LJIIIZ("has_income_before", str);
        c188727au2.LJIIIZ("display_balance", null);
        FMX.LJIIL("livesdk_wallet_entrance_click", c188727au2.LIZ);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C78472Uqy.LIZIZ(mo49getActivity);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickPrivacyPolicy() {
        if (!INVOKESTATIC_com_ss_android_ugc_aweme_setting_ui_I18nSettingNewVersionFragment_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(getContext())) {
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
            return;
        }
        if (C25727A7v.LIZ()) {
            openPrivacyPolicyView();
        } else {
            String LJJI = a.LJIIZILJ().LJJI();
            if (TextUtils.isEmpty(LJJI)) {
                LJJI = C25934AFu.LIZ("privacy-policy");
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://webview");
            buildRoute.withParam(UriProtector.parse(LJJI));
            buildRoute.withParam("hide_status_bar", true);
            C0NY.LIZJ(buildRoute, "title", getString(R.string.p9w), "show_separate_line", true);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        FMX.LJIIL("enter_privacy_policy", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickSafetyCenter() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            AAZ.LJFF(mo49getActivity);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void clickTermsOfUse() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            AAZ.LJI(mo49getActivity);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void initStorageData() {
        super.initStorageData();
        if (C78939UyV.LJJIJ()) {
            AG2 ag2 = this.mClearCacheItem;
            if (ag2 != null) {
                C2068389v c2068389v = new C2068389v();
                lambda$initStorageData$11(c2068389v);
                ag2.LJIIJ(new AqS135S0200000_4(ag2, c2068389v, 164));
                this.mClearCacheItem.LJIILJJIL(getString(R.string.gmb));
                return;
            }
            return;
        }
        AbstractC73672Svk.LJIIJ(new IDuS325S0100000_15(this, 1)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(5, this, 30), new AfS36S0101000_5(2, this, 31));
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void initView() {
        Intent intent;
        String str;
        super.initView();
        String LLLZ = C16880lQ.LLLZ(getString(R.string.qxu), new Object[]{EF7.LJII(), Long.valueOf(EF7.LJI())});
        C85799Xlr c85799Xlr = this.mSettingsFooterContainer;
        String text = LLLZ + "";
        c85799Xlr.getClass();
        o.LJIIIZ(text, "text");
        c85799Xlr.LJIIJ(new AqS68S1100000_15(c85799Xlr, text, 12));
        if (C78472Uqy.LIZLLL() && !TextUtils.equals(EF7.LJIILIIL, "amazon")) {
            WalletCenter walletCenter = (WalletCenter) LiveOuterService.LJJJLL().LJJIJIL().LJJLI().walletCenter();
            if (!walletCenter.LJIIIIZZ()) {
                if (walletCenter.LJLJJI.hasIncomeBefore) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("entrance", "settings_privacy");
                c188727au.LJIIIZ("has_income_before", str);
                c188727au.LJIIIZ("display_balance", null);
                FMX.LJIIL("livesdk_wallet_entrance_show", c188727au.LIZ);
                this.mMyWalletItem.LJIIIZ(true);
            } else {
                this.mMyWalletItem.LJIIIZ(false);
            }
        } else {
            this.mMyWalletItem.LJIIIZ(false);
        }
        if (!TextUtils.isEmpty(SharePrefCache.inst().getReferralEntrance().LIZ())) {
            this.mMusInviteFriend.LJIIIZ(true);
            o.LJIIIIZZ(KevaImpl.getRepoFromSp(EF7.LIZIZ(), "referral_code", 0), "getRepoFromSp(AppContext…ants.MODE_SINGLE_PROCESS)");
            if (!r1.getBoolean("referral_code_badge", false)) {
                this.mMusInviteFriend.LJIILIIL(true);
            }
        }
        this.mMicroApp.LJIIIZ(false);
        if (HG3.LJIIIIZZ().isEnableMultiAccountLogin()) {
            this.mMyQrCode.LJIIIZ(true);
        }
        initFamilyPairing();
        initUI();
        initUnloginSetting();
        if (mo49getActivity() != null && (intent = mo49getActivity().getIntent()) != null && ("translate_tts".equals(C16880lQ.LLJJIJIIJIL(intent, "enter_from")) || "translate_subtitle".equals(C16880lQ.LLJJIJIIJIL(intent, "enter_from")))) {
            setupHighlightAnimation();
        }
        if (canHighlightLiveEventsItem() && getContext() != null) {
            SettingItemHighlightHelper settingItemHighlightHelper = new SettingItemHighlightHelper(getContext(), this, this.mLiveEventsItem);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 300);
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new AUListenerS102S0100000_15(settingItemHighlightHelper, 12));
            ofInt.addListener(new ALAdapterS12S0100000_15(settingItemHighlightHelper, 9));
            ofInt.setStartDelay(800L);
            ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 300);
            ofInt2.setDuration(300L);
            ofInt2.addUpdateListener(new AUListenerS102S0100000_15(settingItemHighlightHelper, 13));
            ofInt2.addListener(new ALAdapterS12S0100000_15(settingItemHighlightHelper, 10));
            ofInt2.setStartDelay(500L);
            ((AnimatorSet) settingItemHighlightHelper.LJLJJI.getValue()).play(ofInt2).before(ofInt);
            ((AnimatorSet) settingItemHighlightHelper.LJLJJI.getValue()).start();
            Keva.getRepo("SettingsLiveEvents").storeBoolean(((RBX) HG3.LJIILL()).getCurSecUserId() + "_has_highlight_live_events", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mCompositeDisposable.LIZLLL();
        HG3.LJIIL();
        HG3.LJLJL.LJIILLIIL(this);
        SettingsManagerProxy.inst().removeSettingsWatcher(this);
        AD7.LJIIJJI();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mEverPaused = true;
        ValueAnimator valueAnimator = this.mCurrentAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mCurrentAnimator.cancel();
        }
        this.consentLogDisposable = AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJJIJIL(a.LJIJJ()), C84763XOl.LJFF(), new C78496UrM()).LJJL(T16.LIZ()).LJJJJZI(new AfS36S0101000_5(4, this, 27));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mPrivacyManagerUnit.LJIIIZ(a.LJIILIIL().LIZLLL());
        checkAndRecoverUnloginViews();
        initFamilyPairing();
        showInsights();
        showLiveSubscription();
        showItemForGo();
        hideItemByBlackList();
        updateLanguage();
        if (this.mEverPaused && needShowRedDot()) {
            queryBCARedDot();
        }
        C68542QvC.LIZJ();
        this.mEverPaused = false;
        this.consentLogDisposable = AbstractC73672Svk.LJJIJIL(a.LJIJJ()).LJJL(T16.LIZ()).LJJJJZI(new AfS36S0101000_5(3, this, 12));
        showMusic();
    }

    public void showInsights() {
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (SharePrefCache.inst().getCanCreateInsights().LIZ().booleanValue() && curUser != null && curUser.getIsCreater() && C19N.LJ("creator_m10n_show_creator_tools_analytics_entry_is_enabled", true)) {
            this.mInsights.LJIIIZ(true);
        } else {
            this.mInsights.LJIIIZ(false);
        }
        if (C1A7.LJIILLIIL("show_insights_red").LIZJ("show_insights_red", false)) {
            this.mInsights.LJIILIIL(true);
        } else {
            this.mInsights.LJIILIIL(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void showLogoutDialog() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            C245319jz c245319jz = new C245319jz();
            c245319jz.LJII(getString(R.string.o5));
            C252669vq c252669vq = new C252669vq();
            c252669vq.LIZIZ(getString(R.string.dpf));
            c252669vq.LJ = new ACListenerS35S0100000_15(this, 126);
            C252669vq c252669vq2 = new C252669vq();
            c252669vq2.LIZIZ(getString(R.string.hyf));
            c252669vq2.LIZJ = 1;
            c252669vq2.LJ = new ACListenerS35S0100000_15(this, 127);
            c245319jz.LIZIZ(c252669vq, c252669vq2);
            c245319jz.LIZJ().show(fragmentManager, "logout_dialog_with_switch_account");
        }
    }

    public void showLogoutDialogInternal() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJ(R.string.dso);
        ARI ari = new ARI(context);
        ari.LJI(R.string.hw8, new AObjectS45S0101000_13(3, this, 6));
        ari.LJIIIIZZ(R.string.cg_, null);
        c26227ARb.LJIIL = ari;
        if (HG3.LJIIIIZZ().isEnableMultiAccountLogin()) {
            c26227ARb.LIZIZ(AV1.LIZLLL(((RBX) HG3.LJIILL()).getCurUser()));
        }
        c26227ARb.LJI().LIZLLL();
    }

    public void startRegularLogoutProcess() {
        HG3.LJIIL();
        LoginMethodService LJIIIZ = HG3.LJLJL.LJIIIZ();
        if (!C53262KvK.LIZIZ() && !AV1.LJIILLIIL() && LJIIIZ.isOneKeyLoginExperimentEnabled() && !LJIIIZ.getSaveLoginStatus() && LJIIIZ.isCurrentMethodAvaliable()) {
            showSaveInfoDialog();
        } else {
            onLogoutConfirm();
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void initData() {
        super.initData();
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_setting_ui_I18nSettingNewVersionFragment_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    private void compatLogoutDialogRTL(Dialog dialog) {
        if (dialog != null) {
            View findViewById = dialog.findViewById(android.R.id.message);
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setGravity(8388611);
            }
        }
    }

    public /* synthetic */ Object lambda$clearCacheNoDiskManager$16(C10K c10k) {
        if (c10k.LJIILIIL()) {
            AG2 ag2 = this.mClearCacheItem;
            if (ag2 != null) {
                ag2.LJIIL("0.0MB");
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                C5S1 c5s1 = new C5S1(mo49getActivity);
                c5s1.LIZJ(R.string.dfe);
                c5s1.LJ();
                return null;
            }
            return null;
        }
        return null;
    }

    public static /* synthetic */ C76800UCe lambda$initStorageData$11(C2068389v c2068389v) {
        c2068389v.LIZ = R.raw.icon_trash_bin_fill;
        return null;
    }

    public void lambda$initStorageData$12(InterfaceC73573Su9 interfaceC73573Su9) {
        String str;
        try {
            str = C16880lQ.LLLZ("%.2fMB", new Object[]{Double.valueOf(C36459ESp.LIZ(mo49getActivity().getCacheDir(), C39579Fg7.LJIIL(), new File(AVExternalServiceImpl.LIZ().configService().cacheConfig().stickerDir()), monitorDir()) / 1048576.0d)});
        } catch (Exception unused) {
            str = "0.0MB";
        }
        interfaceC73573Su9.onNext(str);
        interfaceC73573Su9.onComplete();
    }

    public /* synthetic */ void lambda$initStorageData$13(String str) {
        AG2 ag2 = this.mClearCacheItem;
        if (ag2 != null) {
            ag2.LJIIL(str);
        }
    }

    public /* synthetic */ void lambda$initStorageData$14(Throwable th) {
        AG2 ag2 = this.mClearCacheItem;
        if (ag2 != null) {
            ag2.LJIIL("0.0MB");
        }
    }

    public static /* synthetic */ C76800UCe lambda$onCreate$1(BaseActivityViewModel baseActivityViewModel) {
        baseActivityViewModel.config(new InterfaceC65784Pro() { // from class: X.Xlv
            @Override // X.InterfaceC65784Pro
            public final Object invoke() {
                return I18nSettingNewVersionFragment.lambda$onCreate$0();
            }
        });
        return null;
    }

    public void lambda$onPause$6(C85797Xlp c85797Xlp) {
        if (c85797Xlp.LIZIZ && C84763XOl.LJIIJJI) {
            c85797Xlp.LIZ.LJIIL();
        }
        InterfaceC92693kP interfaceC92693kP = this.consentLogDisposable;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public /* synthetic */ void lambda$onResume$5(ITpcConsentService iTpcConsentService) {
        iTpcConsentService.LJFF();
        InterfaceC92693kP interfaceC92693kP = this.consentLogDisposable;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public /* synthetic */ void lambda$setupHighlightAnimation$3(ValueAnimator valueAnimator) {
        T t = this.mCommonProtocolItem.LJLIL;
        if (((AEP) t).LLIIIILZ != null) {
            ((AEP) t).LLIIIILZ.setAlpha(255 - ((int) (valueAnimator.getAnimatedFraction() * 255.0f)));
        }
    }

    public /* synthetic */ void lambda$setupHighlightAnimation$4(ValueAnimator valueAnimator) {
        T t = this.mCommonProtocolItem.LJLIL;
        if (((AEP) t).LLIIIILZ != null) {
            ((AEP) t).LLIIIILZ.setAlpha((int) (valueAnimator.getAnimatedFraction() * 255.0f));
        }
    }

    public /* synthetic */ C76800UCe lambda$showLogoutDialogInternal$10(ARN arn) {
        onLogoutConfirm();
        return C76800UCe.LIZ;
    }

    public C76800UCe lambda$showSaveInfoDialog$8(ARN arn) {
        HG3.LJIIL();
        HG3.LJLJL.LJIIIZ().updateAllowOneKeyLoginInfo(true, true);
        showLogoutDialogInternal();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("enter_from", "logout");
        FMX.LJIIL("remember_login_info_confirm", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public /* synthetic */ C76800UCe lambda$showSaveInfoDialog$9(ARN arn) {
        showLogoutDialogInternal();
        return C76800UCe.LIZ;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        UserResponse userResponse;
        User user;
        Object obj = message.obj;
        if ((obj instanceof UserResponse) && (user = (userResponse = (UserResponse) obj).getUser()) != null && userResponse.status_code == 0) {
            int proAccountUpdateNotificationStatus = user.getProAccountUpdateNotificationStatus();
            this.mServerRequestShowRedDot = proAccountUpdateNotificationStatus;
            if (proAccountUpdateNotificationStatus < 0 || proAccountUpdateNotificationStatus > 2) {
                this.mServerRequestShowRedDot = 0;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C36093EEn c36093EEn = C36093EEn.LIZ;
        EnumC36092EEm enumC36092EEm = EnumC36092EEm.SETTING;
        c36093EEn.getClass();
        C36093EEn.LJIIIIZZ(enumC36092EEm);
        activityConfiguration(new AObjectS16S0001000_15(0, 0));
        super.onCreate(bundle);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onEvent(C46427IJz c46427IJz) {
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://main?tab=1");
        buildRoute.withParam("tab", 1);
        buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        buildRoute.addFlags(67108864);
        buildRoute.open();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onSwitchBusinessAccountSuccessEvent(C9NE c9ne) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment
    public void showChooseAccountDialog(AV9 av9) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            Z8A.LIZIZ.showInChooseAccountBottomSheet(fragmentManager, av9, "choose_account_dialog", null, null, null);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onEvent(C9NC c9nc) {
        showInsights();
        C68542QvC.LIZJ();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onEvent(AWX awx) {
        showInsights();
    }

    public /* synthetic */ C76800UCe lambda$onViewCreated$2(View view, Bundle bundle) {
        ActivityC45651qj mo49getActivity;
        super.onViewCreated(view, bundle);
        SettingsNewVersionActivityArgs settingsNewVersionActivityArgs = (SettingsNewVersionActivityArgs) RouteArgExtension.INSTANCE.navArg(this, new AObjectS22S0001000_6(4, 0)).getValue();
        if (settingsNewVersionActivityArgs != null) {
            this.mEnterFrom = settingsNewVersionActivityArgs.getEnterFrom();
            this.mEnterMethod = settingsNewVersionActivityArgs.getEnterMethod();
        }
        super.onCreate(bundle);
        if (!EF7.LJIIIIZZ()) {
            checkLiveReplay();
        }
        checkSettingAds();
        checkCommercialContentLibrary();
        SettingsManagerProxy.inst().registerSettingsWatcher(this, false);
        queryBCARedDot();
        preloadShowCaseApi();
        verifyPreciseExposureExperiment();
        if (a.LJIJJ().LJ(null) && (mo49getActivity = mo49getActivity()) != null && !mo49getActivity.isFinishing()) {
            a.LJIJJ().LJIIJ(mo49getActivity, "deeplink");
        }
        return null;
    }

    private Uri removeQueryParameter(Uri uri, String str) {
        if (uri == null) {
            return null;
        }
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames == null) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (!str2.equals(str)) {
                clearQuery.appendQueryParameter(str2, UriProtector.getQueryParameter(uri, str2));
            }
        }
        return clearQuery.build();
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        wrapOnViewCreated(new C26093ALx(0, this, view, bundle));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 19 && i2 == -1) {
            UgCommonServiceImpl.LJIJ().LJI();
            C40599FwZ.LIZJ("app_update_click");
        }
    }
}
