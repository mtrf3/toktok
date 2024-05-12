package X;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3ri, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97223ri {
    public static final C97223ri LIZ = new C97223ri();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C97263rm.LJLIL);

    public static int LIZJ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static void LIZIZ(TuxTextView contentView, boolean z) {
        int i;
        int i2;
        o.LJIIIZ(contentView, "contentView");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append((Object) contentView.getText());
        LIZ2.append(' ');
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZIZ2);
        LIZ3.append(C97343ru.LJFF(R.string.cmi));
        String LIZIZ3 = X1D.LIZIZ(LIZ3);
        int length = LIZIZ2.length();
        int length2 = LIZIZ3.length();
        if (z) {
            i = 72;
            i2 = R.attr.gx;
        } else {
            i = 52;
            i2 = R.attr.go;
        }
        T5S t5s = new T5S();
        t5s.LIZ(i);
        final Typeface typeface = t5s.getTypeface();
        SpannableString spannableString = new SpannableString(LIZIZ3);
        final Integer valueOf = Integer.valueOf(C97343ru.LIZLLL(i2));
        final AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(contentView, 765);
        spannableString.setSpan(new ClickableSpan() { // from class: X.3rj
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                o.LJIIIZ(widget, "widget");
                Boolean LIZ4 = C97343ru.LIZ(widget);
                if (LIZ4 != null) {
                    LIZ4.booleanValue();
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = aqS151S0100000_1;
                    if (interfaceC65784Pro != null) {
                        interfaceC65784Pro.invoke();
                    }
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                o.LJIIIZ(ds, "ds");
                Integer num = valueOf;
                if (num != null) {
                    ds.setColor(num.intValue());
                }
                Typeface typeface2 = typeface;
                if (typeface2 != null) {
                    ds.setTypeface(typeface2);
                }
                ds.setUnderlineText(false);
            }
        }, length, length2, 33);
        contentView.setText(spannableString);
        contentView.setMovementMethod(LinkMovementMethod.getInstance());
        contentView.setHighlightColor(0);
    }

    public static void LIZLLL(View label, C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(label, "label");
        int LJ = C97343ru.LJ(R.dimen.v2) + C97343ru.LJ(R.dimen.uz);
        if (label.getVisibility() != 8) {
            C57082Lw.LIZ.LIZJ("#MINUS_ITEM_HEIGHT_EVENT").setValue(new C97243rk(LJ, msg));
            label.setVisibility(8);
        }
    }

    public static void LIZ(ImageView imageView, C109544Rq msg, View view) {
        o.LJIIIZ(msg, "msg");
        if (C4YR.LIZIZ(msg, C99033ud.Companion) && !msg.isSelf()) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            C97343ru.LIZIZ(view, C97253rl.LJLIL);
            C97343ru.LIZJ(view, Integer.valueOf(LIZJ()), Integer.valueOf(LIZJ()), 5);
        }
    }
}
