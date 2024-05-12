package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LinkMicMultiGuestPageFirstFrameLogConfig_OptTypeAdapter extends TypeAdapter<LinkMicMultiGuestPageFirstFrameLogConfig> {
    public final Gson LIZ;

    public LinkMicMultiGuestPageFirstFrameLogConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicMultiGuestPageFirstFrameLogConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LinkMicMultiGuestPageFirstFrameLogConfig linkMicMultiGuestPageFirstFrameLogConfig = new LinkMicMultiGuestPageFirstFrameLogConfig(false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    linkMicMultiGuestPageFirstFrameLogConfig.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "sample_rate")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    linkMicMultiGuestPageFirstFrameLogConfig.sampleRate = reader.LJIJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return linkMicMultiGuestPageFirstFrameLogConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LinkMicMultiGuestPageFirstFrameLogConfig linkMicMultiGuestPageFirstFrameLogConfig) {
        LinkMicMultiGuestPageFirstFrameLogConfig linkMicMultiGuestPageFirstFrameLogConfig2 = linkMicMultiGuestPageFirstFrameLogConfig;
        o.LJIIIZ(writer, "writer");
        if (linkMicMultiGuestPageFirstFrameLogConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(linkMicMultiGuestPageFirstFrameLogConfig2.enable);
        writer.LJI("sample_rate");
        writer.LJIILL(linkMicMultiGuestPageFirstFrameLogConfig2.sampleRate);
        writer.LJFF();
    }
}
