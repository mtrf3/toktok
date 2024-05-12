package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* renamed from: X.V3s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79128V3s extends Message<C79128V3s, V3X> {
    public static final ProtoAdapter<C79128V3s> ADAPTER = new V47();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BotAnswerCard#ADAPTER", tag = 9)
    public final C79131V3v bot_answer_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.CommonMsgCard#ADAPTER", tag = 100)
    public final V4S common_msg_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.DynamicCard#ADAPTER", tag = 101)
    public final V46 dynamic_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ImageCard#ADAPTER", tag = 2)
    public final C79133V3x image_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InfoCard#ADAPTER", tag = 6)
    public final C79132V3w info_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InteractiveNoticeCard#ADAPTER", tag = 10)
    public final V42 interactive_notice_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PictureCard#ADAPTER", tag = 4)
    public final V41 picture_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PortraitCard#ADAPTER", tag = 8)
    public final C79130V3u portrait_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StickerCard#ADAPTER", tag = 7)
    public final V45 sticker_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VideoCard#ADAPTER", tag = 5)
    public final C79134V3y video_card;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = this.hashCode;
        if (i10 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            C79133V3x c79133V3x = this.image_card;
            int i11 = 0;
            if (c79133V3x != null) {
                i = c79133V3x.hashCode();
            } else {
                i = 0;
            }
            int i12 = (hashCode + i) * 37;
            V41 v41 = this.picture_card;
            if (v41 != null) {
                i2 = v41.hashCode();
            } else {
                i2 = 0;
            }
            int i13 = (i12 + i2) * 37;
            C79134V3y c79134V3y = this.video_card;
            if (c79134V3y != null) {
                i3 = c79134V3y.hashCode();
            } else {
                i3 = 0;
            }
            int i14 = (i13 + i3) * 37;
            C79132V3w c79132V3w = this.info_card;
            if (c79132V3w != null) {
                i4 = c79132V3w.hashCode();
            } else {
                i4 = 0;
            }
            int i15 = (i14 + i4) * 37;
            V45 v45 = this.sticker_card;
            if (v45 != null) {
                i5 = v45.hashCode();
            } else {
                i5 = 0;
            }
            int i16 = (i15 + i5) * 37;
            C79130V3u c79130V3u = this.portrait_card;
            if (c79130V3u != null) {
                i6 = c79130V3u.hashCode();
            } else {
                i6 = 0;
            }
            int i17 = (i16 + i6) * 37;
            C79131V3v c79131V3v = this.bot_answer_card;
            if (c79131V3v != null) {
                i7 = c79131V3v.hashCode();
            } else {
                i7 = 0;
            }
            int i18 = (i17 + i7) * 37;
            V42 v42 = this.interactive_notice_card;
            if (v42 != null) {
                i8 = v42.hashCode();
            } else {
                i8 = 0;
            }
            int i19 = (i18 + i8) * 37;
            V4S v4s = this.common_msg_card;
            if (v4s != null) {
                i9 = v4s.hashCode();
            } else {
                i9 = 0;
            }
            int i20 = (i19 + i9) * 37;
            V46 v46 = this.dynamic_card;
            if (v46 != null) {
                i11 = v46.hashCode();
            }
            int i21 = i20 + i11;
            this.hashCode = i21;
            return i21;
        }
        return i10;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C79128V3s, V3X> newBuilder2() {
        V3X v3x = new V3X();
        v3x.LIZLLL = this.image_card;
        v3x.LJ = this.picture_card;
        v3x.LJFF = this.video_card;
        v3x.LJI = this.info_card;
        v3x.LJII = this.sticker_card;
        v3x.LJIIIIZZ = this.portrait_card;
        v3x.LJIIIZ = this.bot_answer_card;
        v3x.LJIIJ = this.interactive_notice_card;
        v3x.LJIIJJI = this.common_msg_card;
        v3x.LJIIL = this.dynamic_card;
        v3x.addUnknownFields(unknownFields());
        return v3x;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image_card != null) {
            sb.append(", image_card=");
            sb.append(this.image_card);
        }
        if (this.picture_card != null) {
            sb.append(", picture_card=");
            sb.append(this.picture_card);
        }
        if (this.video_card != null) {
            sb.append(", video_card=");
            sb.append(this.video_card);
        }
        if (this.info_card != null) {
            sb.append(", info_card=");
            sb.append(this.info_card);
        }
        if (this.sticker_card != null) {
            sb.append(", sticker_card=");
            sb.append(this.sticker_card);
        }
        if (this.portrait_card != null) {
            sb.append(", portrait_card=");
            sb.append(this.portrait_card);
        }
        if (this.bot_answer_card != null) {
            sb.append(", bot_answer_card=");
            sb.append(this.bot_answer_card);
        }
        if (this.interactive_notice_card != null) {
            sb.append(", interactive_notice_card=");
            sb.append(this.interactive_notice_card);
        }
        if (this.common_msg_card != null) {
            sb.append(", common_msg_card=");
            sb.append(this.common_msg_card);
        }
        if (this.dynamic_card != null) {
            sb.append(", dynamic_card=");
            sb.append(this.dynamic_card);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessageContent{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C79128V3s)) {
            return false;
        }
        C79128V3s c79128V3s = (C79128V3s) obj;
        if (unknownFields().equals(c79128V3s.unknownFields()) && C63685Oz3.LJ(this.image_card, c79128V3s.image_card) && C63685Oz3.LJ(this.picture_card, c79128V3s.picture_card) && C63685Oz3.LJ(this.video_card, c79128V3s.video_card) && C63685Oz3.LJ(this.info_card, c79128V3s.info_card) && C63685Oz3.LJ(this.sticker_card, c79128V3s.sticker_card) && C63685Oz3.LJ(this.portrait_card, c79128V3s.portrait_card) && C63685Oz3.LJ(this.bot_answer_card, c79128V3s.bot_answer_card) && C63685Oz3.LJ(this.interactive_notice_card, c79128V3s.interactive_notice_card) && C63685Oz3.LJ(this.common_msg_card, c79128V3s.common_msg_card) && C63685Oz3.LJ(this.dynamic_card, c79128V3s.dynamic_card)) {
            return true;
        }
        return false;
    }

    public C79128V3s(C79133V3x c79133V3x, V41 v41, C79134V3y c79134V3y, C79132V3w c79132V3w, V45 v45, C79130V3u c79130V3u, C79131V3v c79131V3v, V42 v42, V4S v4s, V46 v46) {
        this(c79133V3x, v41, c79134V3y, c79132V3w, v45, c79130V3u, c79131V3v, v42, v4s, v46, C64537PUn.EMPTY);
    }

    public C79128V3s(C79133V3x c79133V3x, V41 v41, C79134V3y c79134V3y, C79132V3w c79132V3w, V45 v45, C79130V3u c79130V3u, C79131V3v c79131V3v, V42 v42, V4S v4s, V46 v46, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.image_card = c79133V3x;
        this.picture_card = v41;
        this.video_card = c79134V3y;
        this.info_card = c79132V3w;
        this.sticker_card = v45;
        this.portrait_card = c79130V3u;
        this.bot_answer_card = c79131V3v;
        this.interactive_notice_card = v42;
        this.common_msg_card = v4s;
        this.dynamic_card = v46;
    }
}
