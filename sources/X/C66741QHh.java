package X;

import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* renamed from: X.QHh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66741QHh {
    public static final List<String> LIZ = Collections.singletonList("EncryptUtils");
    public static final java.util.Map<String, InterfaceC66743QHj> LIZIZ = new ConcurrentHashMap();

    public static void LIZ(String str) {
        QI3 LIZ2;
        if (!((ConcurrentHashMap) LIZIZ).containsKey(str)) {
            try {
                if (Class.forName("com.bytedance.applog.et_verify.EventVerify") == null || (LIZ2 = C66745QHl.LIZ(str)) == null) {
                    return;
                }
                try {
                    Constructor<?> constructor = Class.forName("com.bytedance.applog.et_verify.EventVerify").getConstructor(QI3.class);
                    constructor.setAccessible(true);
                    InterfaceC66743QHj interfaceC66743QHj = (InterfaceC66743QHj) constructor.newInstance(LIZ2);
                    if (interfaceC66743QHj == null) {
                        QIX.LJIJJ().LJIILJJIL(LIZ, new Object[0]);
                        return;
                    }
                    QIX.LJIJJ().LJIILIIL(LIZ, interfaceC66743QHj);
                    if (interfaceC66743QHj == null) {
                        return;
                    }
                    ((ConcurrentHashMap) LIZIZ).put(str, interfaceC66743QHj);
                } catch (Exception unused) {
                    QIX.LJIJJ().LJIILJJIL(LIZ, new Object[0]);
                } catch (Throwable th) {
                    QIX.LJIJJ().LJIILJJIL(LIZ, new Object[0]);
                    throw th;
                }
            } catch (ClassNotFoundException unused2) {
            }
        }
    }

    public static boolean LIZIZ(String str) {
        java.util.Map<String, InterfaceC66743QHj> map = LIZIZ;
        if (((ConcurrentHashMap) map).containsKey(str)) {
            return ((InterfaceC66743QHj) ((ConcurrentHashMap) map).get(str)).isEnable();
        }
        return false;
    }

    public static void LIZLLL(String str, String str2) {
        LIZ(str);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        if (concurrentHashMap.containsKey(str)) {
            ((InterfaceC66743QHj) concurrentHashMap.get(str)).setEventVerifyUrl(str2);
        } else {
            QIX.LJIJJ().LIZIZ(LIZ, new Object[0]);
        }
    }

    public static void LIZJ(String str, String str2, JSONArray jSONArray) {
        LIZ(str);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        if (concurrentHashMap.containsKey(str)) {
            ((InterfaceC66743QHj) concurrentHashMap.get(str)).putEvent(str2, jSONArray);
        }
    }
}
