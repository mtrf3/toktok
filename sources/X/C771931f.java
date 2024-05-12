package X;

import kotlin.jvm.internal.o;

/* renamed from: X.31f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C771931f {
    public static final C773631w LJI = new C773631w();
    public final EnumC772331j LIZ;
    public final int LIZIZ;
    public final C109544Rq LIZJ;
    public final C63120Opw LIZLLL;
    public final AnonymousClass323 LJ;
    public final C81053Gb LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C771931f)) {
            return false;
        }
        C771931f c771931f = (C771931f) obj;
        return this.LIZ == c771931f.LIZ && this.LIZIZ == c771931f.LIZIZ && o.LJ(this.LIZJ, c771931f.LIZJ) && o.LJ(this.LIZLLL, c771931f.LIZLLL) && o.LJ(this.LJ, c771931f.LJ) && o.LJ(this.LJFF, c771931f.LJFF);
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        C109544Rq c109544Rq = this.LIZJ;
        int hashCode2 = (hashCode + (c109544Rq == null ? 0 : c109544Rq.hashCode())) * 31;
        C63120Opw c63120Opw = this.LIZLLL;
        int hashCode3 = (hashCode2 + (c63120Opw == null ? 0 : c63120Opw.hashCode())) * 31;
        AnonymousClass323 anonymousClass323 = this.LJ;
        int hashCode4 = (hashCode3 + (anonymousClass323 == null ? 0 : anonymousClass323.hashCode())) * 31;
        C81053Gb c81053Gb = this.LJFF;
        return hashCode4 + (c81053Gb != null ? c81053Gb.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMInnerNotificationUnit(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", source=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", message=");
        LIZ.append(this.LIZJ);
        LIZ.append(", conversation=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", property=");
        LIZ.append(this.LJ);
        LIZ.append(", tip=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C771931f(EnumC772331j type, int i, C109544Rq c109544Rq, C63120Opw c63120Opw, AnonymousClass323 anonymousClass323, C81053Gb c81053Gb, int i2) {
        i = (i2 & 2) != 0 ? -1 : i;
        c109544Rq = (i2 & 4) != 0 ? null : c109544Rq;
        c63120Opw = (i2 & 8) != 0 ? null : c63120Opw;
        anonymousClass323 = (i2 & 16) != 0 ? null : anonymousClass323;
        c81053Gb = (i2 & 32) != 0 ? null : c81053Gb;
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = i;
        this.LIZJ = c109544Rq;
        this.LIZLLL = c63120Opw;
        this.LJ = anonymousClass323;
        this.LJFF = c81053Gb;
    }
}
