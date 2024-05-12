package X;

import android.content.res.XmlBlock;
import android.util.AttributeSet;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.0M3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0M3 {
    public static volatile Constructor<?> LIZ;
    public static volatile Method LIZIZ;

    public static AttributeSet LIZIZ(byte[] bArr) {
        return new XmlBlock(bArr).newParser();
    }

    public static Method LIZJ() {
        Method method = LIZIZ;
        if (method == null) {
            synchronized (C0M3.class) {
                method = LIZIZ;
                if (method == null) {
                    method = Class.forName("android.content.res.XmlBlock").getDeclaredMethod("newParser", new Class[0]);
                    LIZIZ = method;
                }
            }
        }
        return method;
    }

    public C0M3() {
        throw new IllegalStateException("can not be instanced.");
    }

    public static AttributeSet LIZ(byte[] bArr) {
        Object invoke;
        Constructor<?> constructor = LIZ;
        if (constructor == null) {
            synchronized (C0M3.class) {
                constructor = LIZ;
                if (constructor == null) {
                    constructor = Class.forName("android.content.res.XmlBlock").getConstructor(byte[].class);
                    LIZ = constructor;
                }
            }
        }
        constructor.setAccessible(true);
        Object newInstance = constructor.newInstance(bArr);
        Method LIZJ = LIZJ();
        LIZJ.setAccessible(true);
        Object[] objArr = new Object[0];
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", LIZJ, new Object[]{newInstance, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8792065310999373893"));
        if (LIZJ2.LIZ) {
            invoke = LIZJ2.LIZIZ;
        } else {
            invoke = LIZJ.invoke(newInstance, objArr);
        }
        return (AttributeSet) invoke;
    }
}
