package X;

import android.app.Instrumentation;
import android.content.Intent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.childhook.ChildActivityInstrumentation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.F5w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38416F5w {
    public static void LIZIZ() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(cls, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mInstrumentation");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            o.LJII(obj, "null cannot be cast to non-null type android.app.Instrumentation");
            declaredField.set(invoke, new ChildActivityInstrumentation((Instrumentation) obj));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            PEH.LIZLLL(e, "ChildActivityHook.startHook");
        }
    }

    public static boolean LIZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C38419F5z());
        arrayList.add(new C38417F5x());
        arrayList.add(new C36594EXu());
        arrayList.add(new C38418F5y());
        arrayList.add(new C38415F5v());
        arrayList.add(new F60());
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((F61) ListProtector.get(arrayList, i)).LIZIZ(intent)) {
                    return ((F61) ListProtector.get(arrayList, i)).LIZ(intent);
                }
            }
        }
        return true;
    }
}
