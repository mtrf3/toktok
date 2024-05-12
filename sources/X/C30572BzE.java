package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: X.BzE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30572BzE implements ParameterizedType {
    public final /* synthetic */ Class<?> LJLIL;
    public final /* synthetic */ Type[] LJLILLLLZI;

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

    public C30572BzE(Class<?> cls, Type[] typeArr) {
        this.LJLIL = cls;
        this.LJLILLLLZI = typeArr;
    }
}
