package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes13.dex */
public final class RU5 extends Message<RU5, RU6> {
    public static final ProtoAdapter<RU5> ADAPTER = new RU4();
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer width;

    public int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.height;
            int i3 = 0;
            if (num != null) {
                i = num.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            Integer num2 = this.width;
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
    public Message.Builder<RU5, RU6> newBuilder2() {
        RU6 ru6 = new RU6();
        ru6.LIZLLL = this.height;
        ru6.LJ = this.width;
        ru6.addUnknownFields(unknownFields());
        return ru6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        return DIX.LIZLLL(sb, 0, 2, "ButtonStyle{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RU5)) {
            return false;
        }
        RU5 ru5 = (RU5) obj;
        if (unknownFields().equals(ru5.unknownFields()) && C63685Oz3.LJ(this.height, ru5.height) && C63685Oz3.LJ(this.width, ru5.width)) {
            return true;
        }
        return false;
    }

    public RU5(Integer num, Integer num2) {
        this(num, num2, C64537PUn.EMPTY);
    }

    public RU5(Integer num, Integer num2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.height = num;
        this.width = num2;
    }
}
