package X;

import Y.IDeS150S0200000_1;
import defpackage.q;

/* renamed from: X.3BO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BO implements C3BD {
    public final long LIZIZ;
    public final long LIZJ;

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZJ) + (C16880lQ.LLJIJIL(this.LIZIZ) * 31);
    }

    public final String toString() {
        C61899ORb c61899ORb = new C61899ORb(2);
        if (this.LIZIZ > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopTimeout=");
            LIZ.append(this.LIZIZ);
            LIZ.append("ms");
            c61899ORb.add(X1D.LIZIZ(LIZ));
        }
        if (this.LIZJ < Long.MAX_VALUE) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("replayExpiration=");
            LIZ2.append(this.LIZJ);
            LIZ2.append("ms");
            c61899ORb.add(X1D.LIZIZ(LIZ2));
        }
        c61899ORb.build();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("SharingStarted.WhileSubscribed(");
        return q.LIZIZ(LIZ3, ORZ.LLD(c61899ORb, null, null, null, null, 63), ')', LIZ3);
    }

    @Override // X.C3BD
    public final InterfaceC65462ha<C3BM> LIZ(InterfaceC71762rk<Integer> interfaceC71762rk) {
        return V1M.LJIIJJI(new IDeS150S0200000_1(V1M.LJJJLZIJ(interfaceC71762rk, new C3BN(this, null)), new C3BP(null), 3));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3BO) {
            C3BO c3bo = (C3BO) obj;
            if (this.LIZIZ == c3bo.LIZIZ && this.LIZJ == c3bo.LIZJ) {
                return true;
            }
        }
        return false;
    }

    public C3BO(long j, long j2) {
        boolean z;
        this.LIZIZ = j;
        this.LIZJ = j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j2 >= 0) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("replayExpiration(");
            LIZ.append(j2);
            LIZ.append(" ms) cannot be negative");
            String LIZIZ = X1D.LIZIZ(LIZ);
            LIZIZ.toString();
            throw new IllegalArgumentException(LIZIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("stopTimeout(");
        LIZ2.append(j);
        LIZ2.append(" ms) cannot be negative");
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LIZIZ2.toString();
        throw new IllegalArgumentException(LIZIZ2);
    }
}
