package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D64 extends AbstractC39455Fe7 {
    public D64() {
        this.LIZJ.LJIIIIZZ(10.5f, 11.0f);
        this.LIZJ.LIZJ(4.5f, 4.5f, false, true, 15.0f, 6.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(18.0f);
        C32856Cuy.d9(this.LIZJ);
        C32856Cuy.LJLLL(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.5f, 1.5f, false, true, -2.38f, 1.21f);
        this.LIZJ.LJII(24.0f, 32.14f);
        this.LIZJ.LJII(12.88f, 40.2f);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, true, 10.5f, 39.0f);
        C32856Cuy.LLZLL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(15.0f, 9.5f);
        C32856Cuy.Xj(this.LIZJ);
        this.LIZJ.LJIILL(25.06f);
        this.LIZJ.LJIIL(9.62f, -7.0f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, 1.76f, 0.0f);
        this.LIZJ.LJIIL(9.62f, 7.0f);
        C32856Cuy.i9(this.LIZJ);
        C32856Cuy.m8(this.LIZJ);
        C32856Cuy.LLLLILI(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
