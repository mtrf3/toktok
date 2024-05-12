package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.CeN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31827CeN extends ReplacementSpan {
    public float LJLILLLLZI;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public Integer LJLLILLLL;
    public final boolean LJLIL = true;
    public int LJLJI = -16777216;
    public final RectF LJLJJI = new RectF();
    public final RectF LJLJJL = new RectF();
    public final RectF LJLJJLL = new RectF();

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String str;
        o.LJIIIZ(paint, "paint");
        if (charSequence != null) {
            str = charSequence.subSequence(i, i2).toString();
        } else {
            str = null;
        }
        float measureText = paint.measureText(str);
        this.LJLL = measureText;
        RectF rectF = this.LJLJJL;
        float f = measureText + rectF.left + rectF.right;
        this.LJLJLLL = f;
        float f2 = this.LJLILLLLZI;
        if (f < f2) {
            this.LJLJLLL = f2;
        }
        float f3 = this.LJLJLLL;
        RectF rectF2 = this.LJLJJLL;
        float f4 = f3 + rectF2.left + rectF2.right;
        this.LJLJLJ = f4;
        return O6R.LJJIIZ(f4);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float max;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        float f2 = this.LJLLI;
        float f3 = 0.0f;
        if (f2 == 0.0f) {
            max = 0.0f;
        } else {
            float f4 = (i5 - i3) - f2;
            RectF rectF = this.LJLJJL;
            max = Math.max(0.0f, (f4 - rectF.top) - rectF.bottom);
        }
        RectF rectF2 = this.LJLJJI;
        RectF rectF3 = this.LJLJJLL;
        float f5 = 2;
        float f6 = max / f5;
        rectF2.set(f + rectF3.left, i3 + f6, (f + this.LJLJLJ) - rectF3.right, i5 - f6);
        canvas.saveLayer(this.LJLJJI, null);
        int color = paint.getColor();
        paint.setColor(this.LJLJI);
        RectF rectF4 = this.LJLJJI;
        float f7 = this.LJLJL;
        canvas.drawRoundRect(rectF4, f7, f7, paint);
        Integer num = this.LJLLILLLL;
        if (num != null) {
            paint.setColor(num.intValue());
        }
        if (this.LJLLILLLL == null) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
        }
        float f8 = this.LJLJLLL - this.LJLL;
        RectF rectF5 = this.LJLJJL;
        float max2 = Math.max(0.0f, (f8 - rectF5.left) - rectF5.right);
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        float f9 = f + this.LJLJJL.left + this.LJLJJLL.left;
        if (this.LJLIL) {
            f3 = max2 / f5;
        }
        canvas.drawText(valueOf, i, i2, f9 + f3, i4, paint);
        paint.setXfermode(null);
        paint.setColor(color);
        canvas.restore();
    }
}
