package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DelayWidgetLoadConfig_OptTypeAdapter extends TypeAdapter<DelayWidgetLoadConfig> {
    public final Gson LIZ;

    public DelayWidgetLoadConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final DelayWidgetLoadConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        DelayWidgetLoadConfig delayWidgetLoadConfig = new DelayWidgetLoadConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2136561803:
                        if (!LJJ.equals("delay_time_gift_in_second")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            delayWidgetLoadConfig.delayTimeGiftInSecond = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1358769209:
                        if (!LJJ.equals("enable_delay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            delayWidgetLoadConfig.enableDelay = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -900653032:
                        if (!LJJ.equals("delay_time_in_second")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            delayWidgetLoadConfig.delayTimeInSecond = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1460492572:
                        if (!LJJ.equals("delay_time_like_in_second")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            delayWidgetLoadConfig.delayTimeLikeInSecond = reader.LJIJI();
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
        return delayWidgetLoadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, DelayWidgetLoadConfig delayWidgetLoadConfig) {
        DelayWidgetLoadConfig delayWidgetLoadConfig2 = delayWidgetLoadConfig;
        o.LJIIIZ(writer, "writer");
        if (delayWidgetLoadConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_delay");
        writer.LJJIII(delayWidgetLoadConfig2.enableDelay);
        writer.LJI("delay_time_in_second");
        C79062V1e.LJFF(delayWidgetLoadConfig2.delayTimeInSecond, writer, "delay_time_gift_in_second");
        C79062V1e.LJFF(delayWidgetLoadConfig2.delayTimeGiftInSecond, writer, "delay_time_like_in_second");
        C77339UWx.LJFF(delayWidgetLoadConfig2.delayTimeLikeInSecond, writer);
    }
}
