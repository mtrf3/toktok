package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class CN1 {
    public static final ConcurrentHashMap<Class<? extends InterfaceC06390Mx>, InterfaceC06390Mx> LIZ = new ConcurrentHashMap<>();
    public static volatile CN2 LIZIZ = null;

    public static <T extends InterfaceC06390Mx> T LIZ(Class<T> cls) {
        Object newInstance;
        T t = (T) LIZ.get(cls);
        if (t == null) {
            if (LIZIZ == null) {
                synchronized (CN1.class) {
                    if (LIZIZ == null) {
                        try {
                            if (LiveServiceManagerOptSetting.enable()) {
                                newInstance = Class.forName("com.bytedance.android.live.service.initializer.ServiceInitializerV2").getConstructor(new Class[0]).newInstance(new Object[0]);
                            } else {
                                newInstance = Class.forName("com.bytedance.android.live.service.initializer.ServiceInitializer").getConstructor(new Class[0]).newInstance(new Object[0]);
                            }
                            if (newInstance instanceof CN2) {
                                LIZIZ = (CN2) newInstance;
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                }
            }
            CN2 cn2 = LIZIZ;
            if (cn2 != null && (t = (T) cn2.getService(cls)) != null) {
                LIZIZ(cls, t);
            }
        }
        if (t != null) {
            return t;
        }
        try {
            C78477Ur3.LIZ.LIZ();
            return (T) LIZ.get(cls);
        } catch (Exception unused2) {
            return t;
        }
    }

    public static <T extends InterfaceC06390Mx> void LIZIZ(Class<T> cls, T t) {
        if (t == null) {
            return;
        }
        LIZ.put(cls, t);
    }
}
