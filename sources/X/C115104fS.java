package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.4fS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115104fS {
    public static final C115104fS LIZLLL = new C115104fS(EnumC66933QOr.CONNECTION_UNKNOWN, null, null);
    public final EnumC66933QOr LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C115104fS)) {
            return false;
        }
        C115104fS c115104fS = (C115104fS) obj;
        return this.LIZ == c115104fS.LIZ && o.LJ(this.LIZIZ, c115104fS.LIZIZ) && o.LJ(this.LIZJ, c115104fS.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WsStateInfo(state=");
        LIZ.append(this.LIZ);
        LIZ.append(", url=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", sessionId=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C115104fS(EnumC66933QOr state, String str, String str2) {
        o.LJIIIZ(state, "state");
        this.LIZ = state;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
