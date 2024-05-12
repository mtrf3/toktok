package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.6Di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156786Di extends ReplacementSpan {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public C156786Di(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        String substring = String.valueOf(charSequence).substring(i, i2);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        paint.setTextSize(this.LJLIL);
        paint.setColor(this.LJLILLLLZI);
        paint.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
        return C47959Irz.LIZJ(3, (int) paint.measureText(substring));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        String substring = String.valueOf(charSequence).substring(i, i2);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        paint.setTextSize(this.LJLIL);
        paint.setColor(this.LJLILLLLZI);
        paint.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
        canvas.drawText(substring, f + O6R.LJJIIZ(C32151Nz.LJIIZILJ(3)), i4, paint);
    }
}
