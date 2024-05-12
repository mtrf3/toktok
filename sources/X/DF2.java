package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DF2 extends AbstractC39455Fe7 {
    public DF2() {
        this.LIZJ.LJIILIIL(8.56f, 26.32f);
        this.LIZJ.LJIIL(23.12f, -24.9f);
        this.LIZJ.LJIIJ(0.35f, -0.37f, 0.97f, -0.04f, 0.85f, 0.47f);
        this.LIZJ.LJIIL(-4.37f, 17.49f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.48f, 0.62f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(10.07f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.73f, 1.68f);
        this.LIZJ.LJIIL(-23.12f, 24.9f);
        C32856Cuy.tl(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
