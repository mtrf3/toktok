package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.CWn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31465CWn extends ReplacementSpan {
    public final AbstractC31467CWp LJLIL;
    public final Paint LJLILLLLZI = new Paint(1);

    public C31465CWn(AbstractC31467CWp abstractC31467CWp) {
        this.LJLIL = abstractC31467CWp;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        return this.LJLIL.LIZJ(paint, fontMetricsInt);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        canvas.save();
        o.LJIIIIZZ(paint.getFontMetricsInt(), "paint.fontMetricsInt");
        canvas.translate(f, ((((r2.descent + i4) + i4) + r2.ascent) / 2) - (this.LJLIL.LIZJ / 2));
        this.LJLIL.LIZ(canvas, this.LJLILLLLZI);
        canvas.restore();
    }
}
