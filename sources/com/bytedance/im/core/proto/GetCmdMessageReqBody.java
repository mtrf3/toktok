package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63464OvU;
import X.C63465OvV;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class GetCmdMessageReqBody extends Message<GetCmdMessageReqBody, C63464OvU> {
    public static final ProtoAdapter<GetCmdMessageReqBody> ADAPTER = new C63465OvV();
    public static final Long DEFAULT_CMD_INDEX = 0L;
    public static final Integer DEFAULT_NEW_USER = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("cmd_index")
    public final Long cmd_index;

    @InterfaceC65349Pkn("new_user")
    public final Integer new_user;

    @InterfaceC65349Pkn("source")
    public final String source;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetCmdMessageReqBody, C63464OvU> newBuilder2() {
        C63464OvU c63464OvU = new C63464OvU();
        c63464OvU.LIZLLL = this.cmd_index;
        c63464OvU.LJ = this.source;
        c63464OvU.LJFF = this.new_user;
        c63464OvU.addUnknownFields(unknownFields());
        return c63464OvU;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", cmd_index=");
        LIZJ.append(this.cmd_index);
        LIZJ.append(", source=");
        LIZJ.append(this.source);
        if (this.new_user != null) {
            LIZJ.append(", new_user=");
            LIZJ.append(this.new_user);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "GetCmdMessageReqBody{", '}');
    }

    public GetCmdMessageReqBody(Long l, String str, Integer num) {
        this(l, str, num, C64537PUn.EMPTY);
    }

    public GetCmdMessageReqBody(Long l, String str, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.cmd_index = l;
        this.source = str;
        this.new_user = num;
    }
}
