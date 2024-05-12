package com.bytedance.im.core.proto;

import X.C16880lQ;
import X.C63499Ow3;
import X.C63502Ow6;
import X.C64537PUn;
import X.C89451Z8t;
import X.C89453Z8v;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RQI;
import X.RQN;
import android.util.Pair;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.HashMap;

/* loaded from: classes17.dex */
public final class RequestBody extends Message<RequestBody, C89453Z8v> {
    public static final ProtoAdapter<RequestBody> ADAPTER = new C89451Z8t();
    public static final long serialVersionUID = 0;
    public final HashMap<String, Object> LJLIL;

    @InterfaceC65349Pkn("ack_message_body")
    public final AckMessageRequestBody ack_message_body;

    @InterfaceC65349Pkn("batch_ack_message_body")
    public final BatchAckMessageRequestBody batch_ack_message_body;

    @InterfaceC65349Pkn("batch_delete_conversation_body")
    public final BatchDeleteConversationRequestBody batch_delete_conversation_body;

    @InterfaceC65349Pkn("batch_get_conversation_participants_readindex")
    public final BatchGetConversationParticipantsReadIndexRequestBody batch_get_conversation_participants_readindex;

    @InterfaceC65349Pkn("batch_get_messages_body")
    public final BatchGetMessagesRequestBody batch_get_messages_body;

    @InterfaceC65349Pkn("batch_mark_read_body")
    public final BatchMarkConversationReadRequestBody batch_mark_read_body;

    @InterfaceC65349Pkn("batch_unmark_message")
    public final BatchUnmarkMessageRequestBody batch_unmark_message;

    @InterfaceC65349Pkn("batch_update_conversation_participant_body")
    public final BatchUpdateConversationParticipantRequestBody batch_update_conversation_participant_body;

    @InterfaceC65349Pkn("block_conversation_body")
    public final BlockConversationRequestBody block_conversation_body;

    @InterfaceC65349Pkn("block_members_body")
    public final BlockMembersRequestBody block_members_body;

    @InterfaceC65349Pkn("broadcast_user_counter_body")
    public final BroadcastUserCounterRequestBody broadcast_user_counter_body;

    @InterfaceC65349Pkn("check_messages_per_user_body")
    public final CheckMessagePerUserRequestBody check_messages_per_user_body;

    @InterfaceC65349Pkn("client_ack_body")
    public final ClientACKRequestBody client_ack_body;

    @InterfaceC65349Pkn("client_batch_ack_body")
    public final ClientBatchACKRequestBody client_batch_ack_body;

    @InterfaceC65349Pkn("conversation_add_participants_body")
    public final ConversationAddParticipantsRequestBody conversation_add_participants_body;

    @InterfaceC65349Pkn("conversation_message_pre_view_body")
    public final ConversationMessagePreViewRequestBody conversation_message_pre_view_body;

    @InterfaceC65349Pkn("conversation_message_search_body")
    public final ConversationMessageSearchRequestBody conversation_message_search_body;

    @InterfaceC65349Pkn("conversation_participants_body")
    public final ConversationParticipantsListRequestBody conversation_participants_body;

    @InterfaceC65349Pkn("conversation_remove_participants_body")
    public final ConversationRemoveParticipantsRequestBody conversation_remove_participants_body;

    @InterfaceC65349Pkn("create_conversation_v2_body")
    public final CreateConversationV2RequestBody create_conversation_v2_body;

    @InterfaceC65349Pkn("delete_conversation_body")
    public final DeleteConversationRequestBody delete_conversation_body;

    @InterfaceC65349Pkn("delete_message_body")
    public final DeleteMessageRequestBody delete_message_body;

    @InterfaceC65349Pkn("delete_multi_stranger_conversation_body")
    public final DeleteMultiStrangerConversationRequestBody delete_multi_stranger_conversation_body;

    @InterfaceC65349Pkn("delete_stranger_all_conversation_body")
    public final RQI delete_stranger_all_conversation_body;

    @InterfaceC65349Pkn("delete_stranger_conversation_body")
    public final DeleteStrangerConversationRequestBody delete_stranger_conversation_body;

    @InterfaceC65349Pkn("delete_stranger_message_body")
    public final DeleteStrangerMessageRequestBody delete_stranger_message_body;

    @InterfaceC65349Pkn("dissolve_conversation_body")
    public final DissolveConversationRequestBody dissolve_conversation_body;
    public transient HashMap<Integer, Pair<ProtoAdapter, Message>> extensions;

    @InterfaceC65349Pkn("get_cmd_message_body")
    public final GetCmdMessageReqBody get_cmd_message_body;

    @InterfaceC65349Pkn("get_configs_body")
    public final C63499Ow3 get_configs_body;

