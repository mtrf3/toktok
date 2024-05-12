package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEM extends AbstractC39455Fe7 {
    public DEM() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(10.32f, 7.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(27.36f);
        C32856Cuy.G7(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.02f, 25.0f);
        C32856Cuy.ie(this.LIZJ);
        this.LIZJ.LJIILIIL(16.04f, 0.0f);
        C32856Cuy.id(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
