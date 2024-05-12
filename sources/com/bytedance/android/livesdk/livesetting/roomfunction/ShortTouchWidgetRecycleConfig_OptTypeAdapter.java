package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ShortTouchWidgetRecycleConfig_OptTypeAdapter extends TypeAdapter<ShortTouchWidgetRecycleConfig> {
    public final Gson LIZ;

    public ShortTouchWidgetRecycleConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ShortTouchWidgetRecycleConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        ShortTouchWidgetRecycleConfig shortTouchWidgetRecycleConfig = new ShortTouchWidgetRecycleConfig(false, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "view_widget")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    shortTouchWidgetRecycleConfig.viewWidgetRecycle = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "preview_widget")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    shortTouchWidgetRecycleConfig.previewWidgetRecycle = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return shortTouchWidgetRecycleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, ShortTouchWidgetRecycleConfig shortTouchWidgetRecycleConfig) {
        ShortTouchWidgetRecycleConfig shortTouchWidgetRecycleConfig2 = shortTouchWidgetRecycleConfig;
        o.LJIIIZ(writer, "writer");
        if (shortTouchWidgetRecycleConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("view_widget");
        writer.LJJIII(shortTouchWidgetRecycleConfig2.viewWidgetRecycle);
        writer.LJI("preview_widget");
        writer.LJJIII(shortTouchWidgetRecycleConfig2.previewWidgetRecycle);
        writer.LJFF();
    }
}
