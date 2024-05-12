package com.ss.ugc.live.sdk.message.data;

import X.C1FJ;
import X.X1D;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes16.dex */
public class ProtoApiResult {
    public String compressType;
    public String cursor;
    public long delayTimeBeforeDispatch;
    public long dimension;
    public long enterUniqueId;
    public Map<String, Object> extraParams;
    public long fetchInterval;
    public int fetchType;
    public long heartbeatDuration;
    public String historyCommentCursor;
    public boolean historyNoMore;
    public String internalExt;
    public boolean isFirst;
    public long logId;
    public int messageFrom;
    public List<IMessage> messages;
    public boolean needAck;
    public long now;
    public String payloadType;
    public List<ProtoMessage> protoMessages;
    public String pushServer;
    public long receiveMessageTime;
    public Map<String, String> routeParams;

    /* loaded from: classes6.dex */
    public static final class ProtoMessage {
        public boolean isHistoryMsg;
        public String method;
        public long msgId;
        public int msgType;
        public byte[] payload;
    }

    public String getFormatRouteParams() {
        if (this.routeParams == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : this.routeParams.entrySet()) {
            if (entry != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append((String) C1FJ.LIZJ(LIZ, entry.getKey(), "=", entry));
                arrayList.add(X1D.LIZIZ(LIZ));
            }
        }
        return TextUtils.join("&", arrayList);
    }

    public String getFormatAckInfo() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("log id is ");
        LIZ.append(this.logId);
        LIZ.append(", internal ext is ");
        LIZ.append(this.internalExt);
        return X1D.LIZIZ(LIZ);
    }
}
