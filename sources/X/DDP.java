package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDP extends AbstractC39455Fe7 {
    public DDP() {
        this.LIZJ.LJIIIIZZ(38.74f, 36.01f);
        this.LIZJ.LJIIJ(4.27f, -4.28f, 6.76f, -8.74f, 6.76f, -13.93f);
        this.LIZJ.LJ(45.5f, 11.54f, 35.87f, 3.0f, 24.0f, 3.0f);
        this.LIZJ.LJIILLIIL(2.5f, 11.54f, 2.5f, 22.08f, true);
        this.LIZJ.LJIIJ(0.0f, 10.53f, 9.94f, 17.77f, 21.81f, 17.77f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(3.97f);
        this.LIZJ.LJIIJ(0.0f, 0.89f, 0.92f, 1.46f, 1.7f, 1.04f);
        this.LIZJ.LJIIJ(2.9f, -1.56f, 8.9f, -5.0f, 12.73f, -8.85f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-25.18f, -16.5f);
        this.LIZJ.LJIIJ(1.7f, 0.0f, 3.07f, 1.36f, 3.07f, 3.05f);
        this.LIZJ.LJIIIZ(3.07f, 3.07f, false, true, -6.14f, 0.0f);
        this.LIZJ.LJIIIZ(3.06f, 3.06f, false, true, 3.07f, -3.06f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(13.51f, 3.05f);
        this.LIZJ.LJIIIZ(3.06f, 3.06f, false, true, -6.14f, 0.0f);
        this.LIZJ.LIZJ(3.06f, 3.06f, false, true, 24.0f, 19.5f);
        this.LIZJ.LJIIJ(1.7f, 0.0f, 3.07f, 1.37f, 3.07f, 3.06f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(7.37f, -3.06f);
        this.LIZJ.LJIIIZ(3.06f, 3.06f, true, true, 0.0f, 6.12f);
        this.LIZJ.LJIIIZ(3.06f, 3.06f, false, true, -3.07f, -3.06f);
        this.LIZJ.LJIIIZ(3.06f, 3.06f, false, true, 3.07f, -3.06f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
