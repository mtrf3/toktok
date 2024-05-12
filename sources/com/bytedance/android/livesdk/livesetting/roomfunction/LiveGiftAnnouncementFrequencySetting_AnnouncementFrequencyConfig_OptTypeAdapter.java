package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveGiftAnnouncementFrequencySetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGiftAnnouncementFrequencySetting_AnnouncementFrequencyConfig_OptTypeAdapter extends TypeAdapter<LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig> {
    public final Gson LIZ;

    public LiveGiftAnnouncementFrequencySetting_AnnouncementFrequencyConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig announcementFrequencyConfig = new LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig(false, false, 0, 0, 0, 0.0f, 63, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1211256848:
                        if (!LJJ.equals("live_close_toggle_enabled")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            announcementFrequencyConfig.closeToggleEnabled = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -777377864:
                        if (!LJJ.equals("live_disable_min_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            announcementFrequencyConfig.disableMinCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 183273449:
                        if (!LJJ.equals("live_frequency_control_enabled")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            announcementFrequencyConfig.frequencyControlEnabled = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 258568985:
                        if (!LJJ.equals("live_frequency_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            announcementFrequencyConfig.frequencyCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 532379466:
                        if (!LJJ.equals("live_frequency_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            announcementFrequencyConfig.frequencyDuration = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 595951073:
                        if (!LJJ.equals("live_disable_ratio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            announcementFrequencyConfig.disableRatio = (float) reader.LJIJ();
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
        return announcementFrequencyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig announcementFrequencyConfig) {
        LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig announcementFrequencyConfig2 = announcementFrequencyConfig;
        o.LJIIIZ(writer, "writer");
        if (announcementFrequencyConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_close_toggle_enabled");
        writer.LJJIII(announcementFrequencyConfig2.closeToggleEnabled);
        writer.LJI("live_frequency_control_enabled");
        writer.LJJIII(announcementFrequencyConfig2.frequencyControlEnabled);
        writer.LJI("live_frequency_count");
        C79062V1e.LJFF(announcementFrequencyConfig2.frequencyCount, writer, "live_frequency_duration");
        C79062V1e.LJFF(announcementFrequencyConfig2.frequencyDuration, writer, "live_disable_min_count");
        C79062V1e.LJFF(announcementFrequencyConfig2.disableMinCount, writer, "live_disable_ratio");
        writer.LJIJJ(Float.valueOf(announcementFrequencyConfig2.disableRatio));
        writer.LJFF();
    }
}
