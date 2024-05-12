package com.bytedance.android.livesdk.livesetting.other;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveOhrConfig_OptTypeAdapter extends TypeAdapter<LiveOhrConfig> {
    public final Gson LIZ;

    public LiveOhrConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveOhrConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveOhrConfig liveOhrConfig = new LiveOhrConfig(false, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "ohr_predict_enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveOhrConfig.ohrPredictEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveOhrConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveOhrConfig liveOhrConfig) {
        LiveOhrConfig liveOhrConfig2 = liveOhrConfig;
        o.LJIIIZ(writer, "writer");
        if (liveOhrConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("ohr_predict_enable");
        writer.LJJIII(liveOhrConfig2.ohrPredictEnable);
        writer.LJFF();
    }
}
