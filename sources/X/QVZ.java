package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* loaded from: classes12.dex */
public final class QVZ extends Message<QVZ, C67109QVl> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.sync.v2.protocal.Bucket#ADAPTER", tag = 2)
    public final QW9 bucket;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 9)
    public final Long expire_time;

    @WireField(adapter = "com.bytedance.sync.v2.protocal.Flag#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final QVX flag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long new_cursor;

    @WireField(adapter = "com.bytedance.sync.v2.protocal.BsyncPacket#ADAPTER", label = WireField.Label.REPEATED, tag = 7)
    public final List<C67102QVe> packets;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long ref_cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 255)
    public final String req_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long sync_id;

    @WireField(adapter = "com.bytedance.sync.v2.protocal.TopicStatus#ADAPTER", tag = 8)
    public final EnumC67116QVs topic_status;

    @WireField(adapter = "com.bytedance.sync.v2.protocal.TopicType#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC67115QVr topic_type;
    public static final ProtoAdapter<QVZ> ADAPTER = new C67099QVb();
    public static final QVX DEFAULT_FLAG = QVX.None;
    public static final QW9 DEFAULT_BUCKET = QW9.Device;
    public static final EnumC67115QVr DEFAULT_TOPIC_TYPE = EnumC67115QVr.SpecTopic;
    public static final Long DEFAULT_SYNC_ID = 0L;
    public static final Long DEFAULT_REF_CURSOR = 0L;
    public static final Long DEFAULT_NEW_CURSOR = 0L;
    public static final EnumC67116QVs DEFAULT_TOPIC_STATUS = EnumC67116QVs.NotExist;
    public static final Long DEFAULT_EXPIRE_TIME = 0L;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 == 0) {
            int hashCode = (this.flag.hashCode() + (unknownFields().hashCode() * 37)) * 37;
            QW9 qw9 = this.bucket;
            int i8 = 0;
            if (qw9 != null) {
                i = qw9.hashCode();
            } else {
                i = 0;
            }
            int hashCode2 = (this.topic_type.hashCode() + ((hashCode + i) * 37)) * 37;
            Long l = this.sync_id;
            if (l != null) {
                i2 = l.hashCode();
            } else {
                i2 = 0;
            }
            int i9 = (hashCode2 + i2) * 37;
            Long l2 = this.ref_cursor;
            if (l2 != null) {
                i3 = l2.hashCode();
            } else {
                i3 = 0;
            }
            int i10 = (i9 + i3) * 37;
            Long l3 = this.new_cursor;
            if (l3 != null) {
                i4 = l3.hashCode();
            } else {
                i4 = 0;
            }
            int LIZ = C77339UWx.LIZ(this.packets, (i10 + i4) * 37, 37);
            EnumC67116QVs enumC67116QVs = this.topic_status;
            if (enumC67116QVs != null) {
                i5 = enumC67116QVs.hashCode();
            } else {
                i5 = 0;
            }
            int i11 = (LIZ + i5) * 37;
            Long l4 = this.expire_time;
            if (l4 != null) {
                i6 = l4.hashCode();
            } else {
                i6 = 0;
            }
            int i12 = (i11 + i6) * 37;
            String str = this.req_id;
            if (str != null) {
                i8 = str.hashCode();
            }
            int i13 = i12 + i8;
            this.hashCode = i13;
            return i13;
        }
        return i7;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<QVZ, C67109QVl> newBuilder2() {
        C67109QVl c67109QVl = new C67109QVl();
        c67109QVl.LIZLLL = this.flag;
        c67109QVl.LJ = this.bucket;
        c67109QVl.LJFF = this.topic_type;
        c67109QVl.LJI = this.sync_id;
        c67109QVl.LJII = this.ref_cursor;
        c67109QVl.LJIIIIZZ = this.new_cursor;
        c67109QVl.LJIIIZ = C63685Oz3.LIZJ("packets", this.packets);
        c67109QVl.LJIIJ = this.topic_status;
        c67109QVl.LJIIJJI = this.expire_time;
        c67109QVl.LJIIL = this.req_id;
        c67109QVl.addUnknownFields(unknownFields());
        return c67109QVl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", flag=");
        LIZJ.append(this.flag);
        if (this.bucket != null) {
            LIZJ.append(", bucket=");
            LIZJ.append(this.bucket);
        }
        LIZJ.append(", topic_type=");
        LIZJ.append(this.topic_type);
        if (this.sync_id != null) {
            LIZJ.append(", sync_id=");
            LIZJ.append(this.sync_id);
        }
        if (this.ref_cursor != null) {
            LIZJ.append(", ref_cursor=");
            LIZJ.append(this.ref_cursor);
        }
        if (this.new_cursor != null) {
            LIZJ.append(", new_cursor=");
            LIZJ.append(this.new_cursor);
        }
        if (!this.packets.isEmpty()) {
            LIZJ.append(", packets=");
            LIZJ.append(this.packets);
        }
        if (this.topic_status != null) {
            LIZJ.append(", topic_status=");
            LIZJ.append(this.topic_status);
        }
        if (this.expire_time != null) {
            LIZJ.append(", expire_time=");
            LIZJ.append(this.expire_time);
        }
        if (this.req_id != null) {
            LIZJ.append(", req_id=");
            LIZJ.append(this.req_id);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "BsyncTopic{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QVZ)) {
            return false;
        }
        QVZ qvz = (QVZ) obj;
        if (unknownFields().equals(qvz.unknownFields()) && this.flag.equals(qvz.flag) && C63685Oz3.LJ(this.bucket, qvz.bucket) && this.topic_type.equals(qvz.topic_type) && C63685Oz3.LJ(this.sync_id, qvz.sync_id) && C63685Oz3.LJ(this.ref_cursor, qvz.ref_cursor) && C63685Oz3.LJ(this.new_cursor, qvz.new_cursor) && this.packets.equals(qvz.packets) && C63685Oz3.LJ(this.topic_status, qvz.topic_status) && C63685Oz3.LJ(this.expire_time, qvz.expire_time) && C63685Oz3.LJ(this.req_id, qvz.req_id)) {
            return true;
        }
        return false;
    }

    public QVZ(QVX qvx, QW9 qw9, EnumC67115QVr enumC67115QVr, Long l, Long l2, Long l3, List<C67102QVe> list, EnumC67116QVs enumC67116QVs, Long l4, String str) {
        this(qvx, qw9, enumC67115QVr, l, l2, l3, list, enumC67116QVs, l4, str, C64537PUn.EMPTY);
    }

    public QVZ(QVX qvx, QW9 qw9, EnumC67115QVr enumC67115QVr, Long l, Long l2, Long l3, List<C67102QVe> list, EnumC67116QVs enumC67116QVs, Long l4, String str, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.flag = qvx;
        this.bucket = qw9;
        this.topic_type = enumC67115QVr;
        this.sync_id = l;
        this.ref_cursor = l2;
        this.new_cursor = l3;
        this.packets = C63685Oz3.LJFF("packets", list);
        this.topic_status = enumC67116QVs;
        this.expire_time = l4;
        this.req_id = str;
    }
}
