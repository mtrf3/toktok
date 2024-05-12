package com.bytedance.android.livesdk.livesetting.goodybag;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GoodyBagUrls_OptTypeAdapter extends TypeAdapter<GoodyBagUrls> {
    public GoodyBagUrls_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final GoodyBagUrls read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GoodyBagUrls goodyBagUrls = new GoodyBagUrls();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case 51727198:
                        if (!LJJ.equals("goody_bag_short_touch_schema")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            goodyBagUrls.shortTouch = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 197352132:
                        if (!LJJ.equals("goody_bag_faq_schema")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            goodyBagUrls.goodyBagFaqSchema = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 286203294:
                        if (!LJJ.equals("goody_bag_send_schema")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            goodyBagUrls.sendUrl = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 339550077:
                        if (!LJJ.equals("goody_bag_open_schema_for_audience")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            goodyBagUrls.openAudienceSchema = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 436677546:
                        if (!LJJ.equals("goody_bag_waiting_open_schema")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            goodyBagUrls.waitingOpenSchema = reader.LJJIIZI();
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
        return goodyBagUrls;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GoodyBagUrls goodyBagUrls) {
        GoodyBagUrls goodyBagUrls2 = goodyBagUrls;
        o.LJIIIZ(writer, "writer");
        if (goodyBagUrls2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("goody_bag_send_schema");
        writer.LJJ(goodyBagUrls2.sendUrl);
        writer.LJI("goody_bag_short_touch_schema");
        writer.LJJ(goodyBagUrls2.shortTouch);
        writer.LJI("goody_bag_waiting_open_schema");
        writer.LJJ(goodyBagUrls2.waitingOpenSchema);
        writer.LJI("goody_bag_open_schema_for_audience");
        writer.LJJ(goodyBagUrls2.openAudienceSchema);
        writer.LJI("goody_bag_faq_schema");
        writer.LJJ(goodyBagUrls2.goodyBagFaqSchema);
        writer.LJFF();
    }
}
