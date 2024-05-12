package com.bytedance.effectcreatormobile.ckeapi.api;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.news.common.service.manager.IService;
import java.io.File;

/* loaded from: classes34.dex */
public interface CameraApi extends IService {
    void requestCameraPermissionOrShowSetting(Activity activity, InterfaceC88471Ynr<? super String[], ? super int[], C76800UCe> interfaceC88471Ynr, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    void takePhoto(Activity activity, File file, int i);

    void takePhoto(Fragment fragment, File file, int i);
}
