package com.bytedance.pitaya.thirdcomponent.stddelegate;

import X.C221108m2;
import X.C5H3;
import X.C93341aPJ;
import X.C93342aPK;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class PitayaInnerServiceProvider implements ReflectionCall {
    public static HashMap<Class<?>, Object> injectServices;
    public static final PitayaInnerServiceProvider INSTANCE = new PitayaInnerServiceProvider();
    public static final C5H3 serviceMap$delegate = C221108m2.LIZIZ(C93342aPK.LJLIL);
    public static final C5H3 innerServices$delegate = C221108m2.LIZIZ(C93341aPJ.LJLIL);

    private final HashMap<Class<?>, Object> getInnerServices() {
        return (HashMap) innerServices$delegate.getValue();
    }

    public final HashMap<String, String> getServiceMap() {
        return (HashMap) serviceMap$delegate.getValue();
    }

    public static final <T extends ReflectionCall> T getService(Class<T> serviceClass) {
        Object obj;
        o.LJIIJ(serviceClass, "serviceClass");
        HashMap<Class<?>, Object> hashMap = injectServices;
        if (hashMap != null) {
            obj = hashMap.get(serviceClass);
        } else {
            obj = null;
        }
        T t = (T) obj;
        if (t != null) {
            return t;
        }
        return (T) INSTANCE.getInnerServices().get(serviceClass);
    }

    public static final void setServices(HashMap<Class<?>, Object> services) {
        o.LJIIJ(services, "services");
        HashMap<Class<?>, Object> hashMap = new HashMap<>();
        hashMap.putAll(services);
        injectServices = hashMap;
    }
}
