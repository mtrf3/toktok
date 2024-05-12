package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MsgStair_OptTypeAdapter extends TypeAdapter<MsgStair> {
    public MsgStair_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final MsgStair read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MsgStair msgStair = new MsgStair();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "min_msg_count")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    msgStair._minMsgCount = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "max_msg_count")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    msgStair._maxMsgCount = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return msgStair;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MsgStair msgStair) {
        MsgStair msgStair2 = msgStair;
        o.LJIIIZ(writer, "writer");
        if (msgStair2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("min_msg_count");
        C79062V1e.LJFF(msgStair2._minMsgCount, writer, "max_msg_count");
        C77339UWx.LJFF(msgStair2._maxMsgCount, writer);
    }
}
