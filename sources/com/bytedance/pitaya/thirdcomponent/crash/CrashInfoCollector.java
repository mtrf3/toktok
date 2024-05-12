package com.bytedance.pitaya.thirdcomponent.crash;

import X.C93296aOa;
import com.bytedance.pitaya.thirdcomponent.stddelegate.CallbackRegister;
import java.util.Map;

/* loaded from: classes30.dex */
public interface CrashInfoCollector extends CallbackRegister<Integer, CrashExtraInfoCallback> {
    public static final C93296aOa Companion = C93296aOa.LIZ;

    void addCustomTags(Map<String, String> map);
}
