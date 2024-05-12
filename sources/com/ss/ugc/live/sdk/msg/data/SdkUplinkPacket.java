package com.ss.ugc.live.sdk.msg.data;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.YNX;
import X.YNY;
import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.Map;

/* loaded from: classes16.dex */
public final class SdkUplinkPacket extends AndroidMessage<SdkUplinkPacket, YNX> {
    public static final ProtoAdapter<SdkUplinkPacket> ADAPTER;
    public static final Parcelable.Creator<SdkUplinkPacket> CREATOR;
    public static final C64537PUn DEFAULT_PAYLOAD;
    public static final Long DEFAULT_SERVICEID;
    public static final Integer DEFAULT_STATUSCODE;
    public static final Long DEFAULT_UNIQUEID;
    public static final Integer DEFAULT_UPLINKSTRATEGY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final Map<String, String> headers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 6)
    public final C64537PUn payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final Map<String, String> queryParams;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long serviceID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer statusCode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String statusMessage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long uniqueID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public final Integer uplinkStrategy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String uri;

    static {
        YNY yny = new YNY();
        ADAPTER = yny;
        CREATOR = AndroidMessage.newCreator(yny);
        DEFAULT_UNIQUEID = 0L;
        DEFAULT_SERVICEID = 0L;
        DEFAULT_PAYLOAD = C64537PUn.EMPTY;
        DEFAULT_STATUSCODE = 0;
        DEFAULT_UPLINKSTRATEGY = 0;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.uniqueID;
            int i8 = 0;
            if (l != null) {
                i = l.hashCode();
            } else {
                i = 0;
            }
            int i9 = (hashCode + i) * 37;
            Long l2 = this.serviceID;
            if (l2 != null) {
                i2 = l2.hashCode();
            } else {
                i2 = 0;
            }
            int hashCode2 = (this.headers.hashCode() + ((this.queryParams.hashCode() + ((i9 + i2) * 37)) * 37)) * 37;
            String str = this.uri;
            if (str != null) {
                i3 = str.hashCode();
            } else {
                i3 = 0;
            }
            int i10 = (hashCode2 + i3) * 37;
            C64537PUn c64537PUn = this.payload;
            if (c64537PUn != null) {
                i4 = c64537PUn.hashCode();
            } else {
                i4 = 0;
            }
            int i11 = (i10 + i4) * 37;
            Integer num = this.statusCode;
            if (num != null) {
                i5 = num.hashCode();
            } else {
                i5 = 0;
            }
            int i12 = (i11 + i5) * 37;
            String str2 = this.statusMessage;
            if (str2 != null) {
                i6 = str2.hashCode();
            } else {
                i6 = 0;
            }
            int i13 = (i12 + i6) * 37;
            Integer num2 = this.uplinkStrategy;
            if (num2 != null) {
                i8 = num2.hashCode();
            }
            int i14 = i13 + i8;
            this.hashCode = i14;
            return i14;
        }
        return i7;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public YNX newBuilder2() {
        YNX ynx = new YNX();
        ynx.LIZLLL = this.uniqueID;
        ynx.LJ = this.serviceID;
        ynx.LJFF = C63685Oz3.LIZLLL("queryParams", this.queryParams);
        ynx.LJI = C63685Oz3.LIZLLL("headers", this.headers);
        ynx.LJII = this.uri;
        ynx.LJIIIIZZ = this.payload;
        ynx.LJIIIZ = this.statusCode;
        ynx.LJIIJ = this.statusMessage;
        ynx.LJIIJJI = this.uplinkStrategy;
        ynx.addUnknownFields(unknownFields());
        return ynx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uniqueID != null) {
            sb.append(", uniqueID=");
            sb.append(this.uniqueID);
        }
        if (this.serviceID != null) {
            sb.append(", serviceID=");
            sb.append(this.serviceID);
        }
        Map<String, String> map = this.queryParams;
        if (map != null && !map.isEmpty()) {
            sb.append(", queryParams=");
            sb.append(this.queryParams);
        }
        Map<String, String> map2 = this.headers;
        if (map2 != null && !map2.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        if (this.statusCode != null) {
            sb.append(", statusCode=");
            sb.append(this.statusCode);
        }
        if (this.statusMessage != null) {
            sb.append(", statusMessage=");
            sb.append(this.statusMessage);
        }
        if (this.uplinkStrategy != null) {
            sb.append(", uplinkStrategy=");
            sb.append(this.uplinkStrategy);
        }
        return DIX.LIZLLL(sb, 0, 2, "SdkUplinkPacket{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkUplinkPacket)) {
            return false;
        }
        SdkUplinkPacket sdkUplinkPacket = (SdkUplinkPacket) obj;
        if (unknownFields().equals(sdkUplinkPacket.unknownFields()) && C63685Oz3.LJ(this.uniqueID, sdkUplinkPacket.uniqueID) && C63685Oz3.LJ(this.serviceID, sdkUplinkPacket.serviceID) && this.queryParams.equals(sdkUplinkPacket.queryParams) && this.headers.equals(sdkUplinkPacket.headers) && C63685Oz3.LJ(this.uri, sdkUplinkPacket.uri) && C63685Oz3.LJ(this.payload, sdkUplinkPacket.payload) && C63685Oz3.LJ(this.statusCode, sdkUplinkPacket.statusCode) && C63685Oz3.LJ(this.statusMessage, sdkUplinkPacket.statusMessage) && C63685Oz3.LJ(this.uplinkStrategy, sdkUplinkPacket.uplinkStrategy)) {
            return true;
        }
        return false;
    }

    public SdkUplinkPacket(Long l, Long l2, Map<String, String> map, Map<String, String> map2, String str, C64537PUn c64537PUn, Integer num, String str2, Integer num2) {
        this(l, l2, map, map2, str, c64537PUn, num, str2, num2, C64537PUn.EMPTY);
    }

    public SdkUplinkPacket(Long l, Long l2, Map<String, String> map, Map<String, String> map2, String str, C64537PUn c64537PUn, Integer num, String str2, Integer num2, C64537PUn c64537PUn2) {
        super(ADAPTER, c64537PUn2);
        this.uniqueID = l;
        this.serviceID = l2;
        this.queryParams = C63685Oz3.LJI("queryParams", map);
        this.headers = C63685Oz3.LJI("headers", map2);
        this.uri = str;
        this.payload = c64537PUn;
        this.statusCode = num;
        this.statusMessage = str2;
        this.uplinkStrategy = num2;
    }
}
