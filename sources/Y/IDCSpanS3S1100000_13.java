package Y;

import X.AnonymousClass636;
import X.InterfaceC77535Ubr;
import X.JBR;
import X.LA5;
import X.T5S;
import X.UTS;
import X.UTT;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.setting.services.LanguageService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDCSpanS3S1100000_13 extends ClickableSpan {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public static final void onClick$0(IDCSpanS3S1100000_13 iDCSpanS3S1100000_13, View p0) {
        o.LJIIIZ(p0, "p0");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://support.tiktok.com/");
        String appLanguage = LanguageService.LIZ().getAppLanguage();
        if (o.LJ(appLanguage, "he")) {
            appLanguage = "he_IL";
        } else if (o.LJ(appLanguage, "zh-Hant")) {
            appLanguage = "zh-Hant-TW";
        }
        Uri build = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", JBR.LJFF(LIZ, appLanguage, "/account-and-privacy/personalized-ads-and-data/how-your-phone-number-is-used-on-tiktok", LIZ)).build();
        IBulletService LIZ2 = BulletService.LIZ();
        Context context = (Context) iDCSpanS3S1100000_13.l1;
        String uri = build.toString();
        o.LJIIIIZZ(uri, "schema.toString()");
        LIZ2.LJIIIIZZ(context, uri);
        UTS.LIZ(iDCSpanS3S1100000_13.s0, LA5.LIZJ.getInt("email_dialog_show_times", 0) + 1, UTT.LEARN_MORE);
    }

    public static final void onClick$1(IDCSpanS3S1100000_13 iDCSpanS3S1100000_13, View widget) {
        o.LJIIIZ(widget, "widget");
        ((InterfaceC77535Ubr) iDCSpanS3S1100000_13.l1).LIZ(iDCSpanS3S1100000_13.s0);
    }

    public static final void onClick$2(IDCSpanS3S1100000_13 iDCSpanS3S1100000_13, View widget) {
        o.LJIIIZ(widget, "widget");
        ((InterfaceC77535Ubr) iDCSpanS3S1100000_13.l1).LIZ(iDCSpanS3S1100000_13.s0);
    }

    public static final void updateDrawState$0(IDCSpanS3S1100000_13 iDCSpanS3S1100000_13, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.gu, (Context) iDCSpanS3S1100000_13.l1));
        T5S t5s = new T5S();
        t5s.LIZ(82);
        ds.setTypeface(t5s.getTypeface());
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$1(IDCSpanS3S1100000_13 iDCSpanS3S1100000_13, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$2(IDCSpanS3S1100000_13 iDCSpanS3S1100000_13, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public IDCSpanS3S1100000_13(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
