package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6e7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165236e7 {
    public final C6MP LIZ;
    public final String LIZIZ;
    public final OSZ<String, String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C165236e7)) {
            return false;
        }
        C165236e7 c165236e7 = (C165236e7) obj;
        return this.LIZ == c165236e7.LIZ && o.LJ(this.LIZIZ, c165236e7.LIZIZ) && o.LJ(this.LIZJ, c165236e7.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LottieAnimatorEvent(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", path=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", kevaPair=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        OSZ<String, String> osz = this.LIZJ;
        if (osz == null) {
            hashCode = 0;
        } else {
            hashCode = osz.hashCode();
        }
        return LJ + hashCode;
    }

    public C165236e7(C6MP type, String path, OSZ<String, String> osz) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(path, "path");
        this.LIZ = type;
        this.LIZIZ = path;
        this.LIZJ = osz;
    }
}
