package X;

import com.bytedance.pumbaa.pdp.api.IPolicyDecision;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pxb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66143Pxb implements InterfaceC66053Pw9 {
    public final IRuleEngineService LIZ;
    public final IPolicyDecision LIZIZ;

    public final void LIZ(PQ5 pq5) {
        this.LIZIZ.LIZ().LIZ(pq5);
    }

    public final Object LIZIZ(String valueName) {
        o.LJIIIZ(valueName, "valueName");
        return this.LIZIZ.LIZ().LIZJ(valueName);
    }

    public final void LIZJ(FTR<?> ftr) {
        this.LIZIZ.LIZ().LIZIZ(ftr);
    }

    public final List LJFF(int i) {
        return this.LIZ.LJIIIZ(i);
    }

    public C66143Pxb(IRuleEngineService iRuleEngineService, IPolicyDecision iPolicyDecision) {
        this.LIZ = iRuleEngineService;
        this.LIZIZ = iPolicyDecision;
    }

    @Override // X.InterfaceC66053Pw9
    public final Q11 LIZLLL(java.util.Map<String, ?> map, java.util.Map<String, ? extends PQ5> functions) {
        o.LJIIIZ(functions, "functions");
        return this.LIZ.LIZLLL(map, functions);
    }

    public final Q11 LJI(List list, java.util.Map map, java.util.Map functions) {
        o.LJIIIZ(functions, "functions");
        return this.LIZ.LJIIJJI("guard_fuse", map, functions);
    }

    public final C66210Pyg LJ(java.util.Map map, int i, List list, InterfaceC65784Pro interfaceC65784Pro) {
        return this.LIZIZ.LIZIZ(map, "guard", i, list, null, interfaceC65784Pro);
    }
}
