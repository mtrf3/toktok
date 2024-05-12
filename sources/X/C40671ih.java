package X;

import android.graphics.Paint;

/* renamed from: X.1ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40671ih extends C1ED {
    public C0OQ LJ;
    public float LJFF;
    public C0OQ LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public Paint.Cap LJIIL;
    public Paint.Join LJIILIIL;
    public float LJIILJJIL;

    @Override // X.C0FO
    public final boolean LIZ() {
        if (this.LJI.LIZIZ() || this.LJ.LIZIZ()) {
            return true;
        }
        return false;
    }

    public int getFillColor() {
        return this.LJI.LIZJ;
    }

    public int getStrokeColor() {
        return this.LJ.LIZJ;
    }

    public C40671ih() {
        this.LJII = 1.0f;
        this.LJIIIIZZ = 1.0f;
        this.LJIIJ = 1.0f;
        this.LJIIL = Paint.Cap.BUTT;
        this.LJIILIIL = Paint.Join.MITER;
        this.LJIILJJIL = 4.0f;
    }

    public float getFillAlpha() {
        return this.LJIIIIZZ;
    }

    public float getStrokeAlpha() {
        return this.LJII;
    }

    public float getStrokeWidth() {
        return this.LJFF;
    }

    public float getTrimPathEnd() {
        return this.LJIIJ;
    }

    public float getTrimPathOffset() {
        return this.LJIIJJI;
    }

    public float getTrimPathStart() {
        return this.LJIIIZ;
    }

    public C40671ih(C40671ih c40671ih) {
        super(c40671ih);
        this.LJII = 1.0f;
        this.LJIIIIZZ = 1.0f;
        this.LJIIJ = 1.0f;
        this.LJIIL = Paint.Cap.BUTT;
        this.LJIILIIL = Paint.Join.MITER;
        this.LJIILJJIL = 4.0f;
        this.LJ = c40671ih.LJ;
        this.LJFF = c40671ih.LJFF;
        this.LJII = c40671ih.LJII;
        this.LJI = c40671ih.LJI;
        this.LIZJ = c40671ih.LIZJ;
        this.LJIIIIZZ = c40671ih.LJIIIIZZ;
        this.LJIIIZ = c40671ih.LJIIIZ;
        this.LJIIJ = c40671ih.LJIIJ;
        this.LJIIJJI = c40671ih.LJIIJJI;
        this.LJIIL = c40671ih.LJIIL;
        this.LJIILIIL = c40671ih.LJIILIIL;
        this.LJIILJJIL = c40671ih.LJIILJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // X.C0FO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(int[] r6) {
        /*
            r5 = this;
            X.0OQ r2 = r5.LJI
            boolean r0 = r2.LIZIZ()
            r4 = 1
            if (r0 == 0) goto L36
            android.content.res.ColorStateList r1 = r2.LIZIZ
            int r0 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r0)
            int r0 = r2.LIZJ
            if (r1 == r0) goto L36
            r2.LIZJ = r1
            r3 = 1
        L1a:
            X.0OQ r2 = r5.LJ
            boolean r0 = r2.LIZIZ()
            if (r0 == 0) goto L34
            android.content.res.ColorStateList r1 = r2.LIZIZ
            int r0 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r0)
            int r0 = r2.LIZJ
            if (r1 == r0) goto L34
            r2.LIZJ = r1
        L32:
            r4 = r4 | r3
            return r4
        L34:
            r4 = 0
            goto L32
        L36:
            r3 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40671ih.LIZIZ(int[]):boolean");
    }

    public void setFillAlpha(float f) {
        this.LJIIIIZZ = f;
    }

    public void setFillColor(int i) {
        this.LJI.LIZJ = i;
    }

    public void setStrokeAlpha(float f) {
        this.LJII = f;
    }

    public void setStrokeColor(int i) {
        this.LJ.LIZJ = i;
    }

    public void setStrokeWidth(float f) {
        this.LJFF = f;
    }

    public void setTrimPathEnd(float f) {
        this.LJIIJ = f;
    }

    public void setTrimPathOffset(float f) {
        this.LJIIJJI = f;
    }

    public void setTrimPathStart(float f) {
        this.LJIIIZ = f;
    }
}
