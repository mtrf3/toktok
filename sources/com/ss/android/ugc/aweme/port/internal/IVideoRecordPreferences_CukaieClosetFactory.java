package com.ss.android.ugc.aweme.port.internal;

import X.HM5;
import X.InterfaceC44351Hat;

/* loaded from: classes8.dex */
public final class IVideoRecordPreferences_CukaieClosetFactory implements InterfaceC44351Hat {
    @Override // X.InterfaceC44351Hat
    public String closetName() {
        return "VideoRecord";
    }

    @Override // X.InterfaceC44351Hat
    public Object createCloset(HM5 hm5) {
        return new IVideoRecordPreferences_CukaieClosetAdapter(hm5);
    }
}
