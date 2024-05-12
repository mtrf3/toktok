package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* loaded from: classes13.dex */
public final class RUV extends Message<RUV, RUX> {
    public static final ProtoAdapter<RUV> ADAPTER = new RUW();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<RUF> contents;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final RUF description;

    public int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            RUF ruf = this.description;
            if (ruf != null) {
                i = ruf.hashCode();
            } else {
                i = 0;
            }
            int hashCode2 = ((hashCode + i) * 37) + this.contents.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i2;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RUV, RUX> newBuilder2() {
        RUX rux = new RUX();
        rux.LIZLLL = this.description;
        rux.LJ = C63685Oz3.LIZJ("contents", this.contents);
        rux.addUnknownFields(unknownFields());
        return rux;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (!this.contents.isEmpty()) {
            sb.append(", contents=");
            sb.append(this.contents);
        }
        return DIX.LIZLLL(sb, 0, 2, "InfoCardContent{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RUV)) {
            return false;
        }
        RUV ruv = (RUV) obj;
        if (unknownFields().equals(ruv.unknownFields()) && C63685Oz3.LJ(this.description, ruv.description) && this.contents.equals(ruv.contents)) {
            return true;
        }
        return false;
    }

    public RUV(RUF ruf, List<RUF> list) {
        this(ruf, list, C64537PUn.EMPTY);
    }

    public RUV(RUF ruf, List<RUF> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.description = ruf;
        this.contents = C63685Oz3.LJFF("contents", list);
    }
}
