package X;

import android.graphics.Bitmap;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.o;

/* renamed from: X.a71, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92207a71 implements InterfaceC91978a3K {
    public final /* synthetic */ Object LIZ;

    public C92207a71(Object obj) {
        this.LIZ = obj;
    }

    @Override // X.InterfaceC91978a3K
    public final void LIZ(final C92181a6b c92181a6b) {
        String str;
        String str2;
        Class<?> cls = Class.forName("ij2.a");
        Class<?> cls2 = Class.forName("yi2.b");
        Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: X.a1s
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                InterfaceC91977a3J callback = c92181a6b;
                o.LJIIIZ(callback, "$callback");
                if (method.getName().equals("onOcrResult")) {
                    try {
                        Class<?> cls3 = Class.forName("com.bytedance.pipo.ocr.bean.PipoOcrResult");
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            int intValue = ((Integer) obj2).intValue();
                            Object obj3 = objArr[1];
                            if (obj3 != null) {
                                int intValue2 = ((Integer) obj3).intValue();
                                Object obj4 = objArr[2];
                                if (obj4 != null) {
                                    String str3 = (String) obj4;
                                    Field declaredField = cls3.getDeclaredField("cardNumber");
                                    declaredField.setAccessible(true);
                                    String str4 = (String) declaredField.get(objArr[3]);
                                    Field declaredField2 = cls3.getDeclaredField("cardNumberImage");
                                    declaredField2.setAccessible(true);
                                    Bitmap bitmap = (Bitmap) declaredField2.get(objArr[3]);
                                    Field declaredField3 = cls3.getDeclaredField("expirationDate");
                                    declaredField3.setAccessible(true);
                                    String str5 = (String) declaredField3.get(objArr[3]);
                                    Field declaredField4 = cls3.getDeclaredField("expirationDateImage");
                                    declaredField4.setAccessible(true);
                                    Bitmap bitmap2 = (Bitmap) declaredField4.get(objArr[3]);
                                    Field declaredField5 = cls3.getDeclaredField("holderName");
                                    declaredField5.setAccessible(true);
                                    String str6 = (String) declaredField5.get(objArr[3]);
                                    Field declaredField6 = cls3.getDeclaredField("holderNameImage");
                                    declaredField6.setAccessible(true);
                                    C91975a3H c91975a3H = new C91975a3H(str4, bitmap, str5, bitmap2, str6, (Bitmap) declaredField6.get(objArr[3]));
                                    Object obj5 = objArr[4];
                                    if (obj5 != null) {
                                        callback.LIZ(intValue, intValue2, str3, c91975a3H, (String) obj5);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                    } catch (Throwable unused) {
                    }
                }
                return C76800UCe.LIZ;
            }
        });
        Method method = cls.getMethod("startBankCardOcr", String.class, String.class, String.class, Integer.TYPE, Class.forName("wi2.d"), Class.forName("yi2.b"));
        Object obj = cls.getDeclaredField("INSTANCE").get(null);
        Object[] objArr = new Object[6];
        C92324a8u c92324a8u = C92105a5N.LIZ;
        String str3 = "";
        if (c92324a8u == null || (str = c92324a8u.LJLIL) == null) {
            str = "";
        }
        objArr[0] = str;
        if (c92324a8u == null || (str2 = c92324a8u.LJLILLLLZI) == null) {
            str2 = "";
        }
        objArr[1] = str2;
        String str4 = C91965a37.LIZ;
        if (str4 != null) {
            str3 = str4;
        }
        objArr[2] = str3;
        objArr[3] = 1;
        objArr[4] = this.LIZ;
        objArr[5] = newProxyInstance;
        method.invoke(obj, objArr);
    }
}
