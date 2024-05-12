package com.bytedance.ies.ugc.aweme.commercialize.intelligence;

import X.C58096Mr6;

/* loaded from: classes10.dex */
public final class IntelligenceModuleImpl implements IIntelligenceModule {
    public static IIntelligenceModule LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IIntelligenceModule.class, false);
        if (LIZ != null) {
            return (IIntelligenceModule) LIZ;
        }
        if (C58096Mr6.LJIJ == null) {
            synchronized (IIntelligenceModule.class) {
                if (C58096Mr6.LJIJ == null) {
                    C58096Mr6.LJIJ = new IntelligenceModuleImpl();
                }
            }
        }
        return C58096Mr6.LJIJ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.IIntelligenceModule
    public final void LIZ() {
    }
}
