package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32883CvP extends AbstractC39455Fe7 {
    public C32883CvP() {
        this.LIZJ.LJIIIIZZ(33.0f, 33.42f);
        this.LIZJ.LIZJ(16.99f, 16.99f, false, false, 24.0f, 2.0f);
        this.LIZJ.LJIIIZ(17.0f, 17.0f, false, false, -9.0f, 31.42f);
        C32856Cuy.H9(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 3.0f, 1.0f, 4.0f, 4.0f, 4.0f);
        C32856Cuy.LJIIJJI(this.LIZJ);
        this.LIZJ.LJIIJ(3.0f, 0.0f, 4.0f, -1.0f, 4.0f, -4.0f);
        this.LIZJ.LJIILL(-0.58f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-15.7f, -13.3f);
        C32856Cuy.vk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(1.4f, -1.42f);
        C32856Cuy.pk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJII(24.0f, 21.17f);
        C32856Cuy.t1(this.LIZJ);
        this.LIZJ.LJII(26.0f, 24.82f);
        C32856Cuy.D9(this.LIZJ);
        C32856Cuy.Ob(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-5.17f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-4.7f, -4.7f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(19.0f, 43.0f);
        C32856Cuy.x(this.LIZJ);
        C32856Cuy.E0(this.LIZJ);
        C32856Cuy.wm(this.LIZJ);
        C32856Cuy.z1(this.LIZJ);
        C32856Cuy.vm(this.LIZJ);
        C32856Cuy.LJII(this.LIZJ);
        C32856Cuy.um(this.LIZJ);
        C32856Cuy.c1(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
