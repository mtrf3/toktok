package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33540DEi extends AbstractC39455Fe7 {
    public C33540DEi() {
        this.LIZJ.LJIIIIZZ(2.55f, 5.14f);
        this.LIZJ.LIZJ(1.52f, 1.52f, false, false, 1.42f, 7.7f);
        this.LIZJ.LJIIL(23.06f, 25.34f);
        this.LIZJ.LJIIL(10.07f, 32.03f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, false, false, 2.77f, 0.3f);
        this.LIZJ.LJII(70.77f, 7.42f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, false, false, -1.32f, -2.28f);
        this.LIZJ.LJI(2.55f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(26.47f, 30.7f);
        this.LIZJ.LJII(5.99f, 8.18f);
        this.LIZJ.LJIIJJI(60.83f);
        this.LIZJ.LJIIL(-30.4f, 52.66f);
        this.LIZJ.LJIIL(-8.62f, -27.4f);
        this.LIZJ.LJII(48.0f, 21.58f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, false, false, -1.53f, -2.62f);
        this.LIZJ.LJIIL(-20.0f, 11.74f);
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
