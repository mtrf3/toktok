package com.bytedance.android.livesdk.commerce;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGoodsBanner_OptTypeAdapter extends TypeAdapter<LiveGoodsBanner> {
    public LiveGoodsBanner_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGoodsBanner read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveGoodsBanner liveGoodsBanner = new LiveGoodsBanner();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "id")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveGoodsBanner.id = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "text")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    liveGoodsBanner.text = LJJIIZI;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveGoodsBanner;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveGoodsBanner liveGoodsBanner) {
        LiveGoodsBanner liveGoodsBanner2 = liveGoodsBanner;
        o.LJIIIZ(writer, "writer");
        if (liveGoodsBanner2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("id");
        writer.LJIJ(liveGoodsBanner2.id);
        writer.LJI("text");
        writer.LJJ(liveGoodsBanner2.text);
        writer.LJFF();
    }
}
