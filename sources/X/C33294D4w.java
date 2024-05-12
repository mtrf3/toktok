package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33294D4w extends AbstractC39455Fe7 {
    public C33294D4w() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(2.0f, 13.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(22.0f);
        p2.LJIIJ(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        C32856Cuy.LJJIJIIJI(this.LIZJ);
        C32856Cuy.zm(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(13.0f);
        p3.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        C32856Cuy.LLLLLLLLLL(this.LIZJ);
        C32856Cuy.tc(this.LIZJ);
        this.LIZJ.LJIILIIL(4.0f, 20.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(15.0f);
        p4.LJIIJJI(7.0f);
        C32856Cuy.LJJLIIIIJ(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        p5.LJIIJJI(3.0f);
        p5.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        p5.LJIJ(15.0f);
        p5.LJIIJJI(5.0f);
        p5.LJIILL(5.5f);
        p5.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        p5.LJIIJJI(3.0f);
        p5.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        p5.LJIJ(15.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(5.0f);
        p6.LJIILL(5.5f);
        p6.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        p6.LJIIJJI(3.0f);
        p6.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        p6.LJIJ(15.0f);
        C32856Cuy.F0(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(18.0f);
        p7.LJI(6.0f);
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