    @InterfaceC65349Pkn("get_conversation_check_info_v2_body")
    public final GetConversationsCheckInfoV2RequestBody get_conversation_check_info_v2_body;

    @InterfaceC65349Pkn("get_conversation_info_list_by_favorite_v2_body")
    public final ConversationsPerUserByFavoriteV2RequestBody get_conversation_info_list_by_favorite_v2_body;

    @InterfaceC65349Pkn("get_conversation_info_list_by_top_v2_body")
    public final ConversationsPerUserByTopV2RequestBody get_conversation_info_list_by_top_v2_body;

    @InterfaceC65349Pkn("get_conversation_info_list_v2_body")
    public final GetConversationInfoListV2RequestBody get_conversation_info_list_v2_body;

    @InterfaceC65349Pkn("get_conversation_info_v2_body")
    public final GetConversationInfoV2RequestBody get_conversation_info_v2_body;

    @InterfaceC65349Pkn("get_conversation_list_body")
    public final GetUserConversationListRequestBody get_conversation_list_body;

    @InterfaceC65349Pkn("get_conversations_checkinfo_body")
    public final C63502Ow6 get_conversations_checkinfo_body;

    @InterfaceC65349Pkn("get_message_by_id_body")
    public final GetMessageByIdRequestBody get_message_by_id_body;

    @InterfaceC65349Pkn("get_message_info_by_index_v2_body")
    public final GetMessageInfoByIndexV2RequestBody get_message_info_by_index_v2_body;

    @InterfaceC65349Pkn("get_message_info_by_index_v2_range_body")
    public final GetMessageInfoByIndexV2RangeRequestBody get_message_info_by_index_v2_range_body;

    @InterfaceC65349Pkn("get_messages_body")
    public final GetMessagesRequestBody get_messages_body;

    @InterfaceC65349Pkn("get_messages_check_info_v2_body")
    public final GetMessagesCheckInfoV2RequestBody get_messages_check_info_v2_body;

    @InterfaceC65349Pkn("get_messages_checkinfo_in_conversation_body")
    public final GetMessagesCheckInfoInConversationRequestBody get_messages_checkinfo_in_conversation_body;

    @InterfaceC65349Pkn("get_recent_message_body")
    public final GetRecentMessageReqBody get_recent_message_body;

    @InterfaceC65349Pkn("get_stranger_conversation_body")
    public final GetStrangerConversationListRequestBody get_stranger_conversation_body;

    @InterfaceC65349Pkn("get_stranger_messages_body")
    public final GetStrangerMessagesRequestBody get_stranger_messages_body;

    @InterfaceC65349Pkn("get_ticket_body")
    public final GetTicketRequestBody get_ticket_body;

    @InterfaceC65349Pkn("leave_conversation_body")
    public final ConversationLeaveRequestBody leave_conversation_body;

    @InterfaceC65349Pkn("mark_conversation_read_body")
    public final MarkConversationReadRequestBody mark_conversation_read_body;

    @InterfaceC65349Pkn("mark_message_body")
    public final MarkMessageRequestBody mark_message_body;

    @InterfaceC65349Pkn("mark_msg_get_unread_count")
    public final MarkMsgGetUnreadCountRequestBody mark_msg_get_unread_count;

    @InterfaceC65349Pkn("mark_msg_unread_count_report")
    public final MarkMsgUnreadCountReportRequestBody mark_msg_unread_count_report;

    @InterfaceC65349Pkn("mark_multi_stranger_conversation_read_body")
    public final MarkMultiStrangerConversationReadRequestBody mark_multi_stranger_conversation_read_body;

    @InterfaceC65349Pkn("mark_stranger_all_conversation_read_body")
    public final RQN mark_stranger_all_conversation_read_body;

    @InterfaceC65349Pkn("mark_stranger_conversation_read_body")
    public final MarkStrangerConversationReadRequestBody mark_stranger_conversation_read_body;

    @InterfaceC65349Pkn("message_by_init")
    public final MessageByInitRequestBody message_by_init;

    @InterfaceC65349Pkn("messages_in_conversation_body")
    public final MessagesInConversationRequestBody messages_in_conversation_body;

    @InterfaceC65349Pkn("messages_per_user_body")
    public final MessagesPerUserRequestBody messages_per_user_body;

    @InterfaceC65349Pkn("messages_per_user_combo_inbox_type_body")
    public final MessagesPerUserComboInboxTypeRequestBody messages_per_user_combo_inbox_type_body;

    @InterfaceC65349Pkn("messages_per_user_init_combo_inbox_type_body")
    public final MessagesPerUserInitComboInboxTypeRequestBody messages_per_user_init_combo_inbox_type_body;

    @InterfaceC65349Pkn("messages_per_user_init_v2_body")
    public final MessagesPerUserInitV2RequestBody messages_per_user_init_v2_body;

