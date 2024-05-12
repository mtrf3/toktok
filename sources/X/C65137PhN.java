package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: X.PhN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65137PhN implements GenericArrayType {
    public final Type LJLIL;

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C65138PhO.LJIILJJIL(this.LJLIL));
        LIZ.append("[]");
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.LJLIL;
    }

    public C65137PhN(Type type) {
        this.LJLIL = type;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && C65138PhO.LIZJ(this, (Type) obj)) {
            return true;
        }
        return false;
    }
}
