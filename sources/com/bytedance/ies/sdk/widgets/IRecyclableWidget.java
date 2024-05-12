package com.bytedance.ies.sdk.widgets;

/* loaded from: classes6.dex */
public interface IRecyclableWidget {
    boolean isInitialized();

    void onInit(Object[] objArr);

    void onLoad(Object[] objArr);

    void onUnload();

    void resetInternal();
}
