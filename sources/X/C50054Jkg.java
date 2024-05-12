package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Jkg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50054Jkg implements InterfaceC50057Jkj {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50054Jkg)) {
            return false;
        }
        C50054Jkg c50054Jkg = (C50054Jkg) obj;
        return this.LIZ == c50054Jkg.LIZ && o.LJ(this.LIZIZ, c50054Jkg.LIZIZ) && o.LJ(this.LIZJ, c50054Jkg.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TriggerByTabClick(entityId=");
        LIZ.append(this.LIZ);
        LIZ.append(", entityKeyword=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", entitySub=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C50054Jkg(long j, String str, String str2) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
