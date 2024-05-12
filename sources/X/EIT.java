package X;

import java.util.LinkedHashMap;
import java.util.Random;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EIT {
    public static final Random LIZ = new Random();
    public static final java.util.Map<String, InterfaceC36227EJr> LIZIZ = new LinkedHashMap();

    public static final InterfaceC36227EJr LIZ(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            boolean z = false;
            if (o.LJ(str, "system_launch")) {
                if (C35810E3q.LJIIIIZZ() || LIZ.nextFloat() < 0.005f) {
                    z = true;
                }
                obj = new EIU(str, z);
            } else {
                if (C35810E3q.LJIIIIZZ() || LIZ.nextFloat() < 0.005f) {
                    z = true;
                }
                obj = new EIW(str, z);
            }
            linkedHashMap.put(str, obj);
        }
        return (InterfaceC36227EJr) obj;
    }
}
