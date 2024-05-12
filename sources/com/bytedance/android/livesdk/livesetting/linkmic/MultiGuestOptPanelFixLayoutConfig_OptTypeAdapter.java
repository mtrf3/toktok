package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MultiGuestOptPanelFixLayoutConfig_OptTypeAdapter extends TypeAdapter<MultiGuestOptPanelFixLayoutConfig> {
    public final Gson LIZ;

    public MultiGuestOptPanelFixLayoutConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestOptPanelFixLayoutConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MultiGuestOptPanelFixLayoutConfig multiGuestOptPanelFixLayoutConfig = new MultiGuestOptPanelFixLayoutConfig(0, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "version")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    multiGuestOptPanelFixLayoutConfig.version = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "enable_layout_loading_change")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    multiGuestOptPanelFixLayoutConfig.enableLayoutLoadingChange = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return multiGuestOptPanelFixLayoutConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MultiGuestOptPanelFixLayoutConfig multiGuestOptPanelFixLayoutConfig) {
        MultiGuestOptPanelFixLayoutConfig multiGuestOptPanelFixLayoutConfig2 = multiGuestOptPanelFixLayoutConfig;
        o.LJIIIZ(writer, "writer");
        if (multiGuestOptPanelFixLayoutConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("version");
        C79062V1e.LJFF(multiGuestOptPanelFixLayoutConfig2.version, writer, "enable_layout_loading_change");
        writer.LJJIII(multiGuestOptPanelFixLayoutConfig2.enableLayoutLoadingChange);
        writer.LJFF();
    }
}
