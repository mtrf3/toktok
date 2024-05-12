package X;

import com.lynx.canvas.CanvasPermissionManager;

/* loaded from: classes17.dex */
public final class Z86 implements Z88 {
    public final /* synthetic */ long LIZ;

    @Override // X.Z88
    public final void LIZ() {
        CanvasPermissionManager.nativeOnMicrophonePermissionResponse(this.LIZ, true);
    }

    public Z86(long j) {
        this.LIZ = j;
    }
}
