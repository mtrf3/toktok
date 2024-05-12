package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63632OyC;
import X.C63634OyE;
import X.C64537PUn;
import X.DIX;
import X.EnumC63179Oqt;
import X.EnumC63506OwA;
import X.EnumC63642OyM;
import X.InterfaceC65349Pkn;
import X.WM7;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class AckMessage extends Message<AckMessage, C63634OyE> {
    public static final ProtoAdapter<AckMessage> ADAPTER = new C63632OyC();
    public static final EnumC63642OyM DEFAULT_CMD_TYPE;
    public static final EnumC63506OwA DEFAULT_CONV_TYPE;
    public static final Boolean DEFAULT_FIRST_SAVE_TO_DB;
    public static final Integer DEFAULT_INBOX_TYPE;
    public static final Boolean DEFAULT_IS_WS;
    public static final EnumC63179Oqt DEFAULT_MSG_TYPE;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("cmd_type")
    public final EnumC63642OyM cmd_type;

    @InterfaceC65349Pkn("conv_type")
    public final EnumC63506OwA conv_type;

    @InterfaceC65349Pkn("first_save_to_db")
    public final Boolean first_save_to_db;

    @InterfaceC65349Pkn("inbox_type")
    public final Integer inbox_type;

    @InterfaceC65349Pkn("is_ws")
    public final Boolean is_ws;

    @InterfaceC65349Pkn("msg_type")
    public final EnumC63179Oqt msg_type;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    @InterfaceC65349Pkn("server_msg_id")
    public final String server_msg_id;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_WS = bool;
        DEFAULT_MSG_TYPE = EnumC63179Oqt.LEGACY_MESSAGE_TYPE_SYSTEM;
        DEFAULT_INBOX_TYPE = 0;
        DEFAULT_CONV_TYPE = EnumC63506OwA.ONE_TO_ONE_CHAT;
        DEFAULT_CMD_TYPE = EnumC63642OyM.CmdTypeUnknown;
        DEFAULT_FIRST_SAVE_TO_DB = bool;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<AckMessage, C63634OyE> newBuilder2() {
        C63634OyE c63634OyE = new C63634OyE();
        c63634OyE.LIZLLL = this.server_msg_id;
        c63634OyE.LJ = this.is_ws;
        c63634OyE.LJFF = this.msg_type;
        c63634OyE.LJI = this.scene;
        c63634OyE.LJII = this.inbox_type;
        c63634OyE.LJIIIIZZ = this.conv_type;
        c63634OyE.LJIIIZ = this.cmd_type;
        c63634OyE.LJIIJ = this.first_save_to_db;
        c63634OyE.addUnknownFields(unknownFields());
        return c63634OyE;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", server_msg_id=");
        LIZJ.append(this.server_msg_id);
        LIZJ.append(", is_ws=");
        LIZJ.append(this.is_ws);
        LIZJ.append(", msg_type=");
        LIZJ.append(this.msg_type);
        LIZJ.append(", scene=");
        LIZJ.append(this.scene);
        if (this.inbox_type != null) {
            LIZJ.append(", inbox_type=");
            LIZJ.append(this.inbox_type);
        }
        if (this.conv_type != null) {
            LIZJ.append(", conv_type=");
            LIZJ.append(this.conv_type);
        }
        if (this.cmd_type != null) {
            LIZJ.append(", cmd_type=");
            LIZJ.append(this.cmd_type);
        }
        if (this.first_save_to_db != null) {
            LIZJ.append(", first_save_to_db=");
            LIZJ.append(this.first_save_to_db);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "AckMessage{", '}');
    }

    public AckMessage(String str, Boolean bool, EnumC63179Oqt enumC63179Oqt, String str2, Integer num, EnumC63506OwA enumC63506OwA, EnumC63642OyM enumC63642OyM, Boolean bool2) {
        this(str, bool, enumC63179Oqt, str2, num, enumC63506OwA, enumC63642OyM, bool2, C64537PUn.EMPTY);
    }

    public AckMessage(String str, Boolean bool, EnumC63179Oqt enumC63179Oqt, String str2, Integer num, EnumC63506OwA enumC63506OwA, EnumC63642OyM enumC63642OyM, Boolean bool2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.server_msg_id = str;
        this.is_ws = bool;
        this.msg_type = enumC63179Oqt;
        this.scene = str2;
        this.inbox_type = num;
        this.conv_type = enumC63506OwA;
        this.cmd_type = enumC63642OyM;
        this.first_save_to_db = bool2;
    }
}
