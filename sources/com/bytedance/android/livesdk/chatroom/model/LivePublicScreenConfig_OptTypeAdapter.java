package com.bytedance.android.livesdk.chatroom.model;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LivePublicScreenConfig_OptTypeAdapter extends TypeAdapter<LivePublicScreenConfig> {
    public LivePublicScreenConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePublicScreenConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LivePublicScreenConfig livePublicScreenConfig = new LivePublicScreenConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -710683224:
                        if (!LJJ.equals("consume_interval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenConfig.consumeInterval = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -707614165:
                        if (!LJJ.equals("max_message_in_recyclerview")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenConfig.maxMessageInRecyclerview = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -14936999:
                        if (!LJJ.equals("consume_count_per_loop")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenConfig.consumeCountPerLoop = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 256225795:
                        if (!LJJ.equals("anim_style")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenConfig.animStyle = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 914387396:
                        if (!LJJ.equals("others_buffer_size")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenConfig.othersBufferSize = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1091613861:
                        if (!LJJ.equals("ms_per_inch")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenConfig.msPerInch = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1096987638:
                        if (!LJJ.equals("fold_message_scroll_type")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenConfig.foldMessageScrollType = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1413868308:
                        if (!LJJ.equals("first_loop_consume_delay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenConfig.firstLoopConsumeDelay = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return livePublicScreenConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LivePublicScreenConfig livePublicScreenConfig) {
        LivePublicScreenConfig livePublicScreenConfig2 = livePublicScreenConfig;
        o.LJIIIZ(writer, "writer");
        if (livePublicScreenConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("consume_count_per_loop");
        C79062V1e.LJFF(livePublicScreenConfig2.consumeCountPerLoop, writer, "consume_interval");
        C79062V1e.LJFF(livePublicScreenConfig2.consumeInterval, writer, "first_loop_consume_delay");
        C79062V1e.LJFF(livePublicScreenConfig2.firstLoopConsumeDelay, writer, "fold_message_scroll_type");
        C79062V1e.LJFF(livePublicScreenConfig2.foldMessageScrollType, writer, "ms_per_inch");
        C79062V1e.LJFF(livePublicScreenConfig2.msPerInch, writer, "anim_style");
        C79062V1e.LJFF(livePublicScreenConfig2.animStyle, writer, "others_buffer_size");
        C79062V1e.LJFF(livePublicScreenConfig2.othersBufferSize, writer, "max_message_in_recyclerview");
        C77339UWx.LJFF(livePublicScreenConfig2.maxMessageInRecyclerview, writer);
    }
}
