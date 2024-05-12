package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAO extends AbstractC39455Fe7 {
    public DAO() {
        C32856Cuy.Mg(this.LIZJ);
        C32856Cuy.q7(this.LIZJ);
        this.LIZJ.LJIIIZ(13.3f, 13.3f, false, false, -13.24f, 11.94f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-0.88f, 8.55f);
        this.LIZJ.LJIIJ(-0.33f, 3.2f, -3.46f, 5.89f, -5.33f, 8.27f);
        C32856Cuy.nm(this.LIZJ);
        this.LIZJ.LJIIJ(-1.88f, -2.38f, -5.0f, -5.08f, -5.33f, -8.28f);
        this.LIZJ.LJIIL(-0.89f, -8.54f);
        this.LIZJ.LIZJ(13.3f, 13.3f, false, false, 24.0f, 4.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.0f, 36.0f);
        C32856Cuy.nd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
