package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33526DDu extends AbstractC39455Fe7 {
    public C33526DDu() {
        this.LIZJ.LJIIIIZZ(14.06f, 12.47f);
        this.LIZJ.LJIIJ(0.4f, 0.39f, 1.02f, 0.37f, 1.43f, 0.0f);
        this.LIZJ.LIZJ(15.6f, 15.6f, false, true, 41.6f, 24.0f);
        this.LIZJ.LJIIJJI(-4.48f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.77f, 1.63f);
        this.LIZJ.LJIIL(6.89f, 8.42f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.54f, 0.0f);
        this.LIZJ.LJIIL(6.9f, -8.42f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.78f, -1.63f);
        this.LIZJ.LJI(46.4f);
        this.LIZJ.LIZJ(20.4f, 20.4f, false, false, 12.03f, 9.13f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.96f, 0.96f, false, false, 0.01f, 1.4f);
        this.LIZJ.LJIIL(2.02f, 1.94f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(37.94f, 35.53f);
        this.LIZJ.LJIIIZ(1.05f, 1.05f, false, false, -1.43f, 0.0f);
        this.LIZJ.LIZJ(15.6f, 15.6f, false, true, 10.4f, 24.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(4.48f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.77f, -1.63f);
        this.LIZJ.LJIIL(-6.89f, -8.42f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.54f, 0.0f);
        this.LIZJ.LJIIL(-6.9f, 8.42f);
        this.LIZJ.LIZJ(1.0f, 1.0f, false, false, 1.12f, 24.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(5.6f);
        this.LIZJ.LJIIIZ(20.4f, 20.4f, false, false, 34.37f, 14.87f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, false, -0.01f, -1.4f);
        this.LIZJ.LJIIL(-2.02f, -1.94f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(52.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
