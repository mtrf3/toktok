package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes13.dex */
public final class RU2 extends Message<RU2, RU3> {
    public static final ProtoAdapter<RU2> ADAPTER = new RU1();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.QueryData#ADAPTER", tag = 1)
    public final RU0 query_data;

    public int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            RU0 ru0 = this.query_data;
            if (ru0 != null) {
                i = ru0.hashCode();
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
    public Message.Builder<RU2, RU3> newBuilder2() {
        RU3 ru3 = new RU3();
        ru3.LIZLLL = this.query_data;
        ru3.addUnknownFields(unknownFields());
        return ru3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.query_data != null) {
            sb.append(", query_data=");
            sb.append(this.query_data);
        }
        return DIX.LIZLLL(sb, 0, 2, "BaseReq{", '}');
    }

    public RU2(RU0 ru0) {
        this(ru0, C64537PUn.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RU2)) {
            return false;
        }
        RU2 ru2 = (RU2) obj;
        if (unknownFields().equals(ru2.unknownFields()) && C63685Oz3.LJ(this.query_data, ru2.query_data)) {
            return true;
        }
        return false;
    }

    public RU2(RU0 ru0, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.query_data = ru0;
    }
}
