package X;

/* loaded from: classes15.dex */
public final class VQQ {
    public float LIZ;
    public float LIZIZ;
    public int LIZJ;
    public C79699VPr[] LIZLLL;
    public float[] LJ;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r6 < 1.0f) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        if (r6 < 1.0f) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        r3[r5] = r3[r5] * r6;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cc, code lost:
    
        if (r5 >= 8) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[] LIZ() {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VQQ.LIZ():float[]");
    }

    public final boolean LIZJ() {
        C79699VPr[] c79699VPrArr = this.LIZLLL;
        if (c79699VPrArr != null) {
            for (C79699VPr c79699VPr : c79699VPrArr) {
                if (c79699VPr != null) {
                    if (!VQC.LIZ(c79699VPr.LIZ) && c79699VPr.LIZ > 0.0f) {
                        return true;
                    }
                    if (!VQC.LIZ(c79699VPr.LIZIZ) && c79699VPr.LIZIZ > 0.0f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final float[] LIZIZ(float f, boolean z) {
        VQR[] vqrArr;
        float[] fArr = new float[8];
        int i = 0;
        if (this.LIZLLL != null) {
            if (z) {
                vqrArr = new VQR[]{VQR.TOP_START, VQR.TOP_END, VQR.BOTTOM_END, VQR.BOTTOM_START};
            } else {
                vqrArr = new VQR[]{VQR.TOP_LEFT, VQR.TOP_RIGHT, VQR.BOTTOM_RIGHT, VQR.BOTTOM_LEFT};
            }
            while (i < vqrArr.length) {
                C79699VPr c79699VPr = this.LIZLLL[vqrArr[i].ordinal()];
                int i2 = i * 2;
                int i3 = i2 + 1;
                if (c79699VPr == null) {
                    fArr[i3] = f;
                    fArr[i2] = f;
                } else {
                    if (VQC.LIZ(c79699VPr.LIZ)) {
                        fArr[i2] = f;
                    } else if (c79699VPr.LIZJ == EnumC79545VJt.PERCENTAGE) {
                        fArr[i2] = c79699VPr.LIZ * this.LIZ * 0.01f;
                    } else {
                        fArr[i2] = c79699VPr.LIZ;
                    }
                    if (VQC.LIZ(c79699VPr.LIZIZ)) {
                        fArr[i3] = f;
                    } else if (c79699VPr.LIZLLL == EnumC79545VJt.PERCENTAGE) {
                        fArr[i3] = c79699VPr.LIZIZ * this.LIZIZ * 0.01f;
                    } else {
                        fArr[i3] = c79699VPr.LIZIZ;
                    }
                }
                i++;
            }
            return fArr;
        }
        do {
            fArr[i] = f;
            i++;
        } while (i < 8);
        return fArr;
    }

    public final boolean LIZLLL(int i, C79699VPr c79699VPr) {
        if (i >= 0 && i < 8) {
            if (this.LIZLLL == null) {
                this.LIZLLL = new C79699VPr[8];
            }
            C79699VPr c79699VPr2 = this.LIZLLL[i];
            if (c79699VPr2 == null || !VJJ.LIZ(c79699VPr.LIZ, c79699VPr2.LIZ) || !VJJ.LIZ(c79699VPr.LIZIZ, c79699VPr2.LIZIZ) || c79699VPr.LIZJ != c79699VPr2.LIZJ || c79699VPr.LIZLLL != c79699VPr2.LIZLLL) {
                this.LIZLLL[i] = c79699VPr;
                return true;
            }
        }
        return false;
    }

    public final boolean LJ(float f, float f2) {
        if (f < 0.0f || VQC.LIZ(f)) {
            f = 0.0f;
        }
        if (f2 < 0.0f || VQC.LIZ(f2)) {
            f2 = 0.0f;
        }
        if (VJJ.LIZ(f, this.LIZ) && VJJ.LIZ(f2, this.LIZIZ)) {
            if (this.LJ == null) {
                return true;
            }
            return false;
        }
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LJ = null;
        return true;
    }
}
