package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33254D3i extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33254D3i() {
        this.LIZJ.LJIIIIZZ(24.0f, 2.4f);
        this.LIZJ.LJIIIZ(8.6f, 8.6f, false, false, -8.6f, 8.6f);
        C32856Cuy.LJLIL(this.LIZJ);
        this.LIZJ.LJIIIZ(8.6f, 8.6f, false, false, 17.2f, 0.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-0.15f);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, true, true, -0.97f, -15.83f);
        this.LIZJ.LIZJ(8.6f, 8.6f, false, false, 24.0f, 2.4f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.q6(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(35.82f, 0.92f);
        dij2.LJIIIZ(0.58f, 0.58f, false, true, 0.6f, -0.46f);
        dij2.LJIIL(5.87f, 0.4f);
        dij2.LJIIJ(0.23f, 0.01f, 0.4f, 0.23f, 0.35f, 0.46f);
        dij2.LJIIL(-0.6f, 2.85f);
        dij2.LJIIIZ(0.58f, 0.58f, false, true, -0.61f, 0.46f);
        dij2.LJIIL(-3.06f, -0.2f);
        dij2.LJIIIZ(0.39f, 0.39f, false, false, -0.4f, 0.3f);
        dij2.LJIIL(-2.35f, 11.03f);
        dij2.LJIIIZ(4.67f, 4.67f, true, true, -3.65f, -5.32f);
        dij2.LJIIL(0.46f, 0.1f);
        dij2.LJIIJ(0.41f, 0.08f, 0.86f, 0.17f, 1.28f, 0.3f);
        dij2.LJIIL(1.54f, -7.28f);
        dij2.LJIIL(0.57f, -2.64f);
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
