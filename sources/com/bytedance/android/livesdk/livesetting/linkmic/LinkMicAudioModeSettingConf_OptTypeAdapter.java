package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LinkMicAudioModeSettingConf_OptTypeAdapter extends TypeAdapter<LinkMicAudioModeSettingConf> {
    public final Gson LIZ;

    public LinkMicAudioModeSettingConf_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicAudioModeSettingConf read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LinkMicAudioModeSettingConf linkMicAudioModeSettingConf = new LinkMicAudioModeSettingConf(false, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "push_stream_compatible_enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    linkMicAudioModeSettingConf.pushStreamCompatibleEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "push_stream_compatible_version")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    linkMicAudioModeSettingConf.pushStreamCompatibleVersion = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return linkMicAudioModeSettingConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LinkMicAudioModeSettingConf linkMicAudioModeSettingConf) {
        LinkMicAudioModeSettingConf linkMicAudioModeSettingConf2 = linkMicAudioModeSettingConf;
        o.LJIIIZ(writer, "writer");
        if (linkMicAudioModeSettingConf2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("push_stream_compatible_enable");
        writer.LJJIII(linkMicAudioModeSettingConf2.pushStreamCompatibleEnable);
        writer.LJI("push_stream_compatible_version");
        writer.LJIJ(linkMicAudioModeSettingConf2.pushStreamCompatibleVersion);
        writer.LJFF();
    }
}
