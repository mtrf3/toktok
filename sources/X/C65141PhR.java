package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: X.PhR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65141PhR implements ParameterizedType {
    public final Type LJLIL;
    public final Type LJLILLLLZI;
    public final Type[] LJLJI;

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.LJLJI.clone();
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.LJLJI) ^ this.LJLILLLLZI.hashCode();
        Type type = this.LJLIL;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.LJLJI.length + 1) * 30);
        sb.append(C65140PhQ.LJII(this.LJLILLLLZI));
        if (this.LJLJI.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(C65140PhQ.LJII(this.LJLJI[0]));
        for (int i = 1; i < this.LJLJI.length; i++) {
            sb.append(", ");
            sb.append(C65140PhQ.LJII(this.LJLJI[i]));
        }
        sb.append(">");
        return sb.toString();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.LJLIL;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.LJLILLLLZI;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && C65140PhQ.LIZIZ(this, (Type) obj)) {
            return true;
        }
        return false;
    }

    public C65141PhR(Type type, Type type2, Type... typeArr) {
        boolean z;
        if (type2 instanceof Class) {
            if (type == null) {
                z = true;
            } else {
                z = false;
            }
            if (z != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        this.LJLIL = type;
        this.LJLILLLLZI = type2;
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.LJLJI = typeArr2;
        for (Type type3 : typeArr2) {
            type3.getClass();
            C65140PhQ.LIZ(type3);
        }
    }
}
