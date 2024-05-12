package com.bytedance.android.live_settings.repo;

import com.bytedance.keva.Keva;

/* loaded from: classes6.dex */
public class OtherRepo extends BaseRepo {
    public static final OtherRepo INSTANCE = new OtherRepo();

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public String getTag() {
        return "OtherRepo";
    }

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public Keva getDataRepo() {
        return Keva.getRepo("live_settings_other_repo");
    }
}
