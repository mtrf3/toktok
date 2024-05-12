package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AnchorMockVideoSizeConfig_OptTypeAdapter extends TypeAdapter<AnchorMockVideoSizeConfig> {
    public AnchorMockVideoSizeConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final AnchorMockVideoSizeConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        AnchorMockVideoSizeConfig anchorMockVideoSizeConfig = new AnchorMockVideoSizeConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "width")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    anchorMockVideoSizeConfig.width = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "height")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    anchorMockVideoSizeConfig.height = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return anchorMockVideoSizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, AnchorMockVideoSizeConfig anchorMockVideoSizeConfig) {
        AnchorMockVideoSizeConfig anchorMockVideoSizeConfig2 = anchorMockVideoSizeConfig;
        o.LJIIIZ(writer, "writer");
        if (anchorMockVideoSizeConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("width");
        C79062V1e.LJFF(anchorMockVideoSizeConfig2.width, writer, "height");
        C77339UWx.LJFF(anchorMockVideoSizeConfig2.height, writer);
    }
}
