package com.bytedance.android.live.broadcast.setting;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class MobileHighPingAdjustBitrateConfig_OptTypeAdapter extends TypeAdapter<MobileHighPingAdjustBitrateConfig> {
    public MobileHighPingAdjustBitrateConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final MobileHighPingAdjustBitrateConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MobileHighPingAdjustBitrateConfig mobileHighPingAdjustBitrateConfig = new MobileHighPingAdjustBitrateConfig(0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 127, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1667989983:
                        if (!LJJ.equals("high_ping_limit_bitrate_allow_range")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileHighPingAdjustBitrateConfig.setHigh_ping_limit_bitrate_allow_range((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1406099806:
                        if (!LJJ.equals("high_ping_adjust_bitrate_scope")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileHighPingAdjustBitrateConfig.setHigh_ping_adjust_bitrate_scope(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -395467072:
                        if (!LJJ.equals("high_ping_adjust_bitrate_trigger_continue_high_ping_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileHighPingAdjustBitrateConfig.setHigh_ping_adjust_bitrate_trigger_continue_high_ping_count(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -83347593:
                        if (!LJJ.equals("ping_confidence")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileHighPingAdjustBitrateConfig.setPing_confidence((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1147082852:
                        if (!LJJ.equals("ping_value")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileHighPingAdjustBitrateConfig.setPing_value(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1151645908:
                        if (!LJJ.equals("high_ping_adjust_bitrate_trigger_continue_not_high_ping_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileHighPingAdjustBitrateConfig.setHigh_ping_adjust_bitrate_trigger_continue_not_high_ping_count(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1360109826:
                        if (!LJJ.equals("high_ping_adjust_bitrate_decline_range")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileHighPingAdjustBitrateConfig.setHigh_ping_adjust_bitrate_decline_range((float) reader.LJIJ());
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
        return mobileHighPingAdjustBitrateConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MobileHighPingAdjustBitrateConfig mobileHighPingAdjustBitrateConfig) {
        MobileHighPingAdjustBitrateConfig mobileHighPingAdjustBitrateConfig2 = mobileHighPingAdjustBitrateConfig;
        o.LJIIIZ(writer, "writer");
        if (mobileHighPingAdjustBitrateConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("high_ping_adjust_bitrate_scope");
        writer.LJIJJ(Integer.valueOf(mobileHighPingAdjustBitrateConfig2.getHigh_ping_adjust_bitrate_scope()));
        writer.LJI("high_ping_adjust_bitrate_trigger_continue_high_ping_count");
        writer.LJIJJ(Integer.valueOf(mobileHighPingAdjustBitrateConfig2.getHigh_ping_adjust_bitrate_trigger_continue_high_ping_count()));
        writer.LJI("high_ping_adjust_bitrate_trigger_continue_not_high_ping_count");
        writer.LJIJJ(Integer.valueOf(mobileHighPingAdjustBitrateConfig2.getHigh_ping_adjust_bitrate_trigger_continue_not_high_ping_count()));
        writer.LJI("ping_value");
        writer.LJIJJ(Integer.valueOf(mobileHighPingAdjustBitrateConfig2.getPing_value()));
        writer.LJI("ping_confidence");
        writer.LJIJJ(Float.valueOf(mobileHighPingAdjustBitrateConfig2.getPing_confidence()));
        writer.LJI("high_ping_adjust_bitrate_decline_range");
        writer.LJIJJ(Float.valueOf(mobileHighPingAdjustBitrateConfig2.getHigh_ping_adjust_bitrate_decline_range()));
        writer.LJI("high_ping_limit_bitrate_allow_range");
        writer.LJIJJ(Float.valueOf(mobileHighPingAdjustBitrateConfig2.getHigh_ping_limit_bitrate_allow_range()));
        writer.LJFF();
    }
}
