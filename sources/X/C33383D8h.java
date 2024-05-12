package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33383D8h extends AbstractC39455Fe7 {
    public C33383D8h() {
        C32856Cuy.Da(this.LIZJ);
        this.LIZJ.LJIIIIZZ(23.0f, 13.0f);
        C32856Cuy.gd(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(20.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p2.LJIJ(14.0f);
        C32856Cuy.Wl(this.LIZJ);
        this.LIZJ.LJIILIIL(-9.0f, 6.0f);
        C32856Cuy.gd(this.LIZJ);
        C32856Cuy.LJLJI(this.LIZJ);
        C32856Cuy.Ob(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(20.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(17.0f, 8.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p4.LJIIJJI(2.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p4.LJIILL(7.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p5.LJIIJJI(-2.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p5.LJIILL(-7.0f);
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
