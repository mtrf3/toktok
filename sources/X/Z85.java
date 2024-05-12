package X;

import com.lynx.canvas.CanvasPermissionManager;

/* loaded from: classes17.dex */
public final class Z85 implements Z88 {
    public final /* synthetic */ long LIZ;

    @Override // X.Z88
    public final void LIZ() {
        CanvasPermissionManager.nativeOnCameraPermissionResponse(this.LIZ, true);
    }

    public Z85(long j) {
        this.LIZ = j;
    }
}
