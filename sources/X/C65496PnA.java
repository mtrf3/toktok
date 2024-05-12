package X;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: X.PnA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65496PnA implements GenericArrayType, Serializable {
    public static final long serialVersionUID = 0;
    public final Type LJLIL;

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        String obj;
        StringBuilder LIZ = X1D.LIZ();
        Type type = this.LJLIL;
        if (type instanceof Class) {
            obj = ((Class) type).getName();
        } else {
            obj = type.toString();
        }
        return JBR.LJFF(LIZ, obj, "[]", LIZ);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.LJLIL;
    }

    public C65496PnA(Type type) {
        this.LJLIL = EnumC65510PnO.LJLJI.LJFF(type);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return C78886Uxe.LJIIIIZZ(this.LJLIL, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }
}
