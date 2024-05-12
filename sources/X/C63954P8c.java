package X;

import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VERecorder;

/* renamed from: X.P8c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63954P8c implements InterfaceC63970P8s {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ VERecorder.IVEFrameShotScreenCallback LIZIZ;
    public final /* synthetic */ C84092WzQ LIZJ;

    @Override // X.InterfaceC63970P8s
    public final void LIZ(VEFrame vEFrame, int i) {
        C63868P4u.LJ(0, System.currentTimeMillis() - this.LIZ, "te_record_shot_hd_screen_time");
        this.LIZJ.LJJIJIL.set(false);
        this.LIZIZ.onShotScreen(vEFrame, i);
    }

    public C63954P8c(C84092WzQ c84092WzQ, long j, VERecorder.IVEFrameShotScreenCallback iVEFrameShotScreenCallback) {
        this.LIZJ = c84092WzQ;
        this.LIZ = j;
        this.LIZIZ = iVEFrameShotScreenCallback;
    }

    @Override // X.InterfaceC63970P8s
    public final void onResult(int[] iArr, int i, int i2) {
        C63868P4u.LJ(0, System.currentTimeMillis() - this.LIZ, "te_record_shot_hd_screen_time");
        this.LIZJ.LJJIJIL.set(false);
        P4Q.LIZJ("TERecorder", "onResult in shotScreen should not be called");
        this.LIZIZ.onShotScreen(null, -1);
    }
}
