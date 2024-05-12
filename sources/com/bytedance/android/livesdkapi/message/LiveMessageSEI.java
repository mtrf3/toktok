package com.bytedance.android.livesdkapi.message;

import X.InterfaceC65349Pkn;
import com.ss.ugc.live.sdk.message.data.MessageID;
import com.ss.ugc.live.sdk.message.data.MessageSEI;

/* loaded from: classes6.dex */
public class LiveMessageSEI {

    @InterfaceC65349Pkn("timestamp")
    public long timestamp;

    @InterfaceC65349Pkn("unique_id")
    public LiveMessageID uniqueID;

    public final MessageSEI LIZ(long j) {
        MessageID messageID;
        MessageSEI messageSEI = new MessageSEI();
        LiveMessageID liveMessageID = this.uniqueID;
        if (liveMessageID != null) {
            messageID = new MessageID();
            messageID.primaryID = liveMessageID.primaryID;
            messageID.messageScene = liveMessageID.messageScene;
        } else {
            messageID = null;
        }
        messageSEI.uniqueID = messageID;
        messageSEI.timestamp = this.timestamp;
        messageSEI.localTimestamp = j;
        return messageSEI;
    }
}
