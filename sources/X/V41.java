package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V41 extends Message<V41, C79127V3r> {
    public static final ProtoAdapter<V41> ADAPTER = new V4B();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PictureCardFallbackInfo#ADAPTER", tag = 5)
    public final V4V fallback;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C79135V3z image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 6)
    public final C79135V3z image_mint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 4)
    public final C63714OzW link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 3)
    public final V4L preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final RU2 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final RUB resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 2)
    public final C79135V3z thumbnail;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 7)
    public final C79135V3z thumbnail_mint;

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
            C79135V3z c79135V3z = this.image;
            int i10 = 0;
            if (c79135V3z != null) {
                i = c79135V3z.hashCode();
            } else {
                i = 0;
            }
            int i11 = (hashCode + i) * 37;
            C79135V3z c79135V3z2 = this.thumbnail;
            if (c79135V3z2 != null) {
                i2 = c79135V3z2.hashCode();
            } else {
                i2 = 0;
            }
            int i12 = (i11 + i2) * 37;
            V4L v4l = this.preview_hint;
            if (v4l != null) {
                i3 = v4l.hashCode();
            } else {
                i3 = 0;
            }
            int i13 = (i12 + i3) * 37;
            C63714OzW c63714OzW = this.link_info;
            if (c63714OzW != null) {
                i4 = c63714OzW.hashCode();
            } else {
                i4 = 0;
            }
            int i14 = (i13 + i4) * 37;
            V4V v4v = this.fallback;
            if (v4v != null) {
                i5 = v4v.hashCode();
            } else {
                i5 = 0;
            }
            int i15 = (i14 + i5) * 37;
            C79135V3z c79135V3z3 = this.image_mint;
            if (c79135V3z3 != null) {
                i6 = c79135V3z3.hashCode();
            } else {
                i6 = 0;
            }
            int i16 = (i15 + i6) * 37;
            C79135V3z c79135V3z4 = this.thumbnail_mint;
            if (c79135V3z4 != null) {
                i7 = c79135V3z4.hashCode();
            } else {
                i7 = 0;
            }
            int i17 = (i16 + i7) * 37;
            RU2 ru2 = this.req_base;
            if (ru2 != null) {
                i8 = ru2.hashCode();
            } else {
                i8 = 0;
            }
            int i18 = (i17 + i8) * 37;
            RUB rub = this.resp_base;
            if (rub != null) {
                i10 = rub.hashCode();
            }
            int i19 = i18 + i10;
            this.hashCode = i19;
            return i19;
        }
        return i9;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<V41, C79127V3r> newBuilder2() {
        C79127V3r c79127V3r = new C79127V3r();
        c79127V3r.LIZLLL = this.image;
        c79127V3r.LJ = this.thumbnail;
        c79127V3r.LJFF = this.preview_hint;
        c79127V3r.LJI = this.link_info;
        c79127V3r.LJII = this.fallback;
        c79127V3r.LJIIIIZZ = this.image_mint;
        c79127V3r.LJIIIZ = this.thumbnail_mint;
        c79127V3r.LJIIJ = this.req_base;
        c79127V3r.LJIIJJI = this.resp_base;
        c79127V3r.addUnknownFields(unknownFields());
        return c79127V3r;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.thumbnail != null) {
            sb.append(", thumbnail=");
            sb.append(this.thumbnail);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        if (this.fallback != null) {
            sb.append(", fallback=");
            sb.append(this.fallback);
        }
        if (this.image_mint != null) {
            sb.append(", image_mint=");
            sb.append(this.image_mint);
        }
        if (this.thumbnail_mint != null) {
            sb.append(", thumbnail_mint=");
            sb.append(this.thumbnail_mint);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        return DIX.LIZLLL(sb, 0, 2, "PictureCard{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V41)) {
            return false;
        }
        V41 v41 = (V41) obj;
        if (unknownFields().equals(v41.unknownFields()) && C63685Oz3.LJ(this.image, v41.image) && C63685Oz3.LJ(this.thumbnail, v41.thumbnail) && C63685Oz3.LJ(this.preview_hint, v41.preview_hint) && C63685Oz3.LJ(this.link_info, v41.link_info) && C63685Oz3.LJ(this.fallback, v41.fallback) && C63685Oz3.LJ(this.image_mint, v41.image_mint) && C63685Oz3.LJ(this.thumbnail_mint, v41.thumbnail_mint) && C63685Oz3.LJ(this.req_base, v41.req_base) && C63685Oz3.LJ(this.resp_base, v41.resp_base)) {
            return true;
        }
        return false;
    }

    public V41(C79135V3z c79135V3z, C79135V3z c79135V3z2, V4L v4l, C63714OzW c63714OzW, V4V v4v, C79135V3z c79135V3z3, C79135V3z c79135V3z4, RU2 ru2, RUB rub) {
        this(c79135V3z, c79135V3z2, v4l, c63714OzW, v4v, c79135V3z3, c79135V3z4, ru2, rub, C64537PUn.EMPTY);
    }

    public V41(C79135V3z c79135V3z, C79135V3z c79135V3z2, V4L v4l, C63714OzW c63714OzW, V4V v4v, C79135V3z c79135V3z3, C79135V3z c79135V3z4, RU2 ru2, RUB rub, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.image = c79135V3z;
        this.thumbnail = c79135V3z2;
        this.preview_hint = v4l;
        this.link_info = c63714OzW;
        this.fallback = v4v;
        this.image_mint = c79135V3z3;
        this.thumbnail_mint = c79135V3z4;
        this.req_base = ru2;
        this.resp_base = rub;
    }
}
