package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.3FQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FQ {
    public final String LIZ;
    public final Integer LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3FQ)) {
            return false;
        }
        C3FQ c3fq = (C3FQ) obj;
        return o.LJ(this.LIZ, c3fq.LIZ) && o.LJ(this.LIZIZ, c3fq.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MAFUserShareStatusEntity(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", column_user_share_status=");
        return s0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C3FQ(String uid, Integer num) {
        o.LJIIIZ(uid, "uid");
        this.LIZ = uid;
        this.LIZIZ = num;
    }
}
