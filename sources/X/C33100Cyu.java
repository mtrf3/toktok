package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cyu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33100Cyu extends AbstractC39455Fe7 {
    public C33100Cyu() {
        this.LIZJ.LJIIIIZZ(36.9f, 40.66f);
        C32856Cuy.Ek(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(0.7f, -0.7f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.42f);
        this.LIZJ.LJII(8.44f, 7.96f);
        C32856Cuy.bn(this.LIZJ);
        C32856Cuy.Ik(this.LIZJ);
        this.LIZJ.LJIIL(0.55f, 0.56f);
        C32856Cuy.Mh(this.LIZJ);
        this.LIZJ.LJIIJ(1.05f, 0.0f, 2.01f, -0.36f, 2.77f, -0.96f);
        this.LIZJ.LJIIL(4.13f, 4.12f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-6.3f, -6.29f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, -0.6f, 0.13f);
        C32856Cuy.y2(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(1.73f);
        this.LIZJ.LJIIL(20.88f, 20.87f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(34.5f, 26.95f);
        this.LIZJ.LJIILL(4.08f);
        C32856Cuy.LIZIZ(this.LIZJ);
        C32856Cuy.m9(this.LIZJ);
        C32856Cuy.m8(this.LIZJ);
        this.LIZJ.LJI(16.97f);
        C32856Cuy.LIZIZ(this.LIZJ);
        C32856Cuy.H6(this.LIZJ);
        C32856Cuy.X4(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(8.0f, 2.1f);
        C32856Cuy.p2(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
