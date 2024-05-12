package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGiftTrayPublicScreenTranslateSetting_LiveGiftTrayPublicScreenTranslateConfig_OptTypeAdapter extends TypeAdapter<LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig> {
    public final Gson LIZ;

    public LiveGiftTrayPublicScreenTranslateSetting_LiveGiftTrayPublicScreenTranslateConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig liveGiftTrayPublicScreenTranslateConfig = new LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig(null, false, false, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -804565608) {
                    if (hashCode != -202761566) {
                        if (hashCode == 1006493261 && LJJ.equals("biz_types")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                                o.LJI(LIZ);
                                liveGiftTrayPublicScreenTranslateConfig.bizTypes = LIZ;
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("top_gift_message")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGiftTrayPublicScreenTranslateConfig.translateGiftTray = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("top_public_screen")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveGiftTrayPublicScreenTranslateConfig.translatePublishScreen = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveGiftTrayPublicScreenTranslateConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig liveGiftTrayPublicScreenTranslateConfig) {
        LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig liveGiftTrayPublicScreenTranslateConfig2 = liveGiftTrayPublicScreenTranslateConfig;
        o.LJIIIZ(writer, "writer");
        if (liveGiftTrayPublicScreenTranslateConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("biz_types");
        C65412Plo.LIZLLL(this.LIZ, writer, liveGiftTrayPublicScreenTranslateConfig2.bizTypes, String.class);
        writer.LJI("top_gift_message");
        writer.LJJIII(liveGiftTrayPublicScreenTranslateConfig2.translateGiftTray);
        writer.LJI("top_public_screen");
        writer.LJJIII(liveGiftTrayPublicScreenTranslateConfig2.translatePublishScreen);
        writer.LJFF();
    }
}
