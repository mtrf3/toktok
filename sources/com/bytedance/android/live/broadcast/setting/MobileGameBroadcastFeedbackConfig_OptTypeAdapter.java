package com.bytedance.android.live.broadcast.setting;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class MobileGameBroadcastFeedbackConfig_OptTypeAdapter extends TypeAdapter<MobileGameBroadcastFeedbackConfig> {
    public MobileGameBroadcastFeedbackConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final MobileGameBroadcastFeedbackConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MobileGameBroadcastFeedbackConfig mobileGameBroadcastFeedbackConfig = new MobileGameBroadcastFeedbackConfig(0, 0, 0, 0.0f, 0.0f, 0, 0.0f, 0, 0.0f, 0, 0, 0, 0.0f, 0, 0, 0, 65535, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1466780022:
                        if (!LJJ.equals("ping_high_proportion")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setPing_high_proportion((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1209875265:
                        if (!LJJ.equals("rtt_lasting")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setRtt_lasting(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1109450514:
                        if (!LJJ.equals("power_save_mode_proportion")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setPower_save_mode_proportion((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -917477108:
                        if (!LJJ.equals("real_bitrate_less_min_lasting")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setReal_bitrate_less_min_lasting(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -459983649:
                        if (!LJJ.equals("power_low_proportion")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setPower_low_proportion((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -193804810:
                        if (!LJJ.equals("battery_temp_android")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setBattery_temp_android(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 100373934:
                        if (!LJJ.equals("rtt_size")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setRtt_size(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 278363928:
                        if (!LJJ.equals("real_fps_size")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setReal_fps_size(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 486258289:
                        if (!LJJ.equals("real_fps_proportion")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setReal_fps_proportion((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 620528915:
                        if (!LJJ.equals("battery_temp_lasting")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setBattery_temp_lasting(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 845500698:
                        if (!LJJ.equals("power_low")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setPower_low(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 989278902:
                        if (!LJJ.equals("ping_number")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setPing_number(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1147082852:
                        if (!LJJ.equals("ping_value")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setPing_value(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1300392725:
                        if (!LJJ.equals("real_fps_lasting")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setReal_fps_lasting(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1702945050:
                        if (!LJJ.equals("real_bitrate_less_min_proportion")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setReal_bitrate_less_min_proportion((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2111354457:
                        if (!LJJ.equals("livecore_data_sample_interval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileGameBroadcastFeedbackConfig.setLivecore_data_sample_interval(reader.LJIJI());
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
        return mobileGameBroadcastFeedbackConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MobileGameBroadcastFeedbackConfig mobileGameBroadcastFeedbackConfig) {
        MobileGameBroadcastFeedbackConfig mobileGameBroadcastFeedbackConfig2 = mobileGameBroadcastFeedbackConfig;
        o.LJIIIZ(writer, "writer");
        if (mobileGameBroadcastFeedbackConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("battery_temp_android");
        writer.LJIJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getBattery_temp_android()));
        writer.LJI("battery_temp_lasting");
        writer.LJIJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getBattery_temp_lasting()));
        writer.LJI("power_low");
        writer.LJIJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getPower_low()));
        writer.LJI("power_low_proportion");
        writer.LJIJJ(Float.valueOf(mobileGameBroadcastFeedbackConfig2.getPower_low_proportion()));
        writer.LJI("power_save_mode_proportion");
        writer.LJIJJ(Float.valueOf(mobileGameBroadcastFeedbackConfig2.getPower_save_mode_proportion()));
        writer.LJI("real_bitrate_less_min_lasting");
        writer.LJIJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getReal_bitrate_less_min_lasting()));
        writer.LJI("real_bitrate_less_min_proportion");
        writer.LJIJJ(Float.valueOf(mobileGameBroadcastFeedbackConfig2.getReal_bitrate_less_min_proportion()));
        writer.LJI("real_fps_lasting");
        writer.LJIJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getReal_fps_lasting()));
        writer.LJI("real_fps_proportion");
        writer.LJIJJ(Float.valueOf(mobileGameBroadcastFeedbackConfig2.getReal_fps_proportion()));
        writer.LJI("real_fps_size");
        writer.LJIJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getReal_fps_size()));
        writer.LJI("rtt_lasting");
        writer.LJIJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getRtt_lasting()));
        writer.LJI("rtt_size");
        writer.LJIJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getRtt_size()));
        writer.LJI("ping_high_proportion");
        writer.LJIJJ(Float.valueOf(mobileGameBroadcastFeedbackConfig2.getPing_high_proportion()));
        writer.LJI("ping_number");
        writer.LJIJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getPing_number()));
        writer.LJI("ping_value");
        writer.LJIJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getPing_value()));
        writer.LJI("livecore_data_sample_interval");
        writer.LJIJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getLivecore_data_sample_interval()));
        writer.LJFF();
    }
}
