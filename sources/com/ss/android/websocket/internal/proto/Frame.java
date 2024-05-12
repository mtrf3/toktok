package com.ss.android.websocket.internal.proto;

import X.C278817o;
import X.C63685Oz3;
import X.C64537PUn;
import X.C66638QDi;
import X.C66639QDj;
import X.C66640QDk;
import X.C77339UWx;
import X.DIX;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class Frame extends Message<Frame, C66639QDj> implements Parcelable {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.ss.android.websocket.internal.proto.Frame$ExtendedEntry#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<C66640QDk> headers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long logid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 8)
    public final C64537PUn payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String payload_encoding;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String payload_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long seqid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer service;
    public static final ProtoAdapter<Frame> ADAPTER = new C66638QDi();
    public static final Long DEFAULT_SEQID = 0L;
    public static final Long DEFAULT_LOGID = 0L;
    public static final Integer DEFAULT_SERVICE = 0;
    public static final Integer DEFAULT_METHOD = 0;
    public static final C64537PUn DEFAULT_PAYLOAD = C64537PUn.EMPTY;
    public static final Parcelable.Creator<Frame> CREATOR = new IDCreatorS54S0000000_11(68);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getMethod() {
        return this.method.intValue();
    }

    public Map<String, String> getMsgHeaders() {
        List<C66640QDk> list = this.headers;
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C66640QDk c66640QDk : this.headers) {
            if (c66640QDk != null) {
                hashMap.put(c66640QDk.key, c66640QDk.value);
            }
        }
        return hashMap;
    }

    public byte[] getPayload() {
        C64537PUn c64537PUn = this.payload;
        if (c64537PUn == null) {
            return null;
        }
        return c64537PUn.toByteArray();
    }

    public long getSeqId() {
        return this.seqid.longValue();
    }

    public int getService() {
        return this.service.intValue();
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 == 0) {
            int LIZ = C77339UWx.LIZ(this.headers, (this.method.hashCode() + ((this.service.hashCode() + ((this.logid.hashCode() + ((this.seqid.hashCode() + (unknownFields().hashCode() * 37)) * 37)) * 37)) * 37)) * 37, 37);
            String str = this.payload_encoding;
            int i4 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i5 = (LIZ + i) * 37;
            String str2 = this.payload_type;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            C64537PUn c64537PUn = this.payload;
            if (c64537PUn != null) {
                i4 = c64537PUn.hashCode();
            }
            int i7 = i6 + i4;
            this.hashCode = i7;
            return i7;
        }
        return i3;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<Frame, C66639QDj> newBuilder2() {
        C66639QDj c66639QDj = new C66639QDj();
        c66639QDj.LIZLLL = this.seqid;
        c66639QDj.LJ = this.logid;
        c66639QDj.LJFF = this.service;
        c66639QDj.LJI = this.method;
        c66639QDj.LJII = C63685Oz3.LIZJ("headers", this.headers);
        c66639QDj.LJIIIIZZ = this.payload_encoding;
        c66639QDj.LJIIIZ = this.payload_type;
        c66639QDj.LJIIJ = this.payload;
        c66639QDj.addUnknownFields(unknownFields());
        return c66639QDj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", seqid=");
        LIZJ.append(this.seqid);
        LIZJ.append(", logid=");
        LIZJ.append(this.logid);
        LIZJ.append(", service=");
        LIZJ.append(this.service);
        LIZJ.append(", method=");
        LIZJ.append(this.method);
        if (!this.headers.isEmpty()) {
            LIZJ.append(", headers=");
            LIZJ.append(this.headers);
        }
        if (this.payload_encoding != null) {
            LIZJ.append(", payload_encoding=");
            LIZJ.append(this.payload_encoding);
        }
        if (this.payload_type != null) {
            LIZJ.append(", payload_type=");
            LIZJ.append(this.payload_type);
        }
        if (this.payload != null) {
            LIZJ.append(", payload=");
            LIZJ.append(this.payload);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "Frame{", '}');
    }

    public String getPayloadEncoding() {
        return this.payload_encoding;
    }

    public String getPayloadType() {
        return this.payload_type;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) obj;
        if (unknownFields().equals(frame.unknownFields()) && this.seqid.equals(frame.seqid) && this.logid.equals(frame.logid) && this.service.equals(frame.service) && this.method.equals(frame.method) && this.headers.equals(frame.headers) && C63685Oz3.LJ(this.payload_encoding, frame.payload_encoding) && C63685Oz3.LJ(this.payload_type, frame.payload_type) && C63685Oz3.LJ(this.payload, frame.payload)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(ADAPTER.encode(this));
    }

    public Frame(Long l, Long l2, Integer num, Integer num2, List<C66640QDk> list, String str, String str2, C64537PUn c64537PUn) {
        this(l, l2, num, num2, list, str, str2, c64537PUn, C64537PUn.EMPTY);
    }

    public Frame(Long l, Long l2, Integer num, Integer num2, List<C66640QDk> list, String str, String str2, C64537PUn c64537PUn, C64537PUn c64537PUn2) {
        super(ADAPTER, c64537PUn2);
        this.seqid = l;
        this.logid = l2;
        this.service = num;
        this.method = num2;
        this.headers = C63685Oz3.LJFF("headers", list);
        this.payload_encoding = str;
        this.payload_type = str2;
        this.payload = c64537PUn;
    }
}
