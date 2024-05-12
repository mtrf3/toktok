package X;

import android.content.Context;
import com.bytedance.push.settings.ILocalSettings;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class PT4 {
    public final Object LIZ;
    public final Object LIZIZ;

    public PT4(String str) {
        boolean z;
        if (str.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {str, 23};
        if (z) {
            this.LIZ = str;
            this.LIZIZ = null;
            return;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public /* synthetic */ PT4(PT2 pt2) {
        this.LIZ = new ConcurrentHashMap();
        this.LIZIZ = pt2;
    }

    public final ILocalSettings LIZ(Context context, Class cls) {
        PT3 pt3 = (PT3) this.LIZIZ;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(cls.getName());
            LIZ.append("$$SettingImpl");
            Constructor<?> constructor = Class.forName(X1D.LIZIZ(LIZ), true, cls.getClassLoader()).getConstructor(Context.class, InterfaceC66858QLu.class);
            PT7 pt7 = (PT7) cls.getAnnotation(PT7.class);
            if (pt7 != null) {
                return (ILocalSettings) constructor.newInstance(context, ((PT2) pt3).LIZ(context, pt7.storageKey(), pt7.supportMultiProcess()));
            }
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        } catch (IllegalAccessException e2) {
            C16880lQ.LLLLIIL(e2);
        } catch (InstantiationException e3) {
            C16880lQ.LLLLIIL(e3);
        } catch (NoSuchMethodException e4) {
            C16880lQ.LLLLIIL(e4);
        } catch (InvocationTargetException e5) {
            C16880lQ.LLLLIIL(e5);
        }
        throw new IllegalStateException("get settings instance error，please check warning log");
    }

    public final ILocalSettings LIZIZ(Context context, Class cls) {
        ILocalSettings iLocalSettings = (ILocalSettings) ((ConcurrentHashMap) this.LIZ).get(cls);
        if (iLocalSettings == null) {
            synchronized (this) {
                iLocalSettings = (ILocalSettings) ((ConcurrentHashMap) this.LIZ).get(cls);
                if (iLocalSettings == null) {
                    iLocalSettings = LIZ(context, cls);
                    ((ConcurrentHashMap) this.LIZ).put(cls, iLocalSettings);
                }
            }
        }
        return iLocalSettings;
    }
}
