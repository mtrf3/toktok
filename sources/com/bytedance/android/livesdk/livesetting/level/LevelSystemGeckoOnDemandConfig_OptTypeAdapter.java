package com.bytedance.android.livesdk.livesetting.level;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LevelSystemGeckoOnDemandConfig_OptTypeAdapter extends TypeAdapter<LevelSystemGeckoOnDemandConfig> {
    public final Gson LIZ;

    public LevelSystemGeckoOnDemandConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LevelSystemGeckoOnDemandConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LevelSystemGeckoOnDemandConfig levelSystemGeckoOnDemandConfig = new LevelSystemGeckoOnDemandConfig(0, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "delay_time")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    levelSystemGeckoOnDemandConfig.delayTime = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "channel_list")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                    o.LJI(LIZ);
                    levelSystemGeckoOnDemandConfig.onDemandChannelList = LIZ;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return levelSystemGeckoOnDemandConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LevelSystemGeckoOnDemandConfig levelSystemGeckoOnDemandConfig) {
        LevelSystemGeckoOnDemandConfig levelSystemGeckoOnDemandConfig2 = levelSystemGeckoOnDemandConfig;
        o.LJIIIZ(writer, "writer");
        if (levelSystemGeckoOnDemandConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("delay_time");
        C79062V1e.LJFF(levelSystemGeckoOnDemandConfig2.delayTime, writer, "channel_list");
        C65412Plo.LIZLLL(this.LIZ, writer, levelSystemGeckoOnDemandConfig2.onDemandChannelList, String.class);
        writer.LJFF();
    }
}
