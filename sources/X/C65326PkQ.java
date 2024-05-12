package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;

/* renamed from: X.PkQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65326PkQ implements GenericArrayType, Type {
    public final Type LJLIL;

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C65330PkU.LJ(this.LJLIL));
        LIZ.append("[]");
        return X1D.LIZIZ(LIZ);
    }

    public final String toString() {
        return getTypeName();
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.LJLIL;
    }

    public C65326PkQ(Type elementType) {
        o.LJIIIZ(elementType, "elementType");
        this.LJLIL = elementType;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && o.LJ(this.LJLIL, ((GenericArrayType) obj).getGenericComponentType())) {
            return true;
        }
        return false;
    }
}
