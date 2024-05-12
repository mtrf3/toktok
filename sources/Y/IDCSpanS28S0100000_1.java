package Y;

import X.AnonymousClass636;
import X.C107404Jk;
import X.C31461Li;
import X.C4ZL;
import X.C77125UOr;
import X.C79045V0n;
import X.C82873Nb;
import X.EF7;
import X.OJD;
import X.T5S;
import X.X1D;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDCSpanS28S0100000_1 extends ClickableSpan {
    public final int $t;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                o.LJIIIZ(view, "widget");
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                super.onClick(view);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                return;
            case 1:
                updateDrawState$1(this, textPaint);
                return;
            case 2:
                updateDrawState$2(this, textPaint);
                return;
            case 3:
                updateDrawState$3(this, textPaint);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public IDCSpanS28S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCSpanS28S0100000_1 iDCSpanS28S0100000_1, View p0) {
        o.LJIIIZ(p0, "p0");
        SmartRoute buildRoute = SmartRouter.buildRoute(((C107404Jk) iDCSpanS28S0100000_1.l0).LIZ, "//webview/");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('/');
        C4ZL.LIZIZ();
        LIZ.append(C82873Nb.LJIIIIZZ());
        LIZ.append('/');
        String LIZIZ = X1D.LIZIZ(LIZ);
        OJD ojd = new OJD("/en/");
        SettingsManager.LIZLLL().getClass();
        String LJI = SettingsManager.LJI("activity_status_help_url", "https://support.tiktok.com/en/account-and-privacy/account-privacy-settings/activity-status-on-tiktok");
        o.LJIIIIZZ(LJI, "getInstance().getStringV…LinkSettings::class.java)");
        buildRoute.withParam("url", ojd.replace(LJI, LIZIZ));
        buildRoute.open();
    }

    public static final void onClick$1(IDCSpanS28S0100000_1 iDCSpanS28S0100000_1, View widget) {
        String str;
        o.LJIIIZ(widget, "widget");
        AdSettingsActivity adSettingsActivity = (AdSettingsActivity) iDCSpanS28S0100000_1.l0;
        adSettingsActivity.getClass();
        StringBuilder LIZ = X1D.LIZ();
        String str2 = "aweme://webview?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftcm%2Fh5%2Fvideo_appeal%3Fhide_nav_bar%3D1%26from%3Dapp";
        String LIZJ = C31461Li.LIZJ("branded_content_detail_url", "aweme://webview?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftcm%2Fh5%2Fvideo_appeal%3Fhide_nav_bar%3D1%26from%3Dapp", "getInstance().getStringV…onUrlSetting::class.java)");
        if (!TextUtils.isEmpty(LIZJ)) {
            str2 = LIZJ;
        }
        LIZ.append(str2);
        LIZ.append("%26item_id%3D");
        Aweme aweme = AdSettingsActivity.LJLL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        SmartRouter.buildRoute(adSettingsActivity, X1D.LIZIZ(LIZ)).open();
    }

    public static final void onClick$3(IDCSpanS28S0100000_1 iDCSpanS28S0100000_1, View p0) {
        o.LJIIIZ(p0, "p0");
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) iDCSpanS28S0100000_1.l0, "//webview/");
        String str = "https://support.tiktok.com/en/using-tiktok/messaging-and-notifications/tiktok-stickers";
        String str2 = (String) SettingsManager.LIZLLL().LJIIIIZZ("tt_im_video_sticker_creation_config", String.class, "https://support.tiktok.com/en/using-tiktok/messaging-and-notifications/tiktok-stickers");
        if (str2 != null) {
            str = str2;
        }
        buildRoute.withParam("url", str);
        buildRoute.open();
    }

    public static final void updateDrawState$0(IDCSpanS28S0100000_1 iDCSpanS28S0100000_1, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setTypeface(Typeface.DEFAULT_BOLD);
        ds.setUnderlineText(false);
        Integer LJI = C79045V0n.LJI(R.attr.go, ((C107404Jk) iDCSpanS28S0100000_1.l0).LIZ);
        if (LJI != null) {
            ds.setColor(LJI.intValue());
        }
    }

    public static final void updateDrawState$1(IDCSpanS28S0100000_1 iDCSpanS28S0100000_1, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.gu, (AdSettingsActivity) iDCSpanS28S0100000_1.l0));
        T5S t5s = new T5S();
        t5s.LIZ(82);
        ds.setTypeface(t5s.getTypeface());
    }

    public static final void updateDrawState$2(IDCSpanS28S0100000_1 iDCSpanS28S0100000_1, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        BaseMyProfileGuideWidget baseMyProfileGuideWidget = (BaseMyProfileGuideWidget) iDCSpanS28S0100000_1.l0;
        baseMyProfileGuideWidget.getClass();
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, C77125UOr.LIZJ(baseMyProfileGuideWidget)));
        ds.setUnderlineText(false);
        T5S t5s = new T5S();
        t5s.LIZ(82);
        ds.setTypeface(t5s.getTypeface());
    }

    public static final void updateDrawState$3(IDCSpanS28S0100000_1 iDCSpanS28S0100000_1, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setTypeface(Typeface.DEFAULT_BOLD);
        ds.setUnderlineText(false);
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.dl, EF7.LIZIZ()));
    }
}
