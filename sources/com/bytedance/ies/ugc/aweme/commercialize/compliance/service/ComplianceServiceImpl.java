package com.bytedance.ies.ugc.aweme.commercialize.compliance.service;

import X.AAU;
import X.ASL;
import X.ActivityC45651qj;
import X.C188727au;
import X.C1DG;
import X.C235779Nd;
import X.C25572A1w;
import X.C26224AQy;
import X.C31461Li;
import X.C33381Ss;
import X.C36821Ecj;
import X.C41290GIk;
import X.C43280Gyi;
import X.C44847Hit;
import X.C45804HyK;
import X.C47261Igj;
import X.C54293LSn;
import X.C58096Mr6;
import X.C78949Uyf;
import X.C84763XOl;
import X.EF7;
import X.FMX;
import X.G1P;
import X.GI9;
import X.GIA;
import X.GIS;
import X.GJ7;
import X.GJ9;
import X.GJB;
import X.GJD;
import X.HG3;
import X.InterfaceC247699np;
import X.InterfaceC32051Chz;
import X.KL2;
import X.LRD;
import X.M78;
import X.RBX;
import X.UTU;
import Y.IDDListenerS146S0100000_7;
import Y.IDFactoryS63S0000000_7;
import Y.IDdS377S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.AboutThisAdVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.StaticAdExplainDialog;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionNotificationPrompt;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfo;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes8.dex */
public final class ComplianceServiceImpl implements IComplianceService {
    public static IComplianceService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IComplianceService.class, false);
        if (LIZ != null) {
            return (IComplianceService) LIZ;
        }
        if (C58096Mr6.LJIILLIIL == null) {
            synchronized (IComplianceService.class) {
                if (C58096Mr6.LJIILLIIL == null) {
                    C58096Mr6.LJIILLIIL = new ComplianceServiceImpl();
                }
            }
        }
        return C58096Mr6.LJIILLIIL;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final String LJIILLIIL() {
        return C31461Li.LIZJ("commercial_content_library_url", "", "getInstance().getStringV…yUrlSettings::class.java)");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final String LJIJI() {
        try {
            SettingsManager.LIZLLL().getClass();
            String LJI = SettingsManager.LJI("ad_report_base_url", "https://inapp.tiktokv.com/falcon/communitysafety/page/reasons_ad/index.html");
            o.LJIIIIZZ(LJI, "getInstance().getStringV…seUrlSetting::class.java)");
            return LJI;
        } catch (Throwable unused) {
            return "https://inapp.tiktokv.com/falcon/communitysafety/page/reasons_ad/index.html";
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJJI() {
        return !TextUtils.equals(EF7.LJIILIIL, "amazon_int");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LIZIZ() {
        Boolean isNpUser;
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null && (isNpUser = LIZIZ.isNpUser()) != null) {
            return isNpUser.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJ() {
        AdFreeSubscription adFreeSubscription;
        Integer subscriptionMode;
        Integer subscriptionStatus;
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null) {
            adFreeSubscription = LIZIZ.getSubscription();
        } else {
            adFreeSubscription = null;
        }
        if (adFreeSubscription == null || (subscriptionMode = adFreeSubscription.getSubscriptionMode()) == null || subscriptionMode.intValue() != 1 || (subscriptionStatus = adFreeSubscription.getSubscriptionStatus()) == null || subscriptionStatus.intValue() != 2) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJIIJJI() {
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null) {
            return o.LJ(LIZIZ.isShowSettings(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final int LJIILIIL() {
        return C41290GIk.LIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final AdFreeSubscription LJIILL() {
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null) {
            return LIZIZ.getSubscription();
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJIJ() {
        Boolean isFollowSystemConfig;
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null && (isFollowSystemConfig = LIZIZ.isFollowSystemConfig()) != null && isFollowSystemConfig.booleanValue()) {
            C54293LSn c54293LSn = C235779Nd.LIZ;
            if (c54293LSn.LJJI == null) {
                c54293LSn.LJJI = new C36821Ecj<>("opt_out_google_personzalized_ads", Boolean.FALSE);
            }
            Boolean LIZ = c54293LSn.LJJI.LIZ();
            o.LJIIIIZZ(LIZ, "inst().optOutGooglePersonalizedAds.cache");
            if (LIZ.booleanValue() && C41290GIk.LIZ() == 1) {
                C41290GIk.LJIIJJI("", false);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJIJJ() {
        AdFreeSubscription adFreeSubscription;
        Integer subscriptionMode;
        Integer subscriptionStatus;
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null) {
            adFreeSubscription = LIZIZ.getSubscription();
        } else {
            adFreeSubscription = null;
        }
        if (adFreeSubscription == null || (subscriptionMode = adFreeSubscription.getSubscriptionMode()) == null || subscriptionMode.intValue() != 1 || (subscriptionStatus = adFreeSubscription.getSubscriptionStatus()) == null || subscriptionStatus.intValue() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJIL() {
        boolean z;
        CommerceUserInfo commerceUserInfo;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null) {
            z = o.LJ(LIZIZ.isShowSettings(), Boolean.TRUE);
        } else {
            z = false;
        }
        if (!z) {
            if (curUser == null) {
                return false;
            }
            CommerceUserInfo commerceUserInfo2 = curUser.getCommerceUserInfo();
            if ((commerceUserInfo2 == null || !commerceUserInfo2.isHasAdFeedbackEntry()) && ((commerceUserInfo = curUser.getCommerceUserInfo()) == null || !commerceUserInfo.isHasAdExperienceEntry())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJIIL() {
        return GJD.LIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJI(boolean z) {
        Activity LJIIIIZZ;
        ActivityC45651qj LJJIFFI;
        GJD.LIZ = z;
        if (!z && !G1P.LIZ() && (LJIIIIZZ = C84763XOl.LJIIIIZZ()) != null && (LJJIFFI = C45804HyK.LJJIFFI(LJIIIIZZ)) != null) {
            a.LJIIJJI().LIZLLL(LJJIFFI);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJIIIZ(Context context) {
        String str;
        if (context == null) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//privacy/setting/ad_personalization");
        buildRoute.withParam("enter_from", "privacy_and_safety_settings");
        buildRoute.open();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "privacy_and_safety_settings");
        FMX.LJIIL("enter_personalize_data", C44847Hit.LIZIZ("enter_personalize_data", c188727au.LIZ, "enter_from", "settings").LIZ);
        if (!C41290GIk.LJIIIIZZ() ? C41290GIk.LIZJ() == 0 : C41290GIk.LIZ() == 0) {
            str = "off";
        } else {
            str = "on";
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("initial_status", str);
        C188727au LIZIZ = C44847Hit.LIZIZ("show_personalization_status", c188727au2.LIZ, "refer", "settings");
        LIZIZ.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUser().getUid());
        FMX.LJIIL("click_settings_ads", LIZIZ.LIZ);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJFF(Context context, C43280Gyi c43280Gyi) {
        o.LJIIIZ(context, "context");
        GJ7.LIZ(context, c43280Gyi);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.ActivityC45651qj r13, X.M78 r14) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.service.ComplianceServiceImpl.LJIIIIZZ(X.1qj, X.M78):void");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJIILJJIL(ActivityC45651qj activityC45651qj, M78 m78) {
        SubscriptionVM subscriptionVM;
        FragmentManager supportFragmentManager;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(activityC45651qj);
        if (LJJIFFI != null) {
            subscriptionVM = GIS.LIZ(LJJIFFI);
        } else {
            subscriptionVM = null;
        }
        SubscriptionNotificationPrompt.LJLJJI = subscriptionVM;
        SubscriptionNotificationPrompt subscriptionNotificationPrompt = new SubscriptionNotificationPrompt();
        subscriptionNotificationPrompt.LJLIL = activityC45651qj;
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = subscriptionNotificationPrompt;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJLILLLLZI = new IDDListenerS146S0100000_7(m78, 5);
        asl.LJI(1);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJZI = true;
        tuxSheet2.LJLJI = true;
        tuxSheet2.LL = true;
        tuxSheet2.LLD = false;
        SubscriptionNotificationPrompt.LJLJI = tuxSheet2;
        ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(activityC45651qj);
        if (LJJIFFI2 != null && (supportFragmentManager = LJJIFFI2.getSupportFragmentManager()) != null) {
            TuxSheet tuxSheet3 = SubscriptionNotificationPrompt.LJLJI;
            if (tuxSheet3 != null) {
                tuxSheet3.show(supportFragmentManager, "SubscriptionNotificationPrompt");
                SubscriptionVM subscriptionVM2 = SubscriptionNotificationPrompt.LJLJJI;
                if (subscriptionVM2 != null) {
                    subscriptionVM2.gv0(null, 1, null, Boolean.TRUE, null);
                }
                FMX.LJIIL("show_cancellation_info_prompt", new C188727au().LIZ);
                return;
            }
            o.LJIJI("sheet");
            throw null;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final Fragment LJIIZILJ(InterfaceC32051Chz interfaceC32051Chz, PickYourAdPlanPage pickYourAdPlanPage) {
        o.LJIIIZ(pickYourAdPlanPage, "pickYourAdPlanPage");
        return GIA.LIZ(0, interfaceC32051Chz, pickYourAdPlanPage);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final Fragment LJJ(InterfaceC32051Chz interfaceC32051Chz, AdFreeTrialPageInfo adFreeTrialPageInfo) {
        return GI9.LIZ(0, interfaceC32051Chz, adFreeTrialPageInfo);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJJIFFI(ActivityC45651qj activityC45651qj, M78 m78) {
        SubscriptionVM subscriptionVM;
        FragmentManager supportFragmentManager;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(activityC45651qj);
        if (LJJIFFI != null) {
            subscriptionVM = GIS.LIZ(LJJIFFI);
        } else {
            subscriptionVM = null;
        }
        SubscriptionNotificationPrompt.LJLJJI = subscriptionVM;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(activityC45651qj.getString(R.string.s62), activityC45651qj.getString(R.string.s63), activityC45651qj.getString(R.string.s64));
        C26224AQy c26224AQy = new C26224AQy();
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.bfi;
        c26224AQy.LIZ = c33381Ss.LIZ(activityC45651qj);
        c26224AQy.LIZLLL = 2;
        String string = activityC45651qj.getString(R.string.s65);
        o.LJIIIIZZ(string, "act.getString(R.string.test_end_reminder_title)");
        c26224AQy.LJ = string;
        c26224AQy.LIZJ(LJJIJIIJI);
        c26224AQy.LJIILIIL = true;
        String string2 = activityC45651qj.getString(R.string.s61);
        C25572A1w c25572A1w = C25572A1w.LJLIL;
        c26224AQy.LJII = string2;
        c26224AQy.LJIIIZ = c25572A1w;
        ASL LIZ = c26224AQy.LIZ();
        IDDListenerS146S0100000_7 iDDListenerS146S0100000_7 = new IDDListenerS146S0100000_7(m78, 4);
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJLILLLLZI = iDDListenerS146S0100000_7;
        ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(activityC45651qj);
        if (LJJIFFI2 != null && (supportFragmentManager = LJJIFFI2.getSupportFragmentManager()) != null) {
            tuxSheet.show(supportFragmentManager, "SubscriptionNotificationPrompt");
            SubscriptionVM subscriptionVM2 = SubscriptionNotificationPrompt.LJLJJI;
            if (subscriptionVM2 != null) {
                subscriptionVM2.gv0(null, 1, Boolean.TRUE, null, null);
            }
        }
        FMX.LJIIL("show_free_trial_prompt", new C188727au().LIZ);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJII(String str, InterfaceC247699np interfaceC247699np, ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        SubscriptionVM LIZ = GIS.LIZ(activity);
        LIZ.getClass();
        if (UTU.LIZIZ(UTU.LIZ)) {
            return;
        }
        try {
            LIZ.LJLIL.registerUserForExp(str).enqueue(new IDdS377S0100000_4(interfaceC247699np, 5));
        } catch (Exception unused) {
            interfaceC247699np.onFail();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJIIJ(ActivityC45651qj act, AwemeRawAd awemeRawAd, String str) {
        o.LJIIIZ(act, "act");
        StaticAdExplainDialog staticAdExplainDialog = new StaticAdExplainDialog();
        staticAdExplainDialog.LJLIL = awemeRawAd;
        staticAdExplainDialog.LJLILLLLZI = str;
        staticAdExplainDialog.LJLJI = act;
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = staticAdExplainDialog;
        tuxSheet.LJLLJ = false;
        asl.LJI(1);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLLLLL = (int) (KL2.LJIIIZ(C78949Uyf.LJIILL(act)) * 0.73d);
        tuxSheet2.LJLILLLLZI = new IDDListenerS146S0100000_7(act, 0);
        StaticAdExplainDialog.LJLJJL = tuxSheet2;
        C1DG.LJII(act, "act.supportFragmentManager", tuxSheet2, "FeedAdExplainDialog");
        LRD.LIZ(act).LJIIJ("ad_explain_static_dynamic", true, new AAU());
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJIJJLI(ActivityC45651qj act, AwemeRawAd awemeRawAd, String enterFrom) {
        String str;
        String str2;
        o.LJIIIZ(act, "act");
        o.LJIIIZ(enterFrom, "enterFrom");
        AboutAdInfo aboutThisAd = awemeRawAd.getAboutThisAd();
        if (aboutThisAd != null) {
            str = aboutThisAd.getGeoId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            AboutAdInfo aboutThisAd2 = awemeRawAd.getAboutThisAd();
            if (aboutThisAd2 != null) {
                str2 = aboutThisAd2.getCountryCode();
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(awemeRawAd.getAboutThisAd().getAudienceTags())) {
                GJB.LIZ(act, awemeRawAd, enterFrom, 0, null).show();
                return;
            }
        }
        AboutThisAdVM aboutThisAdVM = (AboutThisAdVM) ViewModelProviders.of(act, new IDFactoryS63S0000000_7(1)).get(AboutThisAdVM.class);
        aboutThisAdVM.getClass();
        if (UTU.LIZIZ(UTU.LIZ)) {
            return;
        }
        aboutThisAdVM.LJLIL.getATAInfo(awemeRawAd.getAboutThisAd().getGeoId(), awemeRawAd.getAboutThisAd().getCountryCode(), awemeRawAd.getAboutThisAd().getAudienceTags(), awemeRawAd.getAdvId()).enqueue(new GJ9(act, awemeRawAd, enterFrom));
    }
}
