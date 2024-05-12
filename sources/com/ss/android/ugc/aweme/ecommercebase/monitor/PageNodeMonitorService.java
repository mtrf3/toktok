package com.ss.android.ugc.aweme.ecommercebase.monitor;

import X.C141335gf;
import X.C16880lQ;
import X.C19N;
import X.C1DH;
import X.C32I;
import X.C36636EZk;
import X.C36667EaF;
import X.C3C5;
import X.C48658J7u;
import X.C58096Mr6;
import X.C70655RoB;
import X.C70871Rrf;
import X.C70872Rrg;
import X.C73098SmU;
import X.C76800UCe;
import X.C78983UzD;
import X.InterfaceC37828Esy;
import X.XKX;
import Y.ARunnableS48S0100000_12;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes13.dex */
public final class PageNodeMonitorService implements IPageNodeMonitorService {
    public final Map<String, C70871Rrf> LIZ = new LinkedHashMap();

    public static IPageNodeMonitorService LJIIIZ() {
        Object LIZ = C58096Mr6.LIZ(IPageNodeMonitorService.class, false);
        if (LIZ != null) {
            return (IPageNodeMonitorService) LIZ;
        }
        if (C58096Mr6.k0 == null) {
            synchronized (IPageNodeMonitorService.class) {
                if (C58096Mr6.k0 == null) {
                    C58096Mr6.k0 = new PageNodeMonitorService();
                }
            }
        }
        return C58096Mr6.k0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LIZJ(String str) {
        Object obj;
        if (!C70655RoB.LIZIZ()) {
            return;
        }
        Iterator it = ((LinkedHashMap) this.LIZ).entrySet().iterator();
        while (it.hasNext()) {
            C70871Rrf c70871Rrf = (C70871Rrf) ((Map.Entry) it.next()).getValue();
            c70871Rrf.getClass();
            List<C70872Rrg> list = c70871Rrf.LIZLLL;
            if (list != null) {
                ArrayList arrayList = (ArrayList) list;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (s.LJJJLZIJ(str, ((C70872Rrg) obj).LIZ, false)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C70872Rrg c70872Rrg = (C70872Rrg) obj;
                    if (c70872Rrg != null) {
                        c70872Rrg.LIZIZ = true;
                        if (!arrayList.isEmpty()) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                if (!((C70872Rrg) it3.next()).LIZIZ) {
                                    break;
                                }
                            }
                        }
                        c70871Rrf.LIZLLL();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final boolean LJ(String pageName) {
        C70871Rrf c70871Rrf;
        o.LJIIIZ(pageName, "pageName");
        if (!C70655RoB.LIZIZ() || (c70871Rrf = (C70871Rrf) ((LinkedHashMap) this.LIZ).get(pageName)) == null || !c70871Rrf.LIZIZ()) {
            return false;
        }
        if (C70655RoB.LIZ().threadFreeCheck) {
            C1DH.LJJIJIIJI(new ARunnableS48S0100000_12(c70871Rrf, 36));
        } else {
            c70871Rrf.LIZJ();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LJI(String pageName) {
        C70871Rrf c70871Rrf;
        Object LIZ;
        Object obj;
        Object obj2;
        o.LJIIIZ(pageName, "pageName");
        if (C70655RoB.LIZIZ() && (c70871Rrf = (C70871Rrf) ((LinkedHashMap) this.LIZ).get(pageName)) != null) {
            try {
                if (c70871Rrf.LJI == -1) {
                    c70871Rrf.LJI = System.currentTimeMillis();
                    Map<String, ? extends Object> map = c70871Rrf.LIZJ;
                    Object obj3 = null;
                    if (map == null) {
                        obj = null;
                    } else {
                        obj = map.get("previous_page");
                    }
                    Map<String, ? extends Object> map2 = c70871Rrf.LIZJ;
                    if (map2 != null) {
                        obj2 = map2.get("entrance_form");
                    } else {
                        obj2 = null;
                    }
                    Map<String, ? extends Object> map3 = c70871Rrf.LIZJ;
                    if (map3 != null) {
                        obj3 = map3.get("enter_from_info");
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("init_stage_cost", c70871Rrf.LJI - c70871Rrf.LJ);
                    jSONObject.put("page_name", c70871Rrf.LIZ);
                    jSONObject.put("start_type", c70871Rrf.LIZIZ.getType());
                    jSONObject.put("start_to_now", System.currentTimeMillis() - c70871Rrf.LJ);
                    if (obj != null) {
                        jSONObject.put("previous_page", obj);
                    }
                    if (obj2 != null) {
                        jSONObject.put("enter_from", obj2);
                    }
                    if (obj3 != null) {
                        jSONObject.put("enter_from_info", obj3);
                    }
                    C48658J7u.LIZIZ("rd_tiktokec_meaningful_init", jSONObject);
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final boolean LJII(String pageName) {
        o.LJIIIZ(pageName, "pageName");
        if (!C70655RoB.LIZIZ()) {
            return false;
        }
        C70871Rrf c70871Rrf = (C70871Rrf) ((LinkedHashMap) this.LIZ).get(pageName);
        if (c70871Rrf != null) {
            c70871Rrf.LIZLLL();
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LJIIIIZZ(String str) {
        Object LIZ;
        if (!C70655RoB.LIZIZ()) {
            return;
        }
        C70871Rrf c70871Rrf = new C70871Rrf(str);
        this.LIZ.put(str, c70871Rrf);
        try {
            if (c70871Rrf.LJ == -1) {
                c70871Rrf.LJ = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page_name", c70871Rrf.LIZ);
                jSONObject.put("start_type", c70871Rrf.LIZIZ.getType());
                C48658J7u.LIZIZ("rd_tiktokec_meaningful_launch", jSONObject);
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LIZ(String pageName, LaneParams trackParams) {
        o.LJIIIZ(pageName, "pageName");
        o.LJIIIZ(trackParams, "trackParams");
        C70871Rrf c70871Rrf = (C70871Rrf) ((LinkedHashMap) this.LIZ).get(pageName);
        if (c70871Rrf != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : trackParams.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (c70871Rrf.LIZJ == null) {
                c70871Rrf.LIZJ = linkedHashMap;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LIZIZ(String pageName, List<String> imageUriList) {
        C70871Rrf c70871Rrf;
        Object LIZ;
        Object obj;
        Object obj2;
        o.LJIIIZ(pageName, "pageName");
        o.LJIIIZ(imageUriList, "imageUriList");
        if (C70655RoB.LIZIZ() && (c70871Rrf = (C70871Rrf) ((LinkedHashMap) this.LIZ).get(pageName)) != null) {
            try {
                if (!c70871Rrf.LIZIZ()) {
                    c70871Rrf.LJII = System.currentTimeMillis();
                    c70871Rrf.LIZ();
                    Map<String, ? extends Object> map = c70871Rrf.LIZJ;
                    Object obj3 = null;
                    if (map == null) {
                        obj = null;
                    } else {
                        obj = map.get("previous_page");
                    }
                    Map<String, ? extends Object> map2 = c70871Rrf.LIZJ;
                    if (map2 != null) {
                        obj2 = map2.get("entrance_form");
                    } else {
                        obj2 = null;
                    }
                    Map<String, ? extends Object> map3 = c70871Rrf.LIZJ;
                    if (map3 != null) {
                        obj3 = map3.get("enter_from_info");
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("init_stage_cost", c70871Rrf.LJI - c70871Rrf.LJ);
                    jSONObject.put("data_mount_stage_cost", c70871Rrf.LJII - c70871Rrf.LJI);
                    jSONObject.put("page_name", c70871Rrf.LIZ);
                    jSONObject.put("start_type", c70871Rrf.LIZIZ.getType());
                    jSONObject.put("start_to_now", System.currentTimeMillis() - c70871Rrf.LJ);
                    if (obj != null) {
                        jSONObject.put("previous_page", obj);
                    }
                    if (obj2 != null) {
                        jSONObject.put("enter_from", obj2);
                    }
                    if (obj3 != null) {
                        jSONObject.put("enter_from_info", obj3);
                    }
                    C48658J7u.LIZIZ("rd_tiktokec_meaningful_data_mounted", jSONObject);
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
            }
            if (c70871Rrf.LIZLLL == null && (!imageUriList.isEmpty())) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(imageUriList, 10));
                Iterator<String> it = imageUriList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C70872Rrg(it.next()));
                }
                c70871Rrf.LIZLLL = arrayList;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LIZLLL(LifecycleOwner owner, InterfaceC37828Esy pageNode) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(pageNode, "pageNode");
        if (!C19N.LJ("ecom_blank_detect_enable", false)) {
            return;
        }
        PageMonitor pageMonitor = PageMonitor.LIZ;
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            pageMonitor.LIZ(owner, pageNode);
        } else {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(owner), C36636EZk.LIZ.LJJIJIL(), null, new C36667EaF(owner, pageNode, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LJFF(String pageName, HashMap<String, Object> hashMap, Long l, String str) {
        o.LJIIIZ(pageName, "pageName");
        if (!C70655RoB.LIZIZ()) {
            return;
        }
        C70871Rrf c70871Rrf = (C70871Rrf) ((LinkedHashMap) this.LIZ).get(pageName);
        if (c70871Rrf == null || c70871Rrf.LIZIZ() || c70871Rrf.LJI != -1 || c70871Rrf.LJIIIIZZ != -1 || c70871Rrf.LJIIIZ != -1 || c70871Rrf.LJFF != -1) {
            Map<String, C70871Rrf> map = this.LIZ;
            C70871Rrf c70871Rrf2 = new C70871Rrf(pageName);
            c70871Rrf2.LJ(str, l, hashMap);
            map.put(pageName, c70871Rrf2);
            return;
        }
        c70871Rrf.LJ(str, l, hashMap);
    }
}
