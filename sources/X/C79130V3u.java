package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* renamed from: X.V3u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79130V3u extends Message<C79130V3u, C79110V3a> {
    public static final ProtoAdapter<C79130V3u> ADAPTER = new V49();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 5)
    public final RUF hint_title;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C79135V3z image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 6)
    public final C63714OzW link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 7)
    public final V4L preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final RU2 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final RUB resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 4)
    public final RUF sub_title;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 3)
    public final RUF title;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseUser#ADAPTER", tag = 2)
    public final C79129V3t user_info;

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
            C79129V3t c79129V3t = this.user_info;
            if (c79129V3t != null) {
                i2 = c79129V3t.hashCode();
            } else {
                i2 = 0;
            }
            int i12 = (i11 + i2) * 37;
            RUF ruf = this.title;
            if (ruf != null) {
                i3 = ruf.hashCode();
            } else {
                i3 = 0;
            }
            int i13 = (i12 + i3) * 37;
            RUF ruf2 = this.sub_title;
            if (ruf2 != null) {
                i4 = ruf2.hashCode();
            } else {
                i4 = 0;
            }
            int i14 = (i13 + i4) * 37;
            RUF ruf3 = this.hint_title;
            if (ruf3 != null) {
                i5 = ruf3.hashCode();
            } else {
                i5 = 0;
            }
            int i15 = (i14 + i5) * 37;
            C63714OzW c63714OzW = this.link_info;
            if (c63714OzW != null) {
                i6 = c63714OzW.hashCode();
            } else {
                i6 = 0;
            }
            int i16 = (i15 + i6) * 37;
            V4L v4l = this.preview_hint;
            if (v4l != null) {
                i7 = v4l.hashCode();
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
    public Message.Builder<C79130V3u, C79110V3a> newBuilder2() {
        C79110V3a c79110V3a = new C79110V3a();
        c79110V3a.LIZLLL = this.image;
        c79110V3a.LJ = this.user_info;
        c79110V3a.LJFF = this.title;
        c79110V3a.LJI = this.sub_title;
        c79110V3a.LJII = this.hint_title;
        c79110V3a.LJIIIIZZ = this.link_info;
        c79110V3a.LJIIIZ = this.preview_hint;
        c79110V3a.LJIIJ = this.req_base;
        c79110V3a.LJIIJJI = this.resp_base;
        c79110V3a.addUnknownFields(unknownFields());
        return c79110V3a;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.user_info != null) {
            sb.append(", user_info=");
            sb.append(this.user_info);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.sub_title != null) {
            sb.append(", sub_title=");
            sb.append(this.sub_title);
        }
        if (this.hint_title != null) {
            sb.append(", hint_title=");
            sb.append(this.hint_title);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        return DIX.LIZLLL(sb, 0, 2, "PortraitCard{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C79130V3u)) {
            return false;
        }
        C79130V3u c79130V3u = (C79130V3u) obj;
        if (unknownFields().equals(c79130V3u.unknownFields()) && C63685Oz3.LJ(this.image, c79130V3u.image) && C63685Oz3.LJ(this.user_info, c79130V3u.user_info) && C63685Oz3.LJ(this.title, c79130V3u.title) && C63685Oz3.LJ(this.sub_title, c79130V3u.sub_title) && C63685Oz3.LJ(this.hint_title, c79130V3u.hint_title) && C63685Oz3.LJ(this.link_info, c79130V3u.link_info) && C63685Oz3.LJ(this.preview_hint, c79130V3u.preview_hint) && C63685Oz3.LJ(this.req_base, c79130V3u.req_base) && C63685Oz3.LJ(this.resp_base, c79130V3u.resp_base)) {
            return true;
        }
        return false;
    }

    public C79130V3u(C79135V3z c79135V3z, C79129V3t c79129V3t, RUF ruf, RUF ruf2, RUF ruf3, C63714OzW c63714OzW, V4L v4l, RU2 ru2, RUB rub) {
        this(c79135V3z, c79129V3t, ruf, ruf2, ruf3, c63714OzW, v4l, ru2, rub, C64537PUn.EMPTY);
    }

    public C79130V3u(C79135V3z c79135V3z, C79129V3t c79129V3t, RUF ruf, RUF ruf2, RUF ruf3, C63714OzW c63714OzW, V4L v4l, RU2 ru2, RUB rub, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.image = c79135V3z;
        this.user_info = c79129V3t;
        this.title = ruf;
        this.sub_title = ruf2;
        this.hint_title = ruf3;
        this.link_info = c63714OzW;
        this.preview_hint = v4l;
        this.req_base = ru2;
        this.resp_base = rub;
    }
}
