package com.bytedance.android.livesdk.rank.api;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.rank.api.LiveRankLynxConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveRankLynxConfig_Config_OptTypeAdapter extends TypeAdapter<LiveRankLynxConfig.Config> {
    public final Gson LIZ;

    public LiveRankLynxConfig_Config_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRankLynxConfig.Config read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveRankLynxConfig.Config config = new LiveRankLynxConfig.Config(null, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "rank_schema_config_list")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    Object read = this.LIZ.LJIIIZ(new TypeToken<HashMap<Integer, HashMap<Long, String>>>() { // from class: X.2Sv
                    }).read(reader);
                    o.LJIIIIZZ(read, "gson.getAdapter(token).read(reader)");
                    config.rankSchemaConfigList = (HashMap) read;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveRankLynxConfig.Config config) {
        LiveRankLynxConfig.Config config2 = config;
        o.LJIIIZ(writer, "writer");
        if (config2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("rank_schema_config_list");
        this.LIZ.LJIIIZ(new TypeToken<HashMap<Integer, HashMap<Long, String>>>() { // from class: X.2Sw
        }).write(writer, config2.rankSchemaConfigList);
        writer.LJFF();
    }
}
