package X;

import Y.ARunnableS17S0101000_13;
import Y.AfS52S0300000_13;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.service.IFeedbackService;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeAuditing;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveCustomRechargeFeedbackUrlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveSubscribeFeedbackUrlSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UI6 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:5:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LIZIZ(int r4, java.lang.Integer r5) {
        /*
            if (r5 != 0) goto L53
        L2:
            java.lang.String r3 = "live_detail"
        L4:
            X.Cn2 r2 = new X.Cn2
            com.bytedance.android.livesdk.livesetting.wallet.LivePaymentFeedbackUrlSetting r0 = com.bytedance.android.livesdk.livesetting.wallet.LivePaymentFeedbackUrlSetting.INSTANCE
            java.lang.String r0 = r0.getValue()
            r2.<init>(r0)
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r0 = com.bytedance.android.live.gift.IGiftService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.gift.IGiftService r0 = (com.bytedance.android.live.gift.IGiftService) r0
            boolean r1 = r0.isFirstRecharge()
            java.lang.String r0 = "request_page"
            r2.LIZJ(r0, r3)
            java.lang.String r0 = "is_popup"
            r2.LIZ(r4, r0)
            java.lang.String r0 = "is_first_recharge"
            r2.LIZ(r1, r0)
            java.lang.String r0 = r2.LIZLLL()
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r2 = "url"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r3, r2)
            if (r0 != 0) goto L3c
            java.lang.String r0 = ""
        L3c:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "rawUrlUri.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.net.Uri r0 = X.C243059gL.LIZ(r3, r2, r1)
            return r0
        L53:
            int r1 = r5.intValue()
            r0 = 4
            if (r1 != r0) goto L5d
            java.lang.String r3 = "video_gift"
            goto L4
        L5d:
            int r1 = r5.intValue()
            r0 = 5
            if (r1 != r0) goto L67
            java.lang.String r3 = "promote"
            goto L4
        L67:
            int r1 = r5.intValue()
            r0 = 6
            if (r1 != r0) goto L71
            java.lang.String r3 = "shoutout"
            goto L4
        L71:
            int r0 = r5.intValue()
            if (r0 != 0) goto L78
            goto L2
        L78:
            int r1 = r5.intValue()
            r0 = 9
            if (r1 != r0) goto L2
            java.lang.String r3 = "my_profile"
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UI6.LIZIZ(int, java.lang.Integer):android.net.Uri");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [T, java.lang.CharSequence, java.lang.String] */
    public static final UI4 LIZJ(Context context, UI8 ui8) {
        String string;
        boolean z;
        UIH LIZ2;
        T t;
        C0NB.LIZIZ("recharge_fails", "RechargeExceptionUtils");
        boolean z2 = false;
        if (context == null) {
            return new UI4(false, false);
        }
        int i = ui8.LIZ;
        if (i == 3) {
            C30868C9o.LIZJ(R.string.nlg);
            return new UI4(true, true);
        }
        if (i == -1) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("config.action = ");
            LIZ3.append(ui8.LIZ);
            C0NB.LJIIIZ("RechargeExceptionUtils", X1D.LIZIZ(LIZ3));
            return new UI4(false, false);
        }
        Exception exc = ui8.LIZLLL;
        boolean z3 = exc instanceof C29401Dk;
        int i2 = R.string.otc;
        if (z3) {
            C29401Dk c29401Dk = (C29401Dk) exc;
            switch (c29401Dk.getErrorCode()) {
                case 41155:
                    LIZLLL(ui8, ui8.LIZLLL, R.string.olg);
                    z2 = true;
                    break;
                case 4005189:
                case 4005272:
                    c29401Dk.getErrorCode();
                    C68322mC c68322mC = new C68322mC();
                    ?? value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
                    c68322mC.element = value;
                    if (TextUtils.isEmpty(value)) {
                        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
                            t = "sslocal://webcast_webview?url=https%3A%2F%2Finapp-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                        } else {
                            t = "sslocal://webcast_webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                        }
                    } else {
                        Uri.Builder buildUpon = UriProtector.parse((String) c68322mC.element).buildUpon();
                        buildUpon.appendQueryParameter("enter_from", "wallet_appeal");
                        String uri = buildUpon.build().toString();
                        o.LJIIIIZZ(uri, "{\n            val builde…ld().toString()\n        }");
                        t = uri;
                    }
                    c68322mC.element = t;
                    o.LJIIIIZZ(context.getString(R.string.ko9), "context.getString(R.string.pm_couldnot_processed)");
                    String prompt = c29401Dk.getPrompt();
                    o.LJIIIIZZ(prompt, "throwable.prompt");
                    C77437UaH c77437UaH = new C77437UaH(context);
                    c77437UaH.LJI = prompt;
                    c77437UaH.LJ(R.string.spm, new UI9(context, c68322mC, ui8), false);
                    c77437UaH.LIZJ(R.string.spn, UIC.LJLIL, false);
                    c77437UaH.LJJII = false;
                    DialogC77438UaI LIZ4 = c77437UaH.LIZ();
                    if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ4, new Object[0], "void", new C65300Pk0(false, "()V", "-7915151503436525332")).LIZ) {
                        LIZ4.show();
                    }
                    C77541Ubx.LJIIJJI(ui8.LJI, "other", "risk", ui8.LJFF);
                    break;
                case 4005192:
                case 4005209:
                    if (ui8.LJIIIZ != 0) {
                        i2 = R.string.l86;
                    }
                    String string2 = context.getString(i2);
                    o.LJIIIIZZ(string2, "context.getString(resId)");
                    String prompt2 = c29401Dk.getPrompt();
                    o.LJIIIIZZ(prompt2, "exception.prompt");
                    LIZ(context, string2, prompt2, "underground", "other", c29401Dk.getErrorCode(), ui8);
                    break;
                case 4005205:
                    LIZLLL(ui8, exc, R.string.n0o);
                    BZI LIZIZ = C0N3.LIZIZ("livesdk_feature_abnormal_toast", "recharge", "scenario");
                    LIZIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
                    LIZIZ.LJJIIJZLJL();
                    z2 = true;
                    break;
                case 4005208:
                    if (ui8.LJIIIZ != 0) {
                        i2 = R.string.l86;
                    }
                    String string3 = context.getString(i2);
                    o.LJIIIIZZ(string3, "context.getString(resId)");
                    String prompt3 = c29401Dk.getPrompt();
                    o.LJIIIIZZ(prompt3, "exception.prompt");
                    LIZ(context, string3, prompt3, "refund", "other", c29401Dk.getErrorCode(), ui8);
                    break;
                case 4005256:
                case 4005257:
                    if (ui8.LJII) {
                        LIZLLL(ui8, exc, R.string.n0o);
                        z2 = true;
                        break;
                    } else {
                        int errorCode = c29401Dk.getErrorCode();
                        o.LJIIIIZZ(c29401Dk.getPrompt(), "exception.prompt");
                        String string4 = context.getResources().getString(R.string.lx1);
                        o.LJIIIIZZ(string4, "context.resources.getStr…m_idverify_recharge_desc)");
                        C47071t1 c47071t1 = new C47071t1(context);
                        c47071t1.LJIILL = true;
                        c47071t1.LJII(string4);
                        c47071t1.LJIILLIIL(R.string.lx9);
                        c47071t1.LJIIL(R.string.lxd, new CLD(errorCode, context));
                        c47071t1.LJIIIZ(R.string.lwo, C217818gj.LJLILLLLZI);
                        LiveDialog LIZ5 = c47071t1.LIZ();
                        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ5, new Object[0], "void", new C65300Pk0(false, "()V", "-7915151503436525332")).LIZ) {
                            LIZ5.show();
                        }
                        CLG.LIZIZ("live_recharge");
                        break;
                    }
                case 4005284:
                    String prompt4 = c29401Dk.getPrompt();
                    o.LJIIIIZZ(prompt4, "exception.prompt");
                    C76912UGm.LIZIZ(context, true, prompt4, ui8);
                    break;
                case 4025001:
                    String string5 = context.getString(R.string.oea);
                    o.LJIIIIZZ(string5, "context.getString(R.stri…sub_user_sub_limit_title)");
                    String prompt5 = c29401Dk.getPrompt();
                    o.LJIIIIZZ(prompt5, "exception.prompt");
                    LIZ(context, string5, prompt5, "risk", "other", c29401Dk.getErrorCode(), ui8);
                    break;
                case 4025002:
                    String string6 = context.getString(R.string.oe8);
                    o.LJIIIIZZ(string6, "context.getString(R.stri….pm_sub_user_block_title)");
                    String prompt6 = c29401Dk.getPrompt();
                    o.LJIIIIZZ(prompt6, "exception.prompt");
                    LIZ(context, string6, prompt6, "risk", "other", c29401Dk.getErrorCode(), ui8);
                    break;
                default:
                    if (UII.LIZ(c29401Dk.getErrorCode())) {
                        int errorCode2 = c29401Dk.getErrorCode();
                        switch (errorCode2) {
                            case 42030:
                                UI5 ui5 = UI5.NORMAL_UNSUBMIT_MUST;
                                String prompt7 = c29401Dk.getPrompt();
                                o.LJIIIIZZ(prompt7, "exception.prompt");
                                C76950UHy.LIZJ(context, ui5, prompt7, c29401Dk.getErrorCode(), ui8);
                                break;
                            case 42031:
                                UI5 ui52 = UI5.NORMAL_REVIEWING;
                                String prompt8 = c29401Dk.getPrompt();
                                o.LJIIIIZZ(prompt8, "exception.prompt");
                                C76950UHy.LIZLLL(context, ui52, prompt8, c29401Dk.getErrorCode(), ui8);
                                break;
                            case 42032:
                                UI5 ui53 = UI5.NORMAL_REJECT;
                                String prompt9 = c29401Dk.getPrompt();
                                o.LJIIIIZZ(prompt9, "exception.prompt");
                                C76950UHy.LIZLLL(context, ui53, prompt9, c29401Dk.getErrorCode(), ui8);
                                break;
                            default:
                                switch (errorCode2) {
                                    case 4005265:
                                        UI5 ui54 = UI5.NORMAL_RESUBMIT_MUST;
                                        String prompt10 = c29401Dk.getPrompt();
                                        o.LJIIIIZZ(prompt10, "exception.prompt");
                                        C76950UHy.LIZJ(context, ui54, prompt10, c29401Dk.getErrorCode(), ui8);
                                        break;
                                    case 4005266:
                                        UI5 ui55 = UI5.WHITELIST_UNSUBMIT_NOTICE;
                                        String prompt11 = c29401Dk.getPrompt();
                                        o.LJIIIIZZ(prompt11, "exception.prompt");
                                        C76950UHy.LIZIZ(context, ui55, prompt11, c29401Dk.getErrorCode(), ui8);
                                        break;
                                    case 4005267:
                                        UI5 ui56 = UI5.WHITELIST_RESUBMIT_NOTICE;
                                        String prompt12 = c29401Dk.getPrompt();
                                        o.LJIIIIZZ(prompt12, "exception.prompt");
                                        C76950UHy.LIZIZ(context, ui56, prompt12, c29401Dk.getErrorCode(), ui8);
                                        break;
                                    case 4005268:
                                        UI5 ui57 = UI5.WHITELIST_RESUBMIT_MUST;
                                        String prompt13 = c29401Dk.getPrompt();
                                        o.LJIIIIZZ(prompt13, "exception.prompt");
                                        C76950UHy.LIZJ(context, ui57, prompt13, c29401Dk.getErrorCode(), ui8);
                                        break;
                                    case 4005269:
                                        UI5 ui58 = UI5.WHITELIST_UNSUBMIT_MUST;
                                        String prompt14 = c29401Dk.getPrompt();
                                        o.LJIIIIZZ(prompt14, "exception.prompt");
                                        C76950UHy.LIZJ(context, ui58, prompt14, c29401Dk.getErrorCode(), ui8);
                                        break;
                                    case 4005270:
                                        UI5 ui59 = UI5.WHITELIST_REJECT;
                                        String prompt15 = c29401Dk.getPrompt();
                                        o.LJIIIIZZ(prompt15, "exception.prompt");
                                        C76950UHy.LIZLLL(context, ui59, prompt15, c29401Dk.getErrorCode(), ui8);
                                        break;
                                    case 4005271:
                                        UI5 ui510 = UI5.WHITELIST_REVIEWING;
                                        String prompt16 = c29401Dk.getPrompt();
                                        o.LJIIIIZZ(prompt16, "exception.prompt");
                                        C76950UHy.LIZLLL(context, ui510, prompt16, c29401Dk.getErrorCode(), ui8);
                                        break;
                                }
                        }
                    } else {
                        LIZLLL(ui8, exc, R.string.n0o);
                        z2 = true;
                        break;
                    }
            }
        } else {
            int i3 = ui8.LIZIZ;
            if (i3 == 206) {
                if (ui8.LIZJ == 1) {
                    C34K c34k = new C34K();
                    if (((IFeedbackService) CN1.LIZ(IFeedbackService.class)).showFeedBackListWhenPaymentCancel() && ui8.LJI != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c34k.element = z;
                    int feedBackEntrance = ((IFeedbackService) CN1.LIZ(IFeedbackService.class)).getFeedBackEntrance(ui8.LJIIJJI);
                    if (!c34k.element || feedBackEntrance == 999) {
                        LIZ2 = UIG.LIZ();
                    } else {
                        C1EW.LIZ(((IapApi) Q7L.LIZIZ(IapApi.class)).getFeedBackList(1, feedBackEntrance)).LJJJJZI(new AfS52S0300000_13(c34k, ui8, context, 10));
                        if (!c34k.element) {
                            LIZLLL(ui8, null, R.string.nlf);
                        }
                        LIZ2 = UIG.LIZIZ();
                    }
                    if (!LIZ2.LIZ) {
                        LIZLLL(ui8, null, R.string.nlf);
                        z2 = true;
                    }
                }
                LIZLLL(ui8, null, R.string.n0o);
                z2 = true;
            } else if (i3 == 203) {
                if (C77608Ud2.LIZIZ()) {
                    string = context.getString(R.string.otc);
                } else {
                    string = context.getString(R.string.otf);
                }
                LIZ(context, OKG.LIZIZ(string, "if (PayDataHolder.isChan…google)\n                }", context, R.string.so4, "context.getString(R.string.ttlive_charge_fail)"), string, "google-apple", "pay", 203, ui8);
            } else {
                int i4 = R.string.kgl;
                if (i3 == 205) {
                    if (ui8.LJII) {
                        i4 = R.string.oti;
                    } else if (ui8.LJIIIZ == 0) {
                        i4 = R.string.oth;
                    }
                    LIZLLL(ui8, null, i4);
                } else if (i3 == 204) {
                    if (ui8.LJII) {
                        i4 = R.string.oti;
                    } else if (ui8.LJIIIZ == 0) {
                        i4 = R.string.oth;
                    }
                    LIZLLL(ui8, null, i4);
                } else if (i3 == 208) {
                    LIZLLL(ui8, null, R.string.otg);
                } else {
                    if (i3 == -202) {
                        LIZLLL(ui8, null, R.string.so4);
                    }
                    LIZLLL(ui8, null, R.string.n0o);
                }
                z2 = true;
            }
        }
        return new UI4(true, z2);
    }

    public static void LIZLLL(UI8 config, Throwable th, int i) {
        o.LJIIIZ(config, "config");
        C46529INx.LIZ.post(new ARunnableS17S0101000_13(i, th, 15));
    }

    public static void LIZ(Context context, String str, String str2, String str3, String str4, int i, UI8 ui8) {
        String value;
        o.LJIIIZ(context, "context");
        if (ui8.LJII) {
            value = LiveSubscribeFeedbackUrlSetting.INSTANCE.getValue();
        } else {
            value = LiveCustomRechargeFeedbackUrlSetting.INSTANCE.getValue();
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(value);
        if (ui8.LJII) {
            c32364Cn2.LIZ(ui8.LJIIIZ, "trade_type");
        } else if (LiveWebRechargeAuditing.INSTANCE.getValue() || !ui8.LJ) {
            c32364Cn2.LIZ(ui8.LJIIIZ, "trade_type");
        } else {
            c32364Cn2.LIZ(i, "error_code");
            c32364Cn2.LIZJ("fail_from", str4);
            c32364Cn2.LIZJ("fail_reason", str3);
            c32364Cn2.LIZJ("charge_reason", ui8.LJFF);
            c32364Cn2.LIZ(ui8.LJI, "package");
            c32364Cn2.LIZ(ui8.LJIIIZ, "trade_type");
        }
        android.net.Uri uri = UriProtector.parse(c32364Cn2.LIZLLL());
        String queryParameter = UriProtector.getQueryParameter(uri, "url");
        if (queryParameter == null) {
            queryParameter = "";
        }
        android.net.Uri rawUrlUri = UriProtector.parse(queryParameter);
        o.LJIIIIZZ(rawUrlUri, "rawUrlUri");
        android.net.Uri LIZ2 = C243059gL.LIZ(rawUrlUri, "trade_type", String.valueOf(ui8.LJIIIZ));
        o.LJIIIIZZ(uri, "uri");
        String uri2 = LIZ2.toString();
        o.LJIIIIZZ(uri2, "newUrlUri.toString()");
        android.net.Uri LIZ3 = C243059gL.LIZ(uri, "url", uri2);
        C77437UaH c77437UaH = new C77437UaH(context);
        c77437UaH.LIZJ = str;
        c77437UaH.LJI = str2;
        c77437UaH.LJ(R.string.spm, new UI7(context, LIZ3, ui8, i, str4, str3), false);
        c77437UaH.LIZJ(R.string.spn, new UIA(i, ui8), false);
        c77437UaH.LJJII = false;
        C29306Beo.LJJJJIZL(c77437UaH.LIZ());
        if (i == 4005209) {
            CLG.LIZLLL(4005209, "recharge", "room_recharge");
        }
        if (ui8.LJII) {
            String failReason = ui8.LJFF;
            java.util.Map<String, String> map = ui8.LJIIIIZZ;
            o.LJIIIZ(failReason, "failReason");
            BZI LIZ4 = C28787BRn.LIZ("livesdk_abnormal_subscribe_popup");
            LIZ4.LJIJJ(failReason, "failed_reason");
            LIZ4.LJJIFFI(map);
            LIZ4.LJIIZILJ();
            LIZ4.LJJIIJZLJL();
            return;
        }
        C77541Ubx.LJIIJJI(ui8.LJI, str4, str3, ui8.LJFF);
    }
}
