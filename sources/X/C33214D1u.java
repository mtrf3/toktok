package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33214D1u extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33214D1u() {
        this.LIZJ.LJIIIIZZ(32.15f, 21.47f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.38f, -0.32f);
        this.LIZJ.LJIIJ(3.4f, 2.14f, 9.05f, 8.52f, 9.47f, 17.3f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -2.0f, 0.1f);
        this.LIZJ.LJIIJ(-0.38f, -8.02f, -5.59f, -13.84f, -8.53f, -15.7f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, -0.32f, -1.38f);
        p2.LIZLLL();
        this.LIZJ.LJIIIIZZ(15.85f, 21.47f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.38f, -0.32f);
        this.LIZJ.LJIIJ(-3.4f, 2.14f, -9.05f, 8.52f, -9.47f, 17.3f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 2.0f, 0.1f);
        this.LIZJ.LJIIJ(0.38f, -8.02f, 5.59f, -13.84f, 8.53f, -15.7f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.32f, -1.38f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.wd(dij);
        dij.LJIIJ(0.0f, 0.71f, 0.03f, 1.41f, 0.06f, 2.13f);
        dij.LJIIJ(0.06f, 1.46f, 0.13f, 2.98f, -0.05f, 4.77f);
        dij.LJIIIZ(9.39f, 9.39f, false, true, -1.6f, 4.08f);
        C32856Cuy.bm(dij);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.1f, -0.7f);
        dij.LJIIIZ(26.0f, 26.0f, false, true, -1.49f, -1.24f);
        dij.LJIIJ(-0.62f, -0.57f, -1.3f, -1.25f, -1.68f, -1.83f);
        C32856Cuy.rc(dij);
        dij.LJIIIZ(5.57f, 5.57f, false, false, 0.84f, -4.74f);
        dij.LJIIJ(-0.39f, -1.44f, -1.3f, -2.78f, -2.24f, -4.02f);
        C32856Cuy.i8(dij);
        dij.LJIIIZ(9.39f, 9.39f, false, true, -1.6f, -4.07f);
        C32856Cuy.Q2(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        C32856Cuy.Yd(dij2);
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
