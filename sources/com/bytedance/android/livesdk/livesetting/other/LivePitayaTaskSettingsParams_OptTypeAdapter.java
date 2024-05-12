package com.bytedance.android.livesdk.livesetting.other;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LivePitayaTaskSettingsParams_OptTypeAdapter extends TypeAdapter<LivePitayaTaskSettingsParams> {
    public LivePitayaTaskSettingsParams_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePitayaTaskSettingsParams read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LivePitayaTaskSettingsParams livePitayaTaskSettingsParams = new LivePitayaTaskSettingsParams(0L, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "task_execution_period")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    livePitayaTaskSettingsParams.period = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return livePitayaTaskSettingsParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LivePitayaTaskSettingsParams livePitayaTaskSettingsParams) {
        LivePitayaTaskSettingsParams livePitayaTaskSettingsParams2 = livePitayaTaskSettingsParams;
        o.LJIIIZ(writer, "writer");
        if (livePitayaTaskSettingsParams2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("task_execution_period");
        writer.LJIJ(livePitayaTaskSettingsParams2.period);
        writer.LJFF();
    }
}
