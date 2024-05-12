package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33162Czu extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33162Czu() {
        this.LIZJ.LJIILIIL(23.41f, 17.17f);
        this.LIZJ.LJIIL(-0.1f, 0.36f);
        this.LIZJ.LJIIL(-0.06f, 0.21f);
        this.LIZJ.LJIIL(-0.23f, 0.83f);
        this.LIZJ.LJIIIZ(10.08f, 10.08f, false, true, -6.43f, 6.52f);
        this.LIZJ.LJIIL(-0.82f, 0.24f);
        this.LIZJ.LJIIL(-0.24f, 0.07f);
        this.LIZJ.LJIIIZ(0.64f, 0.64f, false, false, 0.0f, 1.2f);
        this.LIZJ.LJIIL(0.24f, 0.07f);
        this.LIZJ.LJIIL(0.82f, 0.24f);
        this.LIZJ.LJIIIZ(10.08f, 10.08f, false, true, 6.66f, 7.35f);
        this.LIZJ.LJIIL(0.06f, 0.2f);
        this.LIZJ.LJIIL(0.1f, 0.37f);
        this.LIZJ.LJIIJ(0.23f, 0.5f, 0.95f, 0.5f, 1.18f, 0.0f);
        this.LIZJ.LJIIL(0.1f, -0.36f);
        this.LIZJ.LJIIL(0.06f, -0.21f);
        this.LIZJ.LJIIL(0.23f, -0.83f);
        this.LIZJ.LJIIIZ(10.08f, 10.08f, false, true, 7.25f, -6.76f);
        this.LIZJ.LJIIL(0.24f, -0.08f);
        this.LIZJ.LJIIIZ(0.64f, 0.64f, false, false, 0.0f, -1.19f);
        this.LIZJ.LJIIL(-0.24f, -0.07f);
        this.LIZJ.LJIIL(-0.82f, -0.24f);
        this.LIZJ.LJIIIZ(10.08f, 10.08f, false, true, -6.66f, -7.35f);
        this.LIZJ.LJIIL(-0.06f, -0.2f);
        this.LIZJ.LJIIL(-0.1f, -0.37f);
        this.LIZJ.LJIIIZ(0.64f, 0.64f, false, false, -1.18f, 0.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(17.11f, 6.6f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, -2.93f, 2.36f);
        dij.LJIIL(-0.5f, 2.26f);
        dij.LJI(8.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, 6.0f);
        dij.LJIJ(35.9f);
        C32856Cuy.dh(dij);
        C32856Cuy.LJJIIJZLJL(dij);
        C32856Cuy.ch(dij);
        dij.LJIJ(17.22f);
        C32856Cuy.ah(dij);
        dij.LJIIJJI(-5.68f);
        dij.LJIIL(-0.5f, -2.26f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, -2.93f, -2.35f);
        dij.LJI(17.11f);
        dij.LIZLLL();
        dij.LJIILIIL(0.3f, 6.28f);
        dij.LJIIL(0.5f, -2.27f);
        dij.LJI(30.1f);
        dij.LJIIL(0.5f, 2.27f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, 2.93f, 2.34f);
        dij.LJI(40.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        dij.LJIJ(35.9f);
        C32856Cuy.vm(dij);
        dij.LJI(8.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        dij.LJIJ(17.22f);
        C32856Cuy.x(dij);
        dij.LJIIJJI(6.48f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, 2.93f, -2.34f);
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
