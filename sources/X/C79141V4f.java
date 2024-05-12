package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* renamed from: X.V4f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79141V4f extends Message<C79141V4f, C79151V4p> {
    public static final ProtoAdapter<C79141V4f> ADAPTER = new C79142V4g();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 4)
    public final C63714OzW link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ButtonStyle#ADAPTER", tag = 2)
    public final RU5 style;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final RUF text;

    public int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            RUF ruf = this.text;
            int i4 = 0;
            if (ruf != null) {
                i = ruf.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            RU5 ru5 = this.style;
            if (ru5 != null) {
                i2 = ru5.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            C63714OzW c63714OzW = this.link_info;
            if (c63714OzW != null) {
                i4 = c63714OzW.hashCode();
            }
            int i7 = i6 + i4;
            this.hashCode = i7;
            return i7;
        }
        return i3;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C79141V4f, C79151V4p> newBuilder2() {
        C79151V4p c79151V4p = new C79151V4p();
        c79151V4p.LIZLLL = this.text;
        c79151V4p.LJ = this.style;
        c79151V4p.LJFF = this.link_info;
        c79151V4p.addUnknownFields(unknownFields());
        return c79151V4p;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.style != null) {
            sb.append(", style=");
            sb.append(this.style);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        return DIX.LIZLLL(sb, 0, 2, "Button{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C79141V4f)) {
            return false;
        }
        C79141V4f c79141V4f = (C79141V4f) obj;
        if (unknownFields().equals(c79141V4f.unknownFields()) && C63685Oz3.LJ(this.text, c79141V4f.text) && C63685Oz3.LJ(this.style, c79141V4f.style) && C63685Oz3.LJ(this.link_info, c79141V4f.link_info)) {
            return true;
        }
        return false;
    }

    public C79141V4f(RUF ruf, RU5 ru5, C63714OzW c63714OzW) {
        this(ruf, ru5, c63714OzW, C64537PUn.EMPTY);
    }

    public C79141V4f(RUF ruf, RU5 ru5, C63714OzW c63714OzW, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.text = ruf;
        this.style = ru5;
        this.link_info = c63714OzW;
    }
}
