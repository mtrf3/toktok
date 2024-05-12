package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5T extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5T() {
        this.LIZJ.LJIIIIZZ(26.35f, 32.07f);
        this.LIZJ.LJIJ(29.8f);
        this.LIZJ.LJIIJJI(1.36f);
        this.LIZJ.LJIIJ(1.72f, 0.0f, 3.44f, 0.95f, 4.26f, 1.77f);
        this.LIZJ.LJIIJ(0.43f, 0.44f, 1.6f, 0.66f, 2.36f, 0.25f);
        this.LIZJ.LJIIJ(1.09f, -0.6f, 1.42f, -1.77f, 1.42f, -2.8f);
        this.LIZJ.LJIIJ(0.0f, -5.25f, -4.25f, -10.02f, -9.4f, -10.85f);
        this.LIZJ.LJIILL(-2.23f);
        this.LIZJ.LJIIJ(0.0f, -2.25f, -2.76f, -3.4f, -4.33f, -1.73f);
        this.LIZJ.LJIIIZ(967.53f, 967.53f, false, true, -7.67f, 7.88f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, 0.05f, 4.25f);
        this.LIZJ.LJIIJ(2.41f, 2.36f, 6.18f, 6.05f, 7.67f, 7.53f);
        this.LIZJ.LJIIIZ(2.51f, 2.51f, false, false, 4.28f, -1.79f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(23.5f, 21.46f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(1.33f);
        this.LIZJ.LJIIJ(4.26f, 0.0f, 6.61f, 3.04f, 7.43f, 6.27f);
        this.LIZJ.LJIIIZ(13.21f, 13.21f, false, false, -4.28f, -1.35f);
        this.LIZJ.LJIIIZ(20.62f, 20.62f, false, false, -4.55f, 0.12f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.43f, 0.49f);
        this.LIZJ.LJIILL(2.73f);
        this.LIZJ.LJIIL(-5.57f, -5.49f);
        this.LIZJ.LJIIL(5.57f, -6.2f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(2.93f);
        this.LIZJ.LJIIJ(0.0f, 0.27f, 0.22f, 0.5f, 0.5f, 0.5f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Z2(dij);
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
