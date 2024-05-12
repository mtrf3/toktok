package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EPr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36383EPr extends AbstractC36384EPs {
    public final String LIZ;
    public final android.net.Uri LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36383EPr)) {
            return false;
        }
        C36383EPr c36383EPr = (C36383EPr) obj;
        return o.LJ(this.LIZ, c36383EPr.LIZ) && o.LJ(this.LIZIZ, c36383EPr.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        android.net.Uri uri = this.LIZIZ;
        return hashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditSuccess(name=");
        LIZ.append(this.LIZ);
        LIZ.append(", newImageUri=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C36383EPr(android.net.Uri uri, String name) {
        o.LJIIIZ(name, "name");
        this.LIZ = name;
        this.LIZIZ = uri;
    }
}
