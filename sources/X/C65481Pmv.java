package X;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* renamed from: X.Pmv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65481Pmv {
    public final TypeVariable<?> LIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZ.getGenericDeclaration(), this.LIZ.getName()});
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public C65481Pmv(TypeVariable<?> typeVariable) {
        typeVariable.getClass();
        this.LIZ = typeVariable;
    }

    public final boolean LIZ(TypeVariable<?> typeVariable) {
        if (this.LIZ.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.LIZ.getName().equals(typeVariable.getName())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C65481Pmv) {
            return LIZ(((C65481Pmv) obj).LIZ);
        }
        return false;
    }
}
