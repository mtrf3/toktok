package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cvt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32913Cvt extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32913Cvt() {
        this.LIZJ.LJIIIIZZ(23.86f, 15.0f);
        C32856Cuy.b9(this.LIZJ);
        this.LIZJ.LJIIJJI(-5.72f);
        this.LIZJ.LJIIJ(-0.63f, 0.0f, -1.14f, 0.45f, -1.14f, 1.0f);
        C32856Cuy.cd(this.LIZJ);
        C40084FoG.LJ(this.LIZJ, "p", 5.72f);
        this.LIZJ.LJIIIIZZ(29.92f, 21.0f);
        this.LIZJ.LJIIJ(0.6f, 0.0f, 1.08f, -0.45f, 1.08f, -1.0f);
        C32856Cuy.LJJLIL(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.55f, -0.48f, -1.0f, -1.08f, -1.0f);
        this.LIZJ.LJI(18.08f);
        this.LIZJ.LJIIJ(-0.6f, 0.0f, -1.08f, 0.45f, -1.08f, 1.0f);
        C32856Cuy.A1(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.55f, 0.48f, 1.0f, 1.08f, 1.0f);
        this.LIZJ.LJIIJJI(11.84f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.LLLJL(dij);
        C32856Cuy.pj(dij);
        dij.LJIILL(11.27f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 5.0f, 3.87f);
        dij.LJIJ(40.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        C32856Cuy.Ha(dij);
        dij.LJIJ(23.14f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 5.0f, -3.87f);
        C32856Cuy.f(dij);
        C32856Cuy.oj(dij);
        dij.LIZLLL();
        dij.LJIILIIL(22.13f, 17.0f);
        C32856Cuy.M6(dij);
        dij.LJIJ(8.0f);
        dij.LJI(13.0f);
        C32856Cuy.LJLILLLLZI(dij);
        dij.LJIIJJI(-0.13f);
        dij.LJII(24.0f, 26.2f);
        dij.LJII(35.13f, 21.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(22.3f, 29.82f);
        dij.LJII(8.0f, 23.14f);
        dij.LJIJ(40.0f);
        C32856Cuy.LJJIIJZLJL(dij);
        dij.LJIJ(23.14f);
        dij.LJIIL(-14.3f, 6.68f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -3.4f, 0.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
