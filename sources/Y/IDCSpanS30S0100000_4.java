package Y;

import X.AKH;
import X.ATZ;
import X.AnonymousClass636;
import X.C03880Dg;
import X.C188727au;
import X.C246349le;
import X.C65300Pk0;
import X.C79045V0n;
import X.FMX;
import X.InterfaceC65784Pro;
import X.ONM;
import X.T5S;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.services.IWebViewService;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.ui.ManageByParentIntermediateActivity;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesCreationSuccessActivity;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public class IDCSpanS30S0100000_4 extends ClickableSpan {
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
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
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
            default:
                super.updateDrawState(textPaint);
                return;
            case 2:
                textPaint.setUnderlineText(false);
                return;
            case 3:
                updateDrawState$2(this, textPaint);
                return;
            case 4:
                updateDrawState$3(this, textPaint);
                return;
            case 5:
                updateDrawState$4(this, textPaint);
                return;
            case 6:
                updateDrawState$5(this, textPaint);
                return;
        }
    }

    public IDCSpanS30S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCSpanS30S0100000_4 iDCSpanS30S0100000_4, View p0) {
        o.LJIIIZ(p0, "p0");
        SmartRouter.buildRoute((ManageByParentIntermediateActivity) iDCSpanS30S0100000_4.l0, a.LJIIIZ().LIZIZ()).open();
    }

    public static final void onClick$1(IDCSpanS30S0100000_4 iDCSpanS30S0100000_4, View widget) {
        o.LJIIIZ(widget, "widget");
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDCSpanS30S0100000_4.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onClick$2(IDCSpanS30S0100000_4 iDCSpanS30S0100000_4, View view) {
        SmartRouter.buildRoute((Context) iDCSpanS30S0100000_4.l0, "aweme://privacy/setting").open();
    }

    public static final void onClick$3(IDCSpanS30S0100000_4 iDCSpanS30S0100000_4, View widget) {
        o.LJIIIZ(widget, "widget");
        ((AdSettingsActivity) iDCSpanS30S0100000_4.l0).LLFII();
    }

    public static final void onClick$4(IDCSpanS30S0100000_4 iDCSpanS30S0100000_4, View view) {
        o.LJIIIZ(view, "view");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ONM.LIZ > 1000) {
            ONM.LIZ = currentTimeMillis;
            ATZ atz = new ATZ((Context) iDCSpanS30S0100000_4.l0);
            if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/feed/survey/FeedPrivacyBottomDialog", "show", atz, new Object[0], "void", new C65300Pk0(false, "()V", "-4415021939847538258")).LIZ) {
                atz.show();
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "homepage_hot");
            FMX.LJIIL("click_privacy_policy", c188727au.LIZ);
        }
    }

    public static final void onClick$5(IDCSpanS30S0100000_4 iDCSpanS30S0100000_4, View widget) {
        o.LJIIIZ(widget, "widget");
        C246349le.LIZIZ = "start";
        AKH akh = C246349le.LIZ;
        if (akh != null) {
            akh.LIZ();
        }
    }

    public static final void onClick$6(IDCSpanS30S0100000_4 iDCSpanS30S0100000_4, View view) {
        o.LJIIIZ(view, "view");
        ((IWebViewService) ((SeriesCreationSuccessActivity) iDCSpanS30S0100000_4.l0).LJLJJLL.getValue()).LIZ((SeriesCreationSuccessActivity) iDCSpanS30S0100000_4.l0, "https://tiktok.com/series", false);
    }

    public static final void updateDrawState$0(IDCSpanS30S0100000_4 iDCSpanS30S0100000_4, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$2(IDCSpanS30S0100000_4 iDCSpanS30S0100000_4, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.go, (AdSettingsActivity) iDCSpanS30S0100000_4.l0));
        T5S t5s = new T5S();
        t5s.LIZ(82);
        ds.setTypeface(t5s.getTypeface());
    }

    public static final void updateDrawState$3(IDCSpanS30S0100000_4 iDCSpanS30S0100000_4, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$4(IDCSpanS30S0100000_4 iDCSpanS30S0100000_4, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        Integer LJI = C79045V0n.LJI(R.attr.eb, (Context) iDCSpanS30S0100000_4.l0);
        if (LJI != null) {
            ds.setColor(LJI.intValue());
        }
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$5(IDCSpanS30S0100000_4 iDCSpanS30S0100000_4, TextPaint textPaint) {
        o.LJIIIZ(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        Integer LJI = C79045V0n.LJI(R.attr.eb, (SeriesCreationSuccessActivity) iDCSpanS30S0100000_4.l0);
        if (LJI != null) {
            textPaint.setColor(LJI.intValue());
        }
        textPaint.setUnderlineText(false);
    }
}
