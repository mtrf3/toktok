package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes7.dex */
public final class g0 extends FilterInputStream {
    public final n1 LJLIL;
    public byte[] LJLILLLLZI;
    public long LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    public g0(InputStream inputStream) {
        super(inputStream);
        this.LJLIL = new n1();
        this.LJLILLLLZI = new byte[4096];
        this.LJLJJI = false;
        this.LJLJJL = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r8.LJLJJL == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (LIZIZ(30) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r8.LJLJJI = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        return r8.LJLIL.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        r1 = r8.LJLIL.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r1.LJ == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r8.LJLJJL = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r1.LIZIZ == 4294967295L) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        r6 = r8.LJLIL.LJFF - 30;
        r3 = r6;
        r5 = r8.LJLILLLLZI.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r3 <= r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r5 = r5 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r5 < r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r8.LJLILLLLZI = java.util.Arrays.copyOf(r8.LJLILLLLZI, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0006, code lost:
    
        if (r8.LJLJI > 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (LIZIZ(r6) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        r8.LJLJJI = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        return r8.LJLIL.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r2 = r8.LJLIL.LIZIZ();
        r8.LJLJI = r2.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        throw new com.google.android.play.core.assetpacks.m0("Files bigger than 4GiB are not supported.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0027, code lost:
    
        return new com.google.android.play.core.assetpacks.e2(-1, -1, null, false, false, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        r2 = r8.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (read(r2, 0, r2.length) != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r8.LJLJJI != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.play.core.assetpacks.e2 LIZ() {
        /*
            r8 = this;
            long r3 = r8.LJLJI
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L13
        L8:
            byte[] r2 = r8.LJLILLLLZI
            int r1 = r2.length
            r0 = 0
            int r1 = r8.read(r2, r0, r1)
            r0 = -1
            if (r1 != r0) goto L8
        L13:
            boolean r0 = r8.LJLJJI
            if (r0 != 0) goto L1b
            boolean r0 = r8.LJLJJL
            if (r0 == 0) goto L28
        L1b:
            com.google.android.play.core.assetpacks.e2 r0 = new com.google.android.play.core.assetpacks.e2
            r4 = 0
            r2 = -1
            r1 = -1
            r5 = 0
            r6 = r5
            r7 = r4
            r0.<init>(r1, r2, r4, r5, r6, r7)
            return r0
        L28:
            r0 = 30
            boolean r0 = r8.LIZIZ(r0)
            r7 = 1
            if (r0 != 0) goto L3a
            r8.LJLJJI = r7
            com.google.android.play.core.assetpacks.n1 r0 = r8.LJLIL
            com.google.android.play.core.assetpacks.e2 r0 = r0.LIZIZ()
            return r0
        L3a:
            com.google.android.play.core.assetpacks.n1 r0 = r8.LJLIL
            com.google.android.play.core.assetpacks.e2 r1 = r0.LIZIZ()
            boolean r0 = r1.LJ
            if (r0 == 0) goto L47
            r8.LJLJJL = r7
            return r1
        L47:
            long r3 = r1.LIZIZ
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L89
            com.google.android.play.core.assetpacks.n1 r0 = r8.LJLIL
            int r0 = r0.LJFF
            int r6 = r0 + (-30)
            long r3 = (long) r6
            byte[] r0 = r8.LJLILLLLZI
            int r5 = r0.length
            long r1 = (long) r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6f
        L61:
            int r5 = r5 + r5
            long r1 = (long) r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L61
            byte[] r0 = r8.LJLILLLLZI
            byte[] r0 = java.util.Arrays.copyOf(r0, r5)
            r8.LJLILLLLZI = r0
        L6f:
            boolean r0 = r8.LIZIZ(r6)
            if (r0 != 0) goto L7e
            r8.LJLJJI = r7
            com.google.android.play.core.assetpacks.n1 r0 = r8.LJLIL
            com.google.android.play.core.assetpacks.e2 r0 = r0.LIZIZ()
            return r0
        L7e:
            com.google.android.play.core.assetpacks.n1 r0 = r8.LJLIL
            com.google.android.play.core.assetpacks.e2 r2 = r0.LIZIZ()
            long r0 = r2.LIZIZ
            r8.LJLJI = r0
            return r2
        L89:
            com.google.android.play.core.assetpacks.m0 r1 = new com.google.android.play.core.assetpacks.m0
            java.lang.String r0 = "Files bigger than 4GiB are not supported."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.g0.LIZ():com.google.android.play.core.assetpacks.e2");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final boolean LIZIZ(int i) {
        int max = Math.max(0, super.read(this.LJLILLLLZI, 0, i));
        if (max != i) {
            int i2 = i - max;
            if (Math.max(0, super.read(this.LJLILLLLZI, max, i2)) != i2) {
                this.LJLIL.LIZ(0, this.LJLILLLLZI, max);
                return false;
            }
        }
        this.LJLIL.LIZ(0, this.LJLILLLLZI, i);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.LJLJI;
        if (j <= 0 || this.LJLJJI) {
            return -1;
        }
        int max = Math.max(0, super.read(bArr, i, (int) Math.min(j, i2)));
        this.LJLJI -= max;
        if (max == 0) {
            this.LJLJJI = true;
            return 0;
        }
        return max;
    }
}
