package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: X.FfI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39528FfI implements ParameterizedType {
    public final Type LJLIL;
    public final Type LJLILLLLZI;
    public final Type[] LJLJI;

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

    public C39528FfI(Type type, Type type2, Type[] typeArr) {
        this.LJLIL = type;
        this.LJLILLLLZI = type2;
        this.LJLJI = typeArr;
    }
}
