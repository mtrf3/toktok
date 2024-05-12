package com.bytedance.android.live_settings.repo;

import com.bytedance.keva.Keva;

/* loaded from: classes6.dex */
public class SettingsRepo extends BaseRepo {
    public static final SettingsRepo INSTANCE = new SettingsRepo();

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public String getTag() {
        return "SettingsRepo";
    }

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public Keva getDataRepo() {
        return Keva.getRepo("live_settings_repo");
    }
}
