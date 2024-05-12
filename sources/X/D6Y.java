package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6Y extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D6Y() {
        this.LIZJ.LJIIIIZZ(23.39f, 44.49f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, true, false, 3.04f, 0.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-4.64f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, true, false, -3.04f, 0.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(4.64f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(47.28f, 59.19f);
        this.LIZJ.LJIIJ(-0.43f, 0.0f, -0.85f, -0.19f, -1.15f, -0.54f);
        this.LIZJ.LJIIIZ(13.25f, 13.25f, false, false, -20.26f, 0.0f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, false, true, -2.14f, 0.18f);
        this.LIZJ.LJIIIZ(1.53f, 1.53f, false, true, -0.17f, -2.15f);
        this.LIZJ.LJIIIZ(16.25f, 16.25f, false, true, 24.87f, 0.0f);
        this.LIZJ.LJIIIZ(1.53f, 1.53f, false, true, -1.15f, 2.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(47.09f, 46.01f);
        this.LIZJ.LJIIJ(-0.84f, 0.0f, -1.51f, -0.68f, -1.51f, -1.52f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-4.64f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.52f, 1.52f, true, true, 3.04f, 0.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(4.64f);
        this.LIZJ.LJIIJ(0.0f, 0.83f, -0.68f, 1.52f, -1.52f, 1.52f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(34.48f, 13.66f);
        dij.LIZJ(6.41f, 6.41f, false, true, 36.0f, 1.03f);
        dij.LJIIIZ(6.41f, 6.41f, false, true, 1.51f, 12.63f);
        dij.LJIJ(24.5f);
        dij.LJIIJJI(18.06f);
        dij.LJIIJ(4.65f, 0.0f, 8.43f, 3.8f, 8.43f, 8.48f);
        dij.LJIILL(29.5f);
        dij.LJIIIZ(8.47f, 8.47f, false, true, -8.43f, 8.49f);
        dij.LJI(16.43f);
        dij.LIZJ(8.47f, 8.47f, false, true, 8.0f, 62.49f);
        dij.LJIJ(32.98f);
        dij.LJIIIZ(8.47f, 8.47f, false, true, 8.43f, -8.48f);
        dij.LJIIJJI(18.05f);
        dij.LJIJ(13.66f);
        dij.LIZLLL();
        dij.LJIIIIZZ(36.0f, 4.08f);
        dij.LJIIIZ(3.36f, 3.36f, false, false, 0.0f, 6.72f);
        dij.LJIIIZ(3.35f, 3.35f, false, false, 0.0f, -6.72f);
        dij.LIZLLL();
        dij.LJIIIIZZ(16.43f, 27.55f);
        dij.LJIIIZ(5.42f, 5.42f, false, false, -5.4f, 5.43f);
        dij.LJIILL(29.5f);
        dij.LJIIJ(0.0f, 3.0f, 2.42f, 5.44f, 5.4f, 5.44f);
        dij.LJIIJJI(39.14f);
        dij.LJIIJ(2.98f, 0.0f, 5.4f, -2.43f, 5.4f, -5.43f);
        dij.LJIJ(32.98f);
        dij.LJIIJ(0.0f, -3.0f, -2.42f, -5.43f, -5.4f, -5.43f);
        dij.LJI(16.43f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
