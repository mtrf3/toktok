package X;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* renamed from: X.0Sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07930Sv {
    public static PackageManager.ComponentInfoFlags LIZIZ(long j) {
        return PackageManager.ComponentInfoFlags.of(j);
    }

    public static ServiceInfo LIZ(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) {
        return packageManager.getServiceInfo(componentName, componentInfoFlags);
    }
}
