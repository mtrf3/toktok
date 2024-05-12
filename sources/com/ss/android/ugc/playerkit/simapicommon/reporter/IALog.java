package com.ss.android.ugc.playerkit.simapicommon.reporter;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public interface IALog {
    void d(String str);

    void d(String str, JSONObject jSONObject);

    void e(String str, String str2);

    void e(String str, JSONObject jSONObject);

    void i(String str, JSONObject jSONObject);

    boolean isEnabled();

    void w(String str, JSONObject jSONObject);
}
