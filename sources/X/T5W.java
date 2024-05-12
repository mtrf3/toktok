package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T5W extends MetricAffectingSpan {
    public final Typeface LJLIL;

    public T5W(Typeface typeface) {
        this.LJLIL = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        Typeface typeface = this.LJLIL;
        if (typeface != null) {
            ds.setTypeface(typeface);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint paint) {
        o.LJIIIZ(paint, "paint");
        Typeface typeface = this.LJLIL;
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
    }
}
