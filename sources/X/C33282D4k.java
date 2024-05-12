package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33282D4k extends AbstractC39455Fe7 {
    public C33282D4k() {
        this.LIZJ.LJIIIIZZ(6.0f, 11.0f);
        C32856Cuy.ff(this.LIZJ);
        C32856Cuy.LJLJLJ(this.LIZJ);
        C32856Cuy.nj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(15.83f);
        this.LIZJ.LJII(9.4f, 42.41f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 6.0f, 41.0f);
        C32856Cuy.LLZLL(this.LIZJ);
        this.LIZJ.LJIILIIL(4.0f, 25.17f);
        this.LIZJ.LJIIL(3.59f, -3.58f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 15.0f, 32.0f);
        C32856Cuy.LJIJJLI(this.LIZJ);
        C32856Cuy.i9(this.LIZJ);
        C32856Cuy.l6(this.LIZJ);
        this.LIZJ.LJIILL(25.17f);
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
