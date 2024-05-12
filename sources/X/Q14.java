package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q14 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, InterfaceC65784Pro interfaceC65784Pro) {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            interfaceC65784Pro.invoke();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("invokeMethod", str);
            jSONObject.put("invokeTime", elapsedRealtime2);
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            o.LJFF(LLLLIIIILLL, "Thread.currentThread()");
            jSONObject.put("invokeThread", LLLLIIIILLL.getName());
            C66335Q1r c66335Q1r = Q1A.LJFF.LIZ;
            if (c66335Q1r != null) {
                c66335Q1r.LIZ.log("ruler_launch_perf", jSONObject);
            }
            C3C5.m7constructorimpl(jSONObject);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
