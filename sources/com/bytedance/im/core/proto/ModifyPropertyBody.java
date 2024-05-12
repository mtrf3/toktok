package com.bytedance.im.core.proto;

import X.C63451OvH;
import X.C63453OvJ;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class ModifyPropertyBody extends Message<ModifyPropertyBody, C63451OvH> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("client_message_id")
    public final String client_message_id;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("modify_property_content")
    public final List<ModifyPropertyContent> modify_property_content;

    @InterfaceC65349Pkn("server_message_id")
    public final Long server_message_id;
    public static final ProtoAdapter<ModifyPropertyBody> ADAPTER = new C63453OvJ();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ModifyPropertyBody, C63451OvH> newBuilder2() {
        C63451OvH c63451OvH = new C63451OvH();
        c63451OvH.LIZLLL = this.conversation_id;
        c63451OvH.LJ = this.conversation_type;
        c63451OvH.LJFF = this.conversation_short_id;
        c63451OvH.LJI = this.server_message_id;
        c63451OvH.LJII = this.client_message_id;
        c63451OvH.LJIIIIZZ = C63685Oz3.LIZJ("modify_property_content", this.modify_property_content);
        c63451OvH.addUnknownFields(unknownFields());
        return c63451OvH;
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
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        List<ModifyPropertyContent> list = this.modify_property_content;
        if (list != null && !list.isEmpty()) {
            sb.append(", modify_property_content=");
            sb.append(this.modify_property_content);
        }
        return DIX.LIZLLL(sb, 0, 2, "ModifyPropertyBody{", '}');
    }

    public ModifyPropertyBody(String str, Integer num, Long l, Long l2, String str2, List<ModifyPropertyContent> list) {
        this(str, num, l, l2, str2, list, C64537PUn.EMPTY);
    }

    public ModifyPropertyBody(String str, Integer num, Long l, Long l2, String str2, List<ModifyPropertyContent> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.server_message_id = l2;
        this.client_message_id = str2;
        this.modify_property_content = C63685Oz3.LJFF("modify_property_content", list);
    }
}
