package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V40 extends Message<V40, V31> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.IconType#ADAPTER", tag = 4)
    public final EnumC79091V2h fallback_icon;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 6)
    public final C63714OzW link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 3)
    public final C79135V3z preview_image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewIconType#ADAPTER", tag = 5)
    public final EnumC79088V2e quote_preview_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String resource_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long sender_uid;

    @WireField(adapter = "com.bytedance.im.message.template.proto.TTL#ADAPTER", tag = 7)
    public final RU9 ttl;
    public static final ProtoAdapter<V40> ADAPTER = new V4C();
    public static final Long DEFAULT_SENDER_UID = 0L;
    public static final EnumC79091V2h DEFAULT_FALLBACK_ICON = EnumC79091V2h.Default;
    public static final EnumC79088V2e DEFAULT_QUOTE_PREVIEW_ICON = EnumC79088V2e.NoIcon;

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
            String str = this.resource_id;
            int i8 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i9 = (hashCode + i) * 37;
            Long l = this.sender_uid;
            if (l != null) {
                i2 = l.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 37;
            C79135V3z c79135V3z = this.preview_image;
            if (c79135V3z != null) {
                i3 = c79135V3z.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 37;
            EnumC79091V2h enumC79091V2h = this.fallback_icon;
            if (enumC79091V2h != null) {
                i4 = enumC79091V2h.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 37;
            EnumC79088V2e enumC79088V2e = this.quote_preview_icon;
            if (enumC79088V2e != null) {
                i5 = enumC79088V2e.hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 37;
            C63714OzW c63714OzW = this.link_info;
            if (c63714OzW != null) {
                i6 = c63714OzW.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 37;
            RU9 ru9 = this.ttl;
            if (ru9 != null) {
                i8 = ru9.hashCode();
            }
            int i15 = i14 + i8;
            this.hashCode = i15;
            return i15;
        }
        return i7;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<V40, V31> newBuilder2() {
        V31 v31 = new V31();
        v31.LIZLLL = this.resource_id;
        v31.LJ = this.sender_uid;
        v31.LJFF = this.preview_image;
        v31.LJI = this.fallback_icon;
        v31.LJII = this.quote_preview_icon;
        v31.LJIIIIZZ = this.link_info;
        v31.LJIIIZ = this.ttl;
        v31.addUnknownFields(unknownFields());
        return v31;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.resource_id != null) {
            sb.append(", resource_id=");
            sb.append(this.resource_id);
        }
        if (this.sender_uid != null) {
            sb.append(", sender_uid=");
            sb.append(this.sender_uid);
        }
        if (this.preview_image != null) {
            sb.append(", preview_image=");
            sb.append(this.preview_image);
        }
        if (this.fallback_icon != null) {
            sb.append(", fallback_icon=");
            sb.append(this.fallback_icon);
        }
        if (this.quote_preview_icon != null) {
            sb.append(", quote_preview_icon=");
            sb.append(this.quote_preview_icon);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        if (this.ttl != null) {
            sb.append(", ttl=");
            sb.append(this.ttl);
        }
        return DIX.LIZLLL(sb, 0, 2, "QuotePicturePreview{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V40)) {
            return false;
        }
        V40 v40 = (V40) obj;
        if (unknownFields().equals(v40.unknownFields()) && C63685Oz3.LJ(this.resource_id, v40.resource_id) && C63685Oz3.LJ(this.sender_uid, v40.sender_uid) && C63685Oz3.LJ(this.preview_image, v40.preview_image) && C63685Oz3.LJ(this.fallback_icon, v40.fallback_icon) && C63685Oz3.LJ(this.quote_preview_icon, v40.quote_preview_icon) && C63685Oz3.LJ(this.link_info, v40.link_info) && C63685Oz3.LJ(this.ttl, v40.ttl)) {
            return true;
        }
        return false;
    }

    public V40(String str, Long l, C79135V3z c79135V3z, EnumC79091V2h enumC79091V2h, EnumC79088V2e enumC79088V2e, C63714OzW c63714OzW, RU9 ru9) {
        this(str, l, c79135V3z, enumC79091V2h, enumC79088V2e, c63714OzW, ru9, C64537PUn.EMPTY);
    }

    public V40(String str, Long l, C79135V3z c79135V3z, EnumC79091V2h enumC79091V2h, EnumC79088V2e enumC79088V2e, C63714OzW c63714OzW, RU9 ru9, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.resource_id = str;
        this.sender_uid = l;
        this.preview_image = c79135V3z;
        this.fallback_icon = enumC79091V2h;
        this.quote_preview_icon = enumC79088V2e;
        this.link_info = c63714OzW;
        this.ttl = ru9;
    }
}
