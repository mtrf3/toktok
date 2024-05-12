package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33245D2z extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;
    public final Paint LJIIIZ;
    public final DIJ LJIIJ;
    public final Paint LJIIJJI;
    public final DIJ LJIIL;

    public C33245D2z() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -526345);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(20.63f, 11.35f);
        dij.LJIIIZ(2.53f, 2.53f, true, false, 0.0f, 5.06f);
        dij.LJIIJJI(2.53f);
        dij.LJIILL(-2.53f);
        dij.LJIIJ(0.0f, -1.4f, -1.13f, -2.53f, -2.53f, -2.53f);
        dij.LIZLLL();
        dij.LJIILIIL(0.0f, 6.75f);
        dij.LJIIJJI(-6.75f);
        dij.LJIIIZ(2.53f, 2.53f, false, false, 0.0f, 5.06f);
        dij.LJIIJJI(6.75f);
        dij.LJIIIZ(2.53f, 2.53f, true, false, 0.0f, -5.06f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-13187600);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ2);
        this.LJII = LIZ;
        DIJ dij2 = new DIJ();
        this.LJIIIIZZ = dij2;
        dij2.LJIIIIZZ(36.65f, 20.63f);
        dij2.LJIIIZ(2.53f, 2.53f, false, false, -5.06f, 0.0f);
        dij2.LJIILL(2.53f);
        dij2.LJIIJJI(2.53f);
        dij2.LJIIJ(1.4f, 0.0f, 2.53f, -1.14f, 2.53f, -2.53f);
        dij2.LIZLLL();
        dij2.LJIILIIL(-6.75f, 0.0f);
        dij2.LJIILL(-6.75f);
        dij2.LJIIIZ(2.53f, 2.53f, false, false, -5.06f, 0.0f);
        dij2.LJIILL(6.75f);
        dij2.LJIIIZ(2.53f, 2.53f, true, false, 5.06f, 0.0f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-13715843);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIJ = dij3;
        dij3.LJIIIIZZ(27.37f, 36.65f);
        dij3.LJIIIZ(2.53f, 2.53f, true, false, 0.0f, -5.06f);
        dij3.LJIIJJI(-2.53f);
        dij3.LJIILL(2.53f);
        dij3.LJIIJ(0.0f, 1.4f, 1.13f, 2.53f, 2.53f, 2.53f);
        dij3.LIZLLL();
        dij3.LJIILIIL(0.0f, -6.75f);
        dij3.LJIIJJI(6.75f);
        dij3.LJIIIZ(2.53f, 2.53f, false, false, 0.0f, -5.06f);
        dij3.LJIIJJI(-6.75f);
        dij3.LJIIIZ(2.53f, 2.53f, false, false, 0.0f, 5.06f);
        dij3.LIZLLL();
        dij3.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ2.setStyle(Paint.Style.FILL);
        LIZ2.setColor(-1265106);
        Paint LIZ3 = C42193GhB.LIZ(this.LIZ, LIZ2);
        this.LJIIJJI = LIZ3;
        DIJ dij4 = new DIJ();
        this.LJIIL = dij4;
        dij4.LJIIIIZZ(11.35f, 27.37f);
        dij4.LJIIIZ(2.53f, 2.53f, false, false, 5.06f, 0.0f);
        dij4.LJIILL(-2.53f);
        dij4.LJIIJJI(-2.53f);
        dij4.LJIIIZ(2.53f, 2.53f, false, false, -2.53f, 2.53f);
        dij4.LIZLLL();
        dij4.LJIILIIL(6.75f, 0.0f);
        dij4.LJIILL(6.75f);
        dij4.LJIIIZ(2.53f, 2.53f, false, false, 5.06f, 0.0f);
        dij4.LJIILL(-6.75f);
        dij4.LJIIIZ(2.53f, 2.53f, false, false, -5.06f, 0.0f);
        dij4.LIZLLL();
        dij4.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ3.setStyle(Paint.Style.FILL);
        LIZ3.setColor(-2089382);
        this.LIZ.add(LIZ3);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
        canvas.drawPath(this.LJIIIIZZ.LIZ, this.LJII);
        canvas.drawPath(this.LJIIJ.LIZ, this.LJIIIZ);
        canvas.drawPath(this.LJIIL.LIZ, this.LJIIJJI);
    }
}
