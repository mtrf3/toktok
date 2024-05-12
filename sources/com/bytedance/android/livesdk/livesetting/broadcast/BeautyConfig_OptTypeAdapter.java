package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BeautyConfig_OptTypeAdapter extends TypeAdapter<BeautyConfig> {
    public final Gson LIZ;

    public BeautyConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BeautyConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        BeautyConfig beautyConfig = new BeautyConfig(false, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "has_none_item")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    beautyConfig.hasNone = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "has_bubble")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    beautyConfig.hasBubble = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return beautyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, BeautyConfig beautyConfig) {
        BeautyConfig beautyConfig2 = beautyConfig;
        o.LJIIIZ(writer, "writer");
        if (beautyConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("has_none_item");
        writer.LJJIII(beautyConfig2.hasNone);
        writer.LJI("has_bubble");
        writer.LJJIII(beautyConfig2.hasBubble);
        writer.LJFF();
    }
}
