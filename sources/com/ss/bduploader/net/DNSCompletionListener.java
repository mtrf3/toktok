package com.ss.bduploader.net;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public interface DNSCompletionListener {
    void onCancelled();

    void onCompletion(JSONObject jSONObject, Error error);

    void onRetry(Error error);
}
