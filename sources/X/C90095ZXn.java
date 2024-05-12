package X;

import android.content.ComponentName;

/* renamed from: X.ZXn, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90095ZXn {
    public final ComponentName LIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProviderMetadata{ componentName=");
        LIZ.append(this.LIZ.flattenToShortString());
        LIZ.append(" }");
        return X1D.LIZIZ(LIZ);
    }

    public C90095ZXn(ComponentName componentName) {
        this.LIZ = componentName;
    }
}
