package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* renamed from: X.QVa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67098QVa extends Message<C67098QVa, C67110QVm> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.sync.v2.protocal.Ctrl#ADAPTER", tag = 5)
    public final QVF ctrl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String did;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", keyAdapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 255)
    public final java.util.Map<Integer, C64537PUn> infos;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long ts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String uid;

    @WireField(adapter = "com.bytedance.sync.v2.protocal.Version#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC67117QVt version;
    public static final ProtoAdapter<C67098QVa> ADAPTER = new C67100QVc();
    public static final EnumC67117QVt DEFAULT_VERSION = EnumC67117QVt.Unknown;
    public static final Long DEFAULT_TS = 0L;
    public static final QVF DEFAULT_CTRL = QVF.Default;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = (this.version.hashCode() + (unknownFields().hashCode() * 37)) * 37;
            String str = this.uid;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            String str2 = this.did;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            Long l = this.ts;
            if (l != null) {
                i3 = l.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            QVF qvf = this.ctrl;
            if (qvf != null) {
                i5 = qvf.hashCode();
            }
            int hashCode2 = this.infos.hashCode() + ((i8 + i5) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i4;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C67098QVa, C67110QVm> newBuilder2() {
        C67110QVm c67110QVm = new C67110QVm();
        c67110QVm.LIZLLL = this.version;
        c67110QVm.LJ = this.uid;
        c67110QVm.LJFF = this.did;
        c67110QVm.LJI = this.ts;
        c67110QVm.LJII = this.ctrl;
        c67110QVm.LJIIIIZZ = C63685Oz3.LIZLLL("infos", this.infos);
        c67110QVm.addUnknownFields(unknownFields());
        return c67110QVm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", version=");
        LIZJ.append(this.version);
        if (this.uid != null) {
            LIZJ.append(", uid=");
            LIZJ.append(this.uid);
        }
        if (this.did != null) {
            LIZJ.append(", did=");
            LIZJ.append(this.did);
        }
        if (this.ts != null) {
            LIZJ.append(", ts=");
            LIZJ.append(this.ts);
        }
        if (this.ctrl != null) {
            LIZJ.append(", ctrl=");
            LIZJ.append(this.ctrl);
        }
        if (!this.infos.isEmpty()) {
            LIZJ.append(", infos=");
            LIZJ.append(this.infos);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "BsyncHeader{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C67098QVa)) {
            return false;
        }
        C67098QVa c67098QVa = (C67098QVa) obj;
        if (unknownFields().equals(c67098QVa.unknownFields()) && this.version.equals(c67098QVa.version) && C63685Oz3.LJ(this.uid, c67098QVa.uid) && C63685Oz3.LJ(this.did, c67098QVa.did) && C63685Oz3.LJ(this.ts, c67098QVa.ts) && C63685Oz3.LJ(this.ctrl, c67098QVa.ctrl) && this.infos.equals(c67098QVa.infos)) {
            return true;
        }
        return false;
    }

    public C67098QVa(EnumC67117QVt enumC67117QVt, String str, String str2, Long l, QVF qvf, java.util.Map<Integer, C64537PUn> map) {
        this(enumC67117QVt, str, str2, l, qvf, map, C64537PUn.EMPTY);
    }

    public C67098QVa(EnumC67117QVt enumC67117QVt, String str, String str2, Long l, QVF qvf, java.util.Map<Integer, C64537PUn> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.version = enumC67117QVt;
        this.uid = str;
        this.did = str2;
        this.ts = l;
        this.ctrl = qvf;
        this.infos = C63685Oz3.LJI("infos", map);
    }
}
