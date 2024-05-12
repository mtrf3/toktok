package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4ki, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118364ki {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableStringBuilder LIZ(ActivityC45651qj context, String str, String highlight, final String str2) {
        o.LJIIIZ(highlight, "highlight");
        o.LJIIIZ(context, "context");
        boolean z = false;
        int LJJLIIIJL = s.LJJLIIIJL(str, highlight, 0, false, 6);
        if (LJJLIIIJL == -1) {
            new SpannableStringBuilder(str);
        }
        if (str2 == null || ujb.o.LJJJJJL(str2)) {
            z = true;
        }
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIIJL, highlight.length() + LJJLIIIJL, 33);
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        spannableStringBuilder2.setSpan(new ClickableSpan() { // from class: X.4kh
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                o.LJIIIZ(widget, "widget");
                SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "//webview");
                buildRoute.withParam("url", str2);
                buildRoute.open();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                o.LJIIIZ(ds, "ds");
                ds.setUnderlineText(false);
            }
        }, LJJLIIIJL, highlight.length() + LJJLIIIJL, 33);
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.go, context)), LJJLIIIJL, highlight.length() + LJJLIIIJL, 33);
        spannableStringBuilder2.setSpan(new StyleSpan(1), LJJLIIIJL, highlight.length() + LJJLIIIJL, 33);
        return spannableStringBuilder2;
    }
}
