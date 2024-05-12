package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33180D0m extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33180D0m() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(17.0f, 23.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(1.66f, 0.0f, 3.0f, -1.57f, 3.0f, -3.5f);
        this.LIZJ.LJIILLIIL(18.66f, 16.0f, 17.0f, 16.0f, true);
        C32856Cuy.wg(this.LIZJ);
        this.LIZJ.LJIIIIZZ(30.0f, 23.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(1.66f, 0.0f, 3.0f, -1.57f, 3.0f, -3.5f);
        this.LIZJ.LJIILLIIL(31.66f, 16.0f, 30.0f, 16.0f, true);
        C32856Cuy.wg(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(45.01f, 29.46f);
        dij.LJIIJ(0.27f, -0.26f, 0.45f, -0.6f, 0.53f, -0.96f);
        dij.LIZJ(22.0f, 22.0f, true, false, 28.5f, 45.54f);
        dij.LJIIJ(0.36f, -0.08f, 0.7f, -0.26f, 0.96f, -0.53f);
        dij.LJII(45.0f, 29.46f);
        dij.LIZLLL();
        dij.LJIILIIL(-5.2f, -0.46f);
        dij.LJII(29.0f, 39.82f);
        C32856Cuy.M9(dij);
        dij.LJIIIZ(10.0f, 10.0f, false, true, 10.0f, -10.0f);
        dij.LJIIJJI(0.82f);
        dij.LIZLLL();
        dij.LJIIIIZZ(25.0f, 41.97f);
        dij.LIZJ(18.0f, 18.0f, true, true, 41.97f, 25.0f);
        C32856Cuy.Q6(dij);
        dij.LJIIIZ(14.0f, 14.0f, false, false, -14.0f, 14.0f);
        dij.LJIILL(2.97f);
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
