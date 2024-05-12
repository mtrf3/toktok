package com.bytedance.ies.common;

import X.C16880lQ;
import X.C63948P7w;
import X.IVC;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class IESAppLogger {
    public String appId;
    public IVC appLoggerCallback;
    public Boolean initFlag;
    public Boolean isAbroad;
    public static final Object object = new Object();
    public static volatile IESAppLogger instance = null;

    public static IESAppLogger sharedInstance() {
        IESAppLogger iESAppLogger;
        if (instance != null) {
            return instance;
        }
        synchronized (object) {
            if (instance == null) {
                instance = new IESAppLogger();
            }
            iESAppLogger = instance;
        }
        return iESAppLogger;
    }

    public IESAppLogger() {
        Boolean bool = Boolean.FALSE;
        this.initFlag = bool;
        this.appId = null;
        this.isAbroad = bool;
    }

    public static JSONObject copyJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        LinkedList linkedList = new LinkedList();
        Iterator<String> keys = jSONObject.keys();
        if (keys == null) {
            return new JSONObject();
        }
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return jSONObject;
        }
    }

    public void appLogOnEvent(String str, String str2, String str3) {
        appLogOnEvent(str, str2, str3, false);
    }

    public void setAppLogCallback(String str, IVC ivc, boolean z) {
        if (this.initFlag.booleanValue()) {
            return;
        }
        synchronized (object) {
            if (!this.initFlag.booleanValue()) {
                this.appId = str;
                this.appLoggerCallback = ivc;
                this.initFlag = Boolean.TRUE;
                this.isAbroad = Boolean.valueOf(z);
            }
        }
    }

    public void appLogOnEvent(String str, JSONObject jSONObject, String str2) {
        appLogOnEvent(str, jSONObject, str2, false);
    }

    public void appLogOnEvent(String str, JSONObject jSONObject, String str2, boolean z) {
        if (this.appLoggerCallback == null) {
            return;
        }
        if (z) {
            ((C63948P7w) this.appLoggerCallback).LIZ(str, str2, copyJson(jSONObject));
        }
        JSONObject copyJson = copyJson(jSONObject);
        try {
            if (this.isAbroad.booleanValue()) {
                copyJson.put("second_appid", "2780");
                copyJson.put("second_appname", "vesdk_abroad");
            } else {
                copyJson.put("second_appid", "1357");
                copyJson.put("second_appname", "video_editor_sdk");
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        ((C63948P7w) this.appLoggerCallback).LIZ(str, str2, copyJson);
    }

    public void appLogOnEvent(String str, String str2, String str3, boolean z) {
        JSONObject jSONObject;
        if (this.appLoggerCallback == null) {
            return;
        }
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            jSONObject = new JSONObject();
        }
        appLogOnEvent(str, jSONObject, str3, z);
    }
}
