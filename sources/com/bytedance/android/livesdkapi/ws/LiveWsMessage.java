package com.bytedance.android.livesdkapi.ws;

import X.C77800Ug8;
import X.Q89;
import X.X1D;
import Y.IDCreatorS54S0000000_11;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class LiveWsMessage implements Parcelable {
    public static final Parcelable.Creator<LiveWsMessage> CREATOR = new IDCreatorS54S0000000_11(1);
    public static LiveWsMessage EMPTY = new LiveWsMessage();
    public int channelId;
    public long logId;
    public int method;
    public List<MsgHeader> msgHeaders;
    public byte[] payload;
    public String payloadEncoding;
    public String payloadType;
    public ComponentName replayToComponentName;
    public long seqId;
    public int service;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* loaded from: classes12.dex */
    public static class MsgHeader implements Parcelable {
        public static final Parcelable.Creator<MsgHeader> CREATOR = new IDCreatorS54S0000000_11(0);
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

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveWsMessage{, channelId = ");
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

    public LiveWsMessage() {
    }

    public LiveWsMessage(Parcel parcel) {
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
    }

    public LiveWsMessage(int i, long j, long j2, int i2, int i3, List<MsgHeader> list, String str, String str2, byte[] bArr, ComponentName componentName) {
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
