package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33564DFg extends AbstractC39455Fe7 {
    public C33564DFg() {
        C32856Cuy.LLJI(this.LIZJ);
        this.LIZJ.LJIIIIZZ(13.2f, 15.35f);
        this.LIZJ.LJIIL(2.34f, -2.33f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, true, 1.55f, 0.0f);
        this.LIZJ.LJII(35.0f, 30.9f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, true, 0.0f, 1.55f);
        this.LIZJ.LJIIL(-2.34f, 2.34f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, true, -1.56f, 0.0f);
        this.LIZJ.LJII(13.2f, 16.9f);
        this.LIZJ.LJIIIZ(1.1f, 1.1f, false, true, 0.0f, -1.55f);
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
