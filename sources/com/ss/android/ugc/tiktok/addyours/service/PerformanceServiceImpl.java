package com.ss.android.ugc.tiktok.addyours.service;

import X.C113554cx;
import X.C123134sP;
import X.C141335gf;
import X.C219018if;
import X.C221018lt;
import X.C221118m3;
import X.C3C5;
import X.C48841JEv;
import X.C55481Lq1;
import X.C55483Lq3;
import X.C5H3;
import X.C64962gm;
import X.C76800UCe;
import X.C78613UtF;
import X.FMX;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.WM7;
import X.XKX;
import android.util.SparseArray;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class PerformanceServiceImpl implements IFIPerformanceService {
    public final SparseArray<SparseArray<C123134sP>> LIZ = new SparseArray<>();
    public final SparseArray<Map<String, Object>> LIZIZ = new SparseArray<>();
    public final C64962gm LIZJ = C48841JEv.LIZ(C78613UtF.LIZ);
    public final C5H3 LIZLLL = C221118m3.LIZ(C55481Lq1.LJLIL);

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZIZ(int i) {
        SparseArray<SparseArray<C123134sP>> sparseArray = this.LIZ;
        SparseArray<C123134sP> sparseArray2 = new SparseArray<>();
        sparseArray2.put(1, new C123134sP(1));
        sparseArray.put(i, sparseArray2);
        this.LIZIZ.put(i, new LinkedHashMap());
        String str = C55483Lq3.LJLJJI.get(Integer.valueOf(i));
        if (str != null) {
            PerfMonitorService commonPerfSvc = (PerfMonitorService) this.LIZLLL.getValue();
            o.LJIIIIZZ(commonPerfSvc, "commonPerfSvc");
            commonPerfSvc.LJFF(str);
        }
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZ(int i, boolean z) {
        SparseArray<C123134sP> sparseArray = this.LIZ.get(i);
        if (sparseArray != null) {
            sparseArray.put(6, new C123134sP(6));
            if (C76800UCe.LIZ == null) {
                return;
            }
            String str = C55483Lq3.LJLJJI.get(Integer.valueOf(i));
            SparseArray<C123134sP> sparseArray2 = this.LIZ.get(i);
            Map<String, Object> map = this.LIZIZ.get(i);
            this.LIZ.remove(i);
            this.LIZIZ.remove(i);
            XKX.LIZLLL(this.LIZJ, null, null, new C219018if(this, i, sparseArray2, map, z, null), 3);
            if (str != null) {
                PerfMonitorService commonPerfSvc = (PerfMonitorService) this.LIZLLL.getValue();
                o.LJIIIIZZ(commonPerfSvc, "commonPerfSvc");
                commonPerfSvc.LIZLLL(str);
            }
        }
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZLLL(int i, int i2) {
        SparseArray<C123134sP> sparseArray = this.LIZ.get(i);
        if (sparseArray != null) {
            sparseArray.put(i2, new C123134sP(i2));
        }
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZJ(int i, String str, Object value) {
        o.LJIIIZ(value, "value");
        Map<String, Object> map = this.LIZIZ.get(i);
        if (map != null) {
            map.put(str, value);
        }
    }

    public static void LJ(int i, SparseArray sparseArray, Map map, boolean z) {
        Object LIZ;
        int i2;
        if (sparseArray == null) {
            return;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        try {
            InterfaceC88471Ynr interfaceC88471Ynr = C55483Lq3.LJLJL.get(Integer.valueOf(i));
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(sparseArray, map);
                LIZ = C76800UCe.LIZ;
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("PrfImpl", "run processor failed", m10exceptionOrNullimpl);
        }
        JSONObject jSONObject = new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(map));
        if (z) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        jSONObject.put("status", i2);
        InterfaceC65784Pro<C55483Lq3[]> interfaceC65784Pro = C55483Lq3.LJLJJLL.get(Integer.valueOf(i));
        if (interfaceC65784Pro == null) {
            interfaceC65784Pro = C55483Lq3.LJLJJL;
        }
        for (C55483Lq3 c55483Lq3 : interfaceC65784Pro.invoke()) {
            C123134sP c123134sP = (C123134sP) sparseArray.get(c55483Lq3.LJLILLLLZI);
            if (c123134sP != null) {
                long j = c123134sP.LJLILLLLZI;
                C123134sP c123134sP2 = (C123134sP) sparseArray.get(c55483Lq3.LJLJI);
                if (c123134sP2 != null) {
                    jSONObject.put(c55483Lq3.LJLIL, c123134sP2.LJLILLLLZI - j);
                }
            }
        }
        jSONObject.put(WM7.SCENE_SERVICE, C55483Lq3.LJLJJI.get(Integer.valueOf(i)));
        String str = C55483Lq3.LJLJLJ.get(Integer.valueOf(i));
        if (str == null) {
            str = "social_page_perf_phased";
        }
        FMX.LJIILJJIL(str, jSONObject);
    }
}
