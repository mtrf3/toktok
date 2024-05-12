package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V4Q extends Message<V4Q, C79118V3i> {
    public static final ProtoAdapter<V4Q> ADAPTER = new C79137V4b();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C79135V3z image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 3)
    public final C63714OzW link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 2)
    public final RUF text;

    public int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            C79135V3z c79135V3z = this.image;
            int i4 = 0;
            if (c79135V3z != null) {
                i = c79135V3z.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            RUF ruf = this.text;
            if (ruf != null) {
                i2 = ruf.hashCode();
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
    public Message.Builder<V4Q, C79118V3i> newBuilder2() {
        C79118V3i c79118V3i = new C79118V3i();
        c79118V3i.LIZLLL = this.image;
        c79118V3i.LJ = this.text;
        c79118V3i.LJFF = this.link_info;
        c79118V3i.addUnknownFields(unknownFields());
        return c79118V3i;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        return DIX.LIZLLL(sb, 0, 2, "FallbackInfo{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V4Q)) {
            return false;
        }
        V4Q v4q = (V4Q) obj;
        if (unknownFields().equals(v4q.unknownFields()) && C63685Oz3.LJ(this.image, v4q.image) && C63685Oz3.LJ(this.text, v4q.text) && C63685Oz3.LJ(this.link_info, v4q.link_info)) {
            return true;
        }
        return false;
    }

    public V4Q(C79135V3z c79135V3z, RUF ruf, C63714OzW c63714OzW) {
        this(c79135V3z, ruf, c63714OzW, C64537PUn.EMPTY);
    }

    public V4Q(C79135V3z c79135V3z, RUF ruf, C63714OzW c63714OzW, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.image = c79135V3z;
        this.text = ruf;
        this.link_info = c63714OzW;
    }
}
