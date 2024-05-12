package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DG7 extends AbstractC39455Fe7 {
    public DG7() {
        this.LIZJ.LJIIIIZZ(10.67f, 26.15f);
        this.LIZJ.LJII(28.07f, 3.3f);
        this.LIZJ.LJIIJ(0.44f, -0.6f, 1.39f, -0.23f, 1.29f, 0.5f);
        this.LIZJ.LJIIL(-2.04f, 15.02f);
        this.LIZJ.LJIIL(9.29f, 1.63f);
        this.LIZJ.LJIIIZ(0.89f, 0.89f, false, true, 0.63f, 1.4f);
        this.LIZJ.LJII(19.84f, 44.7f);
        this.LIZJ.LJIIJ(-0.44f, 0.6f, -1.39f, 0.22f, -1.29f, -0.51f);
        this.LIZJ.LJIIL(2.04f, -15.02f);
        this.LIZJ.LJIIL(-9.29f, -1.62f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.89f, 0.89f, false, true, -0.63f, -1.4f);
        p.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
