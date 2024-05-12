package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33545DEn extends AbstractC39455Fe7 {
    public C33545DEn() {
        this.LIZJ.LJIILIIL(25.77f, 22.77f);
        this.LIZJ.LJIIL(9.3f, -9.3f);
        C32856Cuy.on(this.LIZJ);
        this.LIZJ.LJII(24.0f, 17.46f);
        C32856Cuy.Te(this.LIZJ);
        this.LIZJ.LJIIIIZZ(25.77f, 37.77f);
        C32856Cuy.G(this.LIZJ);
        C32856Cuy.on(this.LIZJ);
        this.LIZJ.LJII(24.0f, 32.46f);
        C32856Cuy.Te(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
