package com.bef.effectsdk.message;

import android.os.Message;

/* loaded from: classes.dex */
public interface MessageInterceptor {
    void destroy();

    boolean intercept(Message message);
}
