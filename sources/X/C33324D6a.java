package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33324D6a extends AbstractC39455Fe7 {
    public C33324D6a() {
        this.LIZJ.LJIIIIZZ(45.0f, 24.13f);
        this.LIZJ.LJ(45.0f, 12.46f, 35.6f, 3.0f, 24.0f, 3.0f);
        this.LIZJ.LJIILLIIL(3.0f, 12.46f, 3.0f, 24.13f, true);
        this.LIZJ.LIZJ(21.1f, 21.1f, false, false, 20.72f, 45.0f);
        this.LIZJ.LJIJ(30.24f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-5.33f);
        this.LIZJ.LJIILL(-6.11f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(5.33f);
        this.LIZJ.LJIILL(-4.66f);
        this.LIZJ.LJIIJ(0.0f, -5.3f, 3.13f, -8.22f, 7.93f, -8.22f);
        this.LIZJ.LJIIJ(2.3f, 0.0f, 4.7f, 0.42f, 4.7f, 0.42f);
        this.LIZJ.LJIILL(5.2f);
        this.LIZJ.LJI(30.7f);
        this.LIZJ.LJIIJ(-2.6f, 0.0f, -3.42f, 1.62f, -3.42f, 3.3f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(3.96f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(5.83f);
        this.LIZJ.LJIIL(-0.94f, 6.1f);
        this.LIZJ.LJIIJJI(-4.89f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(45.0f);
        this.LIZJ.LIZJ(21.1f, 21.1f, false, false, 45.0f, 24.13f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-15173646);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
