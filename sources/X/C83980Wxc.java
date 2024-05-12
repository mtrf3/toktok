package X;

import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import java.util.List;

/* renamed from: X.Wxc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83980Wxc implements X0Z {
    public final /* synthetic */ VECameraController LIZ;

    @Override // X.X0Z
    public final boolean enableSmooth() {
        this.LIZ.getClass();
        return false;
    }

    public C83980Wxc(VECameraController vECameraController) {
        this.LIZ = vECameraController;
    }

    @Override // X.X0Z
    public final void onChange(int i, float f, boolean z) {
        boolean z2;
        if (this.LIZ.LLIZ.invoke().booleanValue()) {
            return;
        }
        VECameraController vECameraController = this.LIZ;
        if (f > 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        vECameraController.LLIIII = z2;
        C43045Guv.LIZLLL(new C83982Wxe(this, f, i, z), 0L);
    }

    @Override // X.X0Z
    public final void onZoomSupport(int i, boolean z, boolean z2, float f, List<Integer> list) {
        if (this.LIZ.LLIZ.invoke().booleanValue()) {
            return;
        }
        C43045Guv.LIZLLL(new C83979Wxb(this, f, list, i, z, z2), 0L);
    }
}
