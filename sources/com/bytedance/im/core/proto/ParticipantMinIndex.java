package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RSS;
import X.RST;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ParticipantMinIndex extends Message<ParticipantMinIndex, RST> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("index")
    public final Long index;

    @InterfaceC65349Pkn("index_v2")
    public final Long index_v2;

    @InterfaceC65349Pkn("sec_uid")
    public final String sec_uid;

    @InterfaceC65349Pkn("user_id")
    public final Long user_id;
    public static final ProtoAdapter<ParticipantMinIndex> ADAPTER = new RSS();
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_INDEX = 0L;
    public static final Long DEFAULT_INDEX_V2 = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ParticipantMinIndex, RST> newBuilder2() {
        RST rst = new RST();
        rst.LIZLLL = this.user_id;
        rst.LJ = this.sec_uid;
        rst.LJFF = this.index;
        rst.LJI = this.index_v2;
        rst.addUnknownFields(unknownFields());
        return rst;
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
        return DIX.LIZLLL(sb, 0, 2, "ParticipantMinIndex{", '}');
    }

    public ParticipantMinIndex(Long l, String str, Long l2, Long l3) {
        this(l, str, l2, l3, C64537PUn.EMPTY);
    }

    public ParticipantMinIndex(Long l, String str, Long l2, Long l3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.user_id = l;
        this.sec_uid = str;
        this.index = l2;
        this.index_v2 = l3;
    }
}
