package com.lynx.tasm.behavior.utils;

import X.C03880Dg;
import X.C25620zW;
import X.C65300Pk0;
import X.EWR;
import X.InterfaceC38231EzT;
import X.X1D;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import defpackage.i0;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class LynxUIMethodsExecutor {
    public static final Map<Class<?>, InterfaceC38231EzT<?>> LIZ = new HashMap();

    /* loaded from: classes7.dex */
    public static class FallbackLynxUIMethodInvoker<T extends LynxBaseUI> implements InterfaceC38231EzT<T> {
        public final Map<String, Method> LIZ;

        public static void LIZ(Object obj, Method method, Object[] objArr) {
            if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "6176028870337901277")).LIZ) {
                return;
            }
            method.invoke(obj, objArr);
        }

        public FallbackLynxUIMethodInvoker(Class<? extends LynxBaseUI> cls) {
            this.LIZ = EWR.LIZ(cls);
        }

        @Override // X.InterfaceC38231EzT
        public final void invoke(T t, String str, ReadableMap readableMap, Callback callback) {
            Method method = this.LIZ.get(str);
            if (method == null) {
                callback.invoke(3);
                return;
            }
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 0) {
                    LIZ(t, method, new Object[0]);
                } else if (parameterTypes.length == 1) {
                    Class<?> cls = parameterTypes[0];
                    if (cls == ReadableMap.class) {
                        LIZ(t, method, new Object[]{readableMap});
                    } else if (cls == Callback.class) {
                        LIZ(t, method, new Object[]{callback});
                    }
                } else if (parameterTypes[0] == ReadableMap.class && parameterTypes[1] == Callback.class) {
                    LIZ(t, method, new Object[]{readableMap, callback});
                } else {
                    callback.invoke(4);
                    LLog.LIZLLL(1, "FallbackMethodInvoker", "invoke target method: params invalid");
                }
            } catch (Exception e) {
                callback.invoke(1);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("invoke target method exception,");
                LIZ.append(e.getMessage());
                LLog.LIZLLL(1, "FallbackMethodInvoker", X1D.LIZIZ(LIZ));
            }
        }
    }

    public static void LIZ(LynxBaseUI lynxBaseUI, String str, ReadableMap readableMap, Callback callback) {
        Object obj;
        Class<?> cls = lynxBaseUI.getClass();
        InterfaceC38231EzT<?> interfaceC38231EzT = LIZ.get(cls);
        if (interfaceC38231EzT == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(cls.getName());
            LIZ2.append("$$MethodInvoker");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            try {
                obj = Class.forName(LIZIZ).newInstance();
            } catch (ClassNotFoundException unused) {
                obj = null;
            } catch (IllegalAccessException e) {
                e = e;
                throw new RuntimeException(i0.LJFF("Unable to instantiate methods invoker for ", LIZIZ), e);
            } catch (InstantiationException e2) {
                e = e2;
                throw new RuntimeException(i0.LJFF("Unable to instantiate methods invoker for ", LIZIZ), e);
            }
            interfaceC38231EzT = (InterfaceC38231EzT) obj;
            if (interfaceC38231EzT == null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("MethodInvoker not generated for class: ");
                LIZ3.append(cls.getName());
                LIZ3.append(". You should add module lynxProcessor");
                String LIZIZ2 = X1D.LIZIZ(LIZ3);
                LLog.LIZLLL(4, "MethodsExecutor", LIZIZ2);
                if (!LynxEnv.LJIIIZ().LJIJJLI || !LynxEnv.LJIIIZ().LJIIJJI()) {
                    interfaceC38231EzT = new FallbackLynxUIMethodInvoker<>(cls);
                } else {
                    throw new IllegalStateException(LIZIZ2);
                }
            }
            LIZ.put(cls, interfaceC38231EzT);
        }
        try {
            interfaceC38231EzT.invoke(lynxBaseUI, str, readableMap, callback);
        } catch (Exception e3) {
            StringBuilder LIZIZ3 = C25620zW.LIZIZ("Invoke method '", str, "' error: ");
            LIZIZ3.append(e3.getMessage());
            RuntimeException runtimeException = new RuntimeException(X1D.LIZIZ(LIZIZ3), e3);
            runtimeException.setStackTrace(e3.getStackTrace());
            lynxBaseUI.mContext.LJII(runtimeException, 601, lynxBaseUI.getPlatformCustomInfo());
        }
    }
}
