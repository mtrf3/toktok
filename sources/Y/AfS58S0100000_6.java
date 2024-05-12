package Y;

import X.AbstractC40360Fsi;
import X.BPL;
import X.C00F;
import X.C188727au;
import X.C36538EVq;
import X.C36692Eae;
import X.C36922EeM;
import X.C37179EiV;
import X.C38016Ew0;
import X.C38354F3m;
import X.C38995FSd;
import X.C3PG;
import X.C40609Fwj;
import X.C40611Fwl;
import X.C40885G2v;
import X.C61447O9r;
import X.C61878OQg;
import X.C65777Prh;
import X.C73318Sq2;
import X.C73411SrX;
import X.C76800UCe;
import X.C84763XOl;
import X.C86V;
import X.E2B;
import X.EU2;
import X.FMX;
import X.FRH;
import X.FVR;
import X.G2M;
import X.H78;
import X.InterfaceC35929E8f;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC73573Su9;
import X.InterfaceC88472Yns;
import X.MCA;
import X.ORZ;
import X.OSZ;
import X.RunnableC38981FRp;
import X.T16;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.postrechargeretention.PostRechargeRetentionViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.internal.i;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeModel;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeResponse;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeViewModel;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.consent.countrylist.RegionListViewModel;
import com.ss.android.ugc.aweme.compliance.consent.countrylist.service.RegionListAPI;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData;
import com.ss.android.ugc.aweme.journey.step.applanguage.ChooseAppLanguageComponent;
import com.ss.android.ugc.aweme.journey.step.contentlanguage.ContentLanguageComponent;
import com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment;
import com.ss.android.ugc.aweme.journey.step.lynx.LynxExperienceFragment;
import com.ss.android.ugc.aweme.journey.step.swipeup.SwipeUpVideoComponent;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel;
import com.ss.android.ugc.aweme.legoImp.task.RxSchedulerPurgeOptTask;
import com.ss.android.ugc.aweme.legoImpl.task.AdColdStartTask;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviInfoResponse;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviStarterAvatarListResponse;
import com.ss.android.ugc.aweme.net.NetworkInitTask;
import com.ss.android.ugc.aweme.qna.api.TiktokV1ForumProfileBannerResponse;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.ss.android.ugc.aweme.setting.api.BetaAppApi;
import com.ss.android.ugc.aweme.setting.api.BetaVersionBody;
import com.ss.android.ugc.aweme.setting.api.InboxMsgRequestBody;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.lego.BetaAppTask;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonRequestCheck;
import com.ss.android.ugc.aweme.task.hook.MainActivityLowMmProtectTask;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public class AfS58S0100000_6 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void accept$39(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((InterfaceC88472Yns) afS58S0100000_6.l0).invoke(obj);
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            case 21:
                accept$21(this, obj);
                return;
            case 22:
                accept$22(this, obj);
                return;
            case 23:
                accept$23(this, obj);
                return;
            case 24:
                accept$24(this, obj);
                return;
            case 25:
                accept$25(this, obj);
                return;
            case 26:
                accept$26(this, obj);
                return;
            case 27:
                accept$27(this, obj);
                return;
            case 28:
                accept$28(this, obj);
                return;
            case 29:
                accept$29(this, obj);
                return;
            case 30:
                accept$30(this, obj);
                return;
            case 31:
                accept$31(this, obj);
                return;
            case 32:
                accept$32(this, obj);
                return;
            case 33:
                accept$33(this, obj);
                return;
            case 34:
                accept$34(this, obj);
                return;
            case 35:
                accept$35(this, obj);
                return;
            case 36:
                accept$36(this, obj);
                return;
            case 37:
                accept$37(this, obj);
                return;
            case 38:
                accept$38(this, obj);
                return;
            case 39:
                accept$39(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                accept$40(this, obj);
                return;
            case 41:
                accept$41(this, obj);
                return;
            case 42:
                accept$42(this, obj);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                accept$43(this, obj);
                return;
            case 44:
                accept$44(this, obj);
                return;
            case 45:
                accept$45(this, obj);
                return;
            case 46:
                accept$46(this, obj);
                return;
            case 47:
                accept$47(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                accept$48(this, obj);
                return;
            case C61447O9r.LJIIJ:
                accept$49(this, obj);
                return;
            case 50:
                accept$50(this, obj);
                return;
            case 51:
                accept$51(this, obj);
                return;
            case 52:
                accept$52(this, obj);
                return;
            case 53:
                accept$53(this, obj);
                return;
            case 54:
                accept$54(this, obj);
                return;
            case 55:
                accept$55(this, obj);
                return;
            case 56:
                accept$56(this, obj);
                return;
            case 57:
                accept$57(this, obj);
                return;
            case 58:
                accept$58(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS58S0100000_6(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        this.$t = interfaceC88472Yns2;
        switch (interfaceC88472Yns2) {
            case null:
            case 15:
                this.l0 = interfaceC88472Yns;
                return;
            default:
                this.l0 = interfaceC88472Yns;
                return;
        }
    }

    public static final void accept$0(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((InterfaceC88472Yns) afS58S0100000_6.l0).invoke(obj);
    }

    public static final void accept$1(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        G2M g2m = (G2M) obj;
        if (g2m.LIZIZ && C84763XOl.LJIIJJI) {
            g2m.LIZ.LJIIL();
        }
        C73411SrX c73411SrX = ((ChooseAppLanguageComponent) afS58S0100000_6.l0).LJLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$10(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        C40885G2v c40885G2v = (C40885G2v) obj;
        if (c40885G2v.LIZIZ && C84763XOl.LJIIJJI) {
            c40885G2v.LIZ.LJIIL();
        }
        C73411SrX c73411SrX = ((SwipeUpVideoComponent) afS58S0100000_6.l0).LJLLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$11(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((ITpcConsentService) obj).LJFF();
        C73411SrX c73411SrX = ((SwipeUpVideoComponent) afS58S0100000_6.l0).LJLLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$12(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        Boolean isBackground = (Boolean) obj;
        o.LJIIIIZZ(isBackground, "isBackground");
        if (isBackground.booleanValue()) {
            ((RxSchedulerPurgeOptTask) afS58S0100000_6.l0).LJLIL = true;
        }
        C37179EiV.LIZJ(true).execute(new ARunnableS25S0200000_6((RxSchedulerPurgeOptTask) afS58S0100000_6.l0, isBackground, 12));
    }

    public static final void accept$13(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        if (!e1.LIZ(31744, "store_clear_open", true, false)) {
            return;
        }
        C37179EiV.LJFF.postDelayed(new ARunnableS42S0100000_6((Context) afS58S0100000_6.l0, 37), 1000L);
    }

    public static final void accept$14(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((AdColdStartTask) afS58S0100000_6.l0).getClass();
    }

    public static final void accept$15(AfS58S0100000_6 afS58S0100000_6, Object it) {
        o.LJIIIZ(it, "it");
        ((InterfaceC88472Yns) afS58S0100000_6.l0).invoke(it);
    }

    public static final void accept$16(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        Throwable it = (Throwable) obj;
        NetworkInitTask networkInitTask = (NetworkInitTask) afS58S0100000_6.l0;
        o.LJIIIIZZ(it, "it");
        networkInitTask.getClass();
        NetworkInitTask.LIZLLL("RxJavaPlugins.ErrorHandler caught!", it);
    }

    public static final void accept$17(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((QnaBannerViewModel) afS58S0100000_6.l0).setState(new AqS172S0100000_6((TiktokV1ForumProfileBannerResponse) obj, 26));
    }

    public static final void accept$18(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((QnaBannerViewModel) afS58S0100000_6.l0).setState(new AqS172S0100000_6((Throwable) obj, 27));
    }

    public static final void accept$19(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FetchABTestCommonRequest failed, is_combine = false, throwable = ");
        LIZ.append(obj);
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
        if (!C3PG.LIZIZ.LIZ("config_fetch_success")) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("status", CardStruct.IStatusCode.DEFAULT);
            c188727au.LJIIIZ("source", "1");
            c188727au.LIZLLL(((String[]) afS58S0100000_6.l0).length, "v_count");
            FMX.LJIIL("config_fetch_success", c188727au.LIZ);
        }
    }

    public static final void accept$2(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
        if (iTpcConsentService != null) {
            iTpcConsentService.LJFF();
        }
        C73411SrX c73411SrX = ((ChooseAppLanguageComponent) afS58S0100000_6.l0).LJLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$20(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        i.LIZJ(new ARunnableS25S0200000_6((FetchABTestCommonRequestCheck) afS58S0100000_6.l0, (E2B) obj, 20));
    }

    public static final void accept$21(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLowMmProtect", "HomeActivity save instance callback");
        Activity activity = ((BPL) obj).LIZ;
        if (activity != null) {
            MainActivityLowMmProtectTask mainActivityLowMmProtectTask = (MainActivityLowMmProtectTask) afS58S0100000_6.l0;
            if (mainActivityLowMmProtectTask.LJLIL.getValue() == null) {
                return;
            }
            try {
                Map map = (Map) mainActivityLowMmProtectTask.LJLIL.getValue();
                o.LJI(map);
                for (Object obj2 : map.values()) {
                    if (C36538EVq.LIZJ(obj2, "activity") == activity) {
                        C36538EVq.LJI(obj2, null, "state");
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLowMmProtect", "do HomeActivity lmm protect success");
                    }
                }
            } catch (RuntimeException e) {
                ALog.e("ActivityLowMmProtect", "do HomeActivity lmm protect hook fail", e);
            }
        }
    }

    public static final void accept$22(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        if (!((Boolean) obj).booleanValue() && C00F.LIZ(31744, 0, "cancel_other_push", true) == 1) {
            PushService.createIPushApibyMonsterPlugin(false).clearAll((Context) afS58S0100000_6.l0);
        }
    }

    public static final void accept$23(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((OSZ) obj).getSecond();
        ((InfoStickerSearchListViewModel.RecommendListModel) afS58S0100000_6.l0).getClass();
        throw null;
    }

    public static final void accept$24(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((OSZ) obj).getSecond();
        ((InfoStickerSearchListViewModel.RecommendListModel) afS58S0100000_6.l0).getClass();
        throw null;
    }

    public static final void accept$25(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        C38995FSd.LIZJ().execute(new ARunnableS25S0200000_6((BPL) obj, (RunnableC38981FRp) afS58S0100000_6.l0, 28));
    }

    public static final void accept$26(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((KidsAwemeGridViewModel) afS58S0100000_6.l0).LJLJL = false;
    }

    public static final void accept$27(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        OSZ osz = (OSZ) obj;
        if (((List) osz.getFirst()).isEmpty()) {
            ((KidsAwemeGridViewModel) afS58S0100000_6.l0).LJLJJI.postValue(-1);
            return;
        }
        ((KidsAwemeGridViewModel) afS58S0100000_6.l0).LJLJJI.postValue(0);
        ArrayList arrayList = new ArrayList();
        Collection value = ((KidsAwemeGridViewModel) afS58S0100000_6.l0).LJLILLLLZI.getValue();
        if (value == null) {
            value = C61878OQg.INSTANCE;
        }
        arrayList.addAll(value);
        arrayList.addAll((Collection) osz.getFirst());
        ((KidsAwemeGridViewModel) afS58S0100000_6.l0).LJLILLLLZI.postValue(arrayList);
    }

    public static final void accept$28(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((KidsAwemeGridViewModel) afS58S0100000_6.l0).LJLJJI.postValue(-2);
    }

    public static final void accept$29(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((KidsAwemeGridViewModel) afS58S0100000_6.l0).LJLJL = false;
    }

    public static final void accept$3(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        G2M g2m = (G2M) obj;
        if (g2m.LIZIZ && C84763XOl.LJIIJJI) {
            g2m.LIZ.LJIIL();
        }
        C73411SrX c73411SrX = ((ContentLanguageComponent) afS58S0100000_6.l0).LJLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$30(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        OSZ osz = (OSZ) obj;
        ((KidsAwemeGridViewModel) afS58S0100000_6.l0).LJLJI.postValue(osz.getSecond());
        if (((Number) osz.getSecond()).intValue() == 0) {
            if (((List) osz.getFirst()).isEmpty()) {
                ((KidsAwemeGridViewModel) afS58S0100000_6.l0).LJLJI.postValue(-1);
            } else {
                ((KidsAwemeGridViewModel) afS58S0100000_6.l0).LJLILLLLZI.postValue(ORZ.LLJILJILJ((Collection) osz.getFirst()));
            }
        }
    }

    public static final void accept$31(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((KidsAwemeGridViewModel) afS58S0100000_6.l0).LJLJI.postValue(-2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$32(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        Integer LIZ;
        BetaVersionBody it = (BetaVersionBody) obj;
        BetaAppTask betaAppTask = (BetaAppTask) afS58S0100000_6.l0;
        o.LJIIIIZZ(it, "it");
        betaAppTask.getClass();
        if (!it.LIZJ() || (LIZ = it.LIZ()) == null) {
            return;
        }
        int intValue = LIZ.intValue();
        if (!BetaAppExperiment.LIZIZ(intValue)) {
            return;
        }
        String LIZIZ = it.LIZIZ();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("beta_version", LIZIZ);
        c188727au.LIZLLL(intValue, "beta_build");
        FMX.LJIIL("tiktok_beta_update_dispatch", c188727au.LIZ);
        Keva keva = BetaAppExperiment.LJFF;
        keva.storeInt(BetaAppExperiment.LIZJ, intValue);
        if (LIZIZ == null) {
            LIZIZ = "";
        }
        keva.storeString(BetaAppExperiment.LIZLLL, LIZIZ);
        BetaAppApi.LIZ.getClass();
        Keva keva2 = C40609Fwj.LJ;
        if (keva2.getBoolean(C40609Fwj.LIZLLL, false) || keva2.getBoolean(C40609Fwj.LIZJ, false)) {
            return;
        }
        C40609Fwj.LIZIZ.sendInboxMsg(new InboxMsgRequestBody(1, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14, 0 == true ? 1 : 0)).LJJL(T16.LIZ()).LJJJJZI(C40611Fwl.LJLIL);
    }

    public static final void accept$33(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((InterfaceC35929E8f) afS58S0100000_6.l0).LIZ();
    }

    public static final void accept$34(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((InterfaceC35929E8f) afS58S0100000_6.l0).LIZIZ();
    }

    public static final void accept$35(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        Long it = (Long) obj;
        PostRechargeRetentionViewModel postRechargeRetentionViewModel = (PostRechargeRetentionViewModel) afS58S0100000_6.l0;
        o.LJIIIIZZ(it, "it");
        postRechargeRetentionViewModel.LJLL = it.longValue();
    }

    public static final void accept$36(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        Boolean isAppBackground = (Boolean) obj;
        o.LJIIIIZZ(isAppBackground, "isAppBackground");
        if (isAppBackground.booleanValue()) {
            ((AbstractC40360Fsi) afS58S0100000_6.l0).LIZLLL = true;
        }
    }

    public static final void accept$37(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        H78.LIZLLL("ProfileNaviHubViewModel", (Throwable) obj);
        ((InterfaceC88472Yns) afS58S0100000_6.l0).invoke(Boolean.FALSE);
    }

    public static final void accept$38(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ProfileNaviStarterAvatarListResponse profileNaviStarterAvatarListResponse = (ProfileNaviStarterAvatarListResponse) obj;
        if (profileNaviStarterAvatarListResponse != null) {
            ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel = (ProfileNaviOnboardingViewModel) afS58S0100000_6.l0;
            if (profileNaviStarterAvatarListResponse.error_code == 0) {
                profileNaviOnboardingViewModel.setState(new AqS178S0100000_12(profileNaviStarterAvatarListResponse, 407));
            }
        }
    }

    public static final void accept$4(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
        if (iTpcConsentService != null) {
            iTpcConsentService.LJFF();
        }
        C73411SrX c73411SrX = ((ContentLanguageComponent) afS58S0100000_6.l0).LJLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$40(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            MCA.LIZIZ((Context) afS58S0100000_6.l0);
        }
    }

    public static final void accept$41(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((InterfaceC65784Pro) afS58S0100000_6.l0).invoke();
    }

    public static final void accept$42(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        Context context = (Context) afS58S0100000_6.l0;
        if (!EU2.LIZIZ() && C84763XOl.LJIIIIZZ() == null) {
            System.currentTimeMillis();
        }
        if (!C38354F3m.LJ(AppLog.getClientId()) && !C38354F3m.LJ(FVR.LIZJ())) {
            try {
                new FRH(context).executeOnExecutor(C38016Ew0.LIZ, new Void[0]);
            } catch (Throwable unused) {
            }
        }
    }

    public static final void accept$43(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        EditProfileBadgeResponse editProfileBadgeResponse = (EditProfileBadgeResponse) obj;
        if (editProfileBadgeResponse.error_code == 0) {
            List<EditProfileBadgeModel> list = editProfileBadgeResponse.profileBadges;
            if (list != null) {
                ((ArrayList) ((EditProfileBadgeViewModel) afS58S0100000_6.l0).LJLJJLL).addAll(list);
            }
            EditProfileBadgeViewModel editProfileBadgeViewModel = (EditProfileBadgeViewModel) afS58S0100000_6.l0;
            editProfileBadgeViewModel.setState(new AqS137S0200000_6(editProfileBadgeResponse, editProfileBadgeViewModel, 29));
            return;
        }
        EditProfileBadgeViewModel editProfileBadgeViewModel2 = (EditProfileBadgeViewModel) afS58S0100000_6.l0;
        editProfileBadgeViewModel2.setState(new AqS172S0100000_6(editProfileBadgeViewModel2, 88));
    }

    public static final void accept$44(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        C36922EeM.LJFF((Throwable) obj);
        EditProfileBadgeViewModel editProfileBadgeViewModel = (EditProfileBadgeViewModel) afS58S0100000_6.l0;
        editProfileBadgeViewModel.setState(new AqS172S0100000_6(editProfileBadgeViewModel, 89));
    }

    public static final void accept$45(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((InterfaceC73573Su9) afS58S0100000_6.l0).onError((Throwable) obj);
    }

    public static final void accept$46(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        EditPreviewStickerViewModel editPreviewStickerViewModel = (EditPreviewStickerViewModel) afS58S0100000_6.l0;
        C36692Eae c36692Eae = new C36692Eae(null, 1, null);
        editPreviewStickerViewModel.getClass();
        editPreviewStickerViewModel.setState(new AqS180S0100000_14(c36692Eae, 333));
    }

    public static final void accept$47(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        EditPreviewStickerViewModel editPreviewStickerViewModel = (EditPreviewStickerViewModel) afS58S0100000_6.l0;
        C36692Eae c36692Eae = new C36692Eae(null, 1, null);
        editPreviewStickerViewModel.getClass();
        editPreviewStickerViewModel.setState(new AqS180S0100000_14(c36692Eae, 333));
    }

    public static final void accept$48(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        CutoutData cutoutData = (CutoutData) obj;
        EditPreviewStickerViewModel editPreviewStickerViewModel = (EditPreviewStickerViewModel) afS58S0100000_6.l0;
        C73318Sq2 c73318Sq2 = editPreviewStickerViewModel.LJLJJLL;
        if (c73318Sq2 != null && c73318Sq2.LJLILLLLZI) {
            return;
        }
        editPreviewStickerViewModel.setState(new AqS180S0100000_14(cutoutData, 334));
    }

    public static final void accept$49(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C36692Eae) {
            EditPreviewStickerViewModel editPreviewStickerViewModel = (EditPreviewStickerViewModel) afS58S0100000_6.l0;
            editPreviewStickerViewModel.getClass();
            editPreviewStickerViewModel.setState(new AqS180S0100000_14((C36692Eae) th, 333));
        } else {
            EditPreviewStickerViewModel editPreviewStickerViewModel2 = (EditPreviewStickerViewModel) afS58S0100000_6.l0;
            C36692Eae c36692Eae = new C36692Eae(null, 1, null);
            editPreviewStickerViewModel2.getClass();
            editPreviewStickerViewModel2.setState(new AqS180S0100000_14(c36692Eae, 333));
        }
    }

    public static final void accept$5(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        G2M g2m = (G2M) obj;
        if (g2m.LIZIZ && C84763XOl.LJIIJJI) {
            g2m.LIZ.LJIIL();
        }
        C73411SrX c73411SrX = ((AbstractSelectInterestFragment) afS58S0100000_6.l0).LJLLI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$50(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        OSZ osz = (OSZ) obj;
        ((KidsFeedViewModel) afS58S0100000_6.l0).LJLJI.postValue(osz.getSecond());
        if (((Number) osz.getSecond()).intValue() == 0) {
            if (((List) osz.getFirst()).isEmpty()) {
                ((KidsFeedViewModel) afS58S0100000_6.l0).LJLJI.postValue(-1);
            } else {
                ((KidsFeedViewModel) afS58S0100000_6.l0).LJLILLLLZI.postValue(ORZ.LLJILJILJ((Collection) osz.getFirst()));
            }
        }
    }

    public static final void accept$51(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((KidsFeedViewModel) afS58S0100000_6.l0).LJLJI.postValue(-2);
    }

    public static final void accept$52(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        OSZ osz = (OSZ) obj;
        if (((List) osz.getFirst()).isEmpty()) {
            ((KidsFeedViewModel) afS58S0100000_6.l0).LJLJJL.postValue(Boolean.FALSE);
            return;
        }
        ((KidsFeedViewModel) afS58S0100000_6.l0).LJLJJL.postValue(Boolean.TRUE);
        ArrayList arrayList = new ArrayList();
        Collection value = ((KidsFeedViewModel) afS58S0100000_6.l0).LJLILLLLZI.getValue();
        if (value == null) {
            value = C61878OQg.INSTANCE;
        }
        arrayList.addAll(value);
        arrayList.addAll((Collection) osz.getFirst());
        ((KidsFeedViewModel) afS58S0100000_6.l0).LJLILLLLZI.postValue(arrayList);
    }

    public static final void accept$53(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((KidsFeedViewModel) afS58S0100000_6.l0).LJLJJL.postValue(Boolean.FALSE);
    }

    public static final void accept$54(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        OSZ osz = (OSZ) obj;
        ((KidsFeedViewModel) afS58S0100000_6.l0).LJLJJI.postValue(osz.getSecond());
        if (((Number) osz.getSecond()).intValue() == 0) {
            if (((List) osz.getFirst()).isEmpty()) {
                ((KidsFeedViewModel) afS58S0100000_6.l0).LJLJJI.postValue(-1);
            } else {
                ((KidsFeedViewModel) afS58S0100000_6.l0).LJLILLLLZI.postValue(ORZ.LLJILJILJ((Collection) osz.getFirst()));
            }
        }
    }

    public static final void accept$55(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((KidsFeedViewModel) afS58S0100000_6.l0).LJLJJI.postValue(-2);
    }

    public static final void accept$56(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        RegionListAPI.RegionListAPIResponse regionListAPIResponse = (RegionListAPI.RegionListAPIResponse) obj;
        RegionListAPI.RegionList regionList = regionListAPIResponse.data;
        if (regionList != null) {
            if (regionList.regionList == null) {
                if (regionList != null && regionList.description != null) {
                    ((RegionListViewModel) afS58S0100000_6.l0).LJLILLLLZI.postValue(regionList.description);
                    return;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                String LJIJI = a.LIZIZ().LJIJI();
                if (LJIJI != null) {
                    String LJFF = C86V.LJFF(R.string.pyl);
                    o.LJIIIIZZ(LJFF, "getString(R.string.regio…Country_list_description)");
                    arrayList.add(new RegionListAPI.Country(LJFF, LJIJI));
                }
                List<RegionListAPI.Country> list = regionListAPIResponse.data.regionList;
                o.LJII(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.compliance.consent.countrylist.service.RegionListAPI.Country>");
                arrayList.addAll(C65777Prh.LIZIZ(list));
                ((RegionListViewModel) afS58S0100000_6.l0).LJLIL.postValue(arrayList);
                return;
            }
        }
        ((RegionListViewModel) afS58S0100000_6.l0).LJLILLLLZI.postValue(C86V.LJFF(R.string.pyq));
    }

    public static final void accept$57(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ((RegionListViewModel) afS58S0100000_6.l0).LJLILLLLZI.postValue(C86V.LJFF(R.string.pyq));
    }

    public static final void accept$58(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ProfileNaviDataModel profileNaviDataModel;
        ProfileNaviInfoResponse profileNaviInfoResponse = (ProfileNaviInfoResponse) obj;
        if (profileNaviInfoResponse != null) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS58S0100000_6.l0;
            if (profileNaviInfoResponse.error_code == 0 && (profileNaviDataModel = profileNaviInfoResponse.navi) != null) {
                interfaceC88472Yns.invoke(profileNaviDataModel);
            }
        }
    }

    public static final void accept$6(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
        if (iTpcConsentService != null) {
            iTpcConsentService.LJFF();
        }
        C73411SrX c73411SrX = ((AbstractSelectInterestFragment) afS58S0100000_6.l0).LJLLI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$7(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        if (C84763XOl.LJIIJJI) {
            ((LynxExperienceFragment) afS58S0100000_6.l0).Dl("", true);
        }
    }

    public static final void accept$8(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        G2M g2m = (G2M) obj;
        if (g2m.LIZIZ && C84763XOl.LJIIJJI) {
            g2m.LIZ.LJIIL();
        }
        C73411SrX c73411SrX = ((LynxExperienceFragment) afS58S0100000_6.l0).LJLJLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$9(AfS58S0100000_6 afS58S0100000_6, Object obj) {
        ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
        if (iTpcConsentService != null) {
            iTpcConsentService.LJFF();
        }
        C73411SrX c73411SrX = ((LynxExperienceFragment) afS58S0100000_6.l0).LJLJLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public AfS58S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
