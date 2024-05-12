package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.T5e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74070T5e extends MetricAffectingSpan {
    public final int LJLIL;

    public C74070T5e(int i) {
        this.LJLIL = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += this.LJLIL;
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += this.LJLIL;
    }
}
