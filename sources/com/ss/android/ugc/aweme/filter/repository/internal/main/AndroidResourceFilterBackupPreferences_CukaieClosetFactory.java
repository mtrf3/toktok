package com.ss.android.ugc.aweme.filter.repository.internal.main;

import X.HM5;
import X.InterfaceC44351Hat;

/* loaded from: classes8.dex */
public final class AndroidResourceFilterBackupPreferences_CukaieClosetFactory implements InterfaceC44351Hat {
    @Override // X.InterfaceC44351Hat
    public String closetName() {
        return "VideoRecord";
    }

    @Override // X.InterfaceC44351Hat
    public Object createCloset(HM5 hm5) {
        return new AndroidResourceFilterBackupPreferences_CukaieClosetAdapter(hm5);
    }
}
