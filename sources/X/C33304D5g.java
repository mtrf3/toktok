package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33304D5g extends AbstractC39455Fe7 {
    public C33304D5g() {
        this.LIZJ.LJIIIIZZ(16.2f, 16.0f);
        C32856Cuy.LLLLLLZZ(this.LIZJ);
        C32856Cuy.hl(this.LIZJ);
        C32856Cuy.E1(this.LIZJ);
        C32856Cuy.jl(this.LIZJ);
        C32856Cuy.A0(this.LIZJ);
        C32856Cuy.LJLIIL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, 3.0f);
        p.LJIIJJI(4.0f);
        p.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, -3.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-9.16f);
        this.LIZJ.LJIIL(18.13f, 8.77f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 2.87f, -1.8f);
        this.LIZJ.LJIJ(7.19f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -2.87f, -1.8f);
        this.LIZJ.LJII(16.2f, 16.0f);
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
