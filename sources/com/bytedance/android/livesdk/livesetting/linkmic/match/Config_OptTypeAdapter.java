package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class Config_OptTypeAdapter extends TypeAdapter<Config> {
    public final Gson LIZ;

    public Config_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final Config read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        Config config = new Config(false, false, 0L, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1020927695) {
                    if (hashCode != -580983637) {
                        if (hashCode == -193115697 && LJJ.equals("live_match_half_rtt_limit")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                config.live_match_half_rtt_limit = reader.LJIJJ();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("live_match_start_time_opt")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            config.live_match_start_time_opt = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("live_match_start_time_anchor_opt")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        config.live_match_start_time_anchor_opt = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, Config config) {
        Config config2 = config;
        o.LJIIIZ(writer, "writer");
        if (config2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_match_start_time_opt");
        writer.LJJIII(config2.live_match_start_time_opt);
        writer.LJI("live_match_start_time_anchor_opt");
        writer.LJJIII(config2.live_match_start_time_anchor_opt);
        writer.LJI("live_match_half_rtt_limit");
        writer.LJIJ(config2.live_match_half_rtt_limit);
        writer.LJFF();
    }
}
