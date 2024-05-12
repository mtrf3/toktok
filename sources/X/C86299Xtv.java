package X;

import com.bytedance.sdk.xbridge.runtime.depend.OnPermissionGrantCallback;

/* renamed from: X.Xtv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86299Xtv implements InterfaceC86301Xtx {
    public final /* synthetic */ OnPermissionGrantCallback LIZ;

    @Override // X.InterfaceC86301Xtx
    public final void LIZ() {
        this.LIZ.onNotGranted();
    }

    @Override // X.InterfaceC86301Xtx
    public final void LIZIZ() {
        this.LIZ.onAllGranted();
    }

    public C86299Xtv(OnPermissionGrantCallback onPermissionGrantCallback) {
        this.LIZ = onPermissionGrantCallback;
    }
}
