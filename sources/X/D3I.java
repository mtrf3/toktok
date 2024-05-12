package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3I extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;
    public final Paint LJIIIIZZ;
    public final DIJ LJIIIZ;

    public D3I() {
        this.LIZJ.LJIIIIZZ(43.0f, 24.43f);
        this.LIZJ.LJIIJ(0.0f, -1.35f, -0.12f, -2.64f, -0.35f, -3.89f);
        this.LIZJ.LJI(24.39f);
        this.LIZJ.LJIILL(7.35f);
        this.LIZJ.LJIIJJI(10.43f);
        this.LIZJ.LJIIIZ(8.73f, 8.73f, false, true, -3.87f, 5.74f);
        this.LIZJ.LJIILL(4.77f);
        this.LIZJ.LJIIJJI(6.27f);
        this.LIZJ.LJ(40.88f, 35.09f, 43.0f, 30.22f, 43.0f, 24.43f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -12417548);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.39f, 43.0f);
        dij.LJIIJ(5.23f, 0.0f, 9.62f, -1.7f, 12.83f, -4.6f);
        dij.LJIIL(-6.27f, -4.77f);
        dij.LJIIIZ(11.83f, 11.83f, false, true, -6.56f, 1.81f);
        dij.LJIIJ(-5.05f, 0.0f, -9.33f, -3.34f, -10.85f, -7.83f);
        dij.LJI(7.06f);
        dij.LJIILL(4.92f);
        dij.LIZJ(19.42f, 19.42f, false, false, 24.4f, 43.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-13326253);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(13.54f, 27.6f);
        dij2.LJIIIZ(11.21f, 11.21f, false, true, 0.0f, -7.21f);
        dij2.LJIILL(-4.92f);
        dij2.LJI(7.06f);
        dij2.LJIIIZ(18.68f, 18.68f, false, false, 0.0f, 17.06f);
        dij2.LJIIL(6.48f, -4.92f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-279548);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIIZZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIIZ = dij3;
        dij3.LJIIIIZZ(24.39f, 12.56f);
        dij3.LJIIJ(2.84f, 0.0f, 5.4f, 0.96f, 7.4f, 2.84f);
        dij3.LJIIL(5.57f, -5.45f);
        dij3.LIZJ(18.84f, 18.84f, false, false, 24.39f, 5.0f);
        dij3.LIZJ(19.42f, 19.42f, false, false, 7.06f, 15.47f);
        dij3.LJIIL(6.48f, 4.92f);
        dij3.LJIIJ(1.52f, -4.5f, 5.8f, -7.83f, 10.85f, -7.83f);
        dij3.LIZLLL();
        dij3.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ2.setStyle(Paint.Style.FILL);
        LIZ2.setColor(-1424587);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
        canvas.drawPath(this.LJIIIZ.LIZ, this.LJIIIIZZ);
    }
}
