package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SJX extends C8FC<C70649Ro5> {
    public SJX(C70649Ro5 c70649Ro5) {
        super(c70649Ro5);
    }

    @Override // X.C8FC, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        float f2 = ((paint.getFontMetrics().ascent + paint.getFontMetrics().descent) / 2) + i4;
        float measuredHeight = f2 - (this.LJLIL.getMeasuredHeight() / 2);
        float measuredHeight2 = f2 + (this.LJLIL.getMeasuredHeight() / 2);
        if (C26338AVi.LIZLLL(this.LJLIL)) {
            i6 = this.LJLILLLLZI;
        } else {
            i6 = 0;
        }
        float f3 = f + i6;
        float measuredHeight3 = (((measuredHeight2 - measuredHeight) - this.LJLIL.getMeasuredHeight()) / 2.0f) + i3;
        canvas.translate(f3, measuredHeight3);
        C39214FaE c39214FaE = C37203Eit.LIZJ;
        T t = this.LJLIL;
        c39214FaE.getClass();
        C39214FaE.LIZ(t, canvas);
        canvas.translate(-f3, -measuredHeight3);
    }
}
