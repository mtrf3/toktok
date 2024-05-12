package com.ss.android.ugc.aweme.effectcreator.services;

import X.ActivityC45651qj;
import X.C76800UCe;
import X.C94132ac4;
import X.C94133ac5;
import X.C94134ac6;
import X.HVR;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.effectcreatormobile.ckeapi.api.CameraApi;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TiktokCameraImpl implements CameraApi {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.CameraApi
    public void requestCameraPermissionOrShowSetting(Activity activity, InterfaceC88471Ynr<? super String[], ? super int[], C76800UCe> onPermissionsGranted, InterfaceC65784Pro<C76800UCe> onSettingShown) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(onPermissionsGranted, "onPermissionsGranted");
        o.LJIIIZ(onSettingShown, "onSettingShown");
        if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null) {
            HVR.LIZLLL(activityC45651qj, new C94132ac4(onPermissionsGranted), onSettingShown, TokenCert.Companion.with("bpea-tool_effect_request_camera_open_for_ame"), 24);
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.CameraApi
    public void takePhoto(Fragment fragment, File photoFile, int i) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(photoFile, "photoFile");
        Context requireContext = fragment.requireContext();
        o.LJII(requireContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        HVR.LIZLLL((ActivityC45651qj) requireContext, new C94134ac6(fragment, photoFile, i), null, TokenCert.Companion.with("bpea-tool_effect_request_camera_cke_capture"), 28);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.CameraApi
    public void takePhoto(Activity activity, File photoFile, int i) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(photoFile, "photoFile");
        if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null) {
            HVR.LIZLLL(activityC45651qj, new C94133ac5(activity, photoFile, i), null, TokenCert.Companion.with("bpea-tool_effect_request_camera_capture_activity"), 28);
        }
    }
}
