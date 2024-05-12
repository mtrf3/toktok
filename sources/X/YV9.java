package X;

/* loaded from: classes16.dex */
public final class YV9 extends YVB {
    public final char[] LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public YV9() {
        /*
            r6 = this;
            X.YVC r5 = new X.YVC
            java.lang.String r0 = "0123456789ABCDEF"
            char[] r1 = r0.toCharArray()
            java.lang.String r0 = "base16()"
            r5.<init>(r0, r1)
            r0 = 0
            r6.<init>(r5, r0)
            r0 = 512(0x200, float:7.17E-43)
            char[] r0 = new char[r0]
            r6.LIZLLL = r0
            char[] r0 = r5.LIZIZ
            int r1 = r0.length
            r0 = 16
            r4 = 0
            if (r1 != r0) goto L39
        L1f:
            char[] r3 = r6.LIZLLL
            int r0 = r4 >>> 4
            char[] r2 = r5.LIZIZ
            char r0 = r2[r0]
            r3[r4] = r0
            r1 = r4 | 256(0x100, float:3.59E-43)
            r0 = r4 & 15
            char r0 = r2[r0]
            r3[r1] = r0
            int r4 = r4 + 1
            r0 = 256(0x100, float:3.59E-43)
            if (r4 >= r0) goto L38
            goto L1f
        L38:
            return
        L39:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YV9.<init>():void");
    }

    @Override // X.YVB, X.YVA
    public final void LIZ(Appendable appendable, byte[] bArr, int i) {
        C47265Ign.LIZJ(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            StringBuilder sb = (StringBuilder) appendable;
            sb.append(this.LIZLLL[i3]);
            sb.append(this.LIZLLL[i3 | 256]);
        }
    }
}
