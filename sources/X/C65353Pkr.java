package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pkr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65353Pkr implements InterfaceC39558Ffm {
    public final Class<?> LJLIL;

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.toString());
        LIZ.append(" (Kotlin reflection is not available)");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC39558Ffm
    public final Class<?> LIZIZ() {
        return this.LJLIL;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C65353Pkr) && o.LJ(this.LJLIL, ((C65353Pkr) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C65353Pkr(Class<?> jClass, String str) {
        o.LJIIIZ(jClass, "jClass");
        this.LJLIL = jClass;
    }
}
