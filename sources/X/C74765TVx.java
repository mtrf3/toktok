package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.TVx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74765TVx {
    public final Long LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74765TVx)) {
            return false;
        }
        C74765TVx c74765TVx = (C74765TVx) obj;
        return o.LJ(this.LIZ, c74765TVx.LIZ) && o.LJ(this.LIZIZ, c74765TVx.LIZIZ) && this.LIZJ == c74765TVx.LIZJ;
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.LIZIZ;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiGuestPermissionErrInfo(errCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", errPrompt=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", multiLiveType=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C74765TVx(int i, String str, Long l) {
        this.LIZ = l;
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}
