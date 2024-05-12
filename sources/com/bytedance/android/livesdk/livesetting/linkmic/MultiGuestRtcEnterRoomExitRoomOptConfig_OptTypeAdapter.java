package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MultiGuestRtcEnterRoomExitRoomOptConfig_OptTypeAdapter extends TypeAdapter<MultiGuestRtcEnterRoomExitRoomOptConfig> {
    public MultiGuestRtcEnterRoomExitRoomOptConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestRtcEnterRoomExitRoomOptConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MultiGuestRtcEnterRoomExitRoomOptConfig multiGuestRtcEnterRoomExitRoomOptConfig = new MultiGuestRtcEnterRoomExitRoomOptConfig(0L, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "linkmic_auto_stop_rtc_duration_threshold_1")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    multiGuestRtcEnterRoomExitRoomOptConfig.stopDurationThreshold1 = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "linkmic_auto_stop_rtc_duration_threshold_2")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    multiGuestRtcEnterRoomExitRoomOptConfig.stopDurationThreshold2 = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return multiGuestRtcEnterRoomExitRoomOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MultiGuestRtcEnterRoomExitRoomOptConfig multiGuestRtcEnterRoomExitRoomOptConfig) {
        MultiGuestRtcEnterRoomExitRoomOptConfig multiGuestRtcEnterRoomExitRoomOptConfig2 = multiGuestRtcEnterRoomExitRoomOptConfig;
        o.LJIIIZ(writer, "writer");
        if (multiGuestRtcEnterRoomExitRoomOptConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("linkmic_auto_stop_rtc_duration_threshold_1");
        writer.LJIJ(multiGuestRtcEnterRoomExitRoomOptConfig2.stopDurationThreshold1);
        writer.LJI("linkmic_auto_stop_rtc_duration_threshold_2");
        writer.LJIJ(multiGuestRtcEnterRoomExitRoomOptConfig2.stopDurationThreshold2);
        writer.LJFF();
    }
}
