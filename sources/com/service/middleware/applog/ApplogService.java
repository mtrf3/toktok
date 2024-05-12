package com.service.middleware.applog;

import X.InterfaceC1294656g;
import android.content.Context;
import com.bytedance.news.common.service.manager.IService;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface ApplogService extends IService {
    void onEvent(Context context, String str);

    void onEvent(Context context, String str, String str2);

    void onEvent(Context context, String str, String str2, String str3, long j, long j2);

    void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject);

    void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z);

    void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject);

    void registerHeaderCustomCallback(InterfaceC1294656g interfaceC1294656g);
}
