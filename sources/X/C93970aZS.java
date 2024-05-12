package X;

import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.aZS, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93970aZS {
    public final ConcurrentHashMap<Class<?>, Object> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<?>, InterfaceC93967aZP<?>> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<?>, InterfaceC93969aZR<?>> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<?>, Class<?>> LIZLLL = new ConcurrentHashMap<>();

    public static Object LIZJ(Class cls) {
        String LLLZ = C16880lQ.LLLZ("%s__ServiceProxy", Arrays.copyOf(new Object[]{cls.getName()}, 1));
        o.LJIIIIZZ(LLLZ, "java.lang.String.format(format, *args)");
        try {
            Object newInstance = Class.forName(LLLZ).newInstance();
            if (newInstance instanceof IServiceProxy) {
                return ((IServiceProxy) newInstance).newInstance();
            }
            return null;
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final <T> T LIZ(Class<T> cls) {
        T t = (T) this.LIZ.get(cls);
        if (t == null) {
            synchronized (cls) {
                T t2 = (T) this.LIZ.get(cls);
                if (t2 != null) {
                    return t2;
                }
                if (this.LIZLLL.containsKey(cls)) {
                    Class<?> cls2 = this.LIZLLL.get(cls);
                    o.LJI(cls2);
                    T t3 = (T) cls2.newInstance();
                    o.LJI(t3);
                    LIZIZ(cls, t3);
                    return t3;
                }
                InterfaceC93967aZP<?> interfaceC93967aZP = this.LIZIZ.get(cls);
                if (interfaceC93967aZP != null) {
                    T t4 = (T) interfaceC93967aZP.create();
                    this.LIZIZ.remove(cls);
                    if (t4 != null) {
                        LIZIZ(cls, t4);
                        return t4;
                    }
                }
                t = (T) LIZJ(cls);
                if (t != null) {
                    LIZIZ(cls, t);
                    return t;
                }
            }
        }
        return t;
    }

    public final <T> void LIZIZ(Class<T> cls, T t) {
        this.LIZ.put(cls, t);
        InterfaceC93969aZR<?> interfaceC93969aZR = this.LIZJ.get(cls);
        if (interfaceC93969aZR != null) {
            interfaceC93969aZR.LIZ();
            this.LIZJ.remove(cls);
        }
    }
}
