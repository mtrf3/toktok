package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EXl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36585EXl {
    public static void LIZIZ() {
        Field field;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method method = cls.getMethod("currentActivityThread", new Class[0]);
            o.LJIIIIZZ(method, "activityThreadClass.getM…(\"currentActivityThread\")");
            method.setAccessible(true);
            Object invoke = method.invoke(cls, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mBoundApplication");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            Field declaredField2 = obj.getClass().getDeclaredField("providers");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (List) obj2) {
                Object obj4 = null;
                if (obj3 != null && (field = obj3.getClass().getField("name")) != null) {
                    obj4 = field.get(obj3);
                }
                String str = (String) obj4;
                if (str == null) {
                    str = "";
                }
                if (LIZ(str) && obj3 != null) {
                    arrayList.add(obj3);
                }
            }
            declaredField2.set(obj, arrayList);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            PEH.LIZLLL(e, "ChildContentProviderHook.startHook");
        }
    }

    public static boolean LIZ(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C36586EXm());
        arrayList.add(new C36588EXo());
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((InterfaceC36587EXn) ListProtector.get(arrayList, i)).LIZ(str)) {
                    return ((InterfaceC36587EXn) ListProtector.get(arrayList, i)).LIZIZ(str);
                }
            }
        }
        return true;
    }
}
