package ms.bd.o;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import java.lang.reflect.Method;
import java.util.List;
import ms.bd.o.b;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class j1 extends b.a {
    public static Object LIZJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "2981384262718699"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        List<AccessibilityServiceInfo> list;
        Method declaredMethod;
        if (n2.LIZ() != 1) {
            return "";
        }
        Context context = a.LIZIZ.LIZ;
        JSONArray jSONArray = new JSONArray();
        Object LLILL = C16880lQ.LLILL(context, (String) k.a(16777217, 0, 0L, "3a4bb4", new byte[]{35, 96, 68, 19, 78, 48, 57, 66, 108, 62, 43, 119, 94}));
        if (LLILL != null) {
            try {
                declaredMethod = LLILL.getClass().getDeclaredMethod((String) k.a(16777217, 0, 0L, "6fc94b", new byte[]{32, 97, 4, 100, 5, 102, 33, 70, 62, 101, 34, 96, 49, 78, 8, 112, 38, 84, 59, 107, 46, 104, 25, 89, 18, 70, 48, 85, 36, 96, 36, 97, 60, 68, 24, 97}), new Class[0]);
            } catch (Throwable unused) {
            }
            if (declaredMethod != null) {
                list = (List) LIZJ(LLILL, declaredMethod, new Object[0]);
                if (list != null || list.size() == 0) {
                    return jSONArray.toString();
                }
                for (AccessibilityServiceInfo accessibilityServiceInfo : list) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put((String) k.a(16777217, 0, 0L, "628d1c", new byte[]{34, 38}), accessibilityServiceInfo.eventTypes);
                        jSONObject.put((String) k.a(16777217, 0, 0L, "adb962", new byte[]{121, 98}), accessibilityServiceInfo.getId());
                        jSONArray.put(jSONObject);
                    } catch (Throwable unused2) {
                    }
                }
            }
            list = null;
            if (list != null) {
            }
            return jSONArray.toString();
        }
        return jSONArray.toString();
    }
}
