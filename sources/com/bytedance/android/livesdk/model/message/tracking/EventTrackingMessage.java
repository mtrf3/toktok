package com.bytedance.android.livesdk.model.message.tracking;

/* loaded from: classes6.dex */
public class EventTrackingMessage {
    public final String method;
    public final String source;

    public EventTrackingMessage(String str, boolean z) {
        this.method = str;
        if (z) {
            this.source = "remote";
        } else {
            this.source = "native";
        }
    }
}
