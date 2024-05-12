package X;

import com.ss.android.ttve.nativePort.VEBingoManager;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public class P66 implements P5A {
    public final int LIZ;
    public final String LIZIZ;
    public volatile int LIZJ;
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final P6B LJ;
    public final /* synthetic */ VEBingoManager LJFF;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00df, code lost:
    
        if (r3 == false) goto L17;
     */
    @Override // X.P5A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean processFrame(java.nio.ByteBuffer r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            com.ss.android.ttve.nativePort.VEBingoManager r0 = r11.LJFF
            float r4 = (float) r15
            java.lang.String r5 = r11.LIZIZ
            r2 = r13
            r3 = r14
            r1 = r12
            int r4 = r0.processBingoVideoFrame(r1, r2, r3, r4, r5)
            java.lang.String r5 = "VEBingoManager"
            java.lang.String r8 = ", videoPath: "
            java.lang.String r9 = "index: "
            r10 = 0
            if (r4 >= 0) goto L71
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r9)
            int r0 = r11.LIZ
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r11.LIZIZ
            r1.append(r0)
            java.lang.String r3 = ", processBingoVideoFrame fail: "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r0 = ", thread: "
            r1.append(r0)
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.P4Q.LIZJ(r5, r0)
            X.P6B r2 = r11.LJ
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r9)
            int r0 = r11.LIZ
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r11.LIZIZ
            r1.append(r0)
            r1.append(r3)
            r1.append(r4)
            X.X1D.LIZIZ(r1)
            X.P68 r2 = (X.P68) r2
            X.P65 r0 = r2.LIZJ
            X.P69 r0 = r0.LJ
            r0.LIZ()
            return r10
        L71:
            java.util.concurrent.atomic.AtomicInteger r0 = r11.LIZLLL
            r0.incrementAndGet()
            X.P6B r4 = r11.LJ
            java.util.concurrent.atomic.AtomicInteger r0 = r11.LIZLLL
            int r7 = r0.get()
            int r6 = r11.LIZJ
            X.P68 r4 = (X.P68) r4
            X.P65 r0 = r4.LIZJ
            X.P69 r1 = r0.LJ
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.LIZ     // Catch: java.lang.Throwable -> Le5
            r0.incrementAndGet()     // Catch: java.lang.Throwable -> Le5
            boolean r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> Le5
            if (r0 == 0) goto Le3
            boolean r3 = r1.LIZIZ     // Catch: java.lang.Throwable -> Le5
            monitor-exit(r1)
            r2 = 1
            if (r7 != r6) goto Ldf
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r9)
            int r0 = r4.LIZ
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r4.LIZIZ
            r1.append(r0)
            java.lang.String r0 = ", complete "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " frame, thread: "
            r1.append(r0)
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.P4Q.LJFF(r5, r0)
            if (r3 != 0) goto Lde
            X.P65 r0 = r4.LIZJ
            android.os.Message r0 = android.os.Message.obtain(r0, r2)
            r0.sendToTarget()
        Ld4:
            java.util.concurrent.atomic.AtomicInteger r0 = r11.LIZLLL
            int r1 = r0.get()
            int r0 = r11.LIZJ
            if (r1 != r0) goto Le2
        Lde:
            return r10
        Ldf:
            if (r3 != 0) goto Lde
            goto Ld4
        Le2:
            return r2
        Le3:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> Le5
        Le5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P66.processFrame(java.nio.ByteBuffer, int, int, int):boolean");
    }

    public P66(VEBingoManager vEBingoManager, int i, String str, int i2, P68 p68) {
        this.LJFF = vEBingoManager;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = i2;
        this.LJ = p68;
    }
}
