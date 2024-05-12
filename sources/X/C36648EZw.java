package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EZw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36648EZw {
    public final EnumC36654Ea2 LIZ;
    public final C36647EZv LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36648EZw)) {
            return false;
        }
        C36648EZw c36648EZw = (C36648EZw) obj;
        return this.LIZ == c36648EZw.LIZ && o.LJ(this.LIZIZ, c36648EZw.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchAbilityData(name=");
        LIZ.append(this.LIZ);
        LIZ.append(", parameters=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C36648EZw(EnumC36654Ea2 name, C36647EZv c36647EZv) {
        o.LJIIIZ(name, "name");
        this.LIZ = name;
        this.LIZIZ = c36647EZv;
    }
}
