package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cvh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32901Cvh extends AbstractC39455Fe7 {
    public C32901Cvh() {
        this.LIZJ.LJIIIIZZ(11.0f, 4.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p.LJIILL(2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p.LJIIJJI(26.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.K(this.LIZJ);
        C32856Cuy.LLLLIIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(14.0f, 28.0f);
        C32856Cuy.LJLJJL(this.LIZJ);
        C32856Cuy.LLZ(this.LIZJ);
        C32856Cuy.LJIILLIIL(this.LIZJ);
        C32856Cuy.zm(this.LIZJ);
        C32856Cuy.A9(this.LIZJ);
        this.LIZJ.LJIIL(4.99f, -13.3f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 37.1f, 12.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(10.9f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 9.0f, 14.7f);
        this.LIZJ.LJII(14.0f, 28.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-0.23f, -12.0f);
        this.LIZJ.LJIIJJI(20.46f);
        this.LIZJ.LJIIL(-3.0f, 8.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(16.77f);
        this.LIZJ.LJIIL(-3.0f, -8.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.0f, 28.0f);
        C32856Cuy.LJIILIIL(this.LIZJ);
        C32856Cuy.LJLJI(this.LIZJ);
        C32856Cuy.u6(this.LIZJ);
        DIK.LIZIZ(this.LIZJ, "p", 28.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
