package X;

import java.util.HashMap;

/* renamed from: X.15C, reason: invalid class name */
/* loaded from: classes.dex */
public enum C15C {
    DualCameraState("ttlive_dual_device_camera_state", 0),
    DualLiveState("ttlive_dual_device_live_state", 1),
    DualCameraCaptureSize("ttlive_dual_device_camera_capture_size", 2);

    public final String LJLIL;
    public final Class<? extends C15D> LJLILLLLZI;
    public static final C15B Companion = new C15B();
    public static final HashMap<String, Class<? extends C15D>> map = new HashMap<>();

    public static C15C valueOf(String str) {
        return (C15C) V0N.LJJJ(C15C.class, str);
    }

    public final Class<? extends C15D> getMessageClass() {
        return this.LJLILLLLZI;
    }

    public final String getMethod() {
        return this.LJLIL;
    }

    C15C(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = r1;
    }
}
