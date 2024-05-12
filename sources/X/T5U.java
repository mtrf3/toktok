package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T5U extends MetricAffectingSpan {
    public Typeface LJLIL;
    public Float LJLILLLLZI;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        updateMeasureState(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        o.LJIIIZ(textPaint, "textPaint");
        Typeface typeface = textPaint.getTypeface();
        Typeface typeface2 = this.LJLIL;
        if (typeface2 != null && !o.LJ(typeface, typeface2)) {
            textPaint.setTypeface(this.LJLIL);
        }
        float textSize = textPaint.getTextSize();
        Float f = this.LJLILLLLZI;
        if (f != null && !o.LIZ(textSize, f)) {
            textPaint.setTextSize(f.floatValue());
        }
    }

    public T5U(int i, boolean z) {
        T5V LIZIZ = UYR.LIZIZ(i, true);
        Typeface LIZIZ2 = C61589OFd.LIZIZ(LIZIZ.LJLJI);
        if (LIZIZ2 != null) {
            this.LJLIL = LIZIZ2;
        }
        if (!z) {
            this.LJLILLLLZI = C61328O5c.LIZJ(LIZIZ.LJLIL);
        }
    }

    public T5U(Typeface typeface, Float f) {
        this.LJLIL = typeface;
        this.LJLILLLLZI = f;
    }
}
