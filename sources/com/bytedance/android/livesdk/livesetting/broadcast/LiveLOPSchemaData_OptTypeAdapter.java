package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveLOPSchemaData_OptTypeAdapter extends TypeAdapter<LiveLOPSchemaData> {
    public LiveLOPSchemaData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveLOPSchemaData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveLOPSchemaData liveLOPSchemaData = new LiveLOPSchemaData(null, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "full_schema")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    liveLOPSchemaData.fullSchema = LJJIIZI;
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "popup_schema")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI2 = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                    liveLOPSchemaData.popupSchema = LJJIIZI2;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveLOPSchemaData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveLOPSchemaData liveLOPSchemaData) {
        LiveLOPSchemaData liveLOPSchemaData2 = liveLOPSchemaData;
        o.LJIIIZ(writer, "writer");
        if (liveLOPSchemaData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("full_schema");
        writer.LJJ(liveLOPSchemaData2.fullSchema);
        writer.LJI("popup_schema");
        writer.LJJ(liveLOPSchemaData2.popupSchema);
        writer.LJFF();
    }
}
