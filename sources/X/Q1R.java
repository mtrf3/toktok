package X;

import com.google.gson.Gson;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1R {
    public List<Q1P> LIZ;
    public List<String> LIZIZ;
    public HashMap<Integer, List<String>> LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public m LJFF;
    public InterfaceC66330Q1m LJI;
    public final C13T LJII;
    public final EnumC62492cn LJIIIIZZ;

    public final String toString() {
        try {
            Gson gson = Q1T.LJFF;
            m mVar = (m) gson.LJI(String.valueOf(this.LJI), m.class);
            mVar.LJJII("strategy_map", gson.LJIJJLI(this.LIZ));
            mVar.LJJII("keys", gson.LJIJJLI(this.LIZIZ));
            mVar.LJJII("strategy_select_break", gson.LJIJJLI(Boolean.valueOf(this.LJ)));
            mVar.LJJII("rule_exec_break", gson.LJIJJLI(Boolean.valueOf(this.LIZLLL)));
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

    public final void LIZ(m mVar, String str) {
        Object LIZ;
        boolean z;
        j jVar;
        List<Q1P> list;
        String str2;
        j LJJIJ;
        j LJJIJ2;
        InterfaceC66330Q1m q1s;
        boolean z2;
        try {
            m LJJIJIL = mVar.LJJIJIL("const_pool");
            this.LJFF = LJJIJIL;
            if (LJJIJIL != null) {
                FJH.LIZ(LJJIJIL, str);
            }
            g LJJIJIIJI = mVar.LJJIJIIJI("api_strategy_map");
            Q19 q19 = Q1A.LIZIZ;
            int i = 0;
            if (q19 != null) {
                z = q19.LJIIL;
            } else {
                z = false;
            }
            if (z && LJJIJIIJI != null) {
                HashMap<Integer, List<String>> hashMap = new HashMap<>();
                Iterator<j> it = LJJIJIIJI.iterator();
                while (it.hasNext()) {
                    j it2 = it.next();
                    o.LJFF(it2, "it");
                    m LJIIZILJ = it2.LJIIZILJ();
                    g LJJIJIIJI2 = LJIIZILJ.LJJIJIIJI("strategies");
                    ArrayList arrayList = new ArrayList(LJJIJIIJI2.size());
                    Iterator<j> it3 = LJJIJIIJI2.iterator();
                    while (it3.hasNext()) {
                        j strategy = it3.next();
                        o.LJFF(strategy, "strategy");
                        arrayList.add(strategy.LJJIFFI());
                    }
                    g LJJIJIIJI3 = LJIIZILJ.LJJIJIIJI("api_ids");
                    o.LJFF(LJJIJIIJI3, "apiStrategy.getAsJsonArray(\"api_ids\")");
                    Iterator<j> it4 = LJJIJIIJI3.iterator();
                    while (it4.hasNext()) {
                        j apiId = it4.next();
                        o.LJFF(apiId, "apiId");
                        hashMap.put(Integer.valueOf(apiId.LJIILJJIL()), arrayList);
                    }
                }
                this.LIZJ = hashMap;
            }
            m LJJIJIL2 = mVar.LJJIJIL("strategy_map");
            if (LJJIJIL2 != null) {
                jVar = LJJIJIL2.LJJIJ("rules");
            } else {
                jVar = null;
            }
            try {
                p LJJIJL = mVar.LJJIJL("strategy_select_break");
                boolean z3 = true;
                if (LJJIJL != null) {
                    z2 = LJJIJL.LJFF();
                } else {
                    z2 = true;
                }
                this.LJ = z2;
                p LJJIJL2 = mVar.LJJIJL("rule_exec_break");
                if (LJJIJL2 != null) {
                    z3 = LJJIJL2.LJFF();
                }
                this.LIZLLL = z3;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            if (jVar != null) {
                this.LIZ = Q1O.LIZJ(str, jVar);
            }
            if (this.LJI == null) {
                if (this.LJIIIIZZ == EnumC62492cn.PARSE_AT_STORE) {
                    q1s = new Q1Q(str);
                } else {
                    q1s = new Q1S(str);
                }
                this.LJI = q1s;
            }
            InterfaceC66330Q1m interfaceC66330Q1m = this.LJI;
            if (interfaceC66330Q1m != null) {
                interfaceC66330Q1m.LIZIZ(mVar);
            }
            m LJJIJIL3 = mVar.LJJIJIL("strategy_map");
            if (LJJIJIL3 != null && (LJJIJ2 = LJJIJIL3.LJJIJ("keys")) != null && (LJJIJ2 instanceof g)) {
                this.LIZIZ = (List) Q1T.LJFF.LIZLLL(LJJIJ2, new TypeToken<List<? extends String>>() { // from class: X.2Qp
                }.getType());
            }
            if (Q1A.LJIILIIL && (list = this.LIZ) != null) {
                Iterator it5 = ((ArrayList) list).iterator();
                while (it5.hasNext()) {
                    Q1P q1p = (Q1P) it5.next();
                    List<? extends Q2L> list2 = q1p.LIZ;
                    if (list2 != null) {
                        Q3D LJII = C78841Uwv.LJII(list2);
                        C13T c13t = this.LJII;
                        j jVar2 = q1p.conf;
                        if (jVar2 != null && (LJJIJ = jVar2.LJIIZILJ().LJJIJ("strategy")) != null) {
                            str2 = LJJIJ.LJJIFFI();
                        } else {
                            str2 = null;
                        }
                        c13t.LIZ(LJII, i, str2, q1p);
                    }
                    i++;
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th2) {
            LIZ = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            Q1V.LIZ(this, m10exceptionOrNullimpl, 302, m10exceptionOrNullimpl.getLocalizedMessage());
        }
    }

    public Q1R(String str, m mVar, EnumC62492cn parseModel) {
        o.LJIIJ(parseModel, "parseModel");
        this.LJIIIIZZ = parseModel;
        this.LIZLLL = true;
        this.LJ = true;
        this.LJII = new C13T(2);
        LIZ(mVar, str);
    }
}
