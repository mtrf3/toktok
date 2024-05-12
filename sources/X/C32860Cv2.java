package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cv2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32860Cv2 extends AbstractC39455Fe7 {
    public C32860Cv2() {
        this.LIZJ.LJIIIIZZ(21.5f, 43.0f);
        C32856Cuy.sa(this.LIZJ);
        C32856Cuy.m2(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(38.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(31.0f, 31.0f);
        C32856Cuy.N8(this.LIZJ);
        C32856Cuy.LLLFF(this.LIZJ);
        C32856Cuy.LLII(this.LIZJ);
        C78269Unh.LIZJ(this.LIZJ, "p", 14.0f);
        this.LIZJ.LJIIIIZZ(41.0f, 30.0f);
        C32856Cuy.xn(this.LIZJ);
        C32856Cuy.c3(this.LIZJ);
        C32856Cuy.ke(this.LIZJ);
        this.LIZJ.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(5.0f, 14.0f);
        C32856Cuy.fc(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(15.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.U6(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIIZZ(4.0f, 23.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(2.4f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p5.LJIILL(2.4f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJI(5.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIK.LIZIZ(this.LIZJ, "p", 23.0f);
        this.LIZJ.LJIIIIZZ(5.0f, 30.0f);
        C32856Cuy.fc(this.LIZJ);
        C32856Cuy.E9(this.LIZJ);
        C32856Cuy.Ak(this.LIZJ);
        this.LIZJ.LJIIIIZZ(13.0f, 11.0f);
        C32856Cuy.Ub(this.LIZJ);
        C32856Cuy.LLZLL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(14.0f, 18.0f);
        C32856Cuy.fc(this.LIZJ);
        C32856Cuy.v0(this.LIZJ);
        C32856Cuy.LLLLIL(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIIZZ(13.0f, 27.0f);
        C32856Cuy.Ub(this.LIZJ);
        C32856Cuy.z9(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(14.0f, 34.0f);
        C32856Cuy.fc(this.LIZJ);
        C32856Cuy.I9(this.LIZJ);
        C32856Cuy.ek(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
