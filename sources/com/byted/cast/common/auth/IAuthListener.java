package com.byted.cast.common.auth;

/* loaded from: classes29.dex */
public interface IAuthListener {
    void onFailed(int i, String str, Exception exc);

    void onSuccess();
}
