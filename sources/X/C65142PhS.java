package X;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: X.PhS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65142PhS implements WildcardType {
    public final Type LJLIL;
    public final Type LJLILLLLZI;

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.LJLIL};
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.LJLILLLLZI;
        if (type != null) {
            return new Type[]{type};
        }
        return C65140PhQ.LIZ;
    }

    public final int hashCode() {
        int i;
        Type type = this.LJLILLLLZI;
        if (type != null) {
            i = type.hashCode() + 31;
        } else {
            i = 1;
        }
        return i ^ (this.LJLIL.hashCode() + 31);
    }

    public final String toString() {
        if (this.LJLILLLLZI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("? super ");
            LIZ.append(C65140PhQ.LJII(this.LJLILLLLZI));
            return X1D.LIZIZ(LIZ);
        }
        if (this.LJLIL == Object.class) {
            return "?";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("? extends ");
        LIZ2.append(C65140PhQ.LJII(this.LJLIL));
        return X1D.LIZIZ(LIZ2);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && C65140PhQ.LIZIZ(this, (Type) obj)) {
            return true;
        }
        return false;
    }

    public C65142PhS(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    Type type = typeArr2[0];
                    type.getClass();
                    C65140PhQ.LIZ(type);
                    if (typeArr[0] == Object.class) {
                        this.LJLILLLLZI = typeArr2[0];
                        this.LJLIL = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                Type type2 = typeArr[0];
                type2.getClass();
                C65140PhQ.LIZ(type2);
                this.LJLILLLLZI = null;
                this.LJLIL = typeArr[0];
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
