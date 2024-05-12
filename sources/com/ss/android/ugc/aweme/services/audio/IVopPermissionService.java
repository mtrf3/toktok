package com.ss.android.ugc.aweme.services.audio;

import X.ActivityC45651qj;

/* loaded from: classes16.dex */
public interface IVopPermissionService {
    boolean checkAllPermissionsGranted(int[] iArr);

    boolean checkAllPermissionsGranted(String[] strArr);

    boolean checkPermissionGranted(String str);

    int[] checkSelfPermissions(String[] strArr);

    void showRequestAudioSettingDialog(ActivityC45651qj activityC45651qj);
}
