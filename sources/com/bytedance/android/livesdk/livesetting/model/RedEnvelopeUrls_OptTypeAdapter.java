package com.bytedance.android.livesdk.livesetting.model;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RedEnvelopeUrls_OptTypeAdapter extends TypeAdapter<RedEnvelopeUrls> {
    public RedEnvelopeUrls_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final RedEnvelopeUrls read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        RedEnvelopeUrls redEnvelopeUrls = new RedEnvelopeUrls();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "short_touch")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    redEnvelopeUrls.shortTouchUrl = reader.LJJIIZI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "send")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    redEnvelopeUrls.sendUrl = reader.LJJIIZI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return redEnvelopeUrls;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, RedEnvelopeUrls redEnvelopeUrls) {
        RedEnvelopeUrls redEnvelopeUrls2 = redEnvelopeUrls;
        o.LJIIIZ(writer, "writer");
        if (redEnvelopeUrls2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("short_touch");
        writer.LJJ(redEnvelopeUrls2.shortTouchUrl);
        writer.LJI("send");
        writer.LJJ(redEnvelopeUrls2.sendUrl);
        writer.LJFF();
    }
}
