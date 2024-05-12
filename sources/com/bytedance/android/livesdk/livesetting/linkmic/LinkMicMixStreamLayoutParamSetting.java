package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09650Zl;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.internal.m;
import java.util.HashMap;

@SettingsKey("mix_stream_layout_param")
/* loaded from: classes11.dex */
public final class LinkMicMixStreamLayoutParamSetting {
    public static final LinkMicMixStreamLayoutParamSetting INSTANCE = new LinkMicMixStreamLayoutParamSetting();

    @Group(isDefault = true, value = "default group")
    public static final HashMap<String, m<String, Object>> DEFAULT = new HashMap<>();

    public final HashMap<String, m<String, Object>> getValue() {
        return (HashMap) SettingsManager.INSTANCE.getValueSafely(LinkMicMixStreamLayoutParamSetting.class);
    }

    public final LinkMicMixStreamLayoutParam getLinkMicMixStreamLayoutParam(String str) {
        m<String, Object> mVar;
        Gson gson = C09650Zl.LIZIZ;
        HashMap<String, m<String, Object>> value = getValue();
        if (value != null) {
            mVar = value.get(str);
        } else {
            mVar = null;
        }
        return (LinkMicMixStreamLayoutParam) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJsonTree(gson, mVar), LinkMicMixStreamLayoutParam.class);
    }
}
