package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.ss.android.common.applog.AppLog;
import java.lang.reflect.Method;
import java.util.ConcurrentModificationException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QLB {
    public static volatile QLB LIZIZ;
    public static Class LIZJ;
    public static boolean LIZLLL;
    public static Method LJ;
    public static boolean LJFF;
    public static Method LJI;
    public static boolean LJII;
    public final Object LIZ;

    public /* synthetic */ QLB() {
        throw null;
    }

    public static Object LIZ(Method method, Object[] objArr) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-1331039729362276182"));
        return LIZJ2.LIZ ? LIZJ2.LIZIZ : method.invoke(null, objArr);
    }

    public final int[] LIZIZ() {
        return ((LayoutNode) this.LIZ).LJI();
    }

    public /* synthetic */ QLB(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
    }

    public static QLB LIZJ(Context context) {
        if (LIZIZ == null) {
            synchronized (QLB.class) {
                if (LIZIZ == null) {
                    LIZIZ = new QLB(context);
                }
            }
        }
        return LIZIZ;
    }

    public /* synthetic */ QLB(Object obj) {
        this.LIZ = obj;
    }

    public final Pair LIZLLL(QLG qlg, JSONObject jSONObject) {
        String jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("magic_tag", "ss_app_log");
            jSONObject3.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("datetime", AppLog.formatDate(qlg.LIZ));
            jSONObject4.put("local_time_ms", System.currentTimeMillis());
            jSONObject4.put("session_id", qlg.LIZIZ);
            int i = 1;
            jSONObject4.put("bg_session", 1);
            if (!TextUtils.isEmpty(qlg.LIZLLL)) {
                jSONObject4.put("from_session", qlg.LIZLLL);
            }
            if (!TextUtils.isEmpty(qlg.LJFF)) {
                jSONObject4.put("to_session", qlg.LJFF);
            }
            jSONObject4.put("duration", Math.max(1L, Math.max(0L, (qlg.LJI - qlg.LIZ) - qlg.LJII) / 1000));
            boolean z = qlg.LIZJ;
            boolean z2 = qlg.LJ;
            if (z || z2) {
                if (z && !z2) {
                    i = 2;
                } else if (!z && z2) {
                    i = 3;
                } else {
                    i = 4;
                }
            }
            jSONObject4.put("session_type", i);
            jSONObject4.put("is_background", false);
            AppLog.tryPutEventIndex(jSONObject4);
            jSONArray.put(jSONObject4);
            jSONObject3.put("terminate", jSONArray);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("save task session to db : ");
            LIZ.append(qlg.LIZ());
            X1D.LIZIZ(LIZ);
            try {
                jSONObject2 = jSONObject3.toString();
            } catch (ConcurrentModificationException unused) {
                jSONObject2 = jSONObject3.toString();
            }
            return Pair.create(Long.valueOf(QL6.LIZLLL((Context) this.LIZ).LJIIIIZZ(jSONObject2)), jSONObject2);
        } catch (Throwable unused2) {
            return null;
        }
    }
}
