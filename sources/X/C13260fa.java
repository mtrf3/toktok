package X;

/* renamed from: X.0fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13260fa {
    public static final /* synthetic */ int LIZLLL = 0;
    public final AbstractC13230fX LIZ;
    public final AbstractC13230fX LIZIZ;
    public final float[] LIZJ;

    public void LIZ(float[] fArr) {
        this.LIZ.LJ(fArr);
        float[] fArr2 = this.LIZJ;
        if (fArr2 != null) {
            fArr[0] = fArr[0] * fArr2[0];
            fArr[1] = fArr[1] * fArr2[1];
            fArr[2] = fArr[2] * fArr2[2];
        }
        this.LIZIZ.LIZ(fArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r1 != false) goto L13;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13260fa(X.AbstractC13230fX r12, X.AbstractC13230fX r13, int r14) {
        /*
            r11 = this;
            long r2 = r12.LIZIZ
            long r0 = X.C13210fV.LIZ
            boolean r2 = X.C13210fV.LIZ(r2, r0)
            if (r2 == 0) goto L6e
            X.1RW r2 = X.C13270fb.LIZIZ
            X.0fX r4 = X.C79146V4k.LJIILLIIL(r12, r2)
        L10:
            long r2 = r13.LIZIZ
            boolean r2 = X.C13210fV.LIZ(r2, r0)
            if (r2 == 0) goto L6c
            X.1RW r2 = X.C13270fb.LIZIZ
            X.0fX r5 = X.C79146V4k.LJIILLIIL(r13, r2)
        L1e:
            r10 = 1
            r9 = 0
            r8 = 3
            if (r14 != r8) goto L33
            long r2 = r12.LIZIZ
            boolean r6 = X.C13210fV.LIZ(r2, r0)
            long r2 = r13.LIZIZ
            boolean r1 = X.C13210fV.LIZ(r2, r0)
            if (r6 == 0) goto L38
            if (r1 == 0) goto L3b
        L33:
            r3 = 0
        L34:
            r11.<init>(r4, r5, r3)
            return
        L38:
            if (r1 == 0) goto L33
            r12 = r13
        L3b:
            X.1RU r12 = (X.C1RU) r12
            if (r6 == 0) goto L69
            X.1RW r0 = r12.LIZLLL
            float[] r7 = r0.L()
        L45:
            if (r1 == 0) goto L66
            X.1RW r0 = r12.LIZLLL
            float[] r6 = r0.L()
        L4d:
            float[] r3 = new float[r8]
            r1 = r7[r9]
            r0 = r6[r9]
            float r1 = r1 / r0
            r3[r9] = r1
            r1 = r7[r10]
            r0 = r6[r10]
            float r1 = r1 / r0
            r3[r10] = r1
            r2 = 2
            r1 = r7[r2]
            r0 = r6[r2]
            float r1 = r1 / r0
            r3[r2] = r1
            goto L34
        L66:
            float[] r6 = X.C13270fb.LJ
            goto L4d
        L69:
            float[] r7 = X.C13270fb.LJ
            goto L45
        L6c:
            r5 = r13
            goto L1e
        L6e:
            r4 = r12
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13260fa.<init>(X.0fX, X.0fX, int):void");
    }

    public C13260fa(AbstractC13230fX abstractC13230fX, AbstractC13230fX abstractC13230fX2, float[] fArr) {
        this.LIZ = abstractC13230fX;
        this.LIZIZ = abstractC13230fX2;
        this.LIZJ = fArr;
    }
}
