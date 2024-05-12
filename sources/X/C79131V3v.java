package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* renamed from: X.V3v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79131V3v extends Message<C79131V3v, V3W> {
    public static final ProtoAdapter<C79131V3v> ADAPTER = new V48();
    public static final V3T DEFAULT_ANSWER_STATUS = V3T.AnswerNormal;
    public static final Integer DEFAULT_CARD_TYPE = 0;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final RUF answer;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AnswerStatus#ADAPTER", tag = 3)
    public final V3T answer_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer card_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REPEATED, tag = 8)
    public final List<Integer> content_types;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public final List<C63714OzW> link_infos;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 4)
    public final V4L preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Item#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<V4U> recommend_items;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseUser#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<C79129V3t> recommend_users;

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
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            RUF ruf = this.answer;
            int i7 = 0;
            if (ruf != null) {
                i = ruf.hashCode();
            } else {
                i = 0;
            }
            int LIZ = C77339UWx.LIZ(this.recommend_items, (hashCode + i) * 37, 37);
            V3T v3t = this.answer_status;
            if (v3t != null) {
                i2 = v3t.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (LIZ + i2) * 37;
            V4L v4l = this.preview_hint;
            if (v4l != null) {
                i3 = v4l.hashCode();
            } else {
                i3 = 0;
            }
            int LIZ2 = C77339UWx.LIZ(this.link_infos, C77339UWx.LIZ(this.recommend_users, (i8 + i3) * 37, 37), 37);
            Integer num = this.card_type;
            if (num != null) {
                i4 = num.hashCode();
            } else {
                i4 = 0;
            }
            int LIZ3 = C77339UWx.LIZ(this.content_types, (LIZ2 + i4) * 37, 37);
            RU2 ru2 = this.req_base;
            if (ru2 != null) {
                i5 = ru2.hashCode();
            } else {
                i5 = 0;
            }
            int i9 = (LIZ3 + i5) * 37;
            RUB rub = this.resp_base;
            if (rub != null) {
                i7 = rub.hashCode();
            }
            int i10 = i9 + i7;
            this.hashCode = i10;
            return i10;
        }
        return i6;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C79131V3v, V3W> newBuilder2() {
        V3W v3w = new V3W();
        v3w.LIZLLL = this.answer;
        v3w.LJ = C63685Oz3.LIZJ("recommend_items", this.recommend_items);
        v3w.LJFF = this.answer_status;
        v3w.LJI = this.preview_hint;
        v3w.LJII = C63685Oz3.LIZJ("recommend_users", this.recommend_users);
        v3w.LJIIIIZZ = C63685Oz3.LIZJ("link_infos", this.link_infos);
        v3w.LJIIIZ = this.card_type;
        v3w.LJIIJ = C63685Oz3.LIZJ("content_types", this.content_types);
        v3w.LJIIJJI = this.req_base;
        v3w.LJIIL = this.resp_base;
        v3w.addUnknownFields(unknownFields());
        return v3w;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.answer != null) {
            sb.append(", answer=");
            sb.append(this.answer);
        }
        if (!this.recommend_items.isEmpty()) {
            sb.append(", recommend_items=");
            sb.append(this.recommend_items);
        }
        if (this.answer_status != null) {
            sb.append(", answer_status=");
            sb.append(this.answer_status);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (!this.recommend_users.isEmpty()) {
            sb.append(", recommend_users=");
            sb.append(this.recommend_users);
        }
        if (!this.link_infos.isEmpty()) {
            sb.append(", link_infos=");
            sb.append(this.link_infos);
        }
        if (this.card_type != null) {
            sb.append(", card_type=");
            sb.append(this.card_type);
        }
        if (!this.content_types.isEmpty()) {
            sb.append(", content_types=");
            sb.append(this.content_types);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        return DIX.LIZLLL(sb, 0, 2, "BotAnswerCard{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C79131V3v)) {
            return false;
        }
        C79131V3v c79131V3v = (C79131V3v) obj;
        if (unknownFields().equals(c79131V3v.unknownFields()) && C63685Oz3.LJ(this.answer, c79131V3v.answer) && this.recommend_items.equals(c79131V3v.recommend_items) && C63685Oz3.LJ(this.answer_status, c79131V3v.answer_status) && C63685Oz3.LJ(this.preview_hint, c79131V3v.preview_hint) && this.recommend_users.equals(c79131V3v.recommend_users) && this.link_infos.equals(c79131V3v.link_infos) && C63685Oz3.LJ(this.card_type, c79131V3v.card_type) && this.content_types.equals(c79131V3v.content_types) && C63685Oz3.LJ(this.req_base, c79131V3v.req_base) && C63685Oz3.LJ(this.resp_base, c79131V3v.resp_base)) {
            return true;
        }
        return false;
    }

    public C79131V3v(RUF ruf, List<V4U> list, V3T v3t, V4L v4l, List<C79129V3t> list2, List<C63714OzW> list3, Integer num, List<Integer> list4, RU2 ru2, RUB rub) {
        this(ruf, list, v3t, v4l, list2, list3, num, list4, ru2, rub, C64537PUn.EMPTY);
    }

    public C79131V3v(RUF ruf, List<V4U> list, V3T v3t, V4L v4l, List<C79129V3t> list2, List<C63714OzW> list3, Integer num, List<Integer> list4, RU2 ru2, RUB rub, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.answer = ruf;
        this.recommend_items = C63685Oz3.LJFF("recommend_items", list);
        this.answer_status = v3t;
        this.preview_hint = v4l;
        this.recommend_users = C63685Oz3.LJFF("recommend_users", list2);
        this.link_infos = C63685Oz3.LJFF("link_infos", list3);
        this.card_type = num;
        this.content_types = C63685Oz3.LJFF("content_types", list4);
        this.req_base = ru2;
        this.resp_base = rub;
    }
}
