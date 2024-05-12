package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBP extends AbstractC39455Fe7 {
    public DBP() {
        this.LIZJ.LJIIIIZZ(24.0f, 45.07f);
        this.LIZJ.LJIIJ(12.15f, 0.0f, 22.0f, -9.44f, 22.0f, -21.09f);
        this.LIZJ.LJ(46.0f, 12.34f, 36.15f, 2.9f, 24.0f, 2.9f);
        this.LIZJ.LJIILLIIL(2.0f, 12.34f, 2.0f, 23.98f, true);
        this.LIZJ.LJIIIZ(20.5f, 20.5f, false, false, 5.41f, 13.85f);
        this.LIZJ.LJIIJ(-0.27f, 2.33f, -0.6f, 4.14f, -1.42f, 5.96f);
        this.LIZJ.LJIIJ(-0.6f, 1.35f, 0.67f, 2.96f, 2.06f, 2.45f);
        this.LIZJ.LJIIL(1.47f, -0.53f);
        this.LIZJ.LJIIJ(1.8f, -0.63f, 3.7f, -1.29f, 5.7f, -2.39f);
        this.LIZJ.LIZJ(22.75f, 22.75f, false, false, 24.0f, 45.07f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.0f, -16.57f);
        C32856Cuy.Tg(this.LIZJ);
        this.LIZJ.LJIILIIL(16.0f, -3.75f);
        this.LIZJ.LJIIIZ(3.75f, 3.75f, true, true, -7.5f, 0.0f);
        this.LIZJ.LJIIIZ(3.75f, 3.75f, false, true, 7.5f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(11.75f, 28.5f);
        C32856Cuy.Tg(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
