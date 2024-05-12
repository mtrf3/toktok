package com.ss.android.ugc.aweme.effect;

import X.HM5;
import X.InterfaceC44351Hat;

/* loaded from: classes8.dex */
public final class IEditEffectPreferences_CukaieClosetFactory implements InterfaceC44351Hat {
    @Override // X.InterfaceC44351Hat
    public String closetName() {
        return "EditEffectConfig";
    }

    @Override // X.InterfaceC44351Hat
    public Object createCloset(HM5 hm5) {
        return new IEditEffectPreferences_CukaieClosetAdapter(hm5);
    }
}
