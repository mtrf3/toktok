package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.C69588RSu;
import X.C69589RSv;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class SecUidPair extends Message<SecUidPair, C69589RSv> {
    public static final ProtoAdapter<SecUidPair> ADAPTER = new C69588RSu();
    public static final Long DEFAULT_UID = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("sec_uid")
    public final String sec_uid;

    @InterfaceC65349Pkn("uid")
    public final Long uid;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<SecUidPair, C69589RSv> newBuilder2() {
        C69589RSv c69589RSv = new C69589RSv();
        c69589RSv.LIZLLL = this.uid;
        c69589RSv.LJ = this.sec_uid;
        c69589RSv.addUnknownFields(unknownFields());
        return c69589RSv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        return DIX.LIZLLL(sb, 0, 2, "SecUidPair{", '}');
    }

    public SecUidPair(Long l, String str) {
        this(l, str, C64537PUn.EMPTY);
    }

    public SecUidPair(Long l, String str, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.uid = l;
        this.sec_uid = str;
    }
}
