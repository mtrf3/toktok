package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBZ extends AbstractC39455Fe7 {
    public DBZ() {
        C32856Cuy.LJZL(this.LIZJ);
        this.LIZJ.LJIIJ(4.36f, 0.0f, 7.94f, 1.26f, 10.68f, 3.18f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-0.9f, 0.9f);
        this.LIZJ.LJIIIZ(25.5f, 25.5f, false, false, -6.22f, 10.14f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-0.67f, 2.06f);
        this.LIZJ.LIZJ(5.79f, 5.79f, false, false, 21.6f, 45.0f);
        C32856Cuy.Ok(this.LIZJ);
        this.LIZJ.LJIIIIZZ(42.51f, 26.54f);
        this.LIZJ.LJIIIZ(2.65f, 2.65f, false, false, -3.75f, 0.0f);
        this.LIZJ.LJII(31.5f, 33.8f);
        this.LIZJ.LJIIIZ(21.65f, 21.65f, false, false, -5.28f, 8.61f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-0.67f, 2.06f);
        this.LIZJ.LJIIJ(-0.47f, 1.44f, 0.9f, 2.8f, 2.33f, 2.33f);
        this.LIZJ.LJIIL(2.06f, -0.67f);
        this.LIZJ.LJIIIZ(21.65f, 21.65f, false, false, 8.61f, -5.28f);
        this.LIZJ.LJIIL(7.26f, -7.26f);
        this.LIZJ.LJIIIZ(2.65f, 2.65f, false, false, 0.0f, -3.75f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-3.3f, -3.3f);
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
