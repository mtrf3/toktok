package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33429DAb extends AbstractC39455Fe7 {
    public C33429DAb() {
        this.LIZJ.LJIIIIZZ(25.5f, 44.0f);
        this.LIZJ.LIZJ(20.5f, 20.5f, true, false, 5.0f, 23.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(42.0f);
        C32856Cuy.Am(this.LIZJ);
        C32856Cuy.Cb(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-9.8f, -19.98f);
        this.LIZJ.LJIIIZ(0.58f, 0.58f, false, false, -0.88f, 0.0f);
        this.LIZJ.LJIIL(-1.33f, 1.63f);
        this.LIZJ.LJIIJ(-0.17f, 0.2f, -0.17f, 0.5f, 0.0f, 0.7f);
        this.LIZJ.LJIIIZ(16.03f, 16.03f, false, false, 4.88f, 3.87f);
        this.LIZJ.LJIIJ(1.94f, 0.98f, 4.01f, 1.48f, 6.1f, 1.48f);
        this.LIZJ.LJIIJ(2.1f, 0.0f, 4.17f, -0.5f, 6.1f, -1.48f);
        this.LIZJ.LJIIJ(1.81f, -0.91f, 3.47f, -2.23f, 4.88f, -3.87f);
        this.LIZJ.LJIIJ(0.18f, -0.2f, 0.18f, -0.5f, 0.0f, -0.7f);
        this.LIZJ.LJIIL(-1.32f, -1.62f);
        this.LIZJ.LJIIIZ(0.58f, 0.58f, false, false, -0.88f, -0.01f);
        this.LIZJ.LJIIIZ(13.03f, 13.03f, false, true, -3.78f, 2.93f);
        this.LIZJ.LJIIJ(-1.59f, 0.8f, -3.28f, 1.21f, -5.0f, 1.21f);
        this.LIZJ.LJIIJ(-1.7f, 0.0f, -3.4f, -0.4f, -4.99f, -1.2f);
        this.LIZJ.LJIIJ(-1.4f, -0.71f, -2.67f, -1.7f, -3.79f, -2.94f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
