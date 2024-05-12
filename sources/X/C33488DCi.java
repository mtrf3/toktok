package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33488DCi extends AbstractC39455Fe7 {
    public C33488DCi() {
        this.LIZJ.LJIIIIZZ(37.35f, 6.43f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.15f, 0.99f);
        C32856Cuy.F9(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(5.5f, 5.5f, true, true, -5.5f, -5.5f);
        p2.LJIIJJI(2.5f);
        this.LIZJ.LJIJ(13.32f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.57f, -0.5f);
        this.LIZJ.LJIIL(-16.0f, 2.4f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(0.5f, 0.5f, false, false, -0.43f, 0.5f);
        C32856Cuy.I9(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(5.5f, 5.5f, true, true, -5.5f, -5.5f);
        p4.LJIIJJI(2.5f);
        this.LIZJ.LJIJ(10.57f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, 0.85f, -0.99f);
        this.LIZJ.LJIIL(21.0f, -3.15f);
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
