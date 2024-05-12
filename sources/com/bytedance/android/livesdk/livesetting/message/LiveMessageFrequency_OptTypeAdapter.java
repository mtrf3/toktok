package com.bytedance.android.livesdk.livesetting.message;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessageFrequency_OptTypeAdapter extends TypeAdapter<LiveMessageFrequency> {
    public LiveMessageFrequency_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessageFrequency read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMessageFrequency liveMessageFrequency = new LiveMessageFrequency(0L, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "frequency_time_ms")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveMessageFrequency.setFrequencyTimeMs(reader.LJIJJ());
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "frequency_count")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveMessageFrequency.setFrequencyCount(reader.LJIJJ());
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveMessageFrequency;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMessageFrequency liveMessageFrequency) {
        LiveMessageFrequency liveMessageFrequency2 = liveMessageFrequency;
        o.LJIIIZ(writer, "writer");
        if (liveMessageFrequency2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("frequency_time_ms");
        writer.LJIJ(liveMessageFrequency2.getFrequencyTimeMs());
        writer.LJI("frequency_count");
        writer.LJIJ(liveMessageFrequency2.getFrequencyCount());
        writer.LJFF();
    }
}
