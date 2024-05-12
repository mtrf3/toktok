package com.bytedance.router;

import android.content.Intent;

/* loaded from: classes11.dex */
public interface OpenResultCallback {
    void onActionResult(Object obj);

    void onEmpty();

    void onFail(String str, String str2);

    void onIntercept(String str);

    void onMatched(String str);

    void onMissed(String str);

    void onOpen(Intent intent);

    void onSuccess(Intent intent);
}
