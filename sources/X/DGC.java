package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DGC extends AbstractC39455Fe7 {
    public DGC() {
        this.LIZJ.LJIIIIZZ(21.26f, 7.0f);
        this.LIZJ.LJIIIZ(15.26f, 15.26f, true, false, 0.0f, 30.52f);
        this.LIZJ.LJIIIZ(15.26f, 15.26f, false, false, 0.0f, -30.52f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(2.0f, 22.26f);
        this.LIZJ.LIZJ(19.26f, 19.26f, true, true, 36.23f, 34.4f);
        this.LIZJ.LJIIL(9.65f, 9.66f);
        this.LIZJ.LJIIJ(0.3f, 0.29f, 0.3f, 0.76f, 0.0f, 1.06f);
        this.LIZJ.LJIIL(-1.76f, 1.76f);
        this.LIZJ.LJIIJ(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f);
        this.LIZJ.LJIIL(-9.66f, -9.65f);
        this.LIZJ.LIZJ(19.26f, 19.26f, false, true, 2.0f, 22.27f);
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
