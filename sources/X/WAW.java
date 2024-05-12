package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* loaded from: classes15.dex */
public final class WAW {
    public final WAL LIZ;
    public final WAV LIZIZ;
    public final Paint LIZJ;

    public final boolean LIZIZ(C81840WAa c81840WAa) {
        if (c81840WAa.LIZ == 0 && c81840WAa.LIZIZ == 0 && c81840WAa.LIZJ == this.LIZ.LJ() && c81840WAa.LIZLLL == this.LIZ.LIZLLL()) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(int i) {
        if (i == 0) {
            return true;
        }
        C81840WAa frameInfo = this.LIZ.getFrameInfo(i);
        C81840WAa frameInfo2 = this.LIZ.getFrameInfo(i - 1);
        if (frameInfo.LJ == WAZ.NO_BLEND && LIZIZ(frameInfo)) {
            return true;
        }
        if (frameInfo2.LJFF == WAY.DISPOSE_TO_BACKGROUND && LIZIZ(frameInfo2)) {
            return true;
        }
        return false;
    }

    public WAW(WAL wal, WAV wav) {
        this.LIZ = wal;
        this.LIZIZ = wav;
        Paint paint = new Paint();
        this.LIZJ = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final void LIZ(Canvas canvas, C81840WAa c81840WAa) {
        canvas.drawRect(c81840WAa.LIZ, c81840WAa.LIZIZ, r2 + c81840WAa.LIZJ, r1 + c81840WAa.LIZLLL, this.LIZJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r5 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r9, android.graphics.Bitmap r10) {
        /*
            r8 = this;
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r10)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC
            r5 = 0
            r3.drawColor(r5, r0)
            boolean r0 = r8.LIZJ(r9)
            if (r0 != 0) goto L82
            int r6 = r9 + (-1)
        L13:
            if (r6 < 0) goto L86
            X.WAL r0 = r8.LIZ
            X.WAa r2 = r0.getFrameInfo(r6)
            X.WAY r1 = r2.LJFF
            X.WAY r0 = X.WAY.DISPOSE_DO_NOT
            if (r1 != r0) goto L49
            X.WAX r0 = X.WAX.REQUIRED
        L23:
            int r1 = r0.ordinal()
            if (r1 == 0) goto L32
            r0 = 1
            if (r1 == r0) goto L84
            r0 = 3
            if (r1 == r0) goto L47
        L2f:
            int r6 = r6 + (-1)
            goto L13
        L32:
            X.WAL r0 = r8.LIZ
            X.WAa r7 = r0.getFrameInfo(r6)
            X.WAV r0 = r8.LIZIZ
            X.Vwy r4 = r0.LIZIZ(r6)
            if (r4 == 0) goto L41
            goto L63
        L41:
            boolean r0 = r8.LIZJ(r6)
            if (r0 == 0) goto L2f
        L47:
            r5 = r6
            goto L86
        L49:
            X.WAY r0 = X.WAY.DISPOSE_TO_BACKGROUND
            if (r1 != r0) goto L59
            boolean r0 = r8.LIZIZ(r2)
            if (r0 == 0) goto L56
            X.WAX r0 = X.WAX.NOT_REQUIRED
            goto L23
        L56:
            X.WAX r0 = X.WAX.REQUIRED
            goto L23
        L59:
            X.WAY r0 = X.WAY.DISPOSE_TO_PREVIOUS
            if (r1 != r0) goto L60
            X.WAX r0 = X.WAX.SKIP
            goto L23
        L60:
            X.WAX r0 = X.WAX.ABORT
            goto L23
        L63:
            java.lang.Object r2 = r4.LJI()     // Catch: java.lang.Throwable -> L7d
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: java.lang.Throwable -> L7d
            r1 = 0
            r0 = 0
            r3.drawBitmap(r2, r0, r0, r1)     // Catch: java.lang.Throwable -> L7d
            X.WAY r1 = r7.LJFF     // Catch: java.lang.Throwable -> L7d
            X.WAY r0 = X.WAY.DISPOSE_TO_BACKGROUND     // Catch: java.lang.Throwable -> L7d
            if (r1 != r0) goto L77
            r8.LIZ(r3, r7)     // Catch: java.lang.Throwable -> L7d
        L77:
            int r5 = r6 + 1
            r4.close()
            goto L86
        L7d:
            r0 = move-exception
            r4.close()
            throw r0
        L82:
            r5 = r9
            goto L86
        L84:
            int r5 = r6 + 1
        L86:
            if (r5 >= r9) goto Lb2
            X.WAL r0 = r8.LIZ
            X.WAa r4 = r0.getFrameInfo(r5)
            X.WAY r2 = r4.LJFF
            X.WAY r0 = X.WAY.DISPOSE_TO_PREVIOUS
            if (r2 != r0) goto L97
        L94:
            int r5 = r5 + 1
            goto L86
        L97:
            X.WAZ r1 = r4.LJ
            X.WAZ r0 = X.WAZ.NO_BLEND
            if (r1 != r0) goto La0
            r8.LIZ(r3, r4)
        La0:
            X.WAL r0 = r8.LIZ
            r0.LIZJ(r5, r3)
            X.WAV r0 = r8.LIZIZ
            r0.LIZ()
            X.WAY r0 = X.WAY.DISPOSE_TO_BACKGROUND
            if (r2 != r0) goto L94
            r8.LIZ(r3, r4)
            goto L94
        Lb2:
            X.WAL r0 = r8.LIZ
            X.WAa r2 = r0.getFrameInfo(r9)
            X.WAZ r1 = r2.LJ
            X.WAZ r0 = X.WAZ.NO_BLEND
            if (r1 != r0) goto Lc1
            r8.LIZ(r3, r2)
        Lc1:
            X.WAL r0 = r8.LIZ
            r0.LIZJ(r9, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WAW.LIZLLL(int, android.graphics.Bitmap):void");
    }
}
