package com.bytedance.ies.sdk.widgets;

/* loaded from: classes13.dex */
public interface PropertyResolver {
    float getResolvedAlpha(int i);

    float getResolvedTranslationX(int i);

    float getResolvedTranslationY(int i);

    int getResolvedVisibility(int i);

    void onHiddenChanged(int i, boolean z);
}
