package com.bytedance.android.livesdk.livesetting.game;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ExceptionInfo_OptTypeAdapter extends TypeAdapter<ExceptionInfo> {
    public final Gson LIZ;

    public ExceptionInfo_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ExceptionInfo read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        ExceptionInfo exceptionInfo = new ExceptionInfo(false, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "active")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    exceptionInfo.setActive(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "delay")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    exceptionInfo.setDelayTime(reader.LJIJJ());
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return exceptionInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, ExceptionInfo exceptionInfo) {
        ExceptionInfo exceptionInfo2 = exceptionInfo;
        o.LJIIIZ(writer, "writer");
        if (exceptionInfo2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("active");
        writer.LJJIII(exceptionInfo2.isActive());
        writer.LJI("delay");
        writer.LJIJ(exceptionInfo2.getDelayTime());
        writer.LJFF();
    }
}
