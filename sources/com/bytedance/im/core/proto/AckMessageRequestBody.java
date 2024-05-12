package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63633OyD;
import X.C63635OyF;
import X.C64537PUn;
import X.DIX;
import X.EnumC63179Oqt;
import X.EnumC63506OwA;
import X.EnumC63625Oy5;
import X.EnumC63641OyL;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class AckMessageRequestBody extends Message<AckMessageRequestBody, C63635OyF> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("cmd")
    public final EnumC63625Oy5 cmd;

    @InterfaceC65349Pkn("conv_type")
    public final EnumC63506OwA conv_type;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("msg_type")
    public final EnumC63179Oqt msg_type;

    @InterfaceC65349Pkn("push_type")
    public final EnumC63641OyL push_type;

    @InterfaceC65349Pkn("start_timestamp")
    public final Long start_timestamp;
    public static final ProtoAdapter<AckMessageRequestBody> ADAPTER = new C63633OyD();
    public static final Long DEFAULT_START_TIMESTAMP = 0L;
    public static final EnumC63506OwA DEFAULT_CONV_TYPE = EnumC63506OwA.ONE_TO_ONE_CHAT;
    public static final EnumC63179Oqt DEFAULT_MSG_TYPE = EnumC63179Oqt.LEGACY_MESSAGE_TYPE_SYSTEM;
    public static final EnumC63641OyL DEFAULT_PUSH_TYPE = EnumC63641OyL.Internal;
    public static final EnumC63625Oy5 DEFAULT_CMD = EnumC63625Oy5.IMCMD_NOT_USED;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<AckMessageRequestBody, C63635OyF> newBuilder2() {
        C63635OyF c63635OyF = new C63635OyF();
        c63635OyF.LIZLLL = this.start_timestamp;
        c63635OyF.LJ = this.id;
        c63635OyF.LJFF = this.conv_type;
        c63635OyF.LJI = this.msg_type;
        c63635OyF.LJII = this.push_type;
        c63635OyF.LJIIIIZZ = this.cmd;
        c63635OyF.addUnknownFields(unknownFields());
        return c63635OyF;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", start_timestamp=");
        LIZJ.append(this.start_timestamp);
        LIZJ.append(", id=");
        LIZJ.append(this.id);
        if (this.conv_type != null) {
            LIZJ.append(", conv_type=");
            LIZJ.append(this.conv_type);
        }
        if (this.msg_type != null) {
            LIZJ.append(", msg_type=");
            LIZJ.append(this.msg_type);
        }
        if (this.push_type != null) {
            LIZJ.append(", push_type=");
            LIZJ.append(this.push_type);
        }
        if (this.cmd != null) {
            LIZJ.append(", cmd=");
            LIZJ.append(this.cmd);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "AckMessageRequestBody{", '}');
    }

    public AckMessageRequestBody(Long l, String str, EnumC63506OwA enumC63506OwA, EnumC63179Oqt enumC63179Oqt, EnumC63641OyL enumC63641OyL, EnumC63625Oy5 enumC63625Oy5) {
        this(l, str, enumC63506OwA, enumC63179Oqt, enumC63641OyL, enumC63625Oy5, C64537PUn.EMPTY);
    }

    public AckMessageRequestBody(Long l, String str, EnumC63506OwA enumC63506OwA, EnumC63179Oqt enumC63179Oqt, EnumC63641OyL enumC63641OyL, EnumC63625Oy5 enumC63625Oy5, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.start_timestamp = l;
        this.id = str;
        this.conv_type = enumC63506OwA;
        this.msg_type = enumC63179Oqt;
        this.push_type = enumC63641OyL;
        this.cmd = enumC63625Oy5;
    }
}
