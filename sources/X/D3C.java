package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3C extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;

    public D3C() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -21199);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(27.1f, 24.0f);
        dij.LJIIIZ(3.1f, 3.1f, true, true, -6.2f, 0.0f);
        dij.LJIIIZ(3.1f, 3.1f, false, true, 6.2f, 0.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ2);
        this.LJII = LIZ;
        DIJ dij2 = new DIJ();
        this.LJIIIIZZ = dij2;
        dij2.LJIIIIZZ(24.0f, 35.0f);
        dij2.LJIIJ(8.97f, 0.0f, 13.45f, -7.76f, 14.1f, -11.0f);
        dij2.LJIIJ(-0.65f, -3.24f, -5.13f, -11.0f, -14.1f, -11.0f);
        dij2.LJIIJ(-8.97f, 0.0f, -13.45f, 7.76f, -14.1f, 11.0f);
        dij2.LJIIJ(0.65f, 3.24f, 5.13f, 11.0f, 14.1f, 11.0f);
        dij2.LIZLLL();
        dij2.LJIILIIL(5.84f, -11.0f);
        dij2.LJIIIZ(5.84f, 5.84f, true, true, -11.68f, 0.0f);
        dij2.LJIIIZ(5.84f, 5.84f, false, true, 11.68f, 0.0f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
        canvas.drawPath(this.LJIIIIZZ.LIZ, this.LJII);
    }
}
