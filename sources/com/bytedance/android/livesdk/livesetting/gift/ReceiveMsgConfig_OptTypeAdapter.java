package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ReceiveMsgConfig_OptTypeAdapter extends TypeAdapter<ReceiveMsgConfig> {
    public ReceiveMsgConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final ReceiveMsgConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        ReceiveMsgConfig receiveMsgConfig = new ReceiveMsgConfig(0, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "delay_enqueue_milliseconds")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    receiveMsgConfig.delayEnqueueSec = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return receiveMsgConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, ReceiveMsgConfig receiveMsgConfig) {
        ReceiveMsgConfig receiveMsgConfig2 = receiveMsgConfig;
        o.LJIIIZ(writer, "writer");
        if (receiveMsgConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("delay_enqueue_milliseconds");
        C77339UWx.LJFF(receiveMsgConfig2.delayEnqueueSec, writer);
    }
}
