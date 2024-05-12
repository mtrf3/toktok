package X;

import java.util.Arrays;

/* renamed from: X.PVv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64571PVv {
    public final C64533PUj LIZ;
    public boolean LIZJ;
    public int LJI;
    public int LJII;
    public int LIZIZ = Integer.MAX_VALUE;
    public PWL[] LJ = new PWL[8];
    public int LJFF = 7;
    public int LIZLLL = 4096;

    public C64571PVv(C64533PUj c64533PUj) {
        this.LIZ = c64533PUj;
    }

    public final void LIZ(int i) {
        int i2;
        if (i > 0) {
            int length = this.LJ.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.LJFF;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.LJ[length].LIZJ;
                i -= i4;
                this.LJII -= i4;
                this.LJI--;
                i3++;
                length--;
            }
            PWL[] pwlArr = this.LJ;
            int i5 = i2 + 1;
            System.arraycopy(pwlArr, i5, pwlArr, i5 + i3, this.LJI);
            PWL[] pwlArr2 = this.LJ;
            int i6 = this.LJFF + 1;
            Arrays.fill(pwlArr2, i6, i6 + i3, (Object) null);
            this.LJFF += i3;
        }
    }

    public final void LIZIZ(PWL pwl) {
        int i = pwl.LIZJ;
        int i2 = this.LIZLLL;
        if (i > i2) {
            Arrays.fill(this.LJ, (Object) null);
            this.LJFF = this.LJ.length - 1;
            this.LJI = 0;
            this.LJII = 0;
            return;
        }
        LIZ((this.LJII + i) - i2);
        int i3 = this.LJI + 1;
        PWL[] pwlArr = this.LJ;
        if (i3 > pwlArr.length) {
            PWL[] pwlArr2 = new PWL[pwlArr.length * 2];
            System.arraycopy(pwlArr, 0, pwlArr2, pwlArr.length, pwlArr.length);
            this.LJFF = this.LJ.length - 1;
            this.LJ = pwlArr2;
        }
        int i4 = this.LJFF;
        this.LJFF = i4 - 1;
        this.LJ[i4] = pwl;
        this.LJI++;
        this.LJII += i;
    }

    public final void LIZJ(C64537PUn c64537PUn) {
        PWZ.LIZLLL.getClass();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < c64537PUn.size(); i++) {
            j2 += PWZ.LIZJ[c64537PUn.getByte(i) & 255];
        }
        if (((int) ((j2 + 7) >> 3)) < c64537PUn.size()) {
            C64533PUj c64533PUj = new C64533PUj();
            PWZ.LIZLLL.getClass();
            int i2 = 0;
            for (int i3 = 0; i3 < c64537PUn.size(); i3++) {
                int i4 = c64537PUn.getByte(i3) & 255;
                int i5 = PWZ.LIZIZ[i4];
                byte b = PWZ.LIZJ[i4];
                j = (j << b) | i5;
                i2 += b;
                while (i2 >= 8) {
                    i2 -= 8;
                    c64533PUj.writeByte((int) (j >> i2));
                }
            }
            if (i2 > 0) {
                c64533PUj.writeByte((int) ((j << (8 - i2)) | (255 >>> i2)));
            }
            C64537PUn LJIIL = c64533PUj.LJIIL();
            LJ(LJIIL.size(), 127, 128);
            C64533PUj c64533PUj2 = this.LIZ;
            c64533PUj2.getClass();
            LJIIL.write$jvm(c64533PUj2);
            return;
        }
        LJ(c64537PUn.size(), 127, 0);
        C64533PUj c64533PUj3 = this.LIZ;
        c64533PUj3.getClass();
        c64537PUn.write$jvm(c64533PUj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r1 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r0 != (-1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.List<X.PWL> r12) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64571PVv.LIZLLL(java.util.List):void");
    }

    public final void LJ(int i, int i2, int i3) {
        if (i < i2) {
            this.LIZ.LJJIII(i | i3);
            return;
        }
        this.LIZ.LJJIII(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.LIZ.LJJIII(128 | (i4 & 127));
            i4 >>>= 7;
        }
        this.LIZ.LJJIII(i4);
    }
}
