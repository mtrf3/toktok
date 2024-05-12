package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.DynamicDrawableSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9I2, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9I2 extends LinearLayout {
    public C9HL LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final TuxIconView getIconView() {
        TuxIconView feature_icon = (TuxIconView) LIZ(R.id.d5r);
        o.LJIIIIZZ(feature_icon, "feature_icon");
        return feature_icon;
    }

    public final TuxTextView getTextView() {
        TuxTextView feature_text = (TuxTextView) LIZ(R.id.d5y);
        o.LJIIIIZZ(feature_text, "feature_text");
        return feature_text;
    }

    public C9I2(Context context) {
        super(context, null, 0);
        C16880lQ.LLLZIIL(R.layout.c3q, C16880lQ.LLZIL(getContext()), this);
        if (C2318698c.LIZ() >= 2) {
            View cta_container = LIZ(R.id.c0c);
            o.LJIIIIZZ(cta_container, "cta_container");
            C27570Aru.LJII(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), cta_container);
            View feature_icon_and_alert = LIZ(R.id.d5u);
            o.LJIIIIZZ(feature_icon_and_alert, "feature_icon_and_alert");
            C27570Aru.LJII(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), feature_icon_and_alert);
            View feature_icon = LIZ(R.id.d5r);
            o.LJIIIIZZ(feature_icon, "feature_icon");
            C27570Aru.LJII(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), feature_icon);
            View feature_icon_and_alert2 = LIZ(R.id.d5u);
            o.LJIIIIZZ(feature_icon_and_alert2, "feature_icon_and_alert");
            C27570Aru.LJIIIZ(feature_icon_and_alert2, O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
            View feature_icon2 = LIZ(R.id.d5r);
            o.LJIIIIZZ(feature_icon2, "feature_icon");
            C27570Aru.LJIIIZ(feature_icon2, O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
            ((TextView) LIZ(R.id.d5y)).setHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
        }
    }

    public final void LIZIZ(C9HL newStyle) {
        o.LJIIIZ(newStyle, "newStyle");
        this.LJLIL = newStyle;
        int i = C9I3.LIZ[newStyle.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LIZ(R.id.d60).setVisibility(0);
                LIZ(R.id.d5u).setVisibility(8);
                return;
            }
            LIZ(R.id.d5u).setVisibility(0);
            LIZ(R.id.d60).setVisibility(8);
            return;
        }
        LIZ(R.id.d60).setVisibility(0);
        LIZ(R.id.d5u).setVisibility(8);
    }

    public final void setComponentWidth(int i) {
        int i2;
        View feature_text_and_alert = LIZ(R.id.d60);
        o.LJIIIIZZ(feature_text_and_alert, "feature_text_and_alert");
        C26338AVi.LJI(feature_text_and_alert, 0, 0, 0, 0, false, 16);
        if (this.LJLIL == C9HL.ICON) {
            if (C2318698c.LIZIZ()) {
                i2 = 40;
            } else {
                i2 = 44;
            }
            int LIZIZ = C7MY.LIZIZ(i2);
            View feature_icon = LIZ(R.id.d5r);
            o.LJIIIIZZ(feature_icon, "feature_icon");
            C27570Aru.LJIIIZ(feature_icon, LIZIZ);
            return;
        }
        ((TextView) findViewById(R.id.d5y)).setWidth(i);
    }

    public final void setCtaBackground(C9I4 variant) {
        o.LJIIIZ(variant, "variant");
        int i = C9I3.LIZIZ[variant.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LIZ(R.id.c0c).setBackground(getContext().getResources().getDrawable(R.drawable.bz3, getContext().getTheme()));
                ((TuxTextView) LIZ(R.id.d5y)).setTextColorRes(R.attr.dj);
                return;
            }
            LIZ(R.id.c0c).setBackground(getContext().getResources().getDrawable(R.drawable.bz3, getContext().getTheme()));
            ((TuxTextView) LIZ(R.id.d5y)).setTextColorRes(R.attr.go);
            return;
        }
        LIZ(R.id.c0c).setBackground(getContext().getResources().getDrawable(R.drawable.bz4, getContext().getTheme()));
        ((TuxTextView) LIZ(R.id.d5y)).setTextColorRes(R.attr.dj);
    }

    public final void LIZJ(C9HL c9hl, Integer num, String str, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        if (str != null) {
            ((TextView) LIZ(R.id.d5y)).setText(str);
        }
        if (num != null) {
            num.intValue();
            ((TuxIconView) LIZ(R.id.d5r)).setIconRes(num.intValue());
        }
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(interfaceC88472Yns, 296)));
        if (c9hl == null) {
            c9hl = C9HL.ICON;
        }
        LIZIZ(c9hl);
        C9AE.LIZ(findViewById(R.id.c0c), C9AC.LIGHT_MASK, C32151Nz.LJIIZILJ(8));
    }

    public final SpannableStringBuilder LIZLLL(final int i, int i2, Integer num, String str) {
        if (str == null || num == null) {
            return null;
        }
        num.intValue();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(QZZ.LIZIZ(' ', str));
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = num.intValue();
        c2068389v.LIZIZ = i2;
        c2068389v.LIZJ = i2;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        final SY9 LIZ = c2068389v.LIZ(context);
        LIZ.setBounds(0, 0, LIZ.LJI, LIZ.LJII);
        spannableStringBuilder.setSpan(new DynamicDrawableSpan(LIZ, i) { // from class: X.8Fh
            public final Drawable LJLIL;
            public final int LJLILLLLZI;

            @Override // android.text.style.DynamicDrawableSpan
            public final Drawable getDrawable() {
                return this.LJLIL;
            }

            {
                this.LJLIL = LIZ;
                this.LJLILLLLZI = i;
            }

            @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
            public final int getSize(Paint paint, CharSequence text, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
                o.LJIIIZ(paint, "paint");
                o.LJIIIZ(text, "text");
                Drawable drawable = this.LJLIL;
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.LJLIL.getIntrinsicHeight());
                return this.LJLIL.getIntrinsicWidth() + this.LJLILLLLZI;
            }

            @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
            public final void draw(Canvas canvas, CharSequence text, int i3, int i4, float f, int i5, int i6, int i7, Paint paint) {
                o.LJIIIZ(canvas, "canvas");
                o.LJIIIZ(text, "text");
                o.LJIIIZ(paint, "paint");
                Drawable drawable = this.LJLIL;
                canvas.save();
                canvas.translate(f, ((i5 + i7) / 2.0f) - (drawable.getBounds().height() / 2.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
        }, 0, 1, 33);
        ((TextView) findViewById(R.id.d5y)).setText(spannableStringBuilder);
        return spannableStringBuilder;
    }
}
