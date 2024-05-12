package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33270D3y extends AbstractC39455Fe7 {
    public C33270D3y() {
        this.LIZJ.LJIIIIZZ(19.94f, 7.38f);
        this.LIZJ.LJIIJ(0.33f, 0.1f, 0.42f, 0.52f, 0.2f, 0.79f);
        this.LIZJ.LJIIIZ(11.45f, 11.45f, false, false, -0.6f, 13.87f);
        this.LIZJ.LJIIJ(0.2f, 0.28f, 0.07f, 0.69f, -0.27f, 0.76f);
        this.LIZJ.LIZJ(8.02f, 8.02f, false, true, 9.5f, 15.0f);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, false, true, 10.44f, -7.62f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(5.5f, 39.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.LJIIJJI(6.0f);
        C32856Cuy.LJJZZIII(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -1.9f, 0.76f, -3.62f, 1.99f, -4.89f);
        this.LIZJ.LJIIJ(0.35f, -0.36f, 0.11f, -1.11f, -0.4f, -1.11f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(12.5f);
        C32856Cuy.Kf(this.LIZJ);
        C78269Unh.LIZJ(this.LIZJ, "p", 5.0f);
        this.LIZJ.LJIIIIZZ(17.5f, 34.0f);
        C32856Cuy.Hf(this.LIZJ);
        C32856Cuy.LJIIL(this.LIZJ);
        C32856Cuy.If(this.LIZJ);
        C32856Cuy.D1(this.LIZJ);
        C32856Cuy.vm(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-23.0f);
        C78269Unh.LIZJ(this.LIZJ, "p", -7.0f);
        this.LIZJ.LJIIIIZZ(30.0f, 24.0f);
        this.LIZJ.LJIIIZ(8.5f, 8.5f, true, false, 0.0f, -17.0f);
        this.LIZJ.LJIIIZ(8.5f, 8.5f, false, false, 0.0f, 17.0f);
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
