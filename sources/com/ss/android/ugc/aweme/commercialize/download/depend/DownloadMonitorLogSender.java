package com.ss.android.ugc.aweme.commercialize.download.depend;

import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class DownloadMonitorLogSender implements IMonitorLogSendDepend {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend
    public void sendMonitorLog(String eventName, JSONObject monitorLogJson) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(monitorLogJson, "monitorLogJson");
        AppLogNewUtils.onEventV3(eventName, monitorLogJson);
    }
}
