package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes12.dex */
public class PNP extends LinearLayout {
    public PNQ LJLIL;

    public PNQ getKeyBoardObservable() {
        return this.LJLIL;
    }

    public void setKeyBoardObservable(PNQ pnq) {
        this.LJLIL = pnq;
    }

    public PNP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = new PNQ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        r9.LIZ = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0097, code lost:
    
        if (r0 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0090, code lost:
    
        r7 = r9.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0092, code lost:
    
        if (r7 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0094, code lost:
    
        r9.LIZIZ = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        if (r7 != r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009d, code lost:
    
        r7 = r7 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ab, code lost:
    
        if (java.lang.Math.abs(r7) >= X.KL2.LIZJ(r2, 80.0f)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
    
        if (android.os.Build.VERSION.SDK_INT != 30) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b4, code lost:
    
        r3 = java.lang.System.nanoTime() / 1000000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        if ((r3 - r9.LIZJ) <= 100) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        r9.LIZJ = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        java.lang.Math.abs(r7);
        r9.LIZIZ = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (r0 == 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1 == 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        r0 = (android.view.WindowManager) X.C16880lQ.LLILL(r2, "window");
        r1 = new android.graphics.Point();
        r0.getDefaultDisplay().getSize(r1);
        r1 = r1.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r8 <= r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008a, code lost:
    
        r0 = r9.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008c, code lost:
    
        if (r0 != 0) goto L33;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            X.PNQ r9 = r10.LJLIL
            if (r9 == 0) goto L2d
            android.content.Context r2 = r10.getContext()
            int r8 = android.view.View.MeasureSpec.getSize(r12)
            int r1 = X.C79012Uzg.LJLJJLL
            r0 = 3
            r3 = 1
            if (r1 == r0) goto L31
            if (r1 != r3) goto L90
        L14:
            java.lang.String r0 = "window"
            java.lang.Object r0 = X.C16880lQ.LLILL(r2, r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getSize(r1)
            int r1 = r1.y
            if (r8 <= r1) goto L8a
        L2d:
            super.onMeasure(r11, r12)
            return
        L31:
            java.lang.String r6 = "ro.vivo.os.name"
            r5 = 0
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Ld4
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Ld4
            java.lang.String r0 = "getprop "
            r1.append(r0)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Ld4
            r1.append(r6)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Ld4
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Ld4
            java.lang.Process r0 = r4.exec(r0)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Ld4
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Ld4
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Ld4
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Ld4
            r1.<init>(r0)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Ld4
            r0 = 1024(0x400, float:1.435E-42)
            r4.<init>(r1, r0)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Ld4
            java.lang.String r0 = r4.readLine()     // Catch: java.io.IOException -> L67 java.lang.Throwable -> Lcf
            r4.close()     // Catch: java.io.IOException -> L67 java.lang.Throwable -> Lcf
            r4.close()     // Catch: java.io.IOException -> L6d
            goto L6d
        L67:
            if (r4 == 0) goto L6e
            r4.close()     // Catch: java.io.IOException -> L6e
            goto L6e
        L6d:
            r5 = r0
        L6e:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L88
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r5.toLowerCase(r0)
            java.lang.String r0 = "funtouch"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L88
            r0 = 1
        L83:
            X.C79012Uzg.LJLJJLL = r0
            if (r0 != r3) goto L90
            goto L14
        L88:
            r0 = 2
            goto L83
        L8a:
            int r0 = r9.LIZ
            if (r0 != 0) goto L97
            r9.LIZ = r1
        L90:
            int r7 = r9.LIZIZ
            if (r7 != 0) goto L9a
            r9.LIZIZ = r8
            goto L2d
        L97:
            if (r0 == r1) goto L90
            goto L2d
        L9a:
            if (r7 != r8) goto L9d
            goto L2d
        L9d:
            int r7 = r7 - r8
            int r0 = java.lang.Math.abs(r7)
            float r1 = (float) r0
            r0 = 1117782016(0x42a00000, float:80.0)
            float r0 = X.KL2.LIZJ(r2, r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lae
            goto L2d
        Lae:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 != r0) goto Lc8
            long r3 = java.lang.System.nanoTime()
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r0
            long r0 = r9.LIZJ
            long r5 = r3 - r0
            r1 = 100
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2d
            r9.LIZJ = r3
        Lc8:
            java.lang.Math.abs(r7)
            r9.LIZIZ = r8
            goto L2d
        Lcf:
            r0 = move-exception
            r4.close()     // Catch: java.io.IOException -> Ld5
            goto Ld5
        Ld4:
            r0 = move-exception
        Ld5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PNP.onMeasure(int, int):void");
    }
}
