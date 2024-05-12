package X;

import Y.ARunnableS46S0100000_10;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.google.gson.internal.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.Pyf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66209Pyf {
    public final java.util.Map<C66211Pyh, C66210Pyg> LIZ = new LinkedHashMap();

    public final void LIZIZ(C66206Pyc c66206Pyc) {
        Iterator<InterfaceC66217Pyn> it = C66215Pyl.LIZLLL.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(c66206Pyc);
        }
        Iterator it2 = ((LinkedHashMap) this.LIZ).keySet().iterator();
        while (it2.hasNext()) {
            InterfaceC66217Pyn interfaceC66217Pyn = ((C66211Pyh) it2.next()).LJLJJL;
            if (interfaceC66217Pyn != null) {
                interfaceC66217Pyn.LIZJ(c66206Pyc);
            }
        }
    }

    public final void LIZJ(java.util.Map<String, Object> map) {
        List<C66168Py0> LJ = LJ(EnumC66158Pxq.ASYNC);
        if (((ArrayList) LJ).isEmpty()) {
            return;
        }
        C66215Pyl.LIZIZ.execute(new ARunnableS46S0100000_10((Object) new AqS158S0200000_11(map, LJ, 8), 92));
    }

    public final List<C66168Py0> LJ(EnumC66158Pxq enumC66158Pxq) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((LinkedHashMap) this.LIZ).keySet().iterator();
        while (it.hasNext()) {
            List<C66168Py0> list = ((C66211Pyh) it.next()).LJLJJI;
            if (list != null) {
                for (C66168Py0 c66168Py0 : list) {
                    if (c66168Py0.LJLIL == enumC66158Pxq) {
                        arrayList.add(c66168Py0);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void LJFF(C66206Pyc c66206Pyc) {
        Iterator<InterfaceC66217Pyn> it = C66215Pyl.LIZLLL.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(c66206Pyc);
        }
        Iterator it2 = ((LinkedHashMap) this.LIZ).keySet().iterator();
        while (it2.hasNext()) {
            InterfaceC66217Pyn interfaceC66217Pyn = ((C66211Pyh) it2.next()).LJLJJL;
            if (interfaceC66217Pyn != null) {
                interfaceC66217Pyn.LIZ(c66206Pyc);
            }
        }
    }

    public final Q11 LIZLLL(int i, java.util.Map<String, Object> map) {
        Q11 LIZLLL;
        ArrayList arrayList = (ArrayList) LJ(EnumC66158Pxq.SYNC);
        if (arrayList.isEmpty()) {
            return null;
        }
        map.put("source", "guard_fuse");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC66214Pyk interfaceC66214Pyk = ((C66168Py0) it.next()).LJLILLLLZI;
            if (interfaceC66214Pyk != null) {
                interfaceC66214Pyk.LIZIZ(EnumC66158Pxq.SYNC, map);
            }
        }
        IRuleEngineService iRuleEngineService = C66208Pye.LIZ;
        if (!(!iRuleEngineService.LJIIIZ(i).isEmpty())) {
            LIZLLL = iRuleEngineService.LIZLLL(map, C113554cx.LJJJLIIL());
        } else {
            LIZLLL = iRuleEngineService.LJIIJJI("guard_fuse", map, C113554cx.LJJJLIIL());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            InterfaceC66214Pyk interfaceC66214Pyk2 = ((C66168Py0) it2.next()).LJLILLLLZI;
            if (interfaceC66214Pyk2 != null) {
                interfaceC66214Pyk2.LIZ(EnumC66158Pxq.SYNC, new C66210Pyg(null, map, LIZLLL, 23));
            }
        }
        if (C66215Pyl.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("executeRulerSync result<<<<<< ");
            LIZ.append(LIZLLL);
            j.LIZLLL(X1D.LIZIZ(LIZ));
        }
        return LIZLLL;
    }

    public final void LIZ(int i, String str, java.util.Map map, Q11 q11) {
        for (Map.Entry entry : ((LinkedHashMap) this.LIZ).entrySet()) {
            if (entry.getValue() != null) {
                C66210Pyg c66210Pyg = (C66210Pyg) entry.getValue();
                if (c66210Pyg != null) {
                    c66210Pyg.LJLIL = i;
                }
                C66210Pyg c66210Pyg2 = (C66210Pyg) entry.getValue();
                if (c66210Pyg2 != null) {
                    o.LJIIIZ(str, "<set-?>");
                    c66210Pyg2.LJLILLLLZI = str;
                }
                C66210Pyg c66210Pyg3 = (C66210Pyg) entry.getValue();
                if (c66210Pyg3 != null) {
                    c66210Pyg3.LJLJJI = map;
                }
                C66210Pyg c66210Pyg4 = (C66210Pyg) entry.getValue();
                if (c66210Pyg4 != null) {
                    c66210Pyg4.LJLJJL = null;
                }
                C66210Pyg c66210Pyg5 = (C66210Pyg) entry.getValue();
                if (c66210Pyg5 != null) {
                    c66210Pyg5.LJLJJLL = q11;
                }
                entry.setValue(null);
            }
        }
    }
}
