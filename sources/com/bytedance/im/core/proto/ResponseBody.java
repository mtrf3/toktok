package com.bytedance.im.core.proto;

import X.C16880lQ;
import X.C64537PUn;
import X.C69518RQc;
import X.C69521RQf;
import X.C69524RQi;
import X.C69527RQl;
import X.C69530RQo;
import X.C69533RQr;
import X.C69536RQu;
import X.C69539RQx;
import X.C89452Z8u;
import X.C89454Z8w;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RQU;
import X.RQZ;
import X.RR0;
import android.util.Pair;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.HashMap;

/* loaded from: classes17.dex */
public final class ResponseBody extends Message<ResponseBody, C89454Z8w> {
    public static final ProtoAdapter<ResponseBody> ADAPTER = new C89452Z8u();
    public static final long serialVersionUID = 0;
    public final HashMap<String, Object> LJLIL;

    @InterfaceC65349Pkn("ack_message_body")
    public final AckMessageResponseBody ack_message_body;

    @InterfaceC65349Pkn("batch_ack_message_body")
    public final RQU batch_ack_message_body;

    @InterfaceC65349Pkn("batch_delete_conversation_body")
    public final BatchDeleteConversationResponseBody batch_delete_conversation_body;

    @InterfaceC65349Pkn("batch_get_conversation_participants_readindex")
    public final BatchGetConversationParticipantsReadIndexResponseBody batch_get_conversation_participants_readindex;

    @InterfaceC65349Pkn("batch_get_messages_body")
    public final BatchGetMessagesResponseBody batch_get_messages_body;

    @InterfaceC65349Pkn("batch_mark_read_body")
    public final BatchMarkConversationReadResponseBody batch_mark_read_body;

    @InterfaceC65349Pkn("batch_unmark_message")
    public final BatchUnmarkMessageResponseBody batch_unmark_message;

    @InterfaceC65349Pkn("batch_update_conversation_participant_body")
    public final BatchUpdateConversationParticipantResponseBody batch_update_conversation_participant_body;

    @InterfaceC65349Pkn("block_conversation_body")
    public final C69521RQf block_conversation_body;

    @InterfaceC65349Pkn("block_members_body")
    public final BlockMembersResponseBody block_members_body;

    @InterfaceC65349Pkn("broadcast_user_counter_body")
    public final BroadcastUserCounterResponseBody broadcast_user_counter_body;

    @InterfaceC65349Pkn("check_messages_per_user_body")
    public final CheckMessagesPerUserResponseBody check_messages_per_user_body;

    @InterfaceC65349Pkn("client_batch_ack_body")
    public final C69524RQi client_batch_ack_body;

    @InterfaceC65349Pkn("conversation_add_participants_body")
    public final ConversationAddParticipantsResponseBody conversation_add_participants_body;

    @InterfaceC65349Pkn("conversation_message_pre_view_body")
    public final ConversationMessagePreViewResponseBody conversation_message_pre_view_body;

    @InterfaceC65349Pkn("conversation_participants_body")
    public final ConversationParticipantsListResponseBody conversation_participants_body;

    @InterfaceC65349Pkn("conversation_remove_participants_body")
    public final ConversationRemoveParticipantsResponseBody conversation_remove_participants_body;

    @InterfaceC65349Pkn("create_conversation_v2_body")
    public final CreateConversationV2ResponseBody create_conversation_v2_body;

    @InterfaceC65349Pkn("delete_multi_stranger_conversation_body")
    public final DeleteMultiStrangerConversationResponseBody delete_multi_stranger_conversation_body;

    @InterfaceC65349Pkn("delete_stranger_all_conversation_body")
    public final C69527RQl delete_stranger_all_conversation_body;

    @InterfaceC65349Pkn("delete_stranger_conversation_body")
    public final C69530RQo delete_stranger_conversation_body;

    @InterfaceC65349Pkn("delete_stranger_message_body")
    public final C69536RQu delete_stranger_message_body;
    public transient HashMap<Integer, Pair<ProtoAdapter, Message>> extensions;

    @InterfaceC65349Pkn("get_cmd_message_body")
    public final GetCmdMessageRespBody get_cmd_message_body;

    @InterfaceC65349Pkn("get_configs_body")
    public final GetConfigsResponseBody get_configs_body;

    @InterfaceC65349Pkn("get_conversation_info_list_by_favorite_v2_body")
    public final GetConversationInfoListByFavoriteV2ResponseBody get_conversation_info_list_by_favorite_v2_body;

    @InterfaceC65349Pkn("get_conversation_info_list_by_top_v2_body")
    public final GetConversationInfoListByTopV2ResponseBody get_conversation_info_list_by_top_v2_body;

    @InterfaceC65349Pkn("get_conversation_info_list_v2_body")
    public final GetConversationInfoListV2ResponseBody get_conversation_info_list_v2_body;

    @InterfaceC65349Pkn("get_conversation_info_v2_body")
    public final GetConversationInfoV2ResponseBody get_conversation_info_v2_body;

    @InterfaceC65349Pkn("get_conversation_list_body")
    public final GetUserConversationListResponseBody get_conversation_list_body;

    @InterfaceC65349Pkn("get_conversations_check_info_v2_body")
    public final GetConversationsCheckInfoV2ResponseBody get_conversations_check_info_v2_body;

    @InterfaceC65349Pkn("get_conversations_checkinfo_body")
    public final GetConversationsCheckInfoResponseBody get_conversations_checkinfo_body;

    @InterfaceC65349Pkn("get_message_by_id_body")
    public final GetMessageByIdResponseBody get_message_by_id_body;

    @InterfaceC65349Pkn("get_message_check_info_v2_body")
    public final GetMessagesCheckInfoV2ResponseBody get_message_check_info_v2_body;

