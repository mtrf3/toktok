package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* renamed from: X.Q8h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66507Q8h extends Message<C66507Q8h, Q3O> {
    public static final ProtoAdapter<C66507Q8h> ADAPTER = new C66506Q8g();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String value;

    public int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.key;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            String str2 = this.value;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            int i5 = i4 + i3;
            this.hashCode = i5;
            return i5;
        }
        return i2;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C66507Q8h, Q3O> newBuilder2() {
        Q3O q3o = new Q3O();
        q3o.LIZLLL = this.key;
        q3o.LJ = this.value;
        q3o.addUnknownFields(unknownFields());
        return q3o;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        return DIX.LIZLLL(sb, 0, 2, "ExtendedEntry{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C66507Q8h)) {
            return false;
        }
        C66507Q8h c66507Q8h = (C66507Q8h) obj;
        if (C63685Oz3.LJ(unknownFields(), c66507Q8h.unknownFields()) && C63685Oz3.LJ(this.key, c66507Q8h.key) && C63685Oz3.LJ(this.value, c66507Q8h.value)) {
            return true;
        }
        return false;
    }

    public C66507Q8h(String str, String str2) {
        this(str, str2, C64537PUn.EMPTY);
    }

    public C66507Q8h(String str, String str2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.key = str;
        this.value = str2;
    }
}
