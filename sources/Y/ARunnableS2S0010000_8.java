package Y;

import X.J28;

/* loaded from: classes9.dex */
public class ARunnableS2S0010000_8 implements Runnable {
    public final int $t;
    public boolean z0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            r14 = this;
            java.lang.String r4 = " "
            java.lang.String r5 = "r"
            X.IlR r8 = new X.IlR
            r8.<init>()
            r12 = 0
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b java.io.FileNotFoundException -> L91
            java.lang.String r10 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b java.io.FileNotFoundException -> L91
            java.io.RandomAccessFile r11 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b java.io.FileNotFoundException -> L91
            java.lang.String r0 = "/proc/stat"
            r11.<init>(r0, r5)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b java.io.FileNotFoundException -> L91
            java.lang.String r0 = r11.readLine()     // Catch: java.io.IOException -> L7b java.io.FileNotFoundException -> L82 java.lang.Throwable -> L98
            java.lang.String[] r9 = r0.split(r4)     // Catch: java.io.IOException -> L7b java.io.FileNotFoundException -> L82 java.lang.Throwable -> L98
            int r3 = r9.length     // Catch: java.io.IOException -> L7b java.io.FileNotFoundException -> L82 java.lang.Throwable -> L98
            r6 = 0
            r2 = 2
        L25:
            if (r2 >= r3) goto L31
            r0 = r9[r2]     // Catch: java.io.IOException -> L7b java.io.FileNotFoundException -> L82 java.lang.Throwable -> L98
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.io.IOException -> L7b java.io.FileNotFoundException -> L82 java.lang.Throwable -> L98
            double r6 = r6 + r0
            int r2 = r2 + 1
            goto L25
        L31:
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L7b java.io.FileNotFoundException -> L82 java.lang.Throwable -> L98
            java.lang.StringBuilder r2 = X.X1D.LIZ()     // Catch: java.io.IOException -> L7b java.io.FileNotFoundException -> L82 java.lang.Throwable -> L98
            java.lang.String r0 = "/proc/"
            r2.append(r0)     // Catch: java.io.IOException -> L7b java.io.FileNotFoundException -> L82 java.lang.Throwable -> L98
            r2.append(r10)     // Catch: java.io.IOException -> L7b java.io.FileNotFoundException -> L82 java.lang.Throwable -> L98
            java.lang.String r0 = "/stat"
            r2.append(r0)     // Catch: java.io.IOException -> L7b java.io.FileNotFoundException -> L82 java.lang.Throwable -> L98
            java.lang.String r0 = X.X1D.LIZIZ(r2)     // Catch: java.io.IOException -> L7b java.io.FileNotFoundException -> L82 java.lang.Throwable -> L98
            r1.<init>(r0, r5)     // Catch: java.io.IOException -> L7b java.io.FileNotFoundException -> L82 java.lang.Throwable -> L98
            java.lang.String r0 = r1.readLine()     // Catch: java.io.IOException -> L7d java.io.FileNotFoundException -> L84 java.lang.Throwable -> L97
            java.lang.String[] r2 = r0.split(r4)     // Catch: java.io.IOException -> L7d java.io.FileNotFoundException -> L84 java.lang.Throwable -> L97
            r0 = 13
            r0 = r2[r0]     // Catch: java.io.IOException -> L7d java.io.FileNotFoundException -> L84 java.lang.Throwable -> L97
            double r4 = java.lang.Double.parseDouble(r0)     // Catch: java.io.IOException -> L7d java.io.FileNotFoundException -> L84 java.lang.Throwable -> L97
            r0 = 14
            r0 = r2[r0]     // Catch: java.io.IOException -> L7d java.io.FileNotFoundException -> L84 java.lang.Throwable -> L97
            double r12 = java.lang.Double.parseDouble(r0)     // Catch: java.io.IOException -> L7d java.io.FileNotFoundException -> L84 java.lang.Throwable -> L97
            r0 = 15
            r0 = r2[r0]     // Catch: java.io.IOException -> L7d java.io.FileNotFoundException -> L84 java.lang.Throwable -> L97
            double r9 = java.lang.Double.parseDouble(r0)     // Catch: java.io.IOException -> L7d java.io.FileNotFoundException -> L84 java.lang.Throwable -> L97
            r0 = 16
            r0 = r2[r0]     // Catch: java.io.IOException -> L7d java.io.FileNotFoundException -> L84 java.lang.Throwable -> L97
            double r2 = java.lang.Double.parseDouble(r0)     // Catch: java.io.IOException -> L7d java.io.FileNotFoundException -> L84 java.lang.Throwable -> L97
            double r4 = r4 + r12
            double r4 = r4 + r9
            double r4 = r4 + r2
            r8.LIZ = r4     // Catch: java.io.IOException -> L7d java.io.FileNotFoundException -> L84 java.lang.Throwable -> L97
            r8.LIZIZ = r6     // Catch: java.io.IOException -> L7d java.io.FileNotFoundException -> L84 java.lang.Throwable -> L97
            goto L9e
        L7b:
            r0 = move-exception
            goto L7f
        L7d:
            r0 = move-exception
            r12 = r1
        L7f:
            r1 = r12
            r12 = r11
            goto L8d
        L82:
            r0 = move-exception
            goto L86
        L84:
            r0 = move-exception
            r12 = r1
        L86:
            r1 = r12
            r12 = r11
            goto L93
        L89:
            r1 = r12
            goto L9a
        L8b:
            r0 = move-exception
            r1 = r12
        L8d:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> Lb3
            goto L9a
        L91:
            r0 = move-exception
            r1 = r12
        L93:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> Lb3
            goto L9a
        L97:
            r12 = r1
        L98:
            r1 = r12
            r12 = r11
        L9a:
            X.C47552IlQ.LIZ(r12)
            goto La1
        L9e:
            X.C47552IlQ.LIZ(r11)
        La1:
            X.C47552IlQ.LIZ(r1)
            X.IWv r2 = X.C46982IcE.LJ
            if (r2 == 0) goto Lb2
            Y.ARunnableS27S0200000_8 r1 = new Y.ARunnableS27S0200000_8
            r0 = 97
            r1.<init>(r14, r8, r0)
            r2.post(r1)
        Lb2:
            return
        Lb3:
            r0 = move-exception
            X.C47552IlQ.LIZ(r12)
            X.C47552IlQ.LIZ(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS2S0010000_8.LIZ$0():void");
    }

    public static final void run$0(ARunnableS2S0010000_8 aRunnableS2S0010000_8) {
        boolean LIZ;
        try {
            J28.LIZJ(aRunnableS2S0010000_8.z0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0010000_8 aRunnableS2S0010000_8) {
        boolean LIZ;
        try {
            aRunnableS2S0010000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S0010000_8(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }
}
