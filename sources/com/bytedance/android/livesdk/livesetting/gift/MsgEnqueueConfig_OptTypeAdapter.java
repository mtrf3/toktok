package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MsgEnqueueConfig_OptTypeAdapter extends TypeAdapter<MsgEnqueueConfig> {
    public MsgEnqueueConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final MsgEnqueueConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MsgEnqueueConfig msgEnqueueConfig = new MsgEnqueueConfig(null, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "sort_type")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    msgEnqueueConfig.sortType = LJJIIZI;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return msgEnqueueConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MsgEnqueueConfig msgEnqueueConfig) {
        MsgEnqueueConfig msgEnqueueConfig2 = msgEnqueueConfig;
        o.LJIIIZ(writer, "writer");
        if (msgEnqueueConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("sort_type");
        writer.LJJ(msgEnqueueConfig2.sortType);
        writer.LJFF();
    }
}
