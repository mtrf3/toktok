package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33538DEg extends AbstractC39455Fe7 {
    public C33538DEg() {
        C32856Cuy.vj(this.LIZJ);
        this.LIZJ.LJIILIIL(-6.0f, 22.0f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, 10.0f, -4.47f);
        this.LIZJ.LJIIJ(0.41f, 0.36f, 1.03f, 0.44f, 1.47f, 0.1f);
        this.LIZJ.LJIIL(1.56f, -1.26f);
        this.LIZJ.LJIIJ(0.43f, -0.34f, 0.5f, -0.97f, 0.11f, -1.37f);
        this.LIZJ.LJIIIZ(10.0f, 10.0f, true, false, 0.0f, 14.0f);
        this.LIZJ.LJIIJ(0.39f, -0.4f, 0.32f, -1.03f, -0.11f, -1.37f);
        this.LIZJ.LJIIL(-1.56f, -1.26f);
        this.LIZJ.LJIIJ(-0.44f, -0.34f, -1.06f, -0.26f, -1.47f, 0.1f);
        this.LIZJ.LIZJ(6.0f, 6.0f, false, true, 18.0f, 24.0f);
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