    @InterfaceC65349Pkn("get_message_info_by_index_v2_body")
    public final GetMessageInfoByIndexV2ResponseBody get_message_info_by_index_v2_body;

    @InterfaceC65349Pkn("get_message_info_by_index_v2_range_body")
    public final GetMessageInfoByIndexV2RangeResponseBody get_message_info_by_index_v2_range_body;

    @InterfaceC65349Pkn("get_messages_body")
    public final GetMessagesResponseBody get_messages_body;

    @InterfaceC65349Pkn("get_messages_checkinfo_in_conversation_body")
    public final GetMessagesCheckInfoInConversationResponseBody get_messages_checkinfo_in_conversation_body;

    @InterfaceC65349Pkn("get_recent_message_body")
    public final GetRecentMessageRespBody get_recent_message_body;

    @InterfaceC65349Pkn("get_stranger_conversation_body")
    public final GetStrangerConversationListResponseBody get_stranger_conversation_body;

    @InterfaceC65349Pkn("get_stranger_messages_body")
    public final GetStrangerMessagesResponseBody get_stranger_messages_body;

    @InterfaceC65349Pkn("get_stranger_unread_count_body")
    public final GetStrangerUnreadCountResponseBody get_stranger_unread_count_body;

    @InterfaceC65349Pkn("get_ticket_body")
    public final GetTicketResponseBody get_ticket_body;

    @InterfaceC65349Pkn("has_new_direct_push_notify")
    public final NewDirectPushNotify has_new_direct_push_notify;

    @InterfaceC65349Pkn("has_new_message_notify")
    public final NewMessageNotify has_new_message_notify;

    @InterfaceC65349Pkn("input_status_notify")
    public final InputStatusNotify input_status_notify;

    @InterfaceC65349Pkn("mark_conversation_read_notify")
    public final MarkConversationReadNotify mark_conversation_read_notify;

    @InterfaceC65349Pkn("mark_message_body")
    public final MarkMessageResponseBody mark_message_body;

    @InterfaceC65349Pkn("mark_msg_get_unread_count")
    public final MarkMsgGetUnreadCountResponseBody mark_msg_get_unread_count;

    @InterfaceC65349Pkn("mark_msg_unread_count_report")
    public final MarkMsgUnreadCountReportResponseBody mark_msg_unread_count_report;

    @InterfaceC65349Pkn("mark_multi_stranger_conversation_read_body")
    public final MarkMultiStrangerConversationReadResponseBody mark_multi_stranger_conversation_read_body;

    @InterfaceC65349Pkn("mark_stranger_all_conversation_read_body")
    public final RQZ mark_stranger_all_conversation_read_body;

    @InterfaceC65349Pkn("mark_stranger_conversation_read_body")
    public final C69518RQc mark_stranger_conversation_read_body;

    @InterfaceC65349Pkn("message_by_init")
    public final MessageByInitResponseBody message_by_init;

    @InterfaceC65349Pkn("messages_in_conversation_body")
    public final MessagesInConversationResponseBody messages_in_conversation_body;

    @InterfaceC65349Pkn("messages_per_user_body")
    public final MessagesPerUserResponseBody messages_per_user_body;

    @InterfaceC65349Pkn("messages_per_user_combo_inbox_type_body")
    public final MessagesPerUserComboInboxTypeResponseBody messages_per_user_combo_inbox_type_body;

    @InterfaceC65349Pkn("messages_per_user_init_combo_inbox_type_body")
    public final MessagesPerUserInitComboInboxTypeResponseBody messages_per_user_init_combo_inbox_type_body;

    @InterfaceC65349Pkn("messages_per_user_init_v2_body")
    public final MessagesPerUserInitV2ResponseBody messages_per_user_init_v2_body;

    @InterfaceC65349Pkn("modify_message_property_body")
    public final ModifyMessagePropertyResponseBody modify_message_property_body;

    @InterfaceC65349Pkn("participants_min_index_body")
    public final GetConversationParticipantsMinIndexV3ResponseBody participants_min_index_body;

    @InterfaceC65349Pkn("participants_read_index_body")
    public final GetConversationParticipantsReadIndexV3ResponseBody participants_read_index_body;

    @InterfaceC65349Pkn("previewer_get_conversation_info_list_body")
    public final PreviewerGetConversationInfoListResponseBody previewer_get_conversation_info_list_body;

    @InterfaceC65349Pkn("previewer_messages_in_conversation_body")
    public final PreviewerMessagesInConversationResponseBody previewer_messages_in_conversation_body;

    @InterfaceC65349Pkn("pull_mark_message_body")
    public final PullMarkMessageResponseBody pull_mark_message_body;

    @InterfaceC65349Pkn("recall_message_body")
    public final C69533RQr recall_message_body;

    @InterfaceC65349Pkn("report_client_metrics_body")
    public final C69539RQx report_client_metrics_body;

    @InterfaceC65349Pkn("send_input_status_body")
    public final SendInputStatusResponseBody send_input_status_body;

    @InterfaceC65349Pkn("send_message_body")
    public final SendMessageResponseBody send_message_body;

    @InterfaceC65349Pkn("send_user_action_body")
    public final RR0 send_user_action_body;

    @InterfaceC65349Pkn("set_conversation_core_info_body")
    public final SetConversationCoreInfoResponseBody set_conversation_core_info_body;

    @InterfaceC65349Pkn("set_conversation_setting_info_body")
    public final SetConversationSettingInfoResponseBody set_conversation_setting_info_body;

    @InterfaceC65349Pkn("stranger_has_new_message_notify")
    public final StrangerNewMessageNotify stranger_has_new_message_notify;

