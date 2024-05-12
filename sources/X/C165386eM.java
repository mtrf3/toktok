package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6eM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165386eM extends AbstractC165396eN {
    public final android.net.Uri LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C165386eM) && o.LJ(this.LIZ, ((C165386eM) obj).LIZ);
    }

    public final int hashCode() {
        android.net.Uri uri = this.LIZ;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Success(contentUri=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C165386eM(android.net.Uri uri) {
        this.LIZ = uri;
    }
}
