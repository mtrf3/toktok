package com.bytedance.pumbaa.common.impl.applog;

import com.bytedance.pumbaa.common.interfaces.IAppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class AppLogImpl implements IAppLog {
    @Override // com.bytedance.pumbaa.common.interfaces.IAppLog
    public final void log(String eventName, JSONObject jSONObject) {
        o.LJIIIZ(eventName, "eventName");
        AppLogNewUtils.onEventV3(eventName, jSONObject);
    }
}
