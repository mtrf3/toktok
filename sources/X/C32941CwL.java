package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32941CwL extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32941CwL() {
        this.LIZJ.LJIIIIZZ(34.6f, 40.75f);
        C32856Cuy.Z4(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(0.8f);
        C32856Cuy.LLJJI(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(35.9f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(4.85f);
        C32856Cuy.LLJJI(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-0.8f);
        C32856Cuy.LLJJIJI(this.LIZJ);
        this.LIZJ.LJI(36.4f);
        this.LIZJ.LJIILL(-4.85f);
        C32856Cuy.LLJJIJI(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-0.8f);
        C32856Cuy.z5(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(4.85f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-4.85f);
        C32856Cuy.z5(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(0.8f);
        C32856Cuy.Z4(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(4.85f);
        C78269Unh.LIZJ(this.LIZJ, "p", 4.85f);
        this.LIZJ.LJIIIIZZ(28.34f, 27.94f);
        this.LIZJ.LJIIJ(-0.26f, 0.36f, -0.57f, 0.68f, -0.92f, 0.96f);
        this.LIZJ.LJIIIZ(6.43f, 6.43f, false, true, -4.17f, 1.35f);
        this.LIZJ.LJIIIZ(6.43f, 6.43f, false, true, -4.14f, -1.31f);
        this.LIZJ.LJIIIZ(4.89f, 4.89f, false, true, -1.14f, -1.34f);
        this.LIZJ.LJIIL(-0.1f, -0.18f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.8f, -0.88f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIILL(0.05f);
        this.LIZJ.LJIIL(0.11f, 0.18f);
        this.LIZJ.LJIIJ(0.16f, 0.22f, 0.35f, 0.41f, 0.56f, 0.58f);
        this.LIZJ.LJIIIZ(4.5f, 4.5f, false, false, 2.91f, 0.9f);
        this.LIZJ.LJIIIZ(4.5f, 4.5f, false, false, 2.95f, -0.9f);
        this.LIZJ.LJIIJ(0.21f, -0.17f, 0.4f, -0.36f, 0.56f, -0.58f);
        this.LIZJ.LJIIL(0.09f, -0.13f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIILL(-0.08f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.81f, 0.86f);
        this.LIZJ.LJIIL(-0.1f, 0.18f);
        this.LIZJ.LJIIL(-0.22f, 0.34f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.0f, 21.25f);
        C32856Cuy.n7(this.LIZJ);
        this.LIZJ.LJIIIIZZ(28.5f, 21.25f);
        C32856Cuy.n7(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(10.25f, 8.25f);
        dij.LJIIJJI(26.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        dij.LJIILL(11.5f);
        dij.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        C32856Cuy.bc(dij);
        dij.LJIILL(-11.5f);
        C32856Cuy.p4(dij);
        dij.LJIIJJI(11.5f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        dij.LJIILL(-1.0f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, -0.5f);
        dij.LJIIJJI(-11.5f);
        C32856Cuy.um(dij);
        dij.LJIILL(-26.0f);
        C32856Cuy.ed(dij);
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
