package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.YYX;
import X.YYY;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public final class ConversationAddParticipantsResponseBody extends Message<ConversationAddParticipantsResponseBody, YYY> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("biz_ext")
    public final Map<String, String> biz_ext;

    @InterfaceC65349Pkn("check_code")
    public final Long check_code;

    @InterfaceC65349Pkn("check_message")
    public final String check_message;

    @InterfaceC65349Pkn("ext")
    public final Map<String, String> ext;

    @InterfaceC65349Pkn("extra_info")
    public final String extra_info;

    @InterfaceC65349Pkn("failed_participants")
    public final List<Long> failed_participants;

    @InterfaceC65349Pkn("sec_failed_participants")
    public final List<SecUidPair> sec_failed_participants;

    @InterfaceC65349Pkn("sec_success_participants")
    public final List<SecUidPair> sec_success_participants;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("success_participants")
    public final List<Long> success_participants;
    public static final ProtoAdapter<ConversationAddParticipantsResponseBody> ADAPTER = new YYX();
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationAddParticipantsResponseBody, YYY> newBuilder2() {
        YYY yyy = new YYY();
        yyy.LIZLLL = C63685Oz3.LIZJ("success_participants", this.success_participants);
        yyy.LJ = C63685Oz3.LIZJ("failed_participants", this.failed_participants);
        yyy.LJFF = this.status;
        yyy.LJI = this.extra_info;
        yyy.LJII = this.check_code;
        yyy.LJIIIIZZ = this.check_message;
        yyy.LJIIIZ = C63685Oz3.LIZJ("sec_success_participants", this.sec_success_participants);
        yyy.LJIIJ = C63685Oz3.LIZJ("sec_failed_participants", this.sec_failed_participants);
        yyy.LJIIJJI = C63685Oz3.LIZLLL("biz_ext", this.biz_ext);
        yyy.LJIIL = C63685Oz3.LIZLLL("ext", this.ext);
        yyy.addUnknownFields(unknownFields());
        return yyy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.success_participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", success_participants=");
            sb.append(this.success_participants);
        }
        List<Long> list2 = this.failed_participants;
        if (list2 != null && !list2.isEmpty()) {
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
        List<SecUidPair> list3 = this.sec_success_participants;
        if (list3 != null && !list3.isEmpty()) {
            sb.append(", sec_success_participants=");
            sb.append(this.sec_success_participants);
        }
        List<SecUidPair> list4 = this.sec_failed_participants;
        if (list4 != null && !list4.isEmpty()) {
            sb.append(", sec_failed_participants=");
            sb.append(this.sec_failed_participants);
        }
        Map<String, String> map = this.biz_ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        Map<String, String> map2 = this.ext;
        if (map2 != null && !map2.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConversationAddParticipantsResponseBody{", '}');
    }

    public ConversationAddParticipantsResponseBody(List<Long> list, List<Long> list2, Integer num, String str, Long l, String str2, List<SecUidPair> list3, List<SecUidPair> list4, Map<String, String> map, Map<String, String> map2) {
        this(list, list2, num, str, l, str2, list3, list4, map, map2, C64537PUn.EMPTY);
    }

    public ConversationAddParticipantsResponseBody(List<Long> list, List<Long> list2, Integer num, String str, Long l, String str2, List<SecUidPair> list3, List<SecUidPair> list4, Map<String, String> map, Map<String, String> map2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.success_participants = C63685Oz3.LJFF("success_participants", list);
        this.failed_participants = C63685Oz3.LJFF("failed_participants", list2);
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
        this.sec_success_participants = C63685Oz3.LJFF("sec_success_participants", list3);
        this.sec_failed_participants = C63685Oz3.LJFF("sec_failed_participants", list4);
        this.biz_ext = C63685Oz3.LJI("biz_ext", map);
        this.ext = C63685Oz3.LJI("ext", map2);
    }
}
