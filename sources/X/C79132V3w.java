package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* renamed from: X.V3w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79132V3w extends Message<C79132V3w, V3Y> {
    public static final ProtoAdapter<C79132V3w> ADAPTER = new V4A();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InfoCardButton#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<V4N> buttons;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InfoCardContent#ADAPTER", tag = 2)
    public final RUV content;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 6)
    public final C63714OzW link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final RU2 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final RUB resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InfoCardTitle#ADAPTER", tag = 1)
    public final V4Z title;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseVideo#ADAPTER", tag = 3)
    public final V43 video;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            V4Z v4z = this.title;
            int i7 = 0;
            if (v4z != null) {
                i = v4z.hashCode();
            } else {
                i = 0;
            }
            int i8 = (hashCode + i) * 37;
            RUV ruv = this.content;
            if (ruv != null) {
                i2 = ruv.hashCode();
            } else {
                i2 = 0;
            }
            int i9 = (i8 + i2) * 37;
            V43 v43 = this.video;
            if (v43 != null) {
                i3 = v43.hashCode();
            } else {
                i3 = 0;
            }
            int LIZ = C77339UWx.LIZ(this.buttons, (i9 + i3) * 37, 37);
            C63714OzW c63714OzW = this.link_info;
            if (c63714OzW != null) {
                i4 = c63714OzW.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (LIZ + i4) * 37;
            RU2 ru2 = this.req_base;
            if (ru2 != null) {
                i5 = ru2.hashCode();
            } else {
                i5 = 0;
            }
            int i11 = (i10 + i5) * 37;
            RUB rub = this.resp_base;
            if (rub != null) {
                i7 = rub.hashCode();
            }
            int i12 = i11 + i7;
            this.hashCode = i12;
            return i12;
        }
        return i6;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C79132V3w, V3Y> newBuilder2() {
        V3Y v3y = new V3Y();
        v3y.LIZLLL = this.title;
        v3y.LJ = this.content;
        v3y.LJFF = this.video;
        v3y.LJI = C63685Oz3.LIZJ("buttons", this.buttons);
        v3y.LJII = this.link_info;
        v3y.LJIIIIZZ = this.req_base;
        v3y.LJIIIZ = this.resp_base;
        v3y.addUnknownFields(unknownFields());
        return v3y;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.video != null) {
            sb.append(", video=");
            sb.append(this.video);
        }
        if (!this.buttons.isEmpty()) {
            sb.append(", buttons=");
            sb.append(this.buttons);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        return DIX.LIZLLL(sb, 0, 2, "InfoCard{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C79132V3w)) {
            return false;
        }
        C79132V3w c79132V3w = (C79132V3w) obj;
        if (unknownFields().equals(c79132V3w.unknownFields()) && C63685Oz3.LJ(this.title, c79132V3w.title) && C63685Oz3.LJ(this.content, c79132V3w.content) && C63685Oz3.LJ(this.video, c79132V3w.video) && this.buttons.equals(c79132V3w.buttons) && C63685Oz3.LJ(this.link_info, c79132V3w.link_info) && C63685Oz3.LJ(this.req_base, c79132V3w.req_base) && C63685Oz3.LJ(this.resp_base, c79132V3w.resp_base)) {
            return true;
        }
        return false;
    }

    public C79132V3w(V4Z v4z, RUV ruv, V43 v43, List<V4N> list, C63714OzW c63714OzW, RU2 ru2, RUB rub) {
        this(v4z, ruv, v43, list, c63714OzW, ru2, rub, C64537PUn.EMPTY);
    }

    public C79132V3w(V4Z v4z, RUV ruv, V43 v43, List<V4N> list, C63714OzW c63714OzW, RU2 ru2, RUB rub, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.title = v4z;
        this.content = ruv;
        this.video = v43;
        this.buttons = C63685Oz3.LJFF("buttons", list);
        this.link_info = c63714OzW;
        this.req_base = ru2;
        this.resp_base = rub;
    }
}
