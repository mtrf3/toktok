package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PkR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65327PkR implements ParameterizedType, Type {
    public final Class<?> LJLIL;
    public final Type LJLILLLLZI;
    public final Type[] LJLJI;

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Type type = this.LJLILLLLZI;
        if (type != null) {
            sb.append(C65330PkU.LJ(type));
            sb.append("$");
            sb.append(C16880lQ.LJLLJ(this.LJLIL));
        } else {
            sb.append(C65330PkU.LJ(this.LJLIL));
        }
        Type[] typeArr = this.LJLJI;
        if (typeArr.length != 0) {
            ORY.LJJJJJ(typeArr, sb, ", ", "<", ">", -1, "...", C65328PkS.LJLIL);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.LJLIL.hashCode();
        Type type = this.LJLILLLLZI;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return (hashCode ^ i) ^ Arrays.hashCode(this.LJLJI);
    }

    public final String toString() {
        return getTypeName();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.LJLJI;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.LJLILLLLZI;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.LJLIL;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (o.LJ(this.LJLIL, parameterizedType.getRawType()) && o.LJ(this.LJLILLLLZI, parameterizedType.getOwnerType()) && Arrays.equals(this.LJLJI, parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    public C65327PkR(Class<?> cls, Type type, List<? extends Type> list) {
        this.LJLIL = cls;
        this.LJLILLLLZI = type;
        this.LJLJI = (Type[]) ((ArrayList) list).toArray(new Type[0]);
    }
}
