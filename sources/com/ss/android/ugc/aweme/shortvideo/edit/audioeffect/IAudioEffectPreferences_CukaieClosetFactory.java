package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import X.HM5;
import X.InterfaceC44351Hat;

/* loaded from: classes8.dex */
public final class IAudioEffectPreferences_CukaieClosetFactory implements InterfaceC44351Hat {
    @Override // X.InterfaceC44351Hat
    public String closetName() {
        return "AudioEffect";
    }

    @Override // X.InterfaceC44351Hat
    public Object createCloset(HM5 hm5) {
        return new IAudioEffectPreferences_CukaieClosetAdapter(hm5);
    }
}
