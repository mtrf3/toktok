package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9At, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232559At {
    public static final CharSequence LIZ(Context context, String linkText, String sourceText, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(linkText, "linkText");
        o.LJIIIZ(sourceText, "sourceText");
        String LIZIZ = Q8U.LIZIZ(new Object[]{linkText}, 1, sourceText, "format(format, *args)");
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, linkText, 0, false, 6);
        SpannableString spannableString = new SpannableString(LIZIZ);
        if (LJJLIIIJL != -1) {
            final int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
            spannableString.setSpan(new ClickableSpan() { // from class: X.9a0
                @Override // android.text.style.ClickableSpan
                public final void onClick(View widget) {
                    o.LJIIIZ(widget, "widget");
                    interfaceC65784Pro.invoke();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint ds) {
                    o.LJIIIZ(ds, "ds");
                    super.updateDrawState(ds);
                    ds.setColor(LJIIIIZZ);
                    T5S t5s = new T5S();
                    t5s.LIZ(82);
                    ds.setTypeface(t5s.getTypeface());
                    ds.setUnderlineText(false);
                }
            }, LJJLIIIJL, linkText.length() + LJJLIIIJL, 33);
        }
        return spannableString;
    }
}
