package X;

import com.bytedance.helios.api.consumer.ApmEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Pu9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65929Pu9 {
    public static final void LIZ(long j, String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis >= 1 || z) {
            C66059PwF.LIZIZ(ApmEvent.LJ(currentTimeMillis, str));
        }
    }

    public static final void LIZIZ(String methodName, long j, java.util.Map map) {
        o.LJIIIZ(methodName, "methodName");
        float nanoTime = ((float) (System.nanoTime() - j)) / 1000.0f;
        ApmEvent apmEvent = new ApmEvent("sky_eye_apm_log");
        apmEvent.LIZ("MethodTimeCost_us", "EventName");
        if (map != null) {
            apmEvent.mCategories.putAll(map);
        }
        apmEvent.mMetrics.put(methodName, Float.valueOf(nanoTime));
        C66059PwF.LIZIZ(apmEvent);
    }
}
