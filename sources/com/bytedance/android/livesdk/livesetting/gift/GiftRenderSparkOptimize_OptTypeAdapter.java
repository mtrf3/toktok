package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftRenderSparkOptimize_OptTypeAdapter extends TypeAdapter<GiftRenderSparkOptimize> {
    public GiftRenderSparkOptimize_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final GiftRenderSparkOptimize read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GiftRenderSparkOptimize giftRenderSparkOptimize = new GiftRenderSparkOptimize(0, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    giftRenderSparkOptimize.enable = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "precreate_strategy")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    giftRenderSparkOptimize.preCreateStrategy = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return giftRenderSparkOptimize;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GiftRenderSparkOptimize giftRenderSparkOptimize) {
        GiftRenderSparkOptimize giftRenderSparkOptimize2 = giftRenderSparkOptimize;
        o.LJIIIZ(writer, "writer");
        if (giftRenderSparkOptimize2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        C79062V1e.LJFF(giftRenderSparkOptimize2.enable, writer, "precreate_strategy");
        C77339UWx.LJFF(giftRenderSparkOptimize2.preCreateStrategy, writer);
    }
}
