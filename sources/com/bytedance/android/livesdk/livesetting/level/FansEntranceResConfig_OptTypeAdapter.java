package com.bytedance.android.livesdk.livesetting.level;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FansEntranceResConfig_OptTypeAdapter extends TypeAdapter<FansEntranceResConfig> {
    public FansEntranceResConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final FansEntranceResConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        FansEntranceResConfig fansEntranceResConfig = new FansEntranceResConfig(0, null, null, null, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1856230760:
                        if (!LJJ.equals("fans_grade")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            fansEntranceResConfig.fansGrade = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1538702003:
                        if (!LJJ.equals("entrance_lottie_animation")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            fansEntranceResConfig.entranceLottieFileName = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1321694675:
                        if (!LJJ.equals("gecko_channel")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            fansEntranceResConfig.geckoChannel = LJJIIZI2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -216644790:
                        if (!LJJ.equals("entrance_webp_animation")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI3 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI3, "reader.nextString()");
                            fansEntranceResConfig.entranceAnimFileName = LJJIIZI3;
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
        return fansEntranceResConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, FansEntranceResConfig fansEntranceResConfig) {
        FansEntranceResConfig fansEntranceResConfig2 = fansEntranceResConfig;
        o.LJIIIZ(writer, "writer");
        if (fansEntranceResConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("fans_grade");
        C79062V1e.LJFF(fansEntranceResConfig2.fansGrade, writer, "entrance_webp_animation");
        writer.LJJ(fansEntranceResConfig2.entranceAnimFileName);
        writer.LJI("entrance_lottie_animation");
        writer.LJJ(fansEntranceResConfig2.entranceLottieFileName);
        writer.LJI("gecko_channel");
        writer.LJJ(fansEntranceResConfig2.geckoChannel);
        writer.LJFF();
    }
}
