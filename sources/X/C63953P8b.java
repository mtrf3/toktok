package X;

import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VERecorder;

/* renamed from: X.P8b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63953P8b implements InterfaceC63970P8s {
    public final /* synthetic */ InterfaceC63955P8d LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ VERecorder.IVEFrameShotScreenCallback LIZJ;
    public final /* synthetic */ C84098WzW LIZLLL;
    public final /* synthetic */ C84092WzQ LJ;

    @Override // X.InterfaceC63970P8s
    public final /* synthetic */ void LIZ(VEFrame vEFrame, int i) {
    }

    @Override // X.InterfaceC63970P8s
    public final void onResult(int[] iArr, int i, int i2) {
        if (iArr == null) {
            this.LJ.LJJIJIL.set(false);
            this.LIZ.LIZ(-1, null);
        } else {
            VEFrame createIntArrayFrame = VEFrame.createIntArrayFrame(iArr, i, i2, 0, 0L, P6Z.TEPixFmt_RGBA8);
            if (this.LIZIZ) {
                this.LIZJ.onShotScreen(createIntArrayFrame, 0);
            }
            this.LJ.renderFrame(createIntArrayFrame, this.LIZLLL);
        }
    }

    public C63953P8b(C84092WzQ c84092WzQ, InterfaceC63955P8d interfaceC63955P8d, boolean z, VERecorder.IVEFrameShotScreenCallback iVEFrameShotScreenCallback, C84098WzW c84098WzW) {
        this.LJ = c84092WzQ;
        this.LIZ = interfaceC63955P8d;
        this.LIZIZ = z;
        this.LIZJ = iVEFrameShotScreenCallback;
        this.LIZLLL = c84098WzW;
    }
}
