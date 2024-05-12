package X;

import com.bytedance.keva.Keva;

/* renamed from: X.VJr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79543VJr implements InterfaceC83790WuY {
    @Override // X.InterfaceC83790WuY
    public final Integer LIZ() {
        return C2QT.LIZ("DefaultCameraFacingStore", "default_camera_facing", 1);
    }

    @Override // X.InterfaceC83790WuY
    public final void LIZIZ(int i) {
        Keva.getRepo("DefaultCameraFacingStore").storeInt("default_camera_facing", i);
    }
}
