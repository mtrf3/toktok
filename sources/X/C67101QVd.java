package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* renamed from: X.QVd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67101QVd extends Message<C67101QVd, C67111QVn> {
    public static final ProtoAdapter<C67101QVd> ADAPTER = new C67105QVh();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.sync.v2.protocal.BsyncHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C67098QVa header;

    @WireField(adapter = "com.bytedance.sync.v2.protocal.BsyncTopic#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<QVZ> topics;

    public int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = this.topics.hashCode() + ((this.header.hashCode() + (unknownFields().hashCode() * 37)) * 37);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C67101QVd, C67111QVn> newBuilder2() {
        C67111QVn c67111QVn = new C67111QVn();
        c67111QVn.LIZLLL = this.header;
        c67111QVn.LJ = C63685Oz3.LIZJ("topics", this.topics);
        c67111QVn.addUnknownFields(unknownFields());
        return c67111QVn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", header=");
        LIZJ.append(this.header);
        if (!this.topics.isEmpty()) {
            LIZJ.append(", topics=");
            LIZJ.append(this.topics);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "BsyncProtocol{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C67101QVd)) {
            return false;
        }
        C67101QVd c67101QVd = (C67101QVd) obj;
        if (unknownFields().equals(c67101QVd.unknownFields()) && this.header.equals(c67101QVd.header) && this.topics.equals(c67101QVd.topics)) {
            return true;
        }
        return false;
    }

    public C67101QVd(C67098QVa c67098QVa, List<QVZ> list) {
        this(c67098QVa, list, C64537PUn.EMPTY);
    }

    public C67101QVd(C67098QVa c67098QVa, List<QVZ> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.header = c67098QVa;
        this.topics = C63685Oz3.LJFF("topics", list);
    }
}
