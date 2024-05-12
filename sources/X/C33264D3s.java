package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33264D3s extends AbstractC39455Fe7 {
    public C33264D3s() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 8.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(6.0f, 6.0f, false, true, 6.0f, -6.0f);
        p2.LJIIJJI(22.0f);
        p2.LJIIIZ(6.0f, 6.0f, false, true, 6.0f, 6.0f);
        C32856Cuy.LJLLLLLL(this.LIZJ);
        C32856Cuy.Xg(this.LIZJ);
        C32856Cuy.o6(this.LIZJ);
        C32856Cuy.Wg(this.LIZJ);
        C32856Cuy.S9(this.LIZJ);
        this.LIZJ.LJIILIIL(6.0f, 18.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(2.5f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p4.LJIIJJI(9.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.LLLLZIL(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-9.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p5.LIZLLL();
        this.LIZJ.LJIILIIL(1.0f, 7.5f);
        C32856Cuy.Cn(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(37.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(15.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.LJJJLZIJ(this.LIZJ);
        C32856Cuy.ek(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
