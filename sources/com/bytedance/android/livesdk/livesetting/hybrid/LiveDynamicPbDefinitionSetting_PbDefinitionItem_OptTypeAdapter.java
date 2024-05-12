package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveDynamicPbDefinitionSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveDynamicPbDefinitionSetting_PbDefinitionItem_OptTypeAdapter extends TypeAdapter<LiveDynamicPbDefinitionSetting.PbDefinitionItem> {
    public LiveDynamicPbDefinitionSetting_PbDefinitionItem_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveDynamicPbDefinitionSetting.PbDefinitionItem read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveDynamicPbDefinitionSetting.PbDefinitionItem pbDefinitionItem = new LiveDynamicPbDefinitionSetting.PbDefinitionItem(null, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "channel")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    pbDefinitionItem.channel = LJJIIZI;
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "definition_url")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI2 = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                    pbDefinitionItem.url = LJJIIZI2;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return pbDefinitionItem;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveDynamicPbDefinitionSetting.PbDefinitionItem pbDefinitionItem) {
        LiveDynamicPbDefinitionSetting.PbDefinitionItem pbDefinitionItem2 = pbDefinitionItem;
        o.LJIIIZ(writer, "writer");
        if (pbDefinitionItem2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("channel");
        writer.LJJ(pbDefinitionItem2.channel);
        writer.LJI("definition_url");
        writer.LJJ(pbDefinitionItem2.url);
        writer.LJFF();
    }
}
