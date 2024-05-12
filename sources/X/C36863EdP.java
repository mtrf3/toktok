package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: X.EdP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36863EdP implements ParameterizedType {
    public final Type LJLIL;
    public final Type[] LJLILLLLZI;

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return null;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.LJLILLLLZI;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.LJLIL;
    }

    public static void LIZ(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isPrimitive()) {
            } else {
                throw new IllegalArgumentException(C09K.LIZIZ("ParameterizedType doesn't support primitive Type: ", cls));
            }
        }
    }

    public C36863EdP(Type type, Type[] typeArr) {
        this.LJLIL = type;
        this.LJLILLLLZI = typeArr;
        LIZ(type);
        for (Type type2 : typeArr) {
            LIZ(type2);
        }
    }
}
