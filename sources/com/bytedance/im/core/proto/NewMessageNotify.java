package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P13;
import X.P14;
import X.P15;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class NewMessageNotify extends Message<NewMessageNotify, P14> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("badge_count")
    public final Integer badge_count;

    @InterfaceC65349Pkn("badge_count_v2")
    public final Integer badge_count_v2;

    @InterfaceC65349Pkn("cmd_message_index")
    public final Long cmd_message_index;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("conversation_version")
    public final Long conversation_version;

    @InterfaceC65349Pkn("index_in_conversation")
    public final Long index_in_conversation;

    @InterfaceC65349Pkn("index_in_conversation_v2")
    public final Long index_in_conversation_v2;

    @InterfaceC65349Pkn("message")
    public final MessageBody message;

    @InterfaceC65349Pkn("mute_badge_count_info")
    public final MuteBadgeCountInfo mute_badge_count_info;

    @InterfaceC65349Pkn("next_cursor")
    public final Long next_cursor;

    @InterfaceC65349Pkn("notify_type")
    public final P15 notify_type;

    @InterfaceC65349Pkn("pre_readconv_version")
    public final Long pre_readconv_version;

    @InterfaceC65349Pkn("previous_conversation_version")
    public final Long previous_conversation_version;

    @InterfaceC65349Pkn("previous_cursor")
    public final Long previous_cursor;

    @InterfaceC65349Pkn("previous_msg_index_in_conv")
    public final Long previous_msg_index_in_conv;

    @InterfaceC65349Pkn("push_preview")
    public final String push_preview;

    @InterfaceC65349Pkn("readconv_version")
    public final Long readconv_version;

    @InterfaceC65349Pkn("ref_msg_info")
    public final ReferenceInfo ref_msg_info;

    @InterfaceC65349Pkn("trace")
    public final MsgTrace trace;
    public static final ProtoAdapter<NewMessageNotify> ADAPTER = new P13();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final P15 DEFAULT_NOTIFY_TYPE = P15.PER_USER;
    public static final Long DEFAULT_PREVIOUS_CURSOR = 0L;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION_V2 = 0L;
    public static final Long DEFAULT_CONVERSATION_VERSION = 0L;
    public static final Long DEFAULT_PREVIOUS_CONVERSATION_VERSION = 0L;
    public static final Long DEFAULT_CMD_MESSAGE_INDEX = 0L;
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final Long DEFAULT_PREVIOUS_MSG_INDEX_IN_CONV = 0L;
    public static final Long DEFAULT_READCONV_VERSION = 0L;
    public static final Long DEFAULT_PRE_READCONV_VERSION = 0L;
    public static final Integer DEFAULT_BADGE_COUNT_V2 = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<NewMessageNotify, P14> newBuilder2() {
        P14 p14 = new P14();
        p14.LIZLLL = this.conversation_id;
        p14.LJ = this.conversation_type;
        p14.LJFF = this.notify_type;
        p14.LJI = this.message;
        p14.LJII = this.previous_cursor;
        p14.LJIIIIZZ = this.next_cursor;
        p14.LJIIIZ = this.index_in_conversation;
        p14.LJIIJ = this.index_in_conversation_v2;
        p14.LJIIJJI = this.conversation_version;
        p14.LJIIL = this.previous_conversation_version;
        p14.LJIILIIL = this.cmd_message_index;
        p14.LJIILJJIL = this.badge_count;
        p14.LJIILL = this.trace;
        p14.LJIILLIIL = this.ref_msg_info;
        p14.LJIIZILJ = this.previous_msg_index_in_conv;
        p14.LJIJ = this.readconv_version;
        p14.LJIJI = this.pre_readconv_version;
        p14.LJIJJ = this.mute_badge_count_info;
        p14.LJIJJLI = this.push_preview;
        p14.LJIL = this.badge_count_v2;
        p14.addUnknownFields(unknownFields());
        return p14;
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
        if (this.notify_type != null) {
            sb.append(", notify_type=");
            sb.append(this.notify_type);
        }
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        if (this.previous_cursor != null) {
            sb.append(", previous_cursor=");
            sb.append(this.previous_cursor);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.index_in_conversation != null) {
            sb.append(", index_in_conversation=");
            sb.append(this.index_in_conversation);
        }
        if (this.index_in_conversation_v2 != null) {
            sb.append(", index_in_conversation_v2=");
            sb.append(this.index_in_conversation_v2);
        }
        if (this.conversation_version != null) {
            sb.append(", conversation_version=");
            sb.append(this.conversation_version);
        }
        if (this.previous_conversation_version != null) {
            sb.append(", previous_conversation_version=");
            sb.append(this.previous_conversation_version);
        }
        if (this.cmd_message_index != null) {
            sb.append(", cmd_message_index=");
            sb.append(this.cmd_message_index);
        }
        if (this.badge_count != null) {
            sb.append(", badge_count=");
            sb.append(this.badge_count);
        }
        if (this.trace != null) {
            sb.append(", trace=");
            sb.append(this.trace);
        }
        if (this.ref_msg_info != null) {
            sb.append(", ref_msg_info=");
            sb.append(this.ref_msg_info);
        }
        if (this.previous_msg_index_in_conv != null) {
            sb.append(", previous_msg_index_in_conv=");
            sb.append(this.previous_msg_index_in_conv);
        }
        if (this.readconv_version != null) {
            sb.append(", readconv_version=");
            sb.append(this.readconv_version);
        }
        if (this.pre_readconv_version != null) {
            sb.append(", pre_readconv_version=");
            sb.append(this.pre_readconv_version);
        }
        if (this.mute_badge_count_info != null) {
            sb.append(", mute_badge_count_info=");
            sb.append(this.mute_badge_count_info);
        }
        if (this.push_preview != null) {
            sb.append(", push_preview=");
            sb.append(this.push_preview);
        }
        if (this.badge_count_v2 != null) {
            sb.append(", badge_count_v2=");
            sb.append(this.badge_count_v2);
        }
        return DIX.LIZLLL(sb, 0, 2, "NewMessageNotify{", '}');
    }

    public NewMessageNotify(String str, Integer num, P15 p15, MessageBody messageBody, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Integer num2, MsgTrace msgTrace, ReferenceInfo referenceInfo, Long l8, Long l9, Long l10, MuteBadgeCountInfo muteBadgeCountInfo, String str2, Integer num3) {
        this(str, num, p15, messageBody, l, l2, l3, l4, l5, l6, l7, num2, msgTrace, referenceInfo, l8, l9, l10, muteBadgeCountInfo, str2, num3, C64537PUn.EMPTY);
    }

    public NewMessageNotify(String str, Integer num, P15 p15, MessageBody messageBody, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Integer num2, MsgTrace msgTrace, ReferenceInfo referenceInfo, Long l8, Long l9, Long l10, MuteBadgeCountInfo muteBadgeCountInfo, String str2, Integer num3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.notify_type = p15;
        this.message = messageBody;
        this.previous_cursor = l;
        this.next_cursor = l2;
        this.index_in_conversation = l3;
        this.index_in_conversation_v2 = l4;
        this.conversation_version = l5;
        this.previous_conversation_version = l6;
        this.cmd_message_index = l7;
        this.badge_count = num2;
        this.trace = msgTrace;
        this.ref_msg_info = referenceInfo;
        this.previous_msg_index_in_conv = l8;
        this.readconv_version = l9;
        this.pre_readconv_version = l10;
        this.mute_badge_count_info = muteBadgeCountInfo;
        this.push_preview = str2;
        this.badge_count_v2 = num3;
    }
}
