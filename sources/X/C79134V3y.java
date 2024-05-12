package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* renamed from: X.V3y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79134V3y extends Message<C79134V3y, C79111V3b> {
    public static final ProtoAdapter<C79134V3y> ADAPTER = new V4E();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VideoCardFallbackInfo#ADAPTER", tag = 4)
    public final V4W fallback;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 3)
    public final C63714OzW link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 2)
    public final V4L preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final RU2 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final RUB resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseUser#ADAPTER", tag = 5)
    public final C79129V3t user_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseVideo#ADAPTER", tag = 1)
    public final V43 video;

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
            V43 v43 = this.video;
            int i8 = 0;
            if (v43 != null) {
                i = v43.hashCode();
            } else {
                i = 0;
            }
            int i9 = (hashCode + i) * 37;
            V4L v4l = this.preview_hint;
            if (v4l != null) {
                i2 = v4l.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 37;
            C63714OzW c63714OzW = this.link_info;
            if (c63714OzW != null) {
                i3 = c63714OzW.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 37;
            V4W v4w = this.fallback;
            if (v4w != null) {
                i4 = v4w.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 37;
            C79129V3t c79129V3t = this.user_info;
            if (c79129V3t != null) {
                i5 = c79129V3t.hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 37;
            RU2 ru2 = this.req_base;
            if (ru2 != null) {
                i6 = ru2.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 37;
            RUB rub = this.resp_base;
            if (rub != null) {
                i8 = rub.hashCode();
            }
            int i15 = i14 + i8;
            this.hashCode = i15;
            return i15;
        }
        return i7;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C79134V3y, C79111V3b> newBuilder2() {
        C79111V3b c79111V3b = new C79111V3b();
        c79111V3b.LIZLLL = this.video;
        c79111V3b.LJ = this.preview_hint;
        c79111V3b.LJFF = this.link_info;
        c79111V3b.LJI = this.fallback;
        c79111V3b.LJII = this.user_info;
        c79111V3b.LJIIIIZZ = this.req_base;
        c79111V3b.LJIIIZ = this.resp_base;
        c79111V3b.addUnknownFields(unknownFields());
        return c79111V3b;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.video != null) {
            sb.append(", video=");
            sb.append(this.video);
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
        if (this.user_info != null) {
            sb.append(", user_info=");
            sb.append(this.user_info);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        return DIX.LIZLLL(sb, 0, 2, "VideoCard{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C79134V3y)) {
            return false;
        }
        C79134V3y c79134V3y = (C79134V3y) obj;
        if (unknownFields().equals(c79134V3y.unknownFields()) && C63685Oz3.LJ(this.video, c79134V3y.video) && C63685Oz3.LJ(this.preview_hint, c79134V3y.preview_hint) && C63685Oz3.LJ(this.link_info, c79134V3y.link_info) && C63685Oz3.LJ(this.fallback, c79134V3y.fallback) && C63685Oz3.LJ(this.user_info, c79134V3y.user_info) && C63685Oz3.LJ(this.req_base, c79134V3y.req_base) && C63685Oz3.LJ(this.resp_base, c79134V3y.resp_base)) {
            return true;
        }
        return false;
    }

    public C79134V3y(V43 v43, V4L v4l, C63714OzW c63714OzW, V4W v4w, C79129V3t c79129V3t, RU2 ru2, RUB rub) {
        this(v43, v4l, c63714OzW, v4w, c79129V3t, ru2, rub, C64537PUn.EMPTY);
    }

    public C79134V3y(V43 v43, V4L v4l, C63714OzW c63714OzW, V4W v4w, C79129V3t c79129V3t, RU2 ru2, RUB rub, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.video = v43;
        this.preview_hint = v4l;
        this.link_info = c63714OzW;
        this.fallback = v4w;
        this.user_info = c79129V3t;
        this.req_base = ru2;
        this.resp_base = rub;
    }
}
