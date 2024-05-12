package com.ss.android.ugc.aweme.pitaya;

import X.C38421F6b;
import X.C38424F6e;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public interface IPitayaBundle {
    public static final C38424F6e Companion = C38424F6e.LIZ;

    boolean initPitaya(C38421F6b c38421F6b);

    void initPitayaProxy(Context context);

    void onAppLogEvent(String str, String str2);

    void onCustomAppLog(String str, JSONObject jSONObject);

    boolean releaseArtSoterByName(String str);

    boolean runArtSoterByName(String str, Bitmap bitmap, JSONObject jSONObject, PTYTaskResultCallback pTYTaskResultCallback);

    int setDebugWebSocketUrl(String str);
}
