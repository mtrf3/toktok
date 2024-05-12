package com.bytedance.pitaya.thirdcomponent.crash;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.Map;

/* loaded from: classes30.dex */
public interface CrashExtraInfoCallback extends ReflectionCall {
    Map<String, String> getCrashExtraInfo();
}
