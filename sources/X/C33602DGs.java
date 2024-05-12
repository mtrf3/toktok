package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33602DGs extends AbstractC39455Fe7 {
    public C33602DGs() {
        this.LIZJ.LJIIIIZZ(25.52f, 34.03f);
        this.LIZJ.LJIIJ(-0.8f, 0.87f, -2.24f, 0.87f, -3.04f, 0.0f);
        this.LIZJ.LJII(8.83f, 19.1f);
        this.LIZJ.LJIIJ(-1.11f, -1.22f, -0.19f, -3.1f, 1.52f, -3.1f);
        this.LIZJ.LJIIJJI(27.3f);
        this.LIZJ.LJIIJ(1.71f, 0.0f, 2.63f, 1.88f, 1.52f, 3.1f);
        this.LIZJ.LJII(25.52f, 34.03f);
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
