package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33539DEh extends AbstractC39455Fe7 {
    public C33539DEh() {
        C32856Cuy.LLJILJILJ(this.LIZJ);
        this.LIZJ.LJIILIIL(9.66f, 15.38f);
        this.LIZJ.LJIIJ(0.47f, 0.3f, 0.61f, 0.91f, 0.32f, 1.39f);
        this.LIZJ.LJIIL(-8.1f, 12.96f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -3.22f, 0.26f);
        this.LIZJ.LJIIL(-5.39f, -6.15f);
        this.LIZJ.LJIIIZ(1.01f, 1.01f, false, true, 0.1f, -1.42f);
        this.LIZJ.LJIIL(1.52f, -1.33f);
        C32856Cuy.qk(this.LIZJ);
        this.LIZJ.LJIIL(3.6f, 4.11f);
        this.LIZJ.LJIIL(6.66f, -10.66f);
        this.LIZJ.LJIIJ(0.3f, -0.48f, 0.92f, -0.62f, 1.4f, -0.33f);
        this.LIZJ.LJIIL(1.7f, 1.07f);
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
