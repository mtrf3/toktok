package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9hZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243819hZ {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C243819hZ)) {
            return false;
        }
        C243819hZ c243819hZ = (C243819hZ) obj;
        return o.LJ(this.LIZ, c243819hZ.LIZ) && o.LJ(this.LIZIZ, c243819hZ.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SocialAccount(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", name=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C243819hZ(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
