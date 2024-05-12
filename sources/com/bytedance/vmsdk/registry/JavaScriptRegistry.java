package com.bytedance.vmsdk.registry;

import X.C16880lQ;
import X.C37623Epf;
import X.C37624Epg;
import X.InterfaceC37633Epp;
import X.InterfaceC37634Epq;
import X.X1D;
import com.bytedance.vmsdk.jsbridge.utils.WritableArray;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import com.bytedance.vmsdk.worker.JsWorker;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class JavaScriptRegistry {
    public HashMap<Class<? extends InterfaceC37634Epq>, InterfaceC37634Epq> mModuleMap = new HashMap<>();
    public HashMap<Class<? extends InterfaceC37633Epp>, InterfaceC37633Epp> mFunctionMap = new HashMap<>();

    public static char commonTypeToChar(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Short.TYPE) {
            return 's';
        }
        if (cls == Short.class) {
            return 'S';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        if (cls == String.class) {
            return 'T';
        }
        if (cls == Byte.TYPE) {
            return 'b';
        }
        if (cls == Byte.class) {
            return 'B';
        }
        if (cls == Long.TYPE) {
            return 'l';
        }
        if (cls == Long.class) {
            return 'L';
        }
        if (cls == byte[].class) {
            return 'a';
        }
        return (char) 0;
    }

    public static char returnTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Got unknown return class: ");
        LIZ.append(C16880lQ.LJLLJ(cls));
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    public <T extends InterfaceC37633Epp> T getJavaScriptFunction(JsWorker jsWorker, Class<? extends InterfaceC37633Epp> cls) {
        T t = (T) this.mFunctionMap.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C37624Epg(jsWorker));
        this.mFunctionMap.put(cls, t2);
        return t2;
    }

    public <T extends InterfaceC37634Epq> T getJavaScriptModule(JsWorker jsWorker, Class<? extends InterfaceC37634Epq> cls) {
        T t = (T) this.mModuleMap.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C37623Epf(jsWorker, cls));
        this.mModuleMap.put(cls, t2);
        return t2;
    }
}
