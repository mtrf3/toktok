package com.bytedance.android.livesdk.config;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGameFloatMsgPanelConfig_OptTypeAdapter extends TypeAdapter<LiveGameFloatMsgPanelConfig> {
    public LiveGameFloatMsgPanelConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGameFloatMsgPanelConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveGameFloatMsgPanelConfig liveGameFloatMsgPanelConfig = new LiveGameFloatMsgPanelConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2146691842:
                        if (!LJJ.equals("show_max_size")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGameFloatMsgPanelConfig.showMaxSize = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -838788974:
                        if (!LJJ.equals("duplicated_check_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGameFloatMsgPanelConfig.duplicatedCheckCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 130195102:
                        if (!LJJ.equals("duplicated_check_period")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGameFloatMsgPanelConfig.duplicatedCheckPeriod = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 224703761:
                        if (!LJJ.equals("freq_limit_unhot_room")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGameFloatMsgPanelConfig.freqLimitUnHotRoom = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1388957240:
                        if (!LJJ.equals("freq_limit_hot_room")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGameFloatMsgPanelConfig.freqLimitHotRoom = reader.LJIJI();
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
        return liveGameFloatMsgPanelConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveGameFloatMsgPanelConfig liveGameFloatMsgPanelConfig) {
        LiveGameFloatMsgPanelConfig liveGameFloatMsgPanelConfig2 = liveGameFloatMsgPanelConfig;
        o.LJIIIZ(writer, "writer");
        if (liveGameFloatMsgPanelConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("show_max_size");
        C79062V1e.LJFF(liveGameFloatMsgPanelConfig2.showMaxSize, writer, "freq_limit_hot_room");
        C79062V1e.LJFF(liveGameFloatMsgPanelConfig2.freqLimitHotRoom, writer, "freq_limit_unhot_room");
        C79062V1e.LJFF(liveGameFloatMsgPanelConfig2.freqLimitUnHotRoom, writer, "duplicated_check_period");
        writer.LJIJ(liveGameFloatMsgPanelConfig2.duplicatedCheckPeriod);
        writer.LJI("duplicated_check_count");
        C77339UWx.LJFF(liveGameFloatMsgPanelConfig2.duplicatedCheckCount, writer);
    }
}
