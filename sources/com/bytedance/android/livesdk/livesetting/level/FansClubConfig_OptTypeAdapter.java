package com.bytedance.android.livesdk.livesetting.level;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FansClubConfig_OptTypeAdapter extends TypeAdapter<FansClubConfig> {
    public final Gson LIZ;

    public FansClubConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FansClubConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        FansClubConfig fansClubConfig = new FansClubConfig(null, null, null, null, null, null, 63, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1808926756:
                        if (!LJJ.equals("live_native_entrance_gecko_source_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, FansEntranceResConfig.class);
                            o.LJI(LIZ);
                            fansClubConfig.fansEntranceGeckoConfigList = LIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -370116418:
                        if (!LJJ.equals("gecko_resource_download_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            fansClubConfig.geckoResourceDownloadConfig = (GeckoResourceDownloadConfig) this.LIZ.LJIIJ(GeckoResourceDownloadConfig.class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -157141268:
                        if (!LJJ.equals("fans_club_dynamic_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            fansClubConfig.fansClubDynamicConfig = (FansClubDynamicConfig) this.LIZ.LJIIJ(FansClubDynamicConfig.class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 411901234:
                        if (!LJJ.equals("fans_club_entrance_lottie_resource_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            fansClubConfig.fansClubLottieConfig = (FansClubLottieConfig) this.LIZ.LJIIJ(FansClubLottieConfig.class).read(reader);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1600753139:
                        if (!LJJ.equals("live_native_gecko_enter_room_res_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, BarrageEnterRoomResConfig.class);
                            o.LJI(LIZ2);
                            fansClubConfig.barrageEnterRoomConfigList = LIZ2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1767129276:
                        if (!LJJ.equals("live_native_barrage_gecko_source_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ3 = C65412Plo.LIZ(this.LIZ, reader, BarrageGradeResConfig.class);
                            o.LJI(LIZ3);
                            fansClubConfig.barrageResConfigList = LIZ3;
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
        return fansClubConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, FansClubConfig fansClubConfig) {
        FansClubConfig fansClubConfig2 = fansClubConfig;
        o.LJIIIZ(writer, "writer");
        if (fansClubConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_native_barrage_gecko_source_config");
        C65412Plo.LIZLLL(this.LIZ, writer, fansClubConfig2.barrageResConfigList, BarrageGradeResConfig.class);
        writer.LJI("fans_club_dynamic_config");
        this.LIZ.LJIIJ(FansClubDynamicConfig.class).write(writer, fansClubConfig2.fansClubDynamicConfig);
        writer.LJI("live_native_entrance_gecko_source_config");
        C65412Plo.LIZLLL(this.LIZ, writer, fansClubConfig2.fansEntranceGeckoConfigList, FansEntranceResConfig.class);
        writer.LJI("live_native_gecko_enter_room_res_config");
        C65412Plo.LIZLLL(this.LIZ, writer, fansClubConfig2.barrageEnterRoomConfigList, BarrageEnterRoomResConfig.class);
        writer.LJI("gecko_resource_download_config");
        this.LIZ.LJIIJ(GeckoResourceDownloadConfig.class).write(writer, fansClubConfig2.geckoResourceDownloadConfig);
        writer.LJI("fans_club_entrance_lottie_resource_config");
        this.LIZ.LJIIJ(FansClubLottieConfig.class).write(writer, fansClubConfig2.fansClubLottieConfig);
        writer.LJFF();
    }
}
