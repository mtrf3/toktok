package com.bytedance.pia.core;

import X.C37487EnT;
import X.C37503Enj;
import X.C37515Env;
import X.C37517Enx;
import X.C37523Eo3;
import X.C37525Eo5;
import X.InterfaceC37486EnS;
import X.InterfaceC37540EoK;
import X.InterfaceC37541EoL;
import X.InterfaceC37579Eox;
import X.InterfaceC37604EpM;
import X.InterfaceC40348FsW;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class ServiceProvider {
    public final Map<Class<?>, Object> services = new HashMap();

    public ServiceProvider() {
        put(InterfaceC37579Eox.class, C37523Eo3.LIZ);
        put(InterfaceC37540EoK.class, C37515Env.LIZ);
        put(InterfaceC37604EpM.class, C37503Enj.LIZ);
        put(InterfaceC37486EnS.class, C37487EnT.LIZ);
        put(InterfaceC37541EoL.class, C37517Enx.LIZ);
        put(InterfaceC40348FsW.class, C37525Eo5.LIZ);
    }

    public <T> T get(Class<T> cls) {
        try {
            return (T) this.services.get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    private <T> void put(Class<T> cls, T t) {
        this.services.put(cls, t);
    }
}
