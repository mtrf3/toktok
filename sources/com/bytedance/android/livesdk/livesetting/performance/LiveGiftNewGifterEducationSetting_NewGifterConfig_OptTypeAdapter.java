package com.bytedance.android.livesdk.livesetting.performance;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterEducationSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGiftNewGifterEducationSetting_NewGifterConfig_OptTypeAdapter extends TypeAdapter<LiveGiftNewGifterEducationSetting.NewGifterConfig> {
    public final Gson LIZ;

    public LiveGiftNewGifterEducationSetting_NewGifterConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGiftNewGifterEducationSetting.NewGifterConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveGiftNewGifterEducationSetting.NewGifterConfig newGifterConfig = new LiveGiftNewGifterEducationSetting.NewGifterConfig(0, 0, false, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -2084493748) {
                    if (hashCode != -292529977) {
                        if (hashCode == 726265658 && LJJ.equals("speed_gift_popup_logic_opt_enable")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                newGifterConfig.speedGiftPopupLogicOptEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("speed_gift_popup_style")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            newGifterConfig.speedGiftPopupStyle = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("gift_guide_popup_style")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        newGifterConfig.giftGuidePopupStyle = reader.LJIJI();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return newGifterConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveGiftNewGifterEducationSetting.NewGifterConfig newGifterConfig) {
        LiveGiftNewGifterEducationSetting.NewGifterConfig newGifterConfig2 = newGifterConfig;
        o.LJIIIZ(writer, "writer");
        if (newGifterConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("gift_guide_popup_style");
        C79062V1e.LJFF(newGifterConfig2.giftGuidePopupStyle, writer, "speed_gift_popup_style");
        C79062V1e.LJFF(newGifterConfig2.speedGiftPopupStyle, writer, "speed_gift_popup_logic_opt_enable");
        writer.LJJIII(newGifterConfig2.speedGiftPopupLogicOptEnable);
        writer.LJFF();
    }
}
