package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.YYV;
import X.YYW;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes17.dex */
public final class ConversationRemoveParticipantsResponseBody extends Message<ConversationRemoveParticipantsResponseBody, YYW> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("check_code")
    public final Long check_code;

    @InterfaceC65349Pkn("check_message")
    public final String check_message;

    @InterfaceC65349Pkn("extra_info")
    public final String extra_info;

    @InterfaceC65349Pkn("failed_participants")
    public final List<Long> failed_participants;

    @InterfaceC65349Pkn("failed_sec_participants")
    public final List<SecUidPair> failed_sec_participants;

    @InterfaceC65349Pkn("status")
    public final Integer status;
    public static final ProtoAdapter<ConversationRemoveParticipantsResponseBody> ADAPTER = new YYV();
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationRemoveParticipantsResponseBody, YYW> newBuilder2() {
        YYW yyw = new YYW();
        yyw.LIZLLL = C63685Oz3.LIZJ("failed_participants", this.failed_participants);
        yyw.LJ = this.status;
        yyw.LJFF = this.extra_info;
        yyw.LJI = this.check_code;
        yyw.LJII = this.check_message;
        yyw.LJIIIIZZ = C63685Oz3.LIZJ("failed_sec_participants", this.failed_sec_participants);
        yyw.addUnknownFields(unknownFields());
        return yyw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.failed_participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_participants=");
            sb.append(this.failed_participants);
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
        List<SecUidPair> list2 = this.failed_sec_participants;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", failed_sec_participants=");
            sb.append(this.failed_sec_participants);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConversationRemoveParticipantsResponseBody{", '}');
    }

    public ConversationRemoveParticipantsResponseBody(List<Long> list, Integer num, String str, Long l, String str2, List<SecUidPair> list2) {
        this(list, num, str, l, str2, list2, C64537PUn.EMPTY);
    }

    public ConversationRemoveParticipantsResponseBody(List<Long> list, Integer num, String str, Long l, String str2, List<SecUidPair> list2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.failed_participants = C63685Oz3.LJFF("failed_participants", list);
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
        this.failed_sec_participants = C63685Oz3.LJFF("failed_sec_participants", list2);
    }
}
