package com.bytedance.android.livesdk.livesetting.message;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MessageMonitorSamplingConfig_OptTypeAdapter extends TypeAdapter<MessageMonitorSamplingConfig> {
    public MessageMonitorSamplingConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final MessageMonitorSamplingConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MessageMonitorSamplingConfig messageMonitorSamplingConfig = new MessageMonitorSamplingConfig(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "zstd_compress_samping")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    messageMonitorSamplingConfig.setZstdSamplingRate(reader.LJIJ());
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "log_sampling")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    messageMonitorSamplingConfig.setLogSamplingRate(reader.LJIJ());
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return messageMonitorSamplingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MessageMonitorSamplingConfig messageMonitorSamplingConfig) {
        MessageMonitorSamplingConfig messageMonitorSamplingConfig2 = messageMonitorSamplingConfig;
        o.LJIIIZ(writer, "writer");
        if (messageMonitorSamplingConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("zstd_compress_samping");
        writer.LJIILL(messageMonitorSamplingConfig2.getZstdSamplingRate());
        writer.LJI("log_sampling");
        writer.LJIILL(messageMonitorSamplingConfig2.getLogSamplingRate());
        writer.LJFF();
    }
}
