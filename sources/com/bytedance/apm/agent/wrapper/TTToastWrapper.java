package com.bytedance.apm.agent.wrapper;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.X1D;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.view.WindowManager;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class TTToastWrapper {

    /* loaded from: classes.dex */
    public static class ProxyTNHandler extends Handler {
        public Method handleHideMethod;
        public Method handleShowMethod;
        public Object tnObject;

        public static Object com_bytedance_apm_agent_wrapper_TTToastWrapper$ProxyTNHandler_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "195697679664906197"));
            return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
        }

        public ProxyTNHandler(Object obj) {
            this.tnObject = obj;
            try {
                Method declaredMethod = obj.getClass().getDeclaredMethod("handleShow", IBinder.class);
                this.handleShowMethod = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = obj.getClass().getDeclaredMethod("handleHide", new Class[0]);
                this.handleHideMethod = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException e) {
                C16880lQ.LLLLIIL(e);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Method method;
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 && (method = this.handleHideMethod) != null) {
                        try {
                            com_bytedance_apm_agent_wrapper_TTToastWrapper$ProxyTNHandler_java_lang_reflect_Method_invoke(method, this.tnObject, new Object[0]);
                        } catch (IllegalAccessException e) {
                            C16880lQ.LLLLIIL(e);
                        } catch (InvocationTargetException e2) {
                            C16880lQ.LLLLIIL(e2);
                        }
                    }
                } else {
                    Method method2 = this.handleHideMethod;
                    if (method2 != null) {
                        try {
                            com_bytedance_apm_agent_wrapper_TTToastWrapper$ProxyTNHandler_java_lang_reflect_Method_invoke(method2, this.tnObject, new Object[0]);
                        } catch (IllegalAccessException e3) {
                            C16880lQ.LLLLIIL(e3);
                        } catch (InvocationTargetException e4) {
                            C16880lQ.LLLLIIL(e4);
                        }
                    }
                }
            } else {
                Object obj = message.obj;
                Method method3 = this.handleShowMethod;
                if (method3 != null) {
                    try {
                        com_bytedance_apm_agent_wrapper_TTToastWrapper$ProxyTNHandler_java_lang_reflect_Method_invoke(method3, this.tnObject, new Object[]{obj});
                    } catch (WindowManager.BadTokenException e5) {
                        C16880lQ.LLLLIIL(e5);
                    } catch (IllegalAccessException e6) {
                        C16880lQ.LLLLIIL(e6);
                    } catch (InvocationTargetException e7) {
                        C16880lQ.LLLLIIL(e7);
                    }
                }
            }
            super.handleMessage(message);
        }
    }

    public static boolean initToastHook(Toast toast) {
        int i = Build.VERSION.SDK_INT;
        if (i == 24 || i == 25) {
            reflectAndoridNTNHandler(toast);
            return true;
        }
        return true;
    }

    public static boolean reflectAndoridNTNHandler(Toast toast) {
        Field declaredField;
        Field declaredField2;
        try {
            if (toast.getClass().getSuperclass() != null && Toast.class.getName().equals(toast.getClass().getSuperclass().getName())) {
                declaredField = toast.getClass().getSuperclass().getDeclaredField("mTN");
            } else {
                declaredField = toast.getClass().getDeclaredField("mTN");
            }
            if (declaredField == null) {
                return false;
            }
            declaredField.setAccessible(true);
            Object obj = declaredField.get(toast);
            if (obj == null || (declaredField2 = obj.getClass().getDeclaredField("mHandler")) == null) {
                return false;
            }
            declaredField2.setAccessible(true);
            declaredField2.set(obj, new ProxyTNHandler(obj));
            return true;
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        } catch (NoSuchFieldException e2) {
            C16880lQ.LLLLIIL(e2);
            return false;
        }
    }

    public static Toast makeText(Context context, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) context.getResources().getText(i));
        LIZ.append("__wrapper");
        return makeText(context, X1D.LIZIZ(LIZ), i2);
    }

    public static Toast makeText(Context context, CharSequence charSequence, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) charSequence);
        LIZ.append("__wrapper");
        Toast makeText = Toast.makeText(context, X1D.LIZIZ(LIZ), i);
        initToastHook(makeText);
        return makeText;
    }
}
