package com.bytedance.android.live.broadcast.setting;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class MobileHighPingOptimizeConfig_OptTypeAdapter extends TypeAdapter<MobileHighPingOptimizeConfig> {
    public MobileHighPingOptimizeConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final MobileHighPingOptimizeConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MobileHighPingOptimizeConfig mobileHighPingOptimizeConfig = new MobileHighPingOptimizeConfig(0, 0, 0, 0.0f, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1704969391:
                        if (!LJJ.equals("high_ping_tips_trigger_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileHighPingOptimizeConfig.setHigh_ping_tips_trigger_count(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1053092063:
                        if (!LJJ.equals("high_ping_value")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileHighPingOptimizeConfig.setHigh_ping_value(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -83347593:
                        if (!LJJ.equals("ping_confidence")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileHighPingOptimizeConfig.setPing_confidence((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 50880072:
                        if (!LJJ.equals("valid_high_ping_reference_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            mobileHighPingOptimizeConfig.setValid_high_ping_reference_count(reader.LJIJI());
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
        return mobileHighPingOptimizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MobileHighPingOptimizeConfig mobileHighPingOptimizeConfig) {
        MobileHighPingOptimizeConfig mobileHighPingOptimizeConfig2 = mobileHighPingOptimizeConfig;
        o.LJIIIZ(writer, "writer");
        if (mobileHighPingOptimizeConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("valid_high_ping_reference_count");
        writer.LJIJJ(Integer.valueOf(mobileHighPingOptimizeConfig2.getValid_high_ping_reference_count()));
        writer.LJI("high_ping_tips_trigger_count");
        writer.LJIJJ(Integer.valueOf(mobileHighPingOptimizeConfig2.getHigh_ping_tips_trigger_count()));
        writer.LJI("high_ping_value");
        writer.LJIJJ(Integer.valueOf(mobileHighPingOptimizeConfig2.getHigh_ping_value()));
        writer.LJI("ping_confidence");
        writer.LJIJJ(Float.valueOf(mobileHighPingOptimizeConfig2.getPing_confidence()));
        writer.LJFF();
    }
}
