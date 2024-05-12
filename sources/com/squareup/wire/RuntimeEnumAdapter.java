package com.squareup.wire;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import com.squareup.wire.WireEnum;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class RuntimeEnumAdapter<E extends WireEnum> extends EnumAdapter<E> {
    public final Class<E> LJ;
    public Method LJFF;

    public static Object LIZIZ(Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-5516863513618845641"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(null, objArr);
    }

    public final Method LIZJ() {
        Method method = this.LJFF;
        if (method != null) {
            return method;
        }
        try {
            Method method2 = this.LJ.getMethod("fromValue", Integer.TYPE);
            this.LJFF = method2;
            return method2;
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    public int hashCode() {
        return this.LJ.hashCode();
    }

    public RuntimeEnumAdapter(Class<E> cls) {
        super(cls);
        this.LJ = cls;
    }

    @Override // com.squareup.wire.EnumAdapter
    public final E LIZ(int i) {
        try {
            return (E) LIZIZ(LIZJ(), new Object[]{Integer.valueOf(i)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof RuntimeEnumAdapter) && ((RuntimeEnumAdapter) obj).LJ == this.LJ) {
            return true;
        }
        return false;
    }
}
