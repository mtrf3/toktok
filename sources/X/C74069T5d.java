package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.T5d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74069T5d extends MetricAffectingSpan {
    public final float LJLIL;

    public C74069T5d(float f) {
        this.LJLIL = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (!Float.isNaN(this.LJLIL)) {
            textPaint.setLetterSpacing(this.LJLIL / textPaint.getTextSize());
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        if (!Float.isNaN(this.LJLIL)) {
            textPaint.setLetterSpacing(this.LJLIL / textPaint.getTextSize());
        }
    }
}
