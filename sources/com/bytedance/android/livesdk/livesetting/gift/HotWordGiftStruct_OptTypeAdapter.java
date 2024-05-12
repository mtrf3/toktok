package com.bytedance.android.livesdk.livesetting.gift;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class HotWordGiftStruct_OptTypeAdapter extends TypeAdapter<HotWordGiftStruct> {
    public final Gson LIZ;

    public HotWordGiftStruct_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final HotWordGiftStruct read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        HotWordGiftStruct hotWordGiftStruct = new HotWordGiftStruct(false, 0, 0, 0, null, null, null, 127, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1609594047:
                        if (!LJJ.equals("enabled")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            hotWordGiftStruct.enabled = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -555683018:
                        if (!LJJ.equals("eea_popup_interval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            hotWordGiftStruct.eeaPopupInterval = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -465364434:
                        if (!LJJ.equals("expensive_gift_price")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            hotWordGiftStruct.expensiveGiftPrice = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -149607786:
                        if (!LJJ.equals("freq_control")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            hotWordGiftStruct.frequencyControl = (HotWordGiftStruct.FrequencyControl) C64.LIZ(this.LIZ, HotWordGiftStruct.FrequencyControl.class, reader, "gson.getAdapter(HotWordG…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 138937604:
                        if (!LJJ.equals("row_coins_policy_url")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            hotWordGiftStruct.rowCoinsPolicyUrl = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1474224637:
                        if (!LJJ.equals("eea_coins_policy_url")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            hotWordGiftStruct.eeaCoinsPolicyUrl = LJJIIZI2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1715488864:
                        if (!LJJ.equals("non_recharge_user_max_price")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            hotWordGiftStruct.nonRechargeMaxPrice = reader.LJIJI();
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
        return hotWordGiftStruct;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, HotWordGiftStruct hotWordGiftStruct) {
        HotWordGiftStruct hotWordGiftStruct2 = hotWordGiftStruct;
        o.LJIIIZ(writer, "writer");
        if (hotWordGiftStruct2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enabled");
        writer.LJJIII(hotWordGiftStruct2.enabled);
        writer.LJI("non_recharge_user_max_price");
        C79062V1e.LJFF(hotWordGiftStruct2.nonRechargeMaxPrice, writer, "expensive_gift_price");
        C79062V1e.LJFF(hotWordGiftStruct2.expensiveGiftPrice, writer, "eea_popup_interval");
        C79062V1e.LJFF(hotWordGiftStruct2.eeaPopupInterval, writer, "eea_coins_policy_url");
        writer.LJJ(hotWordGiftStruct2.eeaCoinsPolicyUrl);
        writer.LJI("row_coins_policy_url");
        writer.LJJ(hotWordGiftStruct2.rowCoinsPolicyUrl);
        writer.LJI("freq_control");
        this.LIZ.LJIIJ(HotWordGiftStruct.FrequencyControl.class).write(writer, hotWordGiftStruct2.frequencyControl);
        writer.LJFF();
    }
}
