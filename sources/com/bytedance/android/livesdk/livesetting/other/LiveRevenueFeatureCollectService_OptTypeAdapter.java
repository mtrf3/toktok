package com.bytedance.android.livesdk.livesetting.other;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveRevenueFeatureCollectService_OptTypeAdapter extends TypeAdapter<LiveRevenueFeatureCollectService> {
    public LiveRevenueFeatureCollectService_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRevenueFeatureCollectService read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveRevenueFeatureCollectService liveRevenueFeatureCollectService = new LiveRevenueFeatureCollectService(null, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "business_name")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    liveRevenueFeatureCollectService.businessName = LJJIIZI;
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveRevenueFeatureCollectService.enable = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveRevenueFeatureCollectService;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveRevenueFeatureCollectService liveRevenueFeatureCollectService) {
        LiveRevenueFeatureCollectService liveRevenueFeatureCollectService2 = liveRevenueFeatureCollectService;
        o.LJIIIZ(writer, "writer");
        if (liveRevenueFeatureCollectService2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("business_name");
        writer.LJJ(liveRevenueFeatureCollectService2.businessName);
        writer.LJI("enable");
        C77339UWx.LJFF(liveRevenueFeatureCollectService2.enable, writer);
    }
}
