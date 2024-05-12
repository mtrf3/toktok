package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* renamed from: X.V3z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79135V3z extends Message<C79135V3z, V32> {
    public static final ProtoAdapter<C79135V3z> ADAPTER = new V4I();
    public static final EnumC79091V2h DEFAULT_FALLBACK_ICON_TYPE = EnumC79091V2h.Default;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String decrypt_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String display_name;

    @WireField(adapter = "com.bytedance.im.message.template.proto.IconType#ADAPTER", tag = 7)
    public final EnumC79091V2h fallback_icon_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String image_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Resolution#ADAPTER", tag = 5)
    public final C79143V4h resolution;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 2)
    public final List<String> url_list;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.image_id;
            int i6 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int LIZ = C77339UWx.LIZ(this.url_list, (hashCode + i) * 37, 37);
            String str2 = this.display_name;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (LIZ + i2) * 37;
            C79143V4h c79143V4h = this.resolution;
            if (c79143V4h != null) {
                i3 = c79143V4h.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            String str3 = this.decrypt_key;
            if (str3 != null) {
                i4 = str3.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 37;
            EnumC79091V2h enumC79091V2h = this.fallback_icon_type;
            if (enumC79091V2h != null) {
                i6 = enumC79091V2h.hashCode();
            }
            int i10 = i9 + i6;
            this.hashCode = i10;
            return i10;
        }
        return i5;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C79135V3z, V32> newBuilder2() {
        V32 v32 = new V32();
        v32.LIZLLL = this.image_id;
        v32.LJ = C63685Oz3.LIZJ("url_list", this.url_list);
        v32.LJFF = this.display_name;
        v32.LJI = this.resolution;
        v32.LJII = this.decrypt_key;
        v32.LJIIIIZZ = this.fallback_icon_type;
        v32.addUnknownFields(unknownFields());
        return v32;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image_id != null) {
            sb.append(", image_id=");
            sb.append(this.image_id);
        }
        if (!this.url_list.isEmpty()) {
            sb.append(", url_list=");
            sb.append(this.url_list);
        }
        if (this.display_name != null) {
            sb.append(", display_name=");
            sb.append(this.display_name);
        }
        if (this.resolution != null) {
            sb.append(", resolution=");
            sb.append(this.resolution);
        }
        if (this.decrypt_key != null) {
            sb.append(", decrypt_key=");
            sb.append(this.decrypt_key);
        }
        if (this.fallback_icon_type != null) {
            sb.append(", fallback_icon_type=");
            sb.append(this.fallback_icon_type);
        }
        return DIX.LIZLLL(sb, 0, 2, "BaseImage{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C79135V3z)) {
            return false;
        }
        C79135V3z c79135V3z = (C79135V3z) obj;
        if (unknownFields().equals(c79135V3z.unknownFields()) && C63685Oz3.LJ(this.image_id, c79135V3z.image_id) && this.url_list.equals(c79135V3z.url_list) && C63685Oz3.LJ(this.display_name, c79135V3z.display_name) && C63685Oz3.LJ(this.resolution, c79135V3z.resolution) && C63685Oz3.LJ(this.decrypt_key, c79135V3z.decrypt_key) && C63685Oz3.LJ(this.fallback_icon_type, c79135V3z.fallback_icon_type)) {
            return true;
        }
        return false;
    }

    public C79135V3z(String str, List<String> list, String str2, C79143V4h c79143V4h, String str3, EnumC79091V2h enumC79091V2h) {
        this(str, list, str2, c79143V4h, str3, enumC79091V2h, C64537PUn.EMPTY);
    }

    public C79135V3z(String str, List<String> list, String str2, C79143V4h c79143V4h, String str3, EnumC79091V2h enumC79091V2h, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.image_id = str;
        this.url_list = C63685Oz3.LJFF("url_list", list);
        this.display_name = str2;
        this.resolution = c79143V4h;
        this.decrypt_key = str3;
        this.fallback_icon_type = enumC79091V2h;
    }
}
