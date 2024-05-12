package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.YYT;
import X.YYU;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes17.dex */
public final class UpdateConversationParticipantResponseBody extends Message<UpdateConversationParticipantResponseBody, YYU> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("check_code")
    public final Long check_code;

    @InterfaceC65349Pkn("check_message")
    public final String check_message;

    @InterfaceC65349Pkn("extra_info")
    public final String extra_info;

    @InterfaceC65349Pkn("participant")
    public final Participant participant;

    @InterfaceC65349Pkn("status")
    public final Integer status;
    public static final ProtoAdapter<UpdateConversationParticipantResponseBody> ADAPTER = new YYT();
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<UpdateConversationParticipantResponseBody, YYU> newBuilder2() {
        YYU yyu = new YYU();
        yyu.LIZLLL = this.participant;
        yyu.LJ = this.status;
        yyu.LJFF = this.extra_info;
        yyu.LJI = this.check_code;
        yyu.LJII = this.check_message;
        yyu.addUnknownFields(unknownFields());
        return yyu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.participant != null) {
            sb.append(", participant=");
            sb.append(this.participant);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        return DIX.LIZLLL(sb, 0, 2, "UpdateConversationParticipantResponseBody{", '}');
    }

    public UpdateConversationParticipantResponseBody(Participant participant, Integer num, String str, Long l, String str2) {
        this(participant, num, str, l, str2, C64537PUn.EMPTY);
    }

    public UpdateConversationParticipantResponseBody(Participant participant, Integer num, String str, Long l, String str2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.participant = participant;
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
    }
}