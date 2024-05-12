package X;

import com.google.ar.core.ArCoreApk;

/* renamed from: X.abv, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public enum C94123abv extends ArCoreApk.Availability {
    public C94123abv() {
        super("UNKNOWN_CHECKING", 1, 1);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isTransient() {
        return true;
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnknown() {
        return true;
    }
}
