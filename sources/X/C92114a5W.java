package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.a5W, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92114a5W extends ReplacementSpan {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final float LJLJJI;

    public C92114a5W(int i, int i2, int i3, float f) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = f;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        return (int) (this.LJLJI + paint.measureText(charSequence, i, i2) + this.LJLJI);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        paint.setColor(this.LJLIL);
        RectF rectF = new RectF(f, i3 + O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), paint.measureText(charSequence, i, i2) + f + (this.LJLJI * 2), i5);
        float f2 = this.LJLJJI;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setColor(this.LJLILLLLZI);
        if (charSequence != null) {
            canvas.drawText(charSequence, i, i2, this.LJLJI + f, i4, paint);
        }
    }
}
