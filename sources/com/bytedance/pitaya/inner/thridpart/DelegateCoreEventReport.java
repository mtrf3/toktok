package com.bytedance.pitaya.inner.thridpart;

import com.bytedance.pitaya.api.PitayaProxy;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class DelegateCoreEventReport implements ReflectionCall {
    public static IEventReport mMonitor;
    public static final DelegateCoreEventReport INSTANCE = new DelegateCoreEventReport();
    public static String appVer = "No Version";
    public static final Map<String, Map<String, Long>> notReadyCallMap = new LinkedHashMap();

    private final void reportFirstInvokeTimeInterval() {
        Map<String, Map<String, Long>> map = notReadyCallMap;
        synchronized (map) {
            for (Map.Entry<String, Map<String, Long>> entry : map.entrySet()) {
                for (Map.Entry<String, Long> entry2 : entry.getValue().entrySet()) {
                    int currentTimeMillis = (int) (System.currentTimeMillis() - entry2.getValue().longValue());
                    IEventReport iEventReport = mMonitor;
                    if (iEventReport != null) {
                        iEventReport.reportEvent("pitaya2_plugin_time", new JSONObject().put("app_ver", appVer).put("aid", entry.getKey()).put("sdk_ver", "2.8.0").put("sdk_build_ver", "2.8.0-rc.58").put("nm", entry2.getKey()), new JSONObject().put("dur", currentTimeMillis / 1000.0d), null);
                    }
                }
            }
        }
    }

    private final void reportRunTaskBeforeReady() {
        Map<String, Map<String, Long>> map = notReadyCallMap;
        synchronized (map) {
            for (Map.Entry<String, Map<String, Long>> entry : map.entrySet()) {
                for (Map.Entry<String, Long> entry2 : entry.getValue().entrySet()) {
                    IEventReport iEventReport = mMonitor;
                    if (iEventReport != null) {
                        iEventReport.reportEvent("pitaya2_task", new JSONObject().put("app_ver", appVer).put("sdk_ver", "2.8.0").put("sdk_build_ver", "2.8.0-rc.58").put("nm", entry2.getKey()).put("call", "api").put("aid", entry.getKey()).put("rst", PTYErrorCode.PITAYA_IMPL_NOT_READY.getCode()), null, new JSONObject().put("ts", entry2.getValue().longValue()));
                    }
                }
            }
        }
    }

    private final void reportFeatureCache() {
        int applogCacheSize = PitayaProxy.applogCacheSize();
        IEventReport iEventReport = mMonitor;
        if (iEventReport != null) {
            iEventReport.reportEvent("pitaya2_fe_cold_start", new JSONObject().put("app_ver", appVer).put("aid", 3691).put("sdk_ver", "2.8.0").put("sdk_build_ver", "2.8.0-rc.58"), new JSONObject().put("applog_num", applogCacheSize).put("fe_store_num", 0), null);
        }
    }

    public final void onReady() {
        reportRunTaskBeforeReady();
        reportFirstInvokeTimeInterval();
        reportFeatureCache();
    }

    public final IEventReport getMMonitor() {
        return mMonitor;
    }

    public final void setMMonitor(IEventReport iEventReport) {
        mMonitor = iEventReport;
    }

    public final void notReadyCall$pitayacore_release(String aid, String businessName) {
        o.LJIIJ(aid, "aid");
        o.LJIIJ(businessName, "businessName");
        Map<String, Map<String, Long>> map = notReadyCallMap;
        synchronized (map) {
            Map<String, Long> map2 = map.get(aid);
            if (map2 == null) {
                map2 = new LinkedHashMap<>();
                map.put(aid, map2);
            }
            if (!map2.containsKey(businessName)) {
                map2.put(businessName, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
