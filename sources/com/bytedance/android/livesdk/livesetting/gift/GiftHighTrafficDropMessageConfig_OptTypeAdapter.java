package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftHighTrafficDropMessageConfig_OptTypeAdapter extends TypeAdapter<GiftHighTrafficDropMessageConfig> {
    public GiftHighTrafficDropMessageConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final GiftHighTrafficDropMessageConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        GiftHighTrafficDropMessageConfig giftHighTrafficDropMessageConfig = new GiftHighTrafficDropMessageConfig(0, 0, 0L, 0, 0, 0, 63, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1895334827:
                        if (!LJJ.equals("insertion_interval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftHighTrafficDropMessageConfig.insertInterval = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1793121145:
                        if (!LJJ.equals("disable_skip_lower_combo")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftHighTrafficDropMessageConfig.disableSkipLowerCombo = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 388468684:
                        if (!LJJ.equals("clear_percentage")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftHighTrafficDropMessageConfig.clearPercentage = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 600130165:
                        if (!LJJ.equals("insert_small_gift_num")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftHighTrafficDropMessageConfig.insertSmallGiftNum = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1801035983:
                        if (!LJJ.equals("max_queue_length")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftHighTrafficDropMessageConfig.maxQueueLength = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1889934364:
                        if (!LJJ.equals("insert_big_gift_num")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftHighTrafficDropMessageConfig.insertBigGiftNum = reader.LJIJI();
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
        return giftHighTrafficDropMessageConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, GiftHighTrafficDropMessageConfig giftHighTrafficDropMessageConfig) {
        GiftHighTrafficDropMessageConfig giftHighTrafficDropMessageConfig2 = giftHighTrafficDropMessageConfig;
        o.LJIIIZ(writer, "writer");
        if (giftHighTrafficDropMessageConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("max_queue_length");
        C79062V1e.LJFF(giftHighTrafficDropMessageConfig2.maxQueueLength, writer, "clear_percentage");
        C79062V1e.LJFF(giftHighTrafficDropMessageConfig2.clearPercentage, writer, "insertion_interval");
        writer.LJIJ(giftHighTrafficDropMessageConfig2.insertInterval);
        writer.LJI("insert_big_gift_num");
        C79062V1e.LJFF(giftHighTrafficDropMessageConfig2.insertBigGiftNum, writer, "insert_small_gift_num");
        C79062V1e.LJFF(giftHighTrafficDropMessageConfig2.insertSmallGiftNum, writer, "disable_skip_lower_combo");
        C77339UWx.LJFF(giftHighTrafficDropMessageConfig2.disableSkipLowerCombo, writer);
    }
}
