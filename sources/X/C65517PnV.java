package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.PnV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65517PnV<T> extends C65520PnY<T> {
    public final /* synthetic */ AbstractC65516PnU LJLJJI;

    @Override // X.C40633Fx7
    public final String toString() {
        Method enclosingMethod;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJI);
        LIZ.append("(");
        C65477Pmr c65477Pmr = new C65477Pmr(", ");
        AbstractC65516PnU abstractC65516PnU = this.LJLJJI;
        Type[] genericParameterTypes = this.LJLJI.getGenericParameterTypes();
        if (genericParameterTypes.length > 0) {
            Class<?> declaringClass = this.LJLJI.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null || ((enclosingMethod = declaringClass.getEnclosingMethod()) == null ? !(declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) : (!Modifier.isStatic(enclosingMethod.getModifiers())))) {
                Class<?>[] parameterTypes = this.LJLJI.getParameterTypes();
                if (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) {
                    genericParameterTypes = (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
                }
            }
        }
        abstractC65516PnU.resolveInPlace(genericParameterTypes);
        LIZ.append(c65477Pmr.LIZ(Arrays.asList(genericParameterTypes)));
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C40633Fx7
    public final AbstractC65516PnU<T> LIZ() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65517PnV(AbstractC65516PnU abstractC65516PnU, Constructor constructor) {
        super(constructor);
        this.LJLJJI = abstractC65516PnU;
    }
}
