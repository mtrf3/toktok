package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes13.dex */
public final class RU9 extends Message<RU9, RUA> {
    public static final ProtoAdapter<RU9> ADAPTER = new RU8();
    public static final Long DEFAULT_EXPIRED_AT = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long expired_at;

    public int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.expired_at;
            if (l != null) {
                i = l.hashCode();
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
    public Message.Builder<RU9, RUA> newBuilder2() {
        RUA rua = new RUA();
        rua.LIZLLL = this.expired_at;
        rua.addUnknownFields(unknownFields());
        return rua;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.expired_at != null) {
            sb.append(", expired_at=");
            sb.append(this.expired_at);
        }
        return DIX.LIZLLL(sb, 0, 2, "TTL{", '}');
    }

    public RU9(Long l) {
        this(l, C64537PUn.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RU9)) {
            return false;
        }
        RU9 ru9 = (RU9) obj;
        if (unknownFields().equals(ru9.unknownFields()) && C63685Oz3.LJ(this.expired_at, ru9.expired_at)) {
            return true;
        }
        return false;
    }

    public RU9(Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.expired_at = l;
    }
}
