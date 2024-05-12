package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.6up, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175596up extends AbstractC175586uo {
    public final java.util.Set<String> LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175596up)) {
            return false;
        }
        C175596up c175596up = (C175596up) obj;
        return o.LJ(this.LIZ, c175596up.LIZ) && this.LIZIZ == c175596up.LIZIZ && this.LIZJ == c175596up.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ValidateSuccess(uids=");
        LIZ.append(this.LIZ);
        LIZ.append(", selectCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", videoReplyNumber=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C175596up(int i, int i2, java.util.Set uids) {
        o.LJIIIZ(uids, "uids");
        this.LIZ = uids;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
