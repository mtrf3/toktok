package com.bytedance.android.livesdk.model.message.tracking;

import X.CR6;

/* loaded from: classes6.dex */
public class IdReasonMessage extends IdMessage {
    public final String reason;

    public static IdReasonMessage from(CR6 cr6, String str) {
        return new IdReasonMessage(cr6.getMessageType().getWsMethod(), cr6.isLocalInsertMsg, cr6.getMessageId(), str);
    }

    public IdReasonMessage(String str, boolean z, long j, String str2) {
        super(str, z, j);
        this.reason = str2;
    }
}
