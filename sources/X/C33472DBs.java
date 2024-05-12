package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33472DBs extends AbstractC39455Fe7 {
    public C33472DBs() {
        C32856Cuy.q7(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(10.0f, 10.0f, true, true, 0.0f, 20.0f);
        p.LJIIIZ(10.0f, 10.0f, false, true, 0.0f, -20.0f);
        p.LIZLLL();
        p.LJIILIIL(0.0f, 4.0f);
        p.LJIIIZ(6.0f, 6.0f, true, false, 0.0f, 12.0f);
        this.LIZJ.LIZJ(6.0f, 6.0f, false, false, 24.0f, 8.0f);
        this.LIZJ.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(0.0f, 19.0f);
        this.LIZJ.LJIIJ(10.3f, 0.0f, 16.67f, 6.99f, 17.0f, 17.0f);
        this.LIZJ.LJIIJ(0.02f, 0.55f, -0.43f, 1.0f, -1.0f, 1.0f);
        C32856Cuy.LIZLLL(this.LIZJ);
        this.LIZJ.LJIIJ(-0.54f, 0.0f, -0.98f, -0.45f, -1.0f, -1.0f);
        this.LIZJ.LJIIJ(-0.3f, -7.84f, -4.9f, -13.0f, -13.0f, -13.0f);
        this.LIZJ.LJIILJJIL(-12.7f, 5.16f, -13.0f, 13.0f, true);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(-0.02f, 0.55f, -0.46f, 1.0f, -1.02f, 1.0f);
        p3.LJIIJJI(-2.0f);
        this.LIZJ.LJIIJ(-0.55f, 0.0f, -1.0f, -0.45f, -0.98f, -1.0f);
        this.LIZJ.LJIIJ(0.33f, -10.01f, 6.7f, -17.0f, 17.0f, -17.0f);
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
