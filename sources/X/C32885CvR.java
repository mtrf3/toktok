package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32885CvR extends AbstractC39455Fe7 {
    public C32885CvR() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(16.0f, 15.0f);
        C32856Cuy.LJIIZILJ(this.LIZJ);
        C32856Cuy.LJLJJLL(this.LIZJ);
        C32856Cuy.s6(this.LIZJ);
        DIK.LIZIZ(this.LIZJ, "p", 15.0f);
        C32856Cuy.LJJIJIL(this.LIZJ);
        this.LIZJ.LJIILL(17.45f);
        this.LIZJ.LJIIJ(0.0f, 0.23f, 0.0f, 0.52f, 0.02f, 0.77f);
        this.LIZJ.LJIIJ(0.02f, 0.29f, 0.08f, 0.7f, 0.3f, 1.14f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, 2.46f, 1.62f);
        this.LIZJ.LJIIJ(0.25f, 0.02f, 0.54f, 0.02f, 0.77f, 0.02f);
        C32856Cuy.K6(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(6.4f);
        C32856Cuy.r3(this.LIZJ);
        C32856Cuy.J9(this.LIZJ);
        C32856Cuy.m0(this.LIZJ);
        C32856Cuy.U7(this.LIZJ);
        C32856Cuy.O6(this.LIZJ);
        this.LIZJ.LJIJ(14.55f);
        this.LIZJ.LJIIJ(0.0f, -0.23f, 0.0f, -0.52f, -0.02f, -0.77f);
        this.LIZJ.LJIIJ(-0.02f, -0.29f, -0.08f, -0.7f, -0.3f, -1.14f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -2.46f, -1.62f);
        this.LIZJ.LJIIIZ(9.84f, 9.84f, false, false, -0.77f, -0.02f);
        C32856Cuy.s6(this.LIZJ);
        C32856Cuy.N(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, -0.45f, -0.44f);
        this.LIZJ.LJ(15.24f, 4.0f, 14.96f, 4.0f, 14.4f, 4.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-0.8f);
        p4.LJIIJ(-0.56f, 0.0f, -0.84f, 0.0f, -1.05f, 0.1f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, -0.44f, 0.45f);
        this.LIZJ.LJ(12.0f, 4.76f, 12.0f, 5.04f, 12.0f, 5.6f);
        C32856Cuy.i9(this.LIZJ);
        C32856Cuy.hh(this.LIZJ);
        this.LIZJ.LJ(4.0f, 11.76f, 4.0f, 12.04f, 4.0f, 12.6f);
        C32856Cuy.fh(this.LIZJ);
        C32856Cuy.LLLLIILL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
