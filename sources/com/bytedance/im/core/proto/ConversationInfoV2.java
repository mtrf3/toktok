package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.C87565YYf;
import X.C87566YYg;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes17.dex */
public final class ConversationInfoV2 extends Message<ConversationInfoV2, C87566YYg> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("badge_count")
    public final Integer badge_count;

    @InterfaceC65349Pkn("badge_count_v2")
    public final Integer badge_count_v2;

    @InterfaceC65349Pkn("conversation_core_info")
    public final ConversationCoreInfo conversation_core_info;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_setting_info")
    public final ConversationSettingInfo conversation_setting_info;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("first_page_participants")
    public final ParticipantsPage first_page_participants;

    @InterfaceC65349Pkn("inbox_type")
    public final Integer inbox_type;

    @InterfaceC65349Pkn("is_participant")
    public final Boolean is_participant;

    @InterfaceC65349Pkn("participants_count")
    public final Integer participants_count;

    @InterfaceC65349Pkn("ticket")
    public final String ticket;

    @InterfaceC65349Pkn("user_info")
    public final Participant user_info;
    public static final ProtoAdapter<ConversationInfoV2> ADAPTER = new C87565YYf();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Integer DEFAULT_PARTICIPANTS_COUNT = 0;
    public static final Boolean DEFAULT_IS_PARTICIPANT = Boolean.FALSE;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final Integer DEFAULT_BADGE_COUNT_V2 = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationInfoV2, C87566YYg> newBuilder2() {
        C87566YYg c87566YYg = new C87566YYg();
        c87566YYg.LIZLLL = this.conversation_id;
        c87566YYg.LJ = this.conversation_short_id;
        c87566YYg.LJFF = this.conversation_type;
        c87566YYg.LJI = this.ticket;
        c87566YYg.LJII = this.first_page_participants;
        c87566YYg.LJIIIIZZ = this.participants_count;
        c87566YYg.LJIIIZ = this.is_participant;
        c87566YYg.LJIIJ = this.inbox_type;
        c87566YYg.LJIIJJI = this.badge_count;
        c87566YYg.LJIIL = this.badge_count_v2;
        c87566YYg.LJIILIIL = this.user_info;
        c87566YYg.LJIILJJIL = this.conversation_core_info;
        c87566YYg.LJIILL = this.conversation_setting_info;
        c87566YYg.addUnknownFields(unknownFields());
        return c87566YYg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
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
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        if (this.first_page_participants != null) {
            sb.append(", first_page_participants=");
            sb.append(this.first_page_participants);
        }
        if (this.participants_count != null) {
            sb.append(", participants_count=");
            sb.append(this.participants_count);
        }
        if (this.is_participant != null) {
            sb.append(", is_participant=");
            sb.append(this.is_participant);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.badge_count != null) {
            sb.append(", badge_count=");
            sb.append(this.badge_count);
        }
        if (this.badge_count_v2 != null) {
            sb.append(", badge_count_v2=");
            sb.append(this.badge_count_v2);
        }
        if (this.user_info != null) {
            sb.append(", user_info=");
            sb.append(this.user_info);
        }
        if (this.conversation_core_info != null) {
            sb.append(", conversation_core_info=");
            sb.append(this.conversation_core_info);
        }
        if (this.conversation_setting_info != null) {
            sb.append(", conversation_setting_info=");
            sb.append(this.conversation_setting_info);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConversationInfoV2{", '}');
    }

    public ConversationInfoV2(String str, Long l, Integer num, String str2, ParticipantsPage participantsPage, Integer num2, Boolean bool, Integer num3, Integer num4, Integer num5, Participant participant, ConversationCoreInfo conversationCoreInfo, ConversationSettingInfo conversationSettingInfo) {
        this(str, l, num, str2, participantsPage, num2, bool, num3, num4, num5, participant, conversationCoreInfo, conversationSettingInfo, C64537PUn.EMPTY);
    }

    public ConversationInfoV2(String str, Long l, Integer num, String str2, ParticipantsPage participantsPage, Integer num2, Boolean bool, Integer num3, Integer num4, Integer num5, Participant participant, ConversationCoreInfo conversationCoreInfo, ConversationSettingInfo conversationSettingInfo, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.ticket = str2;
        this.first_page_participants = participantsPage;
        this.participants_count = num2;
        this.is_participant = bool;
        this.inbox_type = num3;
        this.badge_count = num4;
        this.badge_count_v2 = num5;
        this.user_info = participant;
        this.conversation_core_info = conversationCoreInfo;
        this.conversation_setting_info = conversationSettingInfo;
    }
}
