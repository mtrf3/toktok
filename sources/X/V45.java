package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V45 extends Message<V45, C79112V3c> {
    public static final ProtoAdapter<V45> ADAPTER = new V4K();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StickerCardFallbackInfo#ADAPTER", tag = 3)
    public final C79148V4m fallback;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 2)
    public final V4L preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final RU2 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final RUB resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C79135V3z sticker;

    @WireField(adapter = "com.bytedance.im.message.template.proto.UserInfo#ADAPTER", tag = 4)
    public final V4Y sticker_creator_user_info;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            C79135V3z c79135V3z = this.sticker;
            int i7 = 0;
            if (c79135V3z != null) {
                i = c79135V3z.hashCode();
            } else {
                i = 0;
            }
            int i8 = (hashCode + i) * 37;
            V4L v4l = this.preview_hint;
            if (v4l != null) {
                i2 = v4l.hashCode();
            } else {
                i2 = 0;
            }
            int i9 = (i8 + i2) * 37;
            C79148V4m c79148V4m = this.fallback;
            if (c79148V4m != null) {
                i3 = c79148V4m.hashCode();
            } else {
                i3 = 0;
            }
            int i10 = (i9 + i3) * 37;
            V4Y v4y = this.sticker_creator_user_info;
            if (v4y != null) {
                i4 = v4y.hashCode();
            } else {
                i4 = 0;
            }
            int i11 = (i10 + i4) * 37;
            RU2 ru2 = this.req_base;
            if (ru2 != null) {
                i5 = ru2.hashCode();
            } else {
                i5 = 0;
            }
            int i12 = (i11 + i5) * 37;
            RUB rub = this.resp_base;
            if (rub != null) {
                i7 = rub.hashCode();
            }
            int i13 = i12 + i7;
            this.hashCode = i13;
            return i13;
        }
        return i6;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<V45, C79112V3c> newBuilder2() {
        C79112V3c c79112V3c = new C79112V3c();
        c79112V3c.LIZLLL = this.sticker;
        c79112V3c.LJ = this.preview_hint;
        c79112V3c.LJFF = this.fallback;
        c79112V3c.LJI = this.sticker_creator_user_info;
        c79112V3c.LJII = this.req_base;
        c79112V3c.LJIIIIZZ = this.resp_base;
        c79112V3c.addUnknownFields(unknownFields());
        return c79112V3c;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sticker != null) {
            sb.append(", sticker=");
            sb.append(this.sticker);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (this.fallback != null) {
            sb.append(", fallback=");
            sb.append(this.fallback);
        }
        if (this.sticker_creator_user_info != null) {
            sb.append(", sticker_creator_user_info=");
            sb.append(this.sticker_creator_user_info);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        return DIX.LIZLLL(sb, 0, 2, "StickerCard{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V45)) {
            return false;
        }
        V45 v45 = (V45) obj;
        if (unknownFields().equals(v45.unknownFields()) && C63685Oz3.LJ(this.sticker, v45.sticker) && C63685Oz3.LJ(this.preview_hint, v45.preview_hint) && C63685Oz3.LJ(this.fallback, v45.fallback) && C63685Oz3.LJ(this.sticker_creator_user_info, v45.sticker_creator_user_info) && C63685Oz3.LJ(this.req_base, v45.req_base) && C63685Oz3.LJ(this.resp_base, v45.resp_base)) {
            return true;
        }
        return false;
    }

    public V45(C79135V3z c79135V3z, V4L v4l, C79148V4m c79148V4m, V4Y v4y, RU2 ru2, RUB rub) {
        this(c79135V3z, v4l, c79148V4m, v4y, ru2, rub, C64537PUn.EMPTY);
    }

    public V45(C79135V3z c79135V3z, V4L v4l, C79148V4m c79148V4m, V4Y v4y, RU2 ru2, RUB rub, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.sticker = c79135V3z;
        this.preview_hint = v4l;
        this.fallback = c79148V4m;
        this.sticker_creator_user_info = v4y;
        this.req_base = ru2;
        this.resp_base = rub;
    }
}
