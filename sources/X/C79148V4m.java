package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* renamed from: X.V4m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79148V4m extends Message<C79148V4m, C79123V3n> {
    public static final ProtoAdapter<C79148V4m> ADAPTER = new C79149V4n();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C79135V3z placeholder;

    public int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            C79135V3z c79135V3z = this.placeholder;
            if (c79135V3z != null) {
                i = c79135V3z.hashCode();
            } else {
                i = 0;
            }
            int i3 = hashCode + i;
            this.hashCode = i3;
            return i3;
        }
        return i2;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C79148V4m, C79123V3n> newBuilder2() {
        C79123V3n c79123V3n = new C79123V3n();
        c79123V3n.LIZLLL = this.placeholder;
        c79123V3n.addUnknownFields(unknownFields());
        return c79123V3n;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.placeholder != null) {
            sb.append(", placeholder=");
            sb.append(this.placeholder);
        }
        return DIX.LIZLLL(sb, 0, 2, "StickerCardFallbackInfo{", '}');
    }

    public C79148V4m(C79135V3z c79135V3z) {
        this(c79135V3z, C64537PUn.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C79148V4m)) {
            return false;
        }
        C79148V4m c79148V4m = (C79148V4m) obj;
        if (unknownFields().equals(c79148V4m.unknownFields()) && C63685Oz3.LJ(this.placeholder, c79148V4m.placeholder)) {
            return true;
        }
        return false;
    }

    public C79148V4m(C79135V3z c79135V3z, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.placeholder = c79135V3z;
    }
}
