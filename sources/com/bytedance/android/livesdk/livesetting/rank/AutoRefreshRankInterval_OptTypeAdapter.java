package com.bytedance.android.livesdk.livesetting.rank;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AutoRefreshRankInterval_OptTypeAdapter extends TypeAdapter<AutoRefreshRankInterval> {
    public AutoRefreshRankInterval_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final AutoRefreshRankInterval read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        AutoRefreshRankInterval autoRefreshRankInterval = new AutoRefreshRankInterval(0, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "hourly_ranklist_interval")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    autoRefreshRankInterval.hourly_rank = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "weekly_ranklist_interval")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    autoRefreshRankInterval.weekly_rank = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return autoRefreshRankInterval;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, AutoRefreshRankInterval autoRefreshRankInterval) {
        AutoRefreshRankInterval autoRefreshRankInterval2 = autoRefreshRankInterval;
        o.LJIIIZ(writer, "writer");
        if (autoRefreshRankInterval2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("hourly_ranklist_interval");
        C79062V1e.LJFF(autoRefreshRankInterval2.hourly_rank, writer, "weekly_ranklist_interval");
        C77339UWx.LJFF(autoRefreshRankInterval2.weekly_rank, writer);
    }
}
