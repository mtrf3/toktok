package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V4N extends Message<V4N, C79117V3h> {
    public static final ProtoAdapter<V4N> ADAPTER = new V4O();
    public static final V3D DEFAULT_TYPE = V3D.DEFAULT;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 2)
    public final RUF hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 3)
    public final C63714OzW link;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final RUF text;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ButtonType#ADAPTER", tag = 4)
    public final V3D type;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            RUF ruf = this.text;
            int i5 = 0;
            if (ruf != null) {
                i = ruf.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            RUF ruf2 = this.hint;
            if (ruf2 != null) {
                i2 = ruf2.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            C63714OzW c63714OzW = this.link;
            if (c63714OzW != null) {
                i3 = c63714OzW.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            V3D v3d = this.type;
            if (v3d != null) {
                i5 = v3d.hashCode();
            }
            int i9 = i8 + i5;
            this.hashCode = i9;
            return i9;
        }
        return i4;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<V4N, C79117V3h> newBuilder2() {
        C79117V3h c79117V3h = new C79117V3h();
        c79117V3h.LIZLLL = this.text;
        c79117V3h.LJ = this.hint;
        c79117V3h.LJFF = this.link;
        c79117V3h.LJI = this.type;
        c79117V3h.addUnknownFields(unknownFields());
        return c79117V3h;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.hint != null) {
            sb.append(", hint=");
            sb.append(this.hint);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        return DIX.LIZLLL(sb, 0, 2, "InfoCardButton{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V4N)) {
            return false;
        }
        V4N v4n = (V4N) obj;
        if (unknownFields().equals(v4n.unknownFields()) && C63685Oz3.LJ(this.text, v4n.text) && C63685Oz3.LJ(this.hint, v4n.hint) && C63685Oz3.LJ(this.link, v4n.link) && C63685Oz3.LJ(this.type, v4n.type)) {
            return true;
        }
        return false;
    }

    public V4N(RUF ruf, RUF ruf2, C63714OzW c63714OzW, V3D v3d) {
        this(ruf, ruf2, c63714OzW, v3d, C64537PUn.EMPTY);
    }

    public V4N(RUF ruf, RUF ruf2, C63714OzW c63714OzW, V3D v3d, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.text = ruf;
        this.hint = ruf2;
        this.link = c63714OzW;
        this.type = v3d;
    }
}
