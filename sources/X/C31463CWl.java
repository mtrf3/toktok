package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CWl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31463CWl extends C31646CbS {
    public final int LJJJLZIJ;
    public String LJJJZ;
    public int LJJL;
    public InterfaceC31469CWr LJJLI;
    public C31460CWi LJJLIIIIJ;
    public float LJJLIIIJ;
    public final C5H3 LJJLIIIJILLIZJL;
    public final C5H3 LJJLIIIJJI;
    public final C5H3 LJJLIIIJJIZ;

    @Override // X.C31646CbS
    public final int LJFF() {
        int i = this.LJJJLZIJ;
        if (i != 0) {
            return i;
        }
        return super.LJFF();
    }

    public void LJIILLIIL() {
        Object value = this.LJJLIIIJILLIZJL.getValue();
        o.LJIIIIZZ(value, "<get-animator>(...)");
        ((ValueAnimator) value).cancel();
        Object value2 = this.LJJLIIIJJI.getValue();
        o.LJIIIIZZ(value2, "<get-showAnimator>(...)");
        ((ValueAnimator) value2).cancel();
        Object value3 = this.LJJLIIIJJIZ.getValue();
        o.LJIIIIZZ(value3, "<get-hideAnimator>(...)");
        ((ValueAnimator) value3).cancel();
    }

    @Override // X.C31646CbS
    public final String LJIILIIL() {
        return this.LJJJZ;
    }

    @Override // X.AbstractC31467CWp
    public final int LIZJ(Paint paint, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i2 = this.LIZJ;
            if (i2 > i) {
                int i3 = i2 / 2;
                int i4 = i / 4;
                int i5 = i3 - i4;
                int i6 = -(i3 + i4);
                fontMetricsInt.ascent = i6;
                fontMetricsInt.top = i6;
                fontMetricsInt.bottom = i5;
                fontMetricsInt.descent = i5;
            }
        }
        if (this.LIZIZ < 0) {
            this.LIZIZ = LJ(paint);
        }
        return this.LIZIZ;
    }

    @Override // X.C31646CbS, X.AbstractC31467CWp
    public void LIZLLL(Canvas canvas, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        int i = this.LJJL;
        boolean z = false;
        if (i >= 0 && i < 256) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.LIZIZ, this.LIZJ, i, 31);
            z = true;
        }
        super.LIZLLL(canvas, paint);
        if (z) {
            canvas.restore();
        }
    }

    @Override // X.C31646CbS
    public final void LJIILJJIL(Canvas canvas, RectF rectF) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(rectF, "rectF");
        super.LJIILJJIL(canvas, rectF);
        canvas.restore();
    }

    @Override // X.C31646CbS
    public final void LJIILL(Canvas canvas, RectF rectF) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(rectF, "rectF");
        super.LJIILL(canvas, rectF);
        canvas.save();
        float f = 2;
        canvas.rotate(this.LJJLIIIJ, (rectF.width() / f) + rectF.left, (rectF.height() / f) + rectF.top);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31463CWl(Context context, Bitmap bitmap, int i, String str, C31647CbT c31647CbT) {
        super(context, bitmap, null, null, str, c31647CbT);
        o.LJIIIZ(context, "context");
        this.LJJJLZIJ = i;
        this.LJJJZ = str;
        this.LJJL = 255;
        this.LJJLIIIJILLIZJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 23));
        this.LJJLIIIJJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 25));
        this.LJJLIIIJJIZ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 24));
    }
}
