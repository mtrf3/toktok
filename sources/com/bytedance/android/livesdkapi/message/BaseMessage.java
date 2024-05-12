package com.bytedance.android.livesdkapi.message;

import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.O1A;
import android.os.SystemClock;
import com.ss.ugc.live.sdk.message.data.MessageTrackTimeInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class BaseMessage {

    @InterfaceC65349Pkn("common")
    public CommonMessageData baseMessage;
    public int notifyMsgSampleLogState;
    public long receiveTime;
    public transient long timestamp;

    @O1A
    public transient EnumC31509CYf type = EnumC31509CYf.DEFAULT;
    public volatile long localTimestamp = SystemClock.elapsedRealtime();
    public final Map<String, Object> mExtraParams = new ConcurrentHashMap();
    public MessageTrackTimeInfo messageTrackTimeInfo = new MessageTrackTimeInfo();

    public boolean canText() {
        return false;
    }

    public MessageTrackTimeInfo getMessageTrackTimeInfo() {
        return this.messageTrackTimeInfo;
    }

    public EnumC31509CYf getMessageType() {
        return this.type;
    }

    public boolean isCurrentRoom(long j) {
        long j2;
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null) {
            j2 = commonMessageData.roomId;
        } else {
            j2 = 0;
        }
        if (j != 0 && j == j2) {
            return true;
        }
        return false;
    }
}
