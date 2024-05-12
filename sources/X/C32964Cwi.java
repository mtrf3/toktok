package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32964Cwi extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;
    public final Paint LJIIIIZZ;
    public final DIJ LJIIIZ;

    public C32964Cwi() {
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16777216);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.jb(dij);
        dij.LJI(9.81f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        dij.LJIILL(6.93f);
        dij.LJIIJJI(5.96f);
        C32856Cuy.LLILLIZIL(dij);
        dij.LJIIJ(0.0f, -0.4f, 0.28f, -0.69f, 0.6f, -0.72f);
        dij.LJIIIZ(0.7f, 0.7f, false, true, 0.45f, 0.1f);
        C32856Cuy.ve(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        C32856Cuy.N3(dij2);
        dij2.LJIIL(0.03f, -0.02f);
        dij2.LJIIJJI(0.05f);
        dij2.LJIIL(0.02f, -0.02f);
        dij2.LJIIL(0.05f, -0.02f);
        C32856Cuy.Kh(dij2);
        dij2.LJIIJ(0.02f, 0.0f, 0.02f, -0.01f, 0.03f, -0.02f);
        dij2.LJIIL(0.01f, -0.01f);
        dij2.LJIIL(0.03f, -0.03f);
        dij2.LJIIL(0.04f, -0.02f);
        dij2.LJIIL(0.05f, -0.03f);
        dij2.LJIIL(0.05f, -0.01f);
        C32856Cuy.re(dij2);
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-14289682);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIIZZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIIZ = dij3;
        dij3.LJIILIIL(39.78f, 24.0f);
        dij3.LJIIL(-1.26f, -0.93f);
        dij3.LJIIL(0.03f, 0.04f);
        dij3.LJIIL(0.02f, 0.02f);
        dij3.LJIIL(0.01f, 0.01f);
        dij3.LJIIIZ(0.5f, 0.5f, false, true, 0.04f, 0.05f);
        dij3.LJIIJ(0.0f, 0.01f, 0.0f, 0.02f, 0.02f, 0.03f);
        C32856Cuy.j1(dij3);
        dij3.LJIIL(0.03f, 0.05f);
        C32856Cuy.j1(dij3);
        dij3.LJIIL(0.02f, 0.05f);
        dij3.LJIIL(0.01f, 0.03f);
        dij3.LJIIL(0.01f, 0.06f);
        C32856Cuy.k1(dij3);
        dij3.LJIIL(0.01f, 0.11f);
        dij3.LJIILL(7.63f);
        dij3.LJIIJ(0.0f, 0.3f, -0.35f, 0.48f, -0.6f, 0.3f);
        dij3.LJIIL(0.83f, 0.62f);
        dij3.LJIIIZ(0.64f, 0.64f, false, false, 1.03f, -0.52f);
        dij3.LJIILL(-7.1f);
        dij3.LJIIJ(0.0f, -0.32f, -0.13f, -0.44f, -0.2f, -0.52f);
        dij3.LIZLLL();
        dij3.LJIIIIZZ(28.28f, 24.3f);
        dij3.LJIIIZ(0.7f, 0.7f, false, false, -0.44f, -0.1f);
        dij3.LJIIIZ(0.7f, 0.7f, false, false, -0.61f, 0.72f);
        dij3.LJIILL(6.3f);
        dij3.LJIIJ(0.0f, 0.3f, -0.35f, 0.48f, -0.6f, 0.3f);
        dij3.LJIIL(0.83f, 0.62f);
        dij3.LJIIIZ(0.64f, 0.64f, false, false, 1.03f, -0.52f);
        dij3.LJIILL(-5.77f);
        dij3.LJIIJ(0.0f, -0.4f, 0.28f, -0.68f, 0.6f, -0.72f);
        dij3.LJIIIZ(0.72f, 0.72f, false, true, 0.44f, 0.11f);
        C32856Cuy.Z(dij3);
        dij3.LJIIL(-1.26f, -0.93f);
        dij3.LIZLLL();
        C32856Cuy.k(dij3);
        dij3.LJIIZILJ(Path.FillType.WINDING);
        LIZ2.setStyle(Paint.Style.FILL);
        LIZ2.setColor(-119723);
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
