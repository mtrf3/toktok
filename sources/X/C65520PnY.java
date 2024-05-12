package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.TypeVariable;

/* renamed from: X.PnY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65520PnY<T> extends AbstractC65522Pna<T, T> {
    public final Constructor<?> LJLJI;

    @Override // java.lang.reflect.GenericDeclaration
    public final TypeVariable<?>[] getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = getDeclaringClass().getTypeParameters();
        TypeVariable<Constructor<?>>[] typeParameters2 = this.LJLJI.getTypeParameters();
        TypeVariable<?>[] typeVariableArr = new TypeVariable[typeParameters.length + typeParameters2.length];
        System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
        System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
        return typeVariableArr;
    }

    public C65520PnY(Constructor<?> constructor) {
        super(constructor);
        this.LJLJI = constructor;
    }
}
