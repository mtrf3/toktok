package com.bytedance.android.livesdk.dataChannel;

import com.bytedance.ies.sdk.datachannel.Channel;

/* loaded from: classes14.dex */
public abstract class BasePreviewWidgetVisibilityChannel extends Channel<Boolean> {
    public final boolean defaultValue;

    public final boolean getDefaultValue() {
        return this.defaultValue;
    }

    public BasePreviewWidgetVisibilityChannel(boolean z) {
        super(Boolean.valueOf(z));
        this.defaultValue = z;
    }
}
