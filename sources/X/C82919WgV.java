package X;

import com.ss.android.vesdk.VECameraSettings;

/* renamed from: X.WgV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82919WgV implements X03 {
    public final /* synthetic */ InterfaceC88471Ynr LIZ;

    @Override // X.X03
    public final void LIZ(String str) {
    }

    @Override // X.X03
    public final void onError() {
    }

    public C82919WgV(InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LIZ = interfaceC88471Ynr;
    }

    @Override // X.X03
    public final void onSuccess(int i, float f, int i2) {
        String str;
        InterfaceC88471Ynr interfaceC88471Ynr = this.LIZ;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Float.valueOf(f), Integer.valueOf(i2));
        }
        if (i2 == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT.ordinal()) {
            str = "front";
        } else if (i2 == VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE.ordinal()) {
            str = "wide_angle";
        } else {
            str = "rear";
        }
        C82891Wg3 c82891Wg3 = C82891Wg3.LJIIIZ;
        c82891Wg3.getClass();
        C6YE c6ye = (C6YE) C82891Wg3.LJ.LIZ(c82891Wg3, C82891Wg3.LIZ[3]);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZJ(Float.valueOf(f), "score");
        c145995oB.LJI("camera_type", str);
        c6ye.onEvent("dirty_camera_detect", c145995oB.LIZ);
    }
}
