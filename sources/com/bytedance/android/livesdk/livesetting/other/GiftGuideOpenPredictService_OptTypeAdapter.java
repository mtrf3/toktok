package com.bytedance.android.livesdk.livesetting.other;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftGuideOpenPredictService_OptTypeAdapter extends TypeAdapter<GiftGuideOpenPredictService> {
    public GiftGuideOpenPredictService_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final GiftGuideOpenPredictService read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GiftGuideOpenPredictService giftGuideOpenPredictService = new GiftGuideOpenPredictService(null, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "business_name")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    giftGuideOpenPredictService.businessName = LJJIIZI;
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    giftGuideOpenPredictService.enable = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return giftGuideOpenPredictService;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GiftGuideOpenPredictService giftGuideOpenPredictService) {
        GiftGuideOpenPredictService giftGuideOpenPredictService2 = giftGuideOpenPredictService;
        o.LJIIIZ(writer, "writer");
        if (giftGuideOpenPredictService2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("business_name");
        writer.LJJ(giftGuideOpenPredictService2.businessName);
        writer.LJI("enable");
        C77339UWx.LJFF(giftGuideOpenPredictService2.enable, writer);
    }
}
