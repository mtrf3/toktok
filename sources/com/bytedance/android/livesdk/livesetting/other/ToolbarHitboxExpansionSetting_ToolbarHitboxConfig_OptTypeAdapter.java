package com.bytedance.android.livesdk.livesetting.other;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.other.ToolbarHitboxExpansionSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ToolbarHitboxExpansionSetting_ToolbarHitboxConfig_OptTypeAdapter extends TypeAdapter<ToolbarHitboxExpansionSetting.ToolbarHitboxConfig> {
    public final Gson LIZ;

    public ToolbarHitboxExpansionSetting_ToolbarHitboxConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ToolbarHitboxExpansionSetting.ToolbarHitboxConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        ToolbarHitboxExpansionSetting.ToolbarHitboxConfig toolbarHitboxConfig = new ToolbarHitboxExpansionSetting.ToolbarHitboxConfig(false, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "live_toolbar_hitbox_expand_top")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    toolbarHitboxConfig.expandTop = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "live_toolbar_hitbox_expand_bottom")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    toolbarHitboxConfig.expandBottom = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return toolbarHitboxConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, ToolbarHitboxExpansionSetting.ToolbarHitboxConfig toolbarHitboxConfig) {
        ToolbarHitboxExpansionSetting.ToolbarHitboxConfig toolbarHitboxConfig2 = toolbarHitboxConfig;
        o.LJIIIZ(writer, "writer");
        if (toolbarHitboxConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_toolbar_hitbox_expand_top");
        writer.LJJIII(toolbarHitboxConfig2.expandTop);
        writer.LJI("live_toolbar_hitbox_expand_bottom");
        writer.LJJIII(toolbarHitboxConfig2.expandBottom);
        writer.LJFF();
    }
}
