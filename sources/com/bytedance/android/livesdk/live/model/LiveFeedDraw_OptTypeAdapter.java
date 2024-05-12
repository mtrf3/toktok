package com.bytedance.android.livesdk.live.model;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveFeedDraw_OptTypeAdapter extends TypeAdapter<LiveFeedDraw> {
    public final Gson LIZ;

    public LiveFeedDraw_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveFeedDraw read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveFeedDraw liveFeedDraw = new LiveFeedDraw();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "url")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    liveFeedDraw.setUrl(LJJIIZI);
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "settings")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    HashMap LIZIZ = C65412Plo.LIZIZ(this.LIZ, reader, LiveFeedSettings.class);
                    o.LJI(LIZIZ);
                    liveFeedDraw.setSettings(LIZIZ);
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveFeedDraw;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveFeedDraw liveFeedDraw) {
        LiveFeedDraw liveFeedDraw2 = liveFeedDraw;
        o.LJIIIZ(writer, "writer");
        if (liveFeedDraw2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("url");
        writer.LJJ(liveFeedDraw2.getUrl());
        writer.LJI("settings");
        C65412Plo.LJ(this.LIZ, writer, liveFeedDraw2.getSettings(), LiveFeedSettings.class);
        writer.LJFF();
    }
}
