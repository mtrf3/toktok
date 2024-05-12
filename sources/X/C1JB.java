package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1JB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JB<T> implements C0Q2<T> {
    public final InterfaceC41451jx<T> LIZ;
    public final C0QB LIZIZ;
    public final long LIZJ;

    public C1JB() {
        throw null;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZJ) + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31);
    }

    @Override // X.C0Q2
    public final <V extends C0Q9> C0QF<V> LIZ(C0QC<T, V> converter) {
        o.LJIIIZ(converter, "converter");
        final C1J0<V> LIZ = this.LIZ.LIZ((C0QC) converter);
        final C0QB c0qb = this.LIZIZ;
        final long j = this.LIZJ;
        return (C0QF<V>) new C0QF<V>(LIZ, c0qb, j) { // from class: X.1J7
            public final C1J0<V> LJLIL;
            public final C0QB LJLILLLLZI;
            public final long LJLJI;
            public final long LJLJJI;

            @Override // X.C0QF
            public final boolean LIZ() {
                return true;
            }

            @Override // X.C0QF
            public final long LJII(V initialValue, V targetValue, V initialVelocity) {
                o.LJIIIZ(initialValue, "initialValue");
                o.LJIIIZ(targetValue, "targetValue");
                o.LJIIIZ(initialVelocity, "initialVelocity");
                return Long.MAX_VALUE;
            }

            public final long LJ(long j2) {
                long j3 = this.LJLJJI;
                if (j2 + j3 <= 0) {
                    return 0L;
                }
                long j4 = j2 + j3;
                long j5 = this.LJLJI;
                long j6 = j4 / j5;
                if (this.LJLILLLLZI == C0QB.Restart || j6 % 2 == 0) {
                    Long.signum(j6);
                    return j4 - (j6 * j5);
                }
                return ((j6 + 1) * j5) - j4;
            }

            {
                this.LJLIL = LIZ;
                this.LJLILLLLZI = c0qb;
                this.LJLJI = (LIZ.LJI() + LIZ.LJFF()) * 1000000;
                this.LJLJJI = j * 1000000;
            }

            @Override // X.C0QF
            public final V LIZJ(V v, V v2, V v3) {
                return (V) C0QE.LIZ(this, v, v2, v3);
            }

            @Override // X.C0QF
            public final V LIZIZ(long j2, V initialValue, V targetValue, V v) {
                V initialVelocity = v;
                o.LJIIIZ(initialValue, "initialValue");
                o.LJIIIZ(targetValue, "targetValue");
                o.LJIIIZ(initialVelocity, "initialVelocity");
                C1J0<V> c1j0 = this.LJLIL;
                long LJ = LJ(j2);
                long j3 = this.LJLJJI;
                long j4 = j2 + j3;
                long j5 = this.LJLJI;
                if (j4 > j5) {
                    initialVelocity = LIZIZ(j5 - j3, initialValue, initialVelocity, targetValue);
                }
                return c1j0.LIZIZ(LJ, initialValue, targetValue, initialVelocity);
            }

            @Override // X.C0QF
            public final V LIZLLL(long j2, V initialValue, V targetValue, V v) {
                V initialVelocity = v;
                o.LJIIIZ(initialValue, "initialValue");
                o.LJIIIZ(targetValue, "targetValue");
                o.LJIIIZ(initialVelocity, "initialVelocity");
                C1J0<V> c1j0 = this.LJLIL;
                long LJ = LJ(j2);
                long j3 = this.LJLJJI;
                long j4 = j2 + j3;
                long j5 = this.LJLJI;
                if (j4 > j5) {
                    initialVelocity = LIZIZ(j5 - j3, initialValue, initialVelocity, targetValue);
                }
                return c1j0.LIZLLL(LJ, initialValue, targetValue, initialVelocity);
            }
        };
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1JB)) {
            return false;
        }
        C1JB c1jb = (C1JB) obj;
        if (!o.LJ(c1jb.LIZ, this.LIZ) || c1jb.LIZIZ != this.LIZIZ || c1jb.LIZJ != this.LIZJ) {
            return false;
        }
        return true;
    }

    public C1JB(InterfaceC41451jx interfaceC41451jx, C0QB c0qb, long j) {
        this.LIZ = interfaceC41451jx;
        this.LIZIZ = c0qb;
        this.LIZJ = j;
    }
}
