package X;

import android.graphics.Bitmap;
import com.ss.android.ttve.model.VEFrame;

/* loaded from: classes12.dex */
public final class P8Z implements InterfaceC63970P8s {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ Bitmap LIZJ;
    public final /* synthetic */ InterfaceC63955P8d LIZLLL;
    public final /* synthetic */ C84092WzQ LJ;

    @Override // X.InterfaceC63970P8s
    public final /* synthetic */ void LIZ(VEFrame vEFrame, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r5 == null) goto L12;
     */
    @Override // X.InterfaceC63970P8s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResult(int[] r5, int r6, int r7) {
        /*
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.LIZ
            long r0 = r0 - r2
            r3 = 0
            java.lang.String r2 = "te_record_shot_screen_time"
            X.C63868P4u.LJ(r3, r0, r2)
            X.WzQ r0 = r4.LJ
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LJJIJIL
            r0.set(r3)
            boolean r0 = r4.LIZIZ
            if (r0 == 0) goto L28
            android.graphics.Bitmap r1 = r4.LIZJ
            if (r1 == 0) goto L28
            if (r5 != 0) goto L32
            if (r6 <= 0) goto L2a
            if (r7 <= 0) goto L2a
            X.P8d r0 = r4.LIZLLL
            r0.LIZ(r3, r1)
            return
        L28:
            if (r5 != 0) goto L32
        L2a:
            X.P8d r2 = r4.LIZLLL
            r1 = 0
            r0 = -1
            r2.LIZ(r0, r1)
            return
        L32:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r0)
            X.P8d r0 = r4.LIZLLL
            r0.LIZ(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P8Z.onResult(int[], int, int):void");
    }

    public P8Z(C84092WzQ c84092WzQ, long j, boolean z, Bitmap bitmap, InterfaceC63955P8d interfaceC63955P8d) {
        this.LJ = c84092WzQ;
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = bitmap;
        this.LIZLLL = interfaceC63955P8d;
    }
}
