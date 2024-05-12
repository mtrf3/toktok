package X;

import android.os.SystemClock;
import com.ss.android.deviceregister.DeviceRegisterManager;

/* renamed from: X.2va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74142va {
    public static String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        LIZ.append('-');
        LIZ.append(SystemClock.uptimeMillis());
        return X1D.LIZIZ(LIZ);
    }
}
