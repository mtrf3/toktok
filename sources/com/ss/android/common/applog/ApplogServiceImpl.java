package com.ss.android.common.applog;

import X.C16880lQ;
import X.InterfaceC1294656g;
import android.content.Context;
import com.service.middleware.applog.ApplogService;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ApplogServiceImpl implements ApplogService {
    public static final String TAG = C16880lQ.LJLLJ(ApplogServiceImpl.class);
    public static volatile boolean isServicePrepared = false;
    public static volatile InterfaceC1294656g cachedHeaderCustomTimelyCallback = null;

    public static void handleCachedData() {
        if (isServicePrepared && cachedHeaderCustomTimelyCallback != null) {
            AppLog.registerHeaderCustomCallback(cachedHeaderCustomTimelyCallback);
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void registerHeaderCustomCallback(InterfaceC1294656g interfaceC1294656g) {
        if (isServicePrepared) {
            AppLog.registerHeaderCustomCallback(interfaceC1294656g);
        } else {
            cachedHeaderCustomTimelyCallback = interfaceC1294656g;
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str) {
        if (isServicePrepared) {
            AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(context, "event_v1", str, null, 0L, 0L, false, null);
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2) {
        if (isServicePrepared) {
            AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(context, "event_v1", str, str2, 0L, 0L, false, null);
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2) {
        if (isServicePrepared) {
            AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(context, str, str2, str3, j, j2, false, null);
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (isServicePrepared) {
            AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(context, str, str2, str3, j, j2, false, jSONObject);
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z) {
        if (isServicePrepared) {
            AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(context, str, str2, str3, j, j2, z, null);
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        if (isServicePrepared) {
            AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(context, str, str2, str3, j, j2, z, jSONObject);
        }
    }
}
