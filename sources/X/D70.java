package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D70 extends AbstractC39455Fe7 {
    public D70() {
        C32856Cuy.LLLJL(this.LIZJ);
        C32856Cuy.Mk(this.LIZJ);
        C32856Cuy.Q5(this.LIZJ);
        C32856Cuy.Qi(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(22.0f);
        p.LJIIIZ(5.0f, 5.0f, false, false, 5.0f, 5.0f);
        p.LJIIJJI(22.0f);
        p.LJIIIZ(5.0f, 5.0f, false, false, 5.0f, -5.0f);
        C32856Cuy.y3(this.LIZJ);
        C32856Cuy.Y6(this.LIZJ);
        this.LIZJ.LJIILIIL(7.95f, 8.03f);
        this.LIZJ.LJIIL(10.0f, 6.5f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, true, 0.0f, 2.94f);
        this.LIZJ.LJIIL(-10.0f, 6.5f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, true, -2.7f, -1.47f);
        C32856Cuy.a1(this.LIZJ);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, true, 2.7f, -1.47f);
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
