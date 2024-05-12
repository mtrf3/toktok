package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerSettingCacheExp;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LivePlayerSettingCacheExp_LivePlayerSettingCacheConfig_OptTypeAdapter extends TypeAdapter<LivePlayerSettingCacheExp.LivePlayerSettingCacheConfig> {
    public LivePlayerSettingCacheExp_LivePlayerSettingCacheConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePlayerSettingCacheExp.LivePlayerSettingCacheConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LivePlayerSettingCacheExp.LivePlayerSettingCacheConfig livePlayerSettingCacheConfig = new LivePlayerSettingCacheExp.LivePlayerSettingCacheConfig(0, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "player_cache_setting")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    livePlayerSettingCacheConfig.cacheSetting = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "setting_map_size")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    livePlayerSettingCacheConfig.settingMapSize = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return livePlayerSettingCacheConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LivePlayerSettingCacheExp.LivePlayerSettingCacheConfig livePlayerSettingCacheConfig) {
        LivePlayerSettingCacheExp.LivePlayerSettingCacheConfig livePlayerSettingCacheConfig2 = livePlayerSettingCacheConfig;
        o.LJIIIZ(writer, "writer");
        if (livePlayerSettingCacheConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("player_cache_setting");
        C79062V1e.LJFF(livePlayerSettingCacheConfig2.cacheSetting, writer, "setting_map_size");
        C77339UWx.LJFF(livePlayerSettingCacheConfig2.settingMapSize, writer);
    }
}
