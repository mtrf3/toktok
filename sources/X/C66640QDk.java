package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* renamed from: X.QDk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66640QDk extends Message<C66640QDk, C66642QDm> {
    public static final ProtoAdapter<C66640QDk> ADAPTER = new C66641QDl();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String value;

    public int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int LJ = C79062V1e.LJ(this.key, unknownFields().hashCode() * 37, 37) + this.value.hashCode();
            this.hashCode = LJ;
            return LJ;
        }
        return i;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C66640QDk, C66642QDm> newBuilder2() {
        C66642QDm c66642QDm = new C66642QDm();
        c66642QDm.LIZLLL = this.key;
        c66642QDm.LJ = this.value;
        c66642QDm.addUnknownFields(unknownFields());
        return c66642QDm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", key=");
        LIZJ.append(this.key);
        LIZJ.append(", value=");
        LIZJ.append(this.value);
        return DIX.LIZLLL(LIZJ, 0, 2, "ExtendedEntry{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C66640QDk)) {
            return false;
        }
        C66640QDk c66640QDk = (C66640QDk) obj;
        if (unknownFields().equals(c66640QDk.unknownFields()) && this.key.equals(c66640QDk.key) && this.value.equals(c66640QDk.value)) {
            return true;
        }
        return false;
    }

    public C66640QDk(String str, String str2) {
        this(str, str2, C64537PUn.EMPTY);
    }

    public C66640QDk(String str, String str2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.key = str;
        this.value = str2;
    }
}
