package com.bytedance.common.wschannel.model;

import X.C16880lQ;
import X.C36842Ed4;
import X.C77800Ug8;
import X.EnumC66865QMb;
import X.Q89;
import X.X1D;
import Y.IDCreatorS54S0000000_11;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class WsChannelMsg implements Parcelable {
    public static final Parcelable.Creator<WsChannelMsg> CREATOR = new IDCreatorS54S0000000_11(9);
    public static WsChannelMsg EMPTY = new WsChannelMsg();
    public int channelId;
    public boolean isAckMsg;
    public long logId;
    public String logInfo;
    public int method;
    public List<MsgHeader> msgHeaders;
    public String msgId;
    public NewMsgTimeHolder newMsgTimeHolder;
    public byte[] payload;
    public String payloadEncoding;
    public String payloadType;
    public transient long receiveDataFromIpcTs;
    public ComponentName replayToComponentName;
    public long seqId;
    public String serverTiming;
    public int service;
    public EnumC66865QMb state;
    public String uuid;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* loaded from: classes12.dex */
    public static class MsgHeader implements Parcelable {
        public static final Parcelable.Creator<MsgHeader> CREATOR = new IDCreatorS54S0000000_11(8);
        public String key;
        public String value;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MsgHeader{key='");
            Q89.LIZIZ(LIZ, this.key, '\'', ", value='");
            return C77800Ug8.LIZJ(LIZ, this.value, '\'', '}', LIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.key);
            parcel.writeString(this.value);
        }
    }

    public final byte[] LIZ() {
        if (this.payload == null) {
            this.payload = new byte[1];
        }
        return this.payload;
    }

    public final Map<String, String> LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("seqId", String.valueOf(this.seqId));
        linkedHashMap.put("logId", String.valueOf(this.logId));
        linkedHashMap.put("service", String.valueOf(this.service));
        linkedHashMap.put("method", String.valueOf(this.method));
        linkedHashMap.put("payloadEncoding", this.payloadEncoding);
        linkedHashMap.put("payloadType", this.payloadType);
        try {
            linkedHashMap.put("payload_md5", C36842Ed4.LIZ(MessageDigest.getInstance("MD5").digest(this.payload)));
        } catch (NoSuchAlgorithmException e) {
            C16880lQ.LLLLIIL(e);
        }
        linkedHashMap.put("channelId", String.valueOf(this.channelId));
        for (MsgHeader msgHeader : this.msgHeaders) {
            linkedHashMap.put(msgHeader.key, msgHeader.value);
        }
        return linkedHashMap;
    }

    public WsChannelMsg() {
        this.state = EnumC66865QMb.Default;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WsChannelMsg{, channelId = ");
        LIZ.append(this.channelId);
        LIZ.append(", logId=");
        LIZ.append(this.logId);
        LIZ.append(", service=");
        LIZ.append(this.service);
        LIZ.append(", method=");
        LIZ.append(this.method);
        LIZ.append(", msgHeaders=");
        LIZ.append(this.msgHeaders);
        LIZ.append(", payloadEncoding='");
        Q89.LIZIZ(LIZ, this.payloadEncoding, '\'', ", payloadType='");
        Q89.LIZIZ(LIZ, this.payloadType, '\'', ", payload=");
        LIZ.append(Arrays.toString(this.payload));
        LIZ.append(", replayToComponentName=");
        LIZ.append(this.replayToComponentName);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public WsChannelMsg(Parcel parcel) {
        boolean z;
        this.state = EnumC66865QMb.Default;
        this.seqId = parcel.readLong();
        this.logId = parcel.readLong();
        this.service = parcel.readInt();
        this.method = parcel.readInt();
        this.msgHeaders = parcel.createTypedArrayList(MsgHeader.CREATOR);
        this.payloadEncoding = parcel.readString();
        this.payloadType = parcel.readString();
        this.payload = parcel.createByteArray();
        this.replayToComponentName = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.channelId = parcel.readInt();
        this.uuid = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAckMsg = z;
        this.state = EnumC66865QMb.valueOf(parcel.readInt());
        this.newMsgTimeHolder = (NewMsgTimeHolder) parcel.readParcelable(NewMsgTimeHolder.class.getClassLoader());
        this.logInfo = parcel.readString();
        this.serverTiming = parcel.readString();
        this.msgId = parcel.readString();
    }

    public WsChannelMsg(WsChannelMsg wsChannelMsg) {
        this.state = EnumC66865QMb.Default;
        this.seqId = wsChannelMsg.seqId;
        this.logId = wsChannelMsg.logId;
        this.service = wsChannelMsg.service;
        this.method = wsChannelMsg.method;
        this.msgHeaders = wsChannelMsg.msgHeaders;
        this.payload = wsChannelMsg.LIZ();
        this.payloadEncoding = wsChannelMsg.payloadEncoding;
        this.payloadType = wsChannelMsg.payloadType;
        this.channelId = wsChannelMsg.channelId;
        this.replayToComponentName = wsChannelMsg.replayToComponentName;
        this.newMsgTimeHolder = wsChannelMsg.newMsgTimeHolder;
        this.isAckMsg = wsChannelMsg.isAckMsg;
        this.uuid = wsChannelMsg.uuid;
        this.state = wsChannelMsg.state;
        this.logInfo = wsChannelMsg.logInfo;
        this.serverTiming = wsChannelMsg.serverTiming;
        this.msgId = wsChannelMsg.msgId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.seqId);
        parcel.writeLong(this.logId);
        parcel.writeInt(this.service);
        parcel.writeInt(this.method);
        parcel.writeTypedList(this.msgHeaders);
        parcel.writeString(this.payloadEncoding);
        parcel.writeString(this.payloadType);
        parcel.writeByteArray(this.payload);
        parcel.writeParcelable(this.replayToComponentName, i);
        parcel.writeInt(this.channelId);
        parcel.writeString(this.uuid);
        parcel.writeByte(this.isAckMsg ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.state.getTypeValue());
        parcel.writeParcelable(this.newMsgTimeHolder, i);
        parcel.writeString(this.logInfo);
        parcel.writeString(this.serverTiming);
        parcel.writeString(this.msgId);
    }

    public WsChannelMsg(int i, long j, long j2, int i2, int i3, List<MsgHeader> list, String str, String str2, byte[] bArr, ComponentName componentName) {
        this.state = EnumC66865QMb.Default;
        this.channelId = i;
        this.seqId = j;
        this.logId = j2;
        this.service = i2;
        this.method = i3;
        this.msgHeaders = list;
        this.payloadEncoding = str;
        this.payloadType = str2;
        this.payload = bArr;
        this.replayToComponentName = componentName;
    }
}
