package com.ss.android.ugc.aweme.trace;

import X.C63889P5p;
import X.C64369POb;
import X.C64375POh;
import X.InterfaceC88472Yns;
import X.PIF;
import X.PIJ;
import X.PIL;
import X.PIN;
import X.PIR;
import X.POH;
import X.POJ;
import X.POK;
import X.POL;
import X.PON;
import X.POO;
import X.POR;
import X.POS;
import X.POT;
import X.POU;
import X.POV;
import X.POW;
import X.POZ;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import kotlin.jvm.internal.AqS115S0300000_11;
import kotlin.jvm.internal.AqS142S0200000_11;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.AqS64S1100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class TraceLogWrapApiImpl implements ITraceLogWrapApi {
    public final C64369POb LIZ = new C64369POb();
    public final POL LIZIZ = new POL();

    public static boolean LJIIJJI() {
        return o.LJ(C64375POh.LIZIZ().globalEnable, Boolean.TRUE);
    }

    public static void LJIIJ(InterfaceC88472Yns interfaceC88472Yns) {
        C64375POh.LJI(interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZIZ(String traceId) {
        long j;
        o.LJIIIZ(traceId, "traceId");
        if (!LJIIJJI()) {
            return;
        }
        Long l = C64375POh.LIZIZ().logTraceDelayTs;
        if (l != null) {
            j = l.longValue();
        } else {
            j = LivePlayEnforceIntervalSetting.DEFAULT;
        }
        C64375POh.LJFF(j, new AqS64S1100000_11(this, traceId, 1));
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZJ(String traceId) {
        o.LJIIIZ(traceId, "traceId");
        if (!LJIIJJI()) {
            return;
        }
        LJIIJ(new AqS64S1100000_11(this, traceId, 0));
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final String LJI(String parentSpanId) {
        o.LJIIIZ(parentSpanId, "parentSpanId");
        if (!LJIIJJI()) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ttk_trace_span_");
        LIZ.append(POW.LIZ.incrementAndGet());
        String spanId = X1D.LIZIZ(LIZ);
        C64369POb c64369POb = this.LIZ;
        c64369POb.getClass();
        o.LJIIIZ(spanId, "spanId");
        POK LIZJ = C64375POh.LIZJ(parentSpanId);
        if (LIZJ != null) {
            c64369POb.LIZ.getClass();
            PIR LIZ2 = POH.LIZ(LIZJ.LIZIZ);
            C64375POh.LJI(new AqS142S0200000_11(LIZ2, LIZJ, 1));
            POK pok = new POK(spanId, LIZJ.LIZIZ, LIZJ, LIZ2, System.currentTimeMillis(), 56);
            C64375POh.LIZJ.put(pok.LIZ, pok);
        }
        return spanId;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final String LJII(String traceId) {
        o.LJIIIZ(traceId, "traceId");
        if (!LJIIJJI()) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ttk_trace_span_");
        LIZ.append(POW.LIZ.incrementAndGet());
        String spanId = X1D.LIZIZ(LIZ);
        C64369POb c64369POb = this.LIZ;
        c64369POb.getClass();
        o.LJIIIZ(spanId, "spanId");
        POJ poj = C64375POh.LIZIZ.get(traceId);
        if (poj != null) {
            c64369POb.LIZ.getClass();
            POK pok = new POK(spanId, poj, null, POH.LIZ(poj), System.currentTimeMillis(), 60);
            C64375POh.LIZJ.put(pok.LIZ, pok);
        }
        return spanId;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final String LJIIIZ(String pageBtm) {
        o.LJIIIZ(pageBtm, "pageBtm");
        POR por = new POR(pageBtm);
        if (!LJIIJJI()) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ttk_trace_");
        LIZ.append(POW.LIZ.incrementAndGet());
        String traceId = X1D.LIZIZ(LIZ);
        C64369POb c64369POb = this.LIZ;
        c64369POb.getClass();
        o.LJIIIZ(traceId, "traceId");
        POH poh = c64369POb.LIZ;
        String service = por.LJLIL;
        String traceType = por.LJLILLLLZI;
        poh.getClass();
        o.LJIIIZ(service, "service");
        o.LJIIIZ(traceType, "traceType");
        PIF LIZ2 = PIJ.LIZ(service, PIL.BATCH, PIN.SERIAL_WRAPPER_MODE, C64375POh.LIZLLL(), C63889P5p.LIZ, traceType);
        C64375POh.LJI(new AqS177S0100000_11(LIZ2, 0));
        C64375POh.LIZIZ.put(traceId, new POJ(System.currentTimeMillis(), LIZ2, traceId, service, traceType));
        return traceId;
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZ(POZ logSource, POS pos) {
        o.LJIIIZ(logSource, "logSource");
        if (!LJIIJJI()) {
            return;
        }
        LJIIJ(new AqS115S0300000_11(this, pos, logSource, 2));
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZLLL(POZ logSource, POT pot) {
        o.LJIIIZ(logSource, "logSource");
        if (!LJIIJJI()) {
            return;
        }
        LJIIJ(new AqS115S0300000_11(this, pot, logSource, 1));
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJ(String str, JSONObject jSONObject) {
        if (!LJIIJJI()) {
            return;
        }
        LJIIJ(new POO(this, str, jSONObject));
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJIIIIZZ(POZ logSource, POV pov) {
        o.LJIIIZ(logSource, "logSource");
        if (!LJIIJJI()) {
            return;
        }
        LJIIJ(new AqS115S0300000_11(this, pov, logSource, 0));
    }

    public final void LJIIL(POU pou, long j) {
        JSONObject jSONObject = pou.LIZIZ;
        if (jSONObject != null) {
            POL pol = this.LIZIZ;
            String spanId = pou.LIZ;
            pol.getClass();
            o.LJIIIZ(spanId, "spanId");
            POK LIZJ = C64375POh.LIZJ(spanId);
            if (LIZJ != null) {
                pol.LIZ.getClass();
                LIZJ.LJFF = jSONObject;
            }
        }
        this.LIZIZ.LIZIZ(j, pou.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJFF(String traceId, String str, String str2) {
        o.LJIIIZ(traceId, "traceId");
        if (!LJIIJJI()) {
            return;
        }
        LJIIJ(new PON(this, traceId, str, str2));
    }
}
