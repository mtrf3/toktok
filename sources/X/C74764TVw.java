package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.TVw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74764TVw {
    public final Long LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74764TVw)) {
            return false;
        }
        C74764TVw c74764TVw = (C74764TVw) obj;
        return o.LJ(this.LIZ, c74764TVw.LIZ) && o.LJ(this.LIZIZ, c74764TVw.LIZIZ) && this.LIZJ == c74764TVw.LIZJ;
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

    public C74764TVw(int i, String str, Long l) {
        this.LIZ = l;
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}
