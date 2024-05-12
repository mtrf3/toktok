package X;

import android.content.Context;
import com.bytedance.push.settings.ILocalSettings;
import com.bytedance.push.settings.ISettings;

/* loaded from: classes12.dex */
public final class PT6 {
    public static final PT2 LIZ;
    public static final PT4 LIZIZ;
    public static final PT5 LIZJ;

    static {
        PT2 pt2 = new PT2();
        LIZ = pt2;
        LIZIZ = new PT4(pt2);
        LIZJ = new PT5();
    }

    public static <T> T LIZ(Context context, Class<T> cls) {
        Object obj;
        if (ISettings.class.isAssignableFrom(cls)) {
            PT5 pt5 = LIZJ;
            ISettings iSettings = (T) pt5.LIZ.get(cls);
            if (iSettings == null) {
                synchronized (pt5.LIZIZ) {
                    if (pt5.LIZIZ.containsKey(cls)) {
                        obj = pt5.LIZIZ.get(cls);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = new Object();
                        pt5.LIZIZ.put(cls, obj);
                    }
                }
                synchronized (obj) {
                    iSettings = pt5.LIZ.get(cls);
                    if (iSettings == null) {
                        iSettings = (T) PT5.LIZ(context, cls);
                        pt5.LIZ.put(cls, iSettings);
                    }
                }
            } else if (pt5.LIZIZ.containsKey(cls)) {
                pt5.LIZIZ.remove(cls);
            }
            return (T) iSettings;
        }
        if (ILocalSettings.class.isAssignableFrom(cls)) {
            return (T) LIZIZ.LIZIZ(context, cls);
        }
        throw new IllegalArgumentException("tClass must be child of ISettings or ILocalSettings");
    }
}
