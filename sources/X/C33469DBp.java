package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33469DBp extends AbstractC39455Fe7 {
    public C33469DBp() {
        this.LIZJ.LJIIIIZZ(37.01f, 21.5f);
        this.LIZJ.LJIIJ(-7.09f, -4.2f, -18.79f, -4.6f, -25.55f, -2.54f);
        this.LIZJ.LJIIIZ(2.06f, 2.06f, true, true, -1.2f, -3.94f);
        this.LIZJ.LJIIJ(7.77f, -2.36f, 20.69f, -1.9f, 28.85f, 2.94f);
        this.LIZJ.LJIIIZ(2.06f, 2.06f, false, true, -2.1f, 3.54f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-0.23f, 6.24f);
        this.LIZJ.LJIIJ(-0.5f, 0.8f, -1.55f, 1.06f, -2.36f, 0.57f);
        this.LIZJ.LJIIJ(-5.91f, -3.64f, -14.93f, -4.7f, -21.92f, -2.57f);
        this.LIZJ.LJIIIZ(1.72f, 1.72f, false, true, -1.0f, -3.28f);
        this.LIZJ.LJIIJ(8.0f, -2.42f, 17.93f, -1.25f, 24.72f, 2.92f);
        this.LIZJ.LJIIJ(0.8f, 0.5f, 1.06f, 1.56f, 0.56f, 2.36f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.69f, 6.0f);
        this.LIZJ.LJIIJ(-0.4f, 0.64f, -1.24f, 0.84f, -1.89f, 0.45f);
        this.LIZJ.LJIIJ(-5.16f, -3.16f, -11.66f, -3.87f, -19.32f, -2.12f);
        this.LIZJ.LJIIIZ(1.37f, 1.37f, true, true, -0.61f, -2.68f);
        this.LIZJ.LJIIJ(8.38f, -1.91f, 15.57f, -1.09f, 21.36f, 2.46f);
        this.LIZJ.LJIIJ(0.65f, 0.4f, 0.85f, 1.24f, 0.46f, 1.88f);
        this.LIZJ.LIZLLL();
        C32856Cuy.ml(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-14756000);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
