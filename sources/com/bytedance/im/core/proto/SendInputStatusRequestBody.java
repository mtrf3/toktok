package com.bytedance.im.core.proto;

import X.C63657Oyb;
import X.C63658Oyc;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.EnumC63669Oyn;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes11.dex */
public final class SendInputStatusRequestBody extends Message<SendInputStatusRequestBody, C63657Oyb> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("extra")
    public final Map<String, String> extra;

    @InterfaceC65349Pkn("status")
    public final EnumC63669Oyn status;
    public static final ProtoAdapter<SendInputStatusRequestBody> ADAPTER = new C63658Oyc();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final EnumC63669Oyn DEFAULT_STATUS = EnumC63669Oyn.TYPING;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<SendInputStatusRequestBody, C63657Oyb> newBuilder2() {
        C63657Oyb c63657Oyb = new C63657Oyb();
        c63657Oyb.LIZLLL = this.conversation_id;
        c63657Oyb.LJ = this.conversation_type;
        c63657Oyb.LJFF = this.conversation_short_id;
        c63657Oyb.LJI = this.status;
        c63657Oyb.LJII = C63685Oz3.LIZLLL("extra", this.extra);
        c63657Oyb.addUnknownFields(unknownFields());
        return c63657Oyb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        Map<String, String> map = this.extra;
        if (map != null && !map.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        return DIX.LIZLLL(sb, 0, 2, "SendInputStatusRequestBody{", '}');
    }

    public SendInputStatusRequestBody(String str, Integer num, Long l, EnumC63669Oyn enumC63669Oyn, Map<String, String> map) {
        this(str, num, l, enumC63669Oyn, map, C64537PUn.EMPTY);
    }

    public SendInputStatusRequestBody(String str, Integer num, Long l, EnumC63669Oyn enumC63669Oyn, Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.status = enumC63669Oyn;
        this.extra = C63685Oz3.LJI("extra", map);
    }
}
