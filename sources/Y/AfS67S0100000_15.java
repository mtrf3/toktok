package Y;

import X.AbstractC35632Dye;
import X.AbstractC66965QPx;
import X.ActivityC45651qj;
import X.C00F;
import X.C0NB;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C188447aS;
import X.C1E5;
import X.C26045AKb;
import X.C29306Beo;
import X.C32I;
import X.C35631Dyd;
import X.C35633Dyf;
import X.C35936E8m;
import X.C36241EKf;
import X.C36922EeM;
import X.C3C5;
import X.C43023GuZ;
import X.C43045Guv;
import X.C52265KfF;
import X.C56692Kj;
import X.C58242MtS;
import X.C5S1;
import X.C60903NvH;
import X.C61447O9r;
import X.C61878OQg;
import X.C68942R3y;
import X.C69014R6s;
import X.C69025R7d;
import X.C69032R7k;
import X.C69084R9k;
import X.C69134RBi;
import X.C69135RBj;
import X.C73411SrX;
import X.C73666Sve;
import X.C73969T1h;
import X.C74088T5w;
import X.C75792yF;
import X.C76800UCe;
import X.C78688UuS;
import X.C78886Uxe;
import X.C78963Uyt;
import X.C84539XFv;
import X.C84767XOp;
import X.C84916XUi;
import X.C84919XUl;
import X.C85144XbI;
import X.C85631Xj9;
import X.C85642XjK;
import X.C85649XjR;
import X.C85679Xjv;
import X.C85686Xk2;
import X.C85711XkR;
import X.C85766XlK;
import X.C86336XuW;
import X.C86343Xud;
import X.C86393XvR;
import X.C86442XwE;
import X.C86478Xwo;
import X.C86496Xx6;
import X.C86497Xx7;
import X.C86499Xx9;
import X.C86505XxF;
import X.C86506XxG;
import X.C86512XxM;
import X.C86861Y7d;
import X.C86863Y7f;
import X.C86881Y7x;
import X.C9WD;
import X.DialogC86015XpL;
import X.E2C;
import X.EFJ;
import X.EnumC32529Cph;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.EnumC79996VaS;
import X.EnumC86508XxI;
import X.EnumC86518XxS;
import X.EnumC86865Y7h;
import X.FMX;
import X.G8G;
import X.H8F;
import X.HandlerC86501XxB;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC85277XdR;
import X.InterfaceC85767XlL;
import X.InterfaceC86546Xxu;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.OSZ;
import X.R41;
import X.RBV;
import X.RC0;
import X.RC2;
import X.RCD;
import X.RCE;
import X.WPY;
import X.X1D;
import X.X80;
import X.X8Q;
import X.X9Y;
import X.XJ4;
import X.XM8;
import X.XS7;
import X.XSB;
import X.XW2;
import X.XZG;
import X.XZJ;
import X.Y80;
import X.Y86;
import X.YMF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.i18n.I18nApiResult;
import com.bytedance.android.livesdk.i18n.I18nDbManager;
import com.bytedance.android.livesdk.i18n.I18nUpdateManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreateAccountModel;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailFragment;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.RuInstantLoginSIModeFragment;
import com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyEmailFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifySmsFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyEmailForTicketFragment;
import com.ss.android.ugc.aweme.account.login.ui.CountDownTimer;
import com.ss.android.ugc.aweme.account.login.v2.network.Check2SvPushClickResponse;
import com.ss.android.ugc.aweme.account.login.v2.network.Request2svPushChallengeResponse;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BindEmailWithoutVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.account.unbind.IUnbindApi;
import com.ss.android.ugc.aweme.account.unbind.UnbindInputCodeFragment;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.SettingMessage;
import com.ss.android.ugc.aweme.innerpush.model.GetMessageListResponse;
import com.ss.android.ugc.aweme.live.GoLiveActivity;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.paidcontent.api.PaidCollectionReviewDetailApi;
import com.ss.android.ugc.aweme.performance.OpenEditMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDetailDiscoveryViewModel;
import com.ss.android.ugc.aweme.relation.fragment.AddPhoneNumberSheetFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AfS67S0100000_15 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;

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
            case 59:
                accept$59(this, obj);
                return;
            case 60:
                accept$60(this, obj);
                return;
            case 61:
                accept$61(this, obj);
                return;
            case BaseNotice.CREATOR /* 62 */:
                accept$62(this, obj);
                return;
            case 63:
                accept$63(this, obj);
                return;
            case 64:
                accept$64(this, obj);
                return;
            case 65:
                accept$65(this, obj);
                return;
            case 66:
                accept$66(this, obj);
                return;
            case 67:
                accept$67(this, obj);
                return;
            case 68:
                accept$68(this, obj);
                return;
            case 69:
                accept$69(this, obj);
                return;
            case 70:
                accept$70(this, obj);
                return;
            case 71:
                accept$71(this, obj);
                return;
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                accept$72(this, obj);
                return;
            case 73:
                accept$73(this, obj);
                return;
            case 74:
                accept$74(this, obj);
                return;
            case 75:
                accept$75(this, obj);
                return;
            case 76:
                accept$76(this, obj);
                return;
            case 77:
                accept$77(this, obj);
                return;
            case 78:
                accept$78(this, obj);
                return;
            case 79:
                accept$79(this, obj);
                return;
            case 80:
                accept$80(this, obj);
                return;
            case 81:
                accept$81(this, obj);
                return;
            case 82:
                accept$82(this, obj);
                return;
            case 83:
                accept$83(this, obj);
                return;
            case 84:
                accept$84(this, obj);
                return;
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                accept$85(this, obj);
                return;
            case 86:
                accept$86(this, obj);
                return;
            case 87:
                accept$87(this, obj);
                return;
            case 88:
                accept$88(this, obj);
                return;
            case 89:
                accept$89(this, obj);
                return;
            case 90:
                accept$90(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS67S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InputPhoneFragment) afS67S0100000_15.l0).Tl(true);
    }

    public static final void accept$1(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        if (((InputPhoneFragment) afS67S0100000_15.l0).Sl()) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZ(1, "is_success");
            c35936E8m.LIZLLL("method", "phone");
            c35936E8m.LIZLLL("page", "Set up by Phone");
            c35936E8m.LIZIZ(System.currentTimeMillis() - ((InputPhoneFragment) afS67S0100000_15.l0).LLD, "duration");
            FMX.LJIIL("click_next_for_proAccount", c35936E8m.LIZ);
        }
        ((InputPhoneFragment) afS67S0100000_15.l0).Tl(true);
    }

    public static final void accept$10(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InputCodeFragment) afS67S0100000_15.l0).hm();
    }

    public static final void accept$11(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InputCodeFragment) afS67S0100000_15.l0).hm();
    }

    public static final void accept$12(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InputCodeFragment) afS67S0100000_15.l0).hm();
    }

    public static final void accept$13(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ActivityC45651qj mo49getActivity = ((InputCodeFragment) afS67S0100000_15.l0).mo49getActivity();
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS67S0100000_15.l0;
        inputCodeFragment.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(inputCodeFragment.dm());
        LIZ.append("_voice");
        String LIZIZ = X1D.LIZIZ(LIZ);
        CountDownTimer countDownTimer = new CountDownTimer(60000L, 1000L, null);
        countDownTimer.start();
        o.LJIIIIZZ(countDownTimer, "CountDownTimer(TimerText…L.toLong(), null).start()");
        C69134RBi.LIZIZ(mo49getActivity, LIZIZ, new C69135RBj(countDownTimer), ((InputCodeFragment) afS67S0100000_15.l0).xl());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$14(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Map<String, String> map;
        Map<String, String> map2;
        BaseResponse baseResponse = (BaseResponse) obj;
        I18nUpdateManager i18nUpdateManager = (I18nUpdateManager) afS67S0100000_15.l0;
        i18nUpdateManager.LIZLLL = false;
        if (baseResponse == null || baseResponse.statusCode != 0 || baseResponse.data == 0) {
            i18nUpdateManager.LIZ(new Throwable("response == null || response.statusCode != 0 || response.data == null"));
            return;
        }
        C0NB.LIZIZ("i18n_translation", "update on success");
        I18nUpdateManager i18nUpdateManager2 = (I18nUpdateManager) afS67S0100000_15.l0;
        i18nUpdateManager2.LJ = 0;
        i18nUpdateManager2.LJFF = SystemClock.elapsedRealtime();
        I18nApiResult i18nApiResult = (I18nApiResult) baseResponse.data;
        I18nUpdateManager i18nUpdateManager3 = (I18nUpdateManager) afS67S0100000_15.l0;
        Y86 y86 = i18nUpdateManager3.LIZJ;
        if (y86 == null) {
            return;
        }
        String str = i18nUpdateManager3.LIZ;
        long j = i18nApiResult.latestVersion;
        Map<String, String> map3 = i18nApiResult.fullPackage;
        Y80 y80 = (Y80) y86;
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str, y80.LIZ.LIZ)) {
            if (TextUtils.isEmpty(str)) {
                C0NB.LJ("i18n_translation", "locale is not matched on api result, locale in result is empty");
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("locale is not matched on api result, locale in result is ");
            LIZ.append(str);
            C0NB.LJ("i18n_translation", X1D.LIZIZ(LIZ));
            return;
        }
        C86881Y7x c86881Y7x = y80.LIZ;
        if (j == c86881Y7x.LIZIZ) {
            if (c86881Y7x.LJFF != null && (map2 = c86881Y7x.LIZJ) != null && map2.isEmpty()) {
                y80.LIZ.LJFF.queryTranslations();
            }
            C0NB.LIZIZ("i18n_translation", "version from api is lower than or equals with version in memory");
            return;
        }
        if (map3 == null || map3.isEmpty()) {
            C86881Y7x c86881Y7x2 = y80.LIZ;
            if (c86881Y7x2.LJFF != null && (map = c86881Y7x2.LIZJ) != null && map.isEmpty()) {
                y80.LIZ.LJFF.queryTranslations();
            }
            C0NB.LIZIZ("i18n_translation", "translations from api is empty, no need process");
            return;
        }
        C86881Y7x c86881Y7x3 = y80.LIZ;
        c86881Y7x3.LIZIZ = j;
        c86881Y7x3.LIZJ = map3;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("on api result, update translationMap in memory, version is ");
        LIZ2.append(y80.LIZ.LIZIZ);
        C0NB.LIZIZ("i18n_translation", X1D.LIZIZ(LIZ2));
        I18nDbManager i18nDbManager = y80.LIZ.LJFF;
        if (i18nDbManager == null) {
            return;
        }
        i18nDbManager.updateTranslations(j, map3);
    }

    public static final void accept$15(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        I18nUpdateManager i18nUpdateManager = (I18nUpdateManager) afS67S0100000_15.l0;
        i18nUpdateManager.LIZLLL = false;
        i18nUpdateManager.LIZ((Throwable) obj);
    }

    public static final void accept$16(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((ChangeEmailFragment) afS67S0100000_15.l0).fm(true);
    }

    public static final void accept$17(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((EmailPopUpFragment) afS67S0100000_15.l0);
        c26045AKb.LJIIIZ(((EmailPopUpFragment) afS67S0100000_15.l0).getString(R.string.hxu));
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJII(R.attr.e8);
        c26045AKb.LIZ(true);
        c26045AKb.LJIIJ();
    }

    public static final void accept$18(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Throwable th = (Throwable) obj;
        if ((th instanceof C69084R9k) && th != null) {
            C85766XlK.LIZ((InterfaceC85767XlL) afS67S0100000_15.l0, th, true, null, 12);
        }
    }

    public static final void accept$19(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        C85766XlK.LIZ((InterfaceC85767XlL) afS67S0100000_15.l0, (Throwable) obj, false, null, 12);
    }

    public static final void accept$2(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        C85711XkR.LIZJ(((InputPhoneFragment) afS67S0100000_15.l0).LJJLIIIJJI(), "1", "mobile", ((InputPhoneFragment) afS67S0100000_15.l0).Rl(), CardStruct.IStatusCode.DEFAULT);
        C85711XkR.LIZLLL(((InputPhoneFragment) afS67S0100000_15.l0).LJJLIIIJJI(), "mobile", ((InputPhoneFragment) afS67S0100000_15.l0).Rl());
        ((InputPhoneFragment) afS67S0100000_15.l0).Tl(true);
    }

    public static final void accept$20(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        String platForm = ((TwoStepVerifyEmailFor2046Fragment) afS67S0100000_15.l0).mm();
        o.LJIIIIZZ(platForm, "platForm");
        C85144XbI.LJJ(platForm, "email", true);
        String enterFrom = ((TwoStepVerifyEmailFor2046Fragment) afS67S0100000_15.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = ((TwoStepVerifyEmailFor2046Fragment) afS67S0100000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        String platForm2 = ((TwoStepVerifyEmailFor2046Fragment) afS67S0100000_15.l0).mm();
        o.LJIIIIZZ(platForm2, "platForm");
        C85144XbI.LJIJJ(enterFrom, enterMethod, platForm2, "email", ((CompoundButton) ((TwoStepVerifyEmailFor2046Fragment) afS67S0100000_15.l0)._$_findCachedViewById(R.id.b_d)).isChecked());
        TwoStepVerifyEmailFor2046Fragment twoStepVerifyEmailFor2046Fragment = (TwoStepVerifyEmailFor2046Fragment) afS67S0100000_15.l0;
        RC0.LJI(twoStepVerifyEmailFor2046Fragment.LLIIIILZ, twoStepVerifyEmailFor2046Fragment.LLIIII);
        Bundle arguments = ((TwoStepVerifyEmailFor2046Fragment) afS67S0100000_15.l0).getArguments();
        o.LJI(arguments);
        Bundle bundle = new Bundle();
        String str = ((C69025R7d) obj).LJIIIZ;
        o.LJIIIIZZ(str, "it.ticket");
        RBV.LJIILL(bundle, str);
        arguments.putBundle("final_data", bundle);
        TwoStepVerifyEmailFor2046Fragment twoStepVerifyEmailFor2046Fragment2 = (TwoStepVerifyEmailFor2046Fragment) afS67S0100000_15.l0;
        Bundle arguments2 = twoStepVerifyEmailFor2046Fragment2.getArguments();
        o.LJI(arguments2);
        twoStepVerifyEmailFor2046Fragment2.Dl(arguments2);
    }

    public static final void accept$21(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        C74088T5w c74088T5w = (C74088T5w) ((TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0)._$_findCachedViewById(R.id.ayj);
        String string = ((TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0).getString(R.string.pm3, String.valueOf(obj));
        o.LJIIIIZZ(string, "getString(R.string.pushc…esend_btn, it.toString())");
        c74088T5w.setText(string);
    }

    public static final void accept$22(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        String platForm = ((TwoStepVerifySmsFor2046Fragment) afS67S0100000_15.l0).mm();
        o.LJIIIIZZ(platForm, "platForm");
        C85144XbI.LJJ(platForm, "sms", true);
        String enterFrom = ((TwoStepVerifySmsFor2046Fragment) afS67S0100000_15.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = ((TwoStepVerifySmsFor2046Fragment) afS67S0100000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        String platForm2 = ((TwoStepVerifySmsFor2046Fragment) afS67S0100000_15.l0).mm();
        o.LJIIIIZZ(platForm2, "platForm");
        C85144XbI.LJIJJ(enterFrom, enterMethod, platForm2, "sms", ((CompoundButton) ((TwoStepVerifySmsFor2046Fragment) afS67S0100000_15.l0)._$_findCachedViewById(R.id.b_d)).isChecked());
        TwoStepVerifySmsFor2046Fragment twoStepVerifySmsFor2046Fragment = (TwoStepVerifySmsFor2046Fragment) afS67S0100000_15.l0;
        RC0.LJI(twoStepVerifySmsFor2046Fragment.LLIIIILZ, twoStepVerifySmsFor2046Fragment.LLIIII);
        Bundle arguments = ((TwoStepVerifySmsFor2046Fragment) afS67S0100000_15.l0).getArguments();
        o.LJI(arguments);
        Bundle bundle = new Bundle();
        String str = ((C69025R7d) obj).LJIIIZ;
        o.LJIIIIZZ(str, "it.ticket");
        RBV.LJIILL(bundle, str);
        arguments.putBundle("final_data", bundle);
        TwoStepVerifySmsFor2046Fragment twoStepVerifySmsFor2046Fragment2 = (TwoStepVerifySmsFor2046Fragment) afS67S0100000_15.l0;
        Bundle arguments2 = twoStepVerifySmsFor2046Fragment2.getArguments();
        o.LJI(arguments2);
        twoStepVerifySmsFor2046Fragment2.Dl(arguments2);
    }

    public static final void accept$23(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((VerifyEmailForTicketFragment) afS67S0100000_15.l0).Zl();
    }

    public static final void accept$24(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Throwable th = (Throwable) obj;
        C26045AKb c26045AKb = new C26045AKb((BindEmailWithoutVerifyFragment) afS67S0100000_15.l0);
        c26045AKb.LJIIIZ(((BindEmailWithoutVerifyFragment) afS67S0100000_15.l0).getString(R.string.hxu));
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJII(R.attr.e8);
        c26045AKb.LIZ(true);
        c26045AKb.LJIIJ();
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C85711XkR.LIZJ(((BindEmailWithoutVerifyFragment) afS67S0100000_15.l0).LJJLIIIJJI(), CardStruct.IStatusCode.DEFAULT, "email", "phone", String.valueOf(((C69084R9k) th).getErrorCode()));
    }

    public static final void accept$25(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InputCodeFragment) afS67S0100000_15.l0)._$_findCachedViewById(R.id.env).setVisibility(0);
        ((InputCodeFragment) afS67S0100000_15.l0).hm();
    }

    public static final void accept$26(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((TextView) ((InputCodeFragment) afS67S0100000_15.l0)._$_findCachedViewById(R.id.enw)).setEnabled(true);
        ((InputCodeFragment) afS67S0100000_15.l0)._$_findCachedViewById(R.id.env).setVisibility(0);
        ((InputCodeFragment) afS67S0100000_15.l0).hm();
        EditText inputCodeView = (EditText) ((InputCodeFragment) afS67S0100000_15.l0)._$_findCachedViewById(R.id.enw);
        o.LJIIIIZZ(inputCodeView, "inputCodeView");
        C9WD.LIZIZ(inputCodeView);
        ((InputCodeFragment) afS67S0100000_15.l0).getClass();
    }

    public static final void accept$27(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InputCodeFragment) afS67S0100000_15.l0).hm();
    }

    public static final void accept$28(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        C69084R9k c69084R9k;
        int i;
        Throwable th = (Throwable) obj;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS67S0100000_15.l0;
        if (th instanceof C69084R9k) {
            c69084R9k = (C69084R9k) th;
        } else {
            c69084R9k = null;
        }
        if (c69084R9k != null) {
            i = c69084R9k.getErrorCode();
        } else {
            i = 0;
        }
        inputCodeFragment.Xl(0, i);
    }

    public static final void accept$29(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Throwable it = (Throwable) obj;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS67S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        inputCodeFragment.Rl(C78688UuS.LJJIIZ(it), false);
        ((InputCodeFragment) afS67S0100000_15.l0).Xl(0, C78688UuS.LJJIIZ(it));
    }

    public static final void accept$3(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C85711XkR.LIZJ(((InputPhoneFragment) afS67S0100000_15.l0).LJJLIIIJJI(), CardStruct.IStatusCode.DEFAULT, "mobile", "email", String.valueOf(((C69084R9k) th).getErrorCode()));
    }

    public static final void accept$30(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Throwable it = (Throwable) obj;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS67S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        inputCodeFragment.Xl(0, C78688UuS.LJJIIZ(it));
        InputCodeFragment inputCodeFragment2 = (InputCodeFragment) afS67S0100000_15.l0;
        String enterFrom = inputCodeFragment2.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = ((InputCodeFragment) afS67S0100000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        C85631Xj9.LJIIJ(inputCodeFragment2, true, enterFrom, enterMethod, String.valueOf(C78688UuS.LJJIIZ(it)), 0, false);
    }

    public static final void accept$31(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Throwable it = (Throwable) obj;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS67S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        inputCodeFragment.Xl(0, C78688UuS.LJJIIZ(it));
        InputCodeFragment inputCodeFragment2 = (InputCodeFragment) afS67S0100000_15.l0;
        String enterFrom = inputCodeFragment2.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = ((InputCodeFragment) afS67S0100000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        C85631Xj9.LJIIJ(inputCodeFragment2, true, enterFrom, enterMethod, String.valueOf(C78688UuS.LJJIIZ(it)), 0, false);
    }

    public static final void accept$32(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        C74088T5w c74088T5w = (C74088T5w) ((PhoneLoginFragment) afS67S0100000_15.l0)._$_findCachedViewById(R.id.hnk);
        if (c74088T5w != null) {
            c74088T5w.LIZ(true);
        }
        String enterMethod = ((PhoneLoginFragment) afS67S0100000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        C85649XjR.LIZ(true, enterMethod, "instant_login_si", 0, null, 24);
    }

    public static final void accept$33(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        int i;
        C36241EKf c36241EKf;
        Throwable th = (Throwable) obj;
        String enterMethod = ((PhoneLoginFragment) afS67S0100000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        if ((th instanceof C36241EKf) && (c36241EKf = (C36241EKf) th) != null) {
            i = c36241EKf.getErrorCode();
        } else {
            i = -1;
        }
        C85649XjR.LIZ(true, enterMethod, "instant_login_si", i, null, 16);
        ((PhoneLoginFragment) afS67S0100000_15.l0).Ql();
    }

    public static final void accept$34(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        String enterMethod = ((PhoneLoginFragment) afS67S0100000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        C85649XjR.LIZ(true, enterMethod, null, 0, null, 28);
        ((PhoneLoginFragment) afS67S0100000_15.l0).Sl(true, true, false);
    }

    public static final void accept$35(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        String enterMethod = ((PhoneSignUpFragment) afS67S0100000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        RC2.LIZ(0, enterMethod, "phone");
        ((PhoneSignUpFragment) afS67S0100000_15.l0).Rl(true, true);
    }

    public static final void accept$36(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        String enterMethod = ((PhoneSignUpFragment) afS67S0100000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        RC2.LIZ(0, enterMethod, "phone");
        ((PhoneSignUpFragment) afS67S0100000_15.l0).Rl(false, true);
    }

    public static final void accept$37(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        LiveRoomStruct liveRoomStruct;
        long j;
        C73411SrX c73411SrX = ((LivePreviewGuideEnterVM) afS67S0100000_15.l0).LJLL;
        if (c73411SrX != null && (!c73411SrX.isDisposed())) {
            c73411SrX.dispose();
        }
        LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) afS67S0100000_15.l0;
        livePreviewGuideEnterVM.LJLL = null;
        C86343Xud hv0 = livePreviewGuideEnterVM.hv0();
        if (hv0 == null || livePreviewGuideEnterVM.LJLLI != null || (liveRoomStruct = hv0.LIZIZ) == null) {
            return;
        }
        C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
        if (C78963Uyt.LJIIIIZZ(hv0)) {
            j = 3;
        } else {
            j = 1;
        }
        livePreviewGuideEnterVM.LJLLI = LJJIJIL.LJLLLL(true, j, liveRoomStruct.id, new C86336XuW(livePreviewGuideEnterVM));
    }

    public static final void accept$38(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        X8Q x8q;
        Throwable th = (Throwable) obj;
        if ((th instanceof Exception) && (x8q = (X8Q) afS67S0100000_15.l0) != null) {
            x8q.LIZ((Exception) th);
        }
    }

    public static final void accept$39(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        X8Q x8q = (X8Q) afS67S0100000_15.l0;
        if (x8q != null) {
            x8q.onSuccess(obj);
        }
    }

    public static final void accept$4(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InputPhoneFragment) afS67S0100000_15.l0).Tl(true);
    }

    public static final void accept$40(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        X8Q x8q;
        Throwable th = (Throwable) obj;
        if ((th instanceof Exception) && (x8q = (X8Q) afS67S0100000_15.l0) != null) {
            x8q.LIZ((Exception) th);
        }
    }

    public static final void accept$41(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        X8Q x8q = (X8Q) afS67S0100000_15.l0;
        if (x8q != null) {
            x8q.onSuccess(obj);
        }
    }

    public static final void accept$42(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        InterfaceC85277XdR interfaceC85277XdR = (InterfaceC85277XdR) afS67S0100000_15.l0;
        if (interfaceC85277XdR != null) {
            interfaceC85277XdR.LIZ();
        }
    }

    public static final void accept$43(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        InterfaceC85277XdR interfaceC85277XdR = (InterfaceC85277XdR) afS67S0100000_15.l0;
        if (interfaceC85277XdR != null) {
            interfaceC85277XdR.LIZ();
        }
    }

    public static final void accept$44(AfS67S0100000_15 afS67S0100000_15, Object it) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS67S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        interfaceC88472Yns.invoke(it);
    }

    public static final void accept$45(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InterfaceC65784Pro) afS67S0100000_15.l0).invoke();
    }

    public static final void accept$46(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        PoiDetailDiscoveryViewModel poiDetailDiscoveryViewModel = (PoiDetailDiscoveryViewModel) afS67S0100000_15.l0;
        poiDetailDiscoveryViewModel.getClass();
        poiDetailDiscoveryViewModel.withState(new AqS181S0100000_15(poiDetailDiscoveryViewModel, 220));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchDiscoveryDataAsync - ");
        LIZ.append(obj);
        C188447aS.LIZ(X1D.LIZIZ(LIZ));
        ((PoiDetailDiscoveryViewModel) afS67S0100000_15.l0).LJLJJL = false;
    }

    public static final void accept$47(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        C43023GuZ it = (C43023GuZ) obj;
        VerticalMusicView verticalMusicView = (VerticalMusicView) afS67S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        verticalMusicView.LJJIFFI(it);
    }

    public static final void accept$48(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Throwable it = (Throwable) obj;
        VerticalMusicView verticalMusicView = (VerticalMusicView) afS67S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        verticalMusicView.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Get AI Recommend Music Failed. Reason:");
        LIZ.append(it.getMessage());
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
        verticalMusicView.LLIZLLLIL.LJI = Boolean.FALSE;
        verticalMusicView.LJIJJLI();
        G8G.LIZ.end(OpenEditMusicPanelPerformanceMonitor.INSTANCE, "music_data_set");
        WPY.LIZIZ(false, "edit_music", XW2.TAB_AI.getStringValue(), 8);
    }

    public static final void accept$49(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            ((VerticalMusicView) afS67S0100000_15.l0).LJJJJJ(true);
        } else {
            ((VerticalMusicView) afS67S0100000_15.l0).LJJJJJ(false);
        }
        ((VerticalMusicView) afS67S0100000_15.l0).LJJJJJL(false);
        ((VerticalMusicView) afS67S0100000_15.l0).LJJJJL(false);
        XZJ xzj = ((VerticalMusicView) afS67S0100000_15.l0).LLJJ;
        if (xzj != null) {
            xzj.setData(ORZ.LLJILJILJ(list));
        }
        XZJ xzj2 = ((VerticalMusicView) afS67S0100000_15.l0).LLJJ;
        if (xzj2 != null) {
            xzj2.notifyDataSetChanged();
        }
    }

    public static final void accept$5(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InputPhoneFragment) afS67S0100000_15.l0).Tl(true);
    }

    public static final void accept$50(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        XZJ xzj = ((VerticalMusicView) afS67S0100000_15.l0).LLJJ;
        if (xzj != null) {
            xzj.setData(new ArrayList());
        }
        XZJ xzj2 = ((VerticalMusicView) afS67S0100000_15.l0).LLJJ;
        if (xzj2 != null) {
            xzj2.notifyDataSetChanged();
        }
        ((VerticalMusicView) afS67S0100000_15.l0).LJJJJJ(false);
        ((VerticalMusicView) afS67S0100000_15.l0).LJJJJJL(false);
        ((VerticalMusicView) afS67S0100000_15.l0).LJJJJL(true);
    }

    public static final void accept$51(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        C69032R7k c69032R7k = (C69032R7k) obj;
        UnbindInputCodeFragment unbindInputCodeFragment = (UnbindInputCodeFragment) afS67S0100000_15.l0;
        RC0.LJI(unbindInputCodeFragment.LLIIIILZ, unbindInputCodeFragment.LLIIII);
        ((UnbindInputCodeFragment) afS67S0100000_15.l0).Rl(0, true);
        if (((UnbindInputCodeFragment) afS67S0100000_15.l0).LLIIJI.LIZIZ()) {
            if (C85642XjK.LIZIZ((UnbindInputCodeFragment) afS67S0100000_15.l0)) {
                C85631Xj9.LIZIZ((UnbindInputCodeFragment) afS67S0100000_15.l0, null);
                return;
            } else {
                C85631Xj9.LIZ((UnbindInputCodeFragment) afS67S0100000_15.l0, null);
                return;
            }
        }
        UnbindInputCodeFragment unbindInputCodeFragment2 = (UnbindInputCodeFragment) afS67S0100000_15.l0;
        String str = c69032R7k.LJIIIZ;
        o.LJIIIIZZ(str, "it.ticket");
        unbindInputCodeFragment2.lm(str);
    }

    public static final void accept$52(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Throwable it = (Throwable) obj;
        UnbindInputCodeFragment unbindInputCodeFragment = (UnbindInputCodeFragment) afS67S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        unbindInputCodeFragment.Rl(C78688UuS.LJJIIZ(it), false);
    }

    public static final void accept$53(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        C69014R6s c69014R6s = (C69014R6s) obj;
        UnbindInputCodeFragment unbindInputCodeFragment = (UnbindInputCodeFragment) afS67S0100000_15.l0;
        RC0.LJI(unbindInputCodeFragment.LLIIIILZ, unbindInputCodeFragment.LLIIII);
        ((UnbindInputCodeFragment) afS67S0100000_15.l0).Rl(0, true);
        if (((UnbindInputCodeFragment) afS67S0100000_15.l0).LLIIJI.LIZIZ()) {
            if (C85642XjK.LIZIZ((UnbindInputCodeFragment) afS67S0100000_15.l0)) {
                C85631Xj9.LIZIZ((UnbindInputCodeFragment) afS67S0100000_15.l0, null);
                return;
            } else {
                C85631Xj9.LIZ((UnbindInputCodeFragment) afS67S0100000_15.l0, null);
                return;
            }
        }
        if (C85642XjK.LIZIZ((UnbindInputCodeFragment) afS67S0100000_15.l0)) {
            UnbindInputCodeFragment unbindInputCodeFragment2 = (UnbindInputCodeFragment) afS67S0100000_15.l0;
            String str = c69014R6s.LJIIIZ;
            o.LJIIIIZZ(str, "it.ticket");
            unbindInputCodeFragment2.getClass();
            IUnbindApi.LIZ.getClass();
            IUnbindApi iUnbindApi = XJ4.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(EFJ.LIZJ);
            LIZ.append("/passport/mobile/unbind/");
            String LIZLLL = AbstractC66965QPx.LIZLLL(X1D.LIZIZ(LIZ));
            o.LJIIIIZZ(LIZLLL, "getCsrfToken(CommonConst…_SI + PATH_UNBIND_MOBILE)");
            iUnbindApi.unbindMobile(str, LIZLLL).LJ(new AgS131S0100000_15(unbindInputCodeFragment2, 8), C10K.LJIIIIZZ, null);
            return;
        }
        UnbindInputCodeFragment unbindInputCodeFragment3 = (UnbindInputCodeFragment) afS67S0100000_15.l0;
        String str2 = c69014R6s.LJIIIZ;
        o.LJIIIIZZ(str2, "it.ticket");
        unbindInputCodeFragment3.lm(str2);
    }

    public static final void accept$54(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Throwable it = (Throwable) obj;
        UnbindInputCodeFragment unbindInputCodeFragment = (UnbindInputCodeFragment) afS67S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        unbindInputCodeFragment.Rl(C78688UuS.LJJIIZ(it), false);
    }

    public static final void accept$55(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InterfaceC65784Pro) afS67S0100000_15.l0).invoke();
    }

    public static final void accept$56(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InterfaceC65784Pro) afS67S0100000_15.l0).invoke();
    }

    public static final void accept$57(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((C86442XwE) afS67S0100000_15.l0).LIZ.onError();
        ((C86442XwE) afS67S0100000_15.l0).LJ = false;
    }

    public static final void accept$58(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        PaidCollectionReviewDetailApi.PaidCollectionReviewDetailResponse paidCollectionReviewDetailResponse = (PaidCollectionReviewDetailApi.PaidCollectionReviewDetailResponse) obj;
        if (paidCollectionReviewDetailResponse.statusCode == 0) {
            C86442XwE c86442XwE = (C86442XwE) afS67S0100000_15.l0;
            c86442XwE.LJFF = paidCollectionReviewDetailResponse.cursor;
            c86442XwE.LIZ.LIZ(paidCollectionReviewDetailResponse);
            ((C86442XwE) afS67S0100000_15.l0).LJ = false;
            return;
        }
        ((C86442XwE) afS67S0100000_15.l0).LIZ.onError();
        ((C86442XwE) afS67S0100000_15.l0).LJ = false;
    }

    public static final void accept$59(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((C86442XwE) afS67S0100000_15.l0).LIZ.onError();
        ((C86442XwE) afS67S0100000_15.l0).LJ = false;
    }

    public static final void accept$6(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InputCodeFragment) afS67S0100000_15.l0).hm();
    }

    public static final void accept$60(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Object LIZ;
        Integer num;
        List<InnerPushMessage> list;
        Object LIZ2;
        Object LIZ3;
        GetMessageListResponse getMessageListResponse = (GetMessageListResponse) obj;
        List<SettingMessage> list2 = getMessageListResponse.settingMessages;
        if (list2 != null && !list2.isEmpty()) {
            try {
                LinkedHashMap LJFF = C86497Xx7.LJFF();
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = LJFF.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Number) ((Map.Entry) it.next()).getValue()).longValue() < currentTimeMillis) {
                        it.remove();
                    }
                }
                for (SettingMessage settingMessage : list2) {
                    LJFF.put(Integer.valueOf(settingMessage.getType()), Long.valueOf((settingMessage.getExpireSeconds() * 1000) + currentTimeMillis));
                }
                C86497Xx7.LJ().storeString("setting_sync_expire_config", C75792yF.LIZJ(LJFF));
                LIZ2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
            if (m10exceptionOrNullimpl != null) {
                C86478Xwo.LIZJ("SettingSyncHandler", "setExpireConfig error", m10exceptionOrNullimpl);
            }
            StringBuilder sb = new StringBuilder("dispatch setting messages, type=");
            ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<SettingMessage> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().getType()));
            }
            sb.append(arrayList);
            C86478Xwo.LIZLLL("SettingSyncHandler", sb.toString());
            for (SettingMessage settingMessage2 : list2) {
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) C58242MtS.LIZJ.getValue()).get(Integer.valueOf(settingMessage2.getType()));
                if (copyOnWriteArraySet != null) {
                    Iterator it3 = copyOnWriteArraySet.iterator();
                    while (it3.hasNext()) {
                        InterfaceC86546Xxu interfaceC86546Xxu = (InterfaceC86546Xxu) it3.next();
                        try {
                            settingMessage2.getType();
                            settingMessage2.getContent();
                            interfaceC86546Xxu.LIZ();
                            LIZ3 = C76800UCe.LIZ;
                            C3C5.m7constructorimpl(LIZ3);
                        } catch (Throwable th2) {
                            LIZ3 = C141335gf.LIZ(th2);
                            C3C5.m7constructorimpl(LIZ3);
                        }
                        Throwable m10exceptionOrNullimpl2 = C3C5.m10exceptionOrNullimpl(LIZ3);
                        if (m10exceptionOrNullimpl2 != null) {
                            C86478Xwo.LIZJ("SettingSyncHandler", "dispatch error", m10exceptionOrNullimpl2);
                        }
                    }
                }
            }
        }
        try {
            list = getMessageListResponse.messages;
        } catch (Throwable th3) {
            LIZ = C141335gf.LIZ(th3);
            C3C5.m7constructorimpl(LIZ);
        }
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (InnerPushMessage innerPushMessage : getMessageListResponse.messages) {
                if (!C86505XxF.LIZ(innerPushMessage)) {
                    if (!C86512XxM.LIZ(innerPushMessage)) {
                        arrayList2.add(Long.valueOf(innerPushMessage.getId()));
                    } else {
                        C86496Xx6.LJIIJ(innerPushMessage);
                        innerPushMessage.markReceiveFrom(EnumC86508XxI.FROM_PULLER);
                        HandlerC86501XxB.LIZIZ(HandlerC86501XxB.LIZ, innerPushMessage, 0L, 6);
                    }
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
            Throwable m10exceptionOrNullimpl3 = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl3 != null) {
                C86496Xx6.LJIIIIZZ(null, "pull_message", m10exceptionOrNullimpl3.getMessage());
                C86478Xwo.LIZJ("InnerPushPuller", "handleResponse error", m10exceptionOrNullimpl3);
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("pull success(");
        LIZ4.append(((EnumC86518XxS) afS67S0100000_15.l0).getValue());
        LIZ4.append("): ");
        List<InnerPushMessage> list3 = getMessageListResponse.messages;
        if (list3 != null) {
            num = Integer.valueOf(list3.size());
        } else {
            num = null;
        }
        LIZ4.append(num);
        C86478Xwo.LIZLLL("InnerPushPuller", X1D.LIZIZ(LIZ4));
        C86496Xx6.LJIIIZ(String.valueOf(((EnumC86518XxS) afS67S0100000_15.l0).getValue()), SystemClock.uptimeMillis() - C86499Xx9.LIZJ, null, getMessageListResponse);
        C86499Xx9.LIZIZ = false;
        C86506XxG.LIZJ((EnumC86518XxS) afS67S0100000_15.l0, true);
        if (((EnumC86518XxS) afS67S0100000_15.l0) == EnumC86518XxS.COLD_START) {
            C86499Xx9.LIZ = 1;
        }
    }

    public static final void accept$61(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pull failed(");
        LIZ.append(((EnumC86518XxS) afS67S0100000_15.l0).getValue());
        LIZ.append(')');
        C86478Xwo.LIZJ("InnerPushPuller", X1D.LIZIZ(LIZ), th);
        C86496Xx6.LJIIIZ(String.valueOf(((EnumC86518XxS) afS67S0100000_15.l0).getValue()), SystemClock.uptimeMillis() - C86499Xx9.LIZJ, th, null);
        C86499Xx9.LIZIZ = false;
        C86506XxG.LIZJ((EnumC86518XxS) afS67S0100000_15.l0, false);
        if (((EnumC86518XxS) afS67S0100000_15.l0) == EnumC86518XxS.COLD_START) {
            C86499Xx9.LIZ = 2;
        }
    }

    public static final void accept$62(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((RuInstantLoginSIModeFragment) afS67S0100000_15.l0).LJIJ();
    }

    public static final void accept$63(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((RuInstantLoginSIModeFragment) afS67S0100000_15.l0).LJIJ();
        SmartRoute buildRoute = SmartRouter.buildRoute(((RuInstantLoginSIModeFragment) afS67S0100000_15.l0).getContext(), "//account/login/signup_or_login");
        buildRoute.withParam("current_scene", EnumC69116RAq.LOGIN.getValue());
        buildRoute.withParam("next_page", EnumC69113RAn.PHONE_SMS_LOGIN.getValue());
        buildRoute.withParam("code_sent", true);
        buildRoute.withParam("use_last_ttp_context", true);
        Bundle arguments = ((RuInstantLoginSIModeFragment) afS67S0100000_15.l0).getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        buildRoute.withParam(arguments);
        buildRoute.open();
    }

    public static final void accept$64(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        String str;
        int i;
        List<Utterance> it = (List) obj;
        XS7 xs7 = (XS7) afS67S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        xs7.getClass();
        if (C00F.LIZ(31744, 0, "simulate_recognize_caption_fail", true) == 2) {
            C60903NvH.LJIIJJI().LJJIIJ();
        }
        if (C00F.LIZ(31744, 0, "simulate_recognize_caption_fail", true) == 1) {
            C60903NvH.LJIIJJI().LJJIIJ();
        }
        if (it.isEmpty()) {
            XSB xsb = xs7.LJII;
            if (xsb != null) {
                xsb.qb();
            }
            str = "empty";
        } else {
            XSB xsb2 = xs7.LJII;
            if (xsb2 != null) {
                xsb2.e9(it);
            }
            str = "succeed";
        }
        VideoPublishEditModel videoPublishEditModel = xs7.LIZ;
        long j = xs7.LJIILLIIL;
        if (xs7.LIZIZ == null) {
            i = 0;
        } else {
            i = 1;
        }
        H8F.LJIILLIIL(videoPublishEditModel, j, str, i, xs7.LJIIZILJ);
        xs7.LJIIJJI.LJIILL = 0;
        xs7.LJIIL(0);
    }

    public static final void accept$65(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        C43045Guv.LIZLLL(new AqS162S0200000_15((XS7) afS67S0100000_15.l0, (Throwable) obj, 65), 0L);
    }

    public static final void accept$66(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        C56692Kj.LIZ().LIZIZ = null;
        LivePreviewPlayerVM LJZI = ((LivePreviewPlayerWidget) afS67S0100000_15.l0).LJZI();
        if (LJZI != null) {
            LJZI.iv0();
        }
        FeedLiveViewHolderVM LJZ = ((LivePreviewPlayerWidget) afS67S0100000_15.l0).LJZ();
        if (LJZ != null) {
            EnumC79996VaS enumC79996VaS = EnumC79996VaS.STOP;
            o.LJIIIZ(enumC79996VaS, "<set-?>");
            LJZ.LLI = enumC79996VaS;
        }
        ((LivePreviewPlayerWidget) afS67S0100000_15.l0).LLFFF();
    }

    public static final void accept$67(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        boolean z;
        Long it = (Long) obj;
        GoLiveActivity goLiveActivity = (GoLiveActivity) afS67S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        if (it.longValue() < 3) {
            z = true;
        } else {
            z = false;
        }
        goLiveActivity.LJLLI = z;
        TextView textView = (TextView) ((GoLiveActivity) afS67S0100000_15.l0)._$_findCachedViewById(R.id.bw5);
        if (textView != null) {
            textView.setText(String.valueOf(Math.max(3 - it.longValue(), 1L)));
        }
        GoLiveActivity goLiveActivity2 = (GoLiveActivity) afS67S0100000_15.l0;
        if (!goLiveActivity2.LJLLI && goLiveActivity2.LJLILLLLZI == EnumC32529Cph.BROADCAST) {
            C29306Beo.LJI(goLiveActivity2._$_findCachedViewById(R.id.bw5));
        }
    }

    public static final void accept$68(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        C84767XOp c84767XOp = (C84767XOp) obj;
        String str = c84767XOp.LIZ;
        Integer num = c84767XOp.LIZJ;
        Effect effect = c84767XOp.LJ;
        Integer num2 = c84767XOp.LJFF;
        if (num2 == null || num2.intValue() != -105) {
            if ((num != null && num.intValue() == -103) || TextUtils.isEmpty(str)) {
                FMX.LJIILL("music_detail_trace", new OSZ("consume_music_download_failed", "stage"));
                if (C52265KfF.LIZ) {
                    C84916XUi c84916XUi = (C84916XUi) afS67S0100000_15.l0;
                    c84916XUi.LJFF = null;
                    c84916XUi.LJI = null;
                }
                C84919XUl c84919XUl = ((C84916XUi) afS67S0100000_15.l0).LJII;
                if (c84919XUl != null) {
                    c84919XUl.LJ(c84767XOp);
                    return;
                }
                return;
            }
            FMX.LJIILL("music_detail_trace", new OSZ("consume_music_download_success", "stage"));
            C84919XUl c84919XUl2 = ((C84916XUi) afS67S0100000_15.l0).LJII;
            if (c84919XUl2 == null) {
                return;
            }
            c84919XUl2.LIZIZ(c84767XOp);
            return;
        }
        FMX.LJIILL("music_detail_trace", new OSZ("consume_music_download_skip", "stage"));
        C84916XUi c84916XUi2 = (C84916XUi) afS67S0100000_15.l0;
        C84919XUl c84919XUl3 = c84916XUi2.LJII;
        if (c84919XUl3 == null) {
            return;
        }
        c84919XUl3.LIZ(effect, c84916XUi2.LIZIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r2.intValue() != (-105)) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r2 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$69(Y.AfS67S0100000_15 r4, java.lang.Object r5) {
        /*
            X.XOp r5 = (X.C84767XOp) r5
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r5.LJ
            java.lang.Integer r2 = r5.LJFF
            if (r2 != 0) goto L5c
        L8:
            r1 = -105(0xffffffffffffff97, float:NaN)
            if (r3 != 0) goto L3a
            if (r2 != 0) goto L33
        Le:
            boolean r0 = X.C52265KfF.LIZ
            if (r0 != 0) goto L1e
            r3 = 1
            r2 = 0
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "studio_effect_shoot_same_unlogin_optimization"
            boolean r0 = defpackage.e1.LIZ(r1, r0, r3, r2)
            if (r0 == 0) goto L27
        L1e:
            java.lang.Object r1 = r4.l0
            X.XUh r1 = (X.C84915XUh) r1
            r0 = 0
            r1.LJFF = r0
            r1.LJI = r0
        L27:
            java.lang.Object r0 = r4.l0
            X.XUh r0 = (X.C84915XUh) r0
            X.XUl r0 = r0.LJII
            if (r0 == 0) goto L32
            r0.LJ(r5)
        L32:
            return
        L33:
            int r0 = r2.intValue()
            if (r0 == r1) goto L48
            goto Le
        L3a:
            if (r2 != 0) goto L48
        L3c:
            java.lang.Object r0 = r4.l0
            X.XUh r0 = (X.C84915XUh) r0
            X.XUl r0 = r0.LJII
            if (r0 == 0) goto L32
            r0.LIZIZ(r5)
            goto L32
        L48:
            int r0 = r2.intValue()
            if (r0 != r1) goto L3c
            java.lang.Object r0 = r4.l0
            X.XUh r0 = (X.C84915XUh) r0
            X.XUl r1 = r0.LJII
            if (r1 == 0) goto L32
            java.lang.String r0 = r0.LIZIZ
            r1.LIZ(r3, r0)
            goto L32
        L5c:
            int r1 = r2.intValue()
            r0 = -103(0xffffffffffffff99, float:NaN)
            if (r1 == r0) goto Le
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS67S0100000_15.accept$69(Y.AfS67S0100000_15, java.lang.Object):void");
    }

    public static final void accept$7(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InputCodeFragment) afS67S0100000_15.l0).hm();
    }

    public static final void accept$70(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Throwable th = (Throwable) obj;
        if ((th instanceof C69084R9k) && th != null) {
            C85766XlK.LIZ((InterfaceC85767XlL) afS67S0100000_15.l0, th, false, null, 12);
        }
    }

    public static final void accept$71(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        X9Y x9y = (X9Y) obj;
        X9Y x9y2 = C84539XFv.LJLJJL;
        if (o.LJ(x9y, x9y2)) {
            return;
        }
        if (x9y.LJLIL == X80.CHANGE) {
            ((C84539XFv) afS67S0100000_15.l0).LJLIL.notifyItemRangeChanged(x9y.LJLILLLLZI, x9y.LJLJI);
        } else {
            ((C84539XFv) afS67S0100000_15.l0).LJLIL.notifyItemRangeInserted(x9y.LJLILLLLZI, x9y.LJLJI);
        }
        ((C84539XFv) afS67S0100000_15.l0).LJLJI = x9y2;
    }

    public static final void accept$72(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((YMF) afS67S0100000_15.l0).LIZ(new XM8(new Exception((Throwable) obj)));
    }

    public static final void accept$73(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((YMF) afS67S0100000_15.l0).LIZ(new XM8(new Exception((Throwable) obj)));
    }

    public static final void accept$74(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InterfaceC65784Pro) afS67S0100000_15.l0).invoke();
    }

    public static final void accept$75(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InterfaceC65784Pro) afS67S0100000_15.l0).invoke();
    }

    public static final void accept$76(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        SuggestMusicList result = (SuggestMusicList) obj;
        VerticalMusicView verticalMusicView = (VerticalMusicView) afS67S0100000_15.l0;
        XZG xzg = verticalMusicView.LLIZLLLIL;
        o.LJIIIIZZ(result, "result");
        List<MusicModel> list = result.musicList;
        verticalMusicView.LJJJJLI(xzg, new C43023GuZ(result.hasMore, 0, result.cursor, xzg.LIZIZ, 0L, list, false, 70));
    }

    public static final void accept$77(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((VerticalMusicView) afS67S0100000_15.l0).LJIIZILJ(XW2.TAB_AI);
    }

    public static final void accept$78(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((AddPhoneNumberSheetFragment) afS67S0100000_15.l0).Hl(true);
    }

    public static final void accept$79(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        C86863Y7f c86863Y7f;
        C86863Y7f c86863Y7f2;
        C86861Y7d c86861Y7d = (C86861Y7d) afS67S0100000_15.l0;
        EnumC86865Y7h enumC86865Y7h = c86861Y7d.LIZ;
        if (enumC86865Y7h != EnumC86865Y7h.PLAYING) {
            if (enumC86865Y7h == EnumC86865Y7h.DOWNLOAD_MODEL && (c86863Y7f2 = c86861Y7d.LIZIZ) != null) {
                c86863Y7f2.LJJ = -1;
            }
            if (c86861Y7d.LIZ == EnumC86865Y7h.DOWNLOAD_ASSERT && (c86863Y7f = c86861Y7d.LIZIZ) != null) {
                c86863Y7f.LJJI = -1;
            }
            c86861Y7d.LJFF();
        }
    }

    public static final void accept$8(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InputCodeFragment) afS67S0100000_15.l0).hm();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x018c, code lost:
    
        if (r2 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0187, code lost:
    
        if (r2 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x007c, code lost:
    
        if (r2 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x016f, code lost:
    
        if (r2 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$80(Y.AfS67S0100000_15 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS67S0100000_15.accept$80(Y.AfS67S0100000_15, java.lang.Object):void");
    }

    public static final void accept$81(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((DialogC86015XpL) afS67S0100000_15.l0).dismiss();
    }

    public static final void accept$82(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((DialogC86015XpL) afS67S0100000_15.l0).dismiss();
    }

    public static final void accept$83(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Check2SvPushClickResponse check2SvPushClickResponse = (Check2SvPushClickResponse) obj;
        if (o.LJ("allowed", check2SvPushClickResponse.result)) {
            TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity = (TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0;
            String str = check2SvPushClickResponse.verify_ticket;
            if (str == null) {
                str = "";
            }
            twoStepVerifyPushFor2067Activity.LJLLILLLL = str;
            C73411SrX c73411SrX = twoStepVerifyPushFor2067Activity.LJLJLJ;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity2 = (TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0;
            RCD rcd = new RCD(twoStepVerifyPushFor2067Activity2.LJLLILLLL, twoStepVerifyPushFor2067Activity2.LJLL, 0, null, twoStepVerifyPushFor2067Activity2.LJLJLLL);
            twoStepVerifyPushFor2067Activity2.LJLZ = true;
            RCE.LIZ().LIZIZ(rcd);
            twoStepVerifyPushFor2067Activity2.finish();
            return;
        }
        if (!o.LJ("denied", check2SvPushClickResponse.result)) {
            return;
        }
        C5S1 c5s1 = new C5S1(C16880lQ.LLLLLJLJLL((TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0));
        c5s1.LIZLLL(((TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0).getString(R.string.pm2));
        c5s1.LJ();
        TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity3 = (TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0;
        String string = twoStepVerifyPushFor2067Activity3.getString(R.string.pm2);
        o.LJIIIIZZ(string, "getString(R.string.pushc…questdevice_reject_toast)");
        twoStepVerifyPushFor2067Activity3.onError(string);
    }

    public static final void accept$84(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Request2svPushChallengeResponse request2svPushChallengeResponse = (Request2svPushChallengeResponse) obj;
        ((C74088T5w) ((TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0)._$_findCachedViewById(R.id.ayj)).LIZ(true);
        if (o.LJ("ok", request2svPushChallengeResponse.result)) {
            if (TextUtils.isEmpty(request2svPushChallengeResponse.wait_ticket)) {
                TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity = (TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0;
                String str = request2svPushChallengeResponse.wait_ticket;
                if (str == null) {
                    str = "";
                }
                twoStepVerifyPushFor2067Activity.LJLLI = str;
            }
            TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity2 = (TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0;
            Collection collection = request2svPushChallengeResponse.active_device_names;
            if (collection == null) {
                collection = C61878OQg.INSTANCE;
            }
            twoStepVerifyPushFor2067Activity2.LJLLLL = new ArrayList<>(collection);
            ((TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0).LLII();
            return;
        }
        if (o.LJ("expired", request2svPushChallengeResponse.result)) {
            ((TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0).LJZ.run();
            return;
        }
        String str2 = request2svPushChallengeResponse.reason;
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        C5S1 c5s1 = new C5S1(C16880lQ.LLLLLJLJLL((TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0));
        c5s1.LIZLLL(str2);
        c5s1.LJ();
    }

    public static final void accept$85(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        Throwable th = (Throwable) obj;
        ((C74088T5w) ((TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0)._$_findCachedViewById(R.id.ayj)).LIZ(true);
        if (th instanceof C69084R9k) {
            C69084R9k c69084R9k = (C69084R9k) th;
            if (TextUtils.isEmpty(c69084R9k.getDetailErrorMsg())) {
                C5S1 c5s1 = new C5S1(C16880lQ.LLLLLJLJLL((TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0));
                c5s1.LIZLLL(c69084R9k.getDetailErrorMsg());
                c5s1.LJ();
            }
        }
        C74088T5w c74088T5w = (C74088T5w) ((TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0)._$_findCachedViewById(R.id.ayj);
        String string = ((TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0).getString(R.string.pm4);
        o.LJIIIIZZ(string, "getString(R.string.pushc…device_resend_btn_active)");
        c74088T5w.setText(string);
    }

    public static final void accept$86(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity = (TwoStepVerifyPushFor2067Activity) afS67S0100000_15.l0;
        C73666Sve c73666Sve = twoStepVerifyPushFor2067Activity.LJLJL;
        if (c73666Sve != null) {
            c73666Sve.dispose();
        }
        String str = (String) twoStepVerifyPushFor2067Activity.LJLJJI.getValue();
        String str2 = twoStepVerifyPushFor2067Activity.LJLLI;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            o.LJI(str);
            hashMap.put("verify_ticket", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            o.LJI(str2);
            hashMap.put("wait_ticket", str2);
        }
        NetworkProxyAccount.LIZ.getClass();
        twoStepVerifyPushFor2067Activity.LJLJL = (C73666Sve) NetworkProxyAccount.LJII("/passport/push_challenge/check_2sv/", hashMap).LIZJ(C1E5.LJLIL).LJII(C73969T1h.LIZIZ()).LJII(C73969T1h.LIZIZ()).LJIIJ(new AfS67S0100000_15(twoStepVerifyPushFor2067Activity, 83), new InterfaceC64592gB() { // from class: X.9E1
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
            }
        });
    }

    public static final void accept$87(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((C85679Xjv) afS67S0100000_15.l0).LIZ.Ik(false);
        ((C85679Xjv) afS67S0100000_15.l0).getClass();
        C85679Xjv c85679Xjv = (C85679Xjv) afS67S0100000_15.l0;
        c85679Xjv.LJIIIIZZ = false;
        c85679Xjv.LIZ.j5(false);
    }

    public static final void accept$88(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        String it = (String) obj;
        C85679Xjv c85679Xjv = (C85679Xjv) afS67S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        c85679Xjv.LIZ.j5(true);
        if (c85679Xjv.LIZIZ) {
            Object value = c85679Xjv.LJ.LIZ.getValue();
            o.LJIIIIZZ(value, "<get-currentUsername>(...)");
            if (o.LJ(it, value)) {
                c85679Xjv.LIZ.K5();
                c85679Xjv.LIZ.Ik(true);
                c85679Xjv.LIZ.LLZZZZ(null);
                return;
            }
        }
        FtcCreateAccountModel ftcCreateAccountModel = c85679Xjv.LJ;
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(c85679Xjv, 932);
        AqS197S0100000_15 aqS197S0100000_15 = new AqS197S0100000_15(c85679Xjv, 70);
        ftcCreateAccountModel.getClass();
        C78886Uxe.LJIILJJIL().LIZIZ("/passport/login_name/check/", E2C.LIZJ("login_name", it), new C68942R3y(aqS165S0100000_15, aqS197S0100000_15));
    }

    public static final void accept$89(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        AbstractC35632Dye abstractC35632Dye = (AbstractC35632Dye) obj;
        if (abstractC35632Dye instanceof C35633Dyf) {
            C85679Xjv c85679Xjv = (C85679Xjv) afS67S0100000_15.l0;
            FtcCreateAccountModel ftcCreateAccountModel = c85679Xjv.LJ;
            AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(c85679Xjv, 301);
            AqS181S0100000_15 aqS181S0100000_152 = new AqS181S0100000_15(c85679Xjv, 302);
            ftcCreateAccountModel.getClass();
            R41.LIZ().getSetPasswordStatus(new C85686Xk2(aqS181S0100000_15, aqS181S0100000_152));
            return;
        }
        if (!(abstractC35632Dye instanceof C35631Dyd)) {
            return;
        }
        C85679Xjv c85679Xjv2 = (C85679Xjv) afS67S0100000_15.l0;
        C78886Uxe.LJJL(c85679Xjv2.LIZJ, c85679Xjv2.LIZLLL, false, c85679Xjv2.LJIIIIZZ);
        ((C85679Xjv) afS67S0100000_15.l0).LIZ.LJIILL(((C35631Dyd) abstractC35632Dye).LIZIZ);
    }

    public static final void accept$9(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((InputCodeFragment) afS67S0100000_15.l0).hm();
    }

    public static final void accept$90(AfS67S0100000_15 afS67S0100000_15, Object obj) {
        ((C85679Xjv) afS67S0100000_15.l0).LIZ.LJLJL(null, Integer.valueOf(R.string.g5t));
    }
}
