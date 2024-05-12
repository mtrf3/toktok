package com.bytedance.android.livesdk.model;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RandomLinkMicSetting_DisconnectJudge_OptTypeAdapter extends TypeAdapter<RandomLinkMicSetting.DisconnectJudge> {
    public RandomLinkMicSetting_DisconnectJudge_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final RandomLinkMicSetting.DisconnectJudge read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        RandomLinkMicSetting.DisconnectJudge disconnectJudge = new RandomLinkMicSetting.DisconnectJudge();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "period")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    disconnectJudge.period = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "frequency")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    disconnectJudge.frequency = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return disconnectJudge;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, RandomLinkMicSetting.DisconnectJudge disconnectJudge) {
        RandomLinkMicSetting.DisconnectJudge disconnectJudge2 = disconnectJudge;
        o.LJIIIZ(writer, "writer");
        if (disconnectJudge2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("period");
        C79062V1e.LJFF(disconnectJudge2.period, writer, "frequency");
        C77339UWx.LJFF(disconnectJudge2.frequency, writer);
    }
}
