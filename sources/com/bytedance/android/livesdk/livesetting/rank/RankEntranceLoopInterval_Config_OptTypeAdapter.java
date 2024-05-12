package com.bytedance.android.livesdk.livesetting.rank;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceLoopInterval;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RankEntranceLoopInterval_Config_OptTypeAdapter extends TypeAdapter<RankEntranceLoopInterval.Config> {
    public RankEntranceLoopInterval_Config_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final RankEntranceLoopInterval.Config read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        RankEntranceLoopInterval.Config config = new RankEntranceLoopInterval.Config(0L, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "on_rank_loop_interval")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    config.onRankLoopInterval = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "off_rank_loop_interval")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    config.offRankLoopInterval = reader.LJIJJ();
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
    public final void write(C65403Plf writer, RankEntranceLoopInterval.Config config) {
        RankEntranceLoopInterval.Config config2 = config;
        o.LJIIIZ(writer, "writer");
        if (config2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("on_rank_loop_interval");
        writer.LJIJ(config2.onRankLoopInterval);
        writer.LJI("off_rank_loop_interval");
        writer.LJIJ(config2.offRankLoopInterval);
        writer.LJFF();
    }
}
