package X;

import Y.ARunnableS11S0201000_8;
import Y.ARunnableS7S1200000_8;
import android.content.Context;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: X.Ili, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47570Ili implements InterfaceC47565Ild {
    public static volatile Method LIZIZ;
    public static volatile Method LIZJ;
    public static volatile Method LIZLLL;
    public static final AtomicInteger LJ = new AtomicInteger(0);
    public Context LIZ;

    public static Object LIZ(Method method, Object[] objArr) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-5589462457279659407"));
        return LIZJ2.LIZ ? LIZJ2.LIZIZ : method.invoke(null, objArr);
    }

    static {
        LIZIZ();
    }

    public static void LIZIZ() {
        if (LIZIZ == null || LIZJ == null || LIZLLL == null) {
            try {
                Class<?> cls = Class.forName("com.ss.android.common.applog.AppLog");
                LIZIZ = cls.getMethod("getCurrentSessionId", new Class[0]);
                LIZJ = cls.getMethod("recordMiscLog", Context.class, String.class, JSONObject.class);
                LIZLLL = Class.forName("com.ss.android.common.lib.AppLogNewUtils").getMethod("onEventV3", String.class, JSONObject.class);
                LJ.set(1);
                C78253UnR.LJI("AppLogEngineUploader", "upload AppLog Success!");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("upload error (AppLog)");
                LIZ.append(e);
                C78253UnR.LIZLLL("AppLogEngineUploader", X1D.LIZIZ(LIZ));
            }
        }
        if (LIZIZ == null || LIZJ == null || LIZLLL == null) {
            try {
                Class<?> cls2 = Class.forName("com.bytedance.applog.AppLog");
                LIZIZ = cls2.getMethod("getSessionId", new Class[0]);
                LIZJ = cls2.getMethod("onMiscEvent", String.class, JSONObject.class);
                LIZLLL = cls2.getMethod("onEventV3", String.class, JSONObject.class);
                LJ.set(2);
                C78253UnR.LJI("AppLogEngineUploader", "upload BDTracker Success!");
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("upload error (bdtracker)");
                LIZ2.append(e2);
                C78253UnR.LIZLLL("AppLogEngineUploader", X1D.LIZIZ(LIZ2));
            }
        }
    }

    public final void LIZJ(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onEvent, invalid parameter, event: ");
            LIZ.append(str);
            LIZ.append(", ");
            LIZ.append(jSONObject);
            C78253UnR.LIZLLL("AppLogEngineUploader", X1D.LIZIZ(LIZ));
            return;
        }
        EngineThreadPool.addExecuteTask(new ARunnableS7S1200000_8(jSONObject, this, str, 15));
    }

    public final void LIZLLL(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onEventV2, invalid parameter, event: ");
            LIZ.append(str);
            LIZ.append(", ");
            LIZ.append(jSONObject);
            C78253UnR.LIZLLL("AppLogEngineUploader", X1D.LIZIZ(LIZ));
            return;
        }
        EngineThreadPool.addExecuteTask(new ARunnableS11S0201000_8(4, str, jSONObject, 13));
    }
}
