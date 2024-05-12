package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DB6 extends AbstractC39455Fe7 {
    public DB6() {
        this.LIZJ.LJIIIIZZ(40.0f, 9.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p.LJI(9.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-3.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(30.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.LJZ(this.LIZJ);
        this.LIZJ.LJIIIIZZ(1.95f, 21.13f);
        this.LIZJ.LIZJ(6.0f, 6.0f, false, true, 7.85f, 14.0f);
        this.LIZJ.LJIIJJI(32.3f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, 5.9f, 7.13f);
        this.LIZJ.LJIIL(-3.3f, 17.2f);
        this.LIZJ.LIZJ(7.0f, 7.0f, false, true, 35.86f, 44.0f);
        this.LIZJ.LJI(12.13f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, true, -6.87f, -5.68f);
        this.LIZJ.LJII(1.95f, 21.13f);
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
