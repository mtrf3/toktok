package tiktok.image.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C66505Q8f;
import X.DIX;
import X.Q3N;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes12.dex */
public final class ImageHeader extends Message<ImageHeader, Q3N> {
    public static final ProtoAdapter<ImageHeader> ADAPTER = new C66505Q8f();

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public String animated_format;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer battery;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long memory;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer network_quality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String network_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String requestFrom;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String static_format;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 9)
    public Boolean supportMultiBitrate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public Boolean supportSuperRes;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.hashCode;
        if (i9 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.network_quality;
            int i10 = 0;
            if (num != null) {
                i = num.hashCode();
            } else {
                i = 0;
            }
            int i11 = (hashCode + i) * 37;
            String str = this.network_type;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i12 = (i11 + i2) * 37;
            Integer num2 = this.battery;
            if (num2 != null) {
                i3 = num2.hashCode();
            } else {
                i3 = 0;
            }
            int i13 = (i12 + i3) * 37;
            Long l = this.memory;
            if (l != null) {
                i4 = l.hashCode();
            } else {
                i4 = 0;
            }
            int i14 = (i13 + i4) * 37;
            String str2 = this.requestFrom;
            if (str2 != null) {
                i5 = str2.hashCode();
            } else {
                i5 = 0;
            }
            int i15 = (i14 + i5) * 37;
            String str3 = this.static_format;
            if (str3 != null) {
                i6 = str3.hashCode();
            } else {
                i6 = 0;
            }
            int i16 = (i15 + i6) * 37;
            String str4 = this.animated_format;
            if (str4 != null) {
                i7 = str4.hashCode();
            } else {
                i7 = 0;
            }
            int i17 = (i16 + i7) * 37;
            Boolean bool = this.supportSuperRes;
            if (bool != null) {
                i8 = bool.hashCode();
            } else {
                i8 = 0;
            }
            int i18 = (i17 + i8) * 37;
            Boolean bool2 = this.supportMultiBitrate;
            if (bool2 != null) {
                i10 = bool2.hashCode();
            }
            int i19 = i18 + i10;
            this.hashCode = i19;
            return i19;
        }
        return i9;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ImageHeader, Q3N> newBuilder2() {
        Q3N q3n = new Q3N();
        q3n.LIZLLL = this.network_quality;
        q3n.LJ = this.network_type;
        q3n.LJFF = this.battery;
        q3n.LJI = this.memory;
        q3n.LJII = this.requestFrom;
        q3n.LJIIIIZZ = this.static_format;
        q3n.LJIIIZ = this.animated_format;
        q3n.LJIIJ = this.supportSuperRes;
        q3n.LJIIJJI = this.supportMultiBitrate;
        q3n.addUnknownFields(unknownFields());
        return q3n;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.network_quality != null) {
            sb.append(", network_quality=");
            sb.append(this.network_quality);
        }
        if (this.network_type != null) {
            sb.append(", network_type=");
            sb.append(this.network_type);
        }
        if (this.battery != null) {
            sb.append(", battery=");
            sb.append(this.battery);
        }
        if (this.memory != null) {
            sb.append(", memory=");
            sb.append(this.memory);
        }
        if (this.requestFrom != null) {
            sb.append(", requestFrom=");
            sb.append(this.requestFrom);
        }
        if (this.static_format != null) {
            sb.append(", static_format=");
            sb.append(this.static_format);
        }
        if (this.animated_format != null) {
            sb.append(", animated_format=");
            sb.append(this.animated_format);
        }
        if (this.supportSuperRes != null) {
            sb.append(", supportSuperRes=");
            sb.append(this.supportSuperRes);
        }
        if (this.supportMultiBitrate != null) {
            sb.append(", supportMultiBitrate=");
            sb.append(this.supportMultiBitrate);
        }
        return DIX.LIZLLL(sb, 0, 2, "ImageHeader{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageHeader)) {
            return false;
        }
        ImageHeader imageHeader = (ImageHeader) obj;
        if (unknownFields().equals(imageHeader.unknownFields()) && C63685Oz3.LJ(this.network_quality, imageHeader.network_quality) && C63685Oz3.LJ(this.network_type, imageHeader.network_type) && C63685Oz3.LJ(this.battery, imageHeader.battery) && C63685Oz3.LJ(this.memory, imageHeader.memory) && C63685Oz3.LJ(this.requestFrom, imageHeader.requestFrom) && C63685Oz3.LJ(this.static_format, imageHeader.static_format) && C63685Oz3.LJ(this.animated_format, imageHeader.animated_format) && C63685Oz3.LJ(this.supportSuperRes, imageHeader.supportSuperRes) && C63685Oz3.LJ(this.supportMultiBitrate, imageHeader.supportMultiBitrate)) {
            return true;
        }
        return false;
    }

    public ImageHeader(Integer num, String str, Integer num2, Long l, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
        this(num, str, num2, l, str2, str3, str4, bool, bool2, C64537PUn.EMPTY);
    }

    public ImageHeader(Integer num, String str, Integer num2, Long l, String str2, String str3, String str4, Boolean bool, Boolean bool2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.network_quality = num;
        this.network_type = str;
        this.battery = num2;
        this.memory = l;
        this.requestFrom = str2;
        this.static_format = str3;
        this.animated_format = str4;
        this.supportSuperRes = bool;
        this.supportMultiBitrate = bool2;
    }
}
