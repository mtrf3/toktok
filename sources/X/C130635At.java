package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import kotlin.jvm.internal.IDqS192S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5At, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130635At {
    public static final float LJIIIIZZ = C134855Qz.LIZ(8.0f);
    public static final float LJIIIZ = C134855Qz.LIZ(12.0f);
    public static final float LJIIJ = C134855Qz.LIZ(8.0f);
    public static final float LJIIJJI = C134855Qz.LIZ(3.0f);
    public final C5BC LIZ;
    public final Rect LIZIZ;
    public final Path LIZJ;
    public final RectF LIZLLL;
    public final Paint LJ;
    public final TextPaint LJFF;
    public int LJI;
    public float LJII;

    public C130635At(C5BC view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LIZIZ = new Rect();
        this.LIZJ = new Path();
        this.LIZLLL = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        this.LJ = paint;
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(LJIIJ);
        textPaint.setStrokeWidth(C134855Qz.LIZ(1.0f));
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setStyle(Paint.Style.FILL);
        this.LJFF = textPaint;
    }

    public final void LIZ(Canvas canvas, String str, int i) {
        View view;
        int i2;
        o.LJIIIZ(canvas, "canvas");
        Object obj = this.LIZ;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            i2 = view.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        this.LJI = C134855Qz.LIZ(1.0f) + i2;
        this.LJFF.setColor(i);
        this.LJFF.getTextBounds(str, 0, str.length(), this.LIZIZ);
        float f = 2;
        float width = (LJIIJJI * f) + this.LIZIZ.width();
        this.LJII = width;
        RectF rectF = this.LIZLLL;
        float f2 = LJIIIIZZ;
        float f3 = this.LJI;
        float f4 = LJIIIZ;
        float f5 = (f3 - f4) / f;
        rectF.set(f2, f5, width + f2, f5 + f4);
        this.LJ.setColor(-1);
        canvas.drawRect(this.LIZLLL, this.LJ);
        this.LJ.setColor(i);
        IDqS192S0200000_2 iDqS192S0200000_2 = new IDqS192S0200000_2(this, canvas, 2);
        Float valueOf = Float.valueOf(f2);
        Float valueOf2 = Float.valueOf((this.LJI - f4) / f);
        C5A5.LJJJJZ.getClass();
        float f6 = C5BD.LIZJ;
        iDqS192S0200000_2.invoke(valueOf, valueOf2, Float.valueOf(f6), Float.valueOf(f6));
        float f7 = -f6;
        iDqS192S0200000_2.invoke(Float.valueOf(f2), Float.valueOf((this.LJI + f4) / f), Float.valueOf(f6), Float.valueOf(f7));
        iDqS192S0200000_2.invoke(Float.valueOf(this.LJII + f2), Float.valueOf((this.LJI - f4) / f), Float.valueOf(f7), Float.valueOf(f6));
        iDqS192S0200000_2.invoke(Float.valueOf(this.LJII + f2), Float.valueOf((this.LJI + f4) / f), Float.valueOf(f7), Float.valueOf(f7));
        this.LIZJ.reset();
        canvas.drawText(str, ((this.LJII / f) + f2) - (this.LIZIZ.width() / 2), ((Math.abs(this.LJFF.ascent()) - this.LJFF.descent()) / f) + (this.LJI / 2), this.LJFF);
    }
}
