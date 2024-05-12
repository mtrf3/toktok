package X;

import android.graphics.Bitmap;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VERecorder;

/* renamed from: X.P8a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63952P8a implements InterfaceC63970P8s {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ Bitmap LIZJ;
    public final /* synthetic */ InterfaceC63955P8d LIZLLL;
    public final /* synthetic */ boolean LJ;
    public final /* synthetic */ VERecorder.IVEFrameShotScreenCallback LJFF;
    public final /* synthetic */ C84092WzQ LJI;

    @Override // X.InterfaceC63970P8s
    public final /* synthetic */ void LIZ(VEFrame vEFrame, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r10 == null) goto L12;
     */
    @Override // X.InterfaceC63970P8s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResult(int[] r10, int r11, int r12) {
        /*
            r9 = this;
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r9.LIZ
            long r2 = r2 - r0
            java.lang.String r0 = "te_record_shot_hd_screen_time"
            r5 = 0
            X.C63868P4u.LJ(r5, r2, r0)
            X.WzQ r0 = r9.LJI
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LJJIJIL
            r0.set(r5)
            boolean r0 = r9.LIZIZ
            r3 = r11
            r4 = r12
            r2 = r10
            if (r0 == 0) goto L2b
            android.graphics.Bitmap r1 = r9.LIZJ
            if (r1 == 0) goto L2b
            if (r2 != 0) goto L35
            if (r3 <= 0) goto L2d
            if (r4 <= 0) goto L2d
            X.P8d r0 = r9.LIZLLL
            r0.LIZ(r5, r1)
            return
        L2b:
            if (r2 != 0) goto L35
        L2d:
            X.P8d r2 = r9.LIZLLL
            r1 = 0
            r0 = -1
            r2.LIZ(r0, r1)
            return
        L35:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r0)
            X.P8d r0 = r9.LIZLLL
            r0.LIZ(r5, r1)
            boolean r0 = r9.LJ
            if (r0 == 0) goto L56
            X.WzQ r0 = r9.LJI
            r0.getClass()
            r6 = 0
            X.P6Z r8 = X.P6Z.TEPixFmt_RGBA8
            com.ss.android.ttve.model.VEFrame r1 = com.ss.android.ttve.model.VEFrame.createIntArrayFrame(r2, r3, r4, r5, r6, r8)
            com.ss.android.vesdk.VERecorder$IVEFrameShotScreenCallback r0 = r9.LJFF
            r0.onShotScreen(r1, r5)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63952P8a.onResult(int[], int, int):void");
    }

    public C63952P8a(C84092WzQ c84092WzQ, long j, boolean z, Bitmap bitmap, InterfaceC63955P8d interfaceC63955P8d, boolean z2, VERecorder.IVEFrameShotScreenCallback iVEFrameShotScreenCallback) {
        this.LJI = c84092WzQ;
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = bitmap;
        this.LIZLLL = interfaceC63955P8d;
        this.LJ = z2;
        this.LJFF = iVEFrameShotScreenCallback;
    }
}
