package X;

import java.lang.reflect.Method;

/* renamed from: X.EUg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36502EUg {
    public static final Class<?> LIZ;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        LIZ = cls;
    }

    public static final C36501EUf LIZ() {
        Object invoke;
        Method declaredMethod = LIZ.getDeclaredMethod("getEmptyRegistry", new Class[0]);
        Object[] objArr = new Object[0];
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", declaredMethod, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8392102493629258521"));
        if (LIZJ.LIZ) {
            invoke = LIZJ.LIZIZ;
        } else {
            invoke = declaredMethod.invoke(null, objArr);
        }
        return (C36501EUf) invoke;
    }
}
