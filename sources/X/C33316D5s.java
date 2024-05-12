package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33316D5s extends AbstractC39455Fe7 {
    public C33316D5s() {
        this.LIZJ.LJIIIIZZ(10.76f, 5.82f);
        this.LIZJ.LJIIJ(-0.52f, 1.03f, -0.68f, 2.27f, -0.74f, 4.2f);
        this.LIZJ.LJIIJ(-1.93f, 0.06f, -3.17f, 0.22f, -4.2f, 0.74f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(7.0f, 7.0f, false, false, -3.06f, 3.06f);
        C32856Cuy.vi(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(7.0f, 7.0f, false, false, 3.06f, -3.06f);
        this.LIZJ.LJIIJ(0.52f, -1.03f, 0.68f, -2.27f, 0.74f, -4.2f);
        this.LIZJ.LJIIJ(1.93f, -0.06f, 3.17f, -0.22f, 4.2f, -0.74f);
        C32856Cuy.sn(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(7.0f, 7.0f, false, false, -3.06f, 3.06f);
        p3.LIZLLL();
        this.LIZJ.LJIIIIZZ(34.8f, 6.0f);
        C32856Cuy.Ta(this.LIZJ);
        this.LIZJ.LJIIL(-1.07f, 0.05f);
        C32856Cuy.am(this.LIZJ);
        this.LIZJ.LJI(14.03f);
        this.LIZJ.LJIIJ(0.0f, -0.4f, 0.03f, -0.75f, 0.05f, -1.07f);
        this.LIZJ.LJIIJ(0.08f, -0.92f, 0.2f, -1.2f, 0.25f, -1.3f);
        C32856Cuy.Jg(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-7.67f, 21.02f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.75f, 0.44f, 0.75f, 1.52f, 0.0f, 1.95f);
        this.LIZJ.LJIIL(-10.7f, 6.17f);
        C32856Cuy.be(this.LIZJ);
        C32856Cuy.km(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
