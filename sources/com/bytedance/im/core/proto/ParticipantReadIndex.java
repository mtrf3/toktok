package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RSU;
import X.RSV;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ParticipantReadIndex extends Message<ParticipantReadIndex, RSV> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("index")
    public final Long index;

    @InterfaceC65349Pkn("index_min")
    public final Long index_min;

    @InterfaceC65349Pkn("index_v2")
    public final Long index_v2;

    @InterfaceC65349Pkn("sec_uid")
    public final String sec_uid;

    @InterfaceC65349Pkn("user_id")
    public final Long user_id;
    public static final ProtoAdapter<ParticipantReadIndex> ADAPTER = new RSU();
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_INDEX = 0L;
    public static final Long DEFAULT_INDEX_V2 = 0L;
    public static final Long DEFAULT_INDEX_MIN = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ParticipantReadIndex, RSV> newBuilder2() {
        RSV rsv = new RSV();
        rsv.LIZLLL = this.user_id;
        rsv.LJ = this.sec_uid;
        rsv.LJFF = this.index;
        rsv.LJI = this.index_v2;
        rsv.LJII = this.index_min;
        rsv.addUnknownFields(unknownFields());
        return rsv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        if (this.index != null) {
            sb.append(", index=");
            sb.append(this.index);
        }
        if (this.index_v2 != null) {
            sb.append(", index_v2=");
            sb.append(this.index_v2);
        }
        if (this.index_min != null) {
            sb.append(", index_min=");
            sb.append(this.index_min);
        }
        return DIX.LIZLLL(sb, 0, 2, "ParticipantReadIndex{", '}');
    }

    public ParticipantReadIndex(Long l, String str, Long l2, Long l3, Long l4) {
        this(l, str, l2, l3, l4, C64537PUn.EMPTY);
    }

    public ParticipantReadIndex(Long l, String str, Long l2, Long l3, Long l4, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.user_id = l;
        this.sec_uid = str;
        this.index = l2;
        this.index_v2 = l3;
        this.index_min = l4;
    }
}
