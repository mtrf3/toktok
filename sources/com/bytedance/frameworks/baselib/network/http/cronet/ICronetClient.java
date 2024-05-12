package com.bytedance.frameworks.baselib.network.http.cronet;

import android.content.Context;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public interface ICronetClient {

    /* loaded from: classes12.dex */
    public interface ICronetBootFailureChecker {
        boolean isCronetBootFailureExpected();
    }

    int getCronetInternalErrorCode(HttpURLConnection httpURLConnection);

    String getCronetVersion();

    void getRequestMetrics(HttpURLConnection httpURLConnection, Map<String, Object> map);

    boolean isCronetHttpURLConnection(HttpURLConnection httpURLConnection);

    HttpURLConnection openConnection(Context context, String str, boolean z, String str2, Executor executor);

    void setCronetBootFailureChecker(ICronetBootFailureChecker iCronetBootFailureChecker);

    void setCronetEngine(Context context, boolean z, boolean z2, boolean z3, boolean z4, String str, Executor executor, boolean z5);
}
