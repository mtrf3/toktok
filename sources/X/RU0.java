package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes13.dex */
public final class RU0 extends Message<RU0, C69619RTz> {
    public static final ProtoAdapter<RU0> ADAPTER = new C69618RTy();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final java.util.Map<String, String> extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String resource_id;

    public int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.resource_id;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int hashCode2 = ((hashCode + i) * 37) + this.extra.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i2;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RU0, C69619RTz> newBuilder2() {
        C69619RTz c69619RTz = new C69619RTz();
        c69619RTz.LIZLLL = this.resource_id;
        c69619RTz.LJ = C63685Oz3.LIZLLL("extra", this.extra);
        c69619RTz.addUnknownFields(unknownFields());
        return c69619RTz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.resource_id != null) {
            sb.append(", resource_id=");
            sb.append(this.resource_id);
        }
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        return DIX.LIZLLL(sb, 0, 2, "QueryData{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RU0)) {
            return false;
        }
        RU0 ru0 = (RU0) obj;
        if (unknownFields().equals(ru0.unknownFields()) && C63685Oz3.LJ(this.resource_id, ru0.resource_id) && this.extra.equals(ru0.extra)) {
            return true;
        }
        return false;
    }

    public RU0(String str, java.util.Map<String, String> map) {
        this(str, map, C64537PUn.EMPTY);
    }

    public RU0(String str, java.util.Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.resource_id = str;
        this.extra = C63685Oz3.LJI("extra", map);
    }
}
