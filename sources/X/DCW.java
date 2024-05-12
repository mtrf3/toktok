package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCW extends AbstractC39455Fe7 {
    public DCW() {
        C32856Cuy.jo(this.LIZJ);
        this.LIZJ.LJIILIIL(29.3f, 8.56f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.38f, -0.25f);
        this.LIZJ.LJIIL(1.84f, -2.62f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.25f, -1.4f);
        this.LIZJ.LJIIL(-7.64f, -5.34f);
        C32856Cuy.LLLIL(this.LIZJ);
        C32856Cuy.tb(this.LIZJ);
        C32856Cuy.Cn(this.LIZJ);
        this.LIZJ.LJIILL(11.32f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 0.85f, 1.63f);
        this.LIZJ.LJIIL(9.44f, 6.6f);
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
