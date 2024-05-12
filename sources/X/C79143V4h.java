package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* renamed from: X.V4h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79143V4h extends Message<C79143V4h, V35> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer width;
    public static final ProtoAdapter<C79143V4h> ADAPTER = new C79147V4l();
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;

    public int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.width;
            int i3 = 0;
            if (num != null) {
                i = num.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            Integer num2 = this.height;
            if (num2 != null) {
                i3 = num2.hashCode();
            }
            int i5 = i4 + i3;
            this.hashCode = i5;
            return i5;
        }
        return i2;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C79143V4h, V35> newBuilder2() {
        V35 v35 = new V35();
        v35.LIZLLL = this.width;
        v35.LJ = this.height;
        v35.addUnknownFields(unknownFields());
        return v35;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        return DIX.LIZLLL(sb, 0, 2, "Resolution{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C79143V4h)) {
            return false;
        }
        C79143V4h c79143V4h = (C79143V4h) obj;
        if (unknownFields().equals(c79143V4h.unknownFields()) && C63685Oz3.LJ(this.width, c79143V4h.width) && C63685Oz3.LJ(this.height, c79143V4h.height)) {
            return true;
        }
        return false;
    }

    public C79143V4h(Integer num, Integer num2) {
        this(num, num2, C64537PUn.EMPTY);
    }

    public C79143V4h(Integer num, Integer num2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.width = num;
        this.height = num2;
    }
}
