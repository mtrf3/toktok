package X;

import android.graphics.Rect;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.VRq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79750VRq extends MetricAffectingSpan {
    public final Rect LJLIL = new Rect();
    public final VRP LJLILLLLZI;

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
    }

    public C79750VRq(VRP vrp) {
        this.LJLILLLLZI = vrp;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.LJLIL.width() == 0 || this.LJLIL.height() == 0) {
            return;
        }
        this.LJLILLLLZI.setBounds(this.LJLIL);
        textPaint.setShader(this.LJLILLLLZI.LJLILLLLZI);
    }
}
