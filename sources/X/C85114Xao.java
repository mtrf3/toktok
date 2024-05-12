package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Xao, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85114Xao {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85114Xao)) {
            return false;
        }
        C85114Xao c85114Xao = (C85114Xao) obj;
        return o.LJ(this.LIZ, c85114Xao.LIZ) && o.LJ(this.LIZIZ, c85114Xao.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VerifiedWay(ticket=");
        LIZ.append(this.LIZ);
        LIZ.append(", way=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C85114Xao(String ticket, String str) {
        o.LJIIIZ(ticket, "ticket");
        this.LIZ = ticket;
        this.LIZIZ = str;
    }
}
