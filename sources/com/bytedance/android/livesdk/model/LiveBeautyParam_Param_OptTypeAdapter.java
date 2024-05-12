package com.bytedance.android.livesdk.model;

import X.C65385PlN;
import X.C65403Plf;
import X.C76965UIn;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.model.LiveBeautyParam;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveBeautyParam_Param_OptTypeAdapter extends TypeAdapter<LiveBeautyParam.Param> {
    public LiveBeautyParam_Param_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveBeautyParam.Param read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveBeautyParam.Param param = new LiveBeautyParam.Param();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "scale")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    param.scale = (float) reader.LJIJ();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "default")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    param.def = (float) reader.LJIJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return param;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveBeautyParam.Param param) {
        LiveBeautyParam.Param param2 = param;
        o.LJIIIZ(writer, "writer");
        if (param2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("scale");
        C76965UIn.LIZIZ(param2.scale, writer, "default");
        writer.LJIJJ(Float.valueOf(param2.def));
        writer.LJFF();
    }
}
