package X;

import android.app.Application;
import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a1t, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91889a1t {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str, String str2, String str3, C86825Y5t c86825Y5t, final InterfaceC88471Ynr interfaceC88471Ynr) {
        Class<?> cls = Class.forName("ij2.a");
        Object invoke = cls.getMethod("hasInitEd", new Class[0]).invoke(cls.getDeclaredField("INSTANCE").get(null), new Object[0]);
        if (invoke != null) {
            if (((Boolean) invoke).booleanValue()) {
                return;
            }
            Class<?> cls2 = Class.forName("aj2.d$a");
            Constructor<?> constructor = cls2.getConstructor(Application.class);
            Object[] objArr = new Object[1];
            Context LLLLL = C16880lQ.LLLLL(context);
            if (LLLLL != null) {
                objArr[0] = LLLLL;
                Object newInstance = constructor.newInstance(objArr);
                Class<?> cls3 = Class.forName("aj2.a");
                cls2.getMethod("withEventSender", cls3).invoke(newInstance, Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, new InvocationHandler() { // from class: X.a1p
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr2) {
                        InterfaceC88471Ynr event = InterfaceC88471Ynr.this;
                        o.LJIIIZ(event, "$event");
                        if (method.getName().equals("onEventV3")) {
                            try {
                                Object obj2 = objArr2[0];
                                if (obj2 != null) {
                                    String str4 = (String) obj2;
                                    Object obj3 = objArr2[1];
                                    if (obj3 != null) {
                                        event.invoke(str4, (JSONObject) obj3);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        return C76800UCe.LIZ;
                    }
                }));
                cls2.getMethod("withHost", String.class).invoke(newInstance, str3);
                Class<?> cls4 = Class.forName("rj2.a$a");
                Constructor<?> constructor2 = cls4.getConstructor(String.class, String.class);
                Object[] objArr2 = new Object[2];
                String str4 = c86825Y5t.LIZ;
                String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                objArr2[0] = str4;
                String str6 = c86825Y5t.LIZIZ;
                if (str6 != null) {
                    str5 = str6;
                }
                objArr2[1] = str5;
                cls2.getMethod("withAppInfo", cls4).invoke(newInstance, constructor2.newInstance(objArr2));
                cls2.getMethod("withNetClient", AbstractC66805QJt.class).invoke(newInstance, new C92206a70());
                Method method = cls2.getMethod("withLanguage", String.class);
                C91833a0z.LIZ.getClass();
                method.invoke(newInstance, C91833a0z.LIZJ);
                Class<?> cls5 = Class.forName("com.bytedance.bpea.cert.token.TokenCert");
                cls2.getMethod("withBpeaCert", Class.forName("com.bytedance.bpea.basics.Cert")).invoke(newInstance, cls5.getMethod("with", String.class).invoke(null, str));
                cls2.getMethod("withStorageBpeaCert", Class.forName("com.bytedance.bpea.basics.Cert")).invoke(newInstance, cls5.getMethod("with", String.class).invoke(null, str2));
                Class<?> cls6 = Class.forName("aj2.b");
                cls2.getMethod("withMonitorSender", cls6).invoke(newInstance, Proxy.newProxyInstance(cls6.getClassLoader(), new Class[]{cls6}, new InvocationHandler() { // from class: X.a1q
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr3) {
                        InterfaceC88471Ynr event = InterfaceC88471Ynr.this;
                        o.LJIIIZ(event, "$event");
                        if (method2.getName().equals("onSendEvent")) {
                            try {
                                Object obj2 = objArr3[0];
                                if (obj2 != null) {
                                    String str7 = (String) obj2;
                                    Object obj3 = objArr3[1];
                                    if (obj3 != null) {
                                        event.invoke(str7, (JSONObject) obj3);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        return C76800UCe.LIZ;
                    }
                }));
                Class<?> cls7 = Class.forName("aj2.c");
                cls2.getMethod("withStartlingService", cls7).invoke(newInstance, Proxy.newProxyInstance(cls7.getClassLoader(), new Class[]{cls7}, new InvocationHandler() { // from class: X.a1r
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr3) {
                        if (method2.getName().equals("getValue")) {
                            try {
                                Object obj2 = objArr3[0];
                                if (obj2 != null) {
                                    return C92054a4Y.LIZ((String) obj2, new String[0]);
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            } catch (Throwable unused) {
                            }
                        }
                        return "";
                    }
                }));
                cls.getMethod("init", Class.forName("aj2.d")).invoke(cls.getDeclaredField("INSTANCE").get(null), cls2.getMethod("build", new Class[0]).invoke(newInstance, new Object[0]));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }
}