    @InterfaceC65349Pkn("modify_message_property_body")
    public final ModifyMessagePropertyRequestBody modify_message_property_body;

    @InterfaceC65349Pkn("participants_min_index_body")
    public final GetConversationParticipantsMinIndexV3RequestBody participants_min_index_body;

    @InterfaceC65349Pkn("participants_read_index_body")
    public final GetConversationParticipantsReadIndexV3RequestBody participants_read_index_body;

    @InterfaceC65349Pkn("previewer_get_conversation_info_list_body")
    public final PreviewerGetConversationInfoListRequestBody previewer_get_conversation_info_list_body;

    @InterfaceC65349Pkn("previewer_messages_in_conversation_body")
    public final PreviewerMessagesInConversationRequestBody previewer_messages_in_conversation_body;

    @InterfaceC65349Pkn("pull_mark_message_body")
    public final PullMarkMessageRequestBody pull_mark_message_body;

    @InterfaceC65349Pkn("recall_message_body")
    public final RecallMessageRequestBody recall_message_body;

    @InterfaceC65349Pkn("report_client_metrics_body")
    public final ReportClientMetricsRequestBody report_client_metrics_body;

    @InterfaceC65349Pkn("send_input_status_body")
    public final SendInputStatusRequestBody send_input_status_body;

    @InterfaceC65349Pkn("send_message_body")
    public final SendMessageRequestBody send_message_body;

    @InterfaceC65349Pkn("send_message_p2p_body")
    public final SendMessageP2PRequestBody send_message_p2p_body;

    @InterfaceC65349Pkn("send_user_action_body")
    public final SendUserActionRequestBody send_user_action_body;

    @InterfaceC65349Pkn("set_conversation_core_info_body")
    public final SetConversationCoreInfoRequestBody set_conversation_core_info_body;

    @InterfaceC65349Pkn("set_conversation_setting_info_body")
    public final SetConversationSettingInfoRequestBody set_conversation_setting_info_body;

    @InterfaceC65349Pkn("unread_count_report_body")
    public final UnReadCountReportRequestBody unread_count_report_body;

    @InterfaceC65349Pkn("update_conversation_participant_body")
    public final UpdateConversationParticipantRequestBody update_conversation_participant_body;

    @InterfaceC65349Pkn("upsert_conversation_core_ext_info_body")
    public final UpsertConversationCoreExtInfoRequestBody upsert_conversation_core_ext_info_body;

