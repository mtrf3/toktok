package X;

import android.content.Context;
import com.bytedance.push.settings.ISettings;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class PT5 {
    public final ConcurrentHashMap<Class<? extends ISettings>, ISettings> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<? extends ISettings>, Object> LIZIZ = new ConcurrentHashMap<>();

    public static <T extends ISettings> T LIZ(Context context, Class<T> cls) {
        PT7 pt7;
        PT2 pt2 = PT6.LIZ;
        try {
            pt7 = (PT7) cls.getAnnotation(PT7.class);
        } catch (ClassNotFoundException e) {
            e = e;
            C16880lQ.LLLLIIL(e);
        } catch (IllegalAccessException e2) {
            e = e2;
            C16880lQ.LLLLIIL(e);
        } catch (InstantiationException e3) {
            e = e3;
            C16880lQ.LLLLIIL(e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            C16880lQ.LLLLIIL(e);
        } catch (InvocationTargetException e5) {
            e = e5;
            C16880lQ.LLLLIIL(e);
        }
        if (pt7 != null) {
            return (T) LIZIZ(context, cls, pt2.LIZ(context, pt7.storageKey(), pt7.supportMultiProcess()));
        }
        e = null;
        if (e != null) {
            throw new IllegalStateException("get settings instance error，please check warning log", e);
        }
        throw new IllegalStateException("get settings instance error，please check warning log");
    }

    public static <T extends ISettings> ISettings LIZIZ(Context context, Class<T> cls, InterfaceC66858QLu interfaceC66858QLu) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(cls.getName());
        LIZ.append("$$SettingImpl");
        ISettings iSettings = (ISettings) Class.forName(X1D.LIZIZ(LIZ), true, cls.getClassLoader()).getConstructor(InterfaceC66858QLu.class).newInstance(interfaceC66858QLu);
        iSettings.updateSettings(context, null);
        return iSettings;
    }
}
