package com.ss.android.ugc.aweme.im.sdk.share.sendto;

import X.X1D;
import defpackage.q;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SendResultEvent {
    public final String receiverUid;
    public final int sendMessageScene;
    public final int sendMessageStatus;

    public static /* synthetic */ SendResultEvent copy$default(SendResultEvent sendResultEvent, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sendResultEvent.sendMessageScene;
        }
        if ((i3 & 2) != 0) {
            i2 = sendResultEvent.sendMessageStatus;
        }
        if ((i3 & 4) != 0) {
            str = sendResultEvent.receiverUid;
        }
        return sendResultEvent.copy(i, i2, str);
    }

    public final SendResultEvent copy(int i, int i2, String str) {
        return new SendResultEvent(i, i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendResultEvent)) {
            return false;
        }
        SendResultEvent sendResultEvent = (SendResultEvent) obj;
        return this.sendMessageScene == sendResultEvent.sendMessageScene && this.sendMessageStatus == sendResultEvent.sendMessageStatus && o.LJ(this.receiverUid, sendResultEvent.receiverUid);
    }

    public int hashCode() {
        int i = ((this.sendMessageScene * 31) + this.sendMessageStatus) * 31;
        String str = this.receiverUid;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sendMessageScene", Integer.valueOf(this.sendMessageScene));
        linkedHashMap.put("sendMessageStatus", Integer.valueOf(this.sendMessageStatus));
        String str = this.receiverUid;
        if (str != null) {
            linkedHashMap.put("receiverUid", str);
        }
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendResultEvent(sendMessageScene=");
        LIZ.append(this.sendMessageScene);
        LIZ.append(", sendMessageStatus=");
        LIZ.append(this.sendMessageStatus);
        LIZ.append(", receiverUid=");
        return q.LIZIZ(LIZ, this.receiverUid, ')', LIZ);
    }

    public final String getReceiverUid() {
        return this.receiverUid;
    }

    public final int getSendMessageScene() {
        return this.sendMessageScene;
    }

    public final int getSendMessageStatus() {
        return this.sendMessageStatus;
    }

    public SendResultEvent(int i, int i2, String str) {
        this.sendMessageScene = i;
        this.sendMessageStatus = i2;
        this.receiverUid = str;
    }
}
