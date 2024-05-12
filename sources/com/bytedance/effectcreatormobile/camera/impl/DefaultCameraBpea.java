package com.bytedance.effectcreatormobile.camera.impl;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C84133X0f;
import com.bytedance.effectcreatormobile.ckeapi.api.ICameraBPEA;

/* loaded from: classes34.dex */
public final class DefaultCameraBpea implements ICameraBPEA<C84133X0f> {
    public static int com_bytedance_effectcreatormobile_camera_impl_DefaultCameraBpea_com_ss_android_vesdk_VECameraCapture_open(C84133X0f c84133X0f) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100800, "com/ss/android/vesdk/VECameraCapture", "open", c84133X0f, new Object[0], "int", new C65300Pk0(false, "()I", "-2494429715141019257"));
        if (LIZJ.LIZ) {
            return ((Integer) LIZJ.LIZIZ).intValue();
        }
        c84133X0f.getClass();
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(100800, "com/ss/android/vesdk/VECameraCapture", "open", c84133X0f, new Object[]{null}, "int", new C65300Pk0(false, "(Lcom/bytedance/bpea/basics/Cert;)I", "9070747164134211277"));
        if (LIZJ2.LIZ) {
            return ((Integer) LIZJ2.LIZIZ).intValue();
        }
        return c84133X0f.LJJIIZI(null);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraBPEA
    public void flipCamera(C84133X0f c84133X0f) {
        if (c84133X0f != null) {
            c84133X0f.LLLIILIL();
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraBPEA
    public void openCameraCapture(C84133X0f c84133X0f) {
        if (c84133X0f != null) {
            com_bytedance_effectcreatormobile_camera_impl_DefaultCameraBpea_com_ss_android_vesdk_VECameraCapture_open(c84133X0f);
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraBPEA
    public void openCameraCaptureforSwitchMode(C84133X0f c84133X0f) {
        if (c84133X0f != null) {
            com_bytedance_effectcreatormobile_camera_impl_DefaultCameraBpea_com_ss_android_vesdk_VECameraCapture_open(c84133X0f);
        }
    }
}
