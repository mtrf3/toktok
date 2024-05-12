package com.bytedance.android.livesdk.livesetting.other;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftPanelOpenPredictService_OptTypeAdapter extends TypeAdapter<GiftPanelOpenPredictService> {
    public final Gson LIZ;

    public GiftPanelOpenPredictService_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GiftPanelOpenPredictService read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GiftPanelOpenPredictService giftPanelOpenPredictService = new GiftPanelOpenPredictService(null, 0, 0, null, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1354792126:
                        if (!LJJ.equals("config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            HashMap LIZIZ = C65412Plo.LIZIZ(this.LIZ, reader, Object.class);
                            o.LJI(LIZIZ);
                            giftPanelOpenPredictService.config = LIZIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftPanelOpenPredictService.enable = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -991726143:
                        if (!LJJ.equals("period")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftPanelOpenPredictService.period = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 629885866:
                        if (!LJJ.equals("business_name")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            giftPanelOpenPredictService.businessName = LJJIIZI;
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
        return giftPanelOpenPredictService;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GiftPanelOpenPredictService giftPanelOpenPredictService) {
        GiftPanelOpenPredictService giftPanelOpenPredictService2 = giftPanelOpenPredictService;
        o.LJIIIZ(writer, "writer");
        if (giftPanelOpenPredictService2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("business_name");
        writer.LJJ(giftPanelOpenPredictService2.businessName);
        writer.LJI("enable");
        C79062V1e.LJFF(giftPanelOpenPredictService2.enable, writer, "period");
        C79062V1e.LJFF(giftPanelOpenPredictService2.period, writer, "config");
        C65412Plo.LJ(this.LIZ, writer, giftPanelOpenPredictService2.config, Object.class);
        writer.LJFF();
    }
}
