package ms.bd.o;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.reflect.Method;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class k1 extends b.a {
    public static Object LIZJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "2981384262718730"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, (String) k.a(16777217, 0, 0L, "ffb387", new byte[]{116, 107, 31, 73, 2, 35, 113, 78, 37, 106, 99, 125}));
                Method declaredMethod = connectivityManager.getClass().getDeclaredMethod((String) k.a(16777217, 0, 0L, "644fa2", new byte[]{32, 51, 83, 51, 93, 49, 60, 3, 96, 24, 34, 34, 80, 29, 76, 46, 28, 27, 99, 57}), new Class[0]);
                declaredMethod.setAccessible(true);
                NetworkInfo networkInfo = (NetworkInfo) LIZJ(connectivityManager, declaredMethod, new Object[0]);
                if (networkInfo != null) {
                    Method declaredMethod2 = networkInfo.getClass().getDeclaredMethod((String) k.a(16777217, 0, 0L, "4f341f", new byte[]{44, 119, 97, 86, 15, 120, 59, 70, 96, 104, 32}), new Class[0]);
                    declaredMethod2.setAccessible(true);
                    return Boolean.valueOf(((Boolean) LIZJ(networkInfo, declaredMethod2, new Object[0])).booleanValue());
                }
            } catch (Throwable unused) {
            }
        }
        return Boolean.FALSE;
    }
}
