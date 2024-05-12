package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DG1 extends AbstractC39455Fe7 {
    public DG1() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 11.5f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, true, false, 0.0f, 11.0f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, false, 0.0f, -11.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(15.5f, 17.0f);
        this.LIZJ.LJIIIZ(8.5f, 8.5f, true, true, 17.0f, 0.0f);
        this.LIZJ.LJIIIZ(8.5f, 8.5f, false, true, -17.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.0f, 30.5f);
        this.LIZJ.LJIIIZ(10.5f, 10.5f, false, false, -10.14f, 7.77f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(-0.15f, 0.53f, -0.66f, 0.9f, -1.2f, 0.81f);
        this.LIZJ.LJIIL(-0.99f, -0.16f);
        this.LIZJ.LJIIIZ(0.95f, 0.95f, false, true, -0.78f, -1.15f);
        this.LIZJ.LJIIIZ(13.5f, 13.5f, false, true, 26.22f, 0.0f);
        this.LIZJ.LJIIIZ(0.95f, 0.95f, false, true, -0.78f, 1.15f);
        this.LIZJ.LJIIL(-0.99f, 0.16f);
        this.LIZJ.LJIIJ(-0.54f, 0.1f, -1.05f, -0.28f, -1.2f, -0.8f);
        this.LIZJ.LIZJ(10.5f, 10.5f, false, false, 24.0f, 30.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
