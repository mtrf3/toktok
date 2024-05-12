package Y;

import X.AnonymousClass636;
import X.C04330Ez;
import X.C16880lQ;
import X.EF7;
import X.InterfaceC88472Yns;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.authorize.I18nAuthorizeFragment;
import com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateFragment;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDCSpanS4S0200000_10 extends ClickableSpan {
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

    public static final void onClick$0(IDCSpanS4S0200000_10 iDCSpanS4S0200000_10, View view) {
        o.LJIIIZ(view, "view");
        Context requireContext = ((I18nAuthorizeFragment) iDCSpanS4S0200000_10.l0).requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        String url = ((URLSpan) iDCSpanS4S0200000_10.l1).getURL();
        o.LJIIIIZZ(url, "span.url");
        Intent intent = new Intent(requireContext, (Class<?>) CrossPlatformActivity.class);
        intent.setData(UriProtector.parse(url));
        if (!(requireContext instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("hide_nav_bar", false);
        intent.putExtra("use_webview_title", true);
        C16880lQ.LIZJ(requireContext, intent);
    }

    public static final void onClick$1(IDCSpanS4S0200000_10 iDCSpanS4S0200000_10, View widget) {
        o.LJIIIZ(widget, "widget");
        ((AgeGateFragment) iDCSpanS4S0200000_10.l0).Ll(((URLSpan) iDCSpanS4S0200000_10.l1).getURL());
    }

    public static final void onClick$2(IDCSpanS4S0200000_10 iDCSpanS4S0200000_10, View widget) {
        String str;
        o.LJIIIZ(widget, "widget");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDCSpanS4S0200000_10.l0;
        URLSpan uRLSpan = (URLSpan) iDCSpanS4S0200000_10.l1;
        if (uRLSpan != null) {
            str = uRLSpan.getURL();
        } else {
            str = null;
        }
        interfaceC88472Yns.invoke(str);
    }

    public static final void updateDrawState$0(IDCSpanS4S0200000_10 iDCSpanS4S0200000_10, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setColor(C04330Ez.LIZIZ(((I18nAuthorizeFragment) iDCSpanS4S0200000_10.l0).requireContext(), R.color.ck));
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$1(IDCSpanS4S0200000_10 iDCSpanS4S0200000_10, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$2(IDCSpanS4S0200000_10 iDCSpanS4S0200000_10, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.go, EF7.LIZIZ()));
    }

    public IDCSpanS4S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
