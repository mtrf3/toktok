package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cw8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32928Cw8 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32928Cw8() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(12.0f, 4.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(4.4f);
        C32856Cuy.s8(this.LIZJ);
        C32856Cuy.l1(this.LIZJ);
        C32856Cuy.zl(this.LIZJ);
        C32856Cuy.n6(this.LIZJ);
        this.LIZJ.LIZJ(3.7f, 3.7f, false, false, 8.3f, 12.0f);
        C32856Cuy.LJLLI(this.LIZJ);
        this.LIZJ.LJIIIZ(3.7f, 3.7f, false, false, 3.7f, 3.7f);
        C32856Cuy.LJIL(this.LIZJ);
        this.LIZJ.LJIIIZ(3.7f, 3.7f, false, false, 3.7f, -3.7f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-4.4f);
        C32856Cuy.LLI(this.LIZJ);
        C32856Cuy.e0(this.LIZJ);
        C32856Cuy.s8(this.LIZJ);
        C32856Cuy.J9(this.LIZJ);
        C32856Cuy.Be(this.LIZJ);
        C32856Cuy.n6(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(8.0f, 8.0f, false, true, -8.0f, -8.0f);
        C32856Cuy.j9(this.LIZJ);
        C32856Cuy.Ce(this.LIZJ);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(27.54f, 5.77f);
        dij.LJIIJ(0.0f, -0.56f, 0.0f, -0.84f, 0.1f, -1.05f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.44f, -0.44f);
        dij.LJIIJ(0.22f, -0.1f, 0.5f, -0.1f, 1.06f, -0.1f);
        dij.LJIIJJI(12.54f);
        dij.LJIIJ(1.18f, 0.0f, 2.15f, 0.95f, 2.15f, 2.14f);
        dij.LJIILL(12.54f);
        dij.LJIIJ(0.0f, 0.56f, 0.0f, 0.84f, -0.11f, 1.06f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.44f, 0.44f);
        dij.LJIIJ(-0.21f, 0.1f, -0.5f, 0.1f, -1.05f, 0.1f);
        dij.LJIIJJI(-1.1f);
        dij.LJIIJ(-0.56f, 0.0f, -0.84f, 0.0f, -1.06f, -0.1f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.43f, -0.44f);
        dij.LJIIJ(-0.11f, -0.22f, -0.11f, -0.5f, -0.11f, -1.06f);
        dij.LJIILL(-7.35f);
        dij.LJII(26.65f, 24.4f);
        dij.LJIIJ(-0.4f, 0.4f, -0.6f, 0.6f, -0.82f, 0.67f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.62f, 0.0f);
        dij.LJIIJ(-0.23f, -0.08f, -0.43f, -0.28f, -0.82f, -0.67f);
        dij.LJIIL(-0.78f, -0.78f);
        dij.LJIIJ(-0.4f, -0.4f, -0.6f, -0.6f, -0.67f, -0.82f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, -0.62f);
        dij.LJIIJ(0.08f, -0.23f, 0.27f, -0.43f, 0.67f, -0.82f);
        dij.LJII(36.5f, 8.47f);
        dij.LJIIJJI(-7.35f);
        dij.LJIIJ(-0.56f, 0.0f, -0.84f, 0.0f, -1.06f, -0.1f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.44f, -0.44f);
        dij.LJIIJ(-0.1f, -0.22f, -0.1f, -0.5f, -0.1f, -1.06f);
        C32856Cuy.LJJJJZ(dij);
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
