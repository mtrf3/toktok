package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C39964FmK;
import X.C59580NZw;
import X.C59581NZx;
import X.C60371Nmh;
import X.C76800UCe;
import X.C84763XOl;
import X.EnumC39958FmE;
import X.InterfaceC39904FlM;
import X.InterfaceC65784Pro;
import X.NJX;
import X.NU6;
import X.NUJ;
import X.OYN;
import X.X1D;
import android.app.Activity;
import android.webkit.WebView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* loaded from: classes11.dex */
public class AqS65S1200000_10 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS65S1200000_10 aqS65S1200000_10) {
        boolean shouldOverrideUrlLoading;
        shouldOverrideUrlLoading = super/*X.Na4*/.shouldOverrideUrlLoading((WebView) aqS65S1200000_10.l2, aqS65S1200000_10.s0);
        return Boolean.valueOf(shouldOverrideUrlLoading);
    }

    public static final Object invoke$1(AqS65S1200000_10 aqS65S1200000_10) {
        ((ScreenShotFeedbackService) aqS65S1200000_10.l1).startUploadScreenShotFeedback((ActivityC45651qj) aqS65S1200000_10.l2, aqS65S1200000_10.s0);
        ((ScreenShotFeedbackService) aqS65S1200000_10.l1).sendShareFeedbackEvent();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS65S1200000_10 aqS65S1200000_10) {
        NJX.LIZIZ(((NUJ) aqS65S1200000_10.l1).LIZ, (WebView) aqS65S1200000_10.l2, aqS65S1200000_10.s0, true, 0, "");
        NU6 nu6 = ((NUJ) aqS65S1200000_10.l1).LIZ.LIZJ;
        if (nu6 != null) {
            nu6.LJ((WebView) aqS65S1200000_10.l2, true);
        }
        InterfaceC39904FlM interfaceC39904FlM = ((NUJ) aqS65S1200000_10.l1).LIZ.LJIILIIL;
        if (interfaceC39904FlM != null) {
            interfaceC39904FlM.LIZJ(aqS65S1200000_10.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS65S1200000_10 aqS65S1200000_10) {
        boolean shouldOverrideUrlLoading;
        shouldOverrideUrlLoading = super/*X.Na4*/.shouldOverrideUrlLoading((WebView) aqS65S1200000_10.l2, aqS65S1200000_10.s0);
        return Boolean.valueOf(shouldOverrideUrlLoading);
    }

    public static final Object invoke$4(AqS65S1200000_10 aqS65S1200000_10) {
        int i = C39964FmK.LIZ[((EnumC39958FmE) aqS65S1200000_10.l2).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C60371Nmh c60371Nmh = (C60371Nmh) aqS65S1200000_10.l1;
                    String str = aqS65S1200000_10.s0;
                    if (!c60371Nmh.LJLJI.isDebug()) {
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("bullet", str);
                    }
                } else {
                    C60371Nmh c60371Nmh2 = (C60371Nmh) aqS65S1200000_10.l1;
                    String str2 = aqS65S1200000_10.s0;
                    if (!c60371Nmh2.LJLJI.isDebug()) {
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("bullet", str2);
                    }
                }
            } else {
                C60371Nmh c60371Nmh3 = (C60371Nmh) aqS65S1200000_10.l1;
                String str3 = aqS65S1200000_10.s0;
                if (!c60371Nmh3.LJLJI.isDebug()) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("bullet", str3);
                }
            }
        } else {
            C60371Nmh c60371Nmh4 = (C60371Nmh) aqS65S1200000_10.l1;
            String str4 = aqS65S1200000_10.s0;
            if (!c60371Nmh4.LJLJI.isDebug()) {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("bullet", str4);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS65S1200000_10 aqS65S1200000_10) {
        C60371Nmh c60371Nmh = (C60371Nmh) aqS65S1200000_10.l1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReject: ");
        LIZ.append(((Throwable) aqS65S1200000_10.l2).getMessage());
        LIZ.append(", extra: ");
        LIZ.append(aqS65S1200000_10.s0);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (!c60371Nmh.LJLJI.isDebug()) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("bullet", LIZIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS65S1200000_10 aqS65S1200000_10) {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            OYN.LIZIZ(LJIIIIZZ, (SharePackage) aqS65S1200000_10.l1, aqS65S1200000_10.s0, (Aweme) aqS65S1200000_10.l2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1200000_10(NUJ nuj, WebView webView, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = nuj;
        this.l2 = webView;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1200000_10(C59580NZw c59580NZw, WebView webView, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c59580NZw;
        this.l2 = webView;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1200000_10(C59581NZx c59581NZx, WebView webView, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c59581NZx;
        this.l2 = webView;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1200000_10(C60371Nmh c60371Nmh, EnumC39958FmE enumC39958FmE, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c60371Nmh;
        this.l2 = enumC39958FmE;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1200000_10(C60371Nmh c60371Nmh, Throwable th, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c60371Nmh;
        this.l2 = th;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1200000_10(ScreenShotFeedbackService screenShotFeedbackService, ActivityC45651qj activityC45651qj, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = screenShotFeedbackService;
        this.l2 = activityC45651qj;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1200000_10(SharePackage sharePackage, String str, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l1 = sharePackage;
        this.s0 = str;
        this.l2 = aweme;
    }
}
