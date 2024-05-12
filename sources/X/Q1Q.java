package X;

import com.bytedance.ruler.model.StrategyModel;
import com.google.gson.Gson;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1Q implements InterfaceC66330Q1m {
    public final java.util.Map<String, Q1P> LIZ = new LinkedHashMap();
    public final java.util.Map<String, StrategyModel> LIZIZ = new LinkedHashMap();
    public final String LIZJ;

    public final String toString() {
        try {
            m mVar = new m();
            Gson gson = new Gson();
            mVar.LJJII("policies", gson.LJIJJLI(this.LIZ));
            mVar.LJJII("strategies", gson.LJIJJLI(this.LIZIZ));
            String jVar = mVar.toString();
            o.LJFF(jVar, "json.toString()");
            return jVar;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            C3C5.m10exceptionOrNullimpl(LIZ);
            return "";
        }
    }

    public Q1Q(String str) {
        this.LIZJ = str;
    }

    @Override // X.InterfaceC66330Q1m
    public final StrategyModel LIZ(String str) {
        return (StrategyModel) ((LinkedHashMap) this.LIZIZ).get(str);
    }

    @Override // X.InterfaceC66330Q1m
    public final void LIZIZ(m mVar) {
        java.util.Set<Map.Entry<String, j>> entrySet;
        boolean z;
        java.util.Set<Map.Entry<String, j>> entrySet2;
        m LJJIJIL = mVar.LJJIJIL("policies");
        if (LJJIJIL != null && (entrySet2 = LJJIJIL.entrySet()) != null) {
            for (Map.Entry<String, j> entry : entrySet2) {
                Q1P LIZIZ = Q1O.LIZIZ(this.LIZJ, entry.getValue());
                if (LIZIZ != null) {
                    LIZIZ.key = entry.getKey();
                    if (((LinkedHashMap) this.LIZ).get(entry.getKey()) != null) {
                        Q1P q1p = (Q1P) ((LinkedHashMap) this.LIZ).get(entry.getKey());
                        if (q1p != null) {
                            q1p.title = LIZIZ.title;
                            q1p.LIZIZ = LIZIZ.LIZIZ;
                            q1p.conf = LIZIZ.conf;
                            q1p.cel = LIZIZ.cel;
                            q1p.key = LIZIZ.key;
                            q1p.LIZJ = LIZIZ.LIZJ;
                            q1p.LIZ = LIZIZ.LIZ;
                        }
                    } else {
                        java.util.Map<String, Q1P> map = this.LIZ;
                        String key = entry.getKey();
                        o.LJFF(key, "item.key");
                        map.put(key, LIZIZ);
                    }
                }
            }
        }
        m LJJIJIL2 = mVar.LJJIJIL("strategies");
        if (LJJIJIL2 != null && (entrySet = LJJIJIL2.entrySet()) != null) {
            for (Map.Entry<String, j> entry2 : entrySet) {
                String key2 = entry2.getKey();
                j value = entry2.getValue();
                o.LJFF(value, "entry.value");
                g LJJIJIIJI = value.LJIIZILJ().LJJIJIIJI("rules");
                j value2 = entry2.getValue();
                o.LJFF(value2, "entry.value");
                p LJJIJL = value2.LJIIZILJ().LJJIJL("exec_all_rules");
                if (LJJIJL != null) {
                    z = LJJIJL.LJFF();
                } else {
                    z = false;
                }
                if (LJJIJIIJI != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<j> it = LJJIJIIJI.iterator();
                    while (it.hasNext()) {
                        j it2 = it.next();
                        o.LJFF(it2, "it");
                        String LJJIFFI = it2.LJJIFFI();
                        Object obj = ((LinkedHashMap) this.LIZ).get(LJJIFFI);
                        if (obj != null) {
                            arrayList.add(obj);
                        } else {
                            Q1V.LIZ(this, null, 303, a1.LJ("rule[", LJJIFFI, "] not found in policies"));
                        }
                    }
                    java.util.Map<String, StrategyModel> map2 = this.LIZIZ;
                    o.LJFF(key2, "key");
                    map2.put(key2, new StrategyModel(key2, z, arrayList));
                }
            }
        }
    }
}
