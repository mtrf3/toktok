package X;

import android.os.Bundle;

/* renamed from: X.VFd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79425VFd extends AbstractC79424VFc {
    public C79426VFe LJIIJJI;
    public C79426VFe LJIIL;
    public int LJIILIIL;
    public float LJIILJJIL;
    public int LJIILL;

    @Override // X.AbstractC79424VFc
    public final AbstractC79424VFc LJ() {
        C79426VFe c79426VFe = this.LJIIJJI;
        if (c79426VFe != null) {
            c79426VFe.LJ();
            this.LJIIJJI = null;
        }
        C79426VFe c79426VFe2 = this.LJIIL;
        if (c79426VFe2 != null) {
            c79426VFe2.LJ();
            this.LJIIL = null;
        }
        int i = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release,this:");
        LIZ.append(this);
        C48284IxE.LIZ(2, i, "TR_GLSelectiveGaussianBlurFilter3", X1D.LIZIZ(LIZ));
        AbstractC79424VFc abstractC79424VFc = this.LJIIIIZZ;
        LJFF();
        return abstractC79424VFc;
    }

    public C79425VFd(int i) {
        super(i, 15);
        this.LJIILIIL = 2;
        this.LJIILJJIL = 2.0f;
        this.LIZ = 15;
        this.LIZJ = 1;
        this.LIZLLL = 6;
        int i2 = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new,this:");
        LIZ.append(toString());
        C48284IxE.LIZ(2, i2, "TR_GLSelectiveGaussianBlurFilter3", X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC79424VFc
    public final int LIZIZ(Bundle bundle) {
        int i;
        super.LIZIZ(bundle);
        this.LJIILJJIL = bundle.getFloat("strength", -1.0f);
        int i2 = bundle.getInt("repeat_type", 2);
        if (this.LJIILJJIL > 1.0f && i2 != 3) {
            i = 2;
        } else {
            i = 1;
        }
        this.LJIILIIL = i;
        int i3 = bundle.getInt("texture_type");
        C79426VFe c79426VFe = this.LJIIJJI;
        if (c79426VFe != null) {
            c79426VFe.LJ();
            this.LJIIJJI = null;
        }
        if (i3 == 36197) {
            this.LJIIJJI = new C79426VFe(this.LJIIIZ);
            bundle.putInt("texture_type", 36197);
            this.LJIIJJI.LIZIZ(bundle);
            C79426VFe c79426VFe2 = this.LJIIJJI;
            c79426VFe2.LJI = this.LJI;
            c79426VFe2.LJII(20006, 0);
        }
        C79426VFe c79426VFe3 = this.LJIIL;
        if (c79426VFe3 != null) {
            c79426VFe3.LJ();
        }
        this.LJIIL = new C79426VFe(this.LJIIIZ);
        bundle.putInt("texture_type", 3553);
        this.LJIIL.LIZIZ(bundle);
        C79426VFe c79426VFe4 = this.LJIIL;
        c79426VFe4.getClass();
        c79426VFe4.LJI = this.LJI;
        c79426VFe4.LJII(20006, 0);
        this.LIZIZ = i3;
        int i4 = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init,texFormat:");
        C79062V1e.LJII(LIZ, this.LIZIZ, LIZ, 2, i4, "TR_GLSelectiveGaussianBlurFilter3");
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r3 == null) goto L14;
     */
    @Override // X.AbstractC79424VFc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.VFZ LIZLLL(X.VFZ r7, X.VG6 r8) {
        /*
            r6 = this;
            X.VFx r1 = r6.LJ
            if (r1 == 0) goto L9
            int r0 = r6.LIZ
            r1.currentEffectProcessBegin(r0)
        L9:
            r0 = 0
            r6.LJIILL = r0
            X.VFe r1 = r6.LJIIJJI
            r5 = 0
            if (r1 == 0) goto L74
            X.VFx r0 = r6.LJ
            r1.LJIIJ(r0)
            X.VFe r2 = r6.LJIIJJI
            int r1 = r6.LJIILL
            r2.LJJJZ = r1
            int r0 = r6.LJIILIIL
            int r0 = r0 + (-1)
            if (r1 < r0) goto L72
            boolean r0 = r6.LJIIJ
            if (r0 == 0) goto L72
            r0 = r5
        L27:
            X.VFZ r3 = r2.LIZLLL(r7, r0)
            int r0 = r6.LJIILL
            int r0 = r0 + 1
            r6.LJIILL = r0
            X.VFe r0 = r6.LJIIJJI
            float[] r4 = r0.LJJLIIIJJI
            if (r3 != 0) goto L38
        L37:
            r3 = r7
        L38:
            X.VFe r0 = r6.LJIIL
            if (r0 == 0) goto L76
        L3c:
            int r1 = r6.LJIILL
            int r0 = r6.LJIILIIL
            if (r1 >= r0) goto L76
            X.VFe r1 = r6.LJIIL
            X.VFx r0 = r6.LJ
            r1.LJIIJ(r0)
            X.VFe r2 = r6.LJIIL
            int r1 = r6.LJIILL
            r2.LJJJZ = r1
            if (r4 == 0) goto L53
            r2.LJJLIIIJJI = r4
        L53:
            int r0 = r6.LJIILIIL
            int r0 = r0 + (-1)
            if (r1 < r0) goto L70
            boolean r0 = r6.LJIIJ
            if (r0 == 0) goto L70
            r0 = r5
        L5e:
            X.VFZ r3 = r2.LIZLLL(r3, r0)
            int r0 = r6.LJIILL
            int r0 = r0 + 1
            r6.LJIILL = r0
            X.VFe r0 = r6.LJIIL
            float[] r4 = r0.LJJLIIIJJI
            if (r3 != 0) goto L3c
            r3 = r7
            goto L3c
        L70:
            r0 = r8
            goto L5e
        L72:
            r0 = r8
            goto L27
        L74:
            r4 = r5
            goto L37
        L76:
            android.opengl.GLES20.glFinish()
            X.VFx r1 = r6.LJ
            if (r1 == 0) goto L82
            int r0 = r6.LIZ
            r1.currentEffectProcessEnd(r0)
        L82:
            boolean r0 = r6.LJIIJ
            if (r0 == 0) goto L87
        L86:
            return r5
        L87:
            r5 = r3
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79425VFd.LIZLLL(X.VFZ, X.VG6):X.VFZ");
    }
}
