package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MultiGuestFeSchemaConfig_OptTypeAdapter extends TypeAdapter<MultiGuestFeSchemaConfig> {
    public MultiGuestFeSchemaConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestFeSchemaConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MultiGuestFeSchemaConfig multiGuestFeSchemaConfig = new MultiGuestFeSchemaConfig(null, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "feedback")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    multiGuestFeSchemaConfig.feedback = LJJIIZI;
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "guest_overview")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI2 = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                    multiGuestFeSchemaConfig.guestOverview = LJJIIZI2;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return multiGuestFeSchemaConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MultiGuestFeSchemaConfig multiGuestFeSchemaConfig) {
        MultiGuestFeSchemaConfig multiGuestFeSchemaConfig2 = multiGuestFeSchemaConfig;
        o.LJIIIZ(writer, "writer");
        if (multiGuestFeSchemaConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("feedback");
        writer.LJJ(multiGuestFeSchemaConfig2.feedback);
        writer.LJI("guest_overview");
        writer.LJJ(multiGuestFeSchemaConfig2.guestOverview);
        writer.LJFF();
    }
}
