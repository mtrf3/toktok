package com.bytedance.bae.base;

import com.bytedance.bae.ByteAudioModeStrategyTable;

/* loaded from: classes17.dex */
public class Utils {
    public static int convertAudioModeStrategyTable(ByteAudioModeStrategyTable byteAudioModeStrategyTable) {
        ByteAudioModeStrategyTable.Option option = byteAudioModeStrategyTable.buildIn;
        int i = 0;
        ByteAudioModeStrategyTable.Option option2 = byteAudioModeStrategyTable.wiredHeadset;
        ByteAudioModeStrategyTable.Option option3 = byteAudioModeStrategyTable.btHeadset;
        ByteAudioModeStrategyTable.Mode[] modeArr = {option.micOn, option.micOff, option2.micOn, option2.micOff, option3.micOn, option3.micOff};
        int i2 = 0;
        do {
            i2 |= modeArr[i].value << i;
            i++;
        } while (i < 6);
        return i2;
    }
}
