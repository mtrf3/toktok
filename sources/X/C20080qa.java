package X;

import android.os.IBinder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0qa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20080qa {
    public final java.util.Map<String, InterfaceC20100qc> LIZ = new HashMap();

    public final void LIZ() {
        if (((HashMap) this.LIZ).size() == 0) {
            return;
        }
        Class<?> cls = Class.forName("android.os.ServiceManager");
        Method declaredMethod = cls.getDeclaredMethod("getService", String.class);
        Field declaredField = cls.getDeclaredField("sCache");
        declaredField.setAccessible(true);
        java.util.Map map = (java.util.Map) declaredField.get(null);
        for (Map.Entry entry : ((HashMap) this.LIZ).entrySet()) {
            Object key = entry.getKey();
            InterfaceC20100qc interfaceC20100qc = (InterfaceC20100qc) entry.getValue();
            C20090qb c20090qb = new C20090qb((IBinder) declaredMethod.invoke(null, key), interfaceC20100qc);
            IBinder iBinder = (IBinder) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{IBinder.class}, c20090qb);
            c20090qb.LIZIZ = iBinder;
            map.put(key, iBinder);
        }
    }
}
