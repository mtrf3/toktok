package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1JA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JA<S> implements InterfaceC07150Pv<S> {
    public final S LIZ;
    public final S LIZIZ;

    public final int hashCode() {
        int hashCode;
        S s = this.LIZ;
        int i = 0;
        if (s == null) {
            hashCode = 0;
        } else {
            hashCode = s.hashCode();
        }
        int i2 = hashCode * 31;
        S s2 = this.LIZIZ;
        if (s2 != null) {
            i = s2.hashCode();
        }
        return i2 + i;
    }

    @Override // X.InterfaceC07150Pv
    public final S LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC07150Pv
    public final S LIZJ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC07150Pv) {
            InterfaceC07150Pv interfaceC07150Pv = (InterfaceC07150Pv) obj;
            if (o.LJ(this.LIZ, interfaceC07150Pv.LIZIZ()) && o.LJ(this.LIZIZ, interfaceC07150Pv.LIZJ())) {
                return true;
            }
        }
        return false;
    }

    public C1JA(S s, S s2) {
        this.LIZ = s;
        this.LIZIZ = s2;
    }

    @Override // X.InterfaceC07150Pv
    public final boolean LIZ(S s, S s2) {
        return C07140Pu.LIZ(this, s, s2);
    }
}
