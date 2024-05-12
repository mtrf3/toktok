package com.bytedance.im.core.proto;

import X.C63739Ozv;
import X.C63740Ozw;
import X.C64537PUn;
import X.DIX;
import X.EnumC63506OwA;
import X.EnumC63669Oyn;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class InputStatusNotify extends Message<InputStatusNotify, C63740Ozw> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final EnumC63506OwA conversation_type;

    @InterfaceC65349Pkn("create_time")
    public final Long create_time;

    @InterfaceC65349Pkn("input_status")
    public final EnumC63669Oyn input_status;

    @InterfaceC65349Pkn("sender")
    public final Long sender;
    public static final ProtoAdapter<InputStatusNotify> ADAPTER = new C63739Ozv();
    public static final Long DEFAULT_SENDER = 0L;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final EnumC63506OwA DEFAULT_CONVERSATION_TYPE = EnumC63506OwA.ONE_TO_ONE_CHAT;
    public static final EnumC63669Oyn DEFAULT_INPUT_STATUS = EnumC63669Oyn.TYPING;
    public static final Long DEFAULT_CREATE_TIME = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<InputStatusNotify, C63740Ozw> newBuilder2() {
        C63740Ozw c63740Ozw = new C63740Ozw();
        c63740Ozw.LIZLLL = this.sender;
        c63740Ozw.LJ = this.conversation_id;
        c63740Ozw.LJFF = this.conversation_short_id;
        c63740Ozw.LJI = this.conversation_type;
        c63740Ozw.LJII = this.input_status;
        c63740Ozw.LJIIIIZZ = this.create_time;
        c63740Ozw.addUnknownFields(unknownFields());
        return c63740Ozw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sender != null) {
            sb.append(", sender=");
            sb.append(this.sender);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        sb.append(", input_status=");
        sb.append(this.input_status);
        sb.append(", create_time=");
        sb.append(this.create_time);
        return DIX.LIZLLL(sb, 0, 2, "InputStatusNotify{", '}');
    }

    public InputStatusNotify(Long l, String str, Long l2, EnumC63506OwA enumC63506OwA, EnumC63669Oyn enumC63669Oyn, Long l3) {
        this(l, str, l2, enumC63506OwA, enumC63669Oyn, l3, C64537PUn.EMPTY);
    }

    public InputStatusNotify(Long l, String str, Long l2, EnumC63506OwA enumC63506OwA, EnumC63669Oyn enumC63669Oyn, Long l3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.sender = l;
        this.conversation_id = str;
        this.conversation_short_id = l2;
        this.conversation_type = enumC63506OwA;
        this.input_status = enumC63669Oyn;
        this.create_time = l3;
    }
}
