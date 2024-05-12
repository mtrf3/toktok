package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Y6y, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86856Y6y {
    public Boolean LIZ;
    public String LIZIZ;
    public Long LIZJ;
    public String LIZLLL;

    public C86856Y6y() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86856Y6y)) {
            return false;
        }
        C86856Y6y c86856Y6y = (C86856Y6y) obj;
        return o.LJ(this.LIZ, c86856Y6y.LIZ) && o.LJ(this.LIZIZ, c86856Y6y.LIZIZ) && o.LJ(this.LIZJ, c86856Y6y.LIZJ) && o.LJ(this.LIZLLL, c86856Y6y.LIZLLL);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LIZJ;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VopSpeakerInfo(isPrivate=");
        LIZ.append(this.LIZ);
        LIZ.append(", speakerId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", finishedTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", updateTime=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C86856Y6y(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }
}
