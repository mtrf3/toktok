package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* renamed from: X.V3x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79133V3x extends Message<C79133V3x, V3Z> {
    public static final ProtoAdapter<C79133V3x> ADAPTER = new V4D();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 3)
    public final C63714OzW link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 4)
    public final V4L preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final RU2 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final RUB resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ImageCardTitle#ADAPTER", tag = 1)
    public final V4R title;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseVideo#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<V43> videos;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            V4R v4r = this.title;
            int i6 = 0;
            if (v4r != null) {
                i = v4r.hashCode();
            } else {
                i = 0;
            }
            int LIZ = C77339UWx.LIZ(this.videos, (hashCode + i) * 37, 37);
            C63714OzW c63714OzW = this.link_info;
            if (c63714OzW != null) {
                i2 = c63714OzW.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (LIZ + i2) * 37;
            V4L v4l = this.preview_hint;
            if (v4l != null) {
                i3 = v4l.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            RU2 ru2 = this.req_base;
            if (ru2 != null) {
                i4 = ru2.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 37;
            RUB rub = this.resp_base;
            if (rub != null) {
                i6 = rub.hashCode();
            }
            int i10 = i9 + i6;
            this.hashCode = i10;
            return i10;
        }
        return i5;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C79133V3x, V3Z> newBuilder2() {
        V3Z v3z = new V3Z();
        v3z.LIZLLL = this.title;
        v3z.LJ = C63685Oz3.LIZJ("videos", this.videos);
        v3z.LJFF = this.link_info;
        v3z.LJI = this.preview_hint;
        v3z.LJII = this.req_base;
        v3z.LJIIIIZZ = this.resp_base;
        v3z.addUnknownFields(unknownFields());
        return v3z;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (!this.videos.isEmpty()) {
            sb.append(", videos=");
            sb.append(this.videos);
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
        return DIX.LIZLLL(sb, 0, 2, "ImageCard{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C79133V3x)) {
            return false;
        }
        C79133V3x c79133V3x = (C79133V3x) obj;
        if (unknownFields().equals(c79133V3x.unknownFields()) && C63685Oz3.LJ(this.title, c79133V3x.title) && this.videos.equals(c79133V3x.videos) && C63685Oz3.LJ(this.link_info, c79133V3x.link_info) && C63685Oz3.LJ(this.preview_hint, c79133V3x.preview_hint) && C63685Oz3.LJ(this.req_base, c79133V3x.req_base) && C63685Oz3.LJ(this.resp_base, c79133V3x.resp_base)) {
            return true;
        }
        return false;
    }

    public C79133V3x(V4R v4r, List<V43> list, C63714OzW c63714OzW, V4L v4l, RU2 ru2, RUB rub) {
        this(v4r, list, c63714OzW, v4l, ru2, rub, C64537PUn.EMPTY);
    }

    public C79133V3x(V4R v4r, List<V43> list, C63714OzW c63714OzW, V4L v4l, RU2 ru2, RUB rub, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.title = v4r;
        this.videos = C63685Oz3.LJFF("videos", list);
        this.link_info = c63714OzW;
        this.preview_hint = v4l;
        this.req_base = ru2;
        this.resp_base = rub;
    }
}