    @InterfaceC65349Pkn("upsert_conversation_setting_ext_info_body")
    public final UpsertConversationSettingExtInfoRequestBody upsert_conversation_setting_ext_info_body;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RequestBody, C89453Z8v> newBuilder2() {
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LIZLLL = this.send_message_body;
        c89453Z8v.LJ = this.messages_per_user_body;
        c89453Z8v.LJFF = this.messages_per_user_init_v2_body;
        c89453Z8v.LJI = this.messages_per_user_combo_inbox_type_body;
        c89453Z8v.LJII = this.messages_per_user_init_combo_inbox_type_body;
        c89453Z8v.LJIIIIZZ = this.check_messages_per_user_body;
        c89453Z8v.LJIIIZ = this.get_message_by_id_body;
        c89453Z8v.LJIIJ = this.messages_in_conversation_body;
        c89453Z8v.LJIIJJI = this.get_messages_checkinfo_in_conversation_body;
        c89453Z8v.LJIIL = this.get_messages_check_info_v2_body;
        c89453Z8v.LJIILIIL = this.send_user_action_body;
        c89453Z8v.LJIILJJIL = this.send_input_status_body;
        c89453Z8v.LJIILL = this.delete_conversation_body;
        c89453Z8v.LJIILLIIL = this.mark_conversation_read_body;
        c89453Z8v.LJIIZILJ = this.conversation_participants_body;
        c89453Z8v.LJIJ = this.get_conversation_info_v2_body;
        c89453Z8v.LJIJI = this.create_conversation_v2_body;
        c89453Z8v.LJIJJ = this.get_conversation_info_list_v2_body;
        c89453Z8v.LJIJJLI = this.get_conversation_info_list_by_favorite_v2_body;
        c89453Z8v.LJIL = this.get_conversation_info_list_by_top_v2_body;
        c89453Z8v.LJJ = this.batch_mark_read_body;
        c89453Z8v.LJJI = this.dissolve_conversation_body;
        c89453Z8v.LJJIFFI = this.get_conversations_checkinfo_body;
        c89453Z8v.LJJII = this.get_conversation_check_info_v2_body;
        c89453Z8v.LJJIII = this.batch_delete_conversation_body;
        c89453Z8v.LJJIIJ = this.conversation_add_participants_body;
        c89453Z8v.LJJIIJZLJL = this.conversation_remove_participants_body;
        c89453Z8v.LJJIIZ = this.leave_conversation_body;
        c89453Z8v.LJJIIZI = this.update_conversation_participant_body;
        c89453Z8v.LJJIJ = this.batch_update_conversation_participant_body;
        c89453Z8v.LJJIJIIJI = this.delete_message_body;
        c89453Z8v.LJJIJIIJIL = this.recall_message_body;
        c89453Z8v.LJJIJIL = this.modify_message_property_body;
        c89453Z8v.LJJIJL = this.ack_message_body;
        c89453Z8v.LJJIJLIJ = this.batch_ack_message_body;
        c89453Z8v.LJJIL = this.set_conversation_core_info_body;
        c89453Z8v.LJJIZ = this.upsert_conversation_core_ext_info_body;
        c89453Z8v.LJJJ = this.set_conversation_setting_info_body;
        c89453Z8v.LJJJI = this.upsert_conversation_setting_ext_info_body;
        c89453Z8v.LJJJIL = this.get_stranger_conversation_body;
        c89453Z8v.LJJJJ = this.get_stranger_messages_body;
        c89453Z8v.LJJJJI = this.delete_stranger_message_body;
        c89453Z8v.LJJJJIZL = this.delete_stranger_conversation_body;
        c89453Z8v.LJJJJJ = this.delete_stranger_all_conversation_body;
        c89453Z8v.LJJJJJL = this.mark_stranger_conversation_read_body;
        c89453Z8v.LJJJJL = this.mark_stranger_all_conversation_read_body;
        c89453Z8v.LJJJJLI = this.delete_multi_stranger_conversation_body;
        c89453Z8v.LJJJJLL = this.mark_multi_stranger_conversation_read_body;
        c89453Z8v.LJJJJZ = this.participants_read_index_body;
        c89453Z8v.LJJJJZI = this.participants_min_index_body;
        c89453Z8v.LJJJLIIL = this.get_ticket_body;
        c89453Z8v.LJJJLL = this.get_conversation_list_body;
        c89453Z8v.LJJJLZIJ = this.broadcast_user_counter_body;
        c89453Z8v.LJJJZ = this.client_ack_body;
        c89453Z8v.LJJL = this.report_client_metrics_body;
        c89453Z8v.LJJLI = this.get_configs_body;
        c89453Z8v.LJJLIIIIJ = this.unread_count_report_body;
        c89453Z8v.LJJLIIIJ = this.block_members_body;
        c89453Z8v.LJJLIIIJILLIZJL = this.block_conversation_body;
        c89453Z8v.LJJLIIIJJI = this.send_message_p2p_body;
        c89453Z8v.LJJLIIIJJIZ = this.get_message_info_by_index_v2_body;
        c89453Z8v.LJJLIIIJL = this.mark_message_body;
        c89453Z8v.LJJLIIIJLJLI = this.pull_mark_message_body;
        c89453Z8v.LJJLIIIJLLLLLLLZ = this.batch_get_conversation_participants_readindex;
        c89453Z8v.LJJLIIJ = this.get_recent_message_body;
        c89453Z8v.LJJLIL = this.get_cmd_message_body;
        c89453Z8v.LJJLJ = this.get_message_info_by_index_v2_range_body;
        c89453Z8v.LJJLJLI = this.message_by_init;
        c89453Z8v.LJJLL = this.previewer_messages_in_conversation_body;
        c89453Z8v.LJJZ = this.previewer_get_conversation_info_list_body;
        c89453Z8v.LJJZZI = this.mark_msg_unread_count_report;
        c89453Z8v.LJJZZIII = this.mark_msg_get_unread_count;
        c89453Z8v.LJL = this.batch_unmark_message;
        c89453Z8v.LJLI = this.client_batch_ack_body;
        c89453Z8v.LJLIIIL = this.conversation_message_search_body;
        c89453Z8v.LJLIIL = this.conversation_message_pre_view_body;
        c89453Z8v.LJLIL = this.get_messages_body;
        c89453Z8v.LJLILLLLZI = this.batch_get_messages_body;
        c89453Z8v.LJLJI = this.extensions;
        c89453Z8v.LJLJJI = this.LJLIL;
        c89453Z8v.addUnknownFields(unknownFields());
        return c89453Z8v;
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
        if (this.get_messages_check_info_v2_body != null) {
            sb.append(", get_messages_check_info_v2_body=");
            sb.append(this.get_messages_check_info_v2_body);
        }
        if (this.send_user_action_body != null) {
            sb.append(", send_user_action_body=");
            sb.append(this.send_user_action_body);
        }
        if (this.send_input_status_body != null) {
            sb.append(", send_input_status_body=");
            sb.append(this.send_input_status_body);
        }
        if (this.delete_conversation_body != null) {
            sb.append(", delete_conversation_body=");
            sb.append(this.delete_conversation_body);
        }
        if (this.mark_conversation_read_body != null) {
            sb.append(", mark_conversation_read_body=");
            sb.append(this.mark_conversation_read_body);
        }
        if (this.conversation_participants_body != null) {
            sb.append(", conversation_participants_body=");
            sb.append(this.conversation_participants_body);
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
        if (this.batch_mark_read_body != null) {
            sb.append(", batch_mark_read_body=");
            sb.append(this.batch_mark_read_body);
        }
        if (this.dissolve_conversation_body != null) {
            sb.append(", dissolve_conversation_body=");
            sb.append(this.dissolve_conversation_body);
        }
        if (this.get_conversations_checkinfo_body != null) {
            sb.append(", get_conversations_checkinfo_body=");
            sb.append(this.get_conversations_checkinfo_body);
        }
        if (this.get_conversation_check_info_v2_body != null) {
            sb.append(", get_conversation_check_info_v2_body=");
            sb.append(this.get_conversation_check_info_v2_body);
        }
        if (this.batch_delete_conversation_body != null) {
            sb.append(", batch_delete_conversation_body=");
            sb.append(this.batch_delete_conversation_body);
        }
        if (this.conversation_add_participants_body != null) {
            sb.append(", conversation_add_participants_body=");
            sb.append(this.conversation_add_participants_body);
        }
        if (this.conversation_remove_participants_body != null) {
            sb.append(", conversation_remove_participants_body=");
            sb.append(this.conversation_remove_participants_body);
        }
        if (this.leave_conversation_body != null) {
            sb.append(", leave_conversation_body=");
            sb.append(this.leave_conversation_body);
        }
        if (this.update_conversation_participant_body != null) {
            sb.append(", update_conversation_participant_body=");
            sb.append(this.update_conversation_participant_body);
        }
        if (this.batch_update_conversation_participant_body != null) {
            sb.append(", batch_update_conversation_participant_body=");
            sb.append(this.batch_update_conversation_participant_body);
        }
        if (this.delete_message_body != null) {
            sb.append(", delete_message_body=");
            sb.append(this.delete_message_body);
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
        if (this.client_ack_body != null) {
            sb.append(", client_ack_body=");
            sb.append(this.client_ack_body);
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
        if (this.send_message_p2p_body != null) {
            sb.append(", send_message_p2p_body=");
            sb.append(this.send_message_p2p_body);
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
        if (this.conversation_message_search_body != null) {
            sb.append(", conversation_message_search_body=");
            sb.append(this.conversation_message_search_body);
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
        return DIX.LIZLLL(sb, 0, 2, "RequestBody{", '}');
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

    public RequestBody(SendMessageRequestBody sendMessageRequestBody, MessagesPerUserRequestBody messagesPerUserRequestBody, MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody, MessagesPerUserComboInboxTypeRequestBody messagesPerUserComboInboxTypeRequestBody, MessagesPerUserInitComboInboxTypeRequestBody messagesPerUserInitComboInboxTypeRequestBody, CheckMessagePerUserRequestBody checkMessagePerUserRequestBody, GetMessageByIdRequestBody getMessageByIdRequestBody, MessagesInConversationRequestBody messagesInConversationRequestBody, GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody, GetMessagesCheckInfoV2RequestBody getMessagesCheckInfoV2RequestBody, SendUserActionRequestBody sendUserActionRequestBody, SendInputStatusRequestBody sendInputStatusRequestBody, DeleteConversationRequestBody deleteConversationRequestBody, MarkConversationReadRequestBody markConversationReadRequestBody, ConversationParticipantsListRequestBody conversationParticipantsListRequestBody, GetConversationInfoV2RequestBody getConversationInfoV2RequestBody, CreateConversationV2RequestBody createConversationV2RequestBody, GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody, ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody, ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody, BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody, DissolveConversationRequestBody dissolveConversationRequestBody, C63502Ow6 c63502Ow6, GetConversationsCheckInfoV2RequestBody getConversationsCheckInfoV2RequestBody, BatchDeleteConversationRequestBody batchDeleteConversationRequestBody, ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody, ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody, ConversationLeaveRequestBody conversationLeaveRequestBody, UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody, BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody, DeleteMessageRequestBody deleteMessageRequestBody, RecallMessageRequestBody recallMessageRequestBody, ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody, AckMessageRequestBody ackMessageRequestBody, BatchAckMessageRequestBody batchAckMessageRequestBody, SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody, UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody, SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody, UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody, GetStrangerConversationListRequestBody getStrangerConversationListRequestBody, GetStrangerMessagesRequestBody getStrangerMessagesRequestBody, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody, DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody, RQI rqi, MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody, RQN rqn, DeleteMultiStrangerConversationRequestBody deleteMultiStrangerConversationRequestBody, MarkMultiStrangerConversationReadRequestBody markMultiStrangerConversationReadRequestBody, GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody, GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody, GetTicketRequestBody getTicketRequestBody, GetUserConversationListRequestBody getUserConversationListRequestBody, BroadcastUserCounterRequestBody broadcastUserCounterRequestBody, ClientACKRequestBody clientACKRequestBody, ReportClientMetricsRequestBody reportClientMetricsRequestBody, C63499Ow3 c63499Ow3, UnReadCountReportRequestBody unReadCountReportRequestBody, BlockMembersRequestBody blockMembersRequestBody, BlockConversationRequestBody blockConversationRequestBody, SendMessageP2PRequestBody sendMessageP2PRequestBody, GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody, MarkMessageRequestBody markMessageRequestBody, PullMarkMessageRequestBody pullMarkMessageRequestBody, BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody, GetRecentMessageReqBody getRecentMessageReqBody, GetCmdMessageReqBody getCmdMessageReqBody, GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody, MessageByInitRequestBody messageByInitRequestBody, PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody, PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody, MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody, MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody, BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody, ClientBatchACKRequestBody clientBatchACKRequestBody, ConversationMessageSearchRequestBody conversationMessageSearchRequestBody, ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody, GetMessagesRequestBody getMessagesRequestBody, BatchGetMessagesRequestBody batchGetMessagesRequestBody, HashMap<Integer, Pair<ProtoAdapter, Message>> hashMap, HashMap<String, Object> hashMap2) {
        this(sendMessageRequestBody, messagesPerUserRequestBody, messagesPerUserInitV2RequestBody, messagesPerUserComboInboxTypeRequestBody, messagesPerUserInitComboInboxTypeRequestBody, checkMessagePerUserRequestBody, getMessageByIdRequestBody, messagesInConversationRequestBody, getMessagesCheckInfoInConversationRequestBody, getMessagesCheckInfoV2RequestBody, sendUserActionRequestBody, sendInputStatusRequestBody, deleteConversationRequestBody, markConversationReadRequestBody, conversationParticipantsListRequestBody, getConversationInfoV2RequestBody, createConversationV2RequestBody, getConversationInfoListV2RequestBody, conversationsPerUserByFavoriteV2RequestBody, conversationsPerUserByTopV2RequestBody, batchMarkConversationReadRequestBody, dissolveConversationRequestBody, c63502Ow6, getConversationsCheckInfoV2RequestBody, batchDeleteConversationRequestBody, conversationAddParticipantsRequestBody, conversationRemoveParticipantsRequestBody, conversationLeaveRequestBody, updateConversationParticipantRequestBody, batchUpdateConversationParticipantRequestBody, deleteMessageRequestBody, recallMessageRequestBody, modifyMessagePropertyRequestBody, ackMessageRequestBody, batchAckMessageRequestBody, setConversationCoreInfoRequestBody, upsertConversationCoreExtInfoRequestBody, setConversationSettingInfoRequestBody, upsertConversationSettingExtInfoRequestBody, getStrangerConversationListRequestBody, getStrangerMessagesRequestBody, deleteStrangerMessageRequestBody, deleteStrangerConversationRequestBody, rqi, markStrangerConversationReadRequestBody, rqn, deleteMultiStrangerConversationRequestBody, markMultiStrangerConversationReadRequestBody, getConversationParticipantsReadIndexV3RequestBody, getConversationParticipantsMinIndexV3RequestBody, getTicketRequestBody, getUserConversationListRequestBody, broadcastUserCounterRequestBody, clientACKRequestBody, reportClientMetricsRequestBody, c63499Ow3, unReadCountReportRequestBody, blockMembersRequestBody, blockConversationRequestBody, sendMessageP2PRequestBody, getMessageInfoByIndexV2RequestBody, markMessageRequestBody, pullMarkMessageRequestBody, batchGetConversationParticipantsReadIndexRequestBody, getRecentMessageReqBody, getCmdMessageReqBody, getMessageInfoByIndexV2RangeRequestBody, messageByInitRequestBody, previewerMessagesInConversationRequestBody, previewerGetConversationInfoListRequestBody, markMsgUnreadCountReportRequestBody, markMsgGetUnreadCountRequestBody, batchUnmarkMessageRequestBody, clientBatchACKRequestBody, conversationMessageSearchRequestBody, conversationMessagePreViewRequestBody, getMessagesRequestBody, batchGetMessagesRequestBody, hashMap, hashMap2, C64537PUn.EMPTY);
    }

    public RequestBody(SendMessageRequestBody sendMessageRequestBody, MessagesPerUserRequestBody messagesPerUserRequestBody, MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody, MessagesPerUserComboInboxTypeRequestBody messagesPerUserComboInboxTypeRequestBody, MessagesPerUserInitComboInboxTypeRequestBody messagesPerUserInitComboInboxTypeRequestBody, CheckMessagePerUserRequestBody checkMessagePerUserRequestBody, GetMessageByIdRequestBody getMessageByIdRequestBody, MessagesInConversationRequestBody messagesInConversationRequestBody, GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody, GetMessagesCheckInfoV2RequestBody getMessagesCheckInfoV2RequestBody, SendUserActionRequestBody sendUserActionRequestBody, SendInputStatusRequestBody sendInputStatusRequestBody, DeleteConversationRequestBody deleteConversationRequestBody, MarkConversationReadRequestBody markConversationReadRequestBody, ConversationParticipantsListRequestBody conversationParticipantsListRequestBody, GetConversationInfoV2RequestBody getConversationInfoV2RequestBody, CreateConversationV2RequestBody createConversationV2RequestBody, GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody, ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody, ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody, BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody, DissolveConversationRequestBody dissolveConversationRequestBody, C63502Ow6 c63502Ow6, GetConversationsCheckInfoV2RequestBody getConversationsCheckInfoV2RequestBody, BatchDeleteConversationRequestBody batchDeleteConversationRequestBody, ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody, ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody, ConversationLeaveRequestBody conversationLeaveRequestBody, UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody, BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody, DeleteMessageRequestBody deleteMessageRequestBody, RecallMessageRequestBody recallMessageRequestBody, ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody, AckMessageRequestBody ackMessageRequestBody, BatchAckMessageRequestBody batchAckMessageRequestBody, SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody, UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody, SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody, UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody, GetStrangerConversationListRequestBody getStrangerConversationListRequestBody, GetStrangerMessagesRequestBody getStrangerMessagesRequestBody, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody, DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody, RQI rqi, MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody, RQN rqn, DeleteMultiStrangerConversationRequestBody deleteMultiStrangerConversationRequestBody, MarkMultiStrangerConversationReadRequestBody markMultiStrangerConversationReadRequestBody, GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody, GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody, GetTicketRequestBody getTicketRequestBody, GetUserConversationListRequestBody getUserConversationListRequestBody, BroadcastUserCounterRequestBody broadcastUserCounterRequestBody, ClientACKRequestBody clientACKRequestBody, ReportClientMetricsRequestBody reportClientMetricsRequestBody, C63499Ow3 c63499Ow3, UnReadCountReportRequestBody unReadCountReportRequestBody, BlockMembersRequestBody blockMembersRequestBody, BlockConversationRequestBody blockConversationRequestBody, SendMessageP2PRequestBody sendMessageP2PRequestBody, GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody, MarkMessageRequestBody markMessageRequestBody, PullMarkMessageRequestBody pullMarkMessageRequestBody, BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody, GetRecentMessageReqBody getRecentMessageReqBody, GetCmdMessageReqBody getCmdMessageReqBody, GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody, MessageByInitRequestBody messageByInitRequestBody, PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody, PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody, MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody, MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody, BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody, ClientBatchACKRequestBody clientBatchACKRequestBody, ConversationMessageSearchRequestBody conversationMessageSearchRequestBody, ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody, GetMessagesRequestBody getMessagesRequestBody, BatchGetMessagesRequestBody batchGetMessagesRequestBody, HashMap<Integer, Pair<ProtoAdapter, Message>> hashMap, HashMap<String, Object> hashMap2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.extensions = new HashMap<>();
        this.LJLIL = new HashMap<>();
        this.send_message_body = sendMessageRequestBody;
        this.messages_per_user_body = messagesPerUserRequestBody;
        this.messages_per_user_init_v2_body = messagesPerUserInitV2RequestBody;
        this.messages_per_user_combo_inbox_type_body = messagesPerUserComboInboxTypeRequestBody;
        this.messages_per_user_init_combo_inbox_type_body = messagesPerUserInitComboInboxTypeRequestBody;
        this.check_messages_per_user_body = checkMessagePerUserRequestBody;
        this.get_message_by_id_body = getMessageByIdRequestBody;
        this.messages_in_conversation_body = messagesInConversationRequestBody;
        this.get_messages_checkinfo_in_conversation_body = getMessagesCheckInfoInConversationRequestBody;
        this.get_messages_check_info_v2_body = getMessagesCheckInfoV2RequestBody;
        this.send_user_action_body = sendUserActionRequestBody;
        this.send_input_status_body = sendInputStatusRequestBody;
        this.delete_conversation_body = deleteConversationRequestBody;
        this.mark_conversation_read_body = markConversationReadRequestBody;
        this.conversation_participants_body = conversationParticipantsListRequestBody;
        this.get_conversation_info_v2_body = getConversationInfoV2RequestBody;
        this.create_conversation_v2_body = createConversationV2RequestBody;
        this.get_conversation_info_list_v2_body = getConversationInfoListV2RequestBody;
        this.get_conversation_info_list_by_favorite_v2_body = conversationsPerUserByFavoriteV2RequestBody;
        this.get_conversation_info_list_by_top_v2_body = conversationsPerUserByTopV2RequestBody;
        this.batch_mark_read_body = batchMarkConversationReadRequestBody;
        this.dissolve_conversation_body = dissolveConversationRequestBody;
        this.get_conversations_checkinfo_body = c63502Ow6;
        this.get_conversation_check_info_v2_body = getConversationsCheckInfoV2RequestBody;
        this.batch_delete_conversation_body = batchDeleteConversationRequestBody;
        this.conversation_add_participants_body = conversationAddParticipantsRequestBody;
        this.conversation_remove_participants_body = conversationRemoveParticipantsRequestBody;
        this.leave_conversation_body = conversationLeaveRequestBody;
        this.update_conversation_participant_body = updateConversationParticipantRequestBody;
        this.batch_update_conversation_participant_body = batchUpdateConversationParticipantRequestBody;
        this.delete_message_body = deleteMessageRequestBody;
        this.recall_message_body = recallMessageRequestBody;
        this.modify_message_property_body = modifyMessagePropertyRequestBody;
        this.ack_message_body = ackMessageRequestBody;
        this.batch_ack_message_body = batchAckMessageRequestBody;
        this.set_conversation_core_info_body = setConversationCoreInfoRequestBody;
        this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoRequestBody;
        this.set_conversation_setting_info_body = setConversationSettingInfoRequestBody;
        this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoRequestBody;
        this.get_stranger_conversation_body = getStrangerConversationListRequestBody;
        this.get_stranger_messages_body = getStrangerMessagesRequestBody;
        this.delete_stranger_message_body = deleteStrangerMessageRequestBody;
        this.delete_stranger_conversation_body = deleteStrangerConversationRequestBody;
        this.delete_stranger_all_conversation_body = rqi;
        this.mark_stranger_conversation_read_body = markStrangerConversationReadRequestBody;
        this.mark_stranger_all_conversation_read_body = rqn;
        this.delete_multi_stranger_conversation_body = deleteMultiStrangerConversationRequestBody;
        this.mark_multi_stranger_conversation_read_body = markMultiStrangerConversationReadRequestBody;
        this.participants_read_index_body = getConversationParticipantsReadIndexV3RequestBody;
        this.participants_min_index_body = getConversationParticipantsMinIndexV3RequestBody;
        this.get_ticket_body = getTicketRequestBody;
        this.get_conversation_list_body = getUserConversationListRequestBody;
        this.broadcast_user_counter_body = broadcastUserCounterRequestBody;
        this.client_ack_body = clientACKRequestBody;
        this.report_client_metrics_body = reportClientMetricsRequestBody;
        this.get_configs_body = c63499Ow3;
        this.unread_count_report_body = unReadCountReportRequestBody;
        this.block_members_body = blockMembersRequestBody;
        this.block_conversation_body = blockConversationRequestBody;
        this.send_message_p2p_body = sendMessageP2PRequestBody;
        this.get_message_info_by_index_v2_body = getMessageInfoByIndexV2RequestBody;
        this.mark_message_body = markMessageRequestBody;
        this.pull_mark_message_body = pullMarkMessageRequestBody;
        this.batch_get_conversation_participants_readindex = batchGetConversationParticipantsReadIndexRequestBody;
        this.get_recent_message_body = getRecentMessageReqBody;
        this.get_cmd_message_body = getCmdMessageReqBody;
        this.get_message_info_by_index_v2_range_body = getMessageInfoByIndexV2RangeRequestBody;
        this.message_by_init = messageByInitRequestBody;
        this.previewer_messages_in_conversation_body = previewerMessagesInConversationRequestBody;
        this.previewer_get_conversation_info_list_body = previewerGetConversationInfoListRequestBody;
        this.mark_msg_unread_count_report = markMsgUnreadCountReportRequestBody;
        this.mark_msg_get_unread_count = markMsgGetUnreadCountRequestBody;
        this.batch_unmark_message = batchUnmarkMessageRequestBody;
        this.client_batch_ack_body = clientBatchACKRequestBody;
        this.conversation_message_search_body = conversationMessageSearchRequestBody;
        this.conversation_message_pre_view_body = conversationMessagePreViewRequestBody;
        this.get_messages_body = getMessagesRequestBody;
        this.batch_get_messages_body = batchGetMessagesRequestBody;
        this.extensions = hashMap;
        this.LJLIL = hashMap2;
    }
}
