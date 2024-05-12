package X;

import android.text.TextPaint;
import kotlin.jvm.internal.o;

/* renamed from: X.0mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17650mf extends TextPaint {
    public C22080to LIZ;
    public C11770dB LIZIZ;
    public AbstractC11740d8 LIZJ;
    public C10430b1 LIZLLL;
    public QZV LJ;

    public C17650mf(float f) {
        super(1);
        ((TextPaint) this).density = f;
        this.LIZ = C22080to.LIZIZ;
        this.LIZIZ = C11770dB.LIZLLL;
    }

    public final void LIZIZ(long j) {
        if (j != C11850dJ.LJI) {
            int LJJJZ = C78897Uxp.LJJJZ(j);
            if (getColor() != LJJJZ) {
                setColor(LJJJZ);
            }
            setShader(null);
            this.LIZJ = null;
            this.LIZLLL = null;
        }
    }

    public final void LIZJ(C11770dB c11770dB) {
        if (c11770dB != null && !o.LJ(this.LIZIZ, c11770dB)) {
            this.LIZIZ = c11770dB;
            if (o.LJ(c11770dB, C11770dB.LIZLLL)) {
                clearShadowLayer();
                return;
            }
            C11770dB c11770dB2 = this.LIZIZ;
            float f = c11770dB2.LIZJ;
            if (f == 0.0f) {
                f = Float.MIN_VALUE;
            }
            setShadowLayer(f, C10370av.LIZLLL(c11770dB2.LIZIZ), C10370av.LJ(this.LIZIZ.LIZIZ), C78897Uxp.LJJJZ(this.LIZIZ.LIZ));
        }
    }

    public final void LIZLLL(C22080to c22080to) {
        if (c22080to != null && !o.LJ(this.LIZ, c22080to)) {
            this.LIZ = c22080to;
            setUnderlineText(c22080to.LIZ(C22080to.LIZJ));
            setStrikeThruText(this.LIZ.LIZ(C22080to.LIZLLL));
        }
    }

    public final void LIZ(AbstractC11740d8 abstractC11740d8, long j, float f) {
        C10430b1 c10430b1;
        if (abstractC11740d8 == null) {
            setShader(null);
            this.LIZJ = null;
            this.LIZLLL = null;
        } else {
            if (abstractC11740d8 instanceof C32691Qb) {
                LIZIZ(C86793Y4n.LJJIJIIJI(f, ((C32691Qb) abstractC11740d8).LIZIZ));
                return;
            }
            if (!(abstractC11740d8 instanceof AbstractC32681Qa)) {
                return;
            }
            if ((getShader() == null || !o.LJ(this.LIZJ, abstractC11740d8) || (c10430b1 = this.LIZLLL) == null || !C10430b1.LIZ(c10430b1.LIZ, j)) && j != C10430b1.LIZJ) {
                this.LIZJ = abstractC11740d8;
                this.LIZLLL = new C10430b1(j);
                setShader(((AbstractC32681Qa) abstractC11740d8).LIZIZ(j));
            }
            C78688UuS.LJJLIIIJILLIZJL(this, f);
        }
    }
}
