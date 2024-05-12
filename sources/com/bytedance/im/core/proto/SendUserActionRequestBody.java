package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.EnumC69902Rc2;
import X.InterfaceC65349Pkn;
import X.RSG;
import X.RSH;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes13.dex */
public final class SendUserActionRequestBody extends Message<SendUserActionRequestBody, RSH> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("action_type")
    public final EnumC69902Rc2 action_type;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("extra")
    public final Map<String, String> extra;
    public static final ProtoAdapter<SendUserActionRequestBody> ADAPTER = new RSG();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final EnumC69902Rc2 DEFAULT_ACTION_TYPE = EnumC69902Rc2.ENTER_CONVERSATION;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<SendUserActionRequestBody, RSH> newBuilder2() {
        RSH rsh = new RSH();
        rsh.LIZLLL = this.conversation_id;
        rsh.LJ = this.conversation_type;
        rsh.LJFF = this.conversation_short_id;
        rsh.LJI = this.action_type;
        rsh.LJII = C63685Oz3.LIZLLL("extra", this.extra);
        rsh.addUnknownFields(unknownFields());
        return rsh;
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
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        Map<String, String> map = this.extra;
        if (map != null && !map.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        return DIX.LIZLLL(sb, 0, 2, "SendUserActionRequestBody{", '}');
    }

    public SendUserActionRequestBody(String str, Integer num, Long l, EnumC69902Rc2 enumC69902Rc2, Map<String, String> map) {
        this(str, num, l, enumC69902Rc2, map, C64537PUn.EMPTY);
    }

    public SendUserActionRequestBody(String str, Integer num, Long l, EnumC69902Rc2 enumC69902Rc2, Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.action_type = enumC69902Rc2;
        this.extra = C63685Oz3.LJI("extra", map);
    }
}
