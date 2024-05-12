package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9M extends AbstractC39455Fe7 {
    public D9M() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(32.0f, 33.0f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, 3.46f, 2.0f);
        C32856Cuy.vg(this.LIZJ);
        C32856Cuy.pc(this.LIZJ);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, true, 32.0f, 33.0f);
        this.LIZJ.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(9.0f, 13.0f);
        C32856Cuy.pc(this.LIZJ);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, 6.92f, 0.0f);
        C32856Cuy.vg(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(19.46f, 26.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(39.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.Oi(this.LIZJ);
        this.LIZJ.LJI(19.46f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, -6.92f, 0.0f);
        C32856Cuy.k7(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(2.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        this.LIZJ.LJIIJJI(3.54f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, 6.92f, 0.0f);
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
