package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.CDb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30959CDb {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public /* synthetic */ C30959CDb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30959CDb)) {
            return false;
        }
        C30959CDb c30959CDb = (C30959CDb) obj;
        return o.LJ(this.LIZ, c30959CDb.LIZ) && o.LJ(this.LIZIZ, c30959CDb.LIZIZ) && o.LJ(this.LIZJ, c30959CDb.LIZJ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BadgeItemInfo(bgStartColor=");
        LIZ.append(this.LIZ);
        LIZ.append(", bgEndColor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", strokeColor=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C30959CDb(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
