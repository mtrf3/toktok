package com.bytedance.vmsdk.jsbridge;

import X.C37637Ept;
import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class JSModuleManager {
    public final ConcurrentHashMap<String, C37637Ept> LIZ = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, JSModuleWrapper> LIZIZ;
    public Context LIZJ;

    private void destroy() {
        this.LIZJ = null;
        this.LIZIZ = null;
        this.LIZ.clear();
    }

    public JSModuleManager(Context context) {
        this.LIZJ = context;
    }

    private JSModuleWrapper moduleWrapperForName(String str) {
        return LIZ(str);
    }

    public final JSModuleWrapper LIZ(String str) {
        JSModule newInstance;
        if (str == null) {
            return null;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new ConcurrentHashMap<>();
        }
        if (this.LIZIZ.get(str) != null) {
            return this.LIZIZ.get(str);
        }
        C37637Ept c37637Ept = this.LIZ.get(str);
        if (c37637Ept == null) {
            return null;
        }
        Class<? extends JSModule> cls = c37637Ept.LIZIZ;
        if (c37637Ept.LIZJ == null) {
            for (Constructor<?> constructor : cls.getConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 1 && Context.class.equals(parameterTypes[0])) {
                    newInstance = (JSModule) constructor.newInstance(this.LIZJ);
                } else if (parameterTypes.length == 2 && Context.class.equals(parameterTypes[0]) && Object.class.equals(parameterTypes[1])) {
                    newInstance = (JSModule) constructor.newInstance(this.LIZJ, null);
                }
            }
            return null;
        }
        if (cls != null) {
            newInstance = cls.getConstructor(Context.class, Object.class).newInstance(this.LIZJ, c37637Ept.LIZJ);
        }
        return null;
        if (newInstance != null) {
            JSModuleWrapper jSModuleWrapper = new JSModuleWrapper(str, newInstance);
            this.LIZIZ.put(str, jSModuleWrapper);
            return jSModuleWrapper;
        }
        return null;
    }

    public final void LIZIZ(String str, Class<? extends JSModule> cls, Object obj) {
        C37637Ept c37637Ept = new C37637Ept();
        c37637Ept.LIZ = str;
        c37637Ept.LIZIZ = cls;
        c37637Ept.LIZJ = obj;
        this.LIZ.get(str);
        this.LIZ.put(str, c37637Ept);
    }
}
