package com.bytedance.common.wschannel.model;

import X.C63685Oz3;
import X.C64537PUn;
import X.C66507Q8h;
import X.C66508Q8i;
import X.C66510Q8k;
import X.DIX;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* loaded from: classes12.dex */
public final class Frame extends Message<Frame, C66510Q8k> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.article.wschannel.model.Frame$ExtendedEntry#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<C66507Q8h> headers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long logid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String logidnew;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public final String msgId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 8)
    public final C64537PUn payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String payload_encoding;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String payload_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long seqid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public final String serverTiming;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer service;
    public static final ProtoAdapter<Frame> ADAPTER = new C66508Q8i();
    public static final Long DEFAULT_SEQID = 0L;
    public static final Long DEFAULT_LOGID = 0L;
    public static final Integer DEFAULT_SERVICE = 0;
    public static final Integer DEFAULT_METHOD = 0;
    public static final C64537PUn DEFAULT_PAYLOAD = C64537PUn.EMPTY;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.seqid;
            int i12 = 0;
            if (l != null) {
                i = l.hashCode();
            } else {
                i = 0;
            }
            int i13 = (hashCode + i) * 37;
            Long l2 = this.logid;
            if (l2 != null) {
                i2 = l2.hashCode();
            } else {
                i2 = 0;
            }
            int i14 = (i13 + i2) * 37;
            Integer num = this.service;
            if (num != null) {
                i3 = num.hashCode();
            } else {
                i3 = 0;
            }
            int i15 = (i14 + i3) * 37;
            Integer num2 = this.method;
            if (num2 != null) {
                i4 = num2.hashCode();
            } else {
                i4 = 0;
            }
            int i16 = (i15 + i4) * 37;
            List<C66507Q8h> list = this.headers;
            if (list != null) {
                i5 = list.hashCode();
            } else {
                i5 = 1;
            }
            int i17 = (i16 + i5) * 37;
            String str = this.payload_encoding;
            if (str != null) {
                i6 = str.hashCode();
            } else {
                i6 = 0;
            }
            int i18 = (i17 + i6) * 37;
            String str2 = this.payload_type;
            if (str2 != null) {
                i7 = str2.hashCode();
            } else {
                i7 = 0;
            }
            int i19 = (i18 + i7) * 37;
            C64537PUn c64537PUn = this.payload;
            if (c64537PUn != null) {
                i8 = c64537PUn.hashCode();
            } else {
                i8 = 0;
            }
            int i20 = (i19 + i8) * 37;
            String str3 = this.logidnew;
            if (str3 != null) {
                i9 = str3.hashCode();
            } else {
                i9 = 0;
            }
            int i21 = (i20 + i9) * 37;
            String str4 = this.serverTiming;
            if (str4 != null) {
                i10 = str4.hashCode();
            } else {
                i10 = 0;
            }
            int i22 = (i21 + i10) * 37;
            String str5 = this.msgId;
            if (str5 != null) {
                i12 = str5.hashCode();
            }
            int i23 = i22 + i12;
            this.hashCode = i23;
            return i23;
        }
        return i11;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<Frame, C66510Q8k> newBuilder2() {
        C66510Q8k c66510Q8k = new C66510Q8k();
        c66510Q8k.LIZLLL = this.seqid;
        c66510Q8k.LJ = this.logid;
        c66510Q8k.LJFF = this.service;
        c66510Q8k.LJI = this.method;
        c66510Q8k.LJII = C63685Oz3.LIZJ("headers", this.headers);
        c66510Q8k.LJIIIIZZ = this.payload_encoding;
        c66510Q8k.LJIIIZ = this.payload_type;
        c66510Q8k.LJIIJ = this.payload;
        c66510Q8k.LJIIJJI = this.logidnew;
        c66510Q8k.LJIIL = this.serverTiming;
        c66510Q8k.LJIILIIL = this.msgId;
        c66510Q8k.addUnknownFields(unknownFields());
        return c66510Q8k;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.seqid != null) {
            sb.append(", seqid=");
            sb.append(this.seqid);
        }
        if (this.logid != null) {
            sb.append(", logid=");
            sb.append(this.logid);
        }
        if (this.service != null) {
            sb.append(", service=");
            sb.append(this.service);
        }
        if (this.method != null) {
            sb.append(", method=");
            sb.append(this.method);
        }
        if (this.headers != null) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.payload_encoding != null) {
            sb.append(", payload_encoding=");
            sb.append(this.payload_encoding);
        }
        if (this.payload_type != null) {
            sb.append(", payload_type=");
            sb.append(this.payload_type);
        }
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        if (this.logidnew != null) {
            sb.append(", logidnew=");
            sb.append(this.logidnew);
        }
        if (this.serverTiming != null) {
            sb.append(", serverTiming=");
            sb.append(this.serverTiming);
        }
        if (this.msgId != null) {
            sb.append(", msgId=");
            sb.append(this.msgId);
        }
        return DIX.LIZLLL(sb, 0, 2, "Frame{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) obj;
        if (C63685Oz3.LJ(unknownFields(), frame.unknownFields()) && C63685Oz3.LJ(this.seqid, frame.seqid) && C63685Oz3.LJ(this.logid, frame.logid) && C63685Oz3.LJ(this.service, frame.service) && C63685Oz3.LJ(this.method, frame.method) && C63685Oz3.LJ(this.headers, frame.headers) && C63685Oz3.LJ(this.payload_encoding, frame.payload_encoding) && C63685Oz3.LJ(this.payload_type, frame.payload_type) && C63685Oz3.LJ(this.payload, frame.payload) && C63685Oz3.LJ(this.logidnew, frame.logidnew) && C63685Oz3.LJ(this.serverTiming, frame.serverTiming) && C63685Oz3.LJ(this.msgId, frame.msgId)) {
            return true;
        }
        return false;
    }

    public Frame(Long l, Long l2, Integer num, Integer num2, List<C66507Q8h> list, String str, String str2, C64537PUn c64537PUn, String str3, String str4, String str5) {
        this(l, l2, num, num2, list, str, str2, c64537PUn, str3, str4, str5, C64537PUn.EMPTY);
    }

    public Frame(Long l, Long l2, Integer num, Integer num2, List<C66507Q8h> list, String str, String str2, C64537PUn c64537PUn, String str3, String str4, String str5, C64537PUn c64537PUn2) {
        super(ADAPTER, c64537PUn2);
        this.seqid = l;
        this.logid = l2;
        this.service = num;
        this.method = num2;
        this.headers = C63685Oz3.LJFF("headers", list);
        this.payload_encoding = str;
        this.payload_type = str2;
        this.payload = c64537PUn;
        this.logidnew = str3;
        this.serverTiming = str4;
        this.msgId = str5;
    }
}
