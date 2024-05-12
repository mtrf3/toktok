package com.bytedance.android.livesdk.rank.api;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.rank.api.LiveRankTypeConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveRankTypeConfig_Config_OptTypeAdapter extends TypeAdapter<LiveRankTypeConfig.Config> {
    public final Gson LIZ;

    public LiveRankTypeConfig_Config_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRankTypeConfig.Config read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveRankTypeConfig.Config config = new LiveRankTypeConfig.Config(null, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "rank_types")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, RankTypeV2.class);
                    o.LJI(LIZ);
                    config.rankTypeList = LIZ;
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
    public final void write(C65403Plf writer, LiveRankTypeConfig.Config config) {
        LiveRankTypeConfig.Config config2 = config;
        o.LJIIIZ(writer, "writer");
        if (config2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("rank_types");
        C65412Plo.LIZLLL(this.LIZ, writer, config2.rankTypeList, RankTypeV2.class);
        writer.LJFF();
    }
}
