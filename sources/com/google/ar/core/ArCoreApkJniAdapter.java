package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes34.dex */
public class ArCoreApkJniAdapter {
    public static final Map<Class<? extends Throwable>, Integer> LIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        hashMap.put(IllegalArgumentException.class, -1);
        hashMap.put(ResourceExhaustedException.class, -11);
        hashMap.put(UnavailableArcoreNotInstalledException.class, -100);
        hashMap.put(UnavailableDeviceNotCompatibleException.class, -101);
        hashMap.put(UnavailableApkTooOldException.class, -103);
        hashMap.put(UnavailableSdkTooOldException.class, -104);
        hashMap.put(UnavailableUserDeclinedInstallationException.class, -105);
    }

    public static int LIZ(Throwable th) {
        Class<?> cls = th.getClass();
        HashMap hashMap = (HashMap) LIZ;
        if (hashMap.containsKey(cls)) {
            return ((Integer) hashMap.get(cls)).intValue();
        }
        return -2;
    }

    public static int checkAvailability(Context context) {
        try {
            return ArCoreApk.getInstance().checkAvailability(context).nativeCode;
        } catch (Throwable th) {
            LIZ(th);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    public static int requestInstall(Activity activity, boolean z, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z).nativeCode;
            return 0;
        } catch (Throwable th) {
            return LIZ(th);
        }
    }

    public static int requestInstallCustom(Activity activity, boolean z, int i, int i2, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z, ArCoreApk.InstallBehavior.forNumber(i), ArCoreApk.UserMessageType.forNumber(i2)).nativeCode;
            return 0;
        } catch (Throwable th) {
            return LIZ(th);
        }
    }
}
