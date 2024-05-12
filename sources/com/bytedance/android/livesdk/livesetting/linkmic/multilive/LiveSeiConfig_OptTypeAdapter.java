package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSeiConfig_OptTypeAdapter extends TypeAdapter<LiveSeiConfig> {
    public LiveSeiConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSeiConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveSeiConfig liveSeiConfig = new LiveSeiConfig(0, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "parse_type")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveSeiConfig.parseType = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "parse_interval")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveSeiConfig.interval = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveSeiConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveSeiConfig liveSeiConfig) {
        LiveSeiConfig liveSeiConfig2 = liveSeiConfig;
        o.LJIIIZ(writer, "writer");
        if (liveSeiConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("parse_type");
        C79062V1e.LJFF(liveSeiConfig2.parseType, writer, "parse_interval");
        C77339UWx.LJFF(liveSeiConfig2.interval, writer);
    }
}
