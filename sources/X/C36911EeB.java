package X;

import java.io.FileDescriptor;
import java.lang.reflect.Method;

/* renamed from: X.EeB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36911EeB {
    public static final Method LIZ;

    public static void LIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "4791183199255182524")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    static {
        try {
            LIZ = FileDescriptor.class.getMethod("setInt$", Integer.TYPE);
        } catch (NoSuchMethodException | SecurityException e) {
            throw new RuntimeException("Unable to get FileDescriptor.setInt$", e);
        }
    }
}
