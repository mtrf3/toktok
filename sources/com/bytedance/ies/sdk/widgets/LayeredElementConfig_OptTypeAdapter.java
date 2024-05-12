package com.bytedance.ies.sdk.widgets;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LayeredElementConfig_OptTypeAdapter extends TypeAdapter<LayeredElementConfig> {
    public final Gson gson;

    public LayeredElementConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.gson = gson;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public LayeredElementConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LayeredElementConfig layeredElementConfig = new LayeredElementConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "guideline_indicator_enabled")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    layeredElementConfig.guidelineIndicatorEnabled = ((Boolean) C64.LIZ(this.gson, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "animation_duration")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    layeredElementConfig.animationDuration = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return layeredElementConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(C65403Plf writer, LayeredElementConfig layeredElementConfig) {
        o.LJIIIZ(writer, "writer");
        if (layeredElementConfig == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("guideline_indicator_enabled");
        writer.LJJIII(layeredElementConfig.guidelineIndicatorEnabled);
        writer.LJI("animation_duration");
        writer.LJIJ(layeredElementConfig.animationDuration);
        writer.LJFF();
    }
}
