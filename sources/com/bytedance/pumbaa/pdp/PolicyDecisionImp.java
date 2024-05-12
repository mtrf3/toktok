package com.bytedance.pumbaa.pdp;

import X.C58096Mr6;
import X.C66168Py0;
import X.C66208Pye;
import X.C66210Pyg;
import X.InterfaceC65784Pro;
import X.InterfaceC66169Py1;
import X.InterfaceC66217Pyn;
import com.bytedance.pumbaa.pdp.api.IPolicyDecision;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class PolicyDecisionImp implements IPolicyDecision {
    public static IPolicyDecision LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IPolicyDecision.class, false);
        if (LIZ != null) {
            return (IPolicyDecision) LIZ;
        }
        if (C58096Mr6.LJJIL == null) {
            synchronized (IPolicyDecision.class) {
                if (C58096Mr6.LJJIL == null) {
                    C58096Mr6.LJJIL = new PolicyDecisionImp();
                }
            }
        }
        return C58096Mr6.LJJIL;
    }

    @Override // com.bytedance.pumbaa.pdp.api.IPolicyDecision
    public final InterfaceC66169Py1 LIZ() {
        return C66208Pye.LIZIZ;
    }

    @Override // com.bytedance.pumbaa.pdp.api.IPolicyDecision
    public final C66210Pyg LIZIZ(Map<String, ? extends Object> map, String str, int i, List<C66168Py0> list, InterfaceC66217Pyn interfaceC66217Pyn, InterfaceC65784Pro<? extends Object> interfaceC65784Pro) {
        return C66208Pye.LJ.LIZIZ(map, str, i, list, interfaceC66217Pyn, interfaceC65784Pro);
    }
}
