package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33506DDa extends AbstractC39455Fe7 {
    public C33506DDa() {
        C32856Cuy.l8(this.LIZJ);
        C32856Cuy.C6(this.LIZJ);
        this.LIZJ.LJIJ(23.83f);
        C32856Cuy.F2(this.LIZJ);
        this.LIZJ.LJII(22.0f, 23.83f);
        C32856Cuy.I9(this.LIZJ);
        this.LIZJ.LJIIJJI(-9.52f);
        C32856Cuy.Wb(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
