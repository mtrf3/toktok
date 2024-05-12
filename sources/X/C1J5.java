package X;

import X.C0Q9;
import kotlin.jvm.internal.o;

/* renamed from: X.1J5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1J5<V extends C0Q9> implements C0QI<V> {
    public final InterfaceC07100Pq LIZ;
    public V LIZIZ;
    public V LIZJ;
    public V LIZLLL;
    public final float LJ;

    @Override // X.C0QI
    public final float LIZ() {
        return this.LJ;
    }

    public C1J5(InterfaceC07100Pq floatDecaySpec) {
        o.LJIIIZ(floatDecaySpec, "floatDecaySpec");
        this.LIZ = floatDecaySpec;
        floatDecaySpec.LIZ();
        this.LJ = 0.0f;
    }

    public final long LIZLLL(V initialValue, V initialVelocity) {
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        if (this.LIZJ == null) {
            this.LIZJ = (V) initialValue.LIZJ();
        }
        V v = this.LIZJ;
        if (v != null) {
            int LIZIZ = v.LIZIZ();
            long j = 0;
            for (int i = 0; i < LIZIZ; i++) {
                InterfaceC07100Pq interfaceC07100Pq = this.LIZ;
                initialValue.LIZ(i);
                j = Math.max(j, interfaceC07100Pq.LIZIZ(initialVelocity.LIZ(i)));
            }
            return j;
        }
        o.LJIJI("velocityVector");
        throw null;
    }

    public final V LJ(V initialValue, V initialVelocity) {
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        if (this.LIZLLL == null) {
            this.LIZLLL = (V) initialValue.LIZJ();
        }
        V v = this.LIZLLL;
        if (v != null) {
            int LIZIZ = v.LIZIZ();
            int i = 0;
            while (i < LIZIZ) {
                int i2 = i + 1;
                V v2 = this.LIZLLL;
                if (v2 != null) {
                    v2.LJ(this.LIZ.LIZJ(initialValue.LIZ(i), initialVelocity.LIZ(i)), i);
                    i = i2;
                } else {
                    o.LJIJI("targetVector");
                    throw null;
                }
            }
            V v3 = this.LIZLLL;
            if (v3 != null) {
                return v3;
            }
            o.LJIJI("targetVector");
            throw null;
        }
        o.LJIJI("targetVector");
        throw null;
    }

    @Override // X.C0QI
    public final V LIZIZ(long j, V initialValue, V initialVelocity) {
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        if (this.LIZJ == null) {
            this.LIZJ = (V) initialValue.LIZJ();
        }
        V v = this.LIZJ;
        if (v != null) {
            int LIZIZ = v.LIZIZ();
            int i = 0;
            while (i < LIZIZ) {
                int i2 = i + 1;
                V v2 = this.LIZJ;
                if (v2 != null) {
                    InterfaceC07100Pq interfaceC07100Pq = this.LIZ;
                    initialValue.LIZ(i);
                    v2.LJ(interfaceC07100Pq.LJ(j, initialVelocity.LIZ(i)), i);
                    i = i2;
                } else {
                    o.LJIJI("velocityVector");
                    throw null;
                }
            }
            V v3 = this.LIZJ;
            if (v3 != null) {
                return v3;
            }
            o.LJIJI("velocityVector");
            throw null;
        }
        o.LJIJI("velocityVector");
        throw null;
    }

    @Override // X.C0QI
    public final V LIZJ(long j, V initialValue, V initialVelocity) {
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        if (this.LIZIZ == null) {
            this.LIZIZ = (V) initialValue.LIZJ();
        }
        V v = this.LIZIZ;
        if (v != null) {
            int LIZIZ = v.LIZIZ();
            int i = 0;
            while (i < LIZIZ) {
                int i2 = i + 1;
                V v2 = this.LIZIZ;
                if (v2 != null) {
                    v2.LJ(this.LIZ.LIZLLL(j, initialValue.LIZ(i), initialVelocity.LIZ(i)), i);
                    i = i2;
                } else {
                    o.LJIJI("valueVector");
                    throw null;
                }
            }
            V v3 = this.LIZIZ;
            if (v3 != null) {
                return v3;
            }
            o.LJIJI("valueVector");
            throw null;
        }
        o.LJIJI("valueVector");
        throw null;
    }
}
