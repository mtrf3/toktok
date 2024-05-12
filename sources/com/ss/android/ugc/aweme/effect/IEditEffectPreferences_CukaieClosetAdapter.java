package com.ss.android.ugc.aweme.effect;

import X.HLF;
import X.HM5;

/* loaded from: classes8.dex */
public final class IEditEffectPreferences_CukaieClosetAdapter extends HLF implements IEditEffectPreferences {
    public IEditEffectPreferences_CukaieClosetAdapter(HM5 hm5) {
        super(hm5);
    }

    @Override // com.ss.android.ugc.aweme.effect.IEditEffectPreferences
    public int getResourceVersion(int i) {
        return getStore().getInt("fallback_resource_version", i);
    }

    @Override // com.ss.android.ugc.aweme.effect.IEditEffectPreferences
    public void setResourceVersion(int i) {
        getStore().LJ(i, "fallback_resource_version");
    }
}
