package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: X.PhV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65145PhV implements GenericArrayType {
    public final Type LJLIL;

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C65140PhQ.LJII(this.LJLIL));
        LIZ.append("[]");
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.LJLIL;
    }

    public C65145PhV(Type type) {
        this.LJLIL = type;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && C65140PhQ.LIZIZ(this, (Type) obj)) {
            return true;
        }
        return false;
    }
}
