package com.bytedance.pumbaa.pdp.api;

import X.C66168Py0;
import X.C66210Pyg;
import X.C66212Pyi;
import X.InterfaceC65784Pro;
import X.InterfaceC66169Py1;
import X.InterfaceC66217Pyn;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class PolicyDecisionEmptyImp implements IPolicyDecision {
    @Override // com.bytedance.pumbaa.pdp.api.IPolicyDecision
    public final InterfaceC66169Py1 LIZ() {
        return new C66212Pyi();
    }

    @Override // com.bytedance.pumbaa.pdp.api.IPolicyDecision
    public final C66210Pyg LIZIZ(Map<String, ? extends Object> map, String str, int i, List<C66168Py0> list, InterfaceC66217Pyn interfaceC66217Pyn, InterfaceC65784Pro<? extends Object> interfaceC65784Pro) {
        Object obj;
        if (interfaceC65784Pro != null) {
            obj = interfaceC65784Pro.invoke();
        } else {
            obj = null;
        }
        return new C66210Pyg(obj, null, null, 59);
    }
}
