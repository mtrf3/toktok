package X;

import Y.ACallableS24S0001000_6;
import Y.ARunnableS11S0101000_7;
import Y.ARunnableS1S0001000_6;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl;
import com.ss.android.ugc.aweme.anchor.service.AnchorListServiceImpl;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.appsflyer.AppsflyerImpl;
import com.ss.android.ugc.aweme.compliance.sandbox.serviceimpl.SandboxServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.api.ContentLanguageGuideServiceImpl;
import com.ss.android.ugc.aweme.feed.consumption.impl.ConsumeLoginLoginServiceImpl;
import com.ss.android.ugc.aweme.feed.count.impl.FeedPlayNumServiceImpl;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserProgressBarManager;
import com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.service.newusermode.NewUserModeService;
import com.ss.android.ugc.aweme.services.CloudTokenLoginService;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import defpackage.e1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.FtC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40390FtC {
    public static final C10K<Bundle> LIZ(final Bundle bundle) {
        Executor executor;
        if (!C33884DRo.LIZLLL()) {
            C40438Fty.LIZLLL("login");
            C1DH.LJJIJIIJIL(6000L, C40438Fty.LJIIL);
            executor = C10K.LJIIIIZZ;
        } else {
            executor = C10K.LJI;
        }
        C10K<Bundle> LIZIZ = C10K.LIZIZ(new Callable() { // from class: X.Ft0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle2 = bundle;
                if (C39082FVm.LIZ()) {
                    HashMap LIZJ = C03660Ck.LIZJ("monitor_scene", "scene_nuj");
                    LIZJ.put("vv_code", 2250);
                    C39082FVm.LIZJ(LIZJ);
                }
                if (C33884DRo.LIZLLL()) {
                    C40438Fty.LIZLLL("login");
                    C1DH.LJJIJIIJIL(6000L, C40438Fty.LJIIL);
                }
                SandboxServiceImpl.LIZ().activeOrInActiveOrbu(EnumC40383Ft5.LOGIN);
                C40384Ft6.LIZ("Login", ((RBX) HG3.LJIILL()).getCurUserId());
                C40384Ft6.LIZJ();
                C40535FvX.LIZIZ(false);
                C36826Eco c36826Eco = AbstractC36700Eam.LJLJJL;
                ((ArrayList) c36826Eco.LJLJJI).add(new FUL() { // from class: X.Ft1
                    @Override // X.FUL
                    public final void LIZ(C157566Gi c157566Gi) {
                        if (LiveOuterService.LJJJLL().LJJJJIZL() != null && C19N.LJ("can_be_live_podcast", false)) {
                            C31130CJq.LIZIZ.getClass();
                            C31130CJq.LIZJ = true;
                        }
                    }
                });
                Z9N.LIZIZ.LJJLIL(1);
                SettingManagerServiceImpl.LIZJ().LIZ(1);
                HybridKitTaskImpl.LJIIJJI().LJII();
                ((RBX) HG3.LJIILL()).checkIn();
                if (!ContentLanguageGuideServiceImpl.LIZIZ().LJIIIIZZ()) {
                    EJB.LIZIZ.LJFF(null);
                }
                if (!AV1.LJIIJJI() && e1.LIZ(31744, "inbox_has_top_msg", true, false)) {
                    C36093EEn.LIZ.getClass();
                    EHL ehl = new EHL();
                    ehl.LIZLLL(C55888Lwa.LIZIZ.LJJIJIL());
                    ehl.LIZJ();
                }
                C78966Uyw.LJJIJ().LIZLLL();
                User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                if (curUser != null) {
                    String accountRegion = curUser.getAccountRegion();
                    if (!TextUtils.isEmpty(accountRegion)) {
                        QJY.LIZJ("account_region", accountRegion);
                    }
                }
                IMService.createIIMServicebyMonsterPlugin(false).getImInitializeService().LIZJ();
                C3GN.LIZIZ.LIZJ();
                SharePrefCache.inst().getTodayVideoPlayTime().LIZLLL(0L);
                SharePrefCache.inst().getLastUnlockTime().LIZLLL(0L);
                if (a.LJIILL().LJIJ() && bundle2 != null) {
                    bundle2.putBoolean("need_restart", true);
                }
                if (SharePrefCache.inst().getIsFirstLaunch().LIZ().booleanValue()) {
                    SharePrefCache.inst().getIsFirstLaunch().LIZLLL(Boolean.FALSE);
                }
                if (!AV1.LJIIJJI()) {
                    a.LJ().LJFF();
                    a.LJIILL().LJIILIIL(new C1E5());
                    a.LJIJJ().LIZIZ(1);
                }
                LiveOuterService.LJJJLL().LJJIJIL().getClass();
                Live.refreshLoginState();
                AnchorListServiceImpl.LIZLLL().LIZ();
                Z8A z8a = Z8A.LIZIZ;
                z8a.LIZ.runYoutubeRefreshTask(EF7.LIZIZ());
                C40384Ft6.LIZLLL();
                AV1.LIZ = null;
                AV1.LIZIZ = null;
                bundle2.putBoolean("is_start_by_login", true);
                F9K.LIZIZ(2);
                if (AV1.LJIIJJI()) {
                    a.LJIJJ().LJIILIIL(2);
                }
                a.LJIJJ().LIZJ();
                SpecActServiceImpl.LJJJIL().LJIIIZ();
                ISecApi LIZ = SecApiImpl.LIZ();
                LIZ.updateCollectMode(null);
                LIZ.reportData(FWZ.LOGGED.getReportName());
                ShareServiceImpl.LJJJLZIJ().LJJI(EF7.LIZIZ(), AV1.LJIILLIIL());
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                o.LJIIIIZZ(curUserId, "userService().curUserId");
                C2OE.LJIIJ = curUserId;
                C2OF.LJ(true);
                C2OF.LIZLLL();
                NewUserProgressBarManager.LIZLLL();
                AppsflyerImpl.LJ().LIZJ();
                UgCommonServiceImpl.LJIJ().LJIIJJI();
                FLL.LJFF();
                CommonFeedApiService.LIZ().LJIIIZ();
                if (AccountService.LJIJ().LJFF().isLogin()) {
                    AV1.LJIILLIIL();
                }
                if (C33884DRo.LIZ() || C33884DRo.LIZIZ()) {
                    FN6.LIZ.LIZ();
                    FN6.LIZJ(new ARunnableS1S0001000_6(1, 6));
                    if (C33884DRo.LIZ()) {
                        Activity[] activityStack = ActivityStack.getActivityStack();
                        int length = activityStack.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            Activity activity = activityStack[i];
                            if (activity instanceof MainActivity) {
                                if (activity != null) {
                                    FMW.LIZJ(new AqS156S0100000_6((Context) activity, 149));
                                    C37179EiV.LJFF.postDelayed(RunnableC38846FMk.LJLIL, 10000L);
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
                FeedPlayNumServiceImpl.LJ().LIZJ();
                ConsumeLoginLoginServiceImpl.LIZLLL().LIZJ();
                CloudTokenLoginService.createICloudTokenLoginServicebyMonsterPlugin(false).attemptRefreshTokenAfterLoginForCurrentUser();
                NewUserModeService.LIZJ().LIZ();
                RegistrationAgeGateServiceImpl.LIZ().yearOnlyLoginUpdate();
                if (((Number) C40471FuV.LIZ.getValue()).intValue() == 1 && !C40471FuV.LIZIZ()) {
                    IWF.LJJLIIIIJ().release();
                    C2U8.LIZ(new C40380Ft2(bundle2));
                }
                return bundle2;
            }
        }, executor, null);
        o.LJIIIIZZ(LIZIZ, "afterLogIn(bundle)");
        return LIZIZ;
    }

    public static final C10K<Bundle> LIZJ(Bundle bundle) {
        C10K<Bundle> LIZIZ = C10K.LIZIZ(new CallableC40387Ft9(1, bundle), C10K.LJIIIIZZ, null);
        o.LJIIIIZZ(LIZIZ, "afterSwitchAccount(bundle)");
        return LIZIZ;
    }

    public static final C10K<Bundle> LIZIZ(final Bundle bundle, final C40392FtE logoutContext) {
        C10K<Bundle> LIZ;
        o.LJIIIZ(logoutContext, "logoutContext");
        if (logoutContext.LIZ) {
            LIZ = C10K.LIZ(new Callable() { // from class: X.FtB
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C57602Nw c57602Nw;
                    Bundle bundle2 = bundle;
                    C40392FtE c40392FtE = logoutContext;
                    C40384Ft6.LIZ("Logout", AV1.LIZIZ().getUid());
                    C40384Ft6.LIZJ();
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    C40535FvX.LIZIZ(true);
                    SharePrefCache.inst().clearCache();
                    C10K.LIZJ(new ACallableS24S0001000_6(1, 1));
                    C78966Uyw.LJJIJ().LIZJ();
                    SettingManagerServiceImpl.LIZJ().LIZ(1);
                    HybridKitTaskImpl.LJIIJJI().LJII();
                    a.LJIILL().LJIIIIZZ();
                    bundle2.putBoolean("restart_from_logout", true);
                    bundle2.putBoolean("is_logout_from_ftc_user", c40392FtE.LIZ);
                    a.LJIIZILJ().LJIIIZ();
                    a.LJI().LJIILL();
                    new Handler().postDelayed(new ARunnableS11S0101000_7(5, LJIIIIZZ, 10), 500L);
                    AVExternalServiceImpl.LIZ().configService().userAction(2);
                    AV1.LIZ = null;
                    AV1.LIZIZ = null;
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("user_mode", 0);
                    bundle3.putInt("user_period", 0);
                    AppLog.setCustomerHeader(bundle3);
                    C78996UzQ.LJJIJL();
                    a.LJIJJ().LIZJ();
                    ShareServiceImpl.LJJJLZIJ().LJJI(EF7.LIZIZ(), AV1.LJIILLIIL());
                    a.LJIJJ().LJIILIIL(5);
                    C2OE.LIZLLL.erase("progress_bar_data_v3");
                    WeakReference<C57602Nw> weakReference = C2OE.LIZIZ;
                    if (weakReference != null && (c57602Nw = weakReference.get()) != null) {
                        c57602Nw.LIZJ(true);
                    }
                    CommonFeedApiService.LIZ().LJJIIZI();
                    C7HV.LIZIZ.clearCache();
                    C72802tQ.LIZ().LJJI();
                    C178736zt.LIZIZ();
                    return bundle2;
                }
            });
        } else {
            LIZ = C10K.LIZ(new Callable() { // from class: X.FtA
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C57602Nw c57602Nw;
                    Bundle bundle2 = bundle;
                    C40392FtE c40392FtE = logoutContext;
                    SandboxServiceImpl.LIZ().activeOrInActiveOrbu(EnumC40383Ft5.LOGOUT);
                    C40384Ft6.LIZ("Logout", AV1.LIZIZ().getUid());
                    if (AV1.LIZIZ() != null && AV1.LIZIZ().getSecUid() != null) {
                        CommonFeedServiceImpl.LJJIJLIJ().LJJIIZ(AV1.LIZIZ().getSecUid());
                    }
                    C40384Ft6.LIZJ();
                    C40535FvX.LIZIZ(true);
                    SharePrefCache.inst().clearCache();
                    QBA.LIZIZ().LIZLLL(2, Collections.singletonList("kakaotalk"));
                    C10K.LIZJ(new ACallableS24S0001000_6(1, 1));
                    C78966Uyw.LJJIJ().LIZJ();
                    C54960Lhc.LIZ.LIZIZ();
                    Z9N.LIZIZ.LJJLIL(3);
                    SettingManagerServiceImpl.LIZJ().LIZ(1);
                    HybridKitTaskImpl.LJIIJJI().LJII();
                    C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
                    if (LJJIJIL != null) {
                        LJJIJIL.LJJJ();
                    }
                    a.LJIILL().LJIIIIZZ();
                    a.LJ().LJIIJ();
                    OZ1.LIZIZ.LIZLLL();
                    C86580XyS.LIZ = null;
                    bundle2.putBoolean("restart_from_logout", true);
                    bundle2.putBoolean("is_logout_from_ftc_user", c40392FtE.LIZ);
                    a.LJIILL().LIZLLL();
                    a.LJIIZILJ().LJIIIZ();
                    a.LJI().LJIILL();
                    C40384Ft6.LIZLLL();
                    new Handler().postDelayed(new IDRunnableS6S0101000(4, bundle2, 25), 500L);
                    IMService.createIIMServicebyMonsterPlugin(false).getImInitializeService().LIZJ();
                    C3GN.LIZIZ.LIZJ();
                    AVExternalServiceImpl.LIZ().configService().userAction(2);
                    LiveOuterService.LJJJLL().LJJIJIL().getClass();
                    Live.refreshLoginState();
                    C2U8.LIZ(new C40393FtF());
                    AV1.LIZ = null;
                    AV1.LIZIZ = null;
                    AnchorListServiceImpl.LIZLLL().LIZ();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("user_mode", 0);
                    bundle3.putInt("user_period", 0);
                    AppLog.setCustomerHeader(bundle3);
                    C78996UzQ.LJJIJL();
                    SpecActServiceImpl.LJJJIL().LIZLLL();
                    a.LJIJJ().LIZJ();
                    a.LJIJJ().LIZIZ(4);
                    SecApiImpl.LIZ().updateCollectMode(null);
                    ShareServiceImpl.LJJJLZIJ().LJJI(EF7.LIZIZ(), AV1.LJIILLIIL());
                    C2OE.LIZLLL.erase("progress_bar_data_v3");
                    WeakReference<C57602Nw> weakReference = C2OE.LIZIZ;
                    if (weakReference != null && (c57602Nw = weakReference.get()) != null) {
                        c57602Nw.LIZJ(true);
                    }
                    CommonFeedApiService.LIZ().LIZLLL();
                    C7HV.LIZIZ.clearCache();
                    C72802tQ.LIZ().LJJI();
                    C178736zt.LIZIZ();
                    QnaService.LIZ().clearSearchHistoryKeva();
                    FeedPlayNumServiceImpl.LJ().LIZIZ();
                    ConsumeLoginLoginServiceImpl.LIZLLL().LIZIZ();
                    AVExternalServiceImpl.LIZ().enterFromService().setEnterFrom("HOME");
                    return bundle2;
                }
            });
        }
        o.LJIIIIZZ(LIZ, "afterLogOut(bundle, logoutContext)");
        return LIZ;
    }
}
