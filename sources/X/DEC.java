package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEC extends AbstractC39455Fe7 {
    public DEC() {
        this.LIZJ.LJIIIIZZ(17.25f, 12.46f);
        this.LIZJ.LJIILL(23.08f);
        this.LIZJ.LJII(36.61f, 24.0f);
        this.LIZJ.LJII(17.25f, 12.46f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-4.5f, -2.2f);
        this.LIZJ.LJIIIZ(3.25f, 3.25f, false, true, 4.91f, -2.8f);
        this.LIZJ.LJIIL(23.05f, 13.75f);
        this.LIZJ.LJIIIZ(3.25f, 3.25f, false, true, 0.0f, 5.58f);
        this.LIZJ.LJII(17.66f, 40.53f);
        this.LIZJ.LJIIIZ(3.25f, 3.25f, false, true, -4.91f, -2.79f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(10.26f);
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
