package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33262D3q extends AbstractC39455Fe7 {
    public C33262D3q() {
        this.LIZJ.LJIIIIZZ(29.56f, 4.2f);
        C32856Cuy.rk(this.LIZJ);
        this.LIZJ.LJIIL(12.8f, 12.78f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 42.0f, 21.25f);
        C32856Cuy.H(this.LIZJ);
        C32856Cuy.zn(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(30.96f);
        this.LIZJ.LJIIL(-8.52f, -8.52f);
        C32856Cuy.uk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(2.12f, -2.12f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.44f, 43.81f);
        C32856Cuy.nk(this.LIZJ);
        this.LIZJ.LJII(4.23f, 31.02f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 6.0f, 26.75f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(37.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p4.LJIILL(3.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p4.LJI(12.04f);
        this.LIZJ.LJIIL(8.52f, 8.53f);
        C32856Cuy.xk(this.LIZJ);
        C32856Cuy.Ja(this.LIZJ);
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
