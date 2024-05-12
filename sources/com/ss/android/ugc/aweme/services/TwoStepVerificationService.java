package com.ss.android.ugc.aweme.services;

import X.ASL;
import X.ActivityC45651qj;
import X.C0MT;
import X.C10I;
import X.C10K;
import X.C132805Jc;
import X.C16880lQ;
import X.C188727au;
import X.C1DG;
import X.C221108m2;
import X.C26161AOn;
import X.C26162AOo;
import X.C26163AOp;
import X.C26224AQy;
import X.C33381Ss;
import X.C34502DgQ;
import X.C38776FJs;
import X.C52259Kf9;
import X.C52445Ki9;
import X.C52927Kpv;
import X.C5H3;
import X.C68540QvA;
import X.C69048R8a;
import X.C76800UCe;
import X.C77412UZs;
import X.C82544WaS;
import X.C84530XFm;
import X.C84531XFn;
import X.C84532XFo;
import X.C85056XZs;
import X.C85057XZt;
import X.C85058XZu;
import X.C85144XbI;
import X.C86V;
import X.EF7;
import X.EnumC85151XbP;
import X.FMX;
import X.InterfaceC26157AOj;
import X.InterfaceC65784Pro;
import X.PRC;
import X.QQN;
import X.R41;
import X.R9T;
import X.V1I;
import X.X1D;
import X.XG9;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.api.UserSettingsApi;
import com.ss.android.ugc.aweme.account.api.UserSettingsResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity;
import com.ss.android.ugc.aweme.account.login.twostep.UnusualInfoResponse;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.settings.Upsell2svInboxPopupFrequencyModel;
import com.ss.android.ugc.aweme.settings.Upsell2svProfilePopupFrequencyModel;
import com.ss.android.ugc.aweme.settings.Upsell2svProfileWalletFrequencyModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS119S0300000_15;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TwoStepVerificationService implements InterfaceC26157AOj {
    public C10K<AddVerificationResponse> task;
    public AuthDeviceResponse trustDeviceResponse;
    public static final Companion Companion = new Companion();
    public static final String REPO_NAME = "2sv_enhancements";
    public static final Keva keva = Keva.getRepo("2sv_enhancements");
    public static final C5H3<Boolean> isNewTo2svEnhancements$delegate = C221108m2.LIZIZ(TwoStepVerificationService$Companion$isNewTo2svEnhancements$2.INSTANCE);
    public final C5H3 response$delegate = C221108m2.LIZIZ(TwoStepVerificationService$response$2.INSTANCE);
    public final C5H3 pushChallengeKeva$delegate = C221108m2.LIZIZ(TwoStepVerificationService$pushChallengeKeva$2.INSTANCE);
    public String cacheKeyUpsell2svPop = "";
    public C85056XZs popCacheObj = new C85056XZs(0);
    public final C38776FJs defaultSharedPrefInst = C38776FJs.LJIIL();
    public C85058XZu upsell2svCampaignObj = new C85058XZu(0);
    public UserSettingsResponse.UserSettingsData userSettingsResponse = new UserSettingsResponse.UserSettingsData(null, null, null, null, null, null, null, null, null, null, 1023, null);
    public int enterpriseAccApiRespMaxCount = 4;
    public int walletAccApiRespMaxCount = 4;
    public String uid = "";

    /* loaded from: classes16.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isNewTo2svEnhancements() {
            return TwoStepVerificationService.isNewTo2svEnhancements$delegate.getValue().booleanValue();
        }

        public Companion() {
        }
    }

    /* loaded from: classes16.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC85151XbP.values().length];
            try {
                iArr[EnumC85151XbP.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC85151XbP.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC85151XbP.TOTP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC85151XbP.PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // X.InterfaceC26157AOj
    public C10K<Boolean> getTwoStepVerificationStatusFromNetwork() {
        C10K<AddVerificationResponse> twoStepStatus = getTwoStepStatus(false);
        this.task = twoStepStatus;
        o.LJI(twoStepStatus);
        C10K LJFF = twoStepStatus.LJFF(new C10I() { // from class: com.ss.android.ugc.aweme.services.TwoStepVerificationService$getTwoStepVerificationStatusFromNetwork$1
            @Override // X.C10I
            public final C10K<Boolean> then(C10K<AddVerificationResponse> c10k) {
                if (!C82544WaS.LJ(c10k)) {
                    if (TwoStepVerificationService.this.getResponse().get(R41.LIZLLL()) != null) {
                        TwoStepVerificationService.this.getResponse().remove(R41.LIZLLL());
                    }
                    return C10K.LJIIIZ(null);
                }
                AddVerificationResponse LJIIJJI = c10k.LJIIJJI();
                if (!ujb.o.LJJJJIZL("success", LJIIJJI.getMessage(), true) || LJIIJJI.getData() == null) {
                    if (TwoStepVerificationService.this.getResponse().get(R41.LIZLLL()) != null) {
                        TwoStepVerificationService.this.getResponse().remove(R41.LIZLLL());
                    }
                    return C10K.LJIIIZ(null);
                }
                HashMap<String, AddVerificationResponse> response = TwoStepVerificationService.this.getResponse();
                String LIZLLL = R41.LIZLLL();
                o.LJIIIIZZ(LIZLLL, "getCurUserId()");
                response.put(LIZLLL, LJIIJJI);
                TwoStepVerificationService.this.setTwoStepVerificationResponseToCache(LJIIJJI);
                return C10K.LJIIIZ(Boolean.valueOf(!TextUtils.isEmpty(LJIIJJI.getData().getDefault_verify_way())));
            }

            @Override // X.C10I
            public /* bridge */ /* synthetic */ Object then(C10K c10k) {
                return then((C10K<AddVerificationResponse>) c10k);
            }
        });
        o.LJIIIIZZ(LJFF, "override fun getTwoStepV…fy_way))\n        })\n    }");
        return LJFF;
    }

    @Override // X.InterfaceC26157AOj
    public boolean isUpsell2svProfileHVAExperimentTreatmentFromKeva() {
        return Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("upsell_2sv_profile_hva", false);
    }

    @Override // X.InterfaceC26157AOj
    public boolean isUpsell2svProfileWalletExperimentTreatment() {
        int i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("upsell_2sv_profile_wallet", 0);
        C52445Ki9.LIZIZ = i;
        if (i == 0) {
            return false;
        }
        return true;
    }

    private final Keva getPushChallengeKeva() {
        return (Keva) this.pushChallengeKeva$delegate.getValue();
    }

    public void fetchDeviceName() {
        String string = keva.getString("device_name", "");
        if (string == null || string.length() == 0) {
            TwoStepVerificationService$fetchDeviceName$1 onSuccess = TwoStepVerificationService$fetchDeviceName$1.INSTANCE;
            TwoStepVerificationService$fetchDeviceName$2 onError = TwoStepVerificationService$fetchDeviceName$2.INSTANCE;
            o.LJIIIZ(onSuccess, "onSuccess");
            o.LJIIIZ(onError, "onError");
            Context LIZIZ = EF7.LIZIZ();
            C69048R8a c69048R8a = new C69048R8a(onSuccess, onError);
            QQN qqn = new QQN();
            qqn.LIZ = C77412UZs.LJIJJLI("/passport/safe/login_device/list/");
            new R9T(LIZIZ, qqn.LIZIZ(), c69048R8a).LJIIIZ();
        }
    }

    public final C10K<AvailableWaysResponse> getAvailableWays() {
        TwoStepAuthApi.LIZ.getClass();
        return TwoStepAuthApi.LIZIZ().getAvailableWays();
    }

    public String getDeviceName() {
        String deviceName = keva.getString("device_name", "");
        if (deviceName == null || deviceName.length() == 0) {
            String MODEL = Build.MODEL;
            o.LJIIIIZZ(MODEL, "MODEL");
            return MODEL;
        }
        o.LJIIIIZZ(deviceName, "deviceName");
        return deviceName;
    }

    public final HashMap<String, AddVerificationResponse> getResponse() {
        return (HashMap) this.response$delegate.getValue();
    }

    @Override // X.InterfaceC26157AOj
    public C10K<Boolean> getSafeInfo() {
        TwoStepAuthApi.LIZ.getClass();
        C10K LJFF = TwoStepAuthApi.LIZIZ().getUnusualInfo().LJFF(new C10I() { // from class: com.ss.android.ugc.aweme.services.TwoStepVerificationService$getSafeInfo$1
            @Override // X.C10I
            public final C10K<Boolean> then(C10K<UnusualInfoResponse> c10k) {
                UnusualInfoResponse.Data data;
                if (!C82544WaS.LJ(c10k)) {
                    return C10K.LJIIIZ(Boolean.FALSE);
                }
                UnusualInfoResponse LJIIJJI = c10k.LJIIJJI();
                boolean z = true;
                if (!ujb.o.LJJJJIZL("success", LJIIJJI.getMessage(), true) || (data = LJIIJJI.getData()) == null || data.getNew_notice() == null) {
                    return C10K.LJIIIZ(Boolean.FALSE);
                }
                if (LJIIJJI.getData().getNew_notice().intValue() < 1) {
                    z = false;
                }
                return C10K.LJIIIZ(Boolean.valueOf(z));
            }

            @Override // X.C10I
            public /* bridge */ /* synthetic */ Object then(C10K c10k) {
                return then((C10K<UnusualInfoResponse>) c10k);
            }
        });
        o.LJIIIIZZ(LJFF, "TwoStepAuthApi.getUnusua…w_notice >= 1)\n        })");
        return LJFF;
    }

    public final AddVerificationResponse getTwoStepVerificationResponseFromCache() {
        if (Companion.isNewTo2svEnhancements()) {
            keva.storeBoolean("is_new_to_2sv_enhancements", false);
            return null;
        }
        return getResponse().get(R41.LIZLLL());
    }

    @Override // X.InterfaceC26157AOj
    public boolean isUpsell2svInboxHVAExperimentTreatment() {
        if (C34502DgQ.LIZ == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC26157AOj
    public boolean isUpsell2svProfileHVAExperimentTreatment() {
        if (C52259Kf9.LIZ == 1) {
            return true;
        }
        return false;
    }

    public boolean isUpsell2svProfileWalletExperimentTreatmentV1() {
        if (C52445Ki9.LIZIZ == 1) {
            return true;
        }
        return false;
    }

    public boolean isUpsell2svProfileWalletExperimentTreatmentV2() {
        if (C52445Ki9.LIZIZ == 2) {
            return true;
        }
        return false;
    }

    public Boolean getTwoStepVerificationStatusFromCache() {
        AddVerificationResponse.Data data;
        String default_verify_way;
        AddVerificationResponse addVerificationResponse = getResponse().get(R41.LIZLLL());
        if (addVerificationResponse == null || (data = addVerificationResponse.getData()) == null || (default_verify_way = data.getDefault_verify_way()) == null) {
            return null;
        }
        return Boolean.valueOf(!TextUtils.isEmpty(default_verify_way));
    }

    @Override // X.InterfaceC26157AOj
    public int getTwoStepVerificationStatusFromLocal() {
        Integer LIZ = C68540QvA.LIZ(R41.LIZLLL(), "tow_sv_status");
        if (LIZ != null) {
            return LIZ.intValue();
        }
        return -1;
    }

    public final AuthDeviceResponse getPreviousAuthDeviceListStatus() {
        return this.trustDeviceResponse;
    }

    public final C10K<AddVerificationResponse> getTask() {
        return this.task;
    }

    private final void fireETForPopupShow(C85057XZt c85057XZt) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str = this.upsell2svCampaignObj.LIZIZ;
        if (o.LJ(str, "enterprise_acc_2sv_upsell")) {
            String str2 = c85057XZt.LJFF;
            Integer business_account_2sv_upsell = this.userSettingsResponse.getBusiness_account_2sv_upsell();
            if (business_account_2sv_upsell != null) {
                i5 = business_account_2sv_upsell.intValue();
            } else {
                i5 = 0;
            }
            Integer tt_live_2sv_upsell = this.userSettingsResponse.getTt_live_2sv_upsell();
            if (tt_live_2sv_upsell != null) {
                i6 = tt_live_2sv_upsell.intValue();
            } else {
                i6 = 0;
            }
            Integer tt_shop_2sv_upsell = this.userSettingsResponse.getTt_shop_2sv_upsell();
            if (tt_shop_2sv_upsell != null) {
                i7 = tt_shop_2sv_upsell.intValue();
            } else {
                i7 = 0;
            }
            Integer managed_account_2sv_upsell = this.userSettingsResponse.getManaged_account_2sv_upsell();
            if (managed_account_2sv_upsell != null) {
                i8 = managed_account_2sv_upsell.intValue();
            } else {
                i8 = 0;
            }
            C85144XbI.LJJIIZI(str2, 1, i5, i6, i7, i8, 0, this.popCacheObj.LJ);
            return;
        }
        if (!o.LJ(str, "wallet_2sv_upsell")) {
            return;
        }
        String str3 = c85057XZt.LJFF;
        Integer business_account_2sv_upsell2 = this.userSettingsResponse.getBusiness_account_2sv_upsell();
        if (business_account_2sv_upsell2 != null) {
            i = business_account_2sv_upsell2.intValue();
        } else {
            i = 0;
        }
        Integer tt_live_2sv_upsell2 = this.userSettingsResponse.getTt_live_2sv_upsell();
        if (tt_live_2sv_upsell2 != null) {
            i2 = tt_live_2sv_upsell2.intValue();
        } else {
            i2 = 0;
        }
        Integer tt_shop_2sv_upsell2 = this.userSettingsResponse.getTt_shop_2sv_upsell();
        if (tt_shop_2sv_upsell2 != null) {
            i3 = tt_shop_2sv_upsell2.intValue();
        } else {
            i3 = 0;
        }
        Integer managed_account_2sv_upsell2 = this.userSettingsResponse.getManaged_account_2sv_upsell();
        if (managed_account_2sv_upsell2 != null) {
            i4 = managed_account_2sv_upsell2.intValue();
        } else {
            i4 = 0;
        }
        C85144XbI.LJJIIZI(str3, 0, i, i2, i3, i4, 1, this.popCacheObj.LJIIIZ);
    }

    private final void updatePopUpCacheOnCampaignType(ActivityC45651qj activityC45651qj) {
        String str = this.upsell2svCampaignObj.LIZIZ;
        int hashCode = str.hashCode();
        if (hashCode != -1954817805) {
            if (hashCode != -1564232227) {
                if (hashCode != -1130999656 || !str.equals("follower_2sv_upsell")) {
                    return;
                }
                C85056XZs c85056XZs = this.popCacheObj;
                c85056XZs.LIZJ++;
                c85056XZs.LIZIZ = System.currentTimeMillis();
                updatePopCacheObj(activityC45651qj, c85056XZs);
                return;
            }
            if (!str.equals("wallet_2sv_upsell")) {
                return;
            }
            C85056XZs c85056XZs2 = this.popCacheObj;
            c85056XZs2.LJIIIZ++;
            c85056XZs2.LJIIIIZZ = System.currentTimeMillis();
            updatePopCacheObj(activityC45651qj, c85056XZs2);
            return;
        }
        if (!str.equals("enterprise_acc_2sv_upsell")) {
            return;
        }
        C85056XZs c85056XZs3 = this.popCacheObj;
        c85056XZs3.LJ++;
        c85056XZs3.LJFF++;
        c85056XZs3.LIZLLL = System.currentTimeMillis();
        updatePopCacheObj(activityC45651qj, c85056XZs3);
    }

    public final C10K<AddVerificationResponse> getTwoStepStatus(boolean z) {
        if (!z || this.task == null || Companion.isNewTo2svEnhancements()) {
            TwoStepAuthApi.LIZ.getClass();
            this.task = TwoStepAuthApi.LIZIZ().getVerification();
        }
        C10K<AddVerificationResponse> c10k = this.task;
        o.LJI(c10k);
        return c10k;
    }

    public String getVerifyTypeFromMethod(EnumC85151XbP method) {
        o.LJIIIZ(method, "method");
        int i = WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    return "pwd_verify";
                }
                return "totp_verify";
            }
            return "email_verify";
        }
        return "mobile_sms_verify";
    }

    @Override // X.InterfaceC26157AOj
    public void onOpenPushChallengePage(String ticket) {
        o.LJIIIZ(ticket, "ticket");
        XG9.LIZ(ticket);
    }

    public final void setAuthDeviceListStatus(AuthDeviceResponse authDeviceResponse) {
        this.trustDeviceResponse = authDeviceResponse;
    }

    public final void setTask(C10K<AddVerificationResponse> c10k) {
        this.task = c10k;
    }

    public final void setTwoStepVerificationResponseToCache(AddVerificationResponse addVerificationResponse) {
        String str;
        AddVerificationResponse.Data data;
        o.LJIIIZ(addVerificationResponse, "addVerificationResponse");
        getResponse().put(R41.LIZLLL(), addVerificationResponse);
        AddVerificationResponse addVerificationResponse2 = getResponse().get(R41.LIZLLL());
        if (addVerificationResponse2 != null && (data = addVerificationResponse2.getData()) != null) {
            str = data.getDefault_verify_way();
        } else {
            str = null;
        }
        C68540QvA.LIZJ(R41.LIZLLL()).storeInt("tow_sv_status", !TextUtils.isEmpty(str) ? 1 : 0);
    }

    @Override // X.InterfaceC26157AOj
    public boolean shouldShowUpsell2svHVAPopUp(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        setCommonParamsForUpsellPopup(activity, "follower_2sv_upsell");
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        Upsell2svInboxPopupFrequencyModel upsell2svInboxPopupFrequencyModel = C84530XFm.LIZ;
        Upsell2svInboxPopupFrequencyModel upsell2svInboxPopupFrequencyModel2 = (Upsell2svInboxPopupFrequencyModel) LIZLLL.LJIIIIZZ("upsell_2sv_inbox_popup_frequency", Upsell2svInboxPopupFrequencyModel.class, upsell2svInboxPopupFrequencyModel);
        if (upsell2svInboxPopupFrequencyModel2 == null) {
            upsell2svInboxPopupFrequencyModel2 = upsell2svInboxPopupFrequencyModel;
        }
        if (o.LJ(upsell2svInboxPopupFrequencyModel2, upsell2svInboxPopupFrequencyModel)) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(System.currentTimeMillis());
        C85056XZs c85056XZs = this.popCacheObj;
        int i = c85056XZs.LIZJ;
        long days2 = timeUnit.toDays(c85056XZs.LIZ);
        long days3 = timeUnit.toDays(this.popCacheObj.LIZIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Inbox Popup] freqSettings: ");
        LIZ.append(upsell2svInboxPopupFrequencyModel2);
        LIZ.append(" currentDay: ");
        LIZ.append(days);
        V1I.LIZLLL(LIZ, " popupCount: ", i, " lastApiCallInDays: ");
        LIZ.append(days2);
        PRC.LIZ(4, "UPSELL_2SV_POPUP", C132805Jc.LIZLLL(LIZ, " lastPopupShowInDays: ", days3, LIZ));
        if (i >= upsell2svInboxPopupFrequencyModel2.max_count) {
            return false;
        }
        if ((days3 > 0 && days - days3 < upsell2svInboxPopupFrequencyModel2.interval) || days - days2 < 1) {
            return false;
        }
        C10K<UserSettingsResponse.UserSettingsData> userSettings = getUserSettings(activity, this.upsell2svCampaignObj);
        try {
            userSettings.LJIJI();
            C85056XZs c85056XZs2 = this.popCacheObj;
            c85056XZs2.LIZ = System.currentTimeMillis();
            updatePopCacheObj(activity, c85056XZs2);
            if (userSettings.LJIIJJI() != null) {
                UserSettingsResponse.UserSettingsData LJIIJJI = userSettings.LJIIJJI();
                o.LJIIIIZZ(LJIIJJI, "task.result");
                if (isCampaignTypeResponseTrue("follower_2sv_upsell", LJIIJJI)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // X.InterfaceC26157AOj
    public boolean shouldShowUpsell2svProfileHVAPopUp(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(2);
        setCommonParamsForUpsellPopup(activityC45651qj, "enterprise_acc_2sv_upsell");
        calendar.setTimeInMillis(this.popCacheObj.LIZLLL);
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        Upsell2svProfilePopupFrequencyModel upsell2svProfilePopupFrequencyModel = C84531XFn.LIZ;
        Upsell2svProfilePopupFrequencyModel upsell2svProfilePopupFrequencyModel2 = (Upsell2svProfilePopupFrequencyModel) LIZLLL.LJIIIIZZ("upsell_2sv_profile_popup_frequency", Upsell2svProfilePopupFrequencyModel.class, upsell2svProfilePopupFrequencyModel);
        if (upsell2svProfilePopupFrequencyModel2 == null) {
            upsell2svProfilePopupFrequencyModel2 = upsell2svProfilePopupFrequencyModel;
        }
        if (o.LJ(upsell2svProfilePopupFrequencyModel2, upsell2svProfilePopupFrequencyModel)) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(System.currentTimeMillis());
        long days2 = timeUnit.toDays(this.popCacheObj.LIZ);
        long days3 = timeUnit.toDays(this.popCacheObj.LIZLLL);
        C85056XZs c85056XZs = this.popCacheObj;
        int i2 = c85056XZs.LJ;
        int i3 = c85056XZs.LJFF;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Profile Popup] freqSettings: ");
        LIZ.append(upsell2svProfilePopupFrequencyModel2);
        LIZ.append(" currentDay: ");
        LIZ.append(days);
        V1I.LIZLLL(LIZ, " enterpriseAccPopUpCount: ", i2, " lastApiCallInDays: ");
        LIZ.append(days2);
        C0MT.LIZLLL(LIZ, " enterpriseAccLastPopUpShowInDays: ", days3, " enterpriseAccMonthlyPopUpCount: ");
        LIZ.append(i3);
        PRC.LIZ(4, "UPSELL_2SV_POPUP", X1D.LIZIZ(LIZ));
        if (i2 >= upsell2svProfilePopupFrequencyModel2.max_count) {
            return false;
        }
        if (days3 > 0 && days - days3 < upsell2svProfilePopupFrequencyModel2.interval) {
            return false;
        }
        if (calendar.getTimeInMillis() > 0 && this.popCacheObj.LJFF >= upsell2svProfilePopupFrequencyModel2.max_count_month) {
            if (calendar.get(2) == i) {
                return false;
            }
            C85056XZs c85056XZs2 = this.popCacheObj;
            c85056XZs2.LJFF = 0;
            updatePopCacheObj(activityC45651qj, c85056XZs2);
        }
        if (days - days2 < 1) {
            if (this.popCacheObj.LJII < this.enterpriseAccApiRespMaxCount) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Accessing enterprise acc cached response ");
                LIZ2.append(this.popCacheObj.LJI);
                PRC.LIZ(4, "UPSELL_2SV_POPUP", X1D.LIZIZ(LIZ2));
                C85056XZs c85056XZs3 = this.popCacheObj;
                c85056XZs3.LJII++;
                updatePopCacheObj(activityC45651qj, c85056XZs3);
                if (this.popCacheObj.LJI) {
                    return true;
                }
                return false;
            }
            return false;
        }
        C85056XZs c85056XZs4 = this.popCacheObj;
        if (c85056XZs4.LJII != 0) {
            c85056XZs4.LJII = 0;
            updatePopCacheObj(activityC45651qj, c85056XZs4);
        }
        return true;
    }

    @Override // X.InterfaceC26157AOj
    public boolean shouldShowUpsell2svProfileWalletPopUp(ActivityC45651qj activity) {
        Upsell2svProfileWalletFrequencyModel upsell2svProfileWalletFrequencyModel;
        o.LJIIIZ(activity, "activity");
        setCommonParamsForUpsellPopup(activity, "wallet_2sv_upsell");
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            upsell2svProfileWalletFrequencyModel = C84532XFo.LIZ;
            Upsell2svProfileWalletFrequencyModel upsell2svProfileWalletFrequencyModel2 = (Upsell2svProfileWalletFrequencyModel) LIZLLL.LJIIIIZZ("upsell_2sv_profile_wallet_frequency", Upsell2svProfileWalletFrequencyModel.class, upsell2svProfileWalletFrequencyModel);
            if (upsell2svProfileWalletFrequencyModel2 != null) {
                upsell2svProfileWalletFrequencyModel = upsell2svProfileWalletFrequencyModel2;
            }
        } catch (Throwable unused) {
            upsell2svProfileWalletFrequencyModel = C84532XFo.LIZ;
        }
        if (o.LJ(upsell2svProfileWalletFrequencyModel, C84532XFo.LIZ)) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(System.currentTimeMillis());
        long days2 = timeUnit.toDays(this.popCacheObj.LIZ);
        long days3 = timeUnit.toDays(this.popCacheObj.LJIIIIZZ);
        int i = this.popCacheObj.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Wallet Popup] freqSettings: ");
        LIZ.append(upsell2svProfileWalletFrequencyModel);
        LIZ.append(" currentDay: ");
        LIZ.append(days);
        V1I.LIZLLL(LIZ, " walletPopUpCount: ", i, " lastApiCallInDays: ");
        LIZ.append(days2);
        PRC.LIZ(4, "UPSELL_2SV_POPUP", C132805Jc.LIZLLL(LIZ, " walletLastPopUpShowInDays: ", days3, LIZ));
        if (i >= upsell2svProfileWalletFrequencyModel.max_count) {
            return false;
        }
        if (days3 > 0 && days - days3 < upsell2svProfileWalletFrequencyModel.interval) {
            return false;
        }
        if (days - days2 < 1) {
            if (this.popCacheObj.LJIIJJI < this.walletAccApiRespMaxCount) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Accessing wallet cached response ");
                LIZ2.append(this.popCacheObj.LJIIJ);
                PRC.LIZ(4, "UPSELL_2SV_POPUP", X1D.LIZIZ(LIZ2));
                C85056XZs c85056XZs = this.popCacheObj;
                c85056XZs.LJIIJJI++;
                updatePopCacheObj(activity, c85056XZs);
                if (this.popCacheObj.LJIIJ) {
                    PRC.LIZ(4, "UPSELL_2SV_POPUP", "Return true from cached response");
                    return true;
                }
            }
            return false;
        }
        C85056XZs c85056XZs2 = this.popCacheObj;
        if (c85056XZs2.LJIIJJI != 0) {
            c85056XZs2.LJIIJJI = 0;
            updatePopCacheObj(activity, c85056XZs2);
        }
        return true;
    }

    public void upsell2svProfileHVAPopTask(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        PRC.LIZ(4, "UPSELL_2SV_POPUP", "[Profile Popup] Trigger Show");
        C85057XZt c85057XZt = new C85057XZt(0);
        String LJFF = C86V.LJFF(R.string.t9r);
        o.LJIIIIZZ(LJFF, "getString(R.string.twosvHVA_2svModal_title)");
        c85057XZt.LIZIZ = LJFF;
        String LJFF2 = C86V.LJFF(R.string.t9u);
        o.LJIIIIZZ(LJFF2, "getString(R.string.twosvHVA_generalModal_desc)");
        c85057XZt.LIZJ = LJFF2;
        String LJFF3 = C86V.LJFF(R.string.t9s);
        o.LJIIIIZZ(LJFF3, "getString(R.string.twosvHVA_2svModal_turnOnBtn)");
        c85057XZt.LJ = LJFF3;
        c85057XZt.LJFF = "personal_homepage";
        PopupManager.LJIIL(new C26161AOn(activity, c85057XZt));
    }

    public void upsell2svProfileWalletPopTask(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        PRC.LIZ(4, "UPSELL_2SV_POPUP", "[Profile Wallet Popup] Trigger Show");
        C85057XZt c85057XZt = new C85057XZt(0);
        c85057XZt.LIZ = R.drawable.be6;
        String LJFF = C86V.LJFF(R.string.t_0);
        o.LJIIIIZZ(LJFF, "getString( R.string.twosvWallet_2svModal_title)");
        c85057XZt.LIZIZ = LJFF;
        if (isUpsell2svProfileWalletExperimentTreatmentV1()) {
            String LJFF2 = C86V.LJFF(R.string.t9z);
            o.LJIIIIZZ(LJFF2, "getString(R.string.twosvWallet_2svModal_desc2)");
            c85057XZt.LIZJ = LJFF2;
        } else if (isUpsell2svProfileWalletExperimentTreatmentV2()) {
            String LJFF3 = C86V.LJFF(R.string.t9y);
            o.LJIIIIZZ(LJFF3, "getString(R.string.twosvWallet_2svModal_desc1)");
            c85057XZt.LIZJ = LJFF3;
        }
        String LJFF4 = C86V.LJFF(R.string.t9x);
        o.LJIIIIZZ(LJFF4, "getString(R.string.twosvWallet_2svModal_btn)");
        c85057XZt.LJ = LJFF4;
        c85057XZt.LJFF = "personal_homepage";
        PopupManager.LJIIL(new C26163AOp(activity, c85057XZt));
    }

    private final C10K<UserSettingsResponse.UserSettingsData> getUserSettings(final ActivityC45651qj activityC45651qj, final C85058XZu c85058XZu) {
        C10K<UserSettingsResponse.UserSettingsData> LJFF = UserSettingsApi.LIZ(c85058XZu.LIZJ, null).LJFF(new C10I() { // from class: com.ss.android.ugc.aweme.services.TwoStepVerificationService$getUserSettings$1
            @Override // X.C10I
            public final C10K<UserSettingsResponse.UserSettingsData> then(C10K<UserSettingsResponse> c10k) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Called user/settings API for campaign type: ");
                LIZ.append(C85058XZu.this.LIZIZ);
                PRC.LIZ(4, "UPSELL_2SV_POPUP", X1D.LIZIZ(LIZ));
                if (!C82544WaS.LJ(c10k)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("API result validation failed: ");
                    LIZ2.append(c10k);
                    PRC.LIZ(5, "UPSELL_2SV_POPUP", X1D.LIZIZ(LIZ2));
                    return C10K.LJIIIZ(null);
                }
                UserSettingsResponse LJIIJJI = c10k.LJIIJJI();
                if (!ujb.o.LJJJJIZL("success", LJIIJJI.getMessage(), true) || LJIIJJI.getData() == null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("API result faulty: ");
                    LIZ3.append(LJIIJJI);
                    PRC.LIZ(5, "UPSELL_2SV_POPUP", X1D.LIZIZ(LIZ3));
                    return C10K.LJIIIZ(null);
                }
                this.userSettingsResponse = LJIIJJI.getData();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("userSettings API response after validation: ");
                LIZ4.append(this.userSettingsResponse);
                PRC.LIZ(4, "UPSELL_2SV_POPUP", X1D.LIZIZ(LIZ4));
                TwoStepVerificationService twoStepVerificationService = this;
                twoStepVerificationService.setApiResponseCache(activityC45651qj, twoStepVerificationService.userSettingsResponse);
                return C10K.LJIIIZ(this.userSettingsResponse);
            }

            @Override // X.C10I
            public /* bridge */ /* synthetic */ Object then(C10K c10k) {
                return then((C10K<UserSettingsResponse>) c10k);
            }
        });
        o.LJIIIIZZ(LJFF, "private fun getUserSetti…esponse)\n        })\n    }");
        return LJFF;
    }

    @Override // X.InterfaceC26157AOj
    public void callUserSettingsBeforePopUpShow(final ActivityC45651qj activityC45651qj, final InterfaceC65784Pro<C76800UCe> noShowDialog) {
        o.LJIIIZ(noShowDialog, "noShowDialog");
        if (activityC45651qj == null) {
            noShowDialog.invoke();
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit.toDays(System.currentTimeMillis()) - timeUnit.toDays(this.popCacheObj.LIZ) < 1) {
            upsell2svProfileWalletPopTask(activityC45651qj);
            return;
        }
        try {
            getUserSettings(activityC45651qj, this.upsell2svCampaignObj).LIZLLL(new C10I() { // from class: com.ss.android.ugc.aweme.services.TwoStepVerificationService$callUserSettingsBeforePopUpShow$1
                /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
                /* renamed from: then, reason: collision with other method in class */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void m154then(X.C10K<com.ss.android.ugc.aweme.account.api.UserSettingsResponse.UserSettingsData> r7) {
                    /*
                        r6 = this;
                        java.lang.Object r0 = r7.LJIIJJI()
                        if (r0 == 0) goto L3b
                        com.ss.android.ugc.aweme.services.TwoStepVerificationService r2 = com.ss.android.ugc.aweme.services.TwoStepVerificationService.this
                        java.lang.Object r1 = r7.LJIIJJI()
                        java.lang.String r0 = "task.result"
                        kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                        com.ss.android.ugc.aweme.account.api.UserSettingsResponse$UserSettingsData r1 = (com.ss.android.ugc.aweme.account.api.UserSettingsResponse.UserSettingsData) r1
                        java.lang.String r0 = "enterprise_acc_2sv_upsell"
                        boolean r0 = r2.isCampaignTypeResponseTrue(r0, r1)
                        if (r0 == 0) goto L3b
                        r5 = 1
                    L1c:
                        com.ss.android.ugc.aweme.services.TwoStepVerificationService r4 = com.ss.android.ugc.aweme.services.TwoStepVerificationService.this
                        X.1qj r3 = r2
                        X.XZs r2 = r4.popCacheObj
                        long r0 = java.lang.System.currentTimeMillis()
                        r2.LIZ = r0
                        r4.updatePopCacheObj(r3, r2)
                        if (r5 == 0) goto L35
                        com.ss.android.ugc.aweme.services.TwoStepVerificationService r1 = com.ss.android.ugc.aweme.services.TwoStepVerificationService.this
                        X.1qj r0 = r2
                        r1.upsell2svProfileHVAPopTask(r0)
                    L34:
                        return
                    L35:
                        X.Pro<X.UCe> r0 = r3
                        r0.invoke()
                        goto L34
                    L3b:
                        r5 = 0
                        goto L1c
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.TwoStepVerificationService$callUserSettingsBeforePopUpShow$1.m154then(X.10K):void");
                }

                @Override // X.C10I
                public /* bridge */ /* synthetic */ Object then(C10K c10k) {
                    m154then((C10K<UserSettingsResponse.UserSettingsData>) c10k);
                    return C76800UCe.LIZ;
                }
            });
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Exception while calling user settings API for Profile HVA popup: ");
            LIZ.append(e);
            PRC.LIZ(6, "UPSELL_2SV_POPUP", X1D.LIZIZ(LIZ));
            noShowDialog.invoke();
        }
    }

    @Override // X.InterfaceC26157AOj
    public void callUserSettingsBeforeUpsell2svWalletPopUpShow(final ActivityC45651qj activity, final InterfaceC65784Pro<C76800UCe> noShowDialog) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(noShowDialog, "noShowDialog");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit.toDays(System.currentTimeMillis()) - timeUnit.toDays(this.popCacheObj.LIZ) < 1) {
            upsell2svProfileWalletPopTask(activity);
            return;
        }
        try {
            getUserSettings(activity, this.upsell2svCampaignObj).LIZLLL(new C10I() { // from class: com.ss.android.ugc.aweme.services.TwoStepVerificationService$callUserSettingsBeforeUpsell2svWalletPopUpShow$1
                /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
                /* renamed from: then, reason: collision with other method in class */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void m155then(X.C10K<com.ss.android.ugc.aweme.account.api.UserSettingsResponse.UserSettingsData> r7) {
                    /*
                        r6 = this;
                        java.lang.Object r0 = r7.LJIIJJI()
                        if (r0 == 0) goto L3b
                        com.ss.android.ugc.aweme.services.TwoStepVerificationService r2 = com.ss.android.ugc.aweme.services.TwoStepVerificationService.this
                        java.lang.Object r1 = r7.LJIIJJI()
                        java.lang.String r0 = "task.result"
                        kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                        com.ss.android.ugc.aweme.account.api.UserSettingsResponse$UserSettingsData r1 = (com.ss.android.ugc.aweme.account.api.UserSettingsResponse.UserSettingsData) r1
                        java.lang.String r0 = "wallet_2sv_upsell"
                        boolean r0 = r2.isCampaignTypeResponseTrue(r0, r1)
                        if (r0 == 0) goto L3b
                        r5 = 1
                    L1c:
                        com.ss.android.ugc.aweme.services.TwoStepVerificationService r4 = com.ss.android.ugc.aweme.services.TwoStepVerificationService.this
                        X.1qj r3 = r2
                        X.XZs r2 = r4.popCacheObj
                        long r0 = java.lang.System.currentTimeMillis()
                        r2.LIZ = r0
                        r4.updatePopCacheObj(r3, r2)
                        if (r5 == 0) goto L35
                        com.ss.android.ugc.aweme.services.TwoStepVerificationService r1 = com.ss.android.ugc.aweme.services.TwoStepVerificationService.this
                        X.1qj r0 = r2
                        r1.upsell2svProfileWalletPopTask(r0)
                    L34:
                        return
                    L35:
                        X.Pro<X.UCe> r0 = r3
                        r0.invoke()
                        goto L34
                    L3b:
                        r5 = 0
                        goto L1c
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.TwoStepVerificationService$callUserSettingsBeforeUpsell2svWalletPopUpShow$1.m155then(X.10K):void");
                }

                @Override // X.C10I
                public /* bridge */ /* synthetic */ Object then(C10K c10k) {
                    m155then((C10K<UserSettingsResponse.UserSettingsData>) c10k);
                    return C76800UCe.LIZ;
                }
            });
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Exception while calling user settings API for Profile Wallet popup: ");
            LIZ.append(e);
            PRC.LIZ(6, "UPSELL_2SV_POPUP", X1D.LIZIZ(LIZ));
            noShowDialog.invoke();
        }
    }

    public final void fireETForPopupAction(C85057XZt c85057XZt, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str = this.upsell2svCampaignObj.LIZIZ;
        int hashCode = str.hashCode();
        String str2 = "dismiss";
        if (hashCode != -1954817805) {
            if (hashCode != -1564232227) {
                if (hashCode != -1130999656 || !str.equals("follower_2sv_upsell")) {
                    return;
                }
                String enterFrom = c85057XZt.LJFF;
                int i9 = !z ? 1 : 0;
                o.LJIIIZ(enterFrom, "enterFrom");
                C188727au LJFF = C85144XbI.LJFF();
                LJFF.LJIIIZ("enter_from", enterFrom);
                LJFF.LIZLLL(i9, "result");
                FMX.LJIIL("optional_twosv_popup", LJFF.LIZ);
                return;
            }
            if (!str.equals("wallet_2sv_upsell")) {
                return;
            }
            String str3 = c85057XZt.LJFF;
            if (!z) {
                str2 = "turn_on";
            }
            Integer business_account_2sv_upsell = this.userSettingsResponse.getBusiness_account_2sv_upsell();
            if (business_account_2sv_upsell != null) {
                i5 = business_account_2sv_upsell.intValue();
            } else {
                i5 = 0;
            }
            Integer tt_live_2sv_upsell = this.userSettingsResponse.getTt_live_2sv_upsell();
            if (tt_live_2sv_upsell != null) {
                i6 = tt_live_2sv_upsell.intValue();
            } else {
                i6 = 0;
            }
            Integer tt_shop_2sv_upsell = this.userSettingsResponse.getTt_shop_2sv_upsell();
            if (tt_shop_2sv_upsell != null) {
                i7 = tt_shop_2sv_upsell.intValue();
            } else {
                i7 = 0;
            }
            Integer managed_account_2sv_upsell = this.userSettingsResponse.getManaged_account_2sv_upsell();
            if (managed_account_2sv_upsell != null) {
                i8 = managed_account_2sv_upsell.intValue();
            } else {
                i8 = 0;
            }
            C85144XbI.LJ(0, i5, i6, i7, i8, 1, this.popCacheObj.LJIIIZ, str3, str2);
            return;
        }
        if (!str.equals("enterprise_acc_2sv_upsell")) {
            return;
        }
        String str4 = c85057XZt.LJFF;
        if (!z) {
            str2 = "turn_on";
        }
        Integer business_account_2sv_upsell2 = this.userSettingsResponse.getBusiness_account_2sv_upsell();
        if (business_account_2sv_upsell2 != null) {
            i = business_account_2sv_upsell2.intValue();
        } else {
            i = 0;
        }
        Integer tt_live_2sv_upsell2 = this.userSettingsResponse.getTt_live_2sv_upsell();
        if (tt_live_2sv_upsell2 != null) {
            i2 = tt_live_2sv_upsell2.intValue();
        } else {
            i2 = 0;
        }
        Integer tt_shop_2sv_upsell2 = this.userSettingsResponse.getTt_shop_2sv_upsell();
        if (tt_shop_2sv_upsell2 != null) {
            i3 = tt_shop_2sv_upsell2.intValue();
        } else {
            i3 = 0;
        }
        Integer managed_account_2sv_upsell2 = this.userSettingsResponse.getManaged_account_2sv_upsell();
        if (managed_account_2sv_upsell2 != null) {
            i4 = managed_account_2sv_upsell2.intValue();
        } else {
            i4 = 0;
        }
        C85144XbI.LJ(1, i, i2, i3, i4, 0, this.popCacheObj.LJ, str4, str2);
    }

    @Override // X.InterfaceC26157AOj
    public void handlePushChallengeInfo(String ticket, String url) {
        o.LJIIIZ(ticket, "ticket");
        o.LJIIIZ(url, "url");
        XG9 xg9 = XG9.LJLIL;
        if (!TextUtils.isEmpty(ticket) && !TextUtils.isEmpty(url) && !((Keva) XG9.LJLJJL.getValue()).contains(ticket)) {
            try {
                Intent buildIntent = SmartRouter.buildRoute(EF7.LIZIZ(), "//main/deep_link_handler").buildIntent();
                buildIntent.setData(UriProtector.parse(url));
                buildIntent.addFlags(268435456);
                if (ActivityStack.isAppBackGround()) {
                    XG9.LJLILLLLZI = System.currentTimeMillis();
                    XG9.LJLJI = buildIntent;
                    XG9.LJLJJI = ticket;
                    ((Application) EF7.LIZIZ()).registerActivityLifecycleCallbacks(xg9);
                } else {
                    buildIntent.addFlags(536870912);
                    XG9.LIZ(ticket);
                    C16880lQ.LIZJ(EF7.LIZIZ(), buildIntent);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final boolean isCampaignTypeResponseTrue(String str, UserSettingsResponse.UserSettingsData userSettingsData) {
        Integer tt_shop_2sv_upsell;
        Integer business_account_2sv_upsell;
        Integer managed_account_2sv_upsell;
        Integer gen_pop_wallet_2sv_upsell;
        Integer follower_2sv_upsell;
        int hashCode = str.hashCode();
        if (hashCode != -1954817805) {
            if (hashCode != -1564232227) {
                if (hashCode != -1130999656 || !str.equals("follower_2sv_upsell") || (follower_2sv_upsell = userSettingsData.getFollower_2sv_upsell()) == null || follower_2sv_upsell.intValue() != 1) {
                    return false;
                }
                return true;
            }
            if (!str.equals("wallet_2sv_upsell") || (gen_pop_wallet_2sv_upsell = userSettingsData.getGen_pop_wallet_2sv_upsell()) == null || gen_pop_wallet_2sv_upsell.intValue() != 1) {
                return false;
            }
            return true;
        }
        if (str.equals("enterprise_acc_2sv_upsell")) {
            Integer tt_live_2sv_upsell = userSettingsData.getTt_live_2sv_upsell();
            if ((tt_live_2sv_upsell == null || tt_live_2sv_upsell.intValue() != 1) && (((tt_shop_2sv_upsell = userSettingsData.getTt_shop_2sv_upsell()) == null || tt_shop_2sv_upsell.intValue() != 1) && (((business_account_2sv_upsell = userSettingsData.getBusiness_account_2sv_upsell()) == null || business_account_2sv_upsell.intValue() != 1) && ((managed_account_2sv_upsell = userSettingsData.getManaged_account_2sv_upsell()) == null || managed_account_2sv_upsell.intValue() != 1)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC26157AOj
    public void openTwoStepVerificationManageActivity(Activity activity, String enterFrom) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (C52927Kpv.LIZ()) {
            Intent intent = new Intent(activity, (Class<?>) TwoStepVerificationManagementActivity.class);
            intent.putExtra("enter_from", enterFrom);
            C16880lQ.LIZIZ(activity, intent);
        } else {
            Intent intent2 = new Intent(activity, (Class<?>) TwoStepVerificationManageActivity.class);
            intent2.putExtra("enter_from", enterFrom);
            C16880lQ.LIZIZ(activity, intent2);
        }
    }

    public final void setApiResponseCache(ActivityC45651qj activityC45651qj, UserSettingsResponse.UserSettingsData userSettingsData) {
        C85056XZs c85056XZs = this.popCacheObj;
        c85056XZs.LJI = isCampaignTypeResponseTrue("enterprise_acc_2sv_upsell", userSettingsData);
        c85056XZs.LJIIJ = isCampaignTypeResponseTrue("wallet_2sv_upsell", userSettingsData);
        updatePopCacheObj(activityC45651qj, c85056XZs);
    }

    public final void setCommonParamsForUpsellPopup(ActivityC45651qj activity, String campaignType) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(campaignType, "campaignType");
        C85058XZu c85058XZu = new C85058XZu(0);
        c85058XZu.LIZ = "two_step_verification_campaign";
        c85058XZu.LIZIZ = campaignType;
        c85058XZu.LIZJ = 1;
        this.upsell2svCampaignObj = c85058XZu;
        this.uid = R41.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.upsell2svCampaignObj.LIZ);
        LIZ.append(this.uid);
        String LIZIZ = X1D.LIZIZ(LIZ);
        this.cacheKeyUpsell2svPop = LIZIZ;
        C85056XZs c85056XZs = (C85056XZs) this.defaultSharedPrefInst.LIZJ(activity, C85056XZs.class, LIZIZ);
        if (c85056XZs == null) {
            c85056XZs = new C85056XZs(0);
        }
        this.popCacheObj = c85056XZs;
        String LJFF = i0.LJFF("UPSELL_2SV_POPUP-", campaignType);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("popCacheObj: ");
        LIZ2.append(this.popCacheObj);
        PRC.LIZ(4, LJFF, X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC26157AOj
    public DialogFragment showUpsell2svCommonPopUp(ActivityC45651qj activity, final C85057XZt popupData) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(popupData, "popupData");
        C26224AQy c26224AQy = new C26224AQy();
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = popupData.LIZ;
        c26224AQy.LIZ = c33381Ss.LIZ(activity);
        c26224AQy.LIZLLL = 2;
        String text = popupData.LIZIZ;
        o.LJIIIZ(text, "text");
        c26224AQy.LJ = text;
        c26224AQy.LIZIZ(popupData.LIZJ);
        c26224AQy.LJIILIIL = popupData.LIZLLL;
        String str = popupData.LJ;
        AqS119S0300000_15 aqS119S0300000_15 = new AqS119S0300000_15(activity, popupData, this, 0);
        c26224AQy.LJII = str;
        c26224AQy.LJIIIZ = aqS119S0300000_15;
        ASL LIZ = c26224AQy.LIZ();
        DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: com.ss.android.ugc.aweme.services.TwoStepVerificationService$showUpsell2svCommonPopUp$sheet$3
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                TwoStepVerificationService.this.fireETForPopupAction(popupData, true);
            }
        };
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJLIL = onCancelListener;
        C1DG.LJII(activity, "activity.supportFragmentManager", tuxSheet, "UPSELL_2SV_POPUP");
        updatePopUpCacheOnCampaignType(activity);
        fireETForPopupShow(popupData);
        return tuxSheet;
    }

    public final void updatePopCacheObj(Context context, C85056XZs c85056XZs) {
        this.defaultSharedPrefInst.LJIIJ(context, c85056XZs, this.cacheKeyUpsell2svPop);
    }

    @Override // X.InterfaceC26157AOj
    public void upsell2svHVAPopTask(ActivityC45651qj activity, C85057XZt popupData) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(popupData, "popupData");
        PRC.LIZ(4, "UPSELL_2SV_POPUP", "[Inbox Popup] Trigger Show");
        PopupManager.LJIIL(new C26162AOo(activity, popupData));
    }
}
