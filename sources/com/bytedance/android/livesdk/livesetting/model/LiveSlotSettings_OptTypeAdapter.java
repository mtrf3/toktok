package com.bytedance.android.livesdk.livesetting.model;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSlotSettings_OptTypeAdapter extends TypeAdapter<LiveSlotSettings> {
    public final Gson LIZ;

    public LiveSlotSettings_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSlotSettings read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveSlotSettings liveSlotSettings = new LiveSlotSettings(null, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "biz_type_disallow")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    HashMap LIZIZ = C65412Plo.LIZIZ(this.LIZ, reader, SlotBizTypeDisallow.class);
                    o.LJI(LIZIZ);
                    liveSlotSettings.setBizTypeDisallow(LIZIZ);
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveSlotSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveSlotSettings liveSlotSettings) {
        LiveSlotSettings liveSlotSettings2 = liveSlotSettings;
        o.LJIIIZ(writer, "writer");
        if (liveSlotSettings2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("biz_type_disallow");
        C65412Plo.LJ(this.LIZ, writer, liveSlotSettings2.getBizTypeDisallow(), SlotBizTypeDisallow.class);
        writer.LJFF();
    }
}
