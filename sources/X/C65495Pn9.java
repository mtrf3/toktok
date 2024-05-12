package X;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: X.Pn9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65495Pn9 implements ParameterizedType, Serializable {
    public static final long serialVersionUID = 0;
    public final Type LJLIL;
    public final AbstractC65590Pog<Type> LJLILLLLZI;
    public final Class<?> LJLJI;

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        AbstractC65590Pog<Type> abstractC65590Pog = this.LJLILLLLZI;
        return (Type[]) abstractC65590Pog.toArray(new Type[abstractC65590Pog.size()]);
    }

    public final int hashCode() {
        int hashCode;
        Type type = this.LJLIL;
        if (type == null) {
            hashCode = 0;
        } else {
            hashCode = type.hashCode();
        }
        return (hashCode ^ this.LJLILLLLZI.hashCode()) ^ this.LJLJI.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.LJLIL != null) {
            EnumC65510PnO enumC65510PnO = EnumC65510PnO.LJLJI;
            enumC65510PnO.getClass();
            if (!(enumC65510PnO instanceof C65509PnN)) {
                sb.append(enumC65510PnO.LIZLLL(this.LJLIL));
                sb.append('.');
            }
        }
        sb.append(this.LJLJI.getName());
        sb.append('<');
        C65478Pms c65478Pms = C65484Pmy.LIZIZ;
        AbstractC65590Pog<Type> abstractC65590Pog = this.LJLILLLLZI;
        abstractC65590Pog.getClass();
        sb.append(c65478Pms.LIZ(new C65498PnC(abstractC65590Pog)));
        sb.append('>');
        return sb.toString();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.LJLIL;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.LJLJI;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (!this.LJLJI.equals(parameterizedType.getRawType()) || !C78886Uxe.LJIIIIZZ(this.LJLIL, parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
            return false;
        }
        return true;
    }

    public C65495Pn9(Type type, Class<?> cls, Type[] typeArr) {
        boolean z;
        cls.getClass();
        if (typeArr.length == cls.getTypeParameters().length) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJ(z);
        C65484Pmy.LIZ(typeArr, "type parameter");
        this.LJLIL = type;
        this.LJLJI = cls;
        this.LJLILLLLZI = EnumC65510PnO.LJLJI.LJ(typeArr);
    }
}
