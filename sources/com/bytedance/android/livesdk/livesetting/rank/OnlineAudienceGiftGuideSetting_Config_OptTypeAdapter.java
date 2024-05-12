package com.bytedance.android.livesdk.livesetting.rank;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGiftGuideSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class OnlineAudienceGiftGuideSetting_Config_OptTypeAdapter extends TypeAdapter<OnlineAudienceGiftGuideSetting.Config> {
    public final Gson LIZ;

    public OnlineAudienceGiftGuideSetting_Config_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final OnlineAudienceGiftGuideSetting.Config read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        OnlineAudienceGiftGuideSetting.Config config = new OnlineAudienceGiftGuideSetting.Config(false, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "online_audience_gift_guide_available")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    config.giftGuideAvailable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "online_audience_gift_guide_gift_id")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    config.giftId = reader.LJIJJ();
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
    public final void write(C65403Plf writer, OnlineAudienceGiftGuideSetting.Config config) {
        OnlineAudienceGiftGuideSetting.Config config2 = config;
        o.LJIIIZ(writer, "writer");
        if (config2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("online_audience_gift_guide_available");
        writer.LJJIII(config2.giftGuideAvailable);
        writer.LJI("online_audience_gift_guide_gift_id");
        writer.LJIJ(config2.giftId);
        writer.LJFF();
    }
}
