package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33246D3a extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33246D3a() {
        this.LIZJ.LJIIIIZZ(21.7f, 5.34f);
        this.LIZJ.LJIIIZ(2.66f, 2.66f, false, true, 4.6f, 0.0f);
        this.LIZJ.LJIIL(19.35f, 34.03f);
        this.LIZJ.LJIIJ(1.0f, 1.77f, -0.27f, 3.96f, -2.31f, 3.96f);
        this.LIZJ.LJI(4.66f);
        this.LIZJ.LJIIIZ(2.65f, 2.65f, false, true, -2.3f, -3.96f);
        this.LIZJ.LJII(21.68f, 5.34f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-46022);
        this.LIZIZ.setAlpha(234);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(22.0f, 16.64f);
        dij.LJIIJ(0.0f, -0.36f, 0.3f, -0.64f, 0.67f, -0.64f);
        dij.LJIIJJI(2.66f);
        dij.LJIIJ(0.37f, 0.0f, 0.67f, 0.28f, 0.67f, 0.64f);
        dij.LJIILL(12.72f);
        dij.LJIIJ(0.0f, 0.36f, -0.3f, 0.64f, -0.67f, 0.64f);
        dij.LJIIJJI(-2.66f);
        dij.LJIIIZ(0.65f, 0.65f, false, true, -0.67f, -0.64f);
        dij.LJIJ(16.64f);
        dij.LIZLLL();
        dij.LJIIIIZZ(26.67f, 35.33f);
        dij.LJIIIZ(2.67f, 2.67f, true, true, -5.34f, 0.0f);
        dij.LJIIIZ(2.67f, 2.67f, false, true, 5.34f, 0.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
