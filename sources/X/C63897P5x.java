package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: X.P5x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63897P5x {
    public int LIZ;
    public SurfaceTexture LIZIZ;
    public boolean LIZJ;
    public int LIZLLL = -1;

    public final void LIZ() {
        if (1 == this.LIZLLL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("attachToGLContext, texture id = ");
            C01R.LIZJ(LIZ, this.LIZ, LIZ, "TextureHolder");
            this.LIZIZ.attachToGLContext(this.LIZ);
            this.LIZLLL = 0;
        }
    }

    public final void LIZIZ() {
        if (this.LIZLLL == 0) {
            this.LIZLLL = 1;
            if (Build.VERSION.SDK_INT >= 26 && this.LIZIZ.isReleased()) {
                return;
            }
            this.LIZIZ.detachFromGLContext();
        }
    }

    public final double LIZJ() {
        if (this.LIZIZ == null) {
            return -1.0d;
        }
        long abs = Math.abs(System.nanoTime() - this.LIZIZ.getTimestamp());
        long abs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - this.LIZIZ.getTimestamp());
        return (r4 - Math.min(Math.min(abs, abs2), Math.abs((SystemClock.uptimeMillis() * 1000000) - this.LIZIZ.getTimestamp()))) / 1000000.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        if (r6.LIZJ != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        r6.LIZJ = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r6.LIZJ == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r6 = this;
            boolean r0 = r6.LIZJ
            if (r0 != 0) goto L9
            int r1 = r6.LIZLLL
            r0 = 1
            if (r1 != r0) goto L5a
        L9:
            r4 = 0
            r6.LIZ()     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L4c
            boolean r0 = r6.LIZJ
            if (r0 == 0) goto L5a
            goto L58
        L12:
            r5 = move-exception
            r6.LIZLLL = r4     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = "TextureHolder"
            java.lang.String r3 = "attachToGLContext, exception occurred."
            byte r0 = X.P4Q.LIZIZ     // Catch: java.lang.Throwable -> L4c
            r0 = r0 & 2
            if (r0 == 0) goto L54
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = X.P4Q.LIZ     // Catch: java.lang.Throwable -> L4c
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            r1.append(r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L4c
            r1.append(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "\n***StackTrace***\n"
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = android.util.Log.getStackTraceString(r5)     // Catch: java.lang.Throwable -> L4c
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L4c
            r0 = 2
            com.ss.android.ttve.nativePort.TELogcat.nativeLog(r0, r2, r1)     // Catch: java.lang.Throwable -> L4c
            goto L54
        L4c:
            r1 = move-exception
            boolean r0 = r6.LIZJ
            if (r0 == 0) goto L53
            r6.LIZJ = r4
        L53:
            throw r1
        L54:
            boolean r0 = r6.LIZJ
            if (r0 == 0) goto L5a
        L58:
            r6.LIZJ = r4
        L5a:
            android.graphics.SurfaceTexture r0 = r6.LIZIZ
            if (r0 == 0) goto L61
            r0.updateTexImage()
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63897P5x.LJ():void");
    }

    public final void LIZLLL(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDestroy, canRelease = ");
        LIZ.append(z);
        P4Q.LJFF("TextureHolder", X1D.LIZIZ(LIZ));
        if (this.LIZIZ != null) {
            if (z) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onDestroy, release SurfaceTexture, mSurfaceTexture = ");
                LIZ2.append(this.LIZIZ);
                P4Q.LJFF("TextureHolder", X1D.LIZIZ(LIZ2));
                this.LIZIZ.release();
            }
            this.LIZIZ = null;
            this.LIZLLL = -1;
        }
        int i = this.LIZ;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.LIZ = 0;
        }
    }
}
