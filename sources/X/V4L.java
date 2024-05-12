package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V4L extends Message<V4L, V34> {
    public static final ProtoAdapter<V4L> ADAPTER = new V4M();
    public static final V2T DEFAULT_QUOTE_PREVIEW_TYPE = V2T.TEXT;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.QuotePicturePreview#ADAPTER", tag = 5)
    public final V40 quote_picture_preview;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 3)
    public final RUF quote_preview_text;

    @WireField(adapter = "com.bytedance.im.message.template.proto.QuotePreviewType#ADAPTER", tag = 4)
    public final V2T quote_preview_type;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 2)
    public final RUF receiver_preview_text;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final RUF sender_preview_text;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            RUF ruf = this.sender_preview_text;
            int i6 = 0;
            if (ruf != null) {
                i = ruf.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            RUF ruf2 = this.receiver_preview_text;
            if (ruf2 != null) {
                i2 = ruf2.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            RUF ruf3 = this.quote_preview_text;
            if (ruf3 != null) {
                i3 = ruf3.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            V2T v2t = this.quote_preview_type;
            if (v2t != null) {
                i4 = v2t.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            V40 v40 = this.quote_picture_preview;
            if (v40 != null) {
                i6 = v40.hashCode();
            }
            int i11 = i10 + i6;
            this.hashCode = i11;
            return i11;
        }
        return i5;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<V4L, V34> newBuilder2() {
        V34 v34 = new V34();
        v34.LIZLLL = this.sender_preview_text;
        v34.LJ = this.receiver_preview_text;
        v34.LJFF = this.quote_preview_text;
        v34.LJI = this.quote_preview_type;
        v34.LJII = this.quote_picture_preview;
        v34.addUnknownFields(unknownFields());
        return v34;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sender_preview_text != null) {
            sb.append(", sender_preview_text=");
            sb.append(this.sender_preview_text);
        }
        if (this.receiver_preview_text != null) {
            sb.append(", receiver_preview_text=");
            sb.append(this.receiver_preview_text);
        }
        if (this.quote_preview_text != null) {
            sb.append(", quote_preview_text=");
            sb.append(this.quote_preview_text);
        }
        if (this.quote_preview_type != null) {
            sb.append(", quote_preview_type=");
            sb.append(this.quote_preview_type);
        }
        if (this.quote_picture_preview != null) {
            sb.append(", quote_picture_preview=");
            sb.append(this.quote_picture_preview);
        }
        return DIX.LIZLLL(sb, 0, 2, "PreviewHint{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V4L)) {
            return false;
        }
        V4L v4l = (V4L) obj;
        if (unknownFields().equals(v4l.unknownFields()) && C63685Oz3.LJ(this.sender_preview_text, v4l.sender_preview_text) && C63685Oz3.LJ(this.receiver_preview_text, v4l.receiver_preview_text) && C63685Oz3.LJ(this.quote_preview_text, v4l.quote_preview_text) && C63685Oz3.LJ(this.quote_preview_type, v4l.quote_preview_type) && C63685Oz3.LJ(this.quote_picture_preview, v4l.quote_picture_preview)) {
            return true;
        }
        return false;
    }

    public V4L(RUF ruf, RUF ruf2, RUF ruf3, V2T v2t, V40 v40) {
        this(ruf, ruf2, ruf3, v2t, v40, C64537PUn.EMPTY);
    }

    public V4L(RUF ruf, RUF ruf2, RUF ruf3, V2T v2t, V40 v40, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.sender_preview_text = ruf;
        this.receiver_preview_text = ruf2;
        this.quote_preview_text = ruf3;
        this.quote_preview_type = v2t;
        this.quote_picture_preview = v40;
    }
}
