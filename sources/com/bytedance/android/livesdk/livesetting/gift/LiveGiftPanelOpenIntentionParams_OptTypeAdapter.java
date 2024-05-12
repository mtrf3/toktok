package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGiftPanelOpenIntentionParams_OptTypeAdapter extends TypeAdapter<LiveGiftPanelOpenIntentionParams> {
    public LiveGiftPanelOpenIntentionParams_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGiftPanelOpenIntentionParams read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveGiftPanelOpenIntentionParams liveGiftPanelOpenIntentionParams = new LiveGiftPanelOpenIntentionParams(0, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveGiftPanelOpenIntentionParams.enable = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "business_name")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    liveGiftPanelOpenIntentionParams.businessName = LJJIIZI;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveGiftPanelOpenIntentionParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveGiftPanelOpenIntentionParams liveGiftPanelOpenIntentionParams) {
        LiveGiftPanelOpenIntentionParams liveGiftPanelOpenIntentionParams2 = liveGiftPanelOpenIntentionParams;
        o.LJIIIZ(writer, "writer");
        if (liveGiftPanelOpenIntentionParams2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        C79062V1e.LJFF(liveGiftPanelOpenIntentionParams2.enable, writer, "business_name");
        writer.LJJ(liveGiftPanelOpenIntentionParams2.businessName);
        writer.LJFF();
    }
}
