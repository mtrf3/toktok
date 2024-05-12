package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AutoTriggerConfig_OptTypeAdapter extends TypeAdapter<AutoTriggerConfig> {
    public AutoTriggerConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final AutoTriggerConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        AutoTriggerConfig autoTriggerConfig = new AutoTriggerConfig(0, 0, 0, null, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2124259664:
                        if (!LJJ.equals("delay_second")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            autoTriggerConfig.delaySecond = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -957038910:
                        if (!LJJ.equals("ignore_pitaya_package")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            autoTriggerConfig.ignorePitayaPackage = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -524622785:
                        if (!LJJ.equals("is_same_room")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            autoTriggerConfig.isSameRoom = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1940600304:
                        if (!LJJ.equals("default_trigger_name")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            autoTriggerConfig.defaultTriggerName = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return autoTriggerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, AutoTriggerConfig autoTriggerConfig) {
        AutoTriggerConfig autoTriggerConfig2 = autoTriggerConfig;
        o.LJIIIZ(writer, "writer");
        if (autoTriggerConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("delay_second");
        C79062V1e.LJFF(autoTriggerConfig2.delaySecond, writer, "is_same_room");
        C79062V1e.LJFF(autoTriggerConfig2.isSameRoom, writer, "ignore_pitaya_package");
        C79062V1e.LJFF(autoTriggerConfig2.ignorePitayaPackage, writer, "default_trigger_name");
        writer.LJJ(autoTriggerConfig2.defaultTriggerName);
        writer.LJFF();
    }
}
