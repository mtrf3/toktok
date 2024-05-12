package X;

/* loaded from: classes16.dex */
public final class YVD extends YVB {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public YVD(java.lang.String r3, java.lang.String r4, java.lang.Character r5) {
        /*
            r2 = this;
            X.YVC r1 = new X.YVC
            char[] r0 = r4.toCharArray()
            r1.<init>(r3, r0)
            r2.<init>(r1, r5)
            char[] r0 = r1.LIZIZ
            int r1 = r0.length
            r0 = 64
            if (r1 != r0) goto L14
            return
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YVD.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    @Override // X.YVB, X.YVA
    public final void LIZ(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        C47265Ign.LIZJ(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            StringBuilder sb = (StringBuilder) appendable;
            sb.append(this.LIZIZ.LIZIZ[i6 >>> 18]);
            sb.append(this.LIZIZ.LIZIZ[(i6 >>> 12) & 63]);
            sb.append(this.LIZIZ.LIZIZ[(i6 >>> 6) & 63]);
            sb.append(this.LIZIZ.LIZIZ[i6 & 63]);
            i2 = i5 + 1;
        }
        if (i2 < i) {
            LIZJ(appendable, bArr, i2, i - i2);
        }
    }
}
