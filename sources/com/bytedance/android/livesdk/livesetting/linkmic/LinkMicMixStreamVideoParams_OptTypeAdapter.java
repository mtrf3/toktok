package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LinkMicMixStreamVideoParams_OptTypeAdapter extends TypeAdapter<LinkMicMixStreamVideoParams> {
    public LinkMicMixStreamVideoParams_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicMixStreamVideoParams read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LinkMicMixStreamVideoParams linkMicMixStreamVideoParams = new LinkMicMixStreamVideoParams(null, 0, 0, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != 101609) {
                    if (hashCode != 102536) {
                        if (hashCode == 94834710 && LJJ.equals("codec")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                String LJJIIZI = reader.LJJIIZI();
                                o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                                linkMicMixStreamVideoParams.codec = LJJIIZI;
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("gop")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkMicMixStreamVideoParams.gop = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("fps")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        linkMicMixStreamVideoParams.fps = reader.LJIJI();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return linkMicMixStreamVideoParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LinkMicMixStreamVideoParams linkMicMixStreamVideoParams) {
        LinkMicMixStreamVideoParams linkMicMixStreamVideoParams2 = linkMicMixStreamVideoParams;
        o.LJIIIZ(writer, "writer");
        if (linkMicMixStreamVideoParams2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("codec");
        writer.LJJ(linkMicMixStreamVideoParams2.codec);
        writer.LJI("fps");
        C79062V1e.LJFF(linkMicMixStreamVideoParams2.fps, writer, "gop");
        C77339UWx.LJFF(linkMicMixStreamVideoParams2.gop, writer);
    }
}
