package com.bytedance.android.livesdk.livesetting.slot;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GeckoContent_OptTypeAdapter extends TypeAdapter<GeckoContent> {
    public GeckoContent_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final GeckoContent read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GeckoContent geckoContent = new GeckoContent(0, null, null, null, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1321694675:
                        if (!LJJ.equals("gecko_channel")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            geckoContent.geckoChannel = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1283380936:
                        if (!LJJ.equals("msg_type")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            geckoContent.msgType = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1139288251:
                        if (!LJJ.equals("ribbon_file_name")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            geckoContent.ribbonFileName = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -283171345:
                        if (!LJJ.equals("animation_video_file_name")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            geckoContent.videoFileName = reader.LJJIIZI();
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
        return geckoContent;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GeckoContent geckoContent) {
        GeckoContent geckoContent2 = geckoContent;
        o.LJIIIZ(writer, "writer");
        if (geckoContent2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("msg_type");
        C79062V1e.LJFF(geckoContent2.msgType, writer, "ribbon_file_name");
        writer.LJJ(geckoContent2.ribbonFileName);
        writer.LJI("animation_video_file_name");
        writer.LJJ(geckoContent2.videoFileName);
        writer.LJI("gecko_channel");
        writer.LJJ(geckoContent2.geckoChannel);
        writer.LJFF();
    }
}
