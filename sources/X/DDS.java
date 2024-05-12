package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDS extends AbstractC39455Fe7 {
    public DDS() {
        this.LIZJ.LJIIIIZZ(39.87f, 2.97f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.13f, 1.0f);
        this.LIZJ.LJIILL(29.78f);
        C32856Cuy.ho(this.LIZJ);
        this.LIZJ.LJIJ(11.87f);
        this.LIZJ.LJII(18.0f, 14.26f);
        this.LIZJ.LJIILL(22.49f);
        C32856Cuy.ho(this.LIZJ);
        this.LIZJ.LJIJ(7.31f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.87f, -0.99f);
        this.LIZJ.LJIIL(25.7f, -3.35f);
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
