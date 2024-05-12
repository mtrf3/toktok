package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class NativeTriggerConfig_OptTypeAdapter extends TypeAdapter<NativeTriggerConfig> {
    public final Gson LIZ;

    public NativeTriggerConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final NativeTriggerConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        NativeTriggerConfig nativeTriggerConfig = new NativeTriggerConfig(null, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "trigger_type_disable_list")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                    o.LJI(LIZ);
                    nativeTriggerConfig.triggerTypeDisableList = LIZ;
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "enable_pitaya_filter_list")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, String.class);
                    o.LJI(LIZ2);
                    nativeTriggerConfig.enablePitayaFilterList = LIZ2;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return nativeTriggerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, NativeTriggerConfig nativeTriggerConfig) {
        NativeTriggerConfig nativeTriggerConfig2 = nativeTriggerConfig;
        o.LJIIIZ(writer, "writer");
        if (nativeTriggerConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("trigger_type_disable_list");
        C65412Plo.LIZLLL(this.LIZ, writer, nativeTriggerConfig2.triggerTypeDisableList, String.class);
        writer.LJI("enable_pitaya_filter_list");
        C65412Plo.LIZLLL(this.LIZ, writer, nativeTriggerConfig2.enablePitayaFilterList, String.class);
        writer.LJFF();
    }
}
