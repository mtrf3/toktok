package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes13.dex */
public final class RUF extends Message<RUF, RUG> {
    public static final ProtoAdapter<RUF> ADAPTER = new RUE();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String text;

    public int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            if (str != null) {
                i = str.hashCode();
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
    public Message.Builder<RUF, RUG> newBuilder2() {
        RUG rug = new RUG();
        rug.LIZLLL = this.text;
        rug.addUnknownFields(unknownFields());
        return rug;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        return DIX.LIZLLL(sb, 0, 2, "BaseText{", '}');
    }

    public RUF(String str) {
        this(str, C64537PUn.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RUF)) {
            return false;
        }
        RUF ruf = (RUF) obj;
        if (unknownFields().equals(ruf.unknownFields()) && C63685Oz3.LJ(this.text, ruf.text)) {
            return true;
        }
        return false;
    }

    public RUF(String str, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.text = str;
    }
}
