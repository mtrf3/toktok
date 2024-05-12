package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C65385PlN;
import X.C65403Plf;
import X.C76965UIn;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MultiPlayerScoreLimit_OptTypeAdapter extends TypeAdapter<MultiPlayerScoreLimit> {
    public MultiPlayerScoreLimit_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiPlayerScoreLimit read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MultiPlayerScoreLimit multiPlayerScoreLimit = new MultiPlayerScoreLimit(0.0f, 0.0f, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "score_high")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    multiPlayerScoreLimit.scoreHigh = (float) reader.LJIJ();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "score_low")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    multiPlayerScoreLimit.scoreLow = (float) reader.LJIJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return multiPlayerScoreLimit;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MultiPlayerScoreLimit multiPlayerScoreLimit) {
        MultiPlayerScoreLimit multiPlayerScoreLimit2 = multiPlayerScoreLimit;
        o.LJIIIZ(writer, "writer");
        if (multiPlayerScoreLimit2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("score_high");
        C76965UIn.LIZIZ(multiPlayerScoreLimit2.scoreHigh, writer, "score_low");
        writer.LJIJJ(Float.valueOf(multiPlayerScoreLimit2.scoreLow));
        writer.LJFF();
    }
}
