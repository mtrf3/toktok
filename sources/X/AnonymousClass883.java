package X;

import kotlin.jvm.internal.o;

/* renamed from: X.883, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass883<S> {
    public final String LIZ;
    public final S LIZIZ;
    public final EnumC2063587z LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass883)) {
            return false;
        }
        AnonymousClass883 anonymousClass883 = (AnonymousClass883) obj;
        return o.LJ(this.LIZ, anonymousClass883.LIZ) && o.LJ(this.LIZIZ, anonymousClass883.LIZIZ) && this.LIZJ == anonymousClass883.LIZJ;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        S s = this.LIZIZ;
        return this.LIZJ.hashCode() + ((hashCode + (s == null ? 0 : s.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StateChange(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", newState=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", source=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AnonymousClass883(String id, S s, EnumC2063587z source) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(source, "source");
        this.LIZ = id;
        this.LIZIZ = s;
        this.LIZJ = source;
    }
}
