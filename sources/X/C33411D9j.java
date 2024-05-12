package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33411D9j extends AbstractC39455Fe7 {
    public C33411D9j() {
        this.LIZJ.LJIILIIL(16.54f, 8.5f);
        this.LIZJ.LJIIL(-12.46f, 11.0f);
        C32856Cuy.xj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(6.0f, 6.0f, false, false, -3.97f, 1.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(26.17f, 24.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-4.38f, -4.38f);
        C32856Cuy.We(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJII(29.0f, 21.17f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(4.38f, -4.38f);
        C32856Cuy.oo(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJII(31.83f, 24.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(4.38f, 4.38f);
        C32856Cuy.De(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJII(29.0f, 26.83f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIL(-4.38f, 4.38f);
        C32856Cuy.Ji(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJII(26.17f, 24.0f);
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
