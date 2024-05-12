package com.ss.mediakit.net;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class AVMDLNetClient {

    /* loaded from: classes9.dex */
    public interface CompletionListener {
        void onCompletion(JSONObject jSONObject, Error error);
    }

    public void cancel() {
    }

    public void startTask(String str, CompletionListener completionListener) {
    }

    public void startTask(String str, Map<String, String> map, CompletionListener completionListener) {
    }

    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, CompletionListener completionListener) {
    }
}
