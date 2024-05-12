package com.bytedance.pumbaa.ruler.adapter.api;

import X.C61878OQg;
import X.C65935PuF;
import X.FTR;
import X.PQ5;
import X.Q11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RuleEngineServiceEmptyImpl implements IRuleEngineService {
    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final void LIZ(PQ5 pq5) {
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final void LIZIZ(FTR<?> ftr) {
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final Object LIZJ(String valueName) {
        o.LJIIIZ(valueName, "valueName");
        return null;
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void updateSettings() {
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final List LJFF(List list) {
        return new ArrayList();
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final List LJIIIZ(int i) {
        return C61878OQg.INSTANCE;
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final Q11 LIZLLL(Map<String, ?> map, Map<String, ? extends PQ5> functions) {
        o.LJIIIZ(functions, "functions");
        return new Q11(0, null, null, null, null, 255);
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final Q11 LJIIJJI(String str, Map map, Map functions) {
        o.LJIIIZ(functions, "functions");
        return new Q11(0, null, null, null, null, 255);
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void init(C65935PuF c65935PuF, Object obj, Object obj2, Object obj3) {
    }
}
