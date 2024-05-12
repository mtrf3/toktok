package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33591DGh extends AbstractC39455Fe7 {
    public C33591DGh() {
        this.LIZJ.LJIIIIZZ(10.4f, 12.2f);
        this.LIZJ.LJIIJ(3.76f, -3.68f, 9.69f, -3.66f, 13.6f, 0.42f);
        this.LIZJ.LJIIJ(3.91f, -4.08f, 9.84f, -4.1f, 13.6f, -0.42f);
        this.LIZJ.LJIIIZ(9.48f, 9.48f, false, true, 0.0f, 13.63f);
        this.LIZJ.LJII(25.06f, 38.07f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.5f, 1.5f, false, true, -2.1f, 0.0f);
        this.LIZJ.LJII(10.4f, 25.83f);
        this.LIZJ.LJIIIZ(9.48f, 9.48f, false, true, 0.0f, -13.63f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
