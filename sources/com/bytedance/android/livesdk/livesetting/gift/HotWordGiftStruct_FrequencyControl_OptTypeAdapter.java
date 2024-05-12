package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class HotWordGiftStruct_FrequencyControl_OptTypeAdapter extends TypeAdapter<HotWordGiftStruct.FrequencyControl> {
    public HotWordGiftStruct_FrequencyControl_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final HotWordGiftStruct.FrequencyControl read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        HotWordGiftStruct.FrequencyControl frequencyControl = new HotWordGiftStruct.FrequencyControl(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1946992228:
                        if (!LJJ.equals("consecutive_active_days_daily_close_cooldown")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            frequencyControl.consecutiveActiveDaysDailyCloseCoolDownHrs = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -740092190:
                        if (!LJJ.equals("daily_close_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            frequencyControl.dailyCloseCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -688628849:
                        if (!LJJ.equals("session_max_distinct_gift")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            frequencyControl.sessionMaxDistinctGift = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -648384341:
                        if (!LJJ.equals("consecutive_active_days_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            frequencyControl.consecutiveActiveDaysCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -615265270:
                        if (!LJJ.equals("daily_no_interaction_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            frequencyControl.dailyNoInteractionCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -390615938:
                        if (!LJJ.equals("consecutive_active_days_daily_close_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            frequencyControl.consecutiveActiveDaysDailyCloseCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 709166275:
                        if (!LJJ.equals("session_max_single_gift")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            frequencyControl.sessionMaxSingleGift = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1378772624:
                        if (!LJJ.equals("daily_no_interaction_cooldown")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            frequencyControl.dailyNoInteractionCoolDownHrs = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2101677240:
                        if (!LJJ.equals("daily_close_cooldown")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            frequencyControl.dailyCloseCoolDownHrs = reader.LJIJI();
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
        return frequencyControl;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, HotWordGiftStruct.FrequencyControl frequencyControl) {
        HotWordGiftStruct.FrequencyControl frequencyControl2 = frequencyControl;
        o.LJIIIZ(writer, "writer");
        if (frequencyControl2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("session_max_distinct_gift");
        C79062V1e.LJFF(frequencyControl2.sessionMaxDistinctGift, writer, "session_max_single_gift");
        C79062V1e.LJFF(frequencyControl2.sessionMaxSingleGift, writer, "daily_no_interaction_count");
        C79062V1e.LJFF(frequencyControl2.dailyNoInteractionCount, writer, "daily_no_interaction_cooldown");
        C79062V1e.LJFF(frequencyControl2.dailyNoInteractionCoolDownHrs, writer, "daily_close_count");
        C79062V1e.LJFF(frequencyControl2.dailyCloseCount, writer, "daily_close_cooldown");
        C79062V1e.LJFF(frequencyControl2.dailyCloseCoolDownHrs, writer, "consecutive_active_days_count");
        C79062V1e.LJFF(frequencyControl2.consecutiveActiveDaysCount, writer, "consecutive_active_days_daily_close_count");
        C79062V1e.LJFF(frequencyControl2.consecutiveActiveDaysDailyCloseCount, writer, "consecutive_active_days_daily_close_cooldown");
        C77339UWx.LJFF(frequencyControl2.consecutiveActiveDaysDailyCloseCoolDownHrs, writer);
    }
}
