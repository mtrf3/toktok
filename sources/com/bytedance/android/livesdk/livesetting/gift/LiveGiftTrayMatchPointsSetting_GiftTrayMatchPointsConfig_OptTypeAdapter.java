package com.bytedance.android.livesdk.livesetting.gift;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayMatchPointsSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGiftTrayMatchPointsSetting_GiftTrayMatchPointsConfig_OptTypeAdapter extends TypeAdapter<LiveGiftTrayMatchPointsSetting.GiftTrayMatchPointsConfig> {
    public final Gson LIZ;

    public LiveGiftTrayMatchPointsSetting_GiftTrayMatchPointsConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGiftTrayMatchPointsSetting.GiftTrayMatchPointsConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveGiftTrayMatchPointsSetting.GiftTrayMatchPointsConfig giftTrayMatchPointsConfig = new LiveGiftTrayMatchPointsSetting.GiftTrayMatchPointsConfig(false, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "live_gift_match_point_enabled")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    giftTrayMatchPointsConfig.matchPointLabelEnabled = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "live_gift_z_axis_enabled")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    giftTrayMatchPointsConfig.zAxisEnabled = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return giftTrayMatchPointsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveGiftTrayMatchPointsSetting.GiftTrayMatchPointsConfig giftTrayMatchPointsConfig) {
        LiveGiftTrayMatchPointsSetting.GiftTrayMatchPointsConfig giftTrayMatchPointsConfig2 = giftTrayMatchPointsConfig;
        o.LJIIIZ(writer, "writer");
        if (giftTrayMatchPointsConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_gift_match_point_enabled");
        writer.LJJIII(giftTrayMatchPointsConfig2.matchPointLabelEnabled);
        writer.LJI("live_gift_z_axis_enabled");
        writer.LJJIII(giftTrayMatchPointsConfig2.zAxisEnabled);
        writer.LJFF();
    }
}
