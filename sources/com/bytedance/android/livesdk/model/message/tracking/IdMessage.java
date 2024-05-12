package com.bytedance.android.livesdk.model.message.tracking;

import X.CR6;

/* loaded from: classes6.dex */
public class IdMessage extends EventTrackingMessage {
    public final long messageId;

    public static IdMessage from(CR6 cr6) {
        return new IdMessage(cr6.getMessageType().getWsMethod(), !cr6.isLocalInsertMsg, cr6.getMessageId());
    }

    public IdMessage(String str, boolean z, long j) {
        super(str, z);
        this.messageId = j;
    }
}
