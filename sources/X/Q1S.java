package X;

import com.bytedance.ruler.model.StrategyModel;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1S implements InterfaceC66330Q1m {
    public m LIZ;
    public m LIZIZ;
    public final String LIZJ;

    public final String toString() {
        try {
            m mVar = new m();
            mVar.LJJII("strategies", this.LIZ);
            mVar.LJJII("policies", this.LIZIZ);
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

    public Q1S(String str) {
        this.LIZJ = str;
    }

    @Override // X.InterfaceC66330Q1m
    public final StrategyModel LIZ(String str) {
        m LJJIJIL;
        g LJJIJIIJI;
        boolean z;
        j LJJIJ;
        m LJJIJIL2;
        p LJJIJL;
        try {
            m mVar = this.LIZ;
            if (mVar == null || (LJJIJIL = mVar.LJJIJIL(str)) == null || (LJJIJIIJI = LJJIJIL.LJJIJIIJI("rules")) == null) {
                return null;
            }
            m mVar2 = this.LIZ;
            if (mVar2 != null && (LJJIJIL2 = mVar2.LJJIJIL(str)) != null && (LJJIJL = LJJIJIL2.LJJIJL("exec_all_rules")) != null) {
                z = LJJIJL.LJFF();
            } else {
                z = false;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<j> it = LJJIJIIJI.iterator();
            while (it.hasNext()) {
                j it2 = it.next();
                o.LJFF(it2, "it");
                String LJJIFFI = it2.LJJIFFI();
                m mVar3 = this.LIZIZ;
                if (mVar3 != null && (LJJIJ = mVar3.LJJIJ(LJJIFFI)) != null) {
                    Q1P LIZIZ = Q1O.LIZIZ(this.LIZJ, LJJIJ);
                    if (LIZIZ != null) {
                        LIZIZ.key = LJJIFFI;
                        arrayList.add(LIZIZ);
                    }
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("rule[");
                    LIZ.append(LJJIFFI);
                    LIZ.append("] not found in policies");
                    Q1V.LIZ(this, null, 303, X1D.LIZIZ(LIZ));
                }
            }
            return new StrategyModel(str, z, arrayList);
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            if (LJFF != null) {
                Q1V.LIZ(this, LJFF, 301, LJFF.getLocalizedMessage());
            }
            return null;
        }
    }

    @Override // X.InterfaceC66330Q1m
    public final void LIZIZ(m mVar) {
        m LJJIJIL = mVar.LJJIJIL("policies");
        if (LJJIJIL != null) {
            if (this.LIZIZ != null) {
                java.util.Set<Map.Entry<String, j>> entrySet = LJJIJIL.entrySet();
                o.LJFF(entrySet, "tempPolicies.entrySet()");
                for (Map.Entry<String, j> entry : entrySet) {
                    m mVar2 = this.LIZIZ;
                    if (mVar2 != null) {
                        mVar2.LJJII(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                this.LIZIZ = LJJIJIL;
            }
        }
        m LJJIJIL2 = mVar.LJJIJIL("strategies");
        if (LJJIJIL2 != null) {
            if (this.LIZ != null) {
                java.util.Set<Map.Entry<String, j>> entrySet2 = LJJIJIL2.entrySet();
                o.LJFF(entrySet2, "tempStrategies.entrySet()");
                for (Map.Entry<String, j> entry2 : entrySet2) {
                    m mVar3 = this.LIZ;
                    if (mVar3 != null) {
                        mVar3.LJJII(entry2.getKey(), entry2.getValue());
                    }
                }
                return;
            }
            this.LIZ = LJJIJIL2;
        }
    }
}
