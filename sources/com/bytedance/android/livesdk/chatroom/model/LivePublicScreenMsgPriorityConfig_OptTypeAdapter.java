package com.bytedance.android.livesdk.chatroom.model;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LivePublicScreenMsgPriorityConfig_OptTypeAdapter extends TypeAdapter<LivePublicScreenMsgPriorityConfig> {
    public LivePublicScreenMsgPriorityConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePublicScreenMsgPriorityConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LivePublicScreenMsgPriorityConfig livePublicScreenMsgPriorityConfig = new LivePublicScreenMsgPriorityConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "priority_for_anchor")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    livePublicScreenMsgPriorityConfig.priorityForAnchor = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "priority_for_audience")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    livePublicScreenMsgPriorityConfig.priorityForAudience = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return livePublicScreenMsgPriorityConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LivePublicScreenMsgPriorityConfig livePublicScreenMsgPriorityConfig) {
        LivePublicScreenMsgPriorityConfig livePublicScreenMsgPriorityConfig2 = livePublicScreenMsgPriorityConfig;
        o.LJIIIZ(writer, "writer");
        if (livePublicScreenMsgPriorityConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("priority_for_anchor");
        writer.LJIJ(livePublicScreenMsgPriorityConfig2.priorityForAnchor);
        writer.LJI("priority_for_audience");
        writer.LJIJ(livePublicScreenMsgPriorityConfig2.priorityForAudience);
        writer.LJFF();
    }
}
