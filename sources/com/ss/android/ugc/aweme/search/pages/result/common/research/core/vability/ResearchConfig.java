package com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public final class ResearchConfig extends F9E {

    @InterfaceC65349Pkn("isVAbility")
    public final boolean isVAbility;

    public static /* synthetic */ ResearchConfig copy$default(ResearchConfig researchConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = researchConfig.isVAbility;
        }
        return researchConfig.copy(z);
    }

    public final ResearchConfig copy(boolean z) {
        return new ResearchConfig(z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isVAbility)};
    }

    public final boolean isVAbility() {
        return this.isVAbility;
    }

    public ResearchConfig(boolean z) {
        this.isVAbility = z;
    }
}