    @InterfaceC65349Pkn("unread_count_report_body")
    public final UnReadCountReportResponseBody unread_count_report_body;

    @InterfaceC65349Pkn("update_conversation_participant_body")
    public final UpdateConversationParticipantResponseBody update_conversation_participant_body;

    @InterfaceC65349Pkn("upsert_conversation_core_ext_info_body")
    public final UpsertConversationCoreExtInfoResponseBody upsert_conversation_core_ext_info_body;

    @InterfaceC65349Pkn("upsert_conversation_setting_ext_info_body")
    public final UpsertConversationSettingExtInfoResponseBody upsert_conversation_setting_ext_info_body;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ResponseBody, C89454Z8w> newBuilder2() {
        C89454Z8w c89454Z8w = new C89454Z8w();
        c89454Z8w.LIZLLL = this.send_message_body;
        c89454Z8w.LJ = this.messages_per_user_body;
        c89454Z8w.LJFF = this.messages_per_user_init_v2_body;
        c89454Z8w.LJI = this.messages_per_user_combo_inbox_type_body;
        c89454Z8w.LJII = this.messages_per_user_init_combo_inbox_type_body;
        c89454Z8w.LJIIIIZZ = this.check_messages_per_user_body;
        c89454Z8w.LJIIIZ = this.get_message_by_id_body;
        c89454Z8w.LJIIJ = this.messages_in_conversation_body;
        c89454Z8w.LJIIJJI = this.get_messages_checkinfo_in_conversation_body;
        c89454Z8w.LJIIL = this.get_message_check_info_v2_body;
        c89454Z8w.LJIILIIL = this.send_user_action_body;
        c89454Z8w.LJIILJJIL = this.send_input_status_body;
        c89454Z8w.LJIILL = this.has_new_message_notify;
        c89454Z8w.LJIILLIIL = this.mark_conversation_read_notify;
        c89454Z8w.LJIIZILJ = this.stranger_has_new_message_notify;
        c89454Z8w.LJIJ = this.has_new_direct_push_notify;
        c89454Z8w.LJIJI = this.input_status_notify;
        c89454Z8w.LJIJJ = this.batch_mark_read_body;
        c89454Z8w.LJIJJLI = this.get_conversations_checkinfo_body;
        c89454Z8w.LJIL = this.get_conversations_check_info_v2_body;
        c89454Z8w.LJJ = this.batch_delete_conversation_body;
        c89454Z8w.LJJI = this.get_conversation_info_v2_body;
        c89454Z8w.LJJIFFI = this.create_conversation_v2_body;
        c89454Z8w.LJJII = this.get_conversation_info_list_v2_body;
        c89454Z8w.LJJIII = this.get_conversation_info_list_by_favorite_v2_body;
        c89454Z8w.LJJIIJ = this.get_conversation_info_list_by_top_v2_body;
        c89454Z8w.LJJIIJZLJL = this.conversation_participants_body;
        c89454Z8w.LJJIIZ = this.conversation_add_participants_body;
        c89454Z8w.LJJIIZI = this.conversation_remove_participants_body;
        c89454Z8w.LJJIJ = this.update_conversation_participant_body;
        c89454Z8w.LJJIJIIJI = this.batch_update_conversation_participant_body;
        c89454Z8w.LJJIJIIJIL = this.recall_message_body;
        c89454Z8w.LJJIJIL = this.modify_message_property_body;
        c89454Z8w.LJJIJL = this.ack_message_body;
        c89454Z8w.LJJIJLIJ = this.batch_ack_message_body;
        c89454Z8w.LJJIL = this.set_conversation_core_info_body;
        c89454Z8w.LJJIZ = this.upsert_conversation_core_ext_info_body;
        c89454Z8w.LJJJ = this.set_conversation_setting_info_body;
        c89454Z8w.LJJJI = this.upsert_conversation_setting_ext_info_body;
        c89454Z8w.LJJJIL = this.get_stranger_conversation_body;
        c89454Z8w.LJJJJ = this.get_stranger_messages_body;
        c89454Z8w.LJJJJI = this.delete_stranger_message_body;
        c89454Z8w.LJJJJIZL = this.delete_stranger_conversation_body;
        c89454Z8w.LJJJJJ = this.delete_stranger_all_conversation_body;
        c89454Z8w.LJJJJJL = this.mark_stranger_conversation_read_body;
        c89454Z8w.LJJJJL = this.mark_stranger_all_conversation_read_body;
        c89454Z8w.LJJJJLI = this.get_stranger_unread_count_body;
        c89454Z8w.LJJJJLL = this.delete_multi_stranger_conversation_body;
        c89454Z8w.LJJJJZ = this.mark_multi_stranger_conversation_read_body;
        c89454Z8w.LJJJJZI = this.participants_read_index_body;
        c89454Z8w.LJJJLIIL = this.participants_min_index_body;
        c89454Z8w.LJJJLL = this.get_ticket_body;
        c89454Z8w.LJJJLZIJ = this.get_conversation_list_body;
        c89454Z8w.LJJJZ = this.broadcast_user_counter_body;
        c89454Z8w.LJJL = this.report_client_metrics_body;
        c89454Z8w.LJJLI = this.get_configs_body;
        c89454Z8w.LJJLIIIIJ = this.unread_count_report_body;
        c89454Z8w.LJJLIIIJ = this.block_members_body;
        c89454Z8w.LJJLIIIJILLIZJL = this.block_conversation_body;
        c89454Z8w.LJJLIIIJJI = this.get_message_info_by_index_v2_body;
        c89454Z8w.LJJLIIIJJIZ = this.mark_message_body;
        c89454Z8w.LJJLIIIJL = this.pull_mark_message_body;
        c89454Z8w.LJJLIIIJLJLI = this.batch_get_conversation_participants_readindex;
        c89454Z8w.LJJLIIIJLLLLLLLZ = this.get_recent_message_body;
        c89454Z8w.LJJLIIJ = this.get_cmd_message_body;
        c89454Z8w.LJJLIL = this.get_message_info_by_index_v2_range_body;
        c89454Z8w.LJJLJ = this.message_by_init;
        c89454Z8w.LJJLJLI = this.previewer_messages_in_conversation_body;
        c89454Z8w.LJJLL = this.previewer_get_conversation_info_list_body;
        c89454Z8w.LJJZ = this.mark_msg_unread_count_report;
        c89454Z8w.LJJZZI = this.mark_msg_get_unread_count;
        c89454Z8w.LJJZZIII = this.batch_unmark_message;
        c89454Z8w.LJL = this.client_batch_ack_body;
        c89454Z8w.LJLI = this.conversation_message_pre_view_body;
        c89454Z8w.LJLIIIL = this.get_messages_body;
        c89454Z8w.LJLIIL = this.batch_get_messages_body;
        c89454Z8w.LJLIL = this.extensions;
        c89454Z8w.LJLILLLLZI = this.LJLIL;
        c89454Z8w.addUnknownFields(unknownFields());
        return c89454Z8w;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.send_message_body != null) {
            sb.append(", send_message_body=");
            sb.append(this.send_message_body);
        }
        if (this.messages_per_user_body != null) {
            sb.append(", messages_per_user_body=");
            sb.append(this.messages_per_user_body);
        }
        if (this.messages_per_user_init_v2_body != null) {
            sb.append(", messages_per_user_init_v2_body=");
            sb.append(this.messages_per_user_init_v2_body);
        }
        if (this.messages_per_user_combo_inbox_type_body != null) {
            sb.append(", messages_per_user_combo_inbox_type_body=");
            sb.append(this.messages_per_user_combo_inbox_type_body);
        }
        if (this.messages_per_user_init_combo_inbox_type_body != null) {
            sb.append(", messages_per_user_init_combo_inbox_type_body=");
            sb.append(this.messages_per_user_init_combo_inbox_type_body);
        }
        if (this.check_messages_per_user_body != null) {
            sb.append(", check_messages_per_user_body=");
            sb.append(this.check_messages_per_user_body);
        }
        if (this.get_message_by_id_body != null) {
            sb.append(", get_message_by_id_body=");
            sb.append(this.get_message_by_id_body);
        }
        if (this.messages_in_conversation_body != null) {
            sb.append(", messages_in_conversation_body=");
            sb.append(this.messages_in_conversation_body);
        }
        if (this.get_messages_checkinfo_in_conversation_body != null) {
            sb.append(", get_messages_checkinfo_in_conversation_body=");
            sb.append(this.get_messages_checkinfo_in_conversation_body);
        }
        if (this.get_message_check_info_v2_body != null) {
            sb.append(", get_message_check_info_v2_body=");
            sb.append(this.get_message_check_info_v2_body);
        }
        if (this.send_user_action_body != null) {
            sb.append(", send_user_action_body=");
            sb.append(this.send_user_action_body);
        }
        if (this.send_input_status_body != null) {
            sb.append(", send_input_status_body=");
            sb.append(this.send_input_status_body);
        }
        if (this.has_new_message_notify != null) {
            sb.append(", has_new_message_notify=");
            sb.append(this.has_new_message_notify);
        }
        if (this.mark_conversation_read_notify != null) {
            sb.append(", mark_conversation_read_notify=");
            sb.append(this.mark_conversation_read_notify);
        }
        if (this.stranger_has_new_message_notify != null) {
            sb.append(", stranger_has_new_message_notify=");
            sb.append(this.stranger_has_new_message_notify);
        }
        if (this.has_new_direct_push_notify != null) {
            sb.append(", has_new_direct_push_notify=");
            sb.append(this.has_new_direct_push_notify);
        }
        if (this.input_status_notify != null) {
            sb.append(", input_status_notify=");
            sb.append(this.input_status_notify);
        }
        if (this.batch_mark_read_body != null) {
            sb.append(", batch_mark_read_body=");
            sb.append(this.batch_mark_read_body);
        }
        if (this.get_conversations_checkinfo_body != null) {
            sb.append(", get_conversations_checkinfo_body=");
            sb.append(this.get_conversations_checkinfo_body);
        }
        if (this.get_conversations_check_info_v2_body != null) {
            sb.append(", get_conversations_check_info_v2_body=");
            sb.append(this.get_conversations_check_info_v2_body);
        }
        if (this.batch_delete_conversation_body != null) {
            sb.append(", batch_delete_conversation_body=");
            sb.append(this.batch_delete_conversation_body);
        }
        if (this.get_conversation_info_v2_body != null) {
            sb.append(", get_conversation_info_v2_body=");
            sb.append(this.get_conversation_info_v2_body);
        }
        if (this.create_conversation_v2_body != null) {
            sb.append(", create_conversation_v2_body=");
            sb.append(this.create_conversation_v2_body);
        }
        if (this.get_conversation_info_list_v2_body != null) {
            sb.append(", get_conversation_info_list_v2_body=");
            sb.append(this.get_conversation_info_list_v2_body);
        }
        if (this.get_conversation_info_list_by_favorite_v2_body != null) {
            sb.append(", get_conversation_info_list_by_favorite_v2_body=");
            sb.append(this.get_conversation_info_list_by_favorite_v2_body);
        }
        if (this.get_conversation_info_list_by_top_v2_body != null) {
            sb.append(", get_conversation_info_list_by_top_v2_body=");
            sb.append(this.get_conversation_info_list_by_top_v2_body);
        }
        if (this.conversation_participants_body != null) {
            sb.append(", conversation_participants_body=");
            sb.append(this.conversation_participants_body);
        }
        if (this.conversation_add_participants_body != null) {
            sb.append(", conversation_add_participants_body=");
            sb.append(this.conversation_add_participants_body);
        }
        if (this.conversation_remove_participants_body != null) {
            sb.append(", conversation_remove_participants_body=");
            sb.append(this.conversation_remove_participants_body);
        }
        if (this.update_conversation_participant_body != null) {
            sb.append(", update_conversation_participant_body=");
            sb.append(this.update_conversation_participant_body);
        }
        if (this.batch_update_conversation_participant_body != null) {
            sb.append(", batch_update_conversation_participant_body=");
            sb.append(this.batch_update_conversation_participant_body);
        }
        if (this.recall_message_body != null) {
            sb.append(", recall_message_body=");
            sb.append(this.recall_message_body);
        }
        if (this.modify_message_property_body != null) {
            sb.append(", modify_message_property_body=");
            sb.append(this.modify_message_property_body);
        }
        if (this.ack_message_body != null) {
            sb.append(", ack_message_body=");
            sb.append(this.ack_message_body);
        }
        if (this.batch_ack_message_body != null) {
            sb.append(", batch_ack_message_body=");
            sb.append(this.batch_ack_message_body);
        }
        if (this.set_conversation_core_info_body != null) {
            sb.append(", set_conversation_core_info_body=");
            sb.append(this.set_conversation_core_info_body);
        }
        if (this.upsert_conversation_core_ext_info_body != null) {
            sb.append(", upsert_conversation_core_ext_info_body=");
            sb.append(this.upsert_conversation_core_ext_info_body);
        }
        if (this.set_conversation_setting_info_body != null) {
            sb.append(", set_conversation_setting_info_body=");
            sb.append(this.set_conversation_setting_info_body);
        }
        if (this.upsert_conversation_setting_ext_info_body != null) {
            sb.append(", upsert_conversation_setting_ext_info_body=");
            sb.append(this.upsert_conversation_setting_ext_info_body);
        }
        if (this.get_stranger_conversation_body != null) {
            sb.append(", get_stranger_conversation_body=");
            sb.append(this.get_stranger_conversation_body);
        }
        if (this.get_stranger_messages_body != null) {
            sb.append(", get_stranger_messages_body=");
            sb.append(this.get_stranger_messages_body);
        }
        if (this.delete_stranger_message_body != null) {
            sb.append(", delete_stranger_message_body=");
            sb.append(this.delete_stranger_message_body);
        }
        if (this.delete_stranger_conversation_body != null) {
            sb.append(", delete_stranger_conversation_body=");
            sb.append(this.delete_stranger_conversation_body);
        }
        if (this.delete_stranger_all_conversation_body != null) {
            sb.append(", delete_stranger_all_conversation_body=");
            sb.append(this.delete_stranger_all_conversation_body);
        }
        if (this.mark_stranger_conversation_read_body != null) {
            sb.append(", mark_stranger_conversation_read_body=");
            sb.append(this.mark_stranger_conversation_read_body);
        }
        if (this.mark_stranger_all_conversation_read_body != null) {
            sb.append(", mark_stranger_all_conversation_read_body=");
            sb.append(this.mark_stranger_all_conversation_read_body);
        }
        if (this.get_stranger_unread_count_body != null) {
            sb.append(", get_stranger_unread_count_body=");
            sb.append(this.get_stranger_unread_count_body);
        }
        if (this.delete_multi_stranger_conversation_body != null) {
            sb.append(", delete_multi_stranger_conversation_body=");
            sb.append(this.delete_multi_stranger_conversation_body);
        }
        if (this.mark_multi_stranger_conversation_read_body != null) {
            sb.append(", mark_multi_stranger_conversation_read_body=");
            sb.append(this.mark_multi_stranger_conversation_read_body);
        }
        if (this.participants_read_index_body != null) {
            sb.append(", participants_read_index_body=");
            sb.append(this.participants_read_index_body);
        }
        if (this.participants_min_index_body != null) {
            sb.append(", participants_min_index_body=");
            sb.append(this.participants_min_index_body);
        }
        if (this.get_ticket_body != null) {
            sb.append(", get_ticket_body=");
            sb.append(this.get_ticket_body);
        }
        if (this.get_conversation_list_body != null) {
            sb.append(", get_conversation_list_body=");
            sb.append(this.get_conversation_list_body);
        }
        if (this.broadcast_user_counter_body != null) {
            sb.append(", broadcast_user_counter_body=");
            sb.append(this.broadcast_user_counter_body);
        }
        if (this.report_client_metrics_body != null) {
            sb.append(", report_client_metrics_body=");
            sb.append(this.report_client_metrics_body);
        }
        if (this.get_configs_body != null) {
            sb.append(", get_configs_body=");
            sb.append(this.get_configs_body);
        }
        if (this.unread_count_report_body != null) {
            sb.append(", unread_count_report_body=");
            sb.append(this.unread_count_report_body);
        }
        if (this.block_members_body != null) {
            sb.append(", block_members_body=");
            sb.append(this.block_members_body);
        }
        if (this.block_conversation_body != null) {
            sb.append(", block_conversation_body=");
            sb.append(this.block_conversation_body);
        }
        if (this.get_message_info_by_index_v2_body != null) {
            sb.append(", get_message_info_by_index_v2_body=");
            sb.append(this.get_message_info_by_index_v2_body);
        }
        if (this.mark_message_body != null) {
            sb.append(", mark_message_body=");
            sb.append(this.mark_message_body);
        }
        if (this.pull_mark_message_body != null) {
            sb.append(", pull_mark_message_body=");
            sb.append(this.pull_mark_message_body);
        }
        if (this.batch_get_conversation_participants_readindex != null) {
            sb.append(", batch_get_conversation_participants_readindex=");
            sb.append(this.batch_get_conversation_participants_readindex);
        }
        if (this.get_recent_message_body != null) {
            sb.append(", get_recent_message_body=");
            sb.append(this.get_recent_message_body);
        }
        if (this.get_cmd_message_body != null) {
            sb.append(", get_cmd_message_body=");
            sb.append(this.get_cmd_message_body);
        }
        if (this.get_message_info_by_index_v2_range_body != null) {
            sb.append(", get_message_info_by_index_v2_range_body=");
            sb.append(this.get_message_info_by_index_v2_range_body);
        }
        if (this.message_by_init != null) {
            sb.append(", message_by_init=");
            sb.append(this.message_by_init);
        }
        if (this.previewer_messages_in_conversation_body != null) {
            sb.append(", previewer_messages_in_conversation_body=");
            sb.append(this.previewer_messages_in_conversation_body);
        }
        if (this.previewer_get_conversation_info_list_body != null) {
            sb.append(", previewer_get_conversation_info_list_body=");
            sb.append(this.previewer_get_conversation_info_list_body);
        }
        if (this.mark_msg_unread_count_report != null) {
            sb.append(", mark_msg_unread_count_report=");
            sb.append(this.mark_msg_unread_count_report);
        }
        if (this.mark_msg_get_unread_count != null) {
            sb.append(", mark_msg_get_unread_count=");
            sb.append(this.mark_msg_get_unread_count);
        }
        if (this.batch_unmark_message != null) {
            sb.append(", batch_unmark_message=");
            sb.append(this.batch_unmark_message);
        }
        if (this.client_batch_ack_body != null) {
            sb.append(", client_batch_ack_body=");
            sb.append(this.client_batch_ack_body);
        }
        if (this.conversation_message_pre_view_body != null) {
            sb.append(", conversation_message_pre_view_body=");
            sb.append(this.conversation_message_pre_view_body);
        }
        if (this.get_messages_body != null) {
            sb.append(", get_messages_body=");
            sb.append(this.get_messages_body);
        }
        if (this.batch_get_messages_body != null) {
            sb.append(", batch_get_messages_body=");
            sb.append(this.batch_get_messages_body);
        }
        return DIX.LIZLLL(sb, 0, 2, "ResponseBody{", '}');
    }

    public <T> T getExtension(int i) {
        if (this.extensions.get(Integer.valueOf(i)) != null) {
            try {
                return (T) this.extensions.get(Integer.valueOf(i)).second;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        return null;
    }

    public ResponseBody(SendMessageResponseBody sendMessageResponseBody, MessagesPerUserResponseBody messagesPerUserResponseBody, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody, MessagesPerUserComboInboxTypeResponseBody messagesPerUserComboInboxTypeResponseBody, MessagesPerUserInitComboInboxTypeResponseBody messagesPerUserInitComboInboxTypeResponseBody, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody, GetMessageByIdResponseBody getMessageByIdResponseBody, MessagesInConversationResponseBody messagesInConversationResponseBody, GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody, GetMessagesCheckInfoV2ResponseBody getMessagesCheckInfoV2ResponseBody, RR0 rr0, SendInputStatusResponseBody sendInputStatusResponseBody, NewMessageNotify newMessageNotify, MarkConversationReadNotify markConversationReadNotify, StrangerNewMessageNotify strangerNewMessageNotify, NewDirectPushNotify newDirectPushNotify, InputStatusNotify inputStatusNotify, BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody, GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody, GetConversationsCheckInfoV2ResponseBody getConversationsCheckInfoV2ResponseBody, BatchDeleteConversationResponseBody batchDeleteConversationResponseBody, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody, CreateConversationV2ResponseBody createConversationV2ResponseBody, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody, GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody, BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody, C69533RQr c69533RQr, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody, AckMessageResponseBody ackMessageResponseBody, RQU rqu, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody, SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody, C69536RQu c69536RQu, C69530RQo c69530RQo, C69527RQl c69527RQl, C69518RQc c69518RQc, RQZ rqz, GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody, DeleteMultiStrangerConversationResponseBody deleteMultiStrangerConversationResponseBody, MarkMultiStrangerConversationReadResponseBody markMultiStrangerConversationReadResponseBody, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody, GetTicketResponseBody getTicketResponseBody, GetUserConversationListResponseBody getUserConversationListResponseBody, BroadcastUserCounterResponseBody broadcastUserCounterResponseBody, C69539RQx c69539RQx, GetConfigsResponseBody getConfigsResponseBody, UnReadCountReportResponseBody unReadCountReportResponseBody, BlockMembersResponseBody blockMembersResponseBody, C69521RQf c69521RQf, GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody, MarkMessageResponseBody markMessageResponseBody, PullMarkMessageResponseBody pullMarkMessageResponseBody, BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody, GetRecentMessageRespBody getRecentMessageRespBody, GetCmdMessageRespBody getCmdMessageRespBody, GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody, MessageByInitResponseBody messageByInitResponseBody, PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody, PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody, MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody, MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody, BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody, C69524RQi c69524RQi, ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody, GetMessagesResponseBody getMessagesResponseBody, BatchGetMessagesResponseBody batchGetMessagesResponseBody, HashMap<Integer, Pair<ProtoAdapter, Message>> hashMap, HashMap<String, Object> hashMap2) {
        this(sendMessageResponseBody, messagesPerUserResponseBody, messagesPerUserInitV2ResponseBody, messagesPerUserComboInboxTypeResponseBody, messagesPerUserInitComboInboxTypeResponseBody, checkMessagesPerUserResponseBody, getMessageByIdResponseBody, messagesInConversationResponseBody, getMessagesCheckInfoInConversationResponseBody, getMessagesCheckInfoV2ResponseBody, rr0, sendInputStatusResponseBody, newMessageNotify, markConversationReadNotify, strangerNewMessageNotify, newDirectPushNotify, inputStatusNotify, batchMarkConversationReadResponseBody, getConversationsCheckInfoResponseBody, getConversationsCheckInfoV2ResponseBody, batchDeleteConversationResponseBody, getConversationInfoV2ResponseBody, createConversationV2ResponseBody, getConversationInfoListV2ResponseBody, getConversationInfoListByFavoriteV2ResponseBody, getConversationInfoListByTopV2ResponseBody, conversationParticipantsListResponseBody, conversationAddParticipantsResponseBody, conversationRemoveParticipantsResponseBody, updateConversationParticipantResponseBody, batchUpdateConversationParticipantResponseBody, c69533RQr, modifyMessagePropertyResponseBody, ackMessageResponseBody, rqu, setConversationCoreInfoResponseBody, upsertConversationCoreExtInfoResponseBody, setConversationSettingInfoResponseBody, upsertConversationSettingExtInfoResponseBody, getStrangerConversationListResponseBody, getStrangerMessagesResponseBody, c69536RQu, c69530RQo, c69527RQl, c69518RQc, rqz, getStrangerUnreadCountResponseBody, deleteMultiStrangerConversationResponseBody, markMultiStrangerConversationReadResponseBody, getConversationParticipantsReadIndexV3ResponseBody, getConversationParticipantsMinIndexV3ResponseBody, getTicketResponseBody, getUserConversationListResponseBody, broadcastUserCounterResponseBody, c69539RQx, getConfigsResponseBody, unReadCountReportResponseBody, blockMembersResponseBody, c69521RQf, getMessageInfoByIndexV2ResponseBody, markMessageResponseBody, pullMarkMessageResponseBody, batchGetConversationParticipantsReadIndexResponseBody, getRecentMessageRespBody, getCmdMessageRespBody, getMessageInfoByIndexV2RangeResponseBody, messageByInitResponseBody, previewerMessagesInConversationResponseBody, previewerGetConversationInfoListResponseBody, markMsgUnreadCountReportResponseBody, markMsgGetUnreadCountResponseBody, batchUnmarkMessageResponseBody, c69524RQi, conversationMessagePreViewResponseBody, getMessagesResponseBody, batchGetMessagesResponseBody, hashMap, hashMap2, C64537PUn.EMPTY);
    }

    public ResponseBody(SendMessageResponseBody sendMessageResponseBody, MessagesPerUserResponseBody messagesPerUserResponseBody, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody, MessagesPerUserComboInboxTypeResponseBody messagesPerUserComboInboxTypeResponseBody, MessagesPerUserInitComboInboxTypeResponseBody messagesPerUserInitComboInboxTypeResponseBody, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody, GetMessageByIdResponseBody getMessageByIdResponseBody, MessagesInConversationResponseBody messagesInConversationResponseBody, GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody, GetMessagesCheckInfoV2ResponseBody getMessagesCheckInfoV2ResponseBody, RR0 rr0, SendInputStatusResponseBody sendInputStatusResponseBody, NewMessageNotify newMessageNotify, MarkConversationReadNotify markConversationReadNotify, StrangerNewMessageNotify strangerNewMessageNotify, NewDirectPushNotify newDirectPushNotify, InputStatusNotify inputStatusNotify, BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody, GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody, GetConversationsCheckInfoV2ResponseBody getConversationsCheckInfoV2ResponseBody, BatchDeleteConversationResponseBody batchDeleteConversationResponseBody, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody, CreateConversationV2ResponseBody createConversationV2ResponseBody, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody, GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody, BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody, C69533RQr c69533RQr, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody, AckMessageResponseBody ackMessageResponseBody, RQU rqu, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody, SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody, C69536RQu c69536RQu, C69530RQo c69530RQo, C69527RQl c69527RQl, C69518RQc c69518RQc, RQZ rqz, GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody, DeleteMultiStrangerConversationResponseBody deleteMultiStrangerConversationResponseBody, MarkMultiStrangerConversationReadResponseBody markMultiStrangerConversationReadResponseBody, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody, GetTicketResponseBody getTicketResponseBody, GetUserConversationListResponseBody getUserConversationListResponseBody, BroadcastUserCounterResponseBody broadcastUserCounterResponseBody, C69539RQx c69539RQx, GetConfigsResponseBody getConfigsResponseBody, UnReadCountReportResponseBody unReadCountReportResponseBody, BlockMembersResponseBody blockMembersResponseBody, C69521RQf c69521RQf, GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody, MarkMessageResponseBody markMessageResponseBody, PullMarkMessageResponseBody pullMarkMessageResponseBody, BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody, GetRecentMessageRespBody getRecentMessageRespBody, GetCmdMessageRespBody getCmdMessageRespBody, GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody, MessageByInitResponseBody messageByInitResponseBody, PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody, PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody, MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody, MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody, BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody, C69524RQi c69524RQi, ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody, GetMessagesResponseBody getMessagesResponseBody, BatchGetMessagesResponseBody batchGetMessagesResponseBody, HashMap<Integer, Pair<ProtoAdapter, Message>> hashMap, HashMap<String, Object> hashMap2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.extensions = new HashMap<>();
        this.LJLIL = new HashMap<>();
        this.send_message_body = sendMessageResponseBody;
        this.messages_per_user_body = messagesPerUserResponseBody;
        this.messages_per_user_init_v2_body = messagesPerUserInitV2ResponseBody;
        this.messages_per_user_combo_inbox_type_body = messagesPerUserComboInboxTypeResponseBody;
        this.messages_per_user_init_combo_inbox_type_body = messagesPerUserInitComboInboxTypeResponseBody;
        this.check_messages_per_user_body = checkMessagesPerUserResponseBody;
        this.get_message_by_id_body = getMessageByIdResponseBody;
        this.messages_in_conversation_body = messagesInConversationResponseBody;
        this.get_messages_checkinfo_in_conversation_body = getMessagesCheckInfoInConversationResponseBody;
        this.get_message_check_info_v2_body = getMessagesCheckInfoV2ResponseBody;
        this.send_user_action_body = rr0;
        this.send_input_status_body = sendInputStatusResponseBody;
        this.has_new_message_notify = newMessageNotify;
        this.mark_conversation_read_notify = markConversationReadNotify;
        this.stranger_has_new_message_notify = strangerNewMessageNotify;
        this.has_new_direct_push_notify = newDirectPushNotify;
        this.input_status_notify = inputStatusNotify;
        this.batch_mark_read_body = batchMarkConversationReadResponseBody;
        this.get_conversations_checkinfo_body = getConversationsCheckInfoResponseBody;
        this.get_conversations_check_info_v2_body = getConversationsCheckInfoV2ResponseBody;
        this.batch_delete_conversation_body = batchDeleteConversationResponseBody;
        this.get_conversation_info_v2_body = getConversationInfoV2ResponseBody;
        this.create_conversation_v2_body = createConversationV2ResponseBody;
        this.get_conversation_info_list_v2_body = getConversationInfoListV2ResponseBody;
        this.get_conversation_info_list_by_favorite_v2_body = getConversationInfoListByFavoriteV2ResponseBody;
        this.get_conversation_info_list_by_top_v2_body = getConversationInfoListByTopV2ResponseBody;
        this.conversation_participants_body = conversationParticipantsListResponseBody;
        this.conversation_add_participants_body = conversationAddParticipantsResponseBody;
        this.conversation_remove_participants_body = conversationRemoveParticipantsResponseBody;
        this.update_conversation_participant_body = updateConversationParticipantResponseBody;
        this.batch_update_conversation_participant_body = batchUpdateConversationParticipantResponseBody;
        this.recall_message_body = c69533RQr;
        this.modify_message_property_body = modifyMessagePropertyResponseBody;
        this.ack_message_body = ackMessageResponseBody;
        this.batch_ack_message_body = rqu;
        this.set_conversation_core_info_body = setConversationCoreInfoResponseBody;
        this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoResponseBody;
        this.set_conversation_setting_info_body = setConversationSettingInfoResponseBody;
        this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoResponseBody;
        this.get_stranger_conversation_body = getStrangerConversationListResponseBody;
        this.get_stranger_messages_body = getStrangerMessagesResponseBody;
        this.delete_stranger_message_body = c69536RQu;
        this.delete_stranger_conversation_body = c69530RQo;
        this.delete_stranger_all_conversation_body = c69527RQl;
        this.mark_stranger_conversation_read_body = c69518RQc;
        this.mark_stranger_all_conversation_read_body = rqz;
        this.get_stranger_unread_count_body = getStrangerUnreadCountResponseBody;
        this.delete_multi_stranger_conversation_body = deleteMultiStrangerConversationResponseBody;
        this.mark_multi_stranger_conversation_read_body = markMultiStrangerConversationReadResponseBody;
        this.participants_read_index_body = getConversationParticipantsReadIndexV3ResponseBody;
        this.participants_min_index_body = getConversationParticipantsMinIndexV3ResponseBody;
        this.get_ticket_body = getTicketResponseBody;
        this.get_conversation_list_body = getUserConversationListResponseBody;
        this.broadcast_user_counter_body = broadcastUserCounterResponseBody;
        this.report_client_metrics_body = c69539RQx;
        this.get_configs_body = getConfigsResponseBody;
        this.unread_count_report_body = unReadCountReportResponseBody;
        this.block_members_body = blockMembersResponseBody;
        this.block_conversation_body = c69521RQf;
        this.get_message_info_by_index_v2_body = getMessageInfoByIndexV2ResponseBody;
        this.mark_message_body = markMessageResponseBody;
        this.pull_mark_message_body = pullMarkMessageResponseBody;
        this.batch_get_conversation_participants_readindex = batchGetConversationParticipantsReadIndexResponseBody;
        this.get_recent_message_body = getRecentMessageRespBody;
        this.get_cmd_message_body = getCmdMessageRespBody;
        this.get_message_info_by_index_v2_range_body = getMessageInfoByIndexV2RangeResponseBody;
        this.message_by_init = messageByInitResponseBody;
        this.previewer_messages_in_conversation_body = previewerMessagesInConversationResponseBody;
        this.previewer_get_conversation_info_list_body = previewerGetConversationInfoListResponseBody;
        this.mark_msg_unread_count_report = markMsgUnreadCountReportResponseBody;
        this.mark_msg_get_unread_count = markMsgGetUnreadCountResponseBody;
        this.batch_unmark_message = batchUnmarkMessageResponseBody;
        this.client_batch_ack_body = c69524RQi;
        this.conversation_message_pre_view_body = conversationMessagePreViewResponseBody;
        this.get_messages_body = getMessagesResponseBody;
        this.batch_get_messages_body = batchGetMessagesResponseBody;
        this.extensions = hashMap;
        this.LJLIL = hashMap2;
    }
}
