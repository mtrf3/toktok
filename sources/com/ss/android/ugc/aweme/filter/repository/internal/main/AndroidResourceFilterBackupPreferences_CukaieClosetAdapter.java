package com.ss.android.ugc.aweme.filter.repository.internal.main;

import X.HLF;
import X.HM5;

/* loaded from: classes8.dex */
public final class AndroidResourceFilterBackupPreferences_CukaieClosetAdapter extends HLF implements AndroidResourceFilterBackupPreferences {
    @Override // com.ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences
    public int getResourcesVersion() {
        return getStore().getInt("resources_version", 0);
    }

    public AndroidResourceFilterBackupPreferences_CukaieClosetAdapter(HM5 hm5) {
        super(hm5);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences
    public void setResourcesVersion(int i) {
        getStore().LJ(i, "resources_version");
    }
}
