package com.bytedance.android.livesdk.livesetting.level;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FansClubDynamicConfig_OptTypeAdapter extends TypeAdapter<FansClubDynamicConfig> {
    public final Gson LIZ;

    public FansClubDynamicConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FansClubDynamicConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        FansClubDynamicConfig fansClubDynamicConfig = new FansClubDynamicConfig(0, false, 0L, 0, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1171660567:
                        if (!LJJ.equals("play_guide_anim_delay_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            fansClubDynamicConfig.playGuideAnimDelayTime = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 437961099:
                        if (!LJJ.equals("min_barrage_grade")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            fansClubDynamicConfig.minBarrageGrade = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 812430664:
                        if (!LJJ.equals("badge_span_factor")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            fansClubDynamicConfig.badgeMarginSpanFactor = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1102866849:
                        if (!LJJ.equals("enable_fast_follow_by_fans")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            fansClubDynamicConfig.enableFastFollowByFansLevel = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return fansClubDynamicConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, FansClubDynamicConfig fansClubDynamicConfig) {
        FansClubDynamicConfig fansClubDynamicConfig2 = fansClubDynamicConfig;
        o.LJIIIZ(writer, "writer");
        if (fansClubDynamicConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("min_barrage_grade");
        C79062V1e.LJFF(fansClubDynamicConfig2.minBarrageGrade, writer, "enable_fast_follow_by_fans");
        writer.LJJIII(fansClubDynamicConfig2.enableFastFollowByFansLevel);
        writer.LJI("play_guide_anim_delay_time");
        writer.LJIJ(fansClubDynamicConfig2.playGuideAnimDelayTime);
        writer.LJI("badge_span_factor");
        C77339UWx.LJFF(fansClubDynamicConfig2.badgeMarginSpanFactor, writer);
    }
}
