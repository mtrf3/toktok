package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V42 extends Message<V42, C79115V3f> {
    public static final ProtoAdapter<V42> ADAPTER = new V4J();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 2)
    public final RUF interactive_notice;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final RUF plain_notice;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 5)
    public final V4L preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 4)
    public final RUF query_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String query_message_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final RU2 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final RUB resp_base;

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
            RUF ruf = this.plain_notice;
            int i8 = 0;
            if (ruf != null) {
                i = ruf.hashCode();
            } else {
                i = 0;
            }
            int i9 = (hashCode + i) * 37;
            RUF ruf2 = this.interactive_notice;
            if (ruf2 != null) {
                i2 = ruf2.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 37;
            String str = this.query_message_id;
            if (str != null) {
                i3 = str.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 37;
            RUF ruf3 = this.query_content;
            if (ruf3 != null) {
                i4 = ruf3.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 37;
            V4L v4l = this.preview_hint;
            if (v4l != null) {
                i5 = v4l.hashCode();
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
    public Message.Builder<V42, C79115V3f> newBuilder2() {
        C79115V3f c79115V3f = new C79115V3f();
        c79115V3f.LIZLLL = this.plain_notice;
        c79115V3f.LJ = this.interactive_notice;
        c79115V3f.LJFF = this.query_message_id;
        c79115V3f.LJI = this.query_content;
        c79115V3f.LJII = this.preview_hint;
        c79115V3f.LJIIIIZZ = this.req_base;
        c79115V3f.LJIIIZ = this.resp_base;
        c79115V3f.addUnknownFields(unknownFields());
        return c79115V3f;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.plain_notice != null) {
            sb.append(", plain_notice=");
            sb.append(this.plain_notice);
        }
        if (this.interactive_notice != null) {
            sb.append(", interactive_notice=");
            sb.append(this.interactive_notice);
        }
        if (this.query_message_id != null) {
            sb.append(", query_message_id=");
            sb.append(this.query_message_id);
        }
        if (this.query_content != null) {
            sb.append(", query_content=");
            sb.append(this.query_content);
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
        return DIX.LIZLLL(sb, 0, 2, "InteractiveNoticeCard{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V42)) {
            return false;
        }
        V42 v42 = (V42) obj;
        if (unknownFields().equals(v42.unknownFields()) && C63685Oz3.LJ(this.plain_notice, v42.plain_notice) && C63685Oz3.LJ(this.interactive_notice, v42.interactive_notice) && C63685Oz3.LJ(this.query_message_id, v42.query_message_id) && C63685Oz3.LJ(this.query_content, v42.query_content) && C63685Oz3.LJ(this.preview_hint, v42.preview_hint) && C63685Oz3.LJ(this.req_base, v42.req_base) && C63685Oz3.LJ(this.resp_base, v42.resp_base)) {
            return true;
        }
        return false;
    }

    public V42(RUF ruf, RUF ruf2, String str, RUF ruf3, V4L v4l, RU2 ru2, RUB rub) {
        this(ruf, ruf2, str, ruf3, v4l, ru2, rub, C64537PUn.EMPTY);
    }

    public V42(RUF ruf, RUF ruf2, String str, RUF ruf3, V4L v4l, RU2 ru2, RUB rub, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.plain_notice = ruf;
        this.interactive_notice = ruf2;
        this.query_message_id = str;
        this.query_content = ruf3;
        this.preview_hint = v4l;
        this.req_base = ru2;
        this.resp_base = rub;
    }
}
