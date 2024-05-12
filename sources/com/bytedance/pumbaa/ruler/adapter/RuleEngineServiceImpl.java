package com.bytedance.pumbaa.ruler.adapter;

import X.C0EH;
import X.C141335gf;
import X.C32086CiY;
import X.C34211Dbj;
import X.C38940FQa;
import X.C39522FfC;
import X.C3C5;
import X.C58096Mr6;
import X.C58716N2q;
import X.C61689OIz;
import X.C61878OQg;
import X.C64396PPc;
import X.C65935PuF;
import X.C65983Pv1;
import X.C66226Pyw;
import X.C66339Q1v;
import X.C78855Ux9;
import X.FTR;
import X.HandlerThreadC64418PPy;
import X.InterfaceC65784Pro;
import X.PQ5;
import X.Q05;
import X.Q08;
import X.Q11;
import X.Q15;
import X.Q16;
import X.Q17;
import X.Q18;
import X.Q19;
import X.Q1A;
import X.Q1B;
import X.Q1E;
import X.Q1M;
import X.Q1R;
import X.Q1T;
import X.Q1W;
import X.Q2I;
import X.RunnableC39555Ffj;
import X.X1D;
import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.bytedance.pumbaa.ruler.adapter.api.RuleEngineConfig;
import com.bytedance.ruler.base.models.RuleModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS115S0300000_11;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class RuleEngineServiceImpl implements IRuleEngineService {
    public C65935PuF LIZIZ;
    public Q08 LIZJ;
    public InterfaceC65784Pro<C65983Pv1> LIZLLL;
    public final String LIZ = "Pumbaa-RuleEngine";
    public final Q05 LJ = Q05.LIZLLL;

    public static IRuleEngineService LJIILIIL() {
        Object LIZ = C58096Mr6.LIZ(IRuleEngineService.class, false);
        if (LIZ != null) {
            return (IRuleEngineService) LIZ;
        }
        if (C58096Mr6.LJJIZ == null) {
            synchronized (IRuleEngineService.class) {
                if (C58096Mr6.LJJIZ == null) {
                    C58096Mr6.LJJIZ = new RuleEngineServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJIZ;
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void updateSettings() {
        String str;
        C65935PuF c65935PuF = this.LIZIZ;
        C65983Pv1 c65983Pv1 = null;
        if (c65935PuF != null) {
            str = c65935PuF.LJLJJI;
        } else {
            str = null;
        }
        TextUtils.equals("local_test", str);
        try {
            InterfaceC65784Pro<C65983Pv1> interfaceC65784Pro = this.LIZLLL;
            if (interfaceC65784Pro != null) {
                c65983Pv1 = interfaceC65784Pro.invoke();
            }
            o.LJI(c65983Pv1);
            RuleEngineConfig ruleEngineConfig = c65983Pv1.LJLIL;
            o.LJI(ruleEngineConfig);
            Q1A.LJ(ruleEngineConfig.expressionCacheSize);
            Q1A.LJ = ruleEngineConfig.enableRuleEngine;
            Q1A.LJFF.LIZIZ = ruleEngineConfig.enableAppLog;
            Q1A.LJIIIIZZ.getClass();
            String str2 = ruleEngineConfig.abTag;
            Q1A.LJIIJ = str2;
            Q1M LIZ = Q1A.LIZ();
            if (LIZ != null) {
                LIZ.LIZLLL = str2;
            }
            Q1E.LIZLLL();
            String str3 = this.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("dynamic rule_engine_config:");
            LIZ2.append(ruleEngineConfig);
            C3C5.m7constructorimpl(Integer.valueOf(Log.d(str3, X1D.LIZIZ(LIZ2))));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static String LJIILJJIL(Q11 q11) {
        String str;
        StringBuilder sb = new StringBuilder("strategies: [");
        Iterator<String> it = q11.LIZJ.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(", ");
        }
        sb.append("]\nrules: [ ");
        Iterator<C39522FfC> it2 = q11.LJI.iterator();
        while (it2.hasNext()) {
            RuleModel ruleModel = it2.next().LIZJ;
            if (ruleModel == null || (str = ruleModel.title) == null) {
                str = "unknown";
            }
            sb.append(str);
            sb.append(", ");
        }
        return C0EH.LIZJ(sb, "]", "sb.toString()");
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final void LIZ(PQ5 pq5) {
        Q1M LIZ = Q1A.LIZ();
        if (LIZ != null) {
            Q2I q2i = LIZ.LIZIZ;
            q2i.getClass();
            C61689OIz c61689OIz = (C61689OIz) q2i.LIZJ.LIZIZ;
            c61689OIz.getClass();
            ((Map) c61689OIz.LIZ).put(pq5.LIZ, pq5);
        }
        this.LJ.LIZ(pq5);
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final void LIZIZ(FTR<?> ftr) {
        Q1A.LIZLLL(ftr);
        this.LJ.LIZIZ(ftr);
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final Object LIZJ(String valueName) {
        o.LJIIIZ(valueName, "valueName");
        FTR<?> ftr = Q16.LIZ.get(valueName);
        if (ftr != null) {
            return ftr.getValue();
        }
        return null;
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final List LJFF(List list) {
        return this.LJ.LJFF(list);
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final List LJIIIZ(int i) {
        Q1R LIZ = Q1T.LIZ("guard_fuse");
        if (LIZ != null) {
            HashMap<Integer, List<String>> hashMap = LIZ.LIZJ;
            if (hashMap == null) {
                return C61878OQg.INSTANCE;
            }
            if (hashMap.get(Integer.valueOf(i)) != null) {
                List<String> list = hashMap.get(Integer.valueOf(i));
                if (list != null) {
                    return list;
                }
                o.LJIIZILJ();
                throw null;
            }
            HashMap<Integer, List<String>> hashMap2 = LIZ.LIZJ;
            if (hashMap2 != null) {
                if (hashMap2.get(Integer.valueOf(i)) != null) {
                    HashMap<Integer, List<String>> hashMap3 = LIZ.LIZJ;
                    if (hashMap3 != null) {
                        List<String> list2 = hashMap3.get(Integer.valueOf(i));
                        if (list2 != null) {
                            return list2;
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                return C61878OQg.INSTANCE;
            }
            o.LJIIZILJ();
            throw null;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final Q11 LIZLLL(Map<String, ?> map, Map<String, ? extends PQ5> functions) {
        boolean z;
        C66226Pyw c66226Pyw;
        Map<String, InterfaceC65784Pro<Boolean>> map2;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        o.LJIIIZ(functions, "functions");
        Object obj = ((LinkedHashMap) map).get("source");
        if (obj != null) {
            String str = (String) obj;
            Q08 q08 = this.LIZJ;
            boolean z2 = false;
            if (q08 != null && (c66226Pyw = (C66226Pyw) q08.LJLIL) != null && (map2 = c66226Pyw.LJLJLJ) != null && (interfaceC65784Pro = map2.get("is_not_consent")) != null && interfaceC65784Pro.invoke().booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (((Number) C34211Dbj.LIZ.getValue()).intValue() == 0 || o.LJ(str, "rasp_monitor") || o.LJ(str, "rasp")) {
                z2 = true;
            }
            long nanoTime = System.nanoTime();
            Q11 LJ = Q1E.LJ(map, functions);
            long nanoTime2 = System.nanoTime();
            if (z2) {
                return LJ;
            }
            C64396PPc.LIZ("both", str, "ruler_total_cost", ((float) (nanoTime2 - nanoTime)) / 1000000);
            Q11 LIZLLL = this.LJ.LIZLLL(map, functions);
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.post(new RunnableC39555Ffj(this, LJ, LIZLLL, str, map, z));
            return LJ;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final Q11 LJIIJJI(String str, Map map, Map functions) {
        boolean z;
        C66226Pyw c66226Pyw;
        Map<String, InterfaceC65784Pro<Boolean>> map2;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        o.LJIIIZ(functions, "functions");
        int intValue = ((Number) C34211Dbj.LIZ.getValue()).intValue();
        Q08 q08 = this.LIZJ;
        boolean z2 = false;
        if (q08 != null && (c66226Pyw = (C66226Pyw) q08.LJLIL) != null && (map2 = c66226Pyw.LJLJLJ) != null && (interfaceC65784Pro = map2.get("is_not_consent")) != null && interfaceC65784Pro.invoke().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (intValue == 0 || o.LJ("guard_fuse", "rasp_monitor") || o.LJ("guard_fuse", "rasp")) {
            z2 = true;
        }
        long nanoTime = System.nanoTime();
        Q11 LJ = Q1E.LJ(map, functions);
        long nanoTime2 = System.nanoTime();
        if (z2) {
            return LJ;
        }
        C64396PPc.LIZ("both", "guard_fuse", "ruler_total_cost", ((float) (nanoTime2 - nanoTime)) / 1000000);
        Q11 LIZLLL = this.LJ.LIZLLL(map, functions);
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.post(new RunnableC39555Ffj(this, LJ, LIZLLL, "guard_fuse", map, z));
        return LJ;
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void init(C65935PuF c65935PuF, Object obj, Object obj2, Object obj3) {
        C65983Pv1 c65983Pv1;
        String str;
        String str2;
        Q15 q15;
        Map<String, InterfaceC65784Pro<Boolean>> map;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        Q08 q08 = (Q08) obj;
        InterfaceC65784Pro<C65983Pv1> interfaceC65784Pro2 = (InterfaceC65784Pro) obj2;
        long nanoTime = System.nanoTime();
        this.LIZIZ = c65935PuF;
        this.LIZJ = q08;
        this.LIZLLL = interfaceC65784Pro2;
        C66226Pyw c66226Pyw = (C66226Pyw) q08.LJLIL;
        if (c66226Pyw != null && (map = c66226Pyw.LJLJLJ) != null && (interfaceC65784Pro = map.get("is_kids_mode")) != null) {
            interfaceC65784Pro.invoke().booleanValue();
        }
        if (interfaceC65784Pro2 != null) {
            c65983Pv1 = interfaceC65784Pro2.invoke();
        } else {
            c65983Pv1 = null;
        }
        o.LJI(c65983Pv1);
        RuleEngineConfig ruleEngineConfig = c65983Pv1.LJLIL;
        o.LJI(ruleEngineConfig);
        if (!ruleEngineConfig.enableRuleEngine) {
            return;
        }
        Q18 q18 = (Q18) q08.LJLILLLLZI;
        if (q18 != null) {
            str = q18.LIZIZ();
        } else {
            str = null;
        }
        o.LJI(str);
        AqS161S0100000_11 aqS161S0100000_11 = new AqS161S0100000_11(this, 70);
        Q1A.LJIILJJIL = System.nanoTime();
        Q1A.LJIILLIIL = C58716N2q.LIZ();
        Object obj4 = q08.LJLIL;
        o.LJI(obj4);
        for (Map.Entry<String, InterfaceC65784Pro<Boolean>> entry : ((C66226Pyw) obj4).LJLJLJ.entrySet()) {
            Q1A.LIZLLL(new C38940FQa(entry.getKey(), Boolean.TYPE, new AqS151S0100000_1(entry, 797)));
        }
        Q1A.LJIILIIL = ruleEngineConfig.enableFFF;
        Q19 q19 = new Q19(new AqS115S0300000_11(q08, ruleEngineConfig, c65935PuF, 3));
        synchronized (Q1A.class) {
            Q1A.LIZIZ = q19;
            Q1A.LIZLLL = q19.LJ;
            Q1A.LJ = q19.LJFF;
            Q1A.LJII = q19.LIZJ;
            boolean z = q19.LJII;
            Q1B q1b = Q1A.LJFF;
            q1b.LIZ = q19.LIZLLL;
            q1b.LIZIZ = z;
            C66339Q1v c66339Q1v = Q1A.LJI;
            c66339Q1v.getClass();
            c66339Q1v.LIZ = q19.LJIILL;
            Q1A.LJIIIIZZ.getClass();
            Q1A.LJIIJJI = q19.LJIILLIIL;
            Q1A.LIZ.set(true);
            Q1W q1w = Q1M.LJFF;
            C78855Ux9 c78855Ux9 = new C78855Ux9();
            q1w.getClass();
            Q1M.LJ = c78855Ux9;
        }
        Application context = c65935PuF.LJLIL;
        o.LJIIIZ(context, "context");
        Q1E.LIZJ(new C32086CiY(context, str));
        Q1E.LIZJ(new Q17(aqS161S0100000_11));
        Q1E.LIZLLL();
        String str3 = ruleEngineConfig.abTag;
        Q1A.LJIIJ = str3;
        Q1M LIZ = Q1A.LIZ();
        if (LIZ != null) {
            LIZ.LIZLLL = str3;
        }
        Q1A.LJIILL = System.nanoTime();
        Q1A.LJIIZILJ = C58716N2q.LIZ();
        if (Q1A.LJIIL) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cpu_time", Q1A.LJIIZILJ - Q1A.LJIILLIIL);
            jSONObject.put("time", (Q1A.LJIILL - Q1A.LJIILJJIL) / 1000);
            JSONObject jSONObject2 = new JSONObject();
            if (Q1A.LJIIJJI) {
                str2 = "use_il";
            } else {
                str2 = "ordinary";
            }
            jSONObject2.put("ab_tag", str2);
            Q19 q192 = Q1A.LIZIZ;
            if (q192 != null && (q15 = q192.LJI) != null) {
                q15.LIZ("ruler_init_time_cost", jSONObject2, null, jSONObject);
            }
        }
        float f = 1000000;
        C64396PPc.LIZ("both", "init", "ruler_init_cost", ((float) (System.nanoTime() - nanoTime)) / f);
        long nanoTime2 = System.nanoTime();
        this.LJ.LJIILIIL(c65935PuF, q08, interfaceC65784Pro2);
        C64396PPc.LIZ("both", "init", "ttm_init_cost", ((float) (System.nanoTime() - nanoTime2)) / f);
    }
}
