package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33138CzW extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33138CzW() {
        C32856Cuy.LLJ(this.LIZJ);
        this.LIZJ.LJIIIIZZ(26.0f, 42.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, true, true, -4.0f, 0.0f);
        p.LJIIIZ(2.0f, 2.0f, false, true, 4.0f, 0.0f);
        p.LIZLLL();
        p.LJIIIIZZ(42.0f, 26.0f);
        p.LJIIIZ(2.0f, 2.0f, true, true, 0.0f, -4.0f);
        p.LJIIIZ(2.0f, 2.0f, false, true, 0.0f, 4.0f);
        p.LIZLLL();
        p.LJIIIIZZ(6.0f, 26.0f);
        p.LJIIIZ(2.0f, 2.0f, true, true, 0.0f, -4.0f);
        p.LJIIIZ(2.0f, 2.0f, false, true, 0.0f, 4.0f);
        p.LIZLLL();
        p.LJIIIIZZ(16.35f, 5.52f);
        p.LJIIIZ(2.0f, 2.0f, true, true, 1.53f, 3.7f);
        p.LJIIIZ(2.0f, 2.0f, false, true, -1.53f, -3.7f);
        p.LIZLLL();
        this.LIZJ.LJIIIIZZ(31.65f, 42.48f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, true, true, -0.8f, -3.85f);
        this.LIZJ.LJIIL(2.04f, 2.04f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.24f, 1.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(23.17f, 30.95f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(3.68f, 3.68f);
        this.LIZJ.LJIIIZ(11.02f, 11.02f, false, true, -13.48f, -13.48f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(3.68f, 3.68f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, false, 6.12f, 6.12f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(9.37f, 17.15f);
        this.LIZJ.LJII(7.33f, 15.1f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, true, false, 2.04f, 2.04f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(17.77f, 14.94f);
        dij.LJIIIZ(11.0f, 11.0f, false, true, 15.3f, 15.3f);
        dij.LJIIL(9.64f, 9.64f);
        C32856Cuy.De(dij);
        dij.LJII(5.29f, 8.12f);
        C32856Cuy.We(dij);
        dij.LJIIL(9.65f, 9.65f);
        dij.LIZLLL();
        dij.LJIILIIL(2.9f, 2.9f);
        dij.LJIIL(9.49f, 9.49f);
        dij.LJIIIZ(7.0f, 7.0f, false, false, -9.49f, -9.49f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        C32856Cuy.s3(dij2);
        dij2.LJIIIIZZ(5.52f, 31.65f);
        dij2.LJIIIZ(2.0f, 2.0f, true, true, 3.7f, -1.53f);
        dij2.LJIIIZ(2.0f, 2.0f, false, true, -3.7f, 1.53f);
        dij2.LIZLLL();
        C32856Cuy.f6(dij2);
        dij2.LJIIIIZZ(32.74f, 8.14f);
        dij2.LJIIIZ(2.0f, 2.0f, true, true, -3.7f, -1.54f);
        dij2.LJIIIZ(2.0f, 2.0f, false, true, 3.7f, 1.54f);
        dij2.LIZLLL();
        C32856Cuy.c(dij2);
        dij2.LJIIIIZZ(39.86f, 32.74f);
        dij2.LJIIIZ(2.0f, 2.0f, true, true, 1.54f, -3.7f);
        dij2.LJIIIZ(2.0f, 2.0f, false, true, -1.54f, 3.7f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
