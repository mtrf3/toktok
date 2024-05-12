package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MultiHostDividerSettingsConf_OptTypeAdapter extends TypeAdapter<MultiHostDividerSettingsConf> {
    public final Gson LIZ;

    public MultiHostDividerSettingsConf_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiHostDividerSettingsConf read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MultiHostDividerSettingsConf multiHostDividerSettingsConf = new MultiHostDividerSettingsConf(false, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    multiHostDividerSettingsConf.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return multiHostDividerSettingsConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MultiHostDividerSettingsConf multiHostDividerSettingsConf) {
        MultiHostDividerSettingsConf multiHostDividerSettingsConf2 = multiHostDividerSettingsConf;
        o.LJIIIZ(writer, "writer");
        if (multiHostDividerSettingsConf2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(multiHostDividerSettingsConf2.enable);
        writer.LJFF();
    }
}
