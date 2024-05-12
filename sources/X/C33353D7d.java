package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33353D7d extends AbstractC39455Fe7 {
    public C33353D7d() {
        this.LIZJ.LJIIIIZZ(26.24f, 38.0f);
        this.LIZJ.LJ(11.37f, 38.0f, 2.35f, 27.86f, 2.0f, 11.0f);
        this.LIZJ.LJIIJJI(7.53f);
        this.LIZJ.LJIIJ(0.23f, 12.38f, 5.96f, 17.64f, 10.35f, 18.7f);
        C32856Cuy.i9(this.LIZJ);
        this.LIZJ.LJIIJJI(7.22f);
        this.LIZJ.LJIILL(10.68f);
        this.LIZJ.LJIIJ(4.23f, -0.46f, 8.66f, -5.32f, 10.16f, -10.68f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(7.1f);
        this.LIZJ.LJIIJ(-1.14f, 6.6f, -5.97f, 11.46f, -9.38f, 13.46f);
        this.LIZJ.LIZJ(21.42f, 21.42f, false, true, 46.0f, 38.0f);
        this.LIZJ.LJIIJJI(-7.8f);
        this.LIZJ.LJIIJ(-1.65f, -5.13f, -5.69f, -9.1f, -11.1f, -9.64f);
        C32856Cuy.L9(this.LIZJ);
        this.LIZJ.LJIIJJI(-0.86f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-16746497);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
