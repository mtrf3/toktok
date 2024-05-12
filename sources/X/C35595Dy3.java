package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Dy3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35595Dy3 {
    public final String LIZ;
    public final Boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35595Dy3)) {
            return false;
        }
        C35595Dy3 c35595Dy3 = (C35595Dy3) obj;
        return o.LJ(this.LIZ, c35595Dy3.LIZ) && o.LJ(this.LIZIZ, c35595Dy3.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.LIZIZ;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BestTeammateInviteInfo(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", isFriend=");
        return C78920UyC.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C35595Dy3(String str, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = bool;
    }
}
