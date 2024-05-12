package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import X.HLF;
import X.HM5;

/* loaded from: classes8.dex */
public final class IAudioEffectPreferences_CukaieClosetAdapter extends HLF implements IAudioEffectPreferences {
    public IAudioEffectPreferences_CukaieClosetAdapter(HM5 hm5) {
        super(hm5);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.IAudioEffectPreferences
    public int getResourceVersion(int i) {
        return getStore().getInt("resource_version", i);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.IAudioEffectPreferences
    public void setResourceVersion(int i) {
        getStore().LJ(i, "resource_version");
    }
}
