package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33208D1o extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33208D1o() {
        this.LIZJ.LJIIIIZZ(7.05f, 27.62f);
        C32856Cuy.jm(this.LIZJ);
        this.LIZJ.LJIILL(6.87f);
        this.LIZJ.LJIIJ(0.0f, 0.99f, 0.8f, 2.35f, 1.78f, 2.35f);
        C32856Cuy.LJIJJ(this.LIZJ);
        this.LIZJ.LJIIJ(0.98f, 0.0f, 1.78f, -1.36f, 1.78f, -2.35f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-6.88f);
        C32856Cuy.jm(this.LIZJ);
        this.LIZJ.LJIILL(8.91f);
        this.LIZJ.LJIIJ(0.0f, 2.46f, -2.0f, 4.46f, -4.46f, 4.46f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(11.5f);
        this.LIZJ.LJIIJ(-2.46f, 0.0f, -4.46f, -2.0f, -4.46f, -4.46f);
        this.LIZJ.LJIILL(-8.92f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(24.6f, 32.36f);
        dij.LJIIL(11.7f, -13.8f);
        dij.LJIIIZ(0.8f, 0.8f, false, false, -0.6f, -1.3f);
        dij.LJIIJJI(-6.18f);
        dij.LJIJ(7.79f);
        dij.LJIIJ(0.0f, -0.44f, -0.36f, -0.79f, -0.8f, -0.79f);
        dij.LJIIJJI(-9.45f);
        dij.LJIIIZ(0.79f, 0.79f, false, false, -0.79f, 0.8f);
        dij.LJIILL(9.46f);
        dij.LJI(12.3f);
        dij.LJIIIZ(0.8f, 0.8f, false, false, -0.6f, 1.3f);
        dij.LJIIL(11.7f, 13.8f);
        dij.LJIIJ(0.31f, 0.37f, 0.89f, 0.37f, 1.2f, 0.0f);
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
