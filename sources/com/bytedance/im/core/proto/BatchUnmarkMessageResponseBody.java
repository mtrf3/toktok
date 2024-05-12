package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.EnumC63552Owu;
import X.InterfaceC65349Pkn;
import X.YYH;
import X.YYI;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes17.dex */
public final class BatchUnmarkMessageResponseBody extends Message<BatchUnmarkMessageResponseBody, YYI> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("check_code")
    public final Long check_code;

    @InterfaceC65349Pkn("check_message")
    public final String check_message;

    @InterfaceC65349Pkn("server_message_id")
    public final Long server_message_id;

    @InterfaceC65349Pkn("status")
    public final EnumC63552Owu status;
    public static final ProtoAdapter<BatchUnmarkMessageResponseBody> ADAPTER = new YYH();
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final EnumC63552Owu DEFAULT_STATUS = EnumC63552Owu.OK;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchUnmarkMessageResponseBody, YYI> newBuilder2() {
        YYI yyi = new YYI();
        yyi.LIZLLL = this.server_message_id;
        yyi.LJ = this.check_code;
        yyi.LJFF = this.check_message;
        yyi.LJI = this.status;
        yyi.addUnknownFields(unknownFields());
        return yyi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchUnmarkMessageResponseBody{", '}');
    }

    public BatchUnmarkMessageResponseBody(Long l, Long l2, String str, EnumC63552Owu enumC63552Owu) {
        this(l, l2, str, enumC63552Owu, C64537PUn.EMPTY);
    }

    public BatchUnmarkMessageResponseBody(Long l, Long l2, String str, EnumC63552Owu enumC63552Owu, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.server_message_id = l;
        this.check_code = l2;
        this.check_message = str;
        this.status = enumC63552Owu;
    }
}
