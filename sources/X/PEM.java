package X;

import Y.ARunnableS15S0101000_11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PEM implements PCW {
    public final /* synthetic */ PEO LIZ;

    public PEM(PEO peo) {
        this.LIZ = peo;
    }

    @Override // X.PCW
    public final void LIZ(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i;
        PEO peo = this.LIZ;
        peo.getClass();
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("performance_modules").optJSONObject("smooth");
            if (optJSONObject == null) {
                return;
            }
            peo.LIZ = new PEN();
            boolean z11 = false;
            if (optJSONObject.optInt("enable_stack_sampling", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            peo.LIZ.LIZ = z;
            if (optJSONObject.optInt("enable_trace", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            peo.LIZ.LIZIZ = z2;
            peo.LIZ.LIZJ = optJSONObject.optLong("atrace_tag", 0L);
            if (optJSONObject.optInt("block_dump_stack_enable", 1) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            peo.LIZ.LIZLLL = z3;
            if (optJSONObject.optInt("enable_gfx_monitor", 0) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            peo.LIZ.LJ = z4;
            peo.LIZ.LJFF = optJSONObject.optInt("block_monitor_mode", 1001);
            if (optJSONObject.optInt("serious_block_enable_upload", 1) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            peo.LIZ.LJI = z5;
            peo.LIZ.LJII = optJSONObject.optLong("serious_block_threshold", 4000L);
            if (optJSONObject.optInt("slow_method_enable_upload", 0) == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            peo.LIZ.LJIIIIZZ = z6;
            if (optJSONObject.optInt("drop_enable_upload", 1) == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            peo.LIZ.LJIIIZ = z7;
            if (optJSONObject.optInt("enable_upload", 0) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            peo.LIZ.LJIIJ = z8;
            peo.LIZ.LJIIJJI = optJSONObject.optLong("block_threshold", 2500L);
            peo.LIZ.LJIIL = optJSONObject.optLong("drop_threshold", 1000L);
            if (optJSONObject.optInt("block_enable_upload", 0) == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            peo.LIZ.LJIILIIL = z9;
            peo.LIZ.LJIILJJIL = optJSONObject.optBoolean("drop_slow_method_switch", false);
            if (optJSONObject.optInt("enable_slow_method_ext", 0) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            peo.LIZ.LJIILL = z10;
            optJSONObject.optJSONObject("scene_enable_upload");
            peo.LIZ.getClass();
            C10000aK c10000aK = C09990aJ.LIZ;
            PEN pen = peo.LIZ;
            c10000aK.getClass();
            if (pen == null) {
                return;
            }
            C06130Lx.LIZ().getClass();
            C64125PEr.LIZLLL().LIZLLL = true;
            C06130Lx LIZ = C06130Lx.LIZ();
            int i2 = pen.LJFF;
            LIZ.getClass();
            if (i2 != 11) {
                if (i2 != 101) {
                    if (i2 != 1001) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 2;
            }
            LIZ.LIZ = i;
            C64125PEr LIZLLL = C64125PEr.LIZLLL();
            int i3 = LIZ.LIZ;
            if (LIZLLL.LIZLLL) {
                Iterator it = ((CopyOnWriteArrayList) LIZLLL.LIZ).iterator();
                while (it.hasNext()) {
                    PEL pel = (PEL) it.next();
                    if (pel != null) {
                        PE1 pe1 = new PE1(PD7.LIGHT_WEIGHT, new ARunnableS15S0101000_11(i3, pel, 5), "refreshConfig");
                        PE3 pe3 = pel.LIZLLL;
                        if (pe3 != null) {
                            pe3.LJII(pe1);
                        }
                    }
                }
            }
            synchronized (C10020aM.class) {
                Iterator it2 = ((ArrayList) C10020aM.LIZ).iterator();
                while (it2.hasNext()) {
                    InterfaceC10010aL interfaceC10010aL = (InterfaceC10010aL) it2.next();
                    if (interfaceC10010aL != null) {
                        interfaceC10010aL.LIZ(pen);
                    }
                }
            }
            if ((C53240Kuy.LIZ() || pen.LJIIIIZZ) && (C53240Kuy.LIZ() || pen.LJIILJJIL)) {
                z11 = true;
            }
            C06120Lw.LIZ(z11, pen.LJIIL, pen.LJIILL);
        } catch (Throwable unused) {
        }
    }
}
