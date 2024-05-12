package X;

import X.C0Q9;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1J3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1J3<V extends C0Q9> implements C0QF {
    public final C0QA LJLIL;
    public V LJLILLLLZI;
    public V LJLJI;
    public V LJLJJI;

    @Override // X.C0QF
    public final boolean LIZ() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1J3(final C1J6 anim) {
        this(new C0QA() { // from class: X.1J2
            @Override // X.C0QA
            public final C1J6 get(int i) {
                return C1J6.this;
            }
        });
        o.LJIIIZ(anim, "anim");
    }

    public C1J3(C0QA c0qa) {
        this.LJLIL = c0qa;
    }

    @Override // X.C0QF
    public final V LIZJ(V initialValue, V targetValue, V initialVelocity) {
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(targetValue, "targetValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        if (this.LJLJJI == null) {
            this.LJLJJI = (V) initialVelocity.LIZJ();
        }
        V v = this.LJLJJI;
        if (v != null) {
            int LIZIZ = v.LIZIZ();
            int i = 0;
            while (i < LIZIZ) {
                int i2 = i + 1;
                V v2 = this.LJLJJI;
                if (v2 != null) {
                    v2.LJ(this.LJLIL.get(i).LIZLLL(initialValue.LIZ(i), targetValue.LIZ(i), initialVelocity.LIZ(i)), i);
                    i = i2;
                } else {
                    o.LJIJI("endVelocityVector");
                    throw null;
                }
            }
            V v3 = this.LJLJJI;
            if (v3 != null) {
                return v3;
            }
            o.LJIJI("endVelocityVector");
            throw null;
        }
        o.LJIJI("endVelocityVector");
        throw null;
    }

    @Override // X.C0QF
    public final long LJII(V initialValue, V targetValue, V initialVelocity) {
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(targetValue, "targetValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        Iterator<Integer> it = C78842Uww.LJJ(0, initialValue.LIZIZ()).iterator();
        long j = 0;
        while (it.hasNext()) {
            int nextInt = ((AbstractC118224kU) it).nextInt();
            j = Math.max(j, this.LJLIL.get(nextInt).LIZJ(initialValue.LIZ(nextInt), targetValue.LIZ(nextInt), initialVelocity.LIZ(nextInt)));
        }
        return j;
    }

    @Override // X.C0QF
    public final V LIZIZ(long j, V initialValue, V targetValue, V initialVelocity) {
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(targetValue, "targetValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        if (this.LJLJI == null) {
            this.LJLJI = (V) initialVelocity.LIZJ();
        }
        V v = this.LJLJI;
        if (v != null) {
            int LIZIZ = v.LIZIZ();
            int i = 0;
            while (i < LIZIZ) {
                int i2 = i + 1;
                V v2 = this.LJLJI;
                if (v2 != null) {
                    v2.LJ(this.LJLIL.get(i).LIZIZ(j, initialValue.LIZ(i), targetValue.LIZ(i), initialVelocity.LIZ(i)), i);
                    i = i2;
                } else {
                    o.LJIJI("velocityVector");
                    throw null;
                }
            }
            V v3 = this.LJLJI;
            if (v3 != null) {
                return v3;
            }
            o.LJIJI("velocityVector");
            throw null;
        }
        o.LJIJI("velocityVector");
        throw null;
    }

    @Override // X.C0QF
    public final V LIZLLL(long j, V initialValue, V targetValue, V initialVelocity) {
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(targetValue, "targetValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = (V) initialValue.LIZJ();
        }
        V v = this.LJLILLLLZI;
        if (v != null) {
            int LIZIZ = v.LIZIZ();
            int i = 0;
            while (i < LIZIZ) {
                int i2 = i + 1;
                V v2 = this.LJLILLLLZI;
                if (v2 != null) {
                    v2.LJ(this.LJLIL.get(i).LJ(j, initialValue.LIZ(i), targetValue.LIZ(i), initialVelocity.LIZ(i)), i);
                    i = i2;
                } else {
                    o.LJIJI("valueVector");
                    throw null;
                }
            }
            V v3 = this.LJLILLLLZI;
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
