package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V44 extends Message<V44, C79113V3d> {
    public static final ProtoAdapter<V44> ADAPTER = new V4G();
    public static final Integer DEFAULT_DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_DEFAULT_WIDTH = 0;
    public static final V3G DEFAULT_UI_LOCATION_TYPE = V3G.MessageNormal;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String business_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String business_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String card_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String card_template;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer default_height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer default_width;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String raw_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String schema;

    @WireField(adapter = "com.bytedance.im.message.template.proto.UiLocationType#ADAPTER", tag = 8)
    public final V3G ui_location_type;

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
            String str = this.card_key;
            int i10 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i11 = (hashCode + i) * 37;
            String str2 = this.schema;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i12 = (i11 + i2) * 37;
            String str3 = this.card_template;
            if (str3 != null) {
                i3 = str3.hashCode();
            } else {
                i3 = 0;
            }
            int i13 = (i12 + i3) * 37;
            String str4 = this.business_type;
            if (str4 != null) {
                i4 = str4.hashCode();
            } else {
                i4 = 0;
            }
            int i14 = (i13 + i4) * 37;
            String str5 = this.business_id;
            if (str5 != null) {
                i5 = str5.hashCode();
            } else {
                i5 = 0;
            }
            int i15 = (i14 + i5) * 37;
            Integer num = this.default_height;
            if (num != null) {
                i6 = num.hashCode();
            } else {
                i6 = 0;
            }
            int i16 = (i15 + i6) * 37;
            Integer num2 = this.default_width;
            if (num2 != null) {
                i7 = num2.hashCode();
            } else {
                i7 = 0;
            }
            int i17 = (i16 + i7) * 37;
            V3G v3g = this.ui_location_type;
            if (v3g != null) {
                i8 = v3g.hashCode();
            } else {
                i8 = 0;
            }
            int i18 = (i17 + i8) * 37;
            String str6 = this.raw_data;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            int i19 = i18 + i10;
            this.hashCode = i19;
            return i19;
        }
        return i9;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<V44, C79113V3d> newBuilder2() {
        C79113V3d c79113V3d = new C79113V3d();
        c79113V3d.LIZLLL = this.card_key;
        c79113V3d.LJ = this.schema;
        c79113V3d.LJFF = this.card_template;
        c79113V3d.LJI = this.business_type;
        c79113V3d.LJII = this.business_id;
        c79113V3d.LJIIIIZZ = this.default_height;
        c79113V3d.LJIIIZ = this.default_width;
        c79113V3d.LJIIJ = this.ui_location_type;
        c79113V3d.LJIIJJI = this.raw_data;
        c79113V3d.addUnknownFields(unknownFields());
        return c79113V3d;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.card_key != null) {
            sb.append(", card_key=");
            sb.append(this.card_key);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.card_template != null) {
            sb.append(", card_template=");
            sb.append(this.card_template);
        }
        if (this.business_type != null) {
            sb.append(", business_type=");
            sb.append(this.business_type);
        }
        if (this.business_id != null) {
            sb.append(", business_id=");
            sb.append(this.business_id);
        }
        if (this.default_height != null) {
            sb.append(", default_height=");
            sb.append(this.default_height);
        }
        if (this.default_width != null) {
            sb.append(", default_width=");
            sb.append(this.default_width);
        }
        if (this.ui_location_type != null) {
            sb.append(", ui_location_type=");
            sb.append(this.ui_location_type);
        }
        if (this.raw_data != null) {
            sb.append(", raw_data=");
            sb.append(this.raw_data);
        }
        return DIX.LIZLLL(sb, 0, 2, "DynamicInfo{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V44)) {
            return false;
        }
        V44 v44 = (V44) obj;
        if (unknownFields().equals(v44.unknownFields()) && C63685Oz3.LJ(this.card_key, v44.card_key) && C63685Oz3.LJ(this.schema, v44.schema) && C63685Oz3.LJ(this.card_template, v44.card_template) && C63685Oz3.LJ(this.business_type, v44.business_type) && C63685Oz3.LJ(this.business_id, v44.business_id) && C63685Oz3.LJ(this.default_height, v44.default_height) && C63685Oz3.LJ(this.default_width, v44.default_width) && C63685Oz3.LJ(this.ui_location_type, v44.ui_location_type) && C63685Oz3.LJ(this.raw_data, v44.raw_data)) {
            return true;
        }
        return false;
    }

    public V44(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, V3G v3g, String str6) {
        this(str, str2, str3, str4, str5, num, num2, v3g, str6, C64537PUn.EMPTY);
    }

    public V44(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, V3G v3g, String str6, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.card_key = str;
        this.schema = str2;
        this.card_template = str3;
        this.business_type = str4;
        this.business_id = str5;
        this.default_height = num;
        this.default_width = num2;
        this.ui_location_type = v3g;
        this.raw_data = str6;
    }
}
