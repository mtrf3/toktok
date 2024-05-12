package com.bytedance.ies.sdk.widgets;

import android.view.View;

/* loaded from: classes6.dex */
public interface FluencyOpt {
    View getPreloadLayout(int i);

    void post(Runnable runnable, Object obj);

    void removeMessages(Object obj);

    boolean shouldReleaseAsyncLayoutInflaterTaskQueue();

    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void post$default(FluencyOpt fluencyOpt, Runnable runnable, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 2) != 0) {
                    obj = null;
                }
                fluencyOpt.post(runnable, obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
    }
}
