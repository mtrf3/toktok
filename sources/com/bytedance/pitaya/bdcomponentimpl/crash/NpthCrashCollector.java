package com.bytedance.pitaya.bdcomponentimpl.crash;

import X.C93325aP3;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.pitaya.thirdcomponent.crash.CrashExtraInfoCallback;
import com.bytedance.pitaya.thirdcomponent.crash.CrashInfoCollector;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class NpthCrashCollector implements CrashInfoCollector {
    @Override // com.bytedance.pitaya.thirdcomponent.crash.CrashInfoCollector
    public void addCustomTags(Map<String, String> map) {
        o.LJIIJ(map, "map");
        Npth.addTags(map);
    }

    public void registerCallback(int i, CrashExtraInfoCallback callback) {
        CrashType crashType;
        o.LJIIJ(callback, "callback");
        C93325aP3 c93325aP3 = new C93325aP3(callback);
        if (i != 0) {
            if (i != 1) {
                crashType = CrashType.ALL;
            } else {
                crashType = CrashType.NATIVE;
            }
        } else {
            crashType = CrashType.JAVA;
        }
        Npth.addAttachUserData(c93325aP3, crashType);
    }

    @Override // com.bytedance.pitaya.thirdcomponent.stddelegate.CallbackRegister
    public /* bridge */ /* synthetic */ void registerCallback(Integer num, CrashExtraInfoCallback crashExtraInfoCallback) {
        registerCallback(num.intValue(), crashExtraInfoCallback);
    }
}
