package X;

import com.google.ar.core.ArCoreApk;

/* renamed from: X.abx, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public enum C94125abx extends ArCoreApk.Availability {
    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnsupported() {
        return true;
    }

    public C94125abx() {
        super("UNSUPPORTED_DEVICE_NOT_CAPABLE", 3, 100);
    }
}
