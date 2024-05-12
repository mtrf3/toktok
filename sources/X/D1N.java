package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1N extends AbstractC39455Fe7 {
    public D1N() {
        C32856Cuy.LLJL(this.LIZJ);
        C32856Cuy.LIZLLL(this.LIZJ);
        C32856Cuy.mb(this.LIZJ);
        this.LIZJ.LJIILIIL(1.0f, 34.0f);
        C32856Cuy.n9(this.LIZJ);
        C32856Cuy.LJJIII(this.LIZJ);
        C32856Cuy.LJLL(this.LIZJ);
        C32856Cuy.Y6(this.LIZJ);
        this.LIZJ.LJIILIIL(25.0f, -27.0f);
        C32856Cuy.LLLLLZIL(this.LIZJ);
        C32856Cuy.g(this.LIZJ);
        C32856Cuy.LJJ(this.LIZJ);
        C32856Cuy.LJZ(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(23.0f, 35.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-4.0f);
        p2.LJIIJJI(-4.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p2.LJIILL(-2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p2.LJIIJJI(4.0f);
        p2.LJIILL(-4.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        C32856Cuy.v5(this.LIZJ);
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
