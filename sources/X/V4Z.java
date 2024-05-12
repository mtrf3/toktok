package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V4Z extends Message<V4Z, C79122V3m> {
    public static final ProtoAdapter<V4Z> ADAPTER = new C79145V4j();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 2)
    public final C79135V3z image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final RUF title;

    public int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            RUF ruf = this.title;
            int i3 = 0;
            if (ruf != null) {
                i = ruf.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            C79135V3z c79135V3z = this.image;
            if (c79135V3z != null) {
                i3 = c79135V3z.hashCode();
            }
            int i5 = i4 + i3;
            this.hashCode = i5;
            return i5;
        }
        return i2;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<V4Z, C79122V3m> newBuilder2() {
        C79122V3m c79122V3m = new C79122V3m();
        c79122V3m.LIZLLL = this.title;
        c79122V3m.LJ = this.image;
        c79122V3m.addUnknownFields(unknownFields());
        return c79122V3m;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        return DIX.LIZLLL(sb, 0, 2, "InfoCardTitle{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V4Z)) {
            return false;
        }
        V4Z v4z = (V4Z) obj;
        if (unknownFields().equals(v4z.unknownFields()) && C63685Oz3.LJ(this.title, v4z.title) && C63685Oz3.LJ(this.image, v4z.image)) {
            return true;
        }
        return false;
    }

    public V4Z(RUF ruf, C79135V3z c79135V3z) {
        this(ruf, c79135V3z, C64537PUn.EMPTY);
    }

    public V4Z(RUF ruf, C79135V3z c79135V3z, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.title = ruf;
        this.image = c79135V3z;
    }
}
