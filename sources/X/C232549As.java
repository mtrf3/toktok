package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9As, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232549As {
    public static final CharSequence LIZ(Context context, String str, String sourceText, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(sourceText, "sourceText");
        String LIZIZ = Q8U.LIZIZ(new Object[]{str}, 1, sourceText, "format(format, *args)");
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, str, 0, false, 6);
        SpannableString spannableString = new SpannableString(LIZIZ);
        if (LJJLIIIJL != -1) {
            final int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.gu, context);
            spannableString.setSpan(new ClickableSpan() { // from class: X.9Zy
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
                    t5s.LIZ(83);
                    ds.setTypeface(t5s.getTypeface());
                    ds.setUnderlineText(false);
                }
            }, LJJLIIIJL, str.length() + LJJLIIIJL, 33);
        }
        return spannableString;
    }
}
