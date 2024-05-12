package X;

import com.bytedance.ruler.model.StrategyModel;
import com.google.gson.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import kotlin.jvm.internal.AqS109S0101000_11;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS15S2000000_11;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q1E {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL() {
        Q15 q15;
        ArrayList arrayList = new ArrayList();
        TreeSet<InterfaceC66332Q1o> treeSet = C66334Q1q.LIZ;
        synchronized (treeSet) {
            Iterator<InterfaceC66332Q1o> it = treeSet.iterator();
            while (it.hasNext()) {
                InterfaceC66332Q1o next = it.next();
                long currentTimeMillis = System.currentTimeMillis();
                m LIZ2 = next.LIZ();
                long currentTimeMillis2 = System.currentTimeMillis();
                Q19 q19 = Q1A.LIZIZ;
                if (q19 != null && (q15 = q19.LJI) != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("time", currentTimeMillis2 - currentTimeMillis);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("name", next.name());
                    q15.LIZ("ruler_strategy_init_time", jSONObject2, null, jSONObject);
                }
                if (LIZ2 != null) {
                    arrayList.add(LIZ2);
                }
            }
        }
        Q14.LIZ("com.bytedance.ruler.strategy.store.StrategyStore.updateStrategies", new AqS161S0100000_11(arrayList, 71));
    }

    public static void LIZJ(InterfaceC66332Q1o interfaceC66332Q1o) {
        TreeSet<InterfaceC66332Q1o> treeSet = C66334Q1q.LIZ;
        synchronized (treeSet) {
            treeSet.add(interfaceC66332Q1o);
        }
    }

    public static Q11 LJ(java.util.Map map, java.util.Map functions) {
        String str;
        Q11 q11;
        Q1B q1b;
        o.LJIIJ(functions, "functions");
        Object obj = ((LinkedHashMap) map).get("source");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Q1K.LIZIZ.set(Boolean.valueOf(Q1A.LJIIIZ));
        long nanoTime = System.nanoTime();
        try {
            if (Q1A.LJ && Q1A.LIZ.get()) {
                if (str == null) {
                    q11 = new Q11(307, "strategySetName is empty", null, null, null, 252);
                } else {
                    Q12 LIZ2 = LIZ(str, map, functions, false);
                    int i = LIZ2.LIZ;
                    if (i != 0) {
                        q11 = new Q11(i, LIZ2.LIZIZ, null, null, null, 252);
                        Q1X q1x = q11.LIZLLL;
                        Q1X q1x2 = LIZ2.LIZJ;
                        q1x.LJLJJI = q1x2.LJLJJI;
                        q1x.LJLILLLLZI = q1x2.LJLILLLLZI;
                    } else {
                        q11 = LIZIZ(str, LIZ2.LIZLLL, map, functions);
                        Q1X q1x3 = q11.LIZLLL;
                        Q1X q1x4 = LIZ2.LIZJ;
                        q1x3.LJLJJI = q1x4.LJLJJI;
                        q1x3.LJLILLLLZI = q1x4.LJLILLLLZI;
                    }
                }
            } else {
                q11 = new Q11(311, "ruler engine is un enable", null, null, null, 252);
            }
        } catch (Throwable th) {
            C66339Q1v c66339Q1v = Q1A.LJI;
            if (c66339Q1v != null) {
                AqS177S0100000_11 aqS177S0100000_11 = new AqS177S0100000_11(th, 24);
                if (6 >= c66339Q1v.LIZ) {
                    if (o.LJ(Q1K.LIZIZ.get(), Boolean.TRUE)) {
                        Q1K.LIZ(new AqS109S0101000_11(aqS177S0100000_11, 6, 2));
                    } else {
                        C48226IwI.LIZIZ(new AqS109S0101000_11(aqS177S0100000_11, 6, 3));
                    }
                }
            }
            q11 = new Q11(305, th.getLocalizedMessage(), null, th, null, 188);
        }
        long nanoTime2 = (System.nanoTime() - nanoTime) / 1000;
        if (str != null) {
            try {
                if (str.length() != 0 && (q1b = Q1A.LJFF) != null) {
                    q1b.LIZ(str, new Q1C(nanoTime2, q11, str, map));
                }
            } catch (Throwable unused) {
            }
        }
        Q1K.LIZIZ.set(Boolean.FALSE);
        ThreadLocal<List<InterfaceC65784Pro<C76800UCe>>> threadLocal = Q1K.LIZ;
        List<InterfaceC65784Pro<C76800UCe>> list = threadLocal.get();
        if (list != null && list.size() > 0) {
            threadLocal.set(new ArrayList());
            C48226IwI.LIZ(new AqS151S0100000_1(list, (List<String>) 892), 0L);
        }
        return q11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0158, code lost:
    
        if (r5 == 0) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02fb  */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.Q12 LIZ(java.lang.String r15, java.util.Map r16, java.util.Map r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1E.LIZ(java.lang.String, java.util.Map, java.util.Map, boolean):X.Q12");
    }

    public static Q11 LIZIZ(String str, List list, java.util.Map map, java.util.Map map2) {
        List<Q1P> list2;
        Q1R LIZ2 = Q1T.LIZ(str);
        if (LIZ2 != null) {
            if (list != null && ORZ.LJLLLL(list) != null) {
                long nanoTime = System.nanoTime();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String ruleName = (String) it.next();
                    o.LJIIJ(ruleName, "ruleName");
                    StrategyModel strategyModel = (StrategyModel) Q1T.LIZIZ(new AqS15S2000000_11(str, ruleName, 1));
                    if (strategyModel != null && (list2 = strategyModel.rules) != null) {
                        linkedHashSet.addAll(list2);
                    }
                }
                long nanoTime2 = System.nanoTime();
                if (linkedHashSet.isEmpty()) {
                    return new Q11(312, "Rules not found", list, null, null, 244);
                }
                Q11 LIZ3 = Q1F.LIZ(linkedHashSet, LIZ2.LIZLLL, map, map2);
                long nanoTime3 = System.nanoTime();
                LIZ3.LIZJ = list;
                Q1X q1x = LIZ3.LIZLLL;
                q1x.LJLJJL = nanoTime2 - nanoTime;
                q1x.LJLJJLL = nanoTime3 - nanoTime;
                return LIZ3;
            }
            return new Q11(309, "ruleSetArray is empty", null, null, null, 252);
        }
        return new Q11(308, "strategyScene is empty", null, null, null, 252);
    }
}
