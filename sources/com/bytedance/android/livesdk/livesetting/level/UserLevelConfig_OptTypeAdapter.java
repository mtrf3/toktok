package com.bytedance.android.livesdk.livesetting.level;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class UserLevelConfig_OptTypeAdapter extends TypeAdapter<UserLevelConfig> {
    public final Gson LIZ;

    public UserLevelConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final UserLevelConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        UserLevelConfig userLevelConfig = new UserLevelConfig(null, null, null, null, null, null, 63, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case 512469234:
                        if (!LJJ.equals("fe_gecko_upgrade_animation_source_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, FeResourceChannelConfig.class);
                            o.LJI(LIZ);
                            userLevelConfig.feGeckoAnimationSourceConfigList = LIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 863087628:
                        if (!LJJ.equals("lynx_urls")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            HashMap LIZIZ = C65412Plo.LIZIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZIZ);
                            userLevelConfig.revenueUserLevelLynxUrls = LIZIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1158156625:
                        if (!LJJ.equals("user_level_dynamic_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            userLevelConfig.userLevelDynamicConfig = (UserLevelDynamicConfig) this.LIZ.LJIIJ(UserLevelDynamicConfig.class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1551702171:
                        if (!LJJ.equals("live_native_gecko_source_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, BarrageGradeResConfig.class);
                            o.LJI(LIZ2);
                            userLevelConfig.barrageResConfigList = LIZ2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1600753139:
                        if (!LJJ.equals("live_native_gecko_enter_room_res_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ3 = C65412Plo.LIZ(this.LIZ, reader, BarrageEnterRoomResConfig.class);
                            o.LJI(LIZ3);
                            userLevelConfig.barrageEnterRoomConfigList = LIZ3;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1679178197:
                        if (!LJJ.equals("live_native_avatar_source_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ4 = C65412Plo.LIZ(this.LIZ, reader, GiftPanelAnimatorConfig.class);
                            o.LJI(LIZ4);
                            userLevelConfig.giftPanelAnimatorConfig = LIZ4;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return userLevelConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, UserLevelConfig userLevelConfig) {
        UserLevelConfig userLevelConfig2 = userLevelConfig;
        o.LJIIIZ(writer, "writer");
        if (userLevelConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_native_gecko_source_config");
        C65412Plo.LIZLLL(this.LIZ, writer, userLevelConfig2.barrageResConfigList, BarrageGradeResConfig.class);
        writer.LJI("live_native_gecko_enter_room_res_config");
        C65412Plo.LIZLLL(this.LIZ, writer, userLevelConfig2.barrageEnterRoomConfigList, BarrageEnterRoomResConfig.class);
        writer.LJI("user_level_dynamic_config");
        this.LIZ.LJIIJ(UserLevelDynamicConfig.class).write(writer, userLevelConfig2.userLevelDynamicConfig);
        writer.LJI("live_native_avatar_source_config");
        C65412Plo.LIZLLL(this.LIZ, writer, userLevelConfig2.giftPanelAnimatorConfig, GiftPanelAnimatorConfig.class);
        writer.LJI("fe_gecko_upgrade_animation_source_config");
        C65412Plo.LIZLLL(this.LIZ, writer, userLevelConfig2.feGeckoAnimationSourceConfigList, FeResourceChannelConfig.class);
        writer.LJI("lynx_urls");
        C65412Plo.LJ(this.LIZ, writer, userLevelConfig2.revenueUserLevelLynxUrls, String.class);
        writer.LJFF();
    }
}
