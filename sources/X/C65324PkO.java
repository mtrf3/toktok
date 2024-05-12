package X;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.PkO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65324PkO implements WildcardType, Type {
    public static final C65324PkO LJLJI = new C65324PkO(null, null);
    public final Type LJLIL;
    public final Type LJLILLLLZI;

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.LJLIL;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.LJLILLLLZI;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        if (this.LJLILLLLZI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("? super ");
            LIZ.append(C65330PkU.LJ(this.LJLILLLLZI));
            return X1D.LIZIZ(LIZ);
        }
        Type type = this.LJLIL;
        if (type != null && !o.LJ(type, Object.class)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("? extends ");
            LIZ2.append(C65330PkU.LJ(this.LJLIL));
            return X1D.LIZIZ(LIZ2);
        }
        return "?";
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    public C65324PkO(Type type, Type type2) {
        this.LJLIL = type;
        this.LJLILLLLZI = type2;
    }
}
