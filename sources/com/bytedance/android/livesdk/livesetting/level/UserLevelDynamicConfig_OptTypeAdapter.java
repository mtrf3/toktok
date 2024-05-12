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
public final class UserLevelDynamicConfig_OptTypeAdapter extends TypeAdapter<UserLevelDynamicConfig> {
    public final Gson LIZ;

    public UserLevelDynamicConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final UserLevelDynamicConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        UserLevelDynamicConfig userLevelDynamicConfig = new UserLevelDynamicConfig(0, false, 0, 0, 0, 31, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1321257702:
                        if (!LJJ.equals("fetch_fe_gecko_delay_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            userLevelDynamicConfig.fetchFeGeckoDelayTime = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1054839491:
                        if (!LJJ.equals("preload_badge_icon_delay_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            userLevelDynamicConfig.preloadBadgeIconDelayTime = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -109988834:
                        if (!LJJ.equals("enable_grade_barrage_ninepatch_scale")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            userLevelDynamicConfig.enableGradeNinePatchScale = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 437961099:
                        if (!LJJ.equals("min_barrage_grade")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            userLevelDynamicConfig.minBarrageGrade = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 861262350:
                        if (!LJJ.equals("fetch_client_gecko_delay_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            userLevelDynamicConfig.fetchNativeGeckoDelayTime = reader.LJIJI();
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
        return userLevelDynamicConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, UserLevelDynamicConfig userLevelDynamicConfig) {
        UserLevelDynamicConfig userLevelDynamicConfig2 = userLevelDynamicConfig;
        o.LJIIIZ(writer, "writer");
        if (userLevelDynamicConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("min_barrage_grade");
        C79062V1e.LJFF(userLevelDynamicConfig2.minBarrageGrade, writer, "enable_grade_barrage_ninepatch_scale");
        writer.LJJIII(userLevelDynamicConfig2.enableGradeNinePatchScale);
        writer.LJI("fetch_fe_gecko_delay_time");
        C79062V1e.LJFF(userLevelDynamicConfig2.fetchFeGeckoDelayTime, writer, "preload_badge_icon_delay_time");
        C79062V1e.LJFF(userLevelDynamicConfig2.preloadBadgeIconDelayTime, writer, "fetch_client_gecko_delay_time");
        C77339UWx.LJFF(userLevelDynamicConfig2.fetchNativeGeckoDelayTime, writer);
    }
}
