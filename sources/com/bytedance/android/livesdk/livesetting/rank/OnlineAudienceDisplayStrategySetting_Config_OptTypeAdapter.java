package com.bytedance.android.livesdk.livesetting.rank;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceDisplayStrategySetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class OnlineAudienceDisplayStrategySetting_Config_OptTypeAdapter extends TypeAdapter<OnlineAudienceDisplayStrategySetting.Config> {
    public final Gson LIZ;

    public OnlineAudienceDisplayStrategySetting_Config_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final OnlineAudienceDisplayStrategySetting.Config read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        OnlineAudienceDisplayStrategySetting.Config config = new OnlineAudienceDisplayStrategySetting.Config(false, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "online_audience_display_strategy_on")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    config.useOnlineDisplayStrategy = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "online_audience_display_number")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    config.displayNumberN = reader.LJIJI();
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
    public final void write(C65403Plf writer, OnlineAudienceDisplayStrategySetting.Config config) {
        OnlineAudienceDisplayStrategySetting.Config config2 = config;
        o.LJIIIZ(writer, "writer");
        if (config2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("online_audience_display_strategy_on");
        writer.LJJIII(config2.useOnlineDisplayStrategy);
        writer.LJI("online_audience_display_number");
        C77339UWx.LJFF(config2.displayNumberN, writer);
    }
}
