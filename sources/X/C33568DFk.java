package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33568DFk extends AbstractC39455Fe7 {
    public C33568DFk() {
        this.LIZJ.LJIIIIZZ(16.63f, 20.22f);
        C32856Cuy.Fc(this.LIZJ);
        this.LIZJ.LIZJ(16.1f, 16.1f, false, true, 35.82f, 4.14f);
        this.LIZJ.LJIIIZ(16.1f, 16.1f, false, true, 16.09f, 16.08f);
        this.LIZJ.LJIIIZ(16.1f, 16.1f, false, true, -16.09f, 16.09f);
        this.LIZJ.LJIIIZ(16.1f, 16.1f, false, true, -16.08f, -16.09f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(6.7f, 70.97f);
        this.LIZJ.LJIIIZ(1.55f, 1.55f, false, true, -1.5f, -1.95f);
        this.LIZJ.LJIIIZ(31.64f, 31.64f, false, true, 61.26f, 0.0f);
        this.LIZJ.LJIIIZ(1.55f, 1.55f, true, true, -3.02f, 0.77f);
        this.LIZJ.LJIIIZ(28.52f, 28.52f, false, false, -55.24f, 0.0f);
        this.LIZJ.LJIIJ(-0.18f, 0.71f, -0.8f, 1.18f, -1.5f, 1.18f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
