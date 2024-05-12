package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V4R extends Message<V4R, C79116V3g> {
    public static final ProtoAdapter<V4R> ADAPTER = new V4X();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Button#ADAPTER", tag = 4)
    public final C79141V4f button;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C79135V3z image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 3)
    public final RUF subtitle;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 2)
    public final RUF title;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            C79135V3z c79135V3z = this.image;
            int i5 = 0;
            if (c79135V3z != null) {
                i = c79135V3z.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            RUF ruf = this.title;
            if (ruf != null) {
                i2 = ruf.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            RUF ruf2 = this.subtitle;
            if (ruf2 != null) {
                i3 = ruf2.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            C79141V4f c79141V4f = this.button;
            if (c79141V4f != null) {
                i5 = c79141V4f.hashCode();
            }
            int i9 = i8 + i5;
            this.hashCode = i9;
            return i9;
        }
        return i4;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<V4R, C79116V3g> newBuilder2() {
        C79116V3g c79116V3g = new C79116V3g();
        c79116V3g.LIZLLL = this.image;
        c79116V3g.LJ = this.title;
        c79116V3g.LJFF = this.subtitle;
        c79116V3g.LJI = this.button;
        c79116V3g.addUnknownFields(unknownFields());
        return c79116V3g;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.subtitle != null) {
            sb.append(", subtitle=");
            sb.append(this.subtitle);
        }
        if (this.button != null) {
            sb.append(", button=");
            sb.append(this.button);
        }
        return DIX.LIZLLL(sb, 0, 2, "ImageCardTitle{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V4R)) {
            return false;
        }
        V4R v4r = (V4R) obj;
        if (unknownFields().equals(v4r.unknownFields()) && C63685Oz3.LJ(this.image, v4r.image) && C63685Oz3.LJ(this.title, v4r.title) && C63685Oz3.LJ(this.subtitle, v4r.subtitle) && C63685Oz3.LJ(this.button, v4r.button)) {
            return true;
        }
        return false;
    }

    public V4R(C79135V3z c79135V3z, RUF ruf, RUF ruf2, C79141V4f c79141V4f) {
        this(c79135V3z, ruf, ruf2, c79141V4f, C64537PUn.EMPTY);
    }

    public V4R(C79135V3z c79135V3z, RUF ruf, RUF ruf2, C79141V4f c79141V4f, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.image = c79135V3z;
        this.title = ruf;
        this.subtitle = ruf2;
        this.button = c79141V4f;
    }
}
