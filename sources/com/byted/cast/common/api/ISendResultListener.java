package com.byted.cast.common.api;

/* loaded from: classes29.dex */
public interface ISendResultListener {
    void onFailure(int i, String str);

    void onReceive(String str);

    void onSuccess();
}
