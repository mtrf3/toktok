package com.ss.android.ugc.aweme.services.publish;

import X.V0N;

/* loaded from: classes8.dex */
public enum AVPublishExtensionBiz {
    POI(2);

    public final int value;

    public static AVPublishExtensionBiz valueOf(String str) {
        return (AVPublishExtensionBiz) V0N.LJJJ(AVPublishExtensionBiz.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    AVPublishExtensionBiz(int i) {
        this.value = i;
    }
}
