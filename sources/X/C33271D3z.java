package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33271D3z extends AbstractC39455Fe7 {
    public C33271D3z() {
        this.LIZJ.LJIIIIZZ(5.0f, 13.0f);
        C32856Cuy.Gn(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(22.0f);
        p.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(10.0f);
        p2.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        C32856Cuy.LLZLLLL(this.LIZJ);
        this.LIZJ.LJIILIIL(21.0f, -1.0f);
        C32856Cuy.LJLLI(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(12.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(13.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        DIL.LIZ(this.LIZJ, "p", 26.0f);
        C32856Cuy.LJJIJIL(this.LIZJ);
        C32856Cuy.Y2(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(22.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        C32856Cuy.LJIILIIL(this.LIZJ);
        C32856Cuy.LLZLLIL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
