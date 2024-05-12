package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33496DCq extends AbstractC39455Fe7 {
    public C33496DCq() {
        C32856Cuy.S0(this.LIZJ);
        this.LIZJ.LJIIJ(4.05f, 0.0f, 7.49f, 1.08f, 10.2f, 3.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-0.2f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, false, -4.1f, 2.14f);
        this.LIZJ.LIZJ(14.64f, 14.64f, false, false, 19.0f, 31.0f);
        C32856Cuy.Aj(this.LIZJ);
        this.LIZJ.LJIIIIZZ(35.0f, 28.0f);
        C32856Cuy.Mm(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
