package com.bytedance.android.livesdk.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BuriedFieldData_OptTypeAdapter extends TypeAdapter<BuriedFieldData> {
    public final Gson LIZ;

    public BuriedFieldData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BuriedFieldData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        BuriedFieldData buriedFieldData = new BuriedFieldData();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "ttlive_buried_field_reduction_is_buried_field")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    buriedFieldData.isBuriedField = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "ttlive_buried_field_reduction_unburied_field_list")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                    o.LJI(LIZ);
                    buriedFieldData.unBuriedFieldList = LIZ;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return buriedFieldData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, BuriedFieldData buriedFieldData) {
        BuriedFieldData buriedFieldData2 = buriedFieldData;
        o.LJIIIZ(writer, "writer");
        if (buriedFieldData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("ttlive_buried_field_reduction_is_buried_field");
        writer.LJJIII(buriedFieldData2.isBuriedField);
        writer.LJI("ttlive_buried_field_reduction_unburied_field_list");
        C65412Plo.LIZLLL(this.LIZ, writer, buriedFieldData2.unBuriedFieldList, String.class);
        writer.LJFF();
    }
}
