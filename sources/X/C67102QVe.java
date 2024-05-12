package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* renamed from: X.QVe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67102QVe extends Message<C67102QVe, C67112QVo> {
    public static final ProtoAdapter<C67102QVe> ADAPTER = new C67106QVi();
    public static final Long DEFAULT_TS = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.sync.v2.protocal.BsyncCursor#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C67107QVj cursor;

    @WireField(adapter = "com.bytedance.sync.v2.protocal.BsyncPayload#ADAPTER", tag = 2)
    public final C67103QVf payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 255)
    public final Long ts;

    public int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = (this.cursor.hashCode() + (unknownFields().hashCode() * 37)) * 37;
            C67103QVf c67103QVf = this.payload;
            int i3 = 0;
            if (c67103QVf != null) {
                i = c67103QVf.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 37;
            Long l = this.ts;
            if (l != null) {
                i3 = l.hashCode();
            }
            int i5 = i4 + i3;
            this.hashCode = i5;
            return i5;
        }
        return i2;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C67102QVe, C67112QVo> newBuilder2() {
        C67112QVo c67112QVo = new C67112QVo();
        c67112QVo.LIZLLL = this.cursor;
        c67112QVo.LJ = this.payload;
        c67112QVo.LJFF = this.ts;
        c67112QVo.addUnknownFields(unknownFields());
        return c67112QVo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", cursor=");
        LIZJ.append(this.cursor);
        if (this.payload != null) {
            LIZJ.append(", payload=");
            LIZJ.append(this.payload);
        }
        if (this.ts != null) {
            LIZJ.append(", ts=");
            LIZJ.append(this.ts);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "BsyncPacket{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C67102QVe)) {
            return false;
        }
        C67102QVe c67102QVe = (C67102QVe) obj;
        if (unknownFields().equals(c67102QVe.unknownFields()) && this.cursor.equals(c67102QVe.cursor) && C63685Oz3.LJ(this.payload, c67102QVe.payload) && C63685Oz3.LJ(this.ts, c67102QVe.ts)) {
            return true;
        }
        return false;
    }

    public C67102QVe(C67107QVj c67107QVj, C67103QVf c67103QVf, Long l) {
        this(c67107QVj, c67103QVf, l, C64537PUn.EMPTY);
    }

    public C67102QVe(C67107QVj c67107QVj, C67103QVf c67103QVf, Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.cursor = c67107QVj;
        this.payload = c67103QVf;
        this.ts = l;
    }
}
