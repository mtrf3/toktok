package com.bytedance.android.livesdk.livesetting.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveTooltipDebugConfig_OptTypeAdapter extends TypeAdapter<LiveTooltipDebugConfig> {
    public final Gson LIZ;

    public LiveTooltipDebugConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveTooltipDebugConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveTooltipDebugConfig liveTooltipDebugConfig = new LiveTooltipDebugConfig(false, false, 0, 0, false, 31, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -371983287:
                        if (!LJJ.equals("bubble_frequence_control_daily_limit")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTooltipDebugConfig.setDailyLimit(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -57066551:
                        if (!LJJ.equals("bubble_frequence_control_outdate_version")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTooltipDebugConfig.setOutdateVersion(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 352905697:
                        if (!LJJ.equals("bubble_frequency_control_position")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTooltipDebugConfig.setPositionCheck(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 539231266:
                        if (!LJJ.equals("bubble_frequency_control_all_close")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTooltipDebugConfig.setAllClose(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1652398823:
                        if (!LJJ.equals("bubble_change_color")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTooltipDebugConfig.setChangeColor(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
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
        return liveTooltipDebugConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveTooltipDebugConfig liveTooltipDebugConfig) {
        LiveTooltipDebugConfig liveTooltipDebugConfig2 = liveTooltipDebugConfig;
        o.LJIIIZ(writer, "writer");
        if (liveTooltipDebugConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("bubble_change_color");
        writer.LJJIII(liveTooltipDebugConfig2.getChangeColor());
        writer.LJI("bubble_frequency_control_all_close");
        writer.LJJIII(liveTooltipDebugConfig2.getAllClose());
        writer.LJI("bubble_frequence_control_daily_limit");
        writer.LJIJJ(Integer.valueOf(liveTooltipDebugConfig2.getDailyLimit()));
        writer.LJI("bubble_frequence_control_outdate_version");
        writer.LJIJJ(Integer.valueOf(liveTooltipDebugConfig2.getOutdateVersion()));
        writer.LJI("bubble_frequency_control_position");
        writer.LJJIII(liveTooltipDebugConfig2.getPositionCheck());
        writer.LJFF();
    }
}
