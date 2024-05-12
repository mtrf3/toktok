package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33410D9i extends AbstractC39455Fe7 {
    public C33410D9i() {
        C32856Cuy.ua(this.LIZJ);
        this.LIZJ.LJIILIIL(21.1f, 15.02f);
        this.LIZJ.LJIIL(-5.43f, -5.44f);
        C32856Cuy.Rf(this.LIZJ);
        this.LIZJ.LJII(35.0f, 28.09f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(5.44f, -5.44f);
        C32856Cuy.kc(this.LIZJ);
        this.LIZJ.LJIIL(-5.44f, 5.44f);
        this.LIZJ.LJIIL(5.44f, 5.44f);
        C32856Cuy.O9(this.LIZJ);
        C32856Cuy.Wf(this.LIZJ);
        this.LIZJ.LJII(35.0f, 30.91f);
        this.LIZJ.LJIIL(-5.44f, 5.44f);
        C32856Cuy.l4(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(5.44f, -5.44f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-17.97f, -2.24f);
        C32856Cuy.p1(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
