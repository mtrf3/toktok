package X;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.EbX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36747EbX {
    public static final Object LIZ;

    public static void LIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-6478818308699100747")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    static {
        Object obj;
        Object obj2 = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            obj = null;
        }
        LIZ = obj;
        if (obj == null) {
            return;
        }
        try {
            Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused2) {
            if (obj == null) {
                return;
            }
        }
        try {
            try {
                Method method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
                if (method == null) {
                    return;
                }
                try {
                    obj2 = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
                } catch (ThreadDeath e3) {
                    throw e3;
                } catch (Throwable unused3) {
                }
                LIZ(obj2, method, new Object[]{new Throwable()});
            } catch (ThreadDeath e4) {
                throw e4;
            }
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused4) {
        }
    }

    public static String LIZIZ(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void LIZJ(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            if (!(th instanceof Error)) {
                return;
            } else {
                throw th;
            }
        }
        throw th;
    }
}
