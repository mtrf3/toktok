package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DE5 extends AbstractC39455Fe7 {
    public DE5() {
        C32856Cuy.q7(this.LIZJ);
        this.LIZJ.LJIIJ(10.96f, 0.0f, 20.5f, 7.47f, 20.5f, 17.44f);
        this.LIZJ.LJIIJ(0.0f, 5.85f, -2.93f, 10.69f, -6.47f, 14.37f);
        C32856Cuy.xi(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJ(3.5f, 11.47f, 13.04f, 4.0f, 24.0f, 4.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(5.0f, 13.12f);
        this.LIZJ.LJIIL(-5.3f, 5.3f);
        this.LIZJ.LJIIJ(-0.4f, 0.4f, -1.05f, 0.4f, -1.45f, 0.0f);
        this.LIZJ.LJIIL(-2.74f, -2.74f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(-0.4f, -0.4f, -1.05f, -0.4f, -1.45f, 0.0f);
        this.LIZJ.LJIIL(-1.45f, 1.46f);
        this.LIZJ.LJIIJ(-0.4f, 0.4f, -0.4f, 1.05f, 0.0f, 1.45f);
        this.LIZJ.LJIIL(5.64f, 5.64f);
        this.LIZJ.LJIIJ(0.4f, 0.4f, 1.05f, 0.4f, 1.45f, 0.0f);
        this.LIZJ.LJIIL(8.2f, -8.2f);
        this.LIZJ.LJIIJ(0.4f, -0.4f, 0.4f, -1.06f, 0.0f, -1.46f);
        this.LIZJ.LJIIL(-1.45f, -1.45f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(-0.4f, -0.4f, -1.05f, -0.4f, -1.45f, 0.0f);
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
