package com.ss.android.ugc.aweme.trace;

import X.C09900aA;
import X.C64375POh;
import X.C64386POs;
import X.ORZ;
import X.OSZ;
import X.PDY;
import X.POL;
import X.POT;
import X.POV;
import X.POW;
import X.POX;
import X.POZ;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class AwemeTraceLogAdapter implements IAwemeTraceLogAdapter {
    public static final /* synthetic */ int LIZJ = 0;
    public final POL LIZ = new POL();
    public volatile Boolean LIZIZ;

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final String LIZLLL() {
        return "traceparent";
    }

    public final boolean LJIIIIZZ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = Boolean.valueOf(PDY.LIZJ.LIZ("app.ui.page", C64375POh.LIZLLL()));
        }
        return o.LJ(this.LIZIZ, Boolean.TRUE);
    }

    public static boolean LJII() {
        return o.LJ(C64375POh.LIZIZ().globalEnable, Boolean.TRUE);
    }

    public static JSONObject LJI(JSONObject jSONObject) {
        Iterator<String> keys;
        int i;
        Object opt;
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Integer num = C64375POh.LIZIZ().unsampledSingleParamMaxSize;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 100;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null && (opt = jSONObject.opt(next)) != null) {
                if (opt.toString().length() > i) {
                    jSONObject2.put(next, "length over limit");
                } else {
                    jSONObject2.put(next, opt);
                }
            }
        }
        return jSONObject2;
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final String LJFF(String str) {
        if (!LJII() || str == null || str.length() == 0) {
            return "";
        }
        return this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final void LIZ(String str, JSONObject jSONObject) {
        String str2;
        String str3;
        String LJII;
        POZ poz;
        if (!LJII() || jSONObject == null || POW.LIZIZ(str, C64375POh.LIZIZ().logEventBlacklist)) {
            return;
        }
        TraceLogConfig LIZIZ = C64375POh.LIZIZ();
        JSONObject jSONObject2 = null;
        if (jSONObject.has("traceparent")) {
            LJII = jSONObject.optString("traceparent");
        } else {
            OSZ<String, String> LIZLLL = C64386POs.LIZIZ.LIZLLL(null);
            if (LIZLLL == null || (str2 = LIZLLL.getSecond()) == null) {
                str2 = "";
            }
            if (str2.length() <= 0) {
                return;
            }
            List<String> list = LIZIZ.btmPageEventAutoTraceWhitelist;
            if (LIZLLL != null) {
                str3 = LIZLLL.getFirst();
            } else {
                str3 = null;
            }
            if (list == null) {
                return;
            }
            if (list.size() == 1) {
                if (!o.LJ(ListProtector.get(list, 0), "*") && !o.LJ(ListProtector.get(list, 0), str3)) {
                    return;
                }
            } else if (!ORZ.LJLJJI(str3, list)) {
                return;
            }
            LJII = POX.LIZIZ.LJII(str2);
        }
        if (LJII == null || LJII.length() == 0) {
            return;
        }
        String LJFF = LJFF(LJII);
        if (LJFF.length() == 0) {
            return;
        }
        try {
            jSONObject.put("traceparent", LJFF);
        } catch (Exception unused) {
        }
        if (o.LJ(LIZIZ.appLogToApmEvent, Boolean.TRUE)) {
            C09900aA.LJI(str, null, null, jSONObject);
        }
        boolean LJIIIIZZ = LJIIIIZZ();
        POX pox = POX.LIZIZ;
        if (LJIIIIZZ) {
            poz = POZ.ORIGIN_LOG;
        } else {
            poz = POZ.APPLOG;
        }
        POV pov = new POV(LJII);
        pov.LIZJ = str;
        pov.LIZLLL = true;
        if (LJIIIIZZ) {
            jSONObject2 = LJI(jSONObject);
        }
        pov.LIZIZ = jSONObject2;
        pox.LJIIIIZZ(poz, pov);
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final void LJ(String str, JSONObject jSONObject) {
        if (LJII() && LJIIIIZZ()) {
            POX.LIZIZ.LIZ.LJ(str, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final void LIZIZ(JSONObject jSONObject, String str, boolean z) {
        String optString;
        POZ poz;
        if (!LJII() || POW.LIZIZ(str, C64375POh.LIZIZ().logEventBlacklist)) {
            return;
        }
        JSONObject jSONObject2 = null;
        if (jSONObject == null || (optString = jSONObject.optString("traceparent")) == null) {
            return;
        }
        String LJFF = LJFF(optString);
        if (LJFF.length() == 0) {
            return;
        }
        try {
            jSONObject.put("traceparent", LJFF);
        } catch (Exception unused) {
        }
        boolean LJIIIIZZ = LJIIIIZZ();
        POX pox = POX.LIZIZ;
        if (LJIIIIZZ) {
            poz = POZ.ORIGIN_LOG;
        } else {
            poz = POZ.SLARDAR_EVENT_LOG;
        }
        POV pov = new POV(optString);
        pov.LIZLLL = z;
        pov.LIZJ = str;
        if (LJIIIIZZ) {
            jSONObject2 = LJI(jSONObject);
        }
        pov.LIZIZ = jSONObject2;
        pox.LJIIIIZZ(poz, pov);
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final void LIZJ(int i, String str, String str2, long j, String str3) {
        POZ poz;
        if (!LJII() || str == null || str.length() == 0) {
            return;
        }
        boolean LJIIIIZZ = LJIIIIZZ();
        POX pox = POX.LIZIZ;
        if (LJIIIIZZ) {
            poz = POZ.ORIGIN_LOG;
        } else {
            poz = POZ.SLARDAR_API_LOG;
        }
        POT pot = new POT(str);
        pot.LIZJ = str2;
        pot.LIZLLL = i;
        pot.LJ = j;
        pot.LJFF = str3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x-tt-logid", pot.LJFF);
        pot.LIZIZ = jSONObject;
        pox.LIZLLL(poz, pot);
    }
}
