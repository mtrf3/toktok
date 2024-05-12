package com.ss.android.ugc.aweme.services.publish;

import X.V0N;

/* loaded from: classes8.dex */
public enum AVPublishExtensionVisible {
    VISIBLE(0),
    GRAY(1),
    GONE(2);

    public final int value;

    public static AVPublishExtensionVisible valueOf(String str) {
        return (AVPublishExtensionVisible) V0N.LJJJ(AVPublishExtensionVisible.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    AVPublishExtensionVisible(int i) {
        this.value = i;
    }
}
