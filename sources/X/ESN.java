package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class ESN {
    public static final java.util.Map<String, Object> LIZ = new ConcurrentHashMap();

    public static <T> T LIZ(String str) {
        try {
            java.util.Map<String, Object> map = LIZ;
            Object obj = (T) ((ConcurrentHashMap) map).get(str);
            if (obj == null) {
                synchronized (ESN.class) {
                    obj = ((ConcurrentHashMap) map).get(str);
                    if (obj == null) {
                        obj = (T) Class.forName(str).newInstance();
                        ((ConcurrentHashMap) map).put(str, obj);
                    }
                }
            }
            return (T) obj;
        } catch (Exception unused) {
            return null;
        }
    }
}
