package Y;

import X.AnonymousClass636;
import X.C0F1;
import X.GTE;
import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDCSpanS2S1100000_7 extends ClickableSpan {
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

    public static final void onClick$0(IDCSpanS2S1100000_7 iDCSpanS2S1100000_7, View view) {
        o.LJIIIZ(view, "view");
        String uri = new Uri.Builder().scheme("aweme://webview/").appendQueryParameter("url", UriProtector.parse(iDCSpanS2S1100000_7.s0).buildUpon().appendQueryParameter("page", "policy").build().toString()).appendQueryParameter("use_spark", "1").build().toString();
        o.LJIIIIZZ(uri, "Builder().scheme(FConsta…              .toString()");
        SmartRouter.buildRoute(((GTE) iDCSpanS2S1100000_7.l1).getContext(), uri).open();
    }

    public static final void onClick$1(IDCSpanS2S1100000_7 iDCSpanS2S1100000_7, View view) {
        o.LJIIIZ(view, "view");
        if (!TextUtils.isEmpty(iDCSpanS2S1100000_7.s0)) {
            String uri = C0F1.LIZ("aweme://webview/").appendQueryParameter("url", UriProtector.parse(iDCSpanS2S1100000_7.s0).buildUpon().appendQueryParameter("page", "policy").build().toString()).appendQueryParameter("use_spark", "1").build().toString();
            o.LJIIIIZZ(uri, "Builder().scheme(FConsta…              .toString()");
            SmartRouter.buildRoute(((GTE) iDCSpanS2S1100000_7.l1).getContext(), uri).open();
        }
    }

    public static final void onClick$2(IDCSpanS2S1100000_7 iDCSpanS2S1100000_7, View view) {
        String str;
        o.LJIIIZ(view, "view");
        if (((GTE) iDCSpanS2S1100000_7.l1).getMusicUsageOrigin()) {
            str = "original";
        } else {
            str = "general";
        }
        if (!TextUtils.isEmpty(iDCSpanS2S1100000_7.s0)) {
            String uri = C0F1.LIZ("aweme://webview/").appendQueryParameter("url", UriProtector.parse(iDCSpanS2S1100000_7.s0).buildUpon().appendQueryParameter("page", "music").appendQueryParameter("music_type", str).build().toString()).appendQueryParameter("use_spark", "1").build().toString();
            o.LJIIIIZZ(uri, "Builder().scheme(FConsta…              .toString()");
            SmartRouter.buildRoute(((GTE) iDCSpanS2S1100000_7.l1).getContext(), uri).open();
        }
    }

    public static final void updateDrawState$0(IDCSpanS2S1100000_7 iDCSpanS2S1100000_7, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        Context context = ((GTE) iDCSpanS2S1100000_7.l1).getContext();
        o.LJIIIIZZ(context, "context");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$1(IDCSpanS2S1100000_7 iDCSpanS2S1100000_7, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        Context context = ((GTE) iDCSpanS2S1100000_7.l1).getContext();
        o.LJIIIIZZ(context, "context");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$2(IDCSpanS2S1100000_7 iDCSpanS2S1100000_7, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        Context context = ((GTE) iDCSpanS2S1100000_7.l1).getContext();
        o.LJIIIIZZ(context, "context");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        ds.setUnderlineText(false);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDCSpanS2S1100000_7(X.GTE r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 0: goto Le;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.s0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCSpanS2S1100000_7.<init>(X.GTE, java.lang.String, int):void");
    }
}
