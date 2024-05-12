package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBE extends AbstractC39455Fe7 {
    public DBE() {
        this.LIZJ.LJIIIIZZ(43.8f, 6.8f);
        this.LIZJ.LJIIJ(-1.22f, 0.82f, -4.02f, 2.02f, -5.4f, 2.02f);
        this.LIZJ.LIZJ(8.44f, 8.44f, false, false, 32.14f, 6.0f);
        this.LIZJ.LJIIJ(-4.79f, 0.0f, -8.67f, 4.1f, -8.67f, 9.14f);
        this.LIZJ.LJIIJ(0.0f, 0.7f, 0.08f, 1.38f, 0.22f, 2.04f);
        this.LIZJ.LIZJ(23.59f, 23.59f, false, true, 5.83f, 7.69f);
        this.LIZJ.LJIIJ(-2.63f, 4.8f, -0.35f, 10.14f, 2.63f, 12.08f);
        this.LIZJ.LJIIJ(-1.02f, 0.08f, -2.9f, -0.12f, -3.79f, -1.03f);
        this.LIZJ.LJIIJ(-0.06f, 3.18f, 1.4f, 7.4f, 6.69f, 8.93f);
        this.LIZJ.LJIIJ(-1.02f, 0.58f, -2.83f, 0.41f, -3.61f, 0.29f);
        this.LIZJ.LJIIJ(0.27f, 2.69f, 3.84f, 6.2f, 7.74f, 6.2f);
        this.LIZJ.LJIIJ(-1.39f, 1.7f, -6.62f, 4.78f, -12.49f, 3.8f);
        this.LIZJ.LIZJ(25.03f, 25.03f, false, false, 16.55f, 42.0f);
        this.LIZJ.LJIIJ(13.98f, 0.0f, 24.84f, -11.95f, 24.26f, -26.7f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-0.16f);
        this.LIZJ.LJII(40.8f, 15.0f);
        this.LIZJ.LJIIIZ(15.44f, 15.44f, false, false, 4.2f, -4.68f);
        this.LIZJ.LJIIIZ(14.6f, 14.6f, false, true, -4.8f, 1.43f);
        this.LIZJ.LJIIIZ(9.66f, 9.66f, false, false, 3.6f, -4.96f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-14835214);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
