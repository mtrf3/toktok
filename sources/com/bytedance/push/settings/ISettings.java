package com.bytedance.push.settings;

import X.PTB;
import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public interface ISettings {
    void registerValChanged(Context context, String str, String str2, PTB ptb);

    void unregisterValChanged(PTB ptb);

    void updateSettings(Context context, JSONObject jSONObject);
}
