package com.ss.bytertc.engine.utils;

import X.C04330Ez;
import com.bytedance.realx.base.ContextUtils;

/* loaded from: classes33.dex */
public class PermissionChecker {
    public static boolean checkAudioPermission() {
        if (C04330Ez.LIZ(ContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkCameraPermission() {
        if (C04330Ez.LIZ(ContextUtils.getApplicationContext(), "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }
}
