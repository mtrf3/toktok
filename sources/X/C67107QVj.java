package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* renamed from: X.QVj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67107QVj extends Message<C67107QVj, C67114QVq> {
    public static final ProtoAdapter<C67107QVj> ADAPTER = new C67108QVk();
    public static final Long DEFAULT_CURSOR = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long cursor;

    public int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.cursor.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C67107QVj, C67114QVq> newBuilder2() {
        C67114QVq c67114QVq = new C67114QVq();
        c67114QVq.LIZLLL = this.cursor;
        c67114QVq.addUnknownFields(unknownFields());
        return c67114QVq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", cursor=");
        LIZJ.append(this.cursor);
        return DIX.LIZLLL(LIZJ, 0, 2, "BsyncCursor{", '}');
    }

    public C67107QVj(Long l) {
        this(l, C64537PUn.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C67107QVj)) {
            return false;
        }
        C67107QVj c67107QVj = (C67107QVj) obj;
        if (unknownFields().equals(c67107QVj.unknownFields()) && this.cursor.equals(c67107QVj.cursor)) {
            return true;
        }
        return false;
    }

    public C67107QVj(Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.cursor = l;
    }
}
