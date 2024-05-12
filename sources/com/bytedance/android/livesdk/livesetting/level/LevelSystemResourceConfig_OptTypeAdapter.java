package com.bytedance.android.livesdk.livesetting.level;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LevelSystemResourceConfig_OptTypeAdapter extends TypeAdapter<LevelSystemResourceConfig> {
    public final Gson LIZ;

    public LevelSystemResourceConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LevelSystemResourceConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LevelSystemResourceConfig levelSystemResourceConfig = new LevelSystemResourceConfig(0, null, null, null, null, null, 63, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1880544901:
                        if (!LJJ.equals("user_level_native_gecko_source_video_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, BarrageGradeResConfig.class);
                            o.LJI(LIZ);
                            levelSystemResourceConfig.levelBarrageResConfigList = LIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1677757599:
                        if (!LJJ.equals("gecko_ondemand_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            levelSystemResourceConfig.geckoOnDemandConfig = (LevelSystemGeckoOnDemandConfig) this.LIZ.LJIIJ(LevelSystemGeckoOnDemandConfig.class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1039270423:
                        if (!LJJ.equals("fans_gecko_enter_room_res_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, BarrageEnterRoomResConfig.class);
                            o.LJI(LIZ2);
                            levelSystemResourceConfig.fansBarrageEnterRoomConfigList = LIZ2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -524799059:
                        if (!LJJ.equals("level_gecko_enter_room_res_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ3 = C65412Plo.LIZ(this.LIZ, reader, BarrageEnterRoomResConfig.class);
                            o.LJI(LIZ3);
                            levelSystemResourceConfig.levelBarrageEnterRoomConfigList = LIZ3;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -416978430:
                        if (!LJJ.equals("barrage_effect_strategy")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            levelSystemResourceConfig.effectStrategy = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -179487146:
                        if (!LJJ.equals("fans_club_native_gecko_source_video_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ4 = C65412Plo.LIZ(this.LIZ, reader, BarrageGradeResConfig.class);
                            o.LJI(LIZ4);
                            levelSystemResourceConfig.fansBarrageResConfigList = LIZ4;
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
        return levelSystemResourceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LevelSystemResourceConfig levelSystemResourceConfig) {
        LevelSystemResourceConfig levelSystemResourceConfig2 = levelSystemResourceConfig;
        o.LJIIIZ(writer, "writer");
        if (levelSystemResourceConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("barrage_effect_strategy");
        C79062V1e.LJFF(levelSystemResourceConfig2.effectStrategy, writer, "user_level_native_gecko_source_video_config");
        C65412Plo.LIZLLL(this.LIZ, writer, levelSystemResourceConfig2.levelBarrageResConfigList, BarrageGradeResConfig.class);
        writer.LJI("fans_club_native_gecko_source_video_config");
        C65412Plo.LIZLLL(this.LIZ, writer, levelSystemResourceConfig2.fansBarrageResConfigList, BarrageGradeResConfig.class);
        writer.LJI("level_gecko_enter_room_res_config");
        C65412Plo.LIZLLL(this.LIZ, writer, levelSystemResourceConfig2.levelBarrageEnterRoomConfigList, BarrageEnterRoomResConfig.class);
        writer.LJI("fans_gecko_enter_room_res_config");
        C65412Plo.LIZLLL(this.LIZ, writer, levelSystemResourceConfig2.fansBarrageEnterRoomConfigList, BarrageEnterRoomResConfig.class);
        writer.LJI("gecko_ondemand_config");
        this.LIZ.LJIIJ(LevelSystemGeckoOnDemandConfig.class).write(writer, levelSystemResourceConfig2.geckoOnDemandConfig);
        writer.LJFF();
    }
}
