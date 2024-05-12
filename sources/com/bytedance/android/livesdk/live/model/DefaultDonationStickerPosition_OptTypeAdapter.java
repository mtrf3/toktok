package com.bytedance.android.livesdk.live.model;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DefaultDonationStickerPosition_OptTypeAdapter extends TypeAdapter<DefaultDonationStickerPosition> {
    public DefaultDonationStickerPosition_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final DefaultDonationStickerPosition read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        DefaultDonationStickerPosition defaultDonationStickerPosition = new DefaultDonationStickerPosition();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "x_ratio")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    defaultDonationStickerPosition.setXRatio((float) reader.LJIJ());
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "y_ratio")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    defaultDonationStickerPosition.setYRatio((float) reader.LJIJ());
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return defaultDonationStickerPosition;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, DefaultDonationStickerPosition defaultDonationStickerPosition) {
        DefaultDonationStickerPosition defaultDonationStickerPosition2 = defaultDonationStickerPosition;
        o.LJIIIZ(writer, "writer");
        if (defaultDonationStickerPosition2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("x_ratio");
        writer.LJIJJ(Float.valueOf(defaultDonationStickerPosition2.getXRatio()));
        writer.LJI("y_ratio");
        writer.LJIJJ(Float.valueOf(defaultDonationStickerPosition2.getYRatio()));
        writer.LJFF();
    }
}
