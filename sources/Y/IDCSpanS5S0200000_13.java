package Y;

import X.AnonymousClass636;
import X.C78020Ujg;
import X.CN1;
import X.JBR;
import X.T5S;
import X.UUD;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.setting.services.LanguageService;
import com.zhiliaoapp.musically.R;
import defpackage.c1;
import defpackage.u0;
import defpackage.z0;
import kotlin.jvm.internal.o;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public class IDCSpanS5S0200000_13 extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

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
                onClick$2(this, view);
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
                o.LJIIIZ(textPaint, "ds");
                return;
            case 1:
                updateDrawState$1(this, textPaint);
                return;
            case 2:
            default:
                super.updateDrawState(textPaint);
                return;
            case 3:
                updateDrawState$2(this, textPaint);
                return;
        }
    }

    public static final void onClick$0(IDCSpanS5S0200000_13 iDCSpanS5S0200000_13, View p0) {
        o.LJIIIZ(p0, "p0");
        ((RankPageFragment) iDCSpanS5S0200000_13.l0).xl((C78020Ujg) iDCSpanS5S0200000_13.l1);
    }

    public static final void onClick$1(IDCSpanS5S0200000_13 iDCSpanS5S0200000_13, View p0) {
        o.LJIIIZ(p0, "p0");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://support.tiktok.com/");
        ((UUD) iDCSpanS5S0200000_13.l0).getClass();
        String appLanguage = LanguageService.LIZ().getAppLanguage();
        if (o.LJ(appLanguage, "he")) {
            appLanguage = "he_IL";
        } else if (o.LJ(appLanguage, "zh-Hant")) {
            appLanguage = "zh-Hant-TW";
        }
        Uri build = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", JBR.LJFF(LIZ, appLanguage, "/account-and-privacy/personalized-ads-and-data/how-your-phone-number-is-used-on-tiktok", LIZ)).build();
        IBulletService LIZ2 = BulletService.LIZ();
        Context context = (Context) iDCSpanS5S0200000_13.l1;
        String uri = build.toString();
        o.LJIIIIZZ(uri, "schema.toString()");
        LIZ2.LJIIIIZZ(context, uri);
    }

    public static final void onClick$2(IDCSpanS5S0200000_13 iDCSpanS5S0200000_13, View widget) {
        ListResult.VoucherItem.CashbackInfo.CashbackPercentage cashbackPercentage;
        String str;
        ListResult.VoucherItem.CashbackInfo.CashbackPercentage cashbackPercentage2;
        o.LJIIIZ(widget, "widget");
        c1 c1Var = (c1) iDCSpanS5S0200000_13.l0;
        Context context = ((z0) iDCSpanS5S0200000_13.l1).itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        c1Var.getClass();
        ListResult.VoucherItem voucherItem = c1Var.LJFF;
        if (voucherItem == null) {
            return;
        }
        u0 u0Var = new u0();
        u0Var.LIZ.LIZIZ(voucherItem.expireTimestamp, "valid_until_date");
        u0Var.LIZ.LIZIZ(voucherItem.minOrderCoinsAmount, "min_amount");
        u0Var.LIZ.LIZIZ(voucherItem.maxOrderCoinsAmount, "max_amount");
        ListResult.VoucherItem.CashbackInfo cashbackInfo = voucherItem.cashbackInfo;
        String str2 = null;
        if (cashbackInfo != null && (cashbackPercentage2 = cashbackInfo.cashbackPercentage) != null) {
            str2 = cashbackPercentage2.iap;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        u0Var.LIZ.LIZJ("iap_cashback_percentage", str2);
        ListResult.VoucherItem.CashbackInfo cashbackInfo2 = voucherItem.cashbackInfo;
        if (cashbackInfo2 != null && (cashbackPercentage = cashbackInfo2.cashbackPercentage) != null && (str = cashbackPercentage.webapp) != null) {
            str3 = str;
        }
        u0Var.LIZ.LIZJ("webapp_cashback_percentage", str3);
        String parameter = voucherItem.voucherToken;
        o.LJIIIZ(parameter, "parameter");
        u0Var.LIZ.LIZJ("voucher_token", parameter);
        String parameter2 = voucherItem.voucherTemplateId;
        o.LJIIIZ(parameter2, "parameter");
        u0Var.LIZ.LIZJ("voucher_template_id", parameter2);
        u0Var.LIZ.LIZJ("voucher_type", "cash_back_voucher");
        u0Var.LIZ.LIZJ("page_type", "incentive_productization");
        u0Var.LIZ.LIZJ("popup_entrance", "room_recharge");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, u0Var.LIZ.LIZLLL());
    }

    public static final void onClick$3(IDCSpanS5S0200000_13 iDCSpanS5S0200000_13, View widget) {
        o.LJIIIZ(widget, "widget");
        ((TTKAgeGateRegistrationFragment) iDCSpanS5S0200000_13.l0).Ll(((URLSpan) iDCSpanS5S0200000_13.l1).getURL());
    }

    public static final void updateDrawState$1(IDCSpanS5S0200000_13 iDCSpanS5S0200000_13, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.gu, (Context) iDCSpanS5S0200000_13.l1));
        T5S t5s = new T5S();
        t5s.LIZ(82);
        ds.setTypeface(t5s.getTypeface());
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$2(IDCSpanS5S0200000_13 iDCSpanS5S0200000_13, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public IDCSpanS5S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
