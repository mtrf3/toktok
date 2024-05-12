package com.bytedance.ugc.ugcwidget;

import X.AnonymousClass028;
import X.InterfaceC37351ElH;
import X.X1D;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class UGCServiceManager {
    public static InterfaceC37351ElH callback;
    public static final Map<Class, Object> implMap = new ConcurrentHashMap();

    public static void setCallback(InterfaceC37351ElH interfaceC37351ElH) {
    }

    public static <T> Constructor<T> checkClass(Class<T> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isAbstract(modifiers)) {
            if (!Modifier.isInterface(modifiers)) {
                return cls.getConstructor(new Class[0]);
            }
            StringBuilder LIZ = X1D.LIZ();
            throw new RuntimeException(AnonymousClass028.LIZLLL(LIZ, "UGCServiceManager DO NOT support interface class with ", cls, LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        throw new RuntimeException(AnonymousClass028.LIZLLL(LIZ2, "UGCServiceManager DO NOT support abstract class with ", cls, LIZ2));
    }

    public static <T> T getService(Class<T> cls) {
        Map<Class, Object> map = implMap;
        T t = (T) map.get(cls);
        if (t == null) {
            try {
                t = (T) checkClass(cls).newInstance(new Object[0]);
                map.put(cls, t);
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                throw new RuntimeException(AnonymousClass028.LIZLLL(LIZ, "UGCServiceManager UNKNOWN exception found with ", cls, LIZ), th);
            }
        }
        return t;
    }
}
