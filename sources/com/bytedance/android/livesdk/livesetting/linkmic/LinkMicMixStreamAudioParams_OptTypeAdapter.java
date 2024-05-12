package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LinkMicMixStreamAudioParams_OptTypeAdapter extends TypeAdapter<LinkMicMixStreamAudioParams> {
    public LinkMicMixStreamAudioParams_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicMixStreamAudioParams read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LinkMicMixStreamAudioParams linkMicMixStreamAudioParams = new LinkMicMixStreamAudioParams(0, 0, 0, null, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -103223411:
                        if (!LJJ.equals("bitRate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkMicMixStreamAudioParams.bitRate = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 143085994:
                        if (!LJJ.equals("sampleRate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkMicMixStreamAudioParams.sampleRate = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 983394278:
                        if (!LJJ.equals("aacProfile")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            linkMicMixStreamAudioParams.aacProfile = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1432626128:
                        if (!LJJ.equals("channels")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkMicMixStreamAudioParams.channels = reader.LJIJI();
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
        return linkMicMixStreamAudioParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LinkMicMixStreamAudioParams linkMicMixStreamAudioParams) {
        LinkMicMixStreamAudioParams linkMicMixStreamAudioParams2 = linkMicMixStreamAudioParams;
        o.LJIIIZ(writer, "writer");
        if (linkMicMixStreamAudioParams2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("bitRate");
        C79062V1e.LJFF(linkMicMixStreamAudioParams2.bitRate, writer, "sampleRate");
        C79062V1e.LJFF(linkMicMixStreamAudioParams2.sampleRate, writer, "channels");
        C79062V1e.LJFF(linkMicMixStreamAudioParams2.channels, writer, "aacProfile");
        writer.LJJ(linkMicMixStreamAudioParams2.aacProfile);
        writer.LJFF();
    }
}
