package com.bytedance.android.livesdk.livesetting.rank;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGeckoSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class OnlineAudienceGeckoSetting_Config_OptTypeAdapter extends TypeAdapter<OnlineAudienceGeckoSetting.Config> {
    public final Gson LIZ;

    public OnlineAudienceGeckoSetting_Config_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final OnlineAudienceGeckoSetting.Config read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        OnlineAudienceGeckoSetting.Config config = new OnlineAudienceGeckoSetting.Config(false, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "is_audience_list_gecko_setting_on")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    config.isAudienceListGeckoSettingOn = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "audience_list_gecko_channel")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    config.audienceListGeckoChannel = LJJIIZI;
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
    public final void write(C65403Plf writer, OnlineAudienceGeckoSetting.Config config) {
        OnlineAudienceGeckoSetting.Config config2 = config;
        o.LJIIIZ(writer, "writer");
        if (config2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("is_audience_list_gecko_setting_on");
        writer.LJJIII(config2.isAudienceListGeckoSettingOn);
        writer.LJI("audience_list_gecko_channel");
        writer.LJJ(config2.audienceListGeckoChannel);
        writer.LJFF();
    }
}
