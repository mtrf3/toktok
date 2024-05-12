package com.ss.android.ugc.aweme.property;

import X.HM5;
import X.InterfaceC44351Hat;

/* loaded from: classes8.dex */
public final class AVPreferences_CukaieClosetFactory implements InterfaceC44351Hat {
    @Override // X.InterfaceC44351Hat
    public String closetName() {
        return "av_settings.xml";
    }

    @Override // X.InterfaceC44351Hat
    public Object createCloset(HM5 hm5) {
        return new AVPreferences_CukaieClosetAdapter(hm5);
    }
}
