package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDT extends AbstractC39455Fe7 {
    public DDT() {
        this.LIZJ.LJIIIIZZ(39.0f, 14.5f);
        this.LIZJ.LIZJ(8.47f, 8.47f, false, true, 30.56f, 6.0f);
        this.LIZJ.LJIIJJI(-5.62f);
        this.LIZJ.LJIILL(23.14f);
        this.LIZJ.LJIIJ(0.0f, 2.87f, -2.31f, 5.2f, -5.16f, 5.2f);
        this.LIZJ.LJIIIZ(5.18f, 5.18f, false, true, -5.16f, -5.2f);
        this.LIZJ.LJIIIZ(5.18f, 5.18f, false, true, 6.57f, -5.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-5.77f);
        this.LIZJ.LIZJ(10.77f, 10.77f, false, false, 9.0f, 29.14f);
        this.LIZJ.LJ(9.0f, 35.14f, 13.83f, 40.0f, 19.78f, 40.0f);
        this.LIZJ.LJIIJ(5.96f, 0.0f, 10.78f, -4.86f, 10.78f, -10.86f);
        this.LIZJ.LJIILL(-11.8f);
        this.LIZJ.LIZJ(13.93f, 13.93f, false, false, 39.0f, 20.16f);
        DIK.LIZIZ(this.LIZJ, "p", 14.5f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
