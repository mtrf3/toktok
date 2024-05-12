package X;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

/* renamed from: X.Pnb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65523Pnb<T> extends AbstractC65522Pna<T, Object> {
    public final Method LJLJI;

    @Override // java.lang.reflect.GenericDeclaration
    public final TypeVariable<?>[] getTypeParameters() {
        return this.LJLJI.getTypeParameters();
    }

    public C65523Pnb(Method method) {
        super(method);
        this.LJLJI = method;
    }
}
