package ms.bd.o;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.lang.reflect.Method;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class v1 extends b.a {
    public static Object LIZJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "2981384262719071"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        double d;
        Context context = a.LIZIZ.LIZ;
        try {
            Class<?> cls = Class.forName(new String(z.LIZ((String) k.a(16777217, 0, 0L, "446ac1", new byte[]{115, 101, 19, 19, 10, 34, 101, 16, 49, 96, 115, 51, 19, 65, 11, 116, 97, 19, 49, 104, 115, 98, 23, 16, 10, Byte.MAX_VALUE, 97, 16, 48, 101, 115, 99, 18, 71, 10, 35, 97, 68, 49, 50, 119, 51, 19, 19, 11, 117, 101, 16, 50, 97, 115, 48, 18, 66, 10, 115, 96, 71, 50, 97, 114, 100, 19, 19, 10, 112, 97, 76, 49, 50, 115, 99}))));
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod(new String(z.LIZ((String) k.a(16777217, 0, 0L, "da26a5", new byte[]{35, 52, 23, 23, 9, 118, 51, 17, 52, 48, 35, 54, 22, 16, 8, 115, 49, 23, 53, 51, 32, 51, 23, 68, 9, 117, 49, 21, 52, 52}))), String.class);
            declaredMethod.setAccessible(true);
            Object[] objArr = new Object[1];
            objArr[0] = new String(z.LIZ((String) k.a(16777217, 0, 0L, "29cb7a", new byte[]{117, 105, 70, 71, 95, 34, 102, 76, 100, 103, 116, 105, 71, 79, 90, 115, 103, 75, 100, 99, 116, 107, 70, 71, 94, 37, 103, 65, 101, 102, 116, 98})));
            d = ((Double) LIZJ(newInstance, declaredMethod, objArr)).doubleValue();
        } catch (Throwable unused) {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return Integer.toString((int) d);
    }
}
