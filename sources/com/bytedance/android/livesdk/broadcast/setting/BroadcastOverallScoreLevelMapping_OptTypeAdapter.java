package com.bytedance.android.livesdk.broadcast.setting;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BroadcastOverallScoreLevelMapping_OptTypeAdapter extends TypeAdapter<BroadcastOverallScoreLevelMapping> {
    public BroadcastOverallScoreLevelMapping_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final BroadcastOverallScoreLevelMapping read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        BroadcastOverallScoreLevelMapping broadcastOverallScoreLevelMapping = new BroadcastOverallScoreLevelMapping(0.0f, 0.0f, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "low_end_device_max")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    broadcastOverallScoreLevelMapping.setLow_end_device_max((float) reader.LJIJ());
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "medium_end_device_max")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    broadcastOverallScoreLevelMapping.setMedium_end_device_max((float) reader.LJIJ());
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return broadcastOverallScoreLevelMapping;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, BroadcastOverallScoreLevelMapping broadcastOverallScoreLevelMapping) {
        BroadcastOverallScoreLevelMapping broadcastOverallScoreLevelMapping2 = broadcastOverallScoreLevelMapping;
        o.LJIIIZ(writer, "writer");
        if (broadcastOverallScoreLevelMapping2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("low_end_device_max");
        writer.LJIJJ(Float.valueOf(broadcastOverallScoreLevelMapping2.getLow_end_device_max()));
        writer.LJI("medium_end_device_max");
        writer.LJIJJ(Float.valueOf(broadcastOverallScoreLevelMapping2.getMedium_end_device_max()));
        writer.LJFF();
    }
}
