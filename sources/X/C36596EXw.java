package X;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* renamed from: X.EXw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36596EXw {
    public static final java.util.Map<String, Method> LIZ = new HashMap();

    public static Method LIZJ(String str) {
        Method method;
        java.util.Map<String, Method> map = LIZ;
        synchronized (map) {
            method = (Method) ((HashMap) map).get(str);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        return null;
    }

    public static Object LIZLLL(Class cls, Object... objArr) {
        Object[] objArr2;
        Class<?>[] clsArr;
        Class<?> cls2;
        if (objArr.length > 0) {
            objArr2 = objArr;
        } else {
            objArr2 = C1E5.LJLILLLLZI;
        }
        if (objArr.length == 0) {
            clsArr = C1E5.LJLJI;
        } else {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    cls2 = null;
                } else {
                    cls2 = obj.getClass();
                }
                clsArr[i] = cls2;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString());
        sb.append("#currentActivityThread");
        if (clsArr.length > 0) {
            for (Class<?> cls3 : clsArr) {
                sb.append(cls3.toString());
                sb.append("#");
            }
        } else {
            sb.append(Void.class.toString());
        }
        String sb2 = sb.toString();
        Method LIZJ = LIZJ(sb2);
        if (LIZJ == null) {
            try {
                LIZJ = cls.getMethod("currentActivityThread", clsArr);
                C36597EXx.LIZJ(LIZJ);
                java.util.Map<String, Method> map = LIZ;
                synchronized (map) {
                    ((HashMap) map).put(sb2, LIZJ);
                }
            } catch (NoSuchMethodException unused) {
                LIZJ = LIZ(cls, sb2, clsArr);
            }
        }
        if (LIZJ != null) {
            if (objArr2.length <= 0) {
                objArr2 = C1E5.LJLILLLLZI;
            }
            C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", LIZJ, new Object[]{null, objArr2}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-858813145718035734"));
            if (LIZJ2.LIZ) {
                return LIZJ2.LIZIZ;
            }
            return LIZJ.invoke(null, objArr2);
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("No such accessible method: ", "currentActivityThread", "() on object: ");
        LIZIZ.append(cls.getName());
        throw new NoSuchMethodException(X1D.LIZIZ(LIZIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        r9 = r1.getMethod(r3, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Method LIZ(java.lang.Class r12, java.lang.String r13, java.lang.Class... r14) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36596EXw.LIZ(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    public static Method LIZIZ(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (Modifier.isPublic(interfaces[i].getModifiers())) {
                    try {
                        return interfaces[i].getDeclaredMethod(str, clsArr);
                    } catch (Exception unused) {
                        Method LIZIZ = LIZIZ(interfaces[i], str, clsArr);
                        if (LIZIZ != null) {
                            return LIZIZ;
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }
}
