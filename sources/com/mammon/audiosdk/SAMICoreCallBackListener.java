package com.mammon.audiosdk;

import com.mammon.audiosdk.enums.SAMICoreCallBackEventType;
import com.mammon.audiosdk.structures.SAMICoreBlock;

/* loaded from: classes9.dex */
public interface SAMICoreCallBackListener {
    void onMessageReceived(SAMICoreCallBackEventType sAMICoreCallBackEventType, SAMICoreBlock sAMICoreBlock);
}
