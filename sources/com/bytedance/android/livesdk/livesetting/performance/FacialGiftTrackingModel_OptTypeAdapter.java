package com.bytedance.android.livesdk.livesetting.performance;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FacialGiftTrackingModel_OptTypeAdapter extends TypeAdapter<FacialGiftTrackingModel> {
    public final Gson LIZ;

    public FacialGiftTrackingModel_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FacialGiftTrackingModel read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        FacialGiftTrackingModel facialGiftTrackingModel = new FacialGiftTrackingModel(null, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable_tracking")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    facialGiftTrackingModel.trackingEnabled = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(reader);
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "link_tracking_min_version")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    facialGiftTrackingModel.linkTrackingMinVersion = Integer.valueOf(reader.LJIJI());
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return facialGiftTrackingModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, FacialGiftTrackingModel facialGiftTrackingModel) {
        FacialGiftTrackingModel facialGiftTrackingModel2 = facialGiftTrackingModel;
        o.LJIIIZ(writer, "writer");
        if (facialGiftTrackingModel2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_tracking");
        writer.LJIJI(facialGiftTrackingModel2.trackingEnabled);
        writer.LJI("link_tracking_min_version");
        writer.LJIJJ(facialGiftTrackingModel2.linkTrackingMinVersion);
        writer.LJFF();
    }
}
