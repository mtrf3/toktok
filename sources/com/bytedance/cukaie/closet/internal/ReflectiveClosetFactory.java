package com.bytedance.cukaie.closet.internal;

import X.C16880lQ;
import X.HM5;
import X.HM6;
import X.HM9;
import X.HMA;
import X.InterfaceC44351Hat;
import X.X1D;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ReflectiveClosetFactory implements InterfaceC44351Hat {
    public final Class<?> clazz;
    public final HM6 closetAnnotation;

    @Override // X.InterfaceC44351Hat
    public String closetName() {
        return this.closetAnnotation.value();
    }

    public ReflectiveClosetFactory(Class<?> clazz) {
        o.LJIIJ(clazz, "clazz");
        this.clazz = clazz;
        HM6 hm6 = (HM6) clazz.getAnnotation(HM6.class);
        if (hm6 != null) {
            this.closetAnnotation = hm6;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Couldn't find @Closet annotation on class ");
        LIZ.append(C16880lQ.LJLLILLLL(clazz));
        throw new HMA(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC44351Hat
    public Object createCloset(HM5 store) {
        o.LJIIJ(store, "store");
        Object newProxyInstance = Proxy.newProxyInstance(this.clazz.getClassLoader(), new Class[]{this.clazz}, new HM9(store));
        o.LJFF(newProxyInstance, "Proxy.newProxyInstance(c…l\n            }\n        }");
        return newProxyInstance;
    }
}
