package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class n1 {
    public byte[] LIZ = new byte[4096];
    public int LIZIZ = 0;
    public int LJ = -1;
    public long LIZJ = -1;
    public boolean LJII = false;
    public int LJFF = 30;
    public long LIZLLL = -1;
    public int LJI = -1;
    public String LJIIIIZZ = null;

    public final int LIZJ(int i, int i2, byte[] bArr, int i3) {
        int i4 = this.LIZIZ;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.LIZ, this.LIZIZ, min);
        int i5 = this.LIZIZ + min;
        this.LIZIZ = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }

    public final e2 LIZIZ() {
        int i = this.LIZIZ;
        int i2 = this.LJFF;
        if (i < i2) {
            String str = this.LJIIIIZZ;
            long j = this.LIZLLL;
            return new e2(this.LJI, j, str, true, this.LJII, Arrays.copyOf(this.LIZ, i));
        }
        String str2 = this.LJIIIIZZ;
        long j2 = this.LIZLLL;
        e2 e2Var = new e2(this.LJI, j2, str2, false, this.LJII, Arrays.copyOf(this.LIZ, i2));
        this.LIZIZ = 0;
        this.LJ = -1;
        this.LIZJ = -1L;
        this.LJII = false;
        this.LJFF = 30;
        this.LIZLLL = -1L;
        this.LJI = -1;
        this.LJIIIIZZ = null;
        return e2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
    
        if (r1 >= r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        r11.LIZ = java.util.Arrays.copyOf(r11.LIZ, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006d, code lost:
    
        if (r1 < r5) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
    
        r1 = r1 + r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ(int r12, byte[] r13, int r14) {
        /*
            r11 = this;
            r4 = 30
            int r3 = r11.LIZJ(r4, r12, r13, r14)
            r2 = -1
            if (r3 == r2) goto L9f
            long r0 = r11.LIZJ
            r6 = -1
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 != 0) goto L7f
            byte[] r5 = r11.LIZ
            r10 = 0
            int r1 = com.google.android.play.core.assetpacks.l1.LIZIZ(r10, r5)
            r0 = 2
            int r0 = com.google.android.play.core.assetpacks.l1.LIZIZ(r0, r5)
            int r0 = r0 << 16
            r0 = r0 | r1
            long r0 = (long) r0
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r8
            r11.LIZJ = r0
            r6 = 67324752(0x4034b50, double:3.3262847E-316)
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 != 0) goto L7c
            r11.LJII = r10
            byte[] r5 = r11.LIZ
            r0 = 18
            int r1 = com.google.android.play.core.assetpacks.l1.LIZIZ(r0, r5)
            r0 = 20
            int r0 = com.google.android.play.core.assetpacks.l1.LIZIZ(r0, r5)
            int r0 = r0 << 16
            r0 = r0 | r1
            long r0 = (long) r0
            long r0 = r0 & r8
            r11.LIZLLL = r0
            byte[] r1 = r11.LIZ
            r0 = 8
            int r0 = com.google.android.play.core.assetpacks.l1.LIZIZ(r0, r1)
            r11.LJI = r0
            byte[] r1 = r11.LIZ
            r0 = 26
            int r0 = com.google.android.play.core.assetpacks.l1.LIZIZ(r0, r1)
            r11.LJ = r0
            byte[] r1 = r11.LIZ
            r0 = 28
            int r1 = com.google.android.play.core.assetpacks.l1.LIZIZ(r0, r1)
            int r0 = r11.LJ
            int r5 = r0 + 30
            int r5 = r5 + r1
            r11.LJFF = r5
            byte[] r0 = r11.LIZ
            int r1 = r0.length
            if (r1 >= r5) goto L7f
        L6f:
            int r1 = r1 + r1
            if (r1 >= r5) goto L73
            goto L6f
        L73:
            byte[] r0 = r11.LIZ
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r11.LIZ = r0
            goto L7f
        L7c:
            r0 = 1
            r11.LJII = r0
        L7f:
            int r0 = r11.LJFF
            int r12 = r12 + r3
            int r14 = r14 - r3
            int r0 = r11.LIZJ(r0, r12, r13, r14)
            if (r0 != r2) goto L8a
            return r2
        L8a:
            int r3 = r3 + r0
            boolean r0 = r11.LJII
            if (r0 != 0) goto L9e
            java.lang.String r0 = r11.LJIIIIZZ
            if (r0 != 0) goto L9e
            java.lang.String r2 = new java.lang.String
            byte[] r1 = r11.LIZ
            int r0 = r11.LJ
            r2.<init>(r1, r4, r0)
            r11.LJIIIIZZ = r2
        L9e:
            return r3
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.n1.LIZ(int, byte[], int):int");
    }
}
