package X;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.0dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12210dt {
    public final C12220du LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C12210dt(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                this.LIZ = new C32731Qf(remoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12210dt)) {
            return false;
        }
        return this.LIZ.equals(((C12210dt) obj).LIZ);
    }

    public C12210dt(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.LIZ = new C32731Qf(str, i, i2);
                    return;
                } else {
                    this.LIZ = new C12220du(str, i, i2);
                    return;
                }
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
