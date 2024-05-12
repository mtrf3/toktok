package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C76965UIn;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.gift.LiveFlymicGiftDowngradeStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveFlymicGiftDowngradeStrategy_SettingParams_OptTypeAdapter extends TypeAdapter<LiveFlymicGiftDowngradeStrategy.SettingParams> {
    public LiveFlymicGiftDowngradeStrategy_SettingParams_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveFlymicGiftDowngradeStrategy.SettingParams read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveFlymicGiftDowngradeStrategy.SettingParams settingParams = new LiveFlymicGiftDowngradeStrategy.SettingParams(0.0f, 0, 0.0f, 0, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -380804886:
                        if (!LJJ.equals("downgrade_device_score_level_1")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            settingParams.deviceScoreLevel1 = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -380804885:
                        if (!LJJ.equals("downgrade_device_score_level_2")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            settingParams.deviceScoreLevel2 = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 481985668:
                        if (!LJJ.equals("downgrade_message_count_level_1")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            settingParams.msgCountLevel1 = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 481985669:
                        if (!LJJ.equals("downgrade_message_count_level_2")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            settingParams.msgCountLevel2 = reader.LJIJI();
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
        return settingParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveFlymicGiftDowngradeStrategy.SettingParams settingParams) {
        LiveFlymicGiftDowngradeStrategy.SettingParams settingParams2 = settingParams;
        o.LJIIIZ(writer, "writer");
        if (settingParams2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("downgrade_device_score_level_1");
        C76965UIn.LIZIZ(settingParams2.deviceScoreLevel1, writer, "downgrade_message_count_level_1");
        C79062V1e.LJFF(settingParams2.msgCountLevel1, writer, "downgrade_device_score_level_2");
        C76965UIn.LIZIZ(settingParams2.deviceScoreLevel2, writer, "downgrade_message_count_level_2");
        C77339UWx.LJFF(settingParams2.msgCountLevel2, writer);
    }
}
