package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DET extends AbstractC39455Fe7 {
    public DET() {
        this.LIZJ.LJIILIIL(19.26f, 24.0f);
        this.LIZJ.LJIIL(13.66f, -13.67f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        p.LJIIL(-1.84f, -1.84f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.41f, 0.0f);
        this.LIZJ.LJII(13.46f, 23.3f);
        C32856Cuy.Ik(this.LIZJ);
        this.LIZJ.LJIIL(16.2f, 16.21f);
        C32856Cuy.Dk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(1.84f, -1.84f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        this.LIZJ.LJII(19.26f, 24.0f);
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
