package com.bytedance.apm.agent.helper;

import X.OIO;
import com.bytedance.apm.agent.monitor.MonitorTool;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PageShowHelper {
    public static void onPageShowHideAction(Object obj, boolean z) {
        String name;
        String str;
        if (obj instanceof String) {
            name = (String) obj;
        } else {
            name = obj.getClass().getName();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (obj instanceof IPageMonitor) {
                jSONObject.put("label", ((IPageMonitor) obj).getMonitorLabel());
            }
        } catch (Exception unused) {
        }
        if (z) {
            str = "page_show";
            OIO.LIZ.LIZIZ().getClass();
        } else {
            str = "page_hide";
        }
        MonitorTool.monitorUIAction(str, name, jSONObject);
    }
}
