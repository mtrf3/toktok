package com.bytedance.android.livesdk.livesetting.level;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GeckoResourceDownloadConfig_OptTypeAdapter extends TypeAdapter<GeckoResourceDownloadConfig> {
    public final Gson LIZ;

    public GeckoResourceDownloadConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GeckoResourceDownloadConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GeckoResourceDownloadConfig geckoResourceDownloadConfig = new GeckoResourceDownloadConfig(null, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "client_resource_channels")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                    o.LJI(LIZ);
                    geckoResourceDownloadConfig.geckoResourceDownloadList = LIZ;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return geckoResourceDownloadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GeckoResourceDownloadConfig geckoResourceDownloadConfig) {
        GeckoResourceDownloadConfig geckoResourceDownloadConfig2 = geckoResourceDownloadConfig;
        o.LJIIIZ(writer, "writer");
        if (geckoResourceDownloadConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("client_resource_channels");
        C65412Plo.LIZLLL(this.LIZ, writer, geckoResourceDownloadConfig2.geckoResourceDownloadList, String.class);
        writer.LJFF();
    }
}
