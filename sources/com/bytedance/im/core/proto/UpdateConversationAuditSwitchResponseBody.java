package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.C69574RSg;
import X.C69575RSh;
import X.C89452Z8u;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class UpdateConversationAuditSwitchResponseBody extends Message<UpdateConversationAuditSwitchResponseBody, C69575RSh> {
    public static final ProtoAdapter<UpdateConversationAuditSwitchResponseBody> ADAPTER;
    public static final Long DEFAULT_CHECK_CODE;
    public static final Integer DEFAULT_STATUS;
    public static final Boolean DEFAULT_SWITCH_STATUS;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("check_code")
    public final Long check_code;

    @InterfaceC65349Pkn("check_message")
    public final String check_message;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("switch_status")
    public final Boolean switch_status;

    static {
        C69574RSg c69574RSg = new C69574RSg();
        ADAPTER = c69574RSg;
        DEFAULT_SWITCH_STATUS = Boolean.FALSE;
        DEFAULT_STATUS = 0;
        DEFAULT_CHECK_CODE = 0L;
        C89452Z8u.LJ.put(2023, c69574RSg);
    }

    public static void registerAdapter() {
        C89452Z8u.LJ.put(2023, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<UpdateConversationAuditSwitchResponseBody, C69575RSh> newBuilder2() {
        C69575RSh c69575RSh = new C69575RSh();
        c69575RSh.LIZLLL = this.switch_status;
        c69575RSh.LJ = this.status;
        c69575RSh.LJFF = this.check_code;
        c69575RSh.LJI = this.check_message;
        c69575RSh.addUnknownFields(unknownFields());
        return c69575RSh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.switch_status != null) {
            sb.append(", switch_status=");
            sb.append(this.switch_status);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        return DIX.LIZLLL(sb, 0, 2, "UpdateConversationAuditSwitchResponseBody{", '}');
    }

    public UpdateConversationAuditSwitchResponseBody(Boolean bool, Integer num, Long l, String str) {
        this(bool, num, l, str, C64537PUn.EMPTY);
    }

    public UpdateConversationAuditSwitchResponseBody(Boolean bool, Integer num, Long l, String str, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.switch_status = bool;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
    }
}
