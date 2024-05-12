package com.bytedance.services.apm.api;

import X.InterfaceC64087PDf;
import com.bytedance.news.common.service.manager.IService;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public interface IMonitorLogManager extends IService {
    void deleteLegacyLogByIds(String str, String str2);

    void getLegacyLog(long j, long j2, String str, InterfaceC64087PDf interfaceC64087PDf);

    List<JSONObject> getRecentUiActionRecords();
}
