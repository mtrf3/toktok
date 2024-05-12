package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cz6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33112Cz6 extends AbstractC39455Fe7 {
    public C33112Cz6() {
        this.LIZJ.LJIIIIZZ(8.8f, 38.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(30.4f);
        C32856Cuy.h9(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(8.8f);
        C78269Unh.LIZJ(this.LIZJ, "p", 28.0f);
        C32856Cuy.J0(this.LIZJ);
        C32856Cuy.w7(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIIZZ(14.0f, 14.0f);
        C32856Cuy.T3(this.LIZJ);
        C32856Cuy.LLLLIL(this.LIZJ);
        C32856Cuy.zc(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(9.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(1.6f);
        C32856Cuy.yn(this.LIZJ);
        C32856Cuy.u4(this.LIZJ);
        C32856Cuy.u9(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(23.08f, 5.07f);
        C32856Cuy.sm(this.LIZJ);
        this.LIZJ.LJII(23.0f, 28.76f);
        C32856Cuy.Lj(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
