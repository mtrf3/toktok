package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes7.dex */
public abstract class EV2 implements InvocationHandler {
    public final Object LIZ;

    public final Object LIZ() {
        Object obj = null;
        if (this.LIZ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = this.LIZ.getClass(); cls != null; cls = cls.getSuperclass()) {
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces != null) {
                arrayList.addAll(Arrays.asList(interfaces));
            }
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        if (clsArr.length == 0) {
            return null;
        }
        try {
            obj = Proxy.newProxyInstance(this.LIZ.getClass().getClassLoader(), clsArr, this);
            return obj;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return obj;
        }
    }

    public EV2(Object obj) {
        this.LIZ = obj;
    }
}
