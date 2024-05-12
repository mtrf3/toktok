package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* renamed from: X.QVf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67103QVf extends Message<C67103QVf, C67113QVp> {
    public static final ProtoAdapter<C67103QVf> ADAPTER = new C67104QVg();
    public static final Integer DEFAULT_BUSINESS = 0;
    public static final EnumC68499QuV DEFAULT_CONSUME_TYPE = EnumC68499QuV.OneByOne;
    public static final C64537PUn DEFAULT_DATA = C64537PUn.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer business;

    @WireField(adapter = "com.bytedance.sync.v2.protocal.ConsumeType#ADAPTER", tag = 2)
    public final EnumC68499QuV consume_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 4)
    public final C64537PUn data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String md5;

    public int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = (this.business.hashCode() + (unknownFields().hashCode() * 37)) * 37;
            EnumC68499QuV enumC68499QuV = this.consume_type;
            int i4 = 0;
            if (enumC68499QuV != null) {
                i = enumC68499QuV.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            String str = this.md5;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            C64537PUn c64537PUn = this.data;
            if (c64537PUn != null) {
                i4 = c64537PUn.hashCode();
            }
            int i7 = i6 + i4;
            this.hashCode = i7;
            return i7;
        }
        return i3;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C67103QVf, C67113QVp> newBuilder2() {
        C67113QVp c67113QVp = new C67113QVp();
        c67113QVp.LIZLLL = this.business;
        c67113QVp.LJ = this.consume_type;
        c67113QVp.LJFF = this.md5;
        c67113QVp.LJI = this.data;
        c67113QVp.addUnknownFields(unknownFields());
        return c67113QVp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", business=");
        LIZJ.append(this.business);
        if (this.consume_type != null) {
            LIZJ.append(", consume_type=");
            LIZJ.append(this.consume_type);
        }
        if (this.md5 != null) {
            LIZJ.append(", md5=");
            LIZJ.append(this.md5);
        }
        if (this.data != null) {
            LIZJ.append(", data=");
            LIZJ.append(this.data);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "BsyncPayload{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C67103QVf)) {
            return false;
        }
        C67103QVf c67103QVf = (C67103QVf) obj;
        if (unknownFields().equals(c67103QVf.unknownFields()) && this.business.equals(c67103QVf.business) && C63685Oz3.LJ(this.consume_type, c67103QVf.consume_type) && C63685Oz3.LJ(this.md5, c67103QVf.md5) && C63685Oz3.LJ(this.data, c67103QVf.data)) {
            return true;
        }
        return false;
    }

    public C67103QVf(Integer num, EnumC68499QuV enumC68499QuV, String str, C64537PUn c64537PUn) {
        this(num, enumC68499QuV, str, c64537PUn, C64537PUn.EMPTY);
    }

    public C67103QVf(Integer num, EnumC68499QuV enumC68499QuV, String str, C64537PUn c64537PUn, C64537PUn c64537PUn2) {
        super(ADAPTER, c64537PUn2);
        this.business = num;
        this.consume_type = enumC68499QuV;
        this.md5 = str;
        this.data = c64537PUn;
    }
}
