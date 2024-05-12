package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33319D5v extends AbstractC39455Fe7 {
    public C33319D5v() {
        C32856Cuy.Il(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILIIL(-16.0f, 0.0f);
        p.LJIIIZ(6.0f, 6.0f, true, true, 12.01f, 0.01f);
        p.LJIIIZ(6.0f, 6.0f, false, true, -12.0f, -0.01f);
        p.LIZLLL();
        this.LIZJ.LJIIIIZZ(25.25f, 27.99f);
        this.LIZJ.LIZJ(19.13f, 19.13f, false, false, 19.0f, 27.0f);
        this.LIZJ.LJ(8.72f, 27.0f, 2.35f, 33.99f, 2.02f, 44.0f);
        C32856Cuy.LLLIIII(this.LIZJ);
        this.LIZJ.LJIIJ(0.56f, 0.0f, 1.0f, -0.45f, 1.02f, -1.0f);
        this.LIZJ.LJIIJ(0.3f, -7.84f, 4.9f, -13.0f, 12.98f, -13.0f);
        this.LIZJ.LJIIJ(2.34f, 0.0f, 4.38f, 0.43f, 6.12f, 1.23f);
        this.LIZJ.LJIIIZ(12.6f, 12.6f, false, true, 0.13f, -4.24f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(37.44f, 27.8f);
        this.LIZJ.LJIIJ(-1.27f, 0.0f, -3.64f, 0.6f, -3.64f, 2.24f);
        this.LIZJ.LJIIJ(0.0f, 0.52f, -0.42f, 0.93f, -0.93f, 0.93f);
        C32856Cuy.Ea(this.LIZJ);
        this.LIZJ.LJIILL(0.17f);
        C32856Cuy.Vc(this.LIZJ);
        C32856Cuy.K9(this.LIZJ);
        C32856Cuy.rn(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(40.75f, 43.23f);
        this.LIZJ.LJIIJ(0.0f, 1.56f, -0.96f, 2.82f, -3.35f, 2.82f);
        this.LIZJ.LJIIJ(-2.4f, 0.0f, -3.36f, -1.26f, -3.36f, -2.82f);
        this.LIZJ.LJIIJ(0.0f, -1.57f, 0.96f, -2.83f, 3.36f, -2.83f);
        this.LIZJ.LJIIJ(2.39f, 0.0f, 3.35f, 1.26f, 3.35f, 2.83f);
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
