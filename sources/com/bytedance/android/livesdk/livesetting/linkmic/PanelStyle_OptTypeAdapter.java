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
public final class PanelStyle_OptTypeAdapter extends TypeAdapter<PanelStyle> {
    public final Gson LIZ;

    public PanelStyle_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PanelStyle read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        PanelStyle panelStyle = new PanelStyle(0, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "panel_type")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    panelStyle.panelType = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "show_view_more")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    panelStyle.showViewMore = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return panelStyle;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, PanelStyle panelStyle) {
        PanelStyle panelStyle2 = panelStyle;
        o.LJIIIZ(writer, "writer");
        if (panelStyle2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("panel_type");
        C79062V1e.LJFF(panelStyle2.panelType, writer, "show_view_more");
        writer.LJJIII(panelStyle2.showViewMore);
        writer.LJFF();
    }
}
