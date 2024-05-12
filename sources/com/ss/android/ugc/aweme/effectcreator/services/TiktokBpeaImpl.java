package com.ss.android.ugc.aweme.effectcreator.services;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C78857UxB;
import X.C78862UxG;
import X.C84133X0f;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.effectcreatormobile.ckeapi.api.ICameraBPEA;
import com.ss.android.vesdk.VECameraSettings;

/* loaded from: classes34.dex */
public final class TiktokBpeaImpl implements ICameraBPEA<C84133X0f> {
    public static int com_ss_android_ugc_aweme_effectcreator_services_TiktokBpeaImpl_com_ss_android_vesdk_VECameraCapture_open(C84133X0f c84133X0f, Cert cert) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100800, "com/ss/android/vesdk/VECameraCapture", "open", c84133X0f, new Object[]{cert}, "int", new C65300Pk0(false, "(Lcom/bytedance/bpea/basics/Cert;)I", "-7813039047084729894"));
        return LIZJ.LIZ ? ((Integer) LIZJ.LIZIZ).intValue() : c84133X0f.LJJIIZI(cert);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraBPEA
    public void flipCamera(C84133X0f c84133X0f) {
        VECameraSettings.CAMERA_FACING_ID camera_facing_id;
        if (c84133X0f != null) {
            C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476788231, "bpea-tool_effect_request_ve_flip_camera");
            if (c84133X0f.LJLILLLLZI.LJLJJI == 0) {
                camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
            } else {
                camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
            }
            c84133X0f.LJJIJL(camera_facing_id, LJJIIJ);
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraBPEA
    public void openCameraCapture(C84133X0f c84133X0f) {
        if (c84133X0f != null) {
            com_ss_android_ugc_aweme_effectcreator_services_TiktokBpeaImpl_com_ss_android_vesdk_VECameraCapture_open(c84133X0f, C78857UxB.LJJIIJ(1476788231, "bpea-tool_effect_request_ve_open_camera"));
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ICameraBPEA
    public void openCameraCaptureforSwitchMode(C84133X0f c84133X0f) {
        if (c84133X0f != null) {
            com_ss_android_ugc_aweme_effectcreator_services_TiktokBpeaImpl_com_ss_android_vesdk_VECameraCapture_open(c84133X0f, C78857UxB.LJJIIJ(1476788231, "bpea-tool_effect_request_ve_switch_model"));
        }
    }
}
