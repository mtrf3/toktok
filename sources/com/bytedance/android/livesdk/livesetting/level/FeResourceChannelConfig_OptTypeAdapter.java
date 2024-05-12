package com.bytedance.android.livesdk.livesetting.level;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FeResourceChannelConfig_OptTypeAdapter extends TypeAdapter<FeResourceChannelConfig> {
    public FeResourceChannelConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final FeResourceChannelConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        FeResourceChannelConfig feResourceChannelConfig = new FeResourceChannelConfig(0, 0, null, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -241235735) {
                    if (hashCode != -81305529) {
                        if (hashCode == 531242839 && LJJ.equals("min_level")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                feResourceChannelConfig.minLevel = reader.LJIJI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("channel_name")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            feResourceChannelConfig.feChannelName = reader.LJJIIZI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("max_level")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        feResourceChannelConfig.maxLevel = reader.LJIJI();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return feResourceChannelConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, FeResourceChannelConfig feResourceChannelConfig) {
        FeResourceChannelConfig feResourceChannelConfig2 = feResourceChannelConfig;
        o.LJIIIZ(writer, "writer");
        if (feResourceChannelConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("min_level");
        C79062V1e.LJFF(feResourceChannelConfig2.minLevel, writer, "max_level");
        C79062V1e.LJFF(feResourceChannelConfig2.maxLevel, writer, "channel_name");
        writer.LJJ(feResourceChannelConfig2.feChannelName);
        writer.LJFF();
    }
}
