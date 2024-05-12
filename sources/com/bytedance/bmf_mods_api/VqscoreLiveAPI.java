package com.bytedance.bmf_mods_api;

import android.content.Context;
import java.util.Map;

/* loaded from: classes11.dex */
public interface VqscoreLiveAPI {
    void DownloadModel(Context context, Map<String, String> map);

    void Free();

    int Init(int i, int i2, boolean z, String str);

    float Process(int i, int i2, int i3);

    void SetCallback(e eVar);
}
