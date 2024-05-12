package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33372D7w extends AbstractC39455Fe7 {
    public C33372D7w() {
        this.LIZJ.LJIIIIZZ(24.0f, 6.5f);
        C32856Cuy.Kf(this.LIZJ);
        this.LIZJ.LJIILL(11.38f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, true, false, 14.0f, 0.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(13.5f);
        C32856Cuy.Jf(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(13.5f, 21.38f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.0f, -0.49f, -0.4f, -0.88f, -0.88f, -0.88f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-1.74f);
        p3.LJIIJ(-0.49f, 0.0f, -0.88f, 0.4f, -0.88f, 0.88f);
        p3.LJIILL(3.03f);
        this.LIZJ.LJIIJ(0.0f, 6.5f, 5.87f, 13.09f, 12.25f, 13.92f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(3.6f);
        this.LIZJ.LJIIJ(0.0f, 0.5f, 0.4f, 0.88f, 0.88f, 0.88f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(1.75f);
        this.LIZJ.LJIIJ(0.48f, 0.0f, 0.87f, -0.39f, 0.87f, -0.87f);
        this.LIZJ.LJIILL(-3.61f);
        this.LIZJ.LJ(32.13f, 37.5f, 38.0f, 30.9f, 38.0f, 24.4f);
        C32856Cuy.Qm(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(-0.49f, 0.0f, -0.88f, 0.4f, -0.88f, 0.88f);
        p6.LJIILL(3.03f);
        this.LIZJ.LJIIJ(0.0f, 5.03f, -5.12f, 10.53f, -10.5f, 10.53f);
        this.LIZJ.LJIILJJIL(-10.5f, -5.5f, -10.5f, -10.53f, true);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(-3.04f);
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
