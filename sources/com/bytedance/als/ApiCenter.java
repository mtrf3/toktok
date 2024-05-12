package com.bytedance.als;

import X.C0I6;
import X.X1D;
import androidx.lifecycle.ViewModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ApiCenter {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Map<Class<?>, Object> LIZ;
    public boolean LIZIZ;
    public final ApiCenter LIZJ;

    /* loaded from: classes.dex */
    public static final class ApiCenterCompatViewModel extends ViewModel {
        public final ApiCenter LJLIL = new ApiCenter(0);
    }

    public ApiCenter() {
        this(0);
    }

    public ApiCenter(int i) {
        this.LIZJ = null;
        this.LIZ = new HashMap();
    }

    public final synchronized <T extends C0I6> T LIZ(Class<T> cls) {
        Object obj;
        Object obj2 = ((HashMap) this.LIZ).get(cls);
        if (obj2 != null) {
            return (T) obj2;
        }
        Iterator it = ((HashMap) this.LIZ).keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (LIZIZ(cls, (Class) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Class cls2 = (Class) obj;
        ApiCenter apiCenter = this.LIZJ;
        if (cls2 != null) {
            Object obj3 = ((HashMap) this.LIZ).get(cls2);
            if (obj3 != null) {
                return (T) obj3;
            }
            throw new NullPointerException("null cannot be cast to non-null type T");
        }
        if (apiCenter != null) {
            return (T) apiCenter.LIZ(cls);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("not found ");
        LIZ.append(cls);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final synchronized <T extends C0I6> T LIZJ(Class<T> cls) {
        Object obj;
        Object obj2 = ((HashMap) this.LIZ).get(cls);
        if (obj2 != null) {
            return (T) obj2;
        }
        Iterator it = ((HashMap) this.LIZ).keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (LIZIZ(cls, (Class) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Class cls2 = (Class) obj;
        ApiCenter apiCenter = this.LIZJ;
        if (cls2 != null) {
            Object obj3 = ((HashMap) this.LIZ).get(cls2);
            if (obj3 != null) {
                return (T) obj3;
            }
            throw new NullPointerException("null cannot be cast to non-null type T");
        }
        if (apiCenter == null) {
            return null;
        }
        return (T) apiCenter.LIZJ(cls);
    }

    public static boolean LIZIZ(Class cls, Class cls2) {
        if (cls.isInterface()) {
            Class<?>[] interfaces = cls2.getInterfaces();
            o.LJIIIIZZ(interfaces, "right.interfaces");
            for (Class<?> i : interfaces) {
                if (o.LJ(i, cls)) {
                    return true;
                }
                o.LJIIIIZZ(i, "i");
                if (LIZIZ(cls, i)) {
                    return true;
                }
            }
            return false;
        }
        while (!o.LJ(cls2, Object.class)) {
            if (o.LJ(cls2, cls)) {
                return true;
            }
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
            }
        }
        return false;
    }
}
