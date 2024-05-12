package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33256D3k extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33256D3k() {
        this.LIZJ.LJIIIIZZ(6.0f, 40.04f);
        this.LIZJ.LJIJ(5.96f);
        this.LIZJ.LJIIJ(0.0f, -0.53f, 0.43f, -0.96f, 0.96f, -0.96f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(1.92f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.53f, 0.0f, 0.96f, 0.43f, 0.96f, 0.96f);
        this.LIZJ.LJIILL(32.16f);
        this.LIZJ.LJIIJJI(32.2f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.53f, 0.0f, 0.96f, 0.43f, 0.96f, 0.96f);
        C32856Cuy.N9(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, 0.53f, -0.43f, 0.96f, -0.96f, 0.96f);
        this.LIZJ.LJI(7.92f);
        this.LIZJ.LIZJ(1.92f, 1.92f, false, true, 6.0f, 40.04f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(15.06f, 29.18f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.37f, -1.34f);
        dij.LJIIL(5.46f, -9.98f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.38f, -0.39f);
        dij.LJIIL(9.02f, 5.21f);
        dij.LJIIL(6.7f, -11.33f);
        dij.LIZJ(1.0f, 1.0f, false, true, 38.6f, 11.0f);
        dij.LJIIL(1.73f, 1.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.36f, 1.38f);
        dij.LJIIL(-8.18f, 13.92f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.36f, 0.36f);
        dij.LJIIL(-9.05f, -5.22f);
        dij.LJIIL(-3.94f, 7.35f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.38f, 0.4f);
        dij.LJIIL(-1.73f, -1.0f);
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
