package com.bytedance.android.livesdk.livesetting.level;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftPanelAnimatorConfig_OptTypeAdapter extends TypeAdapter<GiftPanelAnimatorConfig> {
    public GiftPanelAnimatorConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final GiftPanelAnimatorConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GiftPanelAnimatorConfig giftPanelAnimatorConfig = new GiftPanelAnimatorConfig(0, null, null, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -208749548) {
                    if (hashCode != 98615255) {
                        if (hashCode == 738950403 && LJJ.equals("channel")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                String LJJIIZI = reader.LJJIIZI();
                                o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                                giftPanelAnimatorConfig.channel = LJJIIZI;
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("grade")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftPanelAnimatorConfig.grade = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("light_name")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        String LJJIIZI2 = reader.LJJIIZI();
                        o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                        giftPanelAnimatorConfig.lightName = LJJIIZI2;
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return giftPanelAnimatorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GiftPanelAnimatorConfig giftPanelAnimatorConfig) {
        GiftPanelAnimatorConfig giftPanelAnimatorConfig2 = giftPanelAnimatorConfig;
        o.LJIIIZ(writer, "writer");
        if (giftPanelAnimatorConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("grade");
        C79062V1e.LJFF(giftPanelAnimatorConfig2.grade, writer, "light_name");
        writer.LJJ(giftPanelAnimatorConfig2.lightName);
        writer.LJI("channel");
        writer.LJJ(giftPanelAnimatorConfig2.channel);
        writer.LJFF();
    }
}
