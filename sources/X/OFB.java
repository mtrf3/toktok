package X;

import defpackage.i0;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OFB extends OF9 {
    public static final OFB LIZIZ = new OFB();
    public static final OFJ<String, OFD> LIZ = new OFJ<>(10, OFC.LJLIL);

    public static void LJFF(C40083FoF c40083FoF) {
        boolean z;
        boolean z2;
        JSONObject jSONObject = new JSONObject();
        int i = 1;
        C40082FoE.LJII(jSONObject, OF9.LIZIZ(c40083FoF));
        Long LIZJ = c40083FoF.LIZJ(0L, "containerInfo.open_time");
        if (LIZJ != null) {
            long longValue = LIZJ.longValue();
            Long LIZJ2 = c40083FoF.LIZJ(0L, "nativeInfo.show_end");
            if (LIZJ2 != null) {
                long longValue2 = LIZJ2.longValue();
                Long LIZJ3 = c40083FoF.LIZJ(0L, "jsInfo.domready");
                if (LIZJ3 != null) {
                    long longValue3 = LIZJ3.longValue();
                    C40082FoE.LJIIIIZZ(jSONObject, "page_duration", Long.valueOf(longValue2 - longValue));
                    C40082FoE.LJIIIIZZ(jSONObject, "page_user_state", -2);
                    if (longValue3 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C40082FoE.LJIIIZ(jSONObject, Boolean.valueOf(z), "page_state", -1);
                    if (longValue3 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z2);
                    if (longValue3 < longValue2) {
                        i = 0;
                    }
                    C40082FoE.LJIIIZ(jSONObject, valueOf, "page_state", Integer.valueOf(i));
                    OF9.LIZLLL("bd_hybrid_monitor_pia_performance", jSONObject);
                    return;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [X.Yns, X.Prl] */
    @Override // X.OF9
    public final boolean LIZ(C40083FoF c40083FoF) {
        String LIZLLL = c40083FoF.LIZLLL("nativeBase.navigation_id", "");
        C76800UCe c76800UCe = null;
        if (o.LJ(c40083FoF.LIZIZ("event_type"), "perf")) {
            OFD LJ = LJ(LIZLLL);
            try {
                if (LJ.LIZ) {
                    ?? r0 = LJ.LIZIZ;
                    if (r0 != 0) {
                        r0.invoke(c40083FoF);
                        c76800UCe = C76800UCe.LIZ;
                    }
                } else {
                    LIZIZ.getClass();
                    LJFF(c40083FoF);
                    c76800UCe = C76800UCe.LIZ;
                }
                C3C5.m7constructorimpl(c76800UCe);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            synchronized (LIZIZ) {
                LIZ.remove(LIZLLL);
            }
            return false;
        }
        if (o.LJ(c40083FoF.LIZIZ("ev_type"), "custom") && o.LJ(c40083FoF.LIZIZ("client_extra.event_name"), "pia_performance")) {
            OFD LJ2 = LJ(LIZLLL);
            LJ2.LIZ = true;
            LJ2.LIZIZ = new AqS141S0200000_10(LJ2, c40083FoF, 86);
        } else {
            if (!o.LJ(c40083FoF.LIZIZ("ev_type"), "custom")) {
                return false;
            }
            String LIZLLL2 = c40083FoF.LIZLLL("client_extra.event_name", "");
            if (LIZLLL2 != null) {
                if (!ORY.LJJIJIIJIL(LIZLLL2, new String[]{"pia_pv", "pia_exception", "pia_nsr_worker_performance"})) {
                    return false;
                }
                String LJFF = i0.LJFF("bd_hybrid_monitor_", LIZLLL2);
                JSONObject jSONObject = new JSONObject();
                C40082FoE.LJII(jSONObject, c40083FoF.LIZIZ("client_category"), c40083FoF.LIZIZ("client_metric"), OF9.LIZIZ(c40083FoF));
                OF9.LIZLLL(LJFF, jSONObject);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        return true;
    }

    public final synchronized OFD LJ(String str) {
        return (OFD) OFJ.LIZ(LIZ, str);
    }
}
