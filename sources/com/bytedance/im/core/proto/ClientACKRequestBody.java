package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63449OvF;
import X.C63452OvI;
import X.C64537PUn;
import X.DIX;
import X.EnumC48299IxT;
import X.EnumC63359Otn;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class ClientACKRequestBody extends Message<ClientACKRequestBody, C63449OvF> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("client_time_stamp")
    public final Long client_time_stamp;

    @InterfaceC65349Pkn("cmd")
    public final Integer cmd;

    @InterfaceC65349Pkn("logid")
    public final String logid;

    @InterfaceC65349Pkn("network_type")
    public final EnumC48299IxT network_type;

    @InterfaceC65349Pkn("server_message_id")
    public final Long server_message_id;

    @InterfaceC65349Pkn("start_time_stamp")
    public final Long start_time_stamp;

    @InterfaceC65349Pkn("type")
    public final EnumC63359Otn type;
    public static final ProtoAdapter<ClientACKRequestBody> ADAPTER = new C63452OvI();
    public static final Long DEFAULT_START_TIME_STAMP = 0L;
    public static final Integer DEFAULT_CMD = 0;
    public static final EnumC48299IxT DEFAULT_NETWORK_TYPE = EnumC48299IxT.UNKNOWN;
    public static final Long DEFAULT_CLIENT_TIME_STAMP = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final EnumC63359Otn DEFAULT_TYPE = EnumC63359Otn.NOT_USE;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ClientACKRequestBody, C63449OvF> newBuilder2() {
        C63449OvF c63449OvF = new C63449OvF();
        c63449OvF.LIZLLL = this.start_time_stamp;
        c63449OvF.LJ = this.cmd;
        c63449OvF.LJFF = this.network_type;
        c63449OvF.LJI = this.logid;
        c63449OvF.LJII = this.client_time_stamp;
        c63449OvF.LJIIIIZZ = this.server_message_id;
        c63449OvF.LJIIIZ = this.type;
        c63449OvF.addUnknownFields(unknownFields());
        return c63449OvF;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", start_time_stamp=");
        LIZJ.append(this.start_time_stamp);
        LIZJ.append(", cmd=");
        LIZJ.append(this.cmd);
        if (this.network_type != null) {
            LIZJ.append(", network_type=");
            LIZJ.append(this.network_type);
        }
        if (this.logid != null) {
            LIZJ.append(", logid=");
            LIZJ.append(this.logid);
        }
        if (this.client_time_stamp != null) {
            LIZJ.append(", client_time_stamp=");
            LIZJ.append(this.client_time_stamp);
        }
        if (this.server_message_id != null) {
            LIZJ.append(", server_message_id=");
            LIZJ.append(this.server_message_id);
        }
        LIZJ.append(", type=");
        LIZJ.append(this.type);
        return DIX.LIZLLL(LIZJ, 0, 2, "ClientACKRequestBody{", '}');
    }

    public ClientACKRequestBody(Long l, Integer num, EnumC48299IxT enumC48299IxT, String str, Long l2, Long l3, EnumC63359Otn enumC63359Otn) {
        this(l, num, enumC48299IxT, str, l2, l3, enumC63359Otn, C64537PUn.EMPTY);
    }

    public ClientACKRequestBody(Long l, Integer num, EnumC48299IxT enumC48299IxT, String str, Long l2, Long l3, EnumC63359Otn enumC63359Otn, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.start_time_stamp = l;
        this.cmd = num;
        this.network_type = enumC48299IxT;
        this.logid = str;
        this.client_time_stamp = l2;
        this.server_message_id = l3;
        this.type = enumC63359Otn;
    }
}
