package com.bytedance.helios.api.consumer;

import X.C1HQ;
import X.InterfaceC65349Pkn;
import X.InterfaceC66068PwO;
import java.util.Map;

/* loaded from: classes12.dex */
public class ApmEvent implements InterfaceC66068PwO {

    @InterfaceC65349Pkn("name")
    public String mName;

    @InterfaceC65349Pkn("categories")
    public final Map<String, Object> mCategories = new C1HQ();

    @InterfaceC65349Pkn("metrics")
    public final Map<String, Object> mMetrics = new C1HQ();

    @InterfaceC65349Pkn("extras")
    public final Map<String, Object> mExtras = new C1HQ();
    public boolean LJLIL = false;

    @Override // X.InterfaceC66068PwO
    public final String getTag() {
        return "ApmEvent";
    }

    public final String toString() {
        return super.toString();
    }

    public ApmEvent(String str) {
        this.mName = str;
    }

    public static ApmEvent LJ(long j, String str) {
        ApmEvent apmEvent = new ApmEvent("sky_eye_apm_log");
        apmEvent.LIZ("MethodTimeCost", "EventName");
        apmEvent.LIZJ(Long.valueOf(j), str);
        return apmEvent;
    }

    public final void LIZ(Object obj, String str) {
        this.mCategories.put(str, obj);
    }

    public final void LIZIZ(Object obj, String str) {
        this.mExtras.put(str, obj);
    }

    public final void LIZJ(Long l, String str) {
        this.mMetrics.put(str, l);
    }

    public static ApmEvent LIZLLL(long j, String str, String str2, boolean z) {
        ApmEvent apmEvent = new ApmEvent("helios_api_statistics");
        apmEvent.LIZ(str, "type");
        apmEvent.LIZ(Boolean.valueOf(z), "is_front");
        apmEvent.LIZJ(Long.valueOf(j), str2);
        return apmEvent;
    }
}
