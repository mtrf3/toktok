package com.bytedance.pumbaa.bpea.adapter.data.collect;

import X.C113554cx;
import X.C141335gf;
import X.C36011bB;
import X.C3C5;
import X.C46432IKe;
import X.C66304Q0m;
import X.C76800UCe;
import X.OHU;
import X.OSZ;
import X.Q0E;
import X.Q0H;
import X.Q0O;
import X.Q0P;
import X.Q0U;
import X.Q0V;
import X.Q0W;
import X.Q0X;
import android.app.Application;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS74S0000000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class DataCollectionModule extends Q0H {
    public final C36011bB LIZ = new C36011bB("Collect");
    public boolean LIZIZ = true;
    public final Map<Integer, Q0W> LIZJ = C113554cx.LJJLIIIIJ(new OSZ(-3001, new Q0W(-3001)), new OSZ(-1000, new Q0W(-1000)), new OSZ(-1001, new Q0W(-1001)), new OSZ(-2101, new Q0W(-2101)), new OSZ(-2001, new Q0W(-2001)));

    @Override // com.bytedance.pumbaa.bpea.adapter.api.IBPEADomainModule
    public final void LIZ() {
    }

    @Override // com.bytedance.pumbaa.bpea.adapter.api.IBPEADomainModule
    public final void LIZIZ(m mVar) {
        m mVar2;
        m LJJIJIL;
        if (!this.LIZIZ) {
            return;
        }
        m LJJIJIL2 = mVar.LJJIJIL("dataCollection");
        m mVar3 = null;
        if (LJJIJIL2 != null && (LJJIJIL = LJJIJIL2.LJJIJIL("limit")) != null) {
            mVar2 = LJJIJIL.LJJIJIL("dynamicList");
        } else {
            mVar2 = null;
        }
        LJ(mVar2);
        if (LJJIJIL2 != null) {
            mVar3 = LJJIJIL2.LJJIJIL("errorStrategy");
        }
        LJFF(mVar3);
    }

    @Override // X.Q0H
    public final void LIZLLL(g gVar) {
        if (gVar == null) {
            C36011bB space = this.LIZ;
            o.LJIIJ(space, "space");
            Q0P.LIZ.remove(space);
            Q0O.LIZIZ(this.LIZ, new Class[]{Q0X.class, Q0V.class, OHU.class});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<j> it = gVar.iterator();
        while (it.hasNext()) {
            j next = it.next();
            j jsonElement1 = next;
            o.LJIIIIZZ(jsonElement1, "jsonElement1");
            if ((jsonElement1 instanceof p) && (((p) jsonElement1).LJLIL instanceof String)) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            j jVar = (j) it2.next();
            if (jVar != null) {
                String LJJIFFI = jVar.LJJIFFI();
                if (LJJIFFI != null) {
                    switch (LJJIFFI.hashCode()) {
                        case -891652652:
                            if (!LJJIFFI.equals("BDLocationAccuracyUnit")) {
                                break;
                            } else {
                                arrayList.add(OHU.class);
                                break;
                            }
                        case 495840462:
                            if (!LJJIFFI.equals("BDLegalStrategyUnit")) {
                                break;
                            } else {
                                arrayList.add(Q0X.class);
                                break;
                            }
                        case 1107321552:
                            if (!LJJIFFI.equals("BDLimitStrategyUnit")) {
                                break;
                            } else {
                                arrayList.add(Q0V.class);
                                break;
                            }
                        case 1682757909:
                            if (!LJJIFFI.equals("BDRuleStrategyUnit")) {
                                break;
                            } else {
                                arrayList.add(Q0U.class);
                                break;
                            }
                        case 2017246746:
                            if (!LJJIFFI.equals("BDRuleFilterUnit")) {
                                break;
                            } else {
                                arrayList.add(C66304Q0m.class);
                                break;
                            }
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.google.gson.JsonPrimitive");
            }
        }
        C36011bB space2 = this.LIZ;
        o.LJIIJ(space2, "space");
        Q0P.LIZ.remove(space2);
        C36011bB c36011bB = this.LIZ;
        Object[] array = arrayList.toArray(new Class[0]);
        if (array != null) {
            Q0O.LIZIZ(c36011bB, (Class[]) array);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // X.Q0H
    public final void LJ(m mVar) {
        Object obj;
        if (mVar == null) {
            obj = null;
        } else {
            try {
                Q0E.LIZJ(new JSONObject(mVar.toString()));
                C46432IKe.LIZ(new AqS74S0000000_11(0));
                obj = C76800UCe.LIZ;
            } catch (Throwable th) {
                obj = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(obj);
            }
        }
        C3C5.m7constructorimpl(obj);
        C3C5.m10exceptionOrNullimpl(obj);
    }

    @Override // X.Q0H
    public final void LJFF(m mVar) {
        Iterator it = ((LinkedHashMap) this.LIZJ).entrySet().iterator();
        while (it.hasNext()) {
            ((Q0W) ((Map.Entry) it.next()).getValue()).LIZ = mVar;
        }
    }

    @Override // X.Q0H, com.bytedance.pumbaa.bpea.adapter.api.IBPEADomainModule
    public final void LIZJ(m mVar, Application application) {
        m mVar2;
        p LJJIJL;
        o.LJIIIZ(application, "application");
        if (mVar != null) {
            mVar2 = mVar.LJJIJIL("dataCollection");
            if (mVar2 != null && (LJJIJL = mVar2.LJJIJL("enable")) != null && (LJJIJL.LJLIL instanceof Boolean)) {
                boolean z = true;
                if (!LJJIJL.LJFF()) {
                    z = false;
                }
                this.LIZIZ = z;
            }
        } else {
            mVar2 = null;
        }
        if (!this.LIZIZ) {
            return;
        }
        Q0W q0w = (Q0W) ((LinkedHashMap) this.LIZJ).get(-3001);
        if (q0w != null) {
            Q0O.LIZ(this.LIZ, "RulerChecker", -3001, q0w);
        }
        Q0W q0w2 = (Q0W) ((LinkedHashMap) this.LIZJ).get(-1000);
        if (q0w2 != null) {
            Q0O.LIZ(this.LIZ, "LegalChecker", -1000, q0w2);
        }
        Q0W q0w3 = (Q0W) ((LinkedHashMap) this.LIZJ).get(-1001);
        if (q0w3 != null) {
            Q0O.LIZ(this.LIZ, "LegalChecker", -1001, q0w3);
        }
        Q0W q0w4 = (Q0W) ((LinkedHashMap) this.LIZJ).get(-2101);
        if (q0w4 != null) {
            Q0O.LIZ(this.LIZ, "ConditionChecker", -2101, q0w4);
        }
        Q0W q0w5 = (Q0W) ((LinkedHashMap) this.LIZJ).get(-2001);
        if (q0w5 != null) {
            Q0O.LIZ(this.LIZ, "ConditionChecker", -2001, q0w5);
        }
        super.LIZJ(mVar2, application);
    }
}
