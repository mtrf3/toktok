package X;

import android.graphics.Bitmap;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VERecorder;

/* renamed from: X.HLi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43914HLi implements VERecorder.IVEFrameShotScreenCallback {
    public final /* synthetic */ InterfaceC43919HLn<OSZ<Bitmap, Long>> LIZ;
    public final /* synthetic */ long LIZIZ;

    public C43914HLi(C84657XKj c84657XKj, long j) {
        this.LIZ = c84657XKj;
        this.LIZIZ = j;
    }

    @Override // com.ss.android.vesdk.VERecorder.IVEFrameShotScreenCallback
    public final void onShotScreen(VEFrame vEFrame, int i) {
        Bitmap bitmap;
        if (!this.LIZ.isCompleted()) {
            InterfaceC43919HLn<OSZ<Bitmap, Long>> interfaceC43919HLn = this.LIZ;
            if (vEFrame != null) {
                bitmap = vEFrame.toBitmap();
            } else {
                bitmap = null;
            }
            interfaceC43919HLn.LJ(new OSZ<>(bitmap, Long.valueOf(System.currentTimeMillis() - this.LIZIZ)));
        }
    }
}
